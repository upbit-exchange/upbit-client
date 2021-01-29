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

import io.swagger.client.model.Trade;
import java.math.BigDecimal;
import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrderInfo {
  
  @SerializedName("uuid")
  private String uuid = null;
  @SerializedName("side")
  private String side = null;
  @SerializedName("ord_type")
  private String ordType = null;
  @SerializedName("price")
  private String price = null;
  @SerializedName("state")
  private String state = null;
  @SerializedName("market")
  private String market = null;
  @SerializedName("created_at")
  private String createdAt = null;
  @SerializedName("volume")
  private String volume = null;
  @SerializedName("remaining_volume")
  private String remainingVolume = null;
  @SerializedName("reserved_fee")
  private String reservedFee = null;
  @SerializedName("remaining_fee")
  private String remainingFee = null;
  @SerializedName("paid_fee")
  private String paidFee = null;
  @SerializedName("locked")
  private String locked = null;
  @SerializedName("executed_volume")
  private String executedVolume = null;
  @SerializedName("trades_count")
  private BigDecimal tradesCount = null;
  @SerializedName("trades")
  private List<Trade> trades = null;

  /**
   * 주문의 고유 아이디
   **/
  @ApiModelProperty(value = "주문의 고유 아이디")
  public String getUuid() {
    return uuid;
  }
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  /**
   * 주문 종류
   **/
  @ApiModelProperty(value = "주문 종류")
  public String getSide() {
    return side;
  }
  public void setSide(String side) {
    this.side = side;
  }

  /**
   * 주문 방식
   **/
  @ApiModelProperty(value = "주문 방식")
  public String getOrdType() {
    return ordType;
  }
  public void setOrdType(String ordType) {
    this.ordType = ordType;
  }

  /**
   * 주문 당시 화폐 가격
   **/
  @ApiModelProperty(value = "주문 당시 화폐 가격")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * 주문 상태
   **/
  @ApiModelProperty(value = "주문 상태")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  /**
   * 마켓의 유일키
   **/
  @ApiModelProperty(value = "마켓의 유일키")
  public String getMarket() {
    return market;
  }
  public void setMarket(String market) {
    this.market = market;
  }

  /**
   * 주문 생성 시간
   **/
  @ApiModelProperty(value = "주문 생성 시간")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * 사용자가 입력한 주문 양
   **/
  @ApiModelProperty(value = "사용자가 입력한 주문 양")
  public String getVolume() {
    return volume;
  }
  public void setVolume(String volume) {
    this.volume = volume;
  }

  /**
   * 체결 후 남은 주문 양
   **/
  @ApiModelProperty(value = "체결 후 남은 주문 양")
  public String getRemainingVolume() {
    return remainingVolume;
  }
  public void setRemainingVolume(String remainingVolume) {
    this.remainingVolume = remainingVolume;
  }

  /**
   * 수수료로 예약된 비용
   **/
  @ApiModelProperty(value = "수수료로 예약된 비용")
  public String getReservedFee() {
    return reservedFee;
  }
  public void setReservedFee(String reservedFee) {
    this.reservedFee = reservedFee;
  }

  /**
   * 남은 수수료
   **/
  @ApiModelProperty(value = "남은 수수료")
  public String getRemainingFee() {
    return remainingFee;
  }
  public void setRemainingFee(String remainingFee) {
    this.remainingFee = remainingFee;
  }

  /**
   * 사용된 수수료
   **/
  @ApiModelProperty(value = "사용된 수수료")
  public String getPaidFee() {
    return paidFee;
  }
  public void setPaidFee(String paidFee) {
    this.paidFee = paidFee;
  }

  /**
   * 거래에 사용중인 비용
   **/
  @ApiModelProperty(value = "거래에 사용중인 비용")
  public String getLocked() {
    return locked;
  }
  public void setLocked(String locked) {
    this.locked = locked;
  }

  /**
   * 체결된 양
   **/
  @ApiModelProperty(value = "체결된 양")
  public String getExecutedVolume() {
    return executedVolume;
  }
  public void setExecutedVolume(String executedVolume) {
    this.executedVolume = executedVolume;
  }

  /**
   * 해당 주문에 걸린 체결 수
   **/
  @ApiModelProperty(value = "해당 주문에 걸린 체결 수")
  public BigDecimal getTradesCount() {
    return tradesCount;
  }
  public void setTradesCount(BigDecimal tradesCount) {
    this.tradesCount = tradesCount;
  }

  /**
   * 체결
   **/
  @ApiModelProperty(value = "체결")
  public List<Trade> getTrades() {
    return trades;
  }
  public void setTrades(List<Trade> trades) {
    this.trades = trades;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderInfo orderInfo = (OrderInfo) o;
    return (this.uuid == null ? orderInfo.uuid == null : this.uuid.equals(orderInfo.uuid)) &&
        (this.side == null ? orderInfo.side == null : this.side.equals(orderInfo.side)) &&
        (this.ordType == null ? orderInfo.ordType == null : this.ordType.equals(orderInfo.ordType)) &&
        (this.price == null ? orderInfo.price == null : this.price.equals(orderInfo.price)) &&
        (this.state == null ? orderInfo.state == null : this.state.equals(orderInfo.state)) &&
        (this.market == null ? orderInfo.market == null : this.market.equals(orderInfo.market)) &&
        (this.createdAt == null ? orderInfo.createdAt == null : this.createdAt.equals(orderInfo.createdAt)) &&
        (this.volume == null ? orderInfo.volume == null : this.volume.equals(orderInfo.volume)) &&
        (this.remainingVolume == null ? orderInfo.remainingVolume == null : this.remainingVolume.equals(orderInfo.remainingVolume)) &&
        (this.reservedFee == null ? orderInfo.reservedFee == null : this.reservedFee.equals(orderInfo.reservedFee)) &&
        (this.remainingFee == null ? orderInfo.remainingFee == null : this.remainingFee.equals(orderInfo.remainingFee)) &&
        (this.paidFee == null ? orderInfo.paidFee == null : this.paidFee.equals(orderInfo.paidFee)) &&
        (this.locked == null ? orderInfo.locked == null : this.locked.equals(orderInfo.locked)) &&
        (this.executedVolume == null ? orderInfo.executedVolume == null : this.executedVolume.equals(orderInfo.executedVolume)) &&
        (this.tradesCount == null ? orderInfo.tradesCount == null : this.tradesCount.equals(orderInfo.tradesCount)) &&
        (this.trades == null ? orderInfo.trades == null : this.trades.equals(orderInfo.trades));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.uuid == null ? 0: this.uuid.hashCode());
    result = 31 * result + (this.side == null ? 0: this.side.hashCode());
    result = 31 * result + (this.ordType == null ? 0: this.ordType.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.state == null ? 0: this.state.hashCode());
    result = 31 * result + (this.market == null ? 0: this.market.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.volume == null ? 0: this.volume.hashCode());
    result = 31 * result + (this.remainingVolume == null ? 0: this.remainingVolume.hashCode());
    result = 31 * result + (this.reservedFee == null ? 0: this.reservedFee.hashCode());
    result = 31 * result + (this.remainingFee == null ? 0: this.remainingFee.hashCode());
    result = 31 * result + (this.paidFee == null ? 0: this.paidFee.hashCode());
    result = 31 * result + (this.locked == null ? 0: this.locked.hashCode());
    result = 31 * result + (this.executedVolume == null ? 0: this.executedVolume.hashCode());
    result = 31 * result + (this.tradesCount == null ? 0: this.tradesCount.hashCode());
    result = 31 * result + (this.trades == null ? 0: this.trades.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderInfo {\n");
    
    sb.append("  uuid: ").append(uuid).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  ordType: ").append(ordType).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  market: ").append(market).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  volume: ").append(volume).append("\n");
    sb.append("  remainingVolume: ").append(remainingVolume).append("\n");
    sb.append("  reservedFee: ").append(reservedFee).append("\n");
    sb.append("  remainingFee: ").append(remainingFee).append("\n");
    sb.append("  paidFee: ").append(paidFee).append("\n");
    sb.append("  locked: ").append(locked).append("\n");
    sb.append("  executedVolume: ").append(executedVolume).append("\n");
    sb.append("  tradesCount: ").append(tradesCount).append("\n");
    sb.append("  trades: ").append(trades).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
