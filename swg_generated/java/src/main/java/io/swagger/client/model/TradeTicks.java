/*
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * TradeTicks
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-25T00:42:40.509Z")
public class TradeTicks {
  @SerializedName("market")
  private String market = null;

  @SerializedName("trade_date_utc")
  private String tradeDateUtc = null;

  @SerializedName("trade_time_utc")
  private String tradeTimeUtc = null;

  @SerializedName("timestamp")
  private BigDecimal timestamp = null;

  @SerializedName("trade_price")
  private Double tradePrice = null;

  @SerializedName("trade_volume")
  private Double tradeVolume = null;

  @SerializedName("prev_closing_price")
  private Double prevClosingPrice = null;

  @SerializedName("change_price")
  private Double changePrice = null;

  @SerializedName("ask_bid")
  private String askBid = null;

  @SerializedName("sequential_id")
  private BigDecimal sequentialId = null;

  public TradeTicks market(String market) {
    this.market = market;
    return this;
  }

   /**
   * 마켓 구분 코드
   * @return market
  **/
  @ApiModelProperty(example = "KRW-BTC", value = "마켓 구분 코드")
  public String getMarket() {
    return market;
  }

  public void setMarket(String market) {
    this.market = market;
  }

  public TradeTicks tradeDateUtc(String tradeDateUtc) {
    this.tradeDateUtc = tradeDateUtc;
    return this;
  }

   /**
   * 체결 일자 (UTC 기준)
   * @return tradeDateUtc
  **/
  @ApiModelProperty(example = "2021-01-05T00:00:00.000+0000", value = "체결 일자 (UTC 기준)")
  public String getTradeDateUtc() {
    return tradeDateUtc;
  }

  public void setTradeDateUtc(String tradeDateUtc) {
    this.tradeDateUtc = tradeDateUtc;
  }

  public TradeTicks tradeTimeUtc(String tradeTimeUtc) {
    this.tradeTimeUtc = tradeTimeUtc;
    return this;
  }

   /**
   * 체결 시각 (UTC 기준)
   * @return tradeTimeUtc
  **/
  @ApiModelProperty(example = "49049", value = "체결 시각 (UTC 기준)")
  public String getTradeTimeUtc() {
    return tradeTimeUtc;
  }

  public void setTradeTimeUtc(String tradeTimeUtc) {
    this.tradeTimeUtc = tradeTimeUtc;
  }

  public TradeTicks timestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * 체결 타임스탬프
   * @return timestamp
  **/
  @ApiModelProperty(example = "1.609853849E12", value = "체결 타임스탬프")
  public BigDecimal getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(BigDecimal timestamp) {
    this.timestamp = timestamp;
  }

  public TradeTicks tradePrice(Double tradePrice) {
    this.tradePrice = tradePrice;
    return this;
  }

   /**
   * 체결 가격
   * @return tradePrice
  **/
  @ApiModelProperty(example = "3.6079E7", value = "체결 가격")
  public Double getTradePrice() {
    return tradePrice;
  }

  public void setTradePrice(Double tradePrice) {
    this.tradePrice = tradePrice;
  }

  public TradeTicks tradeVolume(Double tradeVolume) {
    this.tradeVolume = tradeVolume;
    return this;
  }

   /**
   * 체결량
   * @return tradeVolume
  **/
  @ApiModelProperty(example = "4.4778E-4", value = "체결량")
  public Double getTradeVolume() {
    return tradeVolume;
  }

  public void setTradeVolume(Double tradeVolume) {
    this.tradeVolume = tradeVolume;
  }

  public TradeTicks prevClosingPrice(Double prevClosingPrice) {
    this.prevClosingPrice = prevClosingPrice;
    return this;
  }

   /**
   * 전일 종가
   * @return prevClosingPrice
  **/
  @ApiModelProperty(example = "3.6462E7", value = "전일 종가")
  public Double getPrevClosingPrice() {
    return prevClosingPrice;
  }

  public void setPrevClosingPrice(Double prevClosingPrice) {
    this.prevClosingPrice = prevClosingPrice;
  }

  public TradeTicks changePrice(Double changePrice) {
    this.changePrice = changePrice;
    return this;
  }

   /**
   * 변화량
   * @return changePrice
  **/
  @ApiModelProperty(example = "-383000.0", value = "변화량")
  public Double getChangePrice() {
    return changePrice;
  }

  public void setChangePrice(Double changePrice) {
    this.changePrice = changePrice;
  }

  public TradeTicks askBid(String askBid) {
    this.askBid = askBid;
    return this;
  }

   /**
   * 매도/매수
   * @return askBid
  **/
  @ApiModelProperty(example = "BID", value = "매도/매수")
  public String getAskBid() {
    return askBid;
  }

  public void setAskBid(String askBid) {
    this.askBid = askBid;
  }

  public TradeTicks sequentialId(BigDecimal sequentialId) {
    this.sequentialId = sequentialId;
    return this;
  }

   /**
   * 체결 번호 (Unique) &#x60;sequential_id&#x60; 필드는 체결의 유일성 판단을 위한 근거로 쓰일 수 있습니다. 하지만 체결의 순서를 보장하지는 못합니다. 
   * @return sequentialId
  **/
  @ApiModelProperty(example = "1.609853849000002E15", value = "체결 번호 (Unique) `sequential_id` 필드는 체결의 유일성 판단을 위한 근거로 쓰일 수 있습니다. 하지만 체결의 순서를 보장하지는 못합니다. ")
  public BigDecimal getSequentialId() {
    return sequentialId;
  }

  public void setSequentialId(BigDecimal sequentialId) {
    this.sequentialId = sequentialId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeTicks tradeTicks = (TradeTicks) o;
    return Objects.equals(this.market, tradeTicks.market) &&
        Objects.equals(this.tradeDateUtc, tradeTicks.tradeDateUtc) &&
        Objects.equals(this.tradeTimeUtc, tradeTicks.tradeTimeUtc) &&
        Objects.equals(this.timestamp, tradeTicks.timestamp) &&
        Objects.equals(this.tradePrice, tradeTicks.tradePrice) &&
        Objects.equals(this.tradeVolume, tradeTicks.tradeVolume) &&
        Objects.equals(this.prevClosingPrice, tradeTicks.prevClosingPrice) &&
        Objects.equals(this.changePrice, tradeTicks.changePrice) &&
        Objects.equals(this.askBid, tradeTicks.askBid) &&
        Objects.equals(this.sequentialId, tradeTicks.sequentialId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(market, tradeDateUtc, tradeTimeUtc, timestamp, tradePrice, tradeVolume, prevClosingPrice, changePrice, askBid, sequentialId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeTicks {\n");
    
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    tradeDateUtc: ").append(toIndentedString(tradeDateUtc)).append("\n");
    sb.append("    tradeTimeUtc: ").append(toIndentedString(tradeTimeUtc)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    tradePrice: ").append(toIndentedString(tradePrice)).append("\n");
    sb.append("    tradeVolume: ").append(toIndentedString(tradeVolume)).append("\n");
    sb.append("    prevClosingPrice: ").append(toIndentedString(prevClosingPrice)).append("\n");
    sb.append("    changePrice: ").append(toIndentedString(changePrice)).append("\n");
    sb.append("    askBid: ").append(toIndentedString(askBid)).append("\n");
    sb.append("    sequentialId: ").append(toIndentedString(sequentialId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

