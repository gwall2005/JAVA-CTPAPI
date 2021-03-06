/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thosttraderapi;

public class CThostFtdcDepthMarketDataField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcDepthMarketDataField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcDepthMarketDataField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcDepthMarketDataField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_TradingDay_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setLastPrice(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_LastPrice_set(swigCPtr, this, value);
  }

  public double getLastPrice() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_LastPrice_get(swigCPtr, this);
  }

  public void setPreSettlementPrice(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_PreSettlementPrice_set(swigCPtr, this, value);
  }

  public double getPreSettlementPrice() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_PreSettlementPrice_get(swigCPtr, this);
  }

  public void setPreClosePrice(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_PreClosePrice_set(swigCPtr, this, value);
  }

  public double getPreClosePrice() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_PreClosePrice_get(swigCPtr, this);
  }

  public void setPreOpenInterest(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_PreOpenInterest_set(swigCPtr, this, value);
  }

  public double getPreOpenInterest() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_PreOpenInterest_get(swigCPtr, this);
  }

  public void setOpenPrice(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_OpenPrice_set(swigCPtr, this, value);
  }

  public double getOpenPrice() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_OpenPrice_get(swigCPtr, this);
  }

  public void setHighestPrice(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_HighestPrice_set(swigCPtr, this, value);
  }

  public double getHighestPrice() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_HighestPrice_get(swigCPtr, this);
  }

  public void setLowestPrice(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_LowestPrice_set(swigCPtr, this, value);
  }

  public double getLowestPrice() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_LowestPrice_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_Volume_get(swigCPtr, this);
  }

  public void setTurnover(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_Turnover_set(swigCPtr, this, value);
  }

  public double getTurnover() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_Turnover_get(swigCPtr, this);
  }

  public void setOpenInterest(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_OpenInterest_set(swigCPtr, this, value);
  }

  public double getOpenInterest() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_OpenInterest_get(swigCPtr, this);
  }

  public void setClosePrice(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_ClosePrice_set(swigCPtr, this, value);
  }

  public double getClosePrice() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_ClosePrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_SettlementPrice_get(swigCPtr, this);
  }

  public void setUpperLimitPrice(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_UpperLimitPrice_set(swigCPtr, this, value);
  }

  public double getUpperLimitPrice() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_UpperLimitPrice_get(swigCPtr, this);
  }

  public void setLowerLimitPrice(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_LowerLimitPrice_set(swigCPtr, this, value);
  }

  public double getLowerLimitPrice() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_LowerLimitPrice_get(swigCPtr, this);
  }

  public void setPreDelta(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_PreDelta_set(swigCPtr, this, value);
  }

  public double getPreDelta() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_PreDelta_get(swigCPtr, this);
  }

  public void setCurrDelta(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_CurrDelta_set(swigCPtr, this, value);
  }

  public double getCurrDelta() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_CurrDelta_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_UpdateTime_get(swigCPtr, this);
  }

  public void setUpdateMillisec(int value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_UpdateMillisec_set(swigCPtr, this, value);
  }

  public int getUpdateMillisec() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_UpdateMillisec_get(swigCPtr, this);
  }

  public void setBidPrice1(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidPrice1_set(swigCPtr, this, value);
  }

  public double getBidPrice1() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidPrice1_get(swigCPtr, this);
  }

  public void setBidVolume1(int value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidVolume1_set(swigCPtr, this, value);
  }

  public int getBidVolume1() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidVolume1_get(swigCPtr, this);
  }

  public void setAskPrice1(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskPrice1_set(swigCPtr, this, value);
  }

  public double getAskPrice1() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskPrice1_get(swigCPtr, this);
  }

  public void setAskVolume1(int value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskVolume1_set(swigCPtr, this, value);
  }

  public int getAskVolume1() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskVolume1_get(swigCPtr, this);
  }

  public void setBidPrice2(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidPrice2_set(swigCPtr, this, value);
  }

  public double getBidPrice2() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidPrice2_get(swigCPtr, this);
  }

  public void setBidVolume2(int value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidVolume2_set(swigCPtr, this, value);
  }

  public int getBidVolume2() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidVolume2_get(swigCPtr, this);
  }

  public void setAskPrice2(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskPrice2_set(swigCPtr, this, value);
  }

  public double getAskPrice2() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskPrice2_get(swigCPtr, this);
  }

  public void setAskVolume2(int value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskVolume2_set(swigCPtr, this, value);
  }

  public int getAskVolume2() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskVolume2_get(swigCPtr, this);
  }

  public void setBidPrice3(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidPrice3_set(swigCPtr, this, value);
  }

  public double getBidPrice3() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidPrice3_get(swigCPtr, this);
  }

  public void setBidVolume3(int value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidVolume3_set(swigCPtr, this, value);
  }

  public int getBidVolume3() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidVolume3_get(swigCPtr, this);
  }

  public void setAskPrice3(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskPrice3_set(swigCPtr, this, value);
  }

  public double getAskPrice3() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskPrice3_get(swigCPtr, this);
  }

  public void setAskVolume3(int value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskVolume3_set(swigCPtr, this, value);
  }

  public int getAskVolume3() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskVolume3_get(swigCPtr, this);
  }

  public void setBidPrice4(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidPrice4_set(swigCPtr, this, value);
  }

  public double getBidPrice4() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidPrice4_get(swigCPtr, this);
  }

  public void setBidVolume4(int value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidVolume4_set(swigCPtr, this, value);
  }

  public int getBidVolume4() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidVolume4_get(swigCPtr, this);
  }

  public void setAskPrice4(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskPrice4_set(swigCPtr, this, value);
  }

  public double getAskPrice4() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskPrice4_get(swigCPtr, this);
  }

  public void setAskVolume4(int value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskVolume4_set(swigCPtr, this, value);
  }

  public int getAskVolume4() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskVolume4_get(swigCPtr, this);
  }

  public void setBidPrice5(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidPrice5_set(swigCPtr, this, value);
  }

  public double getBidPrice5() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidPrice5_get(swigCPtr, this);
  }

  public void setBidVolume5(int value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidVolume5_set(swigCPtr, this, value);
  }

  public int getBidVolume5() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_BidVolume5_get(swigCPtr, this);
  }

  public void setAskPrice5(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskPrice5_set(swigCPtr, this, value);
  }

  public double getAskPrice5() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskPrice5_get(swigCPtr, this);
  }

  public void setAskVolume5(int value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskVolume5_set(swigCPtr, this, value);
  }

  public int getAskVolume5() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_AskVolume5_get(swigCPtr, this);
  }

  public void setAveragePrice(double value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_AveragePrice_set(swigCPtr, this, value);
  }

  public double getAveragePrice() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_AveragePrice_get(swigCPtr, this);
  }

  public void setActionDay(String value) {
    thosttradeapiJNI.CThostFtdcDepthMarketDataField_ActionDay_set(swigCPtr, this, value);
  }

  public String getActionDay() {
    return thosttradeapiJNI.CThostFtdcDepthMarketDataField_ActionDay_get(swigCPtr, this);
  }

  public CThostFtdcDepthMarketDataField() {
    this(thosttradeapiJNI.new_CThostFtdcDepthMarketDataField(), true);
  }

}
