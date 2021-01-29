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
 * 매수 시 제약사항
 */
@ApiModel(description = "매수 시 제약사항")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-01-25T00:42:40.509Z")
public class Bid {
  @SerializedName("currency")
  private String currency = null;

  @SerializedName("price_unit")
  private String priceUnit = null;

  @SerializedName("min_total")
  private BigDecimal minTotal = null;

  public Bid currency(String currency) {
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

  public Bid priceUnit(String priceUnit) {
    this.priceUnit = priceUnit;
    return this;
  }

   /**
   * 주문금액 단위
   * @return priceUnit
  **/
  @ApiModelProperty(value = "주문금액 단위")
  public String getPriceUnit() {
    return priceUnit;
  }

  public void setPriceUnit(String priceUnit) {
    this.priceUnit = priceUnit;
  }

  public Bid minTotal(BigDecimal minTotal) {
    this.minTotal = minTotal;
    return this;
  }

   /**
   * 최소 매도/매수 금액
   * @return minTotal
  **/
  @ApiModelProperty(example = "1000.0", value = "최소 매도/매수 금액")
  public BigDecimal getMinTotal() {
    return minTotal;
  }

  public void setMinTotal(BigDecimal minTotal) {
    this.minTotal = minTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bid bid = (Bid) o;
    return Objects.equals(this.currency, bid.currency) &&
        Objects.equals(this.priceUnit, bid.priceUnit) &&
        Objects.equals(this.minTotal, bid.minTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, priceUnit, minTotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bid {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    priceUnit: ").append(toIndentedString(priceUnit)).append("\n");
    sb.append("    minTotal: ").append(toIndentedString(minTotal)).append("\n");
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

