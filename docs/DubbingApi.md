# DubbingApi

All URIs are relative to *https://api.elevenlabs.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteProject**](DubbingApi.md#deleteProject) | **DELETE** /v1/dubbing/{dubbing_id} | Delete Dubbing Project |
| [**fileInLanguage**](DubbingApi.md#fileInLanguage) | **POST** /v1/dubbing | Dub A Video Or An Audio File |
| [**getFile**](DubbingApi.md#getFile) | **GET** /v1/dubbing/{dubbing_id}/audio/{language_code} | Get Dubbed File |
| [**getProjectMetadata**](DubbingApi.md#getProjectMetadata) | **GET** /v1/dubbing/{dubbing_id} | Get Dubbing Project Metadata |


<a name="deleteProject"></a>
# **deleteProject**
> Object deleteProject(dubbingId).xiApiKey(xiApiKey).execute();

Delete Dubbing Project

Deletes a dubbing project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DubbingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String dubbingId = "dubbingId_example"; // ID of the dubbing project.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      Object result = client
              .dubbing
              .deleteProject(dubbingId)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DubbingApi#deleteProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .dubbing
              .deleteProject(dubbingId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DubbingApi#deleteProject");
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
| **dubbingId** | **String**| ID of the dubbing project. | |
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

<a name="fileInLanguage"></a>
# **fileInLanguage**
> DoDubbingResponseModel fileInLanguage(targetLang, bodyDubAVideoOrAnAudioFileV1DubbingPost).xiApiKey(xiApiKey).mode(mode)._file(_file).csvFile(csvFile).foregroundAudioFile(foregroundAudioFile).backgroundAudioFile(backgroundAudioFile).name(name).sourceUrl(sourceUrl).sourceLang(sourceLang).numSpeakers(numSpeakers).watermark(watermark).startTime(startTime).endTime(endTime).highestResolution(highestResolution).dubbingStudio(dubbingStudio).execute();

Dub A Video Or An Audio File

Dubs provided audio or video file into given language.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DubbingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String targetLang = "targetLang_example"; // Target language.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    String mode = "mode_example"; // automatic or manual.
    File _file = new File("/path/to/file"); // One or more audio files to clone the voice from
    File csvFile = new File("/path/to/file"); // CSV file containing transcription/translation metadata
    File foregroundAudioFile = new File("/path/to/file"); // For use only with csv input
    File backgroundAudioFile = new File("/path/to/file"); // For use only with csv input
    String name = "name_example"; // Name of the dubbing project.
    String sourceUrl = "sourceUrl_example"; // URL of the source video/audio file.
    String sourceLang = "auto"; // Source language.
    Integer numSpeakers = 0; // Number of speakers to use for the dubbing.
    Boolean watermark = false; // Whether to apply watermark to the output video.
    Integer startTime = 56; // Start time of the source video/audio file.
    Integer endTime = 56; // End time of the source video/audio file.
    Boolean highestResolution = false; // Whether to use the highest resolution available.
    Boolean dubbingStudio = false; // Whether to prepare dub for edits in dubbing studio.
    try {
      DoDubbingResponseModel result = client
              .dubbing
              .fileInLanguage(targetLang)
              .xiApiKey(xiApiKey)
              .mode(mode)
              ._file(_file)
              .csvFile(csvFile)
              .foregroundAudioFile(foregroundAudioFile)
              .backgroundAudioFile(backgroundAudioFile)
              .name(name)
              .sourceUrl(sourceUrl)
              .sourceLang(sourceLang)
              .numSpeakers(numSpeakers)
              .watermark(watermark)
              .startTime(startTime)
              .endTime(endTime)
              .highestResolution(highestResolution)
              .dubbingStudio(dubbingStudio)
              .execute();
      System.out.println(result);
      System.out.println(result.getDubbingId());
      System.out.println(result.getExpectedDurationSec());
    } catch (ApiException e) {
      System.err.println("Exception when calling DubbingApi#fileInLanguage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DoDubbingResponseModel> response = client
              .dubbing
              .fileInLanguage(targetLang)
              .xiApiKey(xiApiKey)
              .mode(mode)
              ._file(_file)
              .csvFile(csvFile)
              .foregroundAudioFile(foregroundAudioFile)
              .backgroundAudioFile(backgroundAudioFile)
              .name(name)
              .sourceUrl(sourceUrl)
              .sourceLang(sourceLang)
              .numSpeakers(numSpeakers)
              .watermark(watermark)
              .startTime(startTime)
              .endTime(endTime)
              .highestResolution(highestResolution)
              .dubbingStudio(dubbingStudio)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DubbingApi#fileInLanguage");
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
| **targetLang** | **String**| Target language. | |
| **bodyDubAVideoOrAnAudioFileV1DubbingPost** | [**BodyDubAVideoOrAnAudioFileV1DubbingPost**](BodyDubAVideoOrAnAudioFileV1DubbingPost.md)|  | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |
| **mode** | **String**| automatic or manual. | [optional] |
| **_file** | **File**| One or more audio files to clone the voice from | [optional] |
| **csvFile** | **File**| CSV file containing transcription/translation metadata | [optional] |
| **foregroundAudioFile** | **File**| For use only with csv input | [optional] |
| **backgroundAudioFile** | **File**| For use only with csv input | [optional] |
| **name** | **String**| Name of the dubbing project. | [optional] |
| **sourceUrl** | **String**| URL of the source video/audio file. | [optional] |
| **sourceLang** | **String**| Source language. | [optional] [default to auto] |
| **numSpeakers** | **Integer**| Number of speakers to use for the dubbing. | [optional] [default to 0] |
| **watermark** | **Boolean**| Whether to apply watermark to the output video. | [optional] [default to false] |
| **startTime** | **Integer**| Start time of the source video/audio file. | [optional] |
| **endTime** | **Integer**| End time of the source video/audio file. | [optional] |
| **highestResolution** | **Boolean**| Whether to use the highest resolution available. | [optional] [default to false] |
| **dubbingStudio** | **Boolean**| Whether to prepare dub for edits in dubbing studio. | [optional] [default to false] |

### Return type

[**DoDubbingResponseModel**](DoDubbingResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getFile"></a>
# **getFile**
> Object getFile(dubbingId, languageCode).xiApiKey(xiApiKey).execute();

Get Dubbed File

Returns dubbed file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DubbingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String dubbingId = "dubbingId_example"; // ID of the dubbing project.
    String languageCode = "languageCode_example"; // ID of the language.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      Object result = client
              .dubbing
              .getFile(dubbingId, languageCode)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DubbingApi#getFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .dubbing
              .getFile(dubbingId, languageCode)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DubbingApi#getFile");
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
| **dubbingId** | **String**| ID of the dubbing project. | |
| **languageCode** | **String**| ID of the language. | |
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

<a name="getProjectMetadata"></a>
# **getProjectMetadata**
> Object getProjectMetadata(dubbingId).xiApiKey(xiApiKey).execute();

Get Dubbing Project Metadata

Returns metadata about a dubbing project, including whether it&#39;s still in progress or not

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DubbingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String dubbingId = "dubbingId_example"; // ID of the dubbing project.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      Object result = client
              .dubbing
              .getProjectMetadata(dubbingId)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DubbingApi#getProjectMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .dubbing
              .getProjectMetadata(dubbingId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DubbingApi#getProjectMetadata");
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
| **dubbingId** | **String**| ID of the dubbing project. | |
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

