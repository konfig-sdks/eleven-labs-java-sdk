# WorkspaceApi

All URIs are relative to *https://api.elevenlabs.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSsoProviderAdmin**](WorkspaceApi.md#getSsoProviderAdmin) | **GET** /admin/{admin_url_prefix}/sso-provider | Get Sso Provider Admin |


<a name="getSsoProviderAdmin"></a>
# **getSsoProviderAdmin**
> SsoProviderDBModel getSsoProviderAdmin(workspaceId).execute();

Get Sso Provider Admin

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.WorkspaceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String workspaceId = "workspaceId_example";
    try {
      SsoProviderDBModel result = client
              .workspace
              .getSsoProviderAdmin(workspaceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getProviderType());
      System.out.println(result.getProviderId());
      System.out.println(result.getDomains());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#getSsoProviderAdmin");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SsoProviderDBModel> response = client
              .workspace
              .getSsoProviderAdmin(workspaceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspaceApi#getSsoProviderAdmin");
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
| **workspaceId** | **String**|  | |

### Return type

[**SsoProviderDBModel**](SsoProviderDBModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

