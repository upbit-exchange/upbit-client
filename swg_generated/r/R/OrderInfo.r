# Upbit Open API
#
# ## REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 
#
# OpenAPI spec version: 1.0.0
# Contact: ujhin942@gmail.com
# Generated by: https://github.com/swagger-api/swagger-codegen.git


#' OrderInfo Class
#'
#' @field uuid 
#' @field side 
#' @field ord_type 
#' @field price 
#' @field state 
#' @field market 
#' @field created_at 
#' @field volume 
#' @field remaining_volume 
#' @field reserved_fee 
#' @field remaining_fee 
#' @field paid_fee 
#' @field locked 
#' @field executed_volume 
#' @field trades_count 
#' @field trades 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
OrderInfo <- R6::R6Class(
  'OrderInfo',
  public = list(
    `uuid` = NULL,
    `side` = NULL,
    `ord_type` = NULL,
    `price` = NULL,
    `state` = NULL,
    `market` = NULL,
    `created_at` = NULL,
    `volume` = NULL,
    `remaining_volume` = NULL,
    `reserved_fee` = NULL,
    `remaining_fee` = NULL,
    `paid_fee` = NULL,
    `locked` = NULL,
    `executed_volume` = NULL,
    `trades_count` = NULL,
    `trades` = NULL,
    initialize = function(`uuid`, `side`, `ord_type`, `price`, `state`, `market`, `created_at`, `volume`, `remaining_volume`, `reserved_fee`, `remaining_fee`, `paid_fee`, `locked`, `executed_volume`, `trades_count`, `trades`){
      if (!missing(`uuid`)) {
        stopifnot(is.character(`uuid`), length(`uuid`) == 1)
        self$`uuid` <- `uuid`
      }
      if (!missing(`side`)) {
        stopifnot(is.character(`side`), length(`side`) == 1)
        self$`side` <- `side`
      }
      if (!missing(`ord_type`)) {
        stopifnot(is.character(`ord_type`), length(`ord_type`) == 1)
        self$`ord_type` <- `ord_type`
      }
      if (!missing(`price`)) {
        stopifnot(is.character(`price`), length(`price`) == 1)
        self$`price` <- `price`
      }
      if (!missing(`state`)) {
        stopifnot(is.character(`state`), length(`state`) == 1)
        self$`state` <- `state`
      }
      if (!missing(`market`)) {
        stopifnot(is.character(`market`), length(`market`) == 1)
        self$`market` <- `market`
      }
      if (!missing(`created_at`)) {
        stopifnot(is.character(`created_at`), length(`created_at`) == 1)
        self$`created_at` <- `created_at`
      }
      if (!missing(`volume`)) {
        stopifnot(is.character(`volume`), length(`volume`) == 1)
        self$`volume` <- `volume`
      }
      if (!missing(`remaining_volume`)) {
        stopifnot(is.character(`remaining_volume`), length(`remaining_volume`) == 1)
        self$`remaining_volume` <- `remaining_volume`
      }
      if (!missing(`reserved_fee`)) {
        stopifnot(is.character(`reserved_fee`), length(`reserved_fee`) == 1)
        self$`reserved_fee` <- `reserved_fee`
      }
      if (!missing(`remaining_fee`)) {
        stopifnot(is.character(`remaining_fee`), length(`remaining_fee`) == 1)
        self$`remaining_fee` <- `remaining_fee`
      }
      if (!missing(`paid_fee`)) {
        stopifnot(is.character(`paid_fee`), length(`paid_fee`) == 1)
        self$`paid_fee` <- `paid_fee`
      }
      if (!missing(`locked`)) {
        stopifnot(is.character(`locked`), length(`locked`) == 1)
        self$`locked` <- `locked`
      }
      if (!missing(`executed_volume`)) {
        stopifnot(is.character(`executed_volume`), length(`executed_volume`) == 1)
        self$`executed_volume` <- `executed_volume`
      }
      if (!missing(`trades_count`)) {
        self$`trades_count` <- `trades_count`
      }
      if (!missing(`trades`)) {
        stopifnot(is.list(`trades`), length(`trades`) != 0)
        lapply(`trades`, function(x) stopifnot(R6::is.R6(x)))
        self$`trades` <- `trades`
      }
    },
    toJSON = function() {
      OrderInfoObject <- list()
      if (!is.null(self$`uuid`)) {
        OrderInfoObject[['uuid']] <- self$`uuid`
      }
      if (!is.null(self$`side`)) {
        OrderInfoObject[['side']] <- self$`side`
      }
      if (!is.null(self$`ord_type`)) {
        OrderInfoObject[['ord_type']] <- self$`ord_type`
      }
      if (!is.null(self$`price`)) {
        OrderInfoObject[['price']] <- self$`price`
      }
      if (!is.null(self$`state`)) {
        OrderInfoObject[['state']] <- self$`state`
      }
      if (!is.null(self$`market`)) {
        OrderInfoObject[['market']] <- self$`market`
      }
      if (!is.null(self$`created_at`)) {
        OrderInfoObject[['created_at']] <- self$`created_at`
      }
      if (!is.null(self$`volume`)) {
        OrderInfoObject[['volume']] <- self$`volume`
      }
      if (!is.null(self$`remaining_volume`)) {
        OrderInfoObject[['remaining_volume']] <- self$`remaining_volume`
      }
      if (!is.null(self$`reserved_fee`)) {
        OrderInfoObject[['reserved_fee']] <- self$`reserved_fee`
      }
      if (!is.null(self$`remaining_fee`)) {
        OrderInfoObject[['remaining_fee']] <- self$`remaining_fee`
      }
      if (!is.null(self$`paid_fee`)) {
        OrderInfoObject[['paid_fee']] <- self$`paid_fee`
      }
      if (!is.null(self$`locked`)) {
        OrderInfoObject[['locked']] <- self$`locked`
      }
      if (!is.null(self$`executed_volume`)) {
        OrderInfoObject[['executed_volume']] <- self$`executed_volume`
      }
      if (!is.null(self$`trades_count`)) {
        OrderInfoObject[['trades_count']] <- self$`trades_count`
      }
      if (!is.null(self$`trades`)) {
        OrderInfoObject[['trades']] <- lapply(self$`trades`, function(x) x$toJSON())
      }

      OrderInfoObject
    },
    fromJSON = function(OrderInfoJson) {
      OrderInfoObject <- jsonlite::fromJSON(OrderInfoJson)
      if (!is.null(OrderInfoObject$`uuid`)) {
        self$`uuid` <- OrderInfoObject$`uuid`
      }
      if (!is.null(OrderInfoObject$`side`)) {
        self$`side` <- OrderInfoObject$`side`
      }
      if (!is.null(OrderInfoObject$`ord_type`)) {
        self$`ord_type` <- OrderInfoObject$`ord_type`
      }
      if (!is.null(OrderInfoObject$`price`)) {
        self$`price` <- OrderInfoObject$`price`
      }
      if (!is.null(OrderInfoObject$`state`)) {
        self$`state` <- OrderInfoObject$`state`
      }
      if (!is.null(OrderInfoObject$`market`)) {
        self$`market` <- OrderInfoObject$`market`
      }
      if (!is.null(OrderInfoObject$`created_at`)) {
        self$`created_at` <- OrderInfoObject$`created_at`
      }
      if (!is.null(OrderInfoObject$`volume`)) {
        self$`volume` <- OrderInfoObject$`volume`
      }
      if (!is.null(OrderInfoObject$`remaining_volume`)) {
        self$`remaining_volume` <- OrderInfoObject$`remaining_volume`
      }
      if (!is.null(OrderInfoObject$`reserved_fee`)) {
        self$`reserved_fee` <- OrderInfoObject$`reserved_fee`
      }
      if (!is.null(OrderInfoObject$`remaining_fee`)) {
        self$`remaining_fee` <- OrderInfoObject$`remaining_fee`
      }
      if (!is.null(OrderInfoObject$`paid_fee`)) {
        self$`paid_fee` <- OrderInfoObject$`paid_fee`
      }
      if (!is.null(OrderInfoObject$`locked`)) {
        self$`locked` <- OrderInfoObject$`locked`
      }
      if (!is.null(OrderInfoObject$`executed_volume`)) {
        self$`executed_volume` <- OrderInfoObject$`executed_volume`
      }
      if (!is.null(OrderInfoObject$`trades_count`)) {
        self$`trades_count` <- OrderInfoObject$`trades_count`
      }
      if (!is.null(OrderInfoObject$`trades`)) {
        self$`trades` <- lapply(OrderInfoObject$`trades`, function(x) {
          tradesObject <- Trade$new()
          tradesObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          tradesObject
        })
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "uuid": %s,
           "side": %s,
           "ord_type": %s,
           "price": %s,
           "state": %s,
           "market": %s,
           "created_at": %s,
           "volume": %s,
           "remaining_volume": %s,
           "reserved_fee": %s,
           "remaining_fee": %s,
           "paid_fee": %s,
           "locked": %s,
           "executed_volume": %s,
           "trades_count": %s,
           "trades": [%s]
        }',
        self$`uuid`,
        self$`side`,
        self$`ord_type`,
        self$`price`,
        self$`state`,
        self$`market`,
        self$`created_at`,
        self$`volume`,
        self$`remaining_volume`,
        self$`reserved_fee`,
        self$`remaining_fee`,
        self$`paid_fee`,
        self$`locked`,
        self$`executed_volume`,
        self$`trades_count`,
        lapply(self$`trades`, function(x) paste(x$toJSON(), sep=","))
      )
    },
    fromJSONString = function(OrderInfoJson) {
      OrderInfoObject <- jsonlite::fromJSON(OrderInfoJson)
      self$`uuid` <- OrderInfoObject$`uuid`
      self$`side` <- OrderInfoObject$`side`
      self$`ord_type` <- OrderInfoObject$`ord_type`
      self$`price` <- OrderInfoObject$`price`
      self$`state` <- OrderInfoObject$`state`
      self$`market` <- OrderInfoObject$`market`
      self$`created_at` <- OrderInfoObject$`created_at`
      self$`volume` <- OrderInfoObject$`volume`
      self$`remaining_volume` <- OrderInfoObject$`remaining_volume`
      self$`reserved_fee` <- OrderInfoObject$`reserved_fee`
      self$`remaining_fee` <- OrderInfoObject$`remaining_fee`
      self$`paid_fee` <- OrderInfoObject$`paid_fee`
      self$`locked` <- OrderInfoObject$`locked`
      self$`executed_volume` <- OrderInfoObject$`executed_volume`
      self$`trades_count` <- OrderInfoObject$`trades_count`
      self$`trades` <- lapply(OrderInfoObject$`trades`, function(x) Trade$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
    }
  )
)
