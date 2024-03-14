# UserApi

All URIs are relative to *https://api.elevenlabs.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInfo**](UserApi.md#getInfo) | **GET** /v1/user | Get User Info |
| [**getSubscriptionInfo**](UserApi.md#getSubscriptionInfo) | **GET** /v1/user/subscription | Get User Subscription Info |


<a name="getInfo"></a>
# **getInfo**
> UserResponseModel getInfo().xiApiKey(xiApiKey).execute();

Get User Info

Gets information about the user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      UserResponseModel result = client
              .user
              .getInfo()
              .xiApiKey(xiApiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getSubscription());
      System.out.println(result.getIsNewUser());
      System.out.println(result.getXiApiKey());
      System.out.println(result.getCanUseDelayedPaymentMethods());
      System.out.println(result.getIsOnboardingCompleted());
      System.out.println(result.getFirstName());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserResponseModel> response = client
              .user
              .getInfo()
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

[**UserResponseModel**](UserResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getSubscriptionInfo"></a>
# **getSubscriptionInfo**
> ExtendedSubscriptionResponseModel getSubscriptionInfo().xiApiKey(xiApiKey).execute();

Get User Subscription Info

Gets extended information about the users subscription

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      ExtendedSubscriptionResponseModel result = client
              .user
              .getSubscriptionInfo()
              .xiApiKey(xiApiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getTier());
      System.out.println(result.getCharacterCount());
      System.out.println(result.getCharacterLimit());
      System.out.println(result.getCanExtendCharacterLimit());
      System.out.println(result.getAllowedToExtendCharacterLimit());
      System.out.println(result.getNextCharacterCountResetUnix());
      System.out.println(result.getVoiceLimit());
      System.out.println(result.getMaxVoiceAddEdits());
      System.out.println(result.getVoiceAddEditCounter());
      System.out.println(result.getProfessionalVoiceLimit());
      System.out.println(result.getCanExtendVoiceLimit());
      System.out.println(result.getCanUseInstantVoiceCloning());
      System.out.println(result.getCanUseProfessionalVoiceCloning());
      System.out.println(result.getCurrency());
      System.out.println(result.getStatus());
      System.out.println(result.getBillingPeriod());
      System.out.println(result.getNextInvoice());
      System.out.println(result.getHasOpenInvoices());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getSubscriptionInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExtendedSubscriptionResponseModel> response = client
              .user
              .getSubscriptionInfo()
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getSubscriptionInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

[**ExtendedSubscriptionResponseModel**](ExtendedSubscriptionResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

