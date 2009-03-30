/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package pt.com.thrift;


import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import org.apache.thrift.IntRangeSet;

public class ActionType {
  public static final int PUBLISH = 0;
  public static final int POLL = 1;
  public static final int ACCEPTED = 2;
  public static final int ACKNOWLEDGE_MESSAGE = 3;
  public static final int SUBSCRIBE = 4;
  public static final int UNSUBSCRIBE = 5;
  public static final int NOTIFICATION = 6;
  public static final int FAULT = 7;
  public static final int PING = 8;
  public static final int PONG = 9;
  public static final int AUTH = 10;

  public static final IntRangeSet VALID_VALUES = new IntRangeSet(PUBLISH, POLL, ACCEPTED, ACKNOWLEDGE_MESSAGE, SUBSCRIBE, UNSUBSCRIBE, NOTIFICATION, FAULT, PING, PONG, AUTH);
}
