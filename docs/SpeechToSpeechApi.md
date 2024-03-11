# SpeechToSpeechApi

All URIs are relative to *https://api.elevenlabs.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWithVoice**](SpeechToSpeechApi.md#createWithVoice) | **POST** /v1/speech-to-speech/{voice_id} | Speech To Speech |
| [**createWithVoice_0**](SpeechToSpeechApi.md#createWithVoice_0) | **POST** /v1/speech-to-speech/{voice_id}/stream | Speech To Speech Streaming |


<a name="createWithVoice"></a>
# **createWithVoice**
> createWithVoice(voiceId, audio, bodySpeechToSpeechV1SpeechToSpeechVoiceIdPost).optimizeStreamingLatency(optimizeStreamingLatency).xiApiKey(xiApiKey).modelId(modelId).voiceSettings(voiceSettings).execute();

Speech To Speech

Create speech by combining the content and emotion of the uploaded audio with a voice of your choice.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpeechToSpeechApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String voiceId = "21m00Tcm4TlvDq8ikWAM"; // Voice ID to be used, you can use https://api.elevenlabs.io/v1/voices to list all the available voices.
    File audio = new File("/path/to/file"); // The audio file which holds the content and emotion that will control the generated speech.
    Integer optimizeStreamingLatency = 0; // You can turn on latency optimizations at some cost of quality. The best possible final latency varies by model. Possible values: 0 - default mode (no latency optimizations) 1 - normal latency optimizations (about 50% of possible latency improvement of option 3) 2 - strong latency optimizations (about 75% of possible latency improvement of option 3) 3 - max latency optimizations 4 - max latency optimizations, but also with text normalizer turned off for even more latency savings (best latency, but can mispronounce eg numbers and dates).  Defaults to 0. 
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    String modelId = "eleven_english_sts_v2"; // Identifier of the model that will be used, you can query them using GET /v1/models. The model needs to have support for speech to speech, you can check this using the can_do_voice_conversion property.
    String voiceSettings = "voiceSettings_example"; // Voice settings overriding stored setttings for the given voice. They are applied only on the given request. Needs to be send as a JSON encoded string.
    try {
      client
              .speechToSpeech
              .createWithVoice(voiceId, audio)
              .optimizeStreamingLatency(optimizeStreamingLatency)
              .xiApiKey(xiApiKey)
              .modelId(modelId)
              .voiceSettings(voiceSettings)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SpeechToSpeechApi#createWithVoice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .speechToSpeech
              .createWithVoice(voiceId, audio)
              .optimizeStreamingLatency(optimizeStreamingLatency)
              .xiApiKey(xiApiKey)
              .modelId(modelId)
              .voiceSettings(voiceSettings)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SpeechToSpeechApi#createWithVoice");
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
| **audio** | **File**| The audio file which holds the content and emotion that will control the generated speech. | |
| **bodySpeechToSpeechV1SpeechToSpeechVoiceIdPost** | [**BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost**](BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost.md)|  | |
| **optimizeStreamingLatency** | **Integer**| You can turn on latency optimizations at some cost of quality. The best possible final latency varies by model. Possible values: 0 - default mode (no latency optimizations) 1 - normal latency optimizations (about 50% of possible latency improvement of option 3) 2 - strong latency optimizations (about 75% of possible latency improvement of option 3) 3 - max latency optimizations 4 - max latency optimizations, but also with text normalizer turned off for even more latency savings (best latency, but can mispronounce eg numbers and dates).  Defaults to 0.  | [optional] [default to 0] |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |
| **modelId** | **String**| Identifier of the model that will be used, you can query them using GET /v1/models. The model needs to have support for speech to speech, you can check this using the can_do_voice_conversion property. | [optional] [default to eleven_english_sts_v2] |
| **voiceSettings** | **String**| Voice settings overriding stored setttings for the given voice. They are applied only on the given request. Needs to be send as a JSON encoded string. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: audio/mpeg, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="createWithVoice_0"></a>
# **createWithVoice_0**
> createWithVoice_0(voiceId, audio, bodySpeechToSpeechStreamingV1SpeechToSpeechVoiceIdStreamPost).optimizeStreamingLatency(optimizeStreamingLatency).xiApiKey(xiApiKey).modelId(modelId).voiceSettings(voiceSettings).execute();

Speech To Speech Streaming

Create speech by combining the content and emotion of the uploaded audio with a voice of your choice and returns an audio stream.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SpeechToSpeechApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String voiceId = "21m00Tcm4TlvDq8ikWAM"; // Voice ID to be used, you can use https://api.elevenlabs.io/v1/voices to list all the available voices.
    File audio = new File("/path/to/file"); // The audio file which holds the content and emotion that will control the generated speech.
    Integer optimizeStreamingLatency = 0; // You can turn on latency optimizations at some cost of quality. The best possible final latency varies by model. Possible values: 0 - default mode (no latency optimizations) 1 - normal latency optimizations (about 50% of possible latency improvement of option 3) 2 - strong latency optimizations (about 75% of possible latency improvement of option 3) 3 - max latency optimizations 4 - max latency optimizations, but also with text normalizer turned off for even more latency savings (best latency, but can mispronounce eg numbers and dates).  Defaults to 0. 
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    String modelId = "eleven_english_sts_v2"; // Identifier of the model that will be used, you can query them using GET /v1/models. The model needs to have support for speech to speech, you can check this using the can_do_voice_conversion property.
    String voiceSettings = "voiceSettings_example"; // Voice settings overriding stored setttings for the given voice. They are applied only on the given request. Needs to be send as a JSON encoded string.
    try {
      client
              .speechToSpeech
              .createWithVoice_0(voiceId, audio)
              .optimizeStreamingLatency(optimizeStreamingLatency)
              .xiApiKey(xiApiKey)
              .modelId(modelId)
              .voiceSettings(voiceSettings)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SpeechToSpeechApi#createWithVoice_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .speechToSpeech
              .createWithVoice_0(voiceId, audio)
              .optimizeStreamingLatency(optimizeStreamingLatency)
              .xiApiKey(xiApiKey)
              .modelId(modelId)
              .voiceSettings(voiceSettings)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SpeechToSpeechApi#createWithVoice_0");
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
| **audio** | **File**| The audio file which holds the content and emotion that will control the generated speech. | |
| **bodySpeechToSpeechStreamingV1SpeechToSpeechVoiceIdStreamPost** | [**BodySpeechToSpeechStreamingV1SpeechToSpeechVoiceIdStreamPost**](BodySpeechToSpeechStreamingV1SpeechToSpeechVoiceIdStreamPost.md)|  | |
| **optimizeStreamingLatency** | **Integer**| You can turn on latency optimizations at some cost of quality. The best possible final latency varies by model. Possible values: 0 - default mode (no latency optimizations) 1 - normal latency optimizations (about 50% of possible latency improvement of option 3) 2 - strong latency optimizations (about 75% of possible latency improvement of option 3) 3 - max latency optimizations 4 - max latency optimizations, but also with text normalizer turned off for even more latency savings (best latency, but can mispronounce eg numbers and dates).  Defaults to 0.  | [optional] [default to 0] |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |
| **modelId** | **String**| Identifier of the model that will be used, you can query them using GET /v1/models. The model needs to have support for speech to speech, you can check this using the can_do_voice_conversion property. | [optional] [default to eleven_english_sts_v2] |
| **voiceSettings** | **String**| Voice settings overriding stored setttings for the given voice. They are applied only on the given request. Needs to be send as a JSON encoded string. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

