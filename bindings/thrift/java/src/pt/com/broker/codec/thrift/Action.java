/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package pt.com.broker.codec.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;

import org.apache.thrift.protocol.*;
import org.apache.thrift.transport.*;

public class Action implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Action");
  private static final TField PUBLISH_FIELD_DESC = new TField("publish", TType.STRUCT, (short)1);
  private static final TField POLL_FIELD_DESC = new TField("poll", TType.STRUCT, (short)2);
  private static final TField ACCEPTED_FIELD_DESC = new TField("accepted", TType.STRUCT, (short)3);
  private static final TField ACK_MESSAGE_FIELD_DESC = new TField("ack_message", TType.STRUCT, (short)4);
  private static final TField SUBSCRIBE_FIELD_DESC = new TField("subscribe", TType.STRUCT, (short)5);
  private static final TField UNSUBSCRIBE_FIELD_DESC = new TField("unsubscribe", TType.STRUCT, (short)6);
  private static final TField NOTIFICATION_FIELD_DESC = new TField("notification", TType.STRUCT, (short)7);
  private static final TField FAULT_FIELD_DESC = new TField("fault", TType.STRUCT, (short)8);
  private static final TField PING_FIELD_DESC = new TField("ping", TType.STRUCT, (short)9);
  private static final TField PONG_FIELD_DESC = new TField("pong", TType.STRUCT, (short)10);
  private static final TField AUTH_FIELD_DESC = new TField("auth", TType.STRUCT, (short)11);
  private static final TField ACTION_TYPE_FIELD_DESC = new TField("action_type", TType.I32, (short)12);

  public Publish publish;
  public static final int PUBLISH = 1;
  public Poll poll;
  public static final int POLL = 2;
  public Accepted accepted;
  public static final int ACCEPTED = 3;
  public AcknowledgeMessage ack_message;
  public static final int ACK_MESSAGE = 4;
  public Subscribe subscribe;
  public static final int SUBSCRIBE = 5;
  public Unsubscribe unsubscribe;
  public static final int UNSUBSCRIBE = 6;
  public Notification notification;
  public static final int NOTIFICATION = 7;
  public Fault fault;
  public static final int FAULT = 8;
  public Ping ping;
  public static final int PING = 9;
  public Pong pong;
  public static final int PONG = 10;
  public Authentication auth;
  public static final int AUTH = 11;
  public int action_type;
  public static final int ACTION_TYPE = 12;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
    public boolean action_type = false;
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(PUBLISH, new FieldMetaData("publish", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, Publish.class)));
    put(POLL, new FieldMetaData("poll", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, Poll.class)));
    put(ACCEPTED, new FieldMetaData("accepted", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, Accepted.class)));
    put(ACK_MESSAGE, new FieldMetaData("ack_message", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, AcknowledgeMessage.class)));
    put(SUBSCRIBE, new FieldMetaData("subscribe", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, Subscribe.class)));
    put(UNSUBSCRIBE, new FieldMetaData("unsubscribe", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, Unsubscribe.class)));
    put(NOTIFICATION, new FieldMetaData("notification", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, Notification.class)));
    put(FAULT, new FieldMetaData("fault", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, Fault.class)));
    put(PING, new FieldMetaData("ping", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, Ping.class)));
    put(PONG, new FieldMetaData("pong", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, Pong.class)));
    put(AUTH, new FieldMetaData("auth", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, Authentication.class)));
    put(ACTION_TYPE, new FieldMetaData("action_type", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(Action.class, metaDataMap);
  }

  public Action() {
  }

  public Action(
    Publish publish,
    Poll poll,
    Accepted accepted,
    AcknowledgeMessage ack_message,
    Subscribe subscribe,
    Unsubscribe unsubscribe,
    Notification notification,
    Fault fault,
    Ping ping,
    Pong pong,
    Authentication auth,
    int action_type)
  {
    this();
    this.publish = publish;
    this.poll = poll;
    this.accepted = accepted;
    this.ack_message = ack_message;
    this.subscribe = subscribe;
    this.unsubscribe = unsubscribe;
    this.notification = notification;
    this.fault = fault;
    this.ping = ping;
    this.pong = pong;
    this.auth = auth;
    this.action_type = action_type;
    this.__isset.action_type = true;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Action(Action other) {
    if (other.isSetPublish()) {
      this.publish = new Publish(other.publish);
    }
    if (other.isSetPoll()) {
      this.poll = new Poll(other.poll);
    }
    if (other.isSetAccepted()) {
      this.accepted = new Accepted(other.accepted);
    }
    if (other.isSetAck_message()) {
      this.ack_message = new AcknowledgeMessage(other.ack_message);
    }
    if (other.isSetSubscribe()) {
      this.subscribe = new Subscribe(other.subscribe);
    }
    if (other.isSetUnsubscribe()) {
      this.unsubscribe = new Unsubscribe(other.unsubscribe);
    }
    if (other.isSetNotification()) {
      this.notification = new Notification(other.notification);
    }
    if (other.isSetFault()) {
      this.fault = new Fault(other.fault);
    }
    if (other.isSetPing()) {
      this.ping = new Ping(other.ping);
    }
    if (other.isSetPong()) {
      this.pong = new Pong(other.pong);
    }
    if (other.isSetAuth()) {
      this.auth = new Authentication(other.auth);
    }
    __isset.action_type = other.__isset.action_type;
    this.action_type = other.action_type;
  }

  @Override
  public Action clone() {
    return new Action(this);
  }

  public Publish getPublish() {
    return this.publish;
  }

  public void setPublish(Publish publish) {
    this.publish = publish;
  }

  public void unsetPublish() {
    this.publish = null;
  }

  // Returns true if field publish is set (has been asigned a value) and false otherwise
  public boolean isSetPublish() {
    return this.publish != null;
  }

  public void setPublishIsSet(boolean value) {
    if (!value) {
      this.publish = null;
    }
  }

  public Poll getPoll() {
    return this.poll;
  }

  public void setPoll(Poll poll) {
    this.poll = poll;
  }

  public void unsetPoll() {
    this.poll = null;
  }

  // Returns true if field poll is set (has been asigned a value) and false otherwise
  public boolean isSetPoll() {
    return this.poll != null;
  }

  public void setPollIsSet(boolean value) {
    if (!value) {
      this.poll = null;
    }
  }

  public Accepted getAccepted() {
    return this.accepted;
  }

  public void setAccepted(Accepted accepted) {
    this.accepted = accepted;
  }

  public void unsetAccepted() {
    this.accepted = null;
  }

  // Returns true if field accepted is set (has been asigned a value) and false otherwise
  public boolean isSetAccepted() {
    return this.accepted != null;
  }

  public void setAcceptedIsSet(boolean value) {
    if (!value) {
      this.accepted = null;
    }
  }

  public AcknowledgeMessage getAck_message() {
    return this.ack_message;
  }

  public void setAck_message(AcknowledgeMessage ack_message) {
    this.ack_message = ack_message;
  }

  public void unsetAck_message() {
    this.ack_message = null;
  }

  // Returns true if field ack_message is set (has been asigned a value) and false otherwise
  public boolean isSetAck_message() {
    return this.ack_message != null;
  }

  public void setAck_messageIsSet(boolean value) {
    if (!value) {
      this.ack_message = null;
    }
  }

  public Subscribe getSubscribe() {
    return this.subscribe;
  }

  public void setSubscribe(Subscribe subscribe) {
    this.subscribe = subscribe;
  }

  public void unsetSubscribe() {
    this.subscribe = null;
  }

  // Returns true if field subscribe is set (has been asigned a value) and false otherwise
  public boolean isSetSubscribe() {
    return this.subscribe != null;
  }

  public void setSubscribeIsSet(boolean value) {
    if (!value) {
      this.subscribe = null;
    }
  }

  public Unsubscribe getUnsubscribe() {
    return this.unsubscribe;
  }

  public void setUnsubscribe(Unsubscribe unsubscribe) {
    this.unsubscribe = unsubscribe;
  }

  public void unsetUnsubscribe() {
    this.unsubscribe = null;
  }

  // Returns true if field unsubscribe is set (has been asigned a value) and false otherwise
  public boolean isSetUnsubscribe() {
    return this.unsubscribe != null;
  }

  public void setUnsubscribeIsSet(boolean value) {
    if (!value) {
      this.unsubscribe = null;
    }
  }

  public Notification getNotification() {
    return this.notification;
  }

  public void setNotification(Notification notification) {
    this.notification = notification;
  }

  public void unsetNotification() {
    this.notification = null;
  }

  // Returns true if field notification is set (has been asigned a value) and false otherwise
  public boolean isSetNotification() {
    return this.notification != null;
  }

  public void setNotificationIsSet(boolean value) {
    if (!value) {
      this.notification = null;
    }
  }

  public Fault getFault() {
    return this.fault;
  }

  public void setFault(Fault fault) {
    this.fault = fault;
  }

  public void unsetFault() {
    this.fault = null;
  }

  // Returns true if field fault is set (has been asigned a value) and false otherwise
  public boolean isSetFault() {
    return this.fault != null;
  }

  public void setFaultIsSet(boolean value) {
    if (!value) {
      this.fault = null;
    }
  }

  public Ping getPing() {
    return this.ping;
  }

  public void setPing(Ping ping) {
    this.ping = ping;
  }

  public void unsetPing() {
    this.ping = null;
  }

  // Returns true if field ping is set (has been asigned a value) and false otherwise
  public boolean isSetPing() {
    return this.ping != null;
  }

  public void setPingIsSet(boolean value) {
    if (!value) {
      this.ping = null;
    }
  }

  public Pong getPong() {
    return this.pong;
  }

  public void setPong(Pong pong) {
    this.pong = pong;
  }

  public void unsetPong() {
    this.pong = null;
  }

  // Returns true if field pong is set (has been asigned a value) and false otherwise
  public boolean isSetPong() {
    return this.pong != null;
  }

  public void setPongIsSet(boolean value) {
    if (!value) {
      this.pong = null;
    }
  }

  public Authentication getAuth() {
    return this.auth;
  }

  public void setAuth(Authentication auth) {
    this.auth = auth;
  }

  public void unsetAuth() {
    this.auth = null;
  }

  // Returns true if field auth is set (has been asigned a value) and false otherwise
  public boolean isSetAuth() {
    return this.auth != null;
  }

  public void setAuthIsSet(boolean value) {
    if (!value) {
      this.auth = null;
    }
  }

  public int getAction_type() {
    return this.action_type;
  }

  public void setAction_type(int action_type) {
    this.action_type = action_type;
    this.__isset.action_type = true;
  }

  public void unsetAction_type() {
    this.__isset.action_type = false;
  }

  // Returns true if field action_type is set (has been asigned a value) and false otherwise
  public boolean isSetAction_type() {
    return this.__isset.action_type;
  }

  public void setAction_typeIsSet(boolean value) {
    this.__isset.action_type = value;
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case PUBLISH:
      setPublish((Publish)value);
      break;

    case POLL:
      setPoll((Poll)value);
      break;

    case ACCEPTED:
      setAccepted((Accepted)value);
      break;

    case ACK_MESSAGE:
      setAck_message((AcknowledgeMessage)value);
      break;

    case SUBSCRIBE:
      setSubscribe((Subscribe)value);
      break;

    case UNSUBSCRIBE:
      setUnsubscribe((Unsubscribe)value);
      break;

    case NOTIFICATION:
      setNotification((Notification)value);
      break;

    case FAULT:
      setFault((Fault)value);
      break;

    case PING:
      setPing((Ping)value);
      break;

    case PONG:
      setPong((Pong)value);
      break;

    case AUTH:
      setAuth((Authentication)value);
      break;

    case ACTION_TYPE:
      setAction_type((Integer)value);
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case PUBLISH:
      return getPublish();

    case POLL:
      return getPoll();

    case ACCEPTED:
      return getAccepted();

    case ACK_MESSAGE:
      return getAck_message();

    case SUBSCRIBE:
      return getSubscribe();

    case UNSUBSCRIBE:
      return getUnsubscribe();

    case NOTIFICATION:
      return getNotification();

    case FAULT:
      return getFault();

    case PING:
      return getPing();

    case PONG:
      return getPong();

    case AUTH:
      return getAuth();

    case ACTION_TYPE:
      return getAction_type();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case PUBLISH:
      return isSetPublish();
    case POLL:
      return isSetPoll();
    case ACCEPTED:
      return isSetAccepted();
    case ACK_MESSAGE:
      return isSetAck_message();
    case SUBSCRIBE:
      return isSetSubscribe();
    case UNSUBSCRIBE:
      return isSetUnsubscribe();
    case NOTIFICATION:
      return isSetNotification();
    case FAULT:
      return isSetFault();
    case PING:
      return isSetPing();
    case PONG:
      return isSetPong();
    case AUTH:
      return isSetAuth();
    case ACTION_TYPE:
      return isSetAction_type();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Action)
      return this.equals((Action)that);
    return false;
  }

  public boolean equals(Action that) {
    if (that == null)
      return false;

    boolean this_present_publish = true && this.isSetPublish();
    boolean that_present_publish = true && that.isSetPublish();
    if (this_present_publish || that_present_publish) {
      if (!(this_present_publish && that_present_publish))
        return false;
      if (!this.publish.equals(that.publish))
        return false;
    }

    boolean this_present_poll = true && this.isSetPoll();
    boolean that_present_poll = true && that.isSetPoll();
    if (this_present_poll || that_present_poll) {
      if (!(this_present_poll && that_present_poll))
        return false;
      if (!this.poll.equals(that.poll))
        return false;
    }

    boolean this_present_accepted = true && this.isSetAccepted();
    boolean that_present_accepted = true && that.isSetAccepted();
    if (this_present_accepted || that_present_accepted) {
      if (!(this_present_accepted && that_present_accepted))
        return false;
      if (!this.accepted.equals(that.accepted))
        return false;
    }

    boolean this_present_ack_message = true && this.isSetAck_message();
    boolean that_present_ack_message = true && that.isSetAck_message();
    if (this_present_ack_message || that_present_ack_message) {
      if (!(this_present_ack_message && that_present_ack_message))
        return false;
      if (!this.ack_message.equals(that.ack_message))
        return false;
    }

    boolean this_present_subscribe = true && this.isSetSubscribe();
    boolean that_present_subscribe = true && that.isSetSubscribe();
    if (this_present_subscribe || that_present_subscribe) {
      if (!(this_present_subscribe && that_present_subscribe))
        return false;
      if (!this.subscribe.equals(that.subscribe))
        return false;
    }

    boolean this_present_unsubscribe = true && this.isSetUnsubscribe();
    boolean that_present_unsubscribe = true && that.isSetUnsubscribe();
    if (this_present_unsubscribe || that_present_unsubscribe) {
      if (!(this_present_unsubscribe && that_present_unsubscribe))
        return false;
      if (!this.unsubscribe.equals(that.unsubscribe))
        return false;
    }

    boolean this_present_notification = true && this.isSetNotification();
    boolean that_present_notification = true && that.isSetNotification();
    if (this_present_notification || that_present_notification) {
      if (!(this_present_notification && that_present_notification))
        return false;
      if (!this.notification.equals(that.notification))
        return false;
    }

    boolean this_present_fault = true && this.isSetFault();
    boolean that_present_fault = true && that.isSetFault();
    if (this_present_fault || that_present_fault) {
      if (!(this_present_fault && that_present_fault))
        return false;
      if (!this.fault.equals(that.fault))
        return false;
    }

    boolean this_present_ping = true && this.isSetPing();
    boolean that_present_ping = true && that.isSetPing();
    if (this_present_ping || that_present_ping) {
      if (!(this_present_ping && that_present_ping))
        return false;
      if (!this.ping.equals(that.ping))
        return false;
    }

    boolean this_present_pong = true && this.isSetPong();
    boolean that_present_pong = true && that.isSetPong();
    if (this_present_pong || that_present_pong) {
      if (!(this_present_pong && that_present_pong))
        return false;
      if (!this.pong.equals(that.pong))
        return false;
    }

    boolean this_present_auth = true && this.isSetAuth();
    boolean that_present_auth = true && that.isSetAuth();
    if (this_present_auth || that_present_auth) {
      if (!(this_present_auth && that_present_auth))
        return false;
      if (!this.auth.equals(that.auth))
        return false;
    }

    boolean this_present_action_type = true;
    boolean that_present_action_type = true;
    if (this_present_action_type || that_present_action_type) {
      if (!(this_present_action_type && that_present_action_type))
        return false;
      if (this.action_type != that.action_type)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case PUBLISH:
          if (field.type == TType.STRUCT) {
            this.publish = new Publish();
            this.publish.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case POLL:
          if (field.type == TType.STRUCT) {
            this.poll = new Poll();
            this.poll.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ACCEPTED:
          if (field.type == TType.STRUCT) {
            this.accepted = new Accepted();
            this.accepted.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ACK_MESSAGE:
          if (field.type == TType.STRUCT) {
            this.ack_message = new AcknowledgeMessage();
            this.ack_message.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SUBSCRIBE:
          if (field.type == TType.STRUCT) {
            this.subscribe = new Subscribe();
            this.subscribe.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case UNSUBSCRIBE:
          if (field.type == TType.STRUCT) {
            this.unsubscribe = new Unsubscribe();
            this.unsubscribe.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case NOTIFICATION:
          if (field.type == TType.STRUCT) {
            this.notification = new Notification();
            this.notification.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case FAULT:
          if (field.type == TType.STRUCT) {
            this.fault = new Fault();
            this.fault.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PING:
          if (field.type == TType.STRUCT) {
            this.ping = new Ping();
            this.ping.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PONG:
          if (field.type == TType.STRUCT) {
            this.pong = new Pong();
            this.pong.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case AUTH:
          if (field.type == TType.STRUCT) {
            this.auth = new Authentication();
            this.auth.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ACTION_TYPE:
          if (field.type == TType.I32) {
            this.action_type = iprot.readI32();
            this.__isset.action_type = true;
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.publish != null) {
      oprot.writeFieldBegin(PUBLISH_FIELD_DESC);
      this.publish.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.poll != null) {
      oprot.writeFieldBegin(POLL_FIELD_DESC);
      this.poll.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.accepted != null) {
      oprot.writeFieldBegin(ACCEPTED_FIELD_DESC);
      this.accepted.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.ack_message != null) {
      oprot.writeFieldBegin(ACK_MESSAGE_FIELD_DESC);
      this.ack_message.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.subscribe != null) {
      oprot.writeFieldBegin(SUBSCRIBE_FIELD_DESC);
      this.subscribe.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.unsubscribe != null) {
      oprot.writeFieldBegin(UNSUBSCRIBE_FIELD_DESC);
      this.unsubscribe.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.notification != null) {
      oprot.writeFieldBegin(NOTIFICATION_FIELD_DESC);
      this.notification.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.fault != null) {
      oprot.writeFieldBegin(FAULT_FIELD_DESC);
      this.fault.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.ping != null) {
      oprot.writeFieldBegin(PING_FIELD_DESC);
      this.ping.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.pong != null) {
      oprot.writeFieldBegin(PONG_FIELD_DESC);
      this.pong.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.auth != null) {
      oprot.writeFieldBegin(AUTH_FIELD_DESC);
      this.auth.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(ACTION_TYPE_FIELD_DESC);
    oprot.writeI32(this.action_type);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Action(");
    boolean first = true;

    if (isSetPublish()) {
      sb.append("publish:");
      if (this.publish == null) {
        sb.append("null");
      } else {
        sb.append(this.publish);
      }
      first = false;
    }
    if (isSetPoll()) {
      if (!first) sb.append(", ");
      sb.append("poll:");
      if (this.poll == null) {
        sb.append("null");
      } else {
        sb.append(this.poll);
      }
      first = false;
    }
    if (isSetAccepted()) {
      if (!first) sb.append(", ");
      sb.append("accepted:");
      if (this.accepted == null) {
        sb.append("null");
      } else {
        sb.append(this.accepted);
      }
      first = false;
    }
    if (isSetAck_message()) {
      if (!first) sb.append(", ");
      sb.append("ack_message:");
      if (this.ack_message == null) {
        sb.append("null");
      } else {
        sb.append(this.ack_message);
      }
      first = false;
    }
    if (isSetSubscribe()) {
      if (!first) sb.append(", ");
      sb.append("subscribe:");
      if (this.subscribe == null) {
        sb.append("null");
      } else {
        sb.append(this.subscribe);
      }
      first = false;
    }
    if (isSetUnsubscribe()) {
      if (!first) sb.append(", ");
      sb.append("unsubscribe:");
      if (this.unsubscribe == null) {
        sb.append("null");
      } else {
        sb.append(this.unsubscribe);
      }
      first = false;
    }
    if (isSetNotification()) {
      if (!first) sb.append(", ");
      sb.append("notification:");
      if (this.notification == null) {
        sb.append("null");
      } else {
        sb.append(this.notification);
      }
      first = false;
    }
    if (isSetFault()) {
      if (!first) sb.append(", ");
      sb.append("fault:");
      if (this.fault == null) {
        sb.append("null");
      } else {
        sb.append(this.fault);
      }
      first = false;
    }
    if (isSetPing()) {
      if (!first) sb.append(", ");
      sb.append("ping:");
      if (this.ping == null) {
        sb.append("null");
      } else {
        sb.append(this.ping);
      }
      first = false;
    }
    if (isSetPong()) {
      if (!first) sb.append(", ");
      sb.append("pong:");
      if (this.pong == null) {
        sb.append("null");
      } else {
        sb.append(this.pong);
      }
      first = false;
    }
    if (isSetAuth()) {
      if (!first) sb.append(", ");
      sb.append("auth:");
      if (this.auth == null) {
        sb.append("null");
      } else {
        sb.append(this.auth);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("action_type:");
    sb.append(this.action_type);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
    if (__isset.action_type && !ActionType.VALID_VALUES.contains(action_type)){
      throw new TProtocolException("Invalid value of field 'action_type'!");
    }
  }

}

