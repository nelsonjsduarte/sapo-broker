from Base import Transport as BaseTransport, Message
import socket
import logging
LOG = logging.getLogger('Broker.Transport.INET')

class DisconnectedError(EOFError):
    """
    Class to indicate that the Server disconnected while the client was waiting for a response.
    """

    def __init__(self, message):
        EOFError.__init__(self, message)

class Transport(BaseTransport):

    def __init__(self, host, port):
        BaseTransport.__init__(self)
        self.__host = host
        self.__port = port
        self.__socket = socket.socket( socket.AF_INET, self.socket_type)

        LOG.debug("Socket timeout  %s s", self.__socket.gettimeout())
        #connect to host:port
        self.__socket.connect((host, port))
        LOG.debug("Connected to %s:%d", self.__host, self.__port)

    def send(self, message):
        return self.__socket.sendall(message.__bytes__())

    def __read_len(self, length):
        """
        Reads length bytes from the server.
        Not EINTR safe (like all python IO?)
        """
        data = bytes('')
        while length:
            read = self.__socket.recv(length)
            if '' == read:
                raise DisconnectedError("""Broker server at %s is dead. Can't read message data.""" % self.endpoint())
            else:
                read_length = len(read)
                data = data + read
                length = length - read_length

        return data

    def receive(self):
        meta = Message.meta_from_header(self.__read_len(8))
        #TODO Maybe msg_length should be limited in order to prevent memory exhaustion
        payload = self.__read_len(meta['length'])
        return Message(payload=payload, encoding_type=meta['type'], encoding_version=meta['version'])

    def name(self):
        return 'net'

    def endpoint(self):
        return "%s://%s:%d" % (self.name(), self.__host, self.__port)
