//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.09.29 at 04:32:04 PM WEST 
//

package pt.com.gcs.conf.agent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="config-version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="net">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="setTcpNoDelay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="discovery_delay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="broker-port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="broker-legacy-port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="broker-http-port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="broker-udp-port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="persistency">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="directory" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="messaging">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dropbox">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="dir" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="check_interval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ssl" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="broker-ssl-port" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="keystore-location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="keystore-password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="key-password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "configVersion", "net", "persistency", "messaging", "ssl" })
@XmlRootElement(name = "agent-config")
public class AgentConfig
{

	@XmlElement(name = "config-version", required = true)
	protected String configVersion;
	@XmlElement(required = true)
	protected AgentConfig.Net net;
	@XmlElement(required = true)
	protected AgentConfig.Persistency persistency;
	@XmlElement(required = true)
	protected AgentConfig.Messaging messaging;
	protected AgentConfig.Ssl ssl;

	/**
	 * Gets the value of the configVersion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConfigVersion()
	{
		return configVersion;
	}

	/**
	 * Sets the value of the configVersion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConfigVersion(String value)
	{
		this.configVersion = value;
	}

	/**
	 * Gets the value of the net property.
	 * 
	 * @return possible object is {@link AgentConfig.Net }
	 * 
	 */
	public AgentConfig.Net getNet()
	{
		return net;
	}

	/**
	 * Sets the value of the net property.
	 * 
	 * @param value
	 *            allowed object is {@link AgentConfig.Net }
	 * 
	 */
	public void setNet(AgentConfig.Net value)
	{
		this.net = value;
	}

	/**
	 * Gets the value of the persistency property.
	 * 
	 * @return possible object is {@link AgentConfig.Persistency }
	 * 
	 */
	public AgentConfig.Persistency getPersistency()
	{
		return persistency;
	}

	/**
	 * Sets the value of the persistency property.
	 * 
	 * @param value
	 *            allowed object is {@link AgentConfig.Persistency }
	 * 
	 */
	public void setPersistency(AgentConfig.Persistency value)
	{
		this.persistency = value;
	}

	/**
	 * Gets the value of the messaging property.
	 * 
	 * @return possible object is {@link AgentConfig.Messaging }
	 * 
	 */
	public AgentConfig.Messaging getMessaging()
	{
		return messaging;
	}

	/**
	 * Sets the value of the messaging property.
	 * 
	 * @param value
	 *            allowed object is {@link AgentConfig.Messaging }
	 * 
	 */
	public void setMessaging(AgentConfig.Messaging value)
	{
		this.messaging = value;
	}

	/**
	 * Gets the value of the ssl property.
	 * 
	 * @return possible object is {@link AgentConfig.Ssl }
	 * 
	 */
	public AgentConfig.Ssl getSsl()
	{
		return ssl;
	}

	/**
	 * Sets the value of the ssl property.
	 * 
	 * @param value
	 *            allowed object is {@link AgentConfig.Ssl }
	 * 
	 */
	public void setSsl(AgentConfig.Ssl value)
	{
		this.ssl = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="dropbox">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *                   &lt;element name="dir" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="check_interval" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "dropbox" })
	public static class Messaging
	{

		@XmlElement(required = true)
		protected AgentConfig.Messaging.Dropbox dropbox;

		/**
		 * Gets the value of the dropbox property.
		 * 
		 * @return possible object is {@link AgentConfig.Messaging.Dropbox }
		 * 
		 */
		public AgentConfig.Messaging.Dropbox getDropbox()
		{
			return dropbox;
		}

		/**
		 * Sets the value of the dropbox property.
		 * 
		 * @param value
		 *            allowed object is {@link AgentConfig.Messaging.Dropbox }
		 * 
		 */
		public void setDropbox(AgentConfig.Messaging.Dropbox value)
		{
			this.dropbox = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
		 *         &lt;element name="dir" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="check_interval" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "enabled", "dir", "checkInterval" })
		public static class Dropbox
		{

			protected boolean enabled;
			@XmlElement(required = true)
			protected String dir;
			@XmlElement(name = "check_interval")
			protected int checkInterval;

			/**
			 * Gets the value of the enabled property.
			 * 
			 */
			public boolean isEnabled()
			{
				return enabled;
			}

			/**
			 * Sets the value of the enabled property.
			 * 
			 */
			public void setEnabled(boolean value)
			{
				this.enabled = value;
			}

			/**
			 * Gets the value of the dir property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getDir()
			{
				return dir;
			}

			/**
			 * Sets the value of the dir property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setDir(String value)
			{
				this.dir = value;
			}

			/**
			 * Gets the value of the checkInterval property.
			 * 
			 */
			public int getCheckInterval()
			{
				return checkInterval;
			}

			/**
			 * Sets the value of the checkInterval property.
			 * 
			 */
			public void setCheckInterval(int value)
			{
				this.checkInterval = value;
			}

		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="port" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="setTcpNoDelay" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
	 *         &lt;element name="discovery_delay" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="broker-port" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="broker-legacy-port" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="broker-http-port" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="broker-udp-port" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "ip", "port", "setTcpNoDelay", "discoveryDelay", "brokerPort", "brokerLegacyPort", "brokerHttpPort", "brokerUdpPort" })
	public static class Net
	{

		@XmlElement(required = true)
		protected String ip;
		protected int port;
		protected boolean setTcpNoDelay;
		@XmlElement(name = "discovery_delay")
		protected int discoveryDelay;
		@XmlElement(name = "broker-port")
		protected int brokerPort;
		@XmlElement(name = "broker-legacy-port")
		protected int brokerLegacyPort;
		@XmlElement(name = "broker-http-port")
		protected int brokerHttpPort;
		@XmlElement(name = "broker-udp-port")
		protected int brokerUdpPort;

		/**
		 * Gets the value of the ip property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getIp()
		{
			return ip;
		}

		/**
		 * Sets the value of the ip property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setIp(String value)
		{
			this.ip = value;
		}

		/**
		 * Gets the value of the port property.
		 * 
		 */
		public int getPort()
		{
			return port;
		}

		/**
		 * Sets the value of the port property.
		 * 
		 */
		public void setPort(int value)
		{
			this.port = value;
		}

		/**
		 * Gets the value of the setTcpNoDelay property.
		 * 
		 */
		public boolean isSetTcpNoDelay()
		{
			return setTcpNoDelay;
		}

		/**
		 * Sets the value of the setTcpNoDelay property.
		 * 
		 */
		public void setSetTcpNoDelay(boolean value)
		{
			this.setTcpNoDelay = value;
		}

		/**
		 * Gets the value of the discoveryDelay property.
		 * 
		 */
		public int getDiscoveryDelay()
		{
			return discoveryDelay;
		}

		/**
		 * Sets the value of the discoveryDelay property.
		 * 
		 */
		public void setDiscoveryDelay(int value)
		{
			this.discoveryDelay = value;
		}

		/**
		 * Gets the value of the brokerPort property.
		 * 
		 */
		public int getBrokerPort()
		{
			return brokerPort;
		}

		/**
		 * Sets the value of the brokerPort property.
		 * 
		 */
		public void setBrokerPort(int value)
		{
			this.brokerPort = value;
		}

		/**
		 * Gets the value of the brokerLegacyPort property.
		 * 
		 */
		public int getBrokerLegacyPort()
		{
			return brokerLegacyPort;
		}

		/**
		 * Sets the value of the brokerLegacyPort property.
		 * 
		 */
		public void setBrokerLegacyPort(int value)
		{
			this.brokerLegacyPort = value;
		}

		/**
		 * Gets the value of the brokerHttpPort property.
		 * 
		 */
		public int getBrokerHttpPort()
		{
			return brokerHttpPort;
		}

		/**
		 * Sets the value of the brokerHttpPort property.
		 * 
		 */
		public void setBrokerHttpPort(int value)
		{
			this.brokerHttpPort = value;
		}

		/**
		 * Gets the value of the brokerUdpPort property.
		 * 
		 */
		public int getBrokerUdpPort()
		{
			return brokerUdpPort;
		}

		/**
		 * Sets the value of the brokerUdpPort property.
		 * 
		 */
		public void setBrokerUdpPort(int value)
		{
			this.brokerUdpPort = value;
		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="directory" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "directory" })
	public static class Persistency
	{

		@XmlElement(required = true)
		protected String directory;

		/**
		 * Gets the value of the directory property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getDirectory()
		{
			return directory;
		}

		/**
		 * Sets the value of the directory property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setDirectory(String value)
		{
			this.directory = value;
		}

	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="broker-ssl-port" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *         &lt;element name="keystore-location" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="keystore-password" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *         &lt;element name="key-password" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *       &lt;/sequence>
	 *     &lt;/restriction>
	 *   &lt;/complexContent>
	 * &lt;/complexType>
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "brokerSslPort", "keystoreLocation", "keystorePassword", "keyPassword" })
	public static class Ssl
	{

		@XmlElement(name = "broker-ssl-port")
		protected int brokerSslPort;
		@XmlElement(name = "keystore-location", required = true)
		protected String keystoreLocation;
		@XmlElement(name = "keystore-password", required = true)
		protected String keystorePassword;
		@XmlElement(name = "key-password", required = true)
		protected String keyPassword;

		/**
		 * Gets the value of the brokerSslPort property.
		 * 
		 */
		public int getBrokerSslPort()
		{
			return brokerSslPort;
		}

		/**
		 * Sets the value of the brokerSslPort property.
		 * 
		 */
		public void setBrokerSslPort(int value)
		{
			this.brokerSslPort = value;
		}

		/**
		 * Gets the value of the keystoreLocation property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getKeystoreLocation()
		{
			return keystoreLocation;
		}

		/**
		 * Sets the value of the keystoreLocation property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setKeystoreLocation(String value)
		{
			this.keystoreLocation = value;
		}

		/**
		 * Gets the value of the keystorePassword property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getKeystorePassword()
		{
			return keystorePassword;
		}

		/**
		 * Sets the value of the keystorePassword property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setKeystorePassword(String value)
		{
			this.keystorePassword = value;
		}

		/**
		 * Gets the value of the keyPassword property.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getKeyPassword()
		{
			return keyPassword;
		}

		/**
		 * Sets the value of the keyPassword property.
		 * 
		 * @param value
		 *            allowed object is {@link String }
		 * 
		 */
		public void setKeyPassword(String value)
		{
			this.keyPassword = value;
		}

	}

}
