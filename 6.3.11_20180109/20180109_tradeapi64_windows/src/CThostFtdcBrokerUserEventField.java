/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thosttraderapi;

public class CThostFtdcBrokerUserEventField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcBrokerUserEventField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerUserEventField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcBrokerUserEventField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcBrokerUserEventField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcBrokerUserEventField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttradeapiJNI.CThostFtdcBrokerUserEventField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttradeapiJNI.CThostFtdcBrokerUserEventField_UserID_get(swigCPtr, this);
  }

  public void setUserEventType(char value) {
    thosttradeapiJNI.CThostFtdcBrokerUserEventField_UserEventType_set(swigCPtr, this, value);
  }

  public char getUserEventType() {
    return thosttradeapiJNI.CThostFtdcBrokerUserEventField_UserEventType_get(swigCPtr, this);
  }

  public void setEventSequenceNo(int value) {
    thosttradeapiJNI.CThostFtdcBrokerUserEventField_EventSequenceNo_set(swigCPtr, this, value);
  }

  public int getEventSequenceNo() {
    return thosttradeapiJNI.CThostFtdcBrokerUserEventField_EventSequenceNo_get(swigCPtr, this);
  }

  public void setEventDate(String value) {
    thosttradeapiJNI.CThostFtdcBrokerUserEventField_EventDate_set(swigCPtr, this, value);
  }

  public String getEventDate() {
    return thosttradeapiJNI.CThostFtdcBrokerUserEventField_EventDate_get(swigCPtr, this);
  }

  public void setEventTime(String value) {
    thosttradeapiJNI.CThostFtdcBrokerUserEventField_EventTime_set(swigCPtr, this, value);
  }

  public String getEventTime() {
    return thosttradeapiJNI.CThostFtdcBrokerUserEventField_EventTime_get(swigCPtr, this);
  }

  public void setUserEventInfo(String value) {
    thosttradeapiJNI.CThostFtdcBrokerUserEventField_UserEventInfo_set(swigCPtr, this, value);
  }

  public String getUserEventInfo() {
    return thosttradeapiJNI.CThostFtdcBrokerUserEventField_UserEventInfo_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttradeapiJNI.CThostFtdcBrokerUserEventField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttradeapiJNI.CThostFtdcBrokerUserEventField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttradeapiJNI.CThostFtdcBrokerUserEventField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttradeapiJNI.CThostFtdcBrokerUserEventField_InstrumentID_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserEventField() {
    this(thosttradeapiJNI.new_CThostFtdcBrokerUserEventField(), true);
  }

}
