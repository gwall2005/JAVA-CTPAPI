/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thosttraderapi;

public class CThostFtdcInvestorField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcInvestorField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestorField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcInvestorField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInvestorID(String value) {
    thosttradeapiJNI.CThostFtdcInvestorField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttradeapiJNI.CThostFtdcInvestorField_InvestorID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcInvestorField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcInvestorField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorGroupID(String value) {
    thosttradeapiJNI.CThostFtdcInvestorField_InvestorGroupID_set(swigCPtr, this, value);
  }

  public String getInvestorGroupID() {
    return thosttradeapiJNI.CThostFtdcInvestorField_InvestorGroupID_get(swigCPtr, this);
  }

  public void setInvestorName(String value) {
    thosttradeapiJNI.CThostFtdcInvestorField_InvestorName_set(swigCPtr, this, value);
  }

  public String getInvestorName() {
    return thosttradeapiJNI.CThostFtdcInvestorField_InvestorName_get(swigCPtr, this);
  }

  public void setIdentifiedCardType(char value) {
    thosttradeapiJNI.CThostFtdcInvestorField_IdentifiedCardType_set(swigCPtr, this, value);
  }

  public char getIdentifiedCardType() {
    return thosttradeapiJNI.CThostFtdcInvestorField_IdentifiedCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thosttradeapiJNI.CThostFtdcInvestorField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thosttradeapiJNI.CThostFtdcInvestorField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    thosttradeapiJNI.CThostFtdcInvestorField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return thosttradeapiJNI.CThostFtdcInvestorField_IsActive_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    thosttradeapiJNI.CThostFtdcInvestorField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return thosttradeapiJNI.CThostFtdcInvestorField_Telephone_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    thosttradeapiJNI.CThostFtdcInvestorField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return thosttradeapiJNI.CThostFtdcInvestorField_Address_get(swigCPtr, this);
  }

  public void setOpenDate(String value) {
    thosttradeapiJNI.CThostFtdcInvestorField_OpenDate_set(swigCPtr, this, value);
  }

  public String getOpenDate() {
    return thosttradeapiJNI.CThostFtdcInvestorField_OpenDate_get(swigCPtr, this);
  }

  public void setMobile(String value) {
    thosttradeapiJNI.CThostFtdcInvestorField_Mobile_set(swigCPtr, this, value);
  }

  public String getMobile() {
    return thosttradeapiJNI.CThostFtdcInvestorField_Mobile_get(swigCPtr, this);
  }

  public void setCommModelID(String value) {
    thosttradeapiJNI.CThostFtdcInvestorField_CommModelID_set(swigCPtr, this, value);
  }

  public String getCommModelID() {
    return thosttradeapiJNI.CThostFtdcInvestorField_CommModelID_get(swigCPtr, this);
  }

  public void setMarginModelID(String value) {
    thosttradeapiJNI.CThostFtdcInvestorField_MarginModelID_set(swigCPtr, this, value);
  }

  public String getMarginModelID() {
    return thosttradeapiJNI.CThostFtdcInvestorField_MarginModelID_get(swigCPtr, this);
  }

  public CThostFtdcInvestorField() {
    this(thosttradeapiJNI.new_CThostFtdcInvestorField(), true);
  }

}
