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

/**
 * 사용자의 계좌 정보
 */
@ApiModel(description = "사용자의 계좌 정보")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-05T03:34:59.277Z")
public class Account {
  @SerializedName("currency")
  private String currency = null;

  @SerializedName("balance")
  private String balance = null;

  @SerializedName("locked")
  private String locked = null;

  @SerializedName("avg_buy_price")
  private String avgBuyPrice = null;

  @SerializedName("avg_buy_price_modified")
  private Boolean avgBuyPriceModified = null;

  @SerializedName("unit_currency")
  private String unitCurrency = null;

  public Account currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * 화폐를 의미하는 영문 대문자 코드
   * @return currency
  **/
  @ApiModelProperty(example = "KRW", value = "화폐를 의미하는 영문 대문자 코드")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Account balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * 주문가능 금액/수량
   * @return balance
  **/
  @ApiModelProperty(example = "1000000", value = "주문가능 금액/수량")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public Account locked(String locked) {
    this.locked = locked;
    return this;
  }

   /**
   * 주문 중 묶여있는 금액/수량
   * @return locked
  **/
  @ApiModelProperty(example = "0", value = "주문 중 묶여있는 금액/수량")
  public String getLocked() {
    return locked;
  }

  public void setLocked(String locked) {
    this.locked = locked;
  }

  public Account avgBuyPrice(String avgBuyPrice) {
    this.avgBuyPrice = avgBuyPrice;
    return this;
  }

   /**
   * 매수평균가
   * @return avgBuyPrice
  **/
  @ApiModelProperty(example = "101000", value = "매수평균가")
  public String getAvgBuyPrice() {
    return avgBuyPrice;
  }

  public void setAvgBuyPrice(String avgBuyPrice) {
    this.avgBuyPrice = avgBuyPrice;
  }

  public Account avgBuyPriceModified(Boolean avgBuyPriceModified) {
    this.avgBuyPriceModified = avgBuyPriceModified;
    return this;
  }

   /**
   * 매수평균가 수정 여부
   * @return avgBuyPriceModified
  **/
  @ApiModelProperty(example = "false", value = "매수평균가 수정 여부")
  public Boolean isAvgBuyPriceModified() {
    return avgBuyPriceModified;
  }

  public void setAvgBuyPriceModified(Boolean avgBuyPriceModified) {
    this.avgBuyPriceModified = avgBuyPriceModified;
  }

  public Account unitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
    return this;
  }

   /**
   * 평단가 기준 화폐
   * @return unitCurrency
  **/
  @ApiModelProperty(example = "KRW", value = "평단가 기준 화폐")
  public String getUnitCurrency() {
    return unitCurrency;
  }

  public void setUnitCurrency(String unitCurrency) {
    this.unitCurrency = unitCurrency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.currency, account.currency) &&
        Objects.equals(this.balance, account.balance) &&
        Objects.equals(this.locked, account.locked) &&
        Objects.equals(this.avgBuyPrice, account.avgBuyPrice) &&
        Objects.equals(this.avgBuyPriceModified, account.avgBuyPriceModified) &&
        Objects.equals(this.unitCurrency, account.unitCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, balance, locked, avgBuyPrice, avgBuyPriceModified, unitCurrency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    avgBuyPrice: ").append(toIndentedString(avgBuyPrice)).append("\n");
    sb.append("    avgBuyPriceModified: ").append(toIndentedString(avgBuyPriceModified)).append("\n");
    sb.append("    unitCurrency: ").append(toIndentedString(unitCurrency)).append("\n");
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

