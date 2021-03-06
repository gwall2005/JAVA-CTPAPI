/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thosttraderapi;

public class CThostFtdcReqFutureSignOutField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcReqFutureSignOutField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqFutureSignOutField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcReqFutureSignOutField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_SessionID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_UserID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_Digest_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_CurrencyID_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_DeviceID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thosttradeapiJNI.CThostFtdcReqFutureSignOutField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thosttradeapiJNI.CThostFtdcReqFutureSignOutField_TID_get(swigCPtr, this);
  }

  public CThostFtdcReqFutureSignOutField() {
    this(thosttradeapiJNI.new_CThostFtdcReqFutureSignOutField(), true);
  }

}
