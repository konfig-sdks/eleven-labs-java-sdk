# SamplesApi

All URIs are relative to *https://api.elevenlabs.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAudioFromSample**](SamplesApi.md#getAudioFromSample) | **GET** /v1/voices/{voice_id}/samples/{sample_id}/audio | Get Audio From Sample |
| [**removeById**](SamplesApi.md#removeById) | **DELETE** /v1/voices/{voice_id}/samples/{sample_id} | Delete Sample |


<a name="getAudioFromSample"></a>
# **getAudioFromSample**
> getAudioFromSample(voiceId, sampleId).xiApiKey(xiApiKey).execute();

Get Audio From Sample

Returns the audio corresponding to a sample attached to a voice.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SamplesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String voiceId = "21m00Tcm4TlvDq8ikWAM"; // Voice ID to be used, you can use https://api.elevenlabs.io/v1/voices to list all the available voices.
    String sampleId = "VW7YKqPnjY4h39yTbx2L"; // Sample ID to be used, you can use GET https://api.elevenlabs.io/v1/voices/{voice_id} to list all the available samples for a voice.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      client
              .samples
              .getAudioFromSample(voiceId, sampleId)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SamplesApi#getAudioFromSample");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .samples
              .getAudioFromSample(voiceId, sampleId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SamplesApi#getAudioFromSample");
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
| **voiceId** | **String**| Voice ID to be used, you can use https://api.elevenlabs.io/v1/voices to list all the available voices. | |
| **sampleId** | **String**| Sample ID to be used, you can use GET https://api.elevenlabs.io/v1/voices/{voice_id} to list all the available samples for a voice. | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: audio/*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="removeById"></a>
# **removeById**
> Object removeById(voiceId, sampleId).xiApiKey(xiApiKey).execute();

Delete Sample

Removes a sample by its ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SamplesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String voiceId = "21m00Tcm4TlvDq8ikWAM"; // Voice ID to be used, you can use https://api.elevenlabs.io/v1/voices to list all the available voices.
    String sampleId = "VW7YKqPnjY4h39yTbx2L"; // Sample ID to be used, you can use GET https://api.elevenlabs.io/v1/voices/{voice_id} to list all the available samples for a voice.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      Object result = client
              .samples
              .removeById(voiceId, sampleId)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SamplesApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .samples
              .removeById(voiceId, sampleId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SamplesApi#removeById");
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
| **voiceId** | **String**| Voice ID to be used, you can use https://api.elevenlabs.io/v1/voices to list all the available voices. | |
| **sampleId** | **String**| Sample ID to be used, you can use GET https://api.elevenlabs.io/v1/voices/{voice_id} to list all the available samples for a voice. | |
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

