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
    define(['ApiClient', 'model/Account', 'model/Error', 'model/Wallet'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Account'), require('../model/Error'), require('../model/Wallet'));
  } else {
    // Browser globals (root is window)
    if (!root.UpbitOpenApi) {
      root.UpbitOpenApi = {};
    }
    root.UpbitOpenApi.AccountApi = factory(root.UpbitOpenApi.ApiClient, root.UpbitOpenApi.Account, root.UpbitOpenApi.Error, root.UpbitOpenApi.Wallet);
  }
}(this, function(ApiClient, Account, Error, Wallet) {
  'use strict';

  /**
   * Account service.
   * @module api/AccountApi
   * @version 1.0.0
   */

  /**
   * Constructs a new AccountApi. 
   * @alias module:api/AccountApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the accountInfo operation.
     * @callback module:api/AccountApi~accountInfoCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Account>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * 전체 계좌 조회
     * ## 내가 보유한 자산 리스트를 보여줍니다. 
     * @param {module:api/AccountApi~accountInfoCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Account>}
     */
    this.accountInfo = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['Bearer'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [Account];

      return this.apiClient.callApi(
        '/accounts', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the accountWallet operation.
     * @callback module:api/AccountApi~accountWalletCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Wallet>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * 입출금 현황
     * ## 입출금 현황 및 블록 상태를 조회합니다. **NOTE**: 입출금 현황 데이터는 실제 서비스 상태와 다를 수 있습니다. 입출금 현황 API에서 제공하는 입출금 상태, 블록 상태 정보는 수 분 정도 지연되어 반영될 수 있습니다. 본 API는 참고용으로만 사용하시길 바라며 실제 입출금을 수행하기 전에는 반드시 업비트 공지사항 및 입출금 현황 페이지를 참고해주시기 바랍니다. 
     * @param {module:api/AccountApi~accountWalletCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Wallet>}
     */
    this.accountWallet = function(callback) {
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['Bearer'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [Wallet];

      return this.apiClient.callApi(
        '/status/wallet', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
