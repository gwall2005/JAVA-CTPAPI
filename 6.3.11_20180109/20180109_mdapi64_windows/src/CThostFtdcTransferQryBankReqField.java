/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostmduserapi;

public class CThostFtdcTransferQryBankReqField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcTransferQryBankReqField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferQryBankReqField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmduserapiJNI.delete_CThostFtdcTransferQryBankReqField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFutureAccount(String value) {
    thostmduserapiJNI.CThostFtdcTransferQryBankReqField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return thostmduserapiJNI.CThostFtdcTransferQryBankReqField_FutureAccount_get(swigCPtr, this);
  }

  public void setFuturePwdFlag(char value) {
    thostmduserapiJNI.CThostFtdcTransferQryBankReqField_FuturePwdFlag_set(swigCPtr, this, value);
  }

  public char getFuturePwdFlag() {
    return thostmduserapiJNI.CThostFtdcTransferQryBankReqField_FuturePwdFlag_get(swigCPtr, this);
  }

  public void setFutureAccPwd(String value) {
    thostmduserapiJNI.CThostFtdcTransferQryBankReqField_FutureAccPwd_set(swigCPtr, this, value);
  }

  public String getFutureAccPwd() {
    return thostmduserapiJNI.CThostFtdcTransferQryBankReqField_FutureAccPwd_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    thostmduserapiJNI.CThostFtdcTransferQryBankReqField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return thostmduserapiJNI.CThostFtdcTransferQryBankReqField_CurrencyCode_get(swigCPtr, this);
  }

  public CThostFtdcTransferQryBankReqField() {
    this(thostmduserapiJNI.new_CThostFtdcTransferQryBankReqField(), true);
  }

}
