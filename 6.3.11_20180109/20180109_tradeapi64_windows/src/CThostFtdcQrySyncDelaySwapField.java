/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thosttraderapi;

public class CThostFtdcQrySyncDelaySwapField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQrySyncDelaySwapField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQrySyncDelaySwapField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcQrySyncDelaySwapField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcQrySyncDelaySwapField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcQrySyncDelaySwapField_BrokerID_get(swigCPtr, this);
  }

  public void setDelaySwapSeqNo(String value) {
    thosttradeapiJNI.CThostFtdcQrySyncDelaySwapField_DelaySwapSeqNo_set(swigCPtr, this, value);
  }

  public String getDelaySwapSeqNo() {
    return thosttradeapiJNI.CThostFtdcQrySyncDelaySwapField_DelaySwapSeqNo_get(swigCPtr, this);
  }

  public CThostFtdcQrySyncDelaySwapField() {
    this(thosttradeapiJNI.new_CThostFtdcQrySyncDelaySwapField(), true);
  }

}
