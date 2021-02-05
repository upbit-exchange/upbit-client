/**
 * Upbit Open API
 * ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: ujhin942@gmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator 2.4.18.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * CandleApi.h
 *
 * 
 */

#ifndef IO_SWAGGER_CLIENT_API_CandleApi_H_
#define IO_SWAGGER_CLIENT_API_CandleApi_H_


#include "../ApiClient.h"

#include "Error.h"
#include "Object.h"
#include <cpprest/details/basic_types.h>

#include <boost/optional.hpp>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  CandleApi
{
public:
    CandleApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~CandleApi();
    /// <summary>
    /// 시세 캔들 조회 (일 단위)
    /// </summary>
    /// <remarks>
    /// ## 일(Day) 캔들 
    /// </remarks>
    /// <param name="market">마켓 코드 (ex. KRW-BTC) </param>
    /// <param name="to">마지막 캔들 시각 (exclusive). 포맷 : &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX&#x60; or &#x60;yyyy-MM-dd HH:mm:ss&#x60;. 비워서 요청 시 가장 최근 캔들  (optional)</param>
    /// <param name="count">캔들 개수  (optional)</param>
    /// <param name="convertingPriceUnit">종가 환산 화폐 단위 (생략 가능, KRW로 명시할 시 원화 환산 가격을 반환.)  &#x60;convertingPriceUnit&#x60; 파라미터의 경우, 원화 마켓이 아닌 다른 마켓(ex. BTC, ETH)의 일봉 요청 시 종가를 명시된 파라미터 값으로 환산해 &#x60;converted_trade_price&#x60; 필드에 추가하여 반환합니다. 현재는 원화(&#x60;KRW&#x60;) 로 변환하는 기능만 제공하며 추후 기능을 확장할 수 있습니다.  (optional, default to KRW)</param>
    pplx::task<std::shared_ptr<Object>> candle_days(
        utility::string_t market,
        boost::optional<utility::string_t> to,
        boost::optional<double> count,
        boost::optional<utility::string_t> convertingPriceUnit
    );
    /// <summary>
    /// 시세 캔들 조회 (분 단위)
    /// </summary>
    /// <remarks>
    /// ## 분(Minute) 캔들 
    /// </remarks>
    /// <param name="unit">분 단위. 가능한 값 : 1, 3, 5, 15, 10, 30, 60, 240 </param>
    /// <param name="market">마켓 코드 (ex. KRW-BTC) </param>
    /// <param name="to">마지막 캔들 시각 (exclusive). 포맷 : &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX&#x60; or &#x60;yyyy-MM-dd HH:mm:ss&#x60;. 비워서 요청 시 가장 최근 캔들  (optional)</param>
    /// <param name="count">캔들 개수 (최대 200개까지 요청 가능)  (optional)</param>
    pplx::task<std::shared_ptr<Object>> candle_minutes(
        int32_t unit,
        utility::string_t market,
        boost::optional<utility::string_t> to,
        boost::optional<double> count
    );
    /// <summary>
    /// 시세 캔들 조회 (월 단위)
    /// </summary>
    /// <remarks>
    /// ## 월(Month) 캔들 
    /// </remarks>
    /// <param name="market">마켓 코드 (ex. KRW-BTC) </param>
    /// <param name="to">마지막 캔들 시각 (exclusive). 포맷 : &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX&#x60; or &#x60;yyyy-MM-dd HH:mm:ss&#x60;. 비워서 요청 시 가장 최근 캔들  (optional)</param>
    /// <param name="count">캔들 개수  (optional)</param>
    pplx::task<std::shared_ptr<Object>> candle_month(
        utility::string_t market,
        boost::optional<utility::string_t> to,
        boost::optional<double> count
    );
    /// <summary>
    /// 시세 캔들 조회 (주 단위)
    /// </summary>
    /// <remarks>
    /// ## 주(Week) 캔들 
    /// </remarks>
    /// <param name="market">마켓 코드 (ex. KRW-BTC) </param>
    /// <param name="to">마지막 캔들 시각 (exclusive). 포맷 : &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ssXXX&#x60; or &#x60;yyyy-MM-dd HH:mm:ss&#x60;. 비워서 요청 시 가장 최근 캔들  (optional)</param>
    /// <param name="count">캔들 개수  (optional)</param>
    pplx::task<std::shared_ptr<Object>> candle_weeks(
        utility::string_t market,
        boost::optional<utility::string_t> to,
        boost::optional<double> count
    );

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* IO_SWAGGER_CLIENT_API_CandleApi_H_ */

