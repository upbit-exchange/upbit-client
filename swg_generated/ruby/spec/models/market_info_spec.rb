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
require 'date'

# Unit tests for SwaggerClient::MarketInfo
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'MarketInfo' do
  before do
    # run before each test
    @instance = SwaggerClient::MarketInfo.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of MarketInfo' do
    it 'should create an instance of MarketInfo' do
      expect(@instance).to be_instance_of(SwaggerClient::MarketInfo)
    end
  end
  describe 'test attribute "market"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "korean_name"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "english_name"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "market_warning"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
