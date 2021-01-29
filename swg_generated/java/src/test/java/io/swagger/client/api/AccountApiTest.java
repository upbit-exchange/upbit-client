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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Account;
import io.swagger.client.model.Error;
import io.swagger.client.model.Wallet;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApi
 */
@Ignore
public class AccountApiTest {

    private final AccountApi api = new AccountApi();

    
    /**
     * 전체 계좌 조회
     *
     * ## 내가 보유한 자산 리스트를 보여줍니다. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountInfoTest() throws ApiException {
        List<Account> response = api.accountInfo();

        // TODO: test validations
    }
    
    /**
     * 입출금 현황
     *
     * ## 입출금 현황 및 블록 상태를 조회합니다. **NOTE**: 입출금 현황 데이터는 실제 서비스 상태와 다를 수 있습니다. 입출금 현황 API에서 제공하는 입출금 상태, 블록 상태 정보는 수 분 정도 지연되어 반영될 수 있습니다. 본 API는 참고용으로만 사용하시길 바라며 실제 입출금을 수행하기 전에는 반드시 업비트 공지사항 및 입출금 현황 페이지를 참고해주시기 바랍니다. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void accountWalletTest() throws ApiException {
        List<Wallet> response = api.accountWallet();

        // TODO: test validations
    }
    
}
