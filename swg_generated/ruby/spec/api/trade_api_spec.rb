=begin
#Upbit Open API

### REST API for Upbit Exchange - Base URL: [https://api.upbit.com] - Official Upbit API Documents: [https://docs.upbit.com] - Official Support email: [open-api@upbit.com] 

OpenAPI spec version: 1.0.0
Contact: ujhin942@gmail.com
Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.18

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::TradeApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'TradeApi' do
  before do
    # run before each test
    @instance = SwaggerClient::TradeApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of TradeApi' do
    it 'should create an instance of TradeApi' do
      expect(@instance).to be_instance_of(SwaggerClient::TradeApi)
    end
  end

  # unit tests for trade_ticker
  # 시세 Ticker 조회
  # ## 현재가 정보 요청 당시 종목의 스냅샷을 반환한다. 
  # @param markets 반점으로 구분되는 마켓 코드 (ex. KRW-BTC, BTC-BCC) 
  # @param [Hash] opts the optional parameters
  # @return [Object]
  describe 'trade_ticker test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for trade_ticks
  # 시세 체결 조회
  # ## 최근 체결 내역 
  # @param market 마켓 코드 (ex. KRW-BTC, BTC-BCC) 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :to 마지막 체결 시각. 형식 : &#x60;[HHmmss 또는 HH:mm:ss]&#x60;. 비워서 요청시 가장 최근 데이터 
  # @option opts [Float] :count 체결 개수 
  # @option opts [String] :cursor 페이지네이션 커서 (sequentialId) &#x60;sequential_id&#x60; 필드는 체결의 유일성 판단을 위한 근거로 쓰일 수 있습니다. 하지만 체결의 순서를 보장하지는 못합니다. 
  # @option opts [Float] :days_ago 최근 체결 날짜 기준 7일 이내의 이전 데이터 조회 가능. 비워서 요청 시 가장 최근 체결 날짜 반환. (범위: 1 ~ 7) 
  # @return [Object]
  describe 'trade_ticks test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
