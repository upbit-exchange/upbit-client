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

package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.Error
import io.swagger.client.model.NewOrder
import io.swagger.client.model.Number
import io.swagger.client.model.Order
import io.swagger.client.model.OrderChance
import io.swagger.client.model.OrderInfo
import io.swagger.client.model.Orderbook
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class OrderApi(
  val defBasePath: String = "https://api.upbit.com/v1",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new OrderApiAsyncHelper(client, config)

  /**
   * 주문 취소 접수
   * ## 주문 UUID를 통해 해당 주문에 대한 취소 접수를 한다.  **NOTE**: &#x60;uuid&#x60; 혹은 &#x60;identifier&#x60; 둘 중 하나의 값이 반드시 포함되어야 합니다. 
   *
   * @param uuid 취소할 주문의 UUID  (optional)
   * @param identifier 조회용 사용자 지정 값  (optional)
   * @return Order
   */
  def orderCancel(uuid: Option[String] = None, identifier: Option[String] = None): Option[Order] = {
    val await = Try(Await.result(orderCancelAsync(uuid, identifier), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 주문 취소 접수 asynchronously
   * ## 주문 UUID를 통해 해당 주문에 대한 취소 접수를 한다.  **NOTE**: &#x60;uuid&#x60; 혹은 &#x60;identifier&#x60; 둘 중 하나의 값이 반드시 포함되어야 합니다. 
   *
   * @param uuid 취소할 주문의 UUID  (optional)
   * @param identifier 조회용 사용자 지정 값  (optional)
   * @return Future(Order)
   */
  def orderCancelAsync(uuid: Option[String] = None, identifier: Option[String] = None): Future[Order] = {
      helper.orderCancel(uuid, identifier)
  }

  /**
   * 주문 가능 정보
   * ## 마켓별 주문 가능 정보를 확인한다. 
   *
   * @param market Market ID  
   * @return OrderChance
   */
  def orderChance(market: String): Option[OrderChance] = {
    val await = Try(Await.result(orderChanceAsync(market), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 주문 가능 정보 asynchronously
   * ## 마켓별 주문 가능 정보를 확인한다. 
   *
   * @param market Market ID  
   * @return Future(OrderChance)
   */
  def orderChanceAsync(market: String): Future[OrderChance] = {
      helper.orderChance(market)
  }

  /**
   * 개별 주문 조회
   * ## 주문 UUID를 통해 개별 주문건을 조회한다.  **NOTE**: &#x60;uuid&#x60; 혹은 &#x60;identifier&#x60; 둘 중 하나의 값이 반드시 포함되어야 합니다. 
   *
   * @param uuid 주문 UUID  (optional)
   * @param identifier 조회용 사용자 지정 값  (optional)
   * @return OrderInfo
   */
  def orderInfo(uuid: Option[String] = None, identifier: Option[String] = None): Option[OrderInfo] = {
    val await = Try(Await.result(orderInfoAsync(uuid, identifier), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 개별 주문 조회 asynchronously
   * ## 주문 UUID를 통해 개별 주문건을 조회한다.  **NOTE**: &#x60;uuid&#x60; 혹은 &#x60;identifier&#x60; 둘 중 하나의 값이 반드시 포함되어야 합니다. 
   *
   * @param uuid 주문 UUID  (optional)
   * @param identifier 조회용 사용자 지정 값  (optional)
   * @return Future(OrderInfo)
   */
  def orderInfoAsync(uuid: Option[String] = None, identifier: Option[String] = None): Future[OrderInfo] = {
      helper.orderInfo(uuid, identifier)
  }

  /**
   * 주문 리스트 조회
   * ## 주문 리스트를 조회한다. 
   *
   * @param market 마켓 아이디  (optional)
   * @param state 주문 상태   - wait : 체결 대기 (default)   - done : 전체 체결 완료   - cancel : 주문 취소  (optional)
   * @param states 주문 상태의 목록  (optional)
   * @param uuids 주문 UUID의 목록  (optional)
   * @param identifiers 주문 identifier의 목록  (optional)
   * @param page 페이지 수, default: 1  (optional)
   * @param limit 요청 개수, default: 100  (optional)
   * @param orderBy 정렬 방식 - asc : 오름차순 - desc : 내림차순 (default)  (optional)
   * @return List[Order]
   */
  def orderInfoAll(market: Option[String] = None, state: Option[String] = None, states: Option[List[String]] = None, uuids: Option[List[String]] = None, identifiers: Option[List[String]] = None, page: Option[Number] = None, limit: Option[Number] = None, orderBy: Option[String] = None): Option[List[Order]] = {
    val await = Try(Await.result(orderInfoAllAsync(market, state, states, uuids, identifiers, page, limit, orderBy), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 주문 리스트 조회 asynchronously
   * ## 주문 리스트를 조회한다. 
   *
   * @param market 마켓 아이디  (optional)
   * @param state 주문 상태   - wait : 체결 대기 (default)   - done : 전체 체결 완료   - cancel : 주문 취소  (optional)
   * @param states 주문 상태의 목록  (optional)
   * @param uuids 주문 UUID의 목록  (optional)
   * @param identifiers 주문 identifier의 목록  (optional)
   * @param page 페이지 수, default: 1  (optional)
   * @param limit 요청 개수, default: 100  (optional)
   * @param orderBy 정렬 방식 - asc : 오름차순 - desc : 내림차순 (default)  (optional)
   * @return Future(List[Order])
   */
  def orderInfoAllAsync(market: Option[String] = None, state: Option[String] = None, states: Option[List[String]] = None, uuids: Option[List[String]] = None, identifiers: Option[List[String]] = None, page: Option[Number] = None, limit: Option[Number] = None, orderBy: Option[String] = None): Future[List[Order]] = {
      helper.orderInfoAll(market, state, states, uuids, identifiers, page, limit, orderBy)
  }

  /**
   * 주문하기
   * ## 주문 요청을 한다.  **NOTE**: 원화 마켓 가격 단위를 확인하세요.  원화 마켓에서 주문을 요청 할 경우, [원화 마켓 주문 가격 단위](https://docs.upbit.com/docs/market-info-trade-price-detail)를 확인하여 값을 입력해주세요.  **NOTE**: identifier 파라미터 사용  &#x60;identifier&#x60;는 서비스에서 발급하는 &#x60;uuid&#x60;가 아닌 이용자가 직접 발급하는 키값으로, 주문을 조회하기 위해 할당하는 값입니다. 해당 값은 사용자의 전체 주문 내 유일한 값을 전달해야하며, 비록 주문 요청시 오류가 발생하더라도 같은 값으로 다시 요청을 보낼 수 없습니다.  주문의 성공 / 실패 여부와 관계없이 중복해서 들어온 &#x60;identifier&#x60; 값에서는 중복 오류가 발생하니, 매 요청시 새로운 값을 생성해주세요.  **NOTE**: 시장가 주문  시장가 주문은 &#x60;ord_type&#x60; 필드를 &#x60;price&#x60; or &#x60;market&#x60; 으로 설정해야됩니다. 매수 주문의 경우 &#x60;ord_type&#x60;을 &#x60;price&#x60;로 설정하고 &#x60;volume&#x60;을 &#x60;null&#x60; 혹은 제외해야됩니다. 매도 주문의 경우 &#x60;ord_type&#x60;을 &#x60;market&#x60;로 설정하고 &#x60;price&#x60;을 &#x60;null&#x60; 혹은 제외해야됩니다. 
   *
   * @param market 마켓 ID (필수)  
   * @param side 주문 종류 (필수) - bid : 매수 - ask : 매도  
   * @param ordType 주문 타입 (필수) - limit : 지정가 주문 - price : 시장가 주문(매수) - market : 시장가 주문(매도)  
   * @param volume 주문량 (지정가, 시장가 매도 시 필수)  (optional, default to null)
   * @param price 주문 가격. (지정가, 시장가 매수 시 필수)  ex) KRW-BTC 마켓에서 1BTC당 1,000 KRW로 거래할 경우, 값은 1000 이 된다. ex) KRW-BTC 마켓에서 1BTC당 매도 1호가가 500 KRW 인 경우, 시장가 매수 시 값을 1000으로 세팅하면 2BTC가 매수된다. (수수료가 존재하거나 매도 1호가의 수량에 따라 상이할 수 있음)  (optional, default to null)
   * @param identifier 조회용 사용자 지정값 (선택)  (optional)
   * @return NewOrder
   */
  def orderNew(market: String, side: String, ordType: String, volume: Option[String] = Option("null"), price: Option[String] = Option("null"), identifier: Option[String] = None): Option[NewOrder] = {
    val await = Try(Await.result(orderNewAsync(market, side, ordType, volume, price, identifier), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 주문하기 asynchronously
   * ## 주문 요청을 한다.  **NOTE**: 원화 마켓 가격 단위를 확인하세요.  원화 마켓에서 주문을 요청 할 경우, [원화 마켓 주문 가격 단위](https://docs.upbit.com/docs/market-info-trade-price-detail)를 확인하여 값을 입력해주세요.  **NOTE**: identifier 파라미터 사용  &#x60;identifier&#x60;는 서비스에서 발급하는 &#x60;uuid&#x60;가 아닌 이용자가 직접 발급하는 키값으로, 주문을 조회하기 위해 할당하는 값입니다. 해당 값은 사용자의 전체 주문 내 유일한 값을 전달해야하며, 비록 주문 요청시 오류가 발생하더라도 같은 값으로 다시 요청을 보낼 수 없습니다.  주문의 성공 / 실패 여부와 관계없이 중복해서 들어온 &#x60;identifier&#x60; 값에서는 중복 오류가 발생하니, 매 요청시 새로운 값을 생성해주세요.  **NOTE**: 시장가 주문  시장가 주문은 &#x60;ord_type&#x60; 필드를 &#x60;price&#x60; or &#x60;market&#x60; 으로 설정해야됩니다. 매수 주문의 경우 &#x60;ord_type&#x60;을 &#x60;price&#x60;로 설정하고 &#x60;volume&#x60;을 &#x60;null&#x60; 혹은 제외해야됩니다. 매도 주문의 경우 &#x60;ord_type&#x60;을 &#x60;market&#x60;로 설정하고 &#x60;price&#x60;을 &#x60;null&#x60; 혹은 제외해야됩니다. 
   *
   * @param market 마켓 ID (필수)  
   * @param side 주문 종류 (필수) - bid : 매수 - ask : 매도  
   * @param ordType 주문 타입 (필수) - limit : 지정가 주문 - price : 시장가 주문(매수) - market : 시장가 주문(매도)  
   * @param volume 주문량 (지정가, 시장가 매도 시 필수)  (optional, default to null)
   * @param price 주문 가격. (지정가, 시장가 매수 시 필수)  ex) KRW-BTC 마켓에서 1BTC당 1,000 KRW로 거래할 경우, 값은 1000 이 된다. ex) KRW-BTC 마켓에서 1BTC당 매도 1호가가 500 KRW 인 경우, 시장가 매수 시 값을 1000으로 세팅하면 2BTC가 매수된다. (수수료가 존재하거나 매도 1호가의 수량에 따라 상이할 수 있음)  (optional, default to null)
   * @param identifier 조회용 사용자 지정값 (선택)  (optional)
   * @return Future(NewOrder)
   */
  def orderNewAsync(market: String, side: String, ordType: String, volume: Option[String] = Option("null"), price: Option[String] = Option("null"), identifier: Option[String] = None): Future[NewOrder] = {
      helper.orderNew(market, side, ordType, volume, price, identifier)
  }

  /**
   * 시세 호가 정보(Orderbook) 조회
   * ## 호가 정보 조회 
   *
   * @param markets 마켓 코드 목록 (ex. KRW-BTC,KRW-ADA)  
   * @return List[Orderbook]
   */
  def orderOrderbook(markets: List[String]): Option[List[Orderbook]] = {
    val await = Try(Await.result(orderOrderbookAsync(markets), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * 시세 호가 정보(Orderbook) 조회 asynchronously
   * ## 호가 정보 조회 
   *
   * @param markets 마켓 코드 목록 (ex. KRW-BTC,KRW-ADA)  
   * @return Future(List[Orderbook])
   */
  def orderOrderbookAsync(markets: List[String]): Future[List[Orderbook]] = {
      helper.orderOrderbook(markets)
  }

}

class OrderApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def orderCancel(uuid: Option[String] = None,
    identifier: Option[String] = None
    )(implicit reader: ClientResponseReader[Order]): Future[Order] = {
    // create path and map variables
    val path = (addFmt("/order"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    uuid match {
      case Some(param) => queryParams += "uuid" -> param.toString
      case _ => queryParams
    }
    identifier match {
      case Some(param) => queryParams += "identifier" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def orderChance(market: String)(implicit reader: ClientResponseReader[OrderChance]): Future[OrderChance] = {
    // create path and map variables
    val path = (addFmt("/orders/chance"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (market == null) throw new Exception("Missing required parameter 'market' when calling OrderApi->orderChance")

    queryParams += "market" -> market.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def orderInfo(uuid: Option[String] = None,
    identifier: Option[String] = None
    )(implicit reader: ClientResponseReader[OrderInfo]): Future[OrderInfo] = {
    // create path and map variables
    val path = (addFmt("/order"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    uuid match {
      case Some(param) => queryParams += "uuid" -> param.toString
      case _ => queryParams
    }
    identifier match {
      case Some(param) => queryParams += "identifier" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def orderInfoAll(market: Option[String] = None,
    state: Option[String] = None,
    states: Option[List[String]] = None,
    uuids: Option[List[String]] = None,
    identifiers: Option[List[String]] = None,
    page: Option[Number] = None,
    limit: Option[Number] = None,
    orderBy: Option[String] = None
    )(implicit reader: ClientResponseReader[List[Order]]): Future[List[Order]] = {
    // create path and map variables
    val path = (addFmt("/orders"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    market match {
      case Some(param) => queryParams += "market" -> param.toString
      case _ => queryParams
    }
    state match {
      case Some(param) => queryParams += "state" -> param.toString
      case _ => queryParams
    }
    states match {
      case Some(param) => queryParams += "states" -> param.toString
      case _ => queryParams
    }
    uuids match {
      case Some(param) => queryParams += "uuids" -> param.toString
      case _ => queryParams
    }
    identifiers match {
      case Some(param) => queryParams += "identifiers" -> param.toString
      case _ => queryParams
    }
    page match {
      case Some(param) => queryParams += "page" -> param.toString
      case _ => queryParams
    }
    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }
    orderBy match {
      case Some(param) => queryParams += "order_by" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def orderNew(market: String,
    side: String,
    ordType: String,
    volume: Option[String] = Option("null"),
    price: Option[String] = Option("null"),
    identifier: Option[String] = None
    )(implicit reader: ClientResponseReader[NewOrder]): Future[NewOrder] = {
    // create path and map variables
    val path = (addFmt("/orders"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (market == null) throw new Exception("Missing required parameter 'market' when calling OrderApi->orderNew")

    if (side == null) throw new Exception("Missing required parameter 'side' when calling OrderApi->orderNew")

    if (ordType == null) throw new Exception("Missing required parameter 'ordType' when calling OrderApi->orderNew")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def orderOrderbook(markets: List[String])(implicit reader: ClientResponseReader[List[Orderbook]]): Future[List[Orderbook]] = {
    // create path and map variables
    val path = (addFmt("/orderbook"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (markets == null) throw new Exception("Missing required parameter 'markets' when calling OrderApi->orderOrderbook")
    queryParams += "markets" -> markets.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
