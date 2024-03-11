# TextToSpeechApi

All URIs are relative to *https://api.elevenlabs.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**convertTextToSpeech**](TextToSpeechApi.md#convertTextToSpeech) | **POST** /v1/text-to-speech/{voice_id} | Text To Speech |
| [**convertTextToSpeechStream**](TextToSpeechApi.md#convertTextToSpeechStream) | **POST** /v1/text-to-speech/{voice_id}/stream | Text To Speech |


<a name="convertTextToSpeech"></a>
# **convertTextToSpeech**
> convertTextToSpeech(voiceId, bodyTextToSpeechV1TextToSpeechVoiceIdPost).optimizeStreamingLatency(optimizeStreamingLatency).outputFormat(outputFormat).xiApiKey(xiApiKey).execute();

Text To Speech

Converts text into speech using a voice of your choice and returns audio.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TextToSpeechApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String text = "text_example"; // The text that will get converted into speech.
    String voiceId = "21m00Tcm4TlvDq8ikWAM"; // Voice ID to be used, you can use https://api.elevenlabs.io/v1/voices to list all the available voices.
    String modelId = "eleven_monolingual_v1"; // Identifier of the model that will be used, you can query them using GET /v1/models. The model needs to have support for text to speech, you can check this using the can_do_text_to_speech property.
    VoiceSettingsResponseModel voiceSettings = new VoiceSettingsResponseModel(); // Voice settings overriding stored setttings for the given voice. They are applied only on the given request.
    List<PronunciationDictionaryVersionLocatorDBModel> pronunciationDictionaryLocators = Arrays.asList(); // A list of pronunciation dictionary locators (id, version_id) to be applied to the text. They will be applied in order. You may have up to 3 locators per request
    Integer optimizeStreamingLatency = 0; // You can turn on latency optimizations at some cost of quality. The best possible final latency varies by model. Possible values: 0 - default mode (no latency optimizations) 1 - normal latency optimizations (about 50% of possible latency improvement of option 3) 2 - strong latency optimizations (about 75% of possible latency improvement of option 3) 3 - max latency optimizations 4 - max latency optimizations, but also with text normalizer turned off for even more latency savings (best latency, but can mispronounce eg numbers and dates).  Defaults to 0. 
    String outputFormat = "mp3_44100_128"; // Output format of the generated audio. Must be one of: mp3_22050_32 - output format, mp3 with 22.05kHz sample rate at 32kbps. mp3_44100_32 - output format, mp3 with 44.1kHz sample rate at 32kbps. mp3_44100_64 - output format, mp3 with 44.1kHz sample rate at 64kbps. mp3_44100_96 - output format, mp3 with 44.1kHz sample rate at 96kbps. mp3_44100_128 - default output format, mp3 with 44.1kHz sample rate at 128kbps. mp3_44100_192 - output format, mp3 with 44.1kHz sample rate at 192kbps. Requires you to be subscribed to Creator tier or above. pcm_16000 - PCM format (S16LE) with 16kHz sample rate. pcm_22050 - PCM format (S16LE) with 22.05kHz sample rate. pcm_24000 - PCM format (S16LE) with 24kHz sample rate. pcm_44100 - PCM format (S16LE) with 44.1kHz sample rate. Requires you to be subscribed to Independent Publisher tier or above. ulaw_8000 - μ-law format (sometimes written mu-law, often approximated as u-law) with 8kHz sample rate. Note that this format is commonly used for Twilio audio inputs. 
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      client
              .textToSpeech
              .convertTextToSpeech(text, voiceId)
              .modelId(modelId)
              .voiceSettings(voiceSettings)
              .pronunciationDictionaryLocators(pronunciationDictionaryLocators)
              .optimizeStreamingLatency(optimizeStreamingLatency)
              .outputFormat(outputFormat)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TextToSpeechApi#convertTextToSpeech");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .textToSpeech
              .convertTextToSpeech(text, voiceId)
              .modelId(modelId)
              .voiceSettings(voiceSettings)
              .pronunciationDictionaryLocators(pronunciationDictionaryLocators)
              .optimizeStreamingLatency(optimizeStreamingLatency)
              .outputFormat(outputFormat)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TextToSpeechApi#convertTextToSpeech");
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
| **bodyTextToSpeechV1TextToSpeechVoiceIdPost** | [**BodyTextToSpeechV1TextToSpeechVoiceIdPost**](BodyTextToSpeechV1TextToSpeechVoiceIdPost.md)|  | |
| **optimizeStreamingLatency** | **Integer**| You can turn on latency optimizations at some cost of quality. The best possible final latency varies by model. Possible values: 0 - default mode (no latency optimizations) 1 - normal latency optimizations (about 50% of possible latency improvement of option 3) 2 - strong latency optimizations (about 75% of possible latency improvement of option 3) 3 - max latency optimizations 4 - max latency optimizations, but also with text normalizer turned off for even more latency savings (best latency, but can mispronounce eg numbers and dates).  Defaults to 0.  | [optional] [default to 0] |
| **outputFormat** | **String**| Output format of the generated audio. Must be one of: mp3_22050_32 - output format, mp3 with 22.05kHz sample rate at 32kbps. mp3_44100_32 - output format, mp3 with 44.1kHz sample rate at 32kbps. mp3_44100_64 - output format, mp3 with 44.1kHz sample rate at 64kbps. mp3_44100_96 - output format, mp3 with 44.1kHz sample rate at 96kbps. mp3_44100_128 - default output format, mp3 with 44.1kHz sample rate at 128kbps. mp3_44100_192 - output format, mp3 with 44.1kHz sample rate at 192kbps. Requires you to be subscribed to Creator tier or above. pcm_16000 - PCM format (S16LE) with 16kHz sample rate. pcm_22050 - PCM format (S16LE) with 22.05kHz sample rate. pcm_24000 - PCM format (S16LE) with 24kHz sample rate. pcm_44100 - PCM format (S16LE) with 44.1kHz sample rate. Requires you to be subscribed to Independent Publisher tier or above. ulaw_8000 - μ-law format (sometimes written mu-law, often approximated as u-law) with 8kHz sample rate. Note that this format is commonly used for Twilio audio inputs.  | [optional] [default to mp3_44100_128] |
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

<a name="convertTextToSpeechStream"></a>
# **convertTextToSpeechStream**
> convertTextToSpeechStream(voiceId, bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost).optimizeStreamingLatency(optimizeStreamingLatency).outputFormat(outputFormat).xiApiKey(xiApiKey).execute();

Text To Speech

Converts text into speech using a voice of your choice and returns audio as an audio stream.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TextToSpeechApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String text = "text_example"; // The text that will get converted into speech.
    String voiceId = "21m00Tcm4TlvDq8ikWAM"; // Voice ID to be used, you can use https://api.elevenlabs.io/v1/voices to list all the available voices.
    String modelId = "eleven_monolingual_v1"; // Identifier of the model that will be used, you can query them using GET /v1/models. The model needs to have support for text to speech, you can check this using the can_do_text_to_speech property.
    VoiceSettingsResponseModel voiceSettings = new VoiceSettingsResponseModel(); // Voice settings overriding stored setttings for the given voice. They are applied only on the given request.
    List<PronunciationDictionaryVersionLocatorDBModel> pronunciationDictionaryLocators = Arrays.asList(); // A list of pronunciation dictionary locators (id, version_id) to be applied to the text. They will be applied in order. You may have up to 3 locators per request
    Integer optimizeStreamingLatency = 0; // You can turn on latency optimizations at some cost of quality. The best possible final latency varies by model. Possible values: 0 - default mode (no latency optimizations) 1 - normal latency optimizations (about 50% of possible latency improvement of option 3) 2 - strong latency optimizations (about 75% of possible latency improvement of option 3) 3 - max latency optimizations 4 - max latency optimizations, but also with text normalizer turned off for even more latency savings (best latency, but can mispronounce eg numbers and dates).  Defaults to 0. 
    String outputFormat = "mp3_44100_128"; // Output format of the generated audio. Must be one of: mp3_22050_32 - output format, mp3 with 22.05kHz sample rate at 32kbps. mp3_44100_32 - output format, mp3 with 44.1kHz sample rate at 32kbps. mp3_44100_64 - output format, mp3 with 44.1kHz sample rate at 64kbps. mp3_44100_96 - output format, mp3 with 44.1kHz sample rate at 96kbps. mp3_44100_128 - default output format, mp3 with 44.1kHz sample rate at 128kbps. mp3_44100_192 - output format, mp3 with 44.1kHz sample rate at 192kbps. Requires you to be subscribed to Creator tier or above. pcm_16000 - PCM format (S16LE) with 16kHz sample rate. pcm_22050 - PCM format (S16LE) with 22.05kHz sample rate. pcm_24000 - PCM format (S16LE) with 24kHz sample rate. pcm_44100 - PCM format (S16LE) with 44.1kHz sample rate. Requires you to be subscribed to Independent Publisher tier or above. ulaw_8000 - μ-law format (sometimes written mu-law, often approximated as u-law) with 8kHz sample rate. Note that this format is commonly used for Twilio audio inputs. 
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      client
              .textToSpeech
              .convertTextToSpeechStream(text, voiceId)
              .modelId(modelId)
              .voiceSettings(voiceSettings)
              .pronunciationDictionaryLocators(pronunciationDictionaryLocators)
              .optimizeStreamingLatency(optimizeStreamingLatency)
              .outputFormat(outputFormat)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TextToSpeechApi#convertTextToSpeechStream");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .textToSpeech
              .convertTextToSpeechStream(text, voiceId)
              .modelId(modelId)
              .voiceSettings(voiceSettings)
              .pronunciationDictionaryLocators(pronunciationDictionaryLocators)
              .optimizeStreamingLatency(optimizeStreamingLatency)
              .outputFormat(outputFormat)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TextToSpeechApi#convertTextToSpeechStream");
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
| **bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost** | [**BodyTextToSpeechV1TextToSpeechVoiceIdStreamPost**](BodyTextToSpeechV1TextToSpeechVoiceIdStreamPost.md)|  | |
| **optimizeStreamingLatency** | **Integer**| You can turn on latency optimizations at some cost of quality. The best possible final latency varies by model. Possible values: 0 - default mode (no latency optimizations) 1 - normal latency optimizations (about 50% of possible latency improvement of option 3) 2 - strong latency optimizations (about 75% of possible latency improvement of option 3) 3 - max latency optimizations 4 - max latency optimizations, but also with text normalizer turned off for even more latency savings (best latency, but can mispronounce eg numbers and dates).  Defaults to 0.  | [optional] [default to 0] |
| **outputFormat** | **String**| Output format of the generated audio. Must be one of: mp3_22050_32 - output format, mp3 with 22.05kHz sample rate at 32kbps. mp3_44100_32 - output format, mp3 with 44.1kHz sample rate at 32kbps. mp3_44100_64 - output format, mp3 with 44.1kHz sample rate at 64kbps. mp3_44100_96 - output format, mp3 with 44.1kHz sample rate at 96kbps. mp3_44100_128 - default output format, mp3 with 44.1kHz sample rate at 128kbps. mp3_44100_192 - output format, mp3 with 44.1kHz sample rate at 192kbps. Requires you to be subscribed to Creator tier or above. pcm_16000 - PCM format (S16LE) with 16kHz sample rate. pcm_22050 - PCM format (S16LE) with 22.05kHz sample rate. pcm_24000 - PCM format (S16LE) with 24kHz sample rate. pcm_44100 - PCM format (S16LE) with 44.1kHz sample rate. Requires you to be subscribed to Independent Publisher tier or above. ulaw_8000 - μ-law format (sometimes written mu-law, often approximated as u-law) with 8kHz sample rate. Note that this format is commonly used for Twilio audio inputs.  | [optional] [default to mp3_44100_128] |
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

