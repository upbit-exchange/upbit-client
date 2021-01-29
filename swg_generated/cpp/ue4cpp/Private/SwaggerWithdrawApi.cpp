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
#include "SwaggerWithdrawApi.h"

#include "SwaggerWithdrawApiOperations.h"
#include "SwaggerModule.h"

#include "HttpModule.h"
#include "Serialization/JsonSerializer.h"

namespace Swagger 
{

SwaggerWithdrawApi::SwaggerWithdrawApi() 
: Url(TEXT("https://api.upbit.com/v1"))
{
}

SwaggerWithdrawApi::~SwaggerWithdrawApi() {}

void SwaggerWithdrawApi::SetURL(const FString& InUrl)
{
	Url = InUrl;
}

void SwaggerWithdrawApi::AddHeaderParam(const FString& Key, const FString& Value)
{
	AdditionalHeaderParams.Add(Key, Value);
}

void SwaggerWithdrawApi::ClearHeaderParams()
{
	AdditionalHeaderParams.Reset();
}

bool SwaggerWithdrawApi::IsValid() const
{
	if (Url.IsEmpty())
	{
		UE_LOG(LogSwagger, Error, TEXT("SwaggerWithdrawApi: Endpoint Url is not set, request cannot be performed"));
		return false;
	}

	return true;
}

void SwaggerWithdrawApi::HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const
{
	InOutResponse.SetHttpResponse(HttpResponse);
	InOutResponse.SetSuccessful(bSucceeded);

	if (bSucceeded && HttpResponse.IsValid())
	{
		InOutResponse.SetHttpResponseCode((EHttpResponseCodes::Type)HttpResponse->GetResponseCode());
		FString ContentType = HttpResponse->GetContentType();
		FString Content;

		if (ContentType == TEXT("application/json"))
		{
			Content = HttpResponse->GetContentAsString();

			TSharedPtr<FJsonValue> JsonValue;
			auto Reader = TJsonReaderFactory<>::Create(Content);

			if (FJsonSerializer::Deserialize(Reader, JsonValue) && JsonValue.IsValid())
			{
				if (InOutResponse.FromJson(JsonValue))
					return; // Successfully parsed
			}
		}
		else if(ContentType == TEXT("text/plain"))
		{
			Content = HttpResponse->GetContentAsString();
			InOutResponse.SetResponseString(Content);
			return; // Successfully parsed
		}

		// Report the parse error but do not mark the request as unsuccessful. Data could be partial or malformed, but the request succeeded.
		UE_LOG(LogSwagger, Error, TEXT("Failed to deserialize Http response content (type:%s):\n%s"), *ContentType , *Content);
		return;
	}

	// By default, assume we failed to establish connection
	InOutResponse.SetHttpResponseCode(EHttpResponseCodes::RequestTimeout);
}

bool SwaggerWithdrawApi::WithdrawChance(const WithdrawChanceRequest& Request, const FWithdrawChanceDelegate& Delegate /*= FWithdrawChanceDelegate()*/) const
{
	if (!IsValid())
		return false;

	TSharedRef<IHttpRequest> HttpRequest = FHttpModule::Get().CreateRequest();
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerWithdrawApi::OnWithdrawChanceResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerWithdrawApi::OnWithdrawChanceResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FWithdrawChanceDelegate Delegate) const
{
	WithdrawChanceResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

bool SwaggerWithdrawApi::WithdrawCoin(const WithdrawCoinRequest& Request, const FWithdrawCoinDelegate& Delegate /*= FWithdrawCoinDelegate()*/) const
{
	if (!IsValid())
		return false;

	TSharedRef<IHttpRequest> HttpRequest = FHttpModule::Get().CreateRequest();
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerWithdrawApi::OnWithdrawCoinResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerWithdrawApi::OnWithdrawCoinResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FWithdrawCoinDelegate Delegate) const
{
	WithdrawCoinResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

bool SwaggerWithdrawApi::WithdrawInfo(const WithdrawInfoRequest& Request, const FWithdrawInfoDelegate& Delegate /*= FWithdrawInfoDelegate()*/) const
{
	if (!IsValid())
		return false;

	TSharedRef<IHttpRequest> HttpRequest = FHttpModule::Get().CreateRequest();
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerWithdrawApi::OnWithdrawInfoResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerWithdrawApi::OnWithdrawInfoResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FWithdrawInfoDelegate Delegate) const
{
	WithdrawInfoResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

bool SwaggerWithdrawApi::WithdrawInfoAll(const WithdrawInfoAllRequest& Request, const FWithdrawInfoAllDelegate& Delegate /*= FWithdrawInfoAllDelegate()*/) const
{
	if (!IsValid())
		return false;

	TSharedRef<IHttpRequest> HttpRequest = FHttpModule::Get().CreateRequest();
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerWithdrawApi::OnWithdrawInfoAllResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerWithdrawApi::OnWithdrawInfoAllResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FWithdrawInfoAllDelegate Delegate) const
{
	WithdrawInfoAllResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

bool SwaggerWithdrawApi::WithdrawKrw(const WithdrawKrwRequest& Request, const FWithdrawKrwDelegate& Delegate /*= FWithdrawKrwDelegate()*/) const
{
	if (!IsValid())
		return false;

	TSharedRef<IHttpRequest> HttpRequest = FHttpModule::Get().CreateRequest();
	HttpRequest->SetURL(*(Url + Request.ComputePath()));

	for(const auto& It : AdditionalHeaderParams)
	{
		HttpRequest->SetHeader(It.Key, It.Value);
	}

	Request.SetupHttpRequest(HttpRequest);
	
	HttpRequest->OnProcessRequestComplete().BindRaw(this, &SwaggerWithdrawApi::OnWithdrawKrwResponse, Delegate);
	return HttpRequest->ProcessRequest();
}

void SwaggerWithdrawApi::OnWithdrawKrwResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FWithdrawKrwDelegate Delegate) const
{
	WithdrawKrwResponse Response;
	HandleResponse(HttpResponse, bSucceeded, Response);
	Delegate.ExecuteIfBound(Response);
}

}
