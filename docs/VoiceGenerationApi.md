# VoiceGenerationApi

All URIs are relative to *https://api.elevenlabs.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createVoice**](VoiceGenerationApi.md#createVoice) | **POST** /v1/voice-generation/create-voice | Create A Previously Generated Voice |
| [**generateRandomVoice**](VoiceGenerationApi.md#generateRandomVoice) | **POST** /v1/voice-generation/generate-voice | Generate A Random Voice |
| [**getVoiceGenerationParameters**](VoiceGenerationApi.md#getVoiceGenerationParameters) | **GET** /v1/voice-generation/generate-voice/parameters | Voice Generation Parameters |


<a name="createVoice"></a>
# **createVoice**
> VoiceResponseModel createVoice(bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost).xiApiKey(xiApiKey).execute();

Create A Previously Generated Voice

Create a previously generated voice. This endpoint should be called after you fetched a generated_voice_id using /v1/voice-generation/generate-voice.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoiceGenerationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String voiceName = "voiceName_example"; // Name to use for the created voice.
    String voiceDescription = "voiceDescription_example"; // Description to use for the created voice.
    String generatedVoiceId = "generatedVoiceId_example"; // The generated_voice_id to create, call POST /v1/voice-generation/generate-voice and fetch the generated_voice_id from the response header if don't have one yet.
    Map<String, String> labels = new HashMap(); // Optional, metadata to add to the created voice. Defaults to None.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      VoiceResponseModel result = client
              .voiceGeneration
              .createVoice(voiceName, voiceDescription, generatedVoiceId)
              .labels(labels)
              .xiApiKey(xiApiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getVoiceId());
      System.out.println(result.getName());
      System.out.println(result.getSamples());
      System.out.println(result.getCategory());
      System.out.println(result.getFineTuning());
      System.out.println(result.getLabels());
      System.out.println(result.getPreviewUrl());
      System.out.println(result.getAvailableForTiers());
      System.out.println(result.getSettings());
      System.out.println(result.getSharing());
      System.out.println(result.getHighQualityBaseModelIds());
      System.out.println(result.getSafetyControl());
      System.out.println(result.getVoiceVerification());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoiceGenerationApi#createVoice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VoiceResponseModel> response = client
              .voiceGeneration
              .createVoice(voiceName, voiceDescription, generatedVoiceId)
              .labels(labels)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoiceGenerationApi#createVoice");
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
| **bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost** | [**BodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost**](BodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost.md)|  | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

[**VoiceResponseModel**](VoiceResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="generateRandomVoice"></a>
# **generateRandomVoice**
> generateRandomVoice(bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost).xiApiKey(xiApiKey).execute();

Generate A Random Voice

Generate a random voice based on parameters. This method returns a generated_voice_id in the response header, and a sample of the voice in the body. If you like the generated voice call /v1/voice-generation/create-voice with the generated_voice_id to create the voice.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoiceGenerationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String gender = "female"; // Category code corresponding to the gender of the generated voice. Possible values: female, male.
    String accent = "accent_example"; // Category code corresponding to the accent of the generated voice. Possible values: american, british, african, australian, indian.
    String age = "young"; // Category code corresponding to the age of the generated voice. Possible values: young, middle_aged, old.
    Double accentStrength = 3.4D; // The strength of the accent of the generated voice. Has to be between 0.3 and 2.0.
    String text = "text_example"; // Text to generate, text length has to be between 100 and 1000.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      client
              .voiceGeneration
              .generateRandomVoice(gender, accent, age, accentStrength, text)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VoiceGenerationApi#generateRandomVoice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .voiceGeneration
              .generateRandomVoice(gender, accent, age, accentStrength, text)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VoiceGenerationApi#generateRandomVoice");
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
| **bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost** | [**BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost**](BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost.md)|  | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: audio/mpeg, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getVoiceGenerationParameters"></a>
# **getVoiceGenerationParameters**
> VoiceGenerationParameterResponseModel getVoiceGenerationParameters().execute();

Voice Generation Parameters

Get possible parameters for the /v1/voice-generation/generate-voice endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoiceGenerationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    try {
      VoiceGenerationParameterResponseModel result = client
              .voiceGeneration
              .getVoiceGenerationParameters()
              .execute();
      System.out.println(result);
      System.out.println(result.getGenders());
      System.out.println(result.getAccents());
      System.out.println(result.getAges());
      System.out.println(result.getMinimumCharacters());
      System.out.println(result.getMaximumCharacters());
      System.out.println(result.getMinimumAccentStrength());
      System.out.println(result.getMaximumAccentStrength());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoiceGenerationApi#getVoiceGenerationParameters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VoiceGenerationParameterResponseModel> response = client
              .voiceGeneration
              .getVoiceGenerationParameters()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoiceGenerationApi#getVoiceGenerationParameters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VoiceGenerationParameterResponseModel**](VoiceGenerationParameterResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

