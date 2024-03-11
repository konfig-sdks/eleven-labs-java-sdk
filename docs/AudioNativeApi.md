# AudioNativeApi

All URIs are relative to *https://api.elevenlabs.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProjectWithEmbeddableHtml**](AudioNativeApi.md#createProjectWithEmbeddableHtml) | **POST** /v1/audio-native | Creates Audionative Enabled Project. |


<a name="createProjectWithEmbeddableHtml"></a>
# **createProjectWithEmbeddableHtml**
> AudioNativeCreateProjectResponseModel createProjectWithEmbeddableHtml(name, _file, bodyCreatesAudioNativeEnabledProjectV1AudioNativePost).xiApiKey(xiApiKey).title(title).image(image).author(author).small(small).textColor(textColor).backgroundColor(backgroundColor).sessionization(sessionization).voiceId(voiceId).modelId(modelId).autoConvert(autoConvert).execute();

Creates Audionative Enabled Project.

Creates AudioNative enabled project, optionally starts conversion and returns project id and embeddable html snippet.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AudioNativeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String name = "name_example"; // Project name.
    File _file = new File("/path/to/file"); // Either txt or HTML input file containing the article content. HTML should be formatted as follows '&lt;html&gt;&lt;body&gt;&lt;div&gt;&lt;p&gt;Your content&lt;/p&gt;&lt;h5&gt;More of your content&lt;/h5&gt;&lt;p&gt;Some more of your content&lt;/p&gt;&lt;/div&gt;&lt;/body&gt;&lt;/html&gt;'
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    String title = "title_example"; // Title used in the player and inserted at the top of the uploaded article. If not provided, the default title set in the Player settings is used.
    String image = "image_example"; // Image URL used in the player. If not provided, default image set in the Player settings is used.
    String author = "author_example"; // Author used in the player and inserted at the start of the uploaded article. If not provided, the default author set in the Player settings is used.
    Boolean small = false; // Whether to use small player or not. If not provided, default value set in the Player settings is used.
    String textColor = "textColor_example"; // Text color used in the player. If not provided, default text color set in the Player settings is used.
    String backgroundColor = "backgroundColor_example"; // Background color used in the player. If not provided, default background color set in the Player settings is used.
    Integer sessionization = 0; // Specifies for how many minutes to persist the session across page reloads. If not provided, default sessionization set in the Player settings is used.
    String voiceId = "voiceId_example"; // Voice ID used to voice the content. If not provided, default voice ID set in the Player settings is used.
    String modelId = "modelId_example"; // TTS Model ID used in the player. If not provided, default model ID set in the Player settings is used.
    Boolean autoConvert = false; // Whether to auto convert the project to audio or not.
    try {
      AudioNativeCreateProjectResponseModel result = client
              .audioNative
              .createProjectWithEmbeddableHtml(name, _file)
              .xiApiKey(xiApiKey)
              .title(title)
              .image(image)
              .author(author)
              .small(small)
              .textColor(textColor)
              .backgroundColor(backgroundColor)
              .sessionization(sessionization)
              .voiceId(voiceId)
              .modelId(modelId)
              .autoConvert(autoConvert)
              .execute();
      System.out.println(result);
      System.out.println(result.getProjectId());
      System.out.println(result.getConverting());
      System.out.println(result.getHtmlSnippet());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioNativeApi#createProjectWithEmbeddableHtml");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AudioNativeCreateProjectResponseModel> response = client
              .audioNative
              .createProjectWithEmbeddableHtml(name, _file)
              .xiApiKey(xiApiKey)
              .title(title)
              .image(image)
              .author(author)
              .small(small)
              .textColor(textColor)
              .backgroundColor(backgroundColor)
              .sessionization(sessionization)
              .voiceId(voiceId)
              .modelId(modelId)
              .autoConvert(autoConvert)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AudioNativeApi#createProjectWithEmbeddableHtml");
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
| **name** | **String**| Project name. | |
| **_file** | **File**| Either txt or HTML input file containing the article content. HTML should be formatted as follows &#39;&amp;lt;html&amp;gt;&amp;lt;body&amp;gt;&amp;lt;div&amp;gt;&amp;lt;p&amp;gt;Your content&amp;lt;/p&amp;gt;&amp;lt;h5&amp;gt;More of your content&amp;lt;/h5&amp;gt;&amp;lt;p&amp;gt;Some more of your content&amp;lt;/p&amp;gt;&amp;lt;/div&amp;gt;&amp;lt;/body&amp;gt;&amp;lt;/html&amp;gt;&#39; | |
| **bodyCreatesAudioNativeEnabledProjectV1AudioNativePost** | [**BodyCreatesAudioNativeEnabledProjectV1AudioNativePost**](BodyCreatesAudioNativeEnabledProjectV1AudioNativePost.md)|  | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |
| **title** | **String**| Title used in the player and inserted at the top of the uploaded article. If not provided, the default title set in the Player settings is used. | [optional] |
| **image** | **String**| Image URL used in the player. If not provided, default image set in the Player settings is used. | [optional] |
| **author** | **String**| Author used in the player and inserted at the start of the uploaded article. If not provided, the default author set in the Player settings is used. | [optional] |
| **small** | **Boolean**| Whether to use small player or not. If not provided, default value set in the Player settings is used. | [optional] [default to false] |
| **textColor** | **String**| Text color used in the player. If not provided, default text color set in the Player settings is used. | [optional] |
| **backgroundColor** | **String**| Background color used in the player. If not provided, default background color set in the Player settings is used. | [optional] |
| **sessionization** | **Integer**| Specifies for how many minutes to persist the session across page reloads. If not provided, default sessionization set in the Player settings is used. | [optional] [default to 0] |
| **voiceId** | **String**| Voice ID used to voice the content. If not provided, default voice ID set in the Player settings is used. | [optional] |
| **modelId** | **String**| TTS Model ID used in the player. If not provided, default model ID set in the Player settings is used. | [optional] |
| **autoConvert** | **Boolean**| Whether to auto convert the project to audio or not. | [optional] [default to false] |

### Return type

[**AudioNativeCreateProjectResponseModel**](AudioNativeCreateProjectResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

