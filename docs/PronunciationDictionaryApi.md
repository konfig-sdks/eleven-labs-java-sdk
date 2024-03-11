# PronunciationDictionaryApi

All URIs are relative to *https://api.elevenlabs.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFromFile**](PronunciationDictionaryApi.md#createFromFile) | **POST** /v1/pronunciation-dictionaries/add-from-file | Add A Pronunciation Dictionary |
| [**getMetadata**](PronunciationDictionaryApi.md#getMetadata) | **GET** /v1/pronunciation-dictionaries/{pronunciation_dictionary_id} | Get Metadata For A Pronunciation Dictionary |


<a name="createFromFile"></a>
# **createFromFile**
> AddPronunciationDictionaryResponseModel createFromFile(name, bodyAddAPronunciationDictionaryV1PronunciationDictionariesAddFromFilePost).xiApiKey(xiApiKey).description(description)._file(_file).execute();

Add A Pronunciation Dictionary

Creates a new pronunciation dictionary from a lexicon .PLS file

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PronunciationDictionaryApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String name = "name_example"; // The name of the pronunciation dictionary, used for identification only.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    String description = "description_example"; // A description of the pronunciation dictionary, used for identification only.
    File _file = new File("/path/to/file"); // A lexicon .pls file which we will use to initialize the project with.
    try {
      AddPronunciationDictionaryResponseModel result = client
              .pronunciationDictionary
              .createFromFile(name)
              .xiApiKey(xiApiKey)
              .description(description)
              ._file(_file)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreationTimeUnix());
      System.out.println(result.getVersionId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PronunciationDictionaryApi#createFromFile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddPronunciationDictionaryResponseModel> response = client
              .pronunciationDictionary
              .createFromFile(name)
              .xiApiKey(xiApiKey)
              .description(description)
              ._file(_file)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PronunciationDictionaryApi#createFromFile");
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
| **name** | **String**| The name of the pronunciation dictionary, used for identification only. | |
| **bodyAddAPronunciationDictionaryV1PronunciationDictionariesAddFromFilePost** | [**BodyAddAPronunciationDictionaryV1PronunciationDictionariesAddFromFilePost**](BodyAddAPronunciationDictionaryV1PronunciationDictionariesAddFromFilePost.md)|  | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |
| **description** | **String**| A description of the pronunciation dictionary, used for identification only. | [optional] |
| **_file** | **File**| A lexicon .pls file which we will use to initialize the project with. | [optional] |

### Return type

[**AddPronunciationDictionaryResponseModel**](AddPronunciationDictionaryResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getMetadata"></a>
# **getMetadata**
> GetPronunciationDictionaryMetadataResponseModel getMetadata(pronunciationDictionaryId).xiApiKey(xiApiKey).execute();

Get Metadata For A Pronunciation Dictionary

Get metadata for a pronunciation dictionary

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PronunciationDictionaryApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String pronunciationDictionaryId = "21m00Tcm4TlvDq8ikWAM"; // The id of the pronunciation dictionary
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      GetPronunciationDictionaryMetadataResponseModel result = client
              .pronunciationDictionary
              .getMetadata(pronunciationDictionaryId)
              .xiApiKey(xiApiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getCreatedBy());
      System.out.println(result.getCreationTimeUnix());
    } catch (ApiException e) {
      System.err.println("Exception when calling PronunciationDictionaryApi#getMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetPronunciationDictionaryMetadataResponseModel> response = client
              .pronunciationDictionary
              .getMetadata(pronunciationDictionaryId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PronunciationDictionaryApi#getMetadata");
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
| **pronunciationDictionaryId** | **String**| The id of the pronunciation dictionary | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

[**GetPronunciationDictionaryMetadataResponseModel**](GetPronunciationDictionaryMetadataResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

