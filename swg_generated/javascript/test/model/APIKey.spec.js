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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.UpbitOpenApi);
  }
}(this, function(expect, UpbitOpenApi) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('APIKey', function() {
      beforeEach(function() {
        instance = new UpbitOpenApi.APIKey();
      });

      it('should create an instance of APIKey', function() {
        // TODO: update the code to test APIKey
        expect(instance).to.be.a(UpbitOpenApi.APIKey);
      });

      it('should have the property accessKey (base name: "access_key")', function() {
        // TODO: update the code to test the property accessKey
        expect(instance).to.have.property('accessKey');
        // expect(instance.accessKey).to.be(expectedValueLiteral);
      });

      it('should have the property expireAt (base name: "expire_at")', function() {
        // TODO: update the code to test the property expireAt
        expect(instance).to.have.property('expireAt');
        // expect(instance.expireAt).to.be(expectedValueLiteral);
      });

    });
  });

}));
