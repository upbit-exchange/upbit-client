/**
 * Upbit Open API
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Ticker {
  
  @SerializedName("market")
  private String market = null;
  @SerializedName("trade_date")
  private String tradeDate = null;
  @SerializedName("trade_time")
  private String tradeTime = null;
  @SerializedName("trade_date_kst")
  private String tradeDateKst = null;
  @SerializedName("trade_time_kst")
  private String tradeTimeKst = null;
  @SerializedName("opening_price")
  private Double openingPrice = null;
  @SerializedName("high_price")
  private Double highPrice = null;
  @SerializedName("low_price")
  private Double lowPrice = null;
  @SerializedName("trade_price")
  private Double tradePrice = null;
  @SerializedName("prev_closing_price")
  private Double prevClosingPrice = null;
  @SerializedName("change")
  private String change = null;
  @SerializedName("change_price")
  private Double changePrice = null;
  @SerializedName("change_rate")
  private Double changeRate = null;
  @SerializedName("signed_change_price")
  private Double signedChangePrice = null;
  @SerializedName("signed_change_rate")
  private Double signedChangeRate = null;
  @SerializedName("trade_volume")
  private Double tradeVolume = null;
  @SerializedName("acc_trade_price")
  private Double accTradePrice = null;
  @SerializedName("acc_trade_price_24h")
  private Double accTradePrice24h = null;
  @SerializedName("acc_trade_volume")
  private Double accTradeVolume = null;
  @SerializedName("acc_trade_volume_24h")
  private Double accTradeVolume24h = null;
  @SerializedName("highest_52_week_price")
  private Double highest52WeekPrice = null;
  @SerializedName("highest_52_week_date")
  private String highest52WeekDate = null;
  @SerializedName("lowest_52_week_price")
  private Double lowest52WeekPrice = null;
  @SerializedName("lowest_52_week_date")
  private String lowest52WeekDate = null;
  @SerializedName("timestamp")
  private BigDecimal timestamp = null;

  /**
   * 종목 구분 코드
   **/
  @ApiModelProperty(value = "종목 구분 코드")
  public String getMarket() {
    return market;
  }
  public void setMarket(String market) {
    this.market = market;
  }

  /**
   * 최근 거래 일자(UTC)
   **/
  @ApiModelProperty(value = "최근 거래 일자(UTC)")
  public String getTradeDate() {
    return tradeDate;
  }
  public void setTradeDate(String tradeDate) {
    this.tradeDate = tradeDate;
  }

  /**
   * 최근 거래 시각(UTC)
   **/
  @ApiModelProperty(value = "최근 거래 시각(UTC)")
  public String getTradeTime() {
    return tradeTime;
  }
  public void setTradeTime(String tradeTime) {
    this.tradeTime = tradeTime;
  }

  /**
   * 최근 거래 일자(KST)
   **/
  @ApiModelProperty(value = "최근 거래 일자(KST)")
  public String getTradeDateKst() {
    return tradeDateKst;
  }
  public void setTradeDateKst(String tradeDateKst) {
    this.tradeDateKst = tradeDateKst;
  }

  /**
   * 최근 거래 시각(KST)
   **/
  @ApiModelProperty(value = "최근 거래 시각(KST)")
  public String getTradeTimeKst() {
    return tradeTimeKst;
  }
  public void setTradeTimeKst(String tradeTimeKst) {
    this.tradeTimeKst = tradeTimeKst;
  }

  /**
   * 시가
   **/
  @ApiModelProperty(value = "시가")
  public Double getOpeningPrice() {
    return openingPrice;
  }
  public void setOpeningPrice(Double openingPrice) {
    this.openingPrice = openingPrice;
  }

  /**
   * 고가
   **/
  @ApiModelProperty(value = "고가")
  public Double getHighPrice() {
    return highPrice;
  }
  public void setHighPrice(Double highPrice) {
    this.highPrice = highPrice;
  }

  /**
   * 저가
   **/
  @ApiModelProperty(value = "저가")
  public Double getLowPrice() {
    return lowPrice;
  }
  public void setLowPrice(Double lowPrice) {
    this.lowPrice = lowPrice;
  }

  /**
   * 종가
   **/
  @ApiModelProperty(value = "종가")
  public Double getTradePrice() {
    return tradePrice;
  }
  public void setTradePrice(Double tradePrice) {
    this.tradePrice = tradePrice;
  }

  /**
   * 전일 종가
   **/
  @ApiModelProperty(value = "전일 종가")
  public Double getPrevClosingPrice() {
    return prevClosingPrice;
  }
  public void setPrevClosingPrice(Double prevClosingPrice) {
    this.prevClosingPrice = prevClosingPrice;
  }

  /**
   * EVEN : 보합 RISE : 상승 FALL : 하락 
   **/
  @ApiModelProperty(value = "EVEN : 보합 RISE : 상승 FALL : 하락 ")
  public String getChange() {
    return change;
  }
  public void setChange(String change) {
    this.change = change;
  }

  /**
   * 변화액의 절대값
   **/
  @ApiModelProperty(value = "변화액의 절대값")
  public Double getChangePrice() {
    return changePrice;
  }
  public void setChangePrice(Double changePrice) {
    this.changePrice = changePrice;
  }

  /**
   * 변화율의 절대값
   **/
  @ApiModelProperty(value = "변화율의 절대값")
  public Double getChangeRate() {
    return changeRate;
  }
  public void setChangeRate(Double changeRate) {
    this.changeRate = changeRate;
  }

  /**
   * 부호가 있는 변화액
   **/
  @ApiModelProperty(value = "부호가 있는 변화액")
  public Double getSignedChangePrice() {
    return signedChangePrice;
  }
  public void setSignedChangePrice(Double signedChangePrice) {
    this.signedChangePrice = signedChangePrice;
  }

  /**
   * 부호가 있는 변화율
   **/
  @ApiModelProperty(value = "부호가 있는 변화율")
  public Double getSignedChangeRate() {
    return signedChangeRate;
  }
  public void setSignedChangeRate(Double signedChangeRate) {
    this.signedChangeRate = signedChangeRate;
  }

  /**
   * 가장 최근 거래량
   **/
  @ApiModelProperty(value = "가장 최근 거래량")
  public Double getTradeVolume() {
    return tradeVolume;
  }
  public void setTradeVolume(Double tradeVolume) {
    this.tradeVolume = tradeVolume;
  }

  /**
   * 누적 거래대금 (UTC 0시 기준)
   **/
  @ApiModelProperty(value = "누적 거래대금 (UTC 0시 기준)")
  public Double getAccTradePrice() {
    return accTradePrice;
  }
  public void setAccTradePrice(Double accTradePrice) {
    this.accTradePrice = accTradePrice;
  }

  /**
   * 24시간 누적 거래대금
   **/
  @ApiModelProperty(value = "24시간 누적 거래대금")
  public Double getAccTradePrice24h() {
    return accTradePrice24h;
  }
  public void setAccTradePrice24h(Double accTradePrice24h) {
    this.accTradePrice24h = accTradePrice24h;
  }

  /**
   * 누적 거래량 (UTC 0시 기준)
   **/
  @ApiModelProperty(value = "누적 거래량 (UTC 0시 기준)")
  public Double getAccTradeVolume() {
    return accTradeVolume;
  }
  public void setAccTradeVolume(Double accTradeVolume) {
    this.accTradeVolume = accTradeVolume;
  }

  /**
   * 24시간 누적 거래량
   **/
  @ApiModelProperty(value = "24시간 누적 거래량")
  public Double getAccTradeVolume24h() {
    return accTradeVolume24h;
  }
  public void setAccTradeVolume24h(Double accTradeVolume24h) {
    this.accTradeVolume24h = accTradeVolume24h;
  }

  /**
   * 52주 신고가
   **/
  @ApiModelProperty(value = "52주 신고가")
  public Double getHighest52WeekPrice() {
    return highest52WeekPrice;
  }
  public void setHighest52WeekPrice(Double highest52WeekPrice) {
    this.highest52WeekPrice = highest52WeekPrice;
  }

  /**
   * 52주 신고가 달성일
   **/
  @ApiModelProperty(value = "52주 신고가 달성일")
  public String getHighest52WeekDate() {
    return highest52WeekDate;
  }
  public void setHighest52WeekDate(String highest52WeekDate) {
    this.highest52WeekDate = highest52WeekDate;
  }

  /**
   * 52주 신저가
   **/
  @ApiModelProperty(value = "52주 신저가")
  public Double getLowest52WeekPrice() {
    return lowest52WeekPrice;
  }
  public void setLowest52WeekPrice(Double lowest52WeekPrice) {
    this.lowest52WeekPrice = lowest52WeekPrice;
  }

  /**
   * 52주 신저가 달성일
   **/
  @ApiModelProperty(value = "52주 신저가 달성일")
  public String getLowest52WeekDate() {
    return lowest52WeekDate;
  }
  public void setLowest52WeekDate(String lowest52WeekDate) {
    this.lowest52WeekDate = lowest52WeekDate;
  }

  /**
   * 타임스탬프
   **/
  @ApiModelProperty(value = "타임스탬프")
  public BigDecimal getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ticker ticker = (Ticker) o;
    return (this.market == null ? ticker.market == null : this.market.equals(ticker.market)) &&
        (this.tradeDate == null ? ticker.tradeDate == null : this.tradeDate.equals(ticker.tradeDate)) &&
        (this.tradeTime == null ? ticker.tradeTime == null : this.tradeTime.equals(ticker.tradeTime)) &&
        (this.tradeDateKst == null ? ticker.tradeDateKst == null : this.tradeDateKst.equals(ticker.tradeDateKst)) &&
        (this.tradeTimeKst == null ? ticker.tradeTimeKst == null : this.tradeTimeKst.equals(ticker.tradeTimeKst)) &&
        (this.openingPrice == null ? ticker.openingPrice == null : this.openingPrice.equals(ticker.openingPrice)) &&
        (this.highPrice == null ? ticker.highPrice == null : this.highPrice.equals(ticker.highPrice)) &&
        (this.lowPrice == null ? ticker.lowPrice == null : this.lowPrice.equals(ticker.lowPrice)) &&
        (this.tradePrice == null ? ticker.tradePrice == null : this.tradePrice.equals(ticker.tradePrice)) &&
        (this.prevClosingPrice == null ? ticker.prevClosingPrice == null : this.prevClosingPrice.equals(ticker.prevClosingPrice)) &&
        (this.change == null ? ticker.change == null : this.change.equals(ticker.change)) &&
        (this.changePrice == null ? ticker.changePrice == null : this.changePrice.equals(ticker.changePrice)) &&
        (this.changeRate == null ? ticker.changeRate == null : this.changeRate.equals(ticker.changeRate)) &&
        (this.signedChangePrice == null ? ticker.signedChangePrice == null : this.signedChangePrice.equals(ticker.signedChangePrice)) &&
        (this.signedChangeRate == null ? ticker.signedChangeRate == null : this.signedChangeRate.equals(ticker.signedChangeRate)) &&
        (this.tradeVolume == null ? ticker.tradeVolume == null : this.tradeVolume.equals(ticker.tradeVolume)) &&
        (this.accTradePrice == null ? ticker.accTradePrice == null : this.accTradePrice.equals(ticker.accTradePrice)) &&
        (this.accTradePrice24h == null ? ticker.accTradePrice24h == null : this.accTradePrice24h.equals(ticker.accTradePrice24h)) &&
        (this.accTradeVolume == null ? ticker.accTradeVolume == null : this.accTradeVolume.equals(ticker.accTradeVolume)) &&
        (this.accTradeVolume24h == null ? ticker.accTradeVolume24h == null : this.accTradeVolume24h.equals(ticker.accTradeVolume24h)) &&
        (this.highest52WeekPrice == null ? ticker.highest52WeekPrice == null : this.highest52WeekPrice.equals(ticker.highest52WeekPrice)) &&
        (this.highest52WeekDate == null ? ticker.highest52WeekDate == null : this.highest52WeekDate.equals(ticker.highest52WeekDate)) &&
        (this.lowest52WeekPrice == null ? ticker.lowest52WeekPrice == null : this.lowest52WeekPrice.equals(ticker.lowest52WeekPrice)) &&
        (this.lowest52WeekDate == null ? ticker.lowest52WeekDate == null : this.lowest52WeekDate.equals(ticker.lowest52WeekDate)) &&
        (this.timestamp == null ? ticker.timestamp == null : this.timestamp.equals(ticker.timestamp));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.market == null ? 0: this.market.hashCode());
    result = 31 * result + (this.tradeDate == null ? 0: this.tradeDate.hashCode());
    result = 31 * result + (this.tradeTime == null ? 0: this.tradeTime.hashCode());
    result = 31 * result + (this.tradeDateKst == null ? 0: this.tradeDateKst.hashCode());
    result = 31 * result + (this.tradeTimeKst == null ? 0: this.tradeTimeKst.hashCode());
    result = 31 * result + (this.openingPrice == null ? 0: this.openingPrice.hashCode());
    result = 31 * result + (this.highPrice == null ? 0: this.highPrice.hashCode());
    result = 31 * result + (this.lowPrice == null ? 0: this.lowPrice.hashCode());
    result = 31 * result + (this.tradePrice == null ? 0: this.tradePrice.hashCode());
    result = 31 * result + (this.prevClosingPrice == null ? 0: this.prevClosingPrice.hashCode());
    result = 31 * result + (this.change == null ? 0: this.change.hashCode());
    result = 31 * result + (this.changePrice == null ? 0: this.changePrice.hashCode());
    result = 31 * result + (this.changeRate == null ? 0: this.changeRate.hashCode());
    result = 31 * result + (this.signedChangePrice == null ? 0: this.signedChangePrice.hashCode());
    result = 31 * result + (this.signedChangeRate == null ? 0: this.signedChangeRate.hashCode());
    result = 31 * result + (this.tradeVolume == null ? 0: this.tradeVolume.hashCode());
    result = 31 * result + (this.accTradePrice == null ? 0: this.accTradePrice.hashCode());
    result = 31 * result + (this.accTradePrice24h == null ? 0: this.accTradePrice24h.hashCode());
    result = 31 * result + (this.accTradeVolume == null ? 0: this.accTradeVolume.hashCode());
    result = 31 * result + (this.accTradeVolume24h == null ? 0: this.accTradeVolume24h.hashCode());
    result = 31 * result + (this.highest52WeekPrice == null ? 0: this.highest52WeekPrice.hashCode());
    result = 31 * result + (this.highest52WeekDate == null ? 0: this.highest52WeekDate.hashCode());
    result = 31 * result + (this.lowest52WeekPrice == null ? 0: this.lowest52WeekPrice.hashCode());
    result = 31 * result + (this.lowest52WeekDate == null ? 0: this.lowest52WeekDate.hashCode());
    result = 31 * result + (this.timestamp == null ? 0: this.timestamp.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ticker {\n");
    
    sb.append("  market: ").append(market).append("\n");
    sb.append("  tradeDate: ").append(tradeDate).append("\n");
    sb.append("  tradeTime: ").append(tradeTime).append("\n");
    sb.append("  tradeDateKst: ").append(tradeDateKst).append("\n");
    sb.append("  tradeTimeKst: ").append(tradeTimeKst).append("\n");
    sb.append("  openingPrice: ").append(openingPrice).append("\n");
    sb.append("  highPrice: ").append(highPrice).append("\n");
    sb.append("  lowPrice: ").append(lowPrice).append("\n");
    sb.append("  tradePrice: ").append(tradePrice).append("\n");
    sb.append("  prevClosingPrice: ").append(prevClosingPrice).append("\n");
    sb.append("  change: ").append(change).append("\n");
    sb.append("  changePrice: ").append(changePrice).append("\n");
    sb.append("  changeRate: ").append(changeRate).append("\n");
    sb.append("  signedChangePrice: ").append(signedChangePrice).append("\n");
    sb.append("  signedChangeRate: ").append(signedChangeRate).append("\n");
    sb.append("  tradeVolume: ").append(tradeVolume).append("\n");
    sb.append("  accTradePrice: ").append(accTradePrice).append("\n");
    sb.append("  accTradePrice24h: ").append(accTradePrice24h).append("\n");
    sb.append("  accTradeVolume: ").append(accTradeVolume).append("\n");
    sb.append("  accTradeVolume24h: ").append(accTradeVolume24h).append("\n");
    sb.append("  highest52WeekPrice: ").append(highest52WeekPrice).append("\n");
    sb.append("  highest52WeekDate: ").append(highest52WeekDate).append("\n");
    sb.append("  lowest52WeekPrice: ").append(lowest52WeekPrice).append("\n");
    sb.append("  lowest52WeekDate: ").append(lowest52WeekDate).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
