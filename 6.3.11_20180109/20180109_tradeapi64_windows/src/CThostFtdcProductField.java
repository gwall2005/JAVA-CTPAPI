/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcProductField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcProductField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcProductField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcProductField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setProductID(String value) {
    thosttradeapiJNI.CThostFtdcProductField_ProductID_set(swigCPtr, this, value);
  }

  public String getProductID() {
    return thosttradeapiJNI.CThostFtdcProductField_ProductID_get(swigCPtr, this);
  }

  public void setProductName(String value) {
    thosttradeapiJNI.CThostFtdcProductField_ProductName_set(swigCPtr, this, value);
  }

  public String getProductName() {
    return thosttradeapiJNI.CThostFtdcProductField_ProductName_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttradeapiJNI.CThostFtdcProductField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttradeapiJNI.CThostFtdcProductField_ExchangeID_get(swigCPtr, this);
  }

  public void setProductClass(char value) {
    thosttradeapiJNI.CThostFtdcProductField_ProductClass_set(swigCPtr, this, value);
  }

  public char getProductClass() {
    return thosttradeapiJNI.CThostFtdcProductField_ProductClass_get(swigCPtr, this);
  }

  public void setVolumeMultiple(int value) {
    thosttradeapiJNI.CThostFtdcProductField_VolumeMultiple_set(swigCPtr, this, value);
  }

  public int getVolumeMultiple() {
    return thosttradeapiJNI.CThostFtdcProductField_VolumeMultiple_get(swigCPtr, this);
  }

  public void setPriceTick(double value) {
    thosttradeapiJNI.CThostFtdcProductField_PriceTick_set(swigCPtr, this, value);
  }

  public double getPriceTick() {
    return thosttradeapiJNI.CThostFtdcProductField_PriceTick_get(swigCPtr, this);
  }

  public void setMaxMarketOrderVolume(int value) {
    thosttradeapiJNI.CThostFtdcProductField_MaxMarketOrderVolume_set(swigCPtr, this, value);
  }

  public int getMaxMarketOrderVolume() {
    return thosttradeapiJNI.CThostFtdcProductField_MaxMarketOrderVolume_get(swigCPtr, this);
  }

  public void setMinMarketOrderVolume(int value) {
    thosttradeapiJNI.CThostFtdcProductField_MinMarketOrderVolume_set(swigCPtr, this, value);
  }

  public int getMinMarketOrderVolume() {
    return thosttradeapiJNI.CThostFtdcProductField_MinMarketOrderVolume_get(swigCPtr, this);
  }

  public void setMaxLimitOrderVolume(int value) {
    thosttradeapiJNI.CThostFtdcProductField_MaxLimitOrderVolume_set(swigCPtr, this, value);
  }

  public int getMaxLimitOrderVolume() {
    return thosttradeapiJNI.CThostFtdcProductField_MaxLimitOrderVolume_get(swigCPtr, this);
  }

  public void setMinLimitOrderVolume(int value) {
    thosttradeapiJNI.CThostFtdcProductField_MinLimitOrderVolume_set(swigCPtr, this, value);
  }

  public int getMinLimitOrderVolume() {
    return thosttradeapiJNI.CThostFtdcProductField_MinLimitOrderVolume_get(swigCPtr, this);
  }

  public void setPositionType(char value) {
    thosttradeapiJNI.CThostFtdcProductField_PositionType_set(swigCPtr, this, value);
  }

  public char getPositionType() {
    return thosttradeapiJNI.CThostFtdcProductField_PositionType_get(swigCPtr, this);
  }

  public void setPositionDateType(char value) {
    thosttradeapiJNI.CThostFtdcProductField_PositionDateType_set(swigCPtr, this, value);
  }

  public char getPositionDateType() {
    return thosttradeapiJNI.CThostFtdcProductField_PositionDateType_get(swigCPtr, this);
  }

  public void setCloseDealType(char value) {
    thosttradeapiJNI.CThostFtdcProductField_CloseDealType_set(swigCPtr, this, value);
  }

  public char getCloseDealType() {
    return thosttradeapiJNI.CThostFtdcProductField_CloseDealType_get(swigCPtr, this);
  }

  public void setTradeCurrencyID(String value) {
    thosttradeapiJNI.CThostFtdcProductField_TradeCurrencyID_set(swigCPtr, this, value);
  }

  public String getTradeCurrencyID() {
    return thosttradeapiJNI.CThostFtdcProductField_TradeCurrencyID_get(swigCPtr, this);
  }

  public void setMortgageFundUseRange(char value) {
    thosttradeapiJNI.CThostFtdcProductField_MortgageFundUseRange_set(swigCPtr, this, value);
  }

  public char getMortgageFundUseRange() {
    return thosttradeapiJNI.CThostFtdcProductField_MortgageFundUseRange_get(swigCPtr, this);
  }

  public void setExchangeProductID(String value) {
    thosttradeapiJNI.CThostFtdcProductField_ExchangeProductID_set(swigCPtr, this, value);
  }

  public String getExchangeProductID() {
    return thosttradeapiJNI.CThostFtdcProductField_ExchangeProductID_get(swigCPtr, this);
  }

  public void setUnderlyingMultiple(double value) {
    thosttradeapiJNI.CThostFtdcProductField_UnderlyingMultiple_set(swigCPtr, this, value);
  }

  public double getUnderlyingMultiple() {
    return thosttradeapiJNI.CThostFtdcProductField_UnderlyingMultiple_get(swigCPtr, this);
  }

  public CThostFtdcProductField() {
    this(thosttradeapiJNI.new_CThostFtdcProductField(), true);
  }

}