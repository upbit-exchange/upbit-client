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

/**
 * 사용자의 보안등급 정보
 **/
@ApiModel(description = "사용자의 보안등급 정보")
public class MemberLevel {
  
  @SerializedName("security_level")
  private BigDecimal securityLevel = null;
  @SerializedName("fee_level")
  private BigDecimal feeLevel = null;
  @SerializedName("email_verified")
  private Boolean emailVerified = null;
  @SerializedName("identity_auth_verified")
  private Boolean identityAuthVerified = null;
  @SerializedName("bank_account_verified")
  private Boolean bankAccountVerified = null;
  @SerializedName("kakao_pay_auth_verified")
  private Boolean kakaoPayAuthVerified = null;
  @SerializedName("locked")
  private Boolean locked = null;
  @SerializedName("wallet_locked")
  private Boolean walletLocked = null;

  /**
   * 사용자의 보안 등급
   **/
  @ApiModelProperty(value = "사용자의 보안 등급")
  public BigDecimal getSecurityLevel() {
    return securityLevel;
  }
  public void setSecurityLevel(BigDecimal securityLevel) {
    this.securityLevel = securityLevel;
  }

  /**
   * 사용자의 수수료 등급
   **/
  @ApiModelProperty(value = "사용자의 수수료 등급")
  public BigDecimal getFeeLevel() {
    return feeLevel;
  }
  public void setFeeLevel(BigDecimal feeLevel) {
    this.feeLevel = feeLevel;
  }

  /**
   * 사용자의 이메일 인증 여부
   **/
  @ApiModelProperty(value = "사용자의 이메일 인증 여부")
  public Boolean getEmailVerified() {
    return emailVerified;
  }
  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  /**
   * 사용자의 실명 인증 여부
   **/
  @ApiModelProperty(value = "사용자의 실명 인증 여부")
  public Boolean getIdentityAuthVerified() {
    return identityAuthVerified;
  }
  public void setIdentityAuthVerified(Boolean identityAuthVerified) {
    this.identityAuthVerified = identityAuthVerified;
  }

  /**
   * 사용자의 계좌 인증 여부
   **/
  @ApiModelProperty(value = "사용자의 계좌 인증 여부")
  public Boolean getBankAccountVerified() {
    return bankAccountVerified;
  }
  public void setBankAccountVerified(Boolean bankAccountVerified) {
    this.bankAccountVerified = bankAccountVerified;
  }

  /**
   * 사용자의 카카오페이 인증 여부
   **/
  @ApiModelProperty(value = "사용자의 카카오페이 인증 여부")
  public Boolean getKakaoPayAuthVerified() {
    return kakaoPayAuthVerified;
  }
  public void setKakaoPayAuthVerified(Boolean kakaoPayAuthVerified) {
    this.kakaoPayAuthVerified = kakaoPayAuthVerified;
  }

  /**
   * 사용자의 계정 보호 상태
   **/
  @ApiModelProperty(value = "사용자의 계정 보호 상태")
  public Boolean getLocked() {
    return locked;
  }
  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  /**
   * 사용자의 출금 보호 상태
   **/
  @ApiModelProperty(value = "사용자의 출금 보호 상태")
  public Boolean getWalletLocked() {
    return walletLocked;
  }
  public void setWalletLocked(Boolean walletLocked) {
    this.walletLocked = walletLocked;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberLevel memberLevel = (MemberLevel) o;
    return (this.securityLevel == null ? memberLevel.securityLevel == null : this.securityLevel.equals(memberLevel.securityLevel)) &&
        (this.feeLevel == null ? memberLevel.feeLevel == null : this.feeLevel.equals(memberLevel.feeLevel)) &&
        (this.emailVerified == null ? memberLevel.emailVerified == null : this.emailVerified.equals(memberLevel.emailVerified)) &&
        (this.identityAuthVerified == null ? memberLevel.identityAuthVerified == null : this.identityAuthVerified.equals(memberLevel.identityAuthVerified)) &&
        (this.bankAccountVerified == null ? memberLevel.bankAccountVerified == null : this.bankAccountVerified.equals(memberLevel.bankAccountVerified)) &&
        (this.kakaoPayAuthVerified == null ? memberLevel.kakaoPayAuthVerified == null : this.kakaoPayAuthVerified.equals(memberLevel.kakaoPayAuthVerified)) &&
        (this.locked == null ? memberLevel.locked == null : this.locked.equals(memberLevel.locked)) &&
        (this.walletLocked == null ? memberLevel.walletLocked == null : this.walletLocked.equals(memberLevel.walletLocked));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.securityLevel == null ? 0: this.securityLevel.hashCode());
    result = 31 * result + (this.feeLevel == null ? 0: this.feeLevel.hashCode());
    result = 31 * result + (this.emailVerified == null ? 0: this.emailVerified.hashCode());
    result = 31 * result + (this.identityAuthVerified == null ? 0: this.identityAuthVerified.hashCode());
    result = 31 * result + (this.bankAccountVerified == null ? 0: this.bankAccountVerified.hashCode());
    result = 31 * result + (this.kakaoPayAuthVerified == null ? 0: this.kakaoPayAuthVerified.hashCode());
    result = 31 * result + (this.locked == null ? 0: this.locked.hashCode());
    result = 31 * result + (this.walletLocked == null ? 0: this.walletLocked.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberLevel {\n");
    
    sb.append("  securityLevel: ").append(securityLevel).append("\n");
    sb.append("  feeLevel: ").append(feeLevel).append("\n");
    sb.append("  emailVerified: ").append(emailVerified).append("\n");
    sb.append("  identityAuthVerified: ").append(identityAuthVerified).append("\n");
    sb.append("  bankAccountVerified: ").append(bankAccountVerified).append("\n");
    sb.append("  kakaoPayAuthVerified: ").append(kakaoPayAuthVerified).append("\n");
    sb.append("  locked: ").append(locked).append("\n");
    sb.append("  walletLocked: ").append(walletLocked).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
