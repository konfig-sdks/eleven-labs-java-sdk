# SpeechHistoryApi

All URIs are relative to *https://api.elevenlabs.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteHistoryItemById**](SpeechHistoryApi.md#deleteHistoryItemById) | **DELETE** /v1/history/{history_item_id} | Delete History Item |
| [**downloadHistoryItems**](SpeechHistoryApi.md#downloadHistoryItems) | **POST** /v1/history/download | Download History Items |
| [**getGeneratedAudioMetadata**](SpeechHistoryApi.md#getGeneratedAudioMetadata) | **GET** /v1/history | Get Generated Items |
| [**getHistoryItemAudio**](SpeechHistoryApi.md#getHistoryItemAudio) | **GET** /v1/history/{history_item_id}/audio | Get Audio From History Item |
| [**getHistoryItemById**](SpeechHistoryApi.md#getHistoryItemById) | **GET** /v1/history/{history_item_id} | Get History Item By Id |


<a name="deleteHistoryItemById"></a>
# **deleteHistoryItemById**
> Object deleteHistoryItemById(historyItemId).xiApiKey(xiApiKey).execute();

Delete History Item

Delete a history item by its ID

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpeechHistoryApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String historyItemId = "VW7YKqPnjY4h39yTbx2L"; // History item ID to be used, you can use GET https://api.elevenlabs.io/v1/history to receive a list of history items and their IDs.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      Object result = client
              .speechHistory
              .deleteHistoryItemById(historyItemId)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SpeechHistoryApi#deleteHistoryItemById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .speechHistory
              .deleteHistoryItemById(historyItemId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpeechHistoryApi#deleteHistoryItemById");
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
| **historyItemId** | **String**| History item ID to be used, you can use GET https://api.elevenlabs.io/v1/history to receive a list of history items and their IDs. | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="downloadHistoryItems"></a>
# **downloadHistoryItems**
> downloadHistoryItems(bodyDownloadHistoryItemsV1HistoryDownloadPost).xiApiKey(xiApiKey).execute();

Download History Items

Download one or more history items. If one history item ID is provided, we will return a single audio file. If more than one history item IDs are provided, we will provide the history items packed into a .zip file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpeechHistoryApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    List<String> historyItemIds = Arrays.asList(); // A list of history items to download, you can get IDs of history items and other metadata using the GET https://api.elevenlabs.io/v1/history endpoint.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      client
              .speechHistory
              .downloadHistoryItems(historyItemIds)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SpeechHistoryApi#downloadHistoryItems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .speechHistory
              .downloadHistoryItems(historyItemIds)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SpeechHistoryApi#downloadHistoryItems");
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
| **bodyDownloadHistoryItemsV1HistoryDownloadPost** | [**BodyDownloadHistoryItemsV1HistoryDownloadPost**](BodyDownloadHistoryItemsV1HistoryDownloadPost.md)|  | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getGeneratedAudioMetadata"></a>
# **getGeneratedAudioMetadata**
> GetSpeechHistoryResponseModel getGeneratedAudioMetadata().pageSize(pageSize).startAfterHistoryItemId(startAfterHistoryItemId).voiceId(voiceId).xiApiKey(xiApiKey).execute();

Get Generated Items

Returns metadata about all your generated audio.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpeechHistoryApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    Integer pageSize = 100; // How many history items to return at maximum. Can not exceed 1000, defaults to 100.
    String startAfterHistoryItemId = "startAfterHistoryItemId_example"; // After which ID to start fetching, use this parameter to paginate across a large collection of history items. In case this parameter is not provided history items will be fetched starting from the most recently created one ordered descending by their creation date.
    String voiceId = "voiceId_example"; // Voice ID to be filtered for, you can use GET https://api.elevenlabs.io/v1/voices to receive a list of voices and their IDs.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      GetSpeechHistoryResponseModel result = client
              .speechHistory
              .getGeneratedAudioMetadata()
              .pageSize(pageSize)
              .startAfterHistoryItemId(startAfterHistoryItemId)
              .voiceId(voiceId)
              .xiApiKey(xiApiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getHistory());
      System.out.println(result.getLastHistoryItemId());
      System.out.println(result.getHasMore());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpeechHistoryApi#getGeneratedAudioMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetSpeechHistoryResponseModel> response = client
              .speechHistory
              .getGeneratedAudioMetadata()
              .pageSize(pageSize)
              .startAfterHistoryItemId(startAfterHistoryItemId)
              .voiceId(voiceId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpeechHistoryApi#getGeneratedAudioMetadata");
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
| **pageSize** | **Integer**| How many history items to return at maximum. Can not exceed 1000, defaults to 100. | [optional] [default to 100] |
| **startAfterHistoryItemId** | **String**| After which ID to start fetching, use this parameter to paginate across a large collection of history items. In case this parameter is not provided history items will be fetched starting from the most recently created one ordered descending by their creation date. | [optional] |
| **voiceId** | **String**| Voice ID to be filtered for, you can use GET https://api.elevenlabs.io/v1/voices to receive a list of voices and their IDs. | [optional] |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

[**GetSpeechHistoryResponseModel**](GetSpeechHistoryResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getHistoryItemAudio"></a>
# **getHistoryItemAudio**
> getHistoryItemAudio(historyItemId).xiApiKey(xiApiKey).execute();

Get Audio From History Item

Returns the audio of an history item.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpeechHistoryApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String historyItemId = "VW7YKqPnjY4h39yTbx2L"; // History item ID to be used, you can use GET https://api.elevenlabs.io/v1/history to receive a list of history items and their IDs.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      client
              .speechHistory
              .getHistoryItemAudio(historyItemId)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SpeechHistoryApi#getHistoryItemAudio");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .speechHistory
              .getHistoryItemAudio(historyItemId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SpeechHistoryApi#getHistoryItemAudio");
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
| **historyItemId** | **String**| History item ID to be used, you can use GET https://api.elevenlabs.io/v1/history to receive a list of history items and their IDs. | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: audio/mpeg, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getHistoryItemById"></a>
# **getHistoryItemById**
> SpeechHistoryItemResponseModel getHistoryItemById(historyItemId).xiApiKey(xiApiKey).execute();

Get History Item By Id

Returns information about an history item by its ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpeechHistoryApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String historyItemId = "VW7YKqPnjY4h39yTbx2L"; // History item ID to be used, you can use GET https://api.elevenlabs.io/v1/history to receive a list of history items and their IDs.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      SpeechHistoryItemResponseModel result = client
              .speechHistory
              .getHistoryItemById(historyItemId)
              .xiApiKey(xiApiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getHistoryItemId());
      System.out.println(result.getRequestId());
      System.out.println(result.getVoiceId());
      System.out.println(result.getModelId());
      System.out.println(result.getVoiceName());
      System.out.println(result.getVoiceCategory());
      System.out.println(result.getText());
      System.out.println(result.getDateUnix());
      System.out.println(result.getCharacterCountChangeFrom());
      System.out.println(result.getCharacterCountChangeTo());
      System.out.println(result.getContentType());
      System.out.println(result.getState());
      System.out.println(result.getSettings());
      System.out.println(result.getFeedback());
      System.out.println(result.getShareLinkId());
      System.out.println(result.getSource());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpeechHistoryApi#getHistoryItemById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SpeechHistoryItemResponseModel> response = client
              .speechHistory
              .getHistoryItemById(historyItemId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SpeechHistoryApi#getHistoryItemById");
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
| **historyItemId** | **String**| History item ID to be used, you can use GET https://api.elevenlabs.io/v1/history to receive a list of history items and their IDs. | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

[**SpeechHistoryItemResponseModel**](SpeechHistoryItemResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

