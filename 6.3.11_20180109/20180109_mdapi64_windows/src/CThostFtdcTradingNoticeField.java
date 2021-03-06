/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostmduserapi;

public class CThostFtdcTradingNoticeField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcTradingNoticeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradingNoticeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcTradingNoticeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmduserapiJNI.CThostFtdcTradingNoticeField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmduserapiJNI.CThostFtdcTradingNoticeField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    thostmduserapiJNI.CThostFtdcTradingNoticeField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return thostmduserapiJNI.CThostFtdcTradingNoticeField_InvestorRange_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmduserapiJNI.CThostFtdcTradingNoticeField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmduserapiJNI.CThostFtdcTradingNoticeField_InvestorID_get(swigCPtr, this);
  }

  public void setSequenceSeries(short value) {
    thostmduserapiJNI.CThostFtdcTradingNoticeField_SequenceSeries_set(swigCPtr, this, value);
  }

  public short getSequenceSeries() {
    return thostmduserapiJNI.CThostFtdcTradingNoticeField_SequenceSeries_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmduserapiJNI.CThostFtdcTradingNoticeField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmduserapiJNI.CThostFtdcTradingNoticeField_UserID_get(swigCPtr, this);
  }

  public void setSendTime(String value) {
    thostmduserapiJNI.CThostFtdcTradingNoticeField_SendTime_set(swigCPtr, this, value);
  }

  public String getSendTime() {
    return thostmduserapiJNI.CThostFtdcTradingNoticeField_SendTime_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thostmduserapiJNI.CThostFtdcTradingNoticeField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thostmduserapiJNI.CThostFtdcTradingNoticeField_SequenceNo_get(swigCPtr, this);
  }

  public void setFieldContent(String value) {
    thostmduserapiJNI.CThostFtdcTradingNoticeField_FieldContent_set(swigCPtr, this, value);
  }

  public String getFieldContent() {
    return thostmduserapiJNI.CThostFtdcTradingNoticeField_FieldContent_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thostmduserapiJNI.CThostFtdcTradingNoticeField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thostmduserapiJNI.CThostFtdcTradingNoticeField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcTradingNoticeField() {
    this(thostmduserapiJNI.new_CThostFtdcTradingNoticeField(), true);
  }

}
