/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostmduserapi;

public class CThostFtdcQryExchangeOrderActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryExchangeOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryExchangeOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcQryExchangeOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParticipantID(String value) {
    thostmduserapiJNI.CThostFtdcQryExchangeOrderActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thostmduserapiJNI.CThostFtdcQryExchangeOrderActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thostmduserapiJNI.CThostFtdcQryExchangeOrderActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thostmduserapiJNI.CThostFtdcQryExchangeOrderActionField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmduserapiJNI.CThostFtdcQryExchangeOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmduserapiJNI.CThostFtdcQryExchangeOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thostmduserapiJNI.CThostFtdcQryExchangeOrderActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thostmduserapiJNI.CThostFtdcQryExchangeOrderActionField_TraderID_get(swigCPtr, this);
  }

  public CThostFtdcQryExchangeOrderActionField() {
    this(thostmduserapiJNI.new_CThostFtdcQryExchangeOrderActionField(), true);
  }

}
