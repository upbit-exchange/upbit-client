/*
 * Upbit Open API
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.18
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.UpbitOpenApi) {
      root.UpbitOpenApi = {};
    }
    root.UpbitOpenApi.TradeTicks = factory(root.UpbitOpenApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The TradeTicks model module.
   * @module model/TradeTicks
   * @version 1.0.0
   */

  /**
   * Constructs a new <code>TradeTicks</code>.
   * @alias module:model/TradeTicks
   * @class
   */
  var exports = function() {
  };

  /**
   * Constructs a <code>TradeTicks</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TradeTicks} obj Optional instance to populate.
   * @return {module:model/TradeTicks} The populated <code>TradeTicks</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('market'))
        obj.market = ApiClient.convertToType(data['market'], 'String');
      if (data.hasOwnProperty('trade_date_utc'))
        obj.tradeDateUtc = ApiClient.convertToType(data['trade_date_utc'], 'String');
      if (data.hasOwnProperty('trade_time_utc'))
        obj.tradeTimeUtc = ApiClient.convertToType(data['trade_time_utc'], 'String');
      if (data.hasOwnProperty('timestamp'))
        obj.timestamp = ApiClient.convertToType(data['timestamp'], 'Number');
      if (data.hasOwnProperty('trade_price'))
        obj.tradePrice = ApiClient.convertToType(data['trade_price'], 'Number');
      if (data.hasOwnProperty('trade_volume'))
        obj.tradeVolume = ApiClient.convertToType(data['trade_volume'], 'Number');
      if (data.hasOwnProperty('prev_closing_price'))
        obj.prevClosingPrice = ApiClient.convertToType(data['prev_closing_price'], 'Number');
      if (data.hasOwnProperty('change_price'))
        obj.changePrice = ApiClient.convertToType(data['change_price'], 'Number');
      if (data.hasOwnProperty('ask_bid'))
        obj.askBid = ApiClient.convertToType(data['ask_bid'], 'String');
      if (data.hasOwnProperty('sequential_id'))
        obj.sequentialId = ApiClient.convertToType(data['sequential_id'], 'Number');
    }
    return obj;
  }

  /**
   * 마켓 구분 코드
   * @member {String} market
   */
  exports.prototype.market = undefined;

  /**
   * 체결 일자 (UTC 기준)
   * @member {String} tradeDateUtc
   */
  exports.prototype.tradeDateUtc = undefined;

  /**
   * 체결 시각 (UTC 기준)
   * @member {String} tradeTimeUtc
   */
  exports.prototype.tradeTimeUtc = undefined;

  /**
   * 체결 타임스탬프
   * @member {Number} timestamp
   */
  exports.prototype.timestamp = undefined;

  /**
   * 체결 가격
   * @member {Number} tradePrice
   */
  exports.prototype.tradePrice = undefined;

  /**
   * 체결량
   * @member {Number} tradeVolume
   */
  exports.prototype.tradeVolume = undefined;

  /**
   * 전일 종가
   * @member {Number} prevClosingPrice
   */
  exports.prototype.prevClosingPrice = undefined;

  /**
   * 변화량
   * @member {Number} changePrice
   */
  exports.prototype.changePrice = undefined;

  /**
   * 매도/매수
   * @member {String} askBid
   */
  exports.prototype.askBid = undefined;

  /**
   * 체결 번호 (Unique) `sequential_id` 필드는 체결의 유일성 판단을 위한 근거로 쓰일 수 있습니다. 하지만 체결의 순서를 보장하지는 못합니다. 
   * @member {Number} sequentialId
   */
  exports.prototype.sequentialId = undefined;


  return exports;

}));
