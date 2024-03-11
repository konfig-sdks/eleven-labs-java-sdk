# VoicesApi

All URIs are relative to *https://api.elevenlabs.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addToCollection**](VoicesApi.md#addToCollection) | **POST** /v1/voices/add/{public_user_id}/{voice_id} | Add Sharing Voice |
| [**addVoiceToCollection**](VoicesApi.md#addVoiceToCollection) | **POST** /v1/voices/add | Add Voice |
| [**deleteById**](VoicesApi.md#deleteById) | **DELETE** /v1/voices/{voice_id} | Delete Voice |
| [**editSettingsPost**](VoicesApi.md#editSettingsPost) | **POST** /v1/voices/{voice_id}/settings/edit | Edit Voice Settings |
| [**getDefaultVoiceSettings**](VoicesApi.md#getDefaultVoiceSettings) | **GET** /v1/voices/settings/default | Get Default Voice Settings. |
| [**getSettings**](VoicesApi.md#getSettings) | **GET** /v1/voices/{voice_id}/settings | Get Voice Settings |
| [**getSharedVoices**](VoicesApi.md#getSharedVoices) | **GET** /v1/shared-voices | Get Voices |
| [**getVoiceMetadata**](VoicesApi.md#getVoiceMetadata) | **GET** /v1/voices/{voice_id} | Get Voice |
| [**listAllVoices**](VoicesApi.md#listAllVoices) | **GET** /v1/voices | Get Voices |
| [**updateVoiceById**](VoicesApi.md#updateVoiceById) | **POST** /v1/voices/{voice_id}/edit | Edit Voice |


<a name="addToCollection"></a>
# **addToCollection**
> AddVoiceResponseModel addToCollection(publicUserId, voiceId, bodyAddSharingVoiceV1VoicesAddPublicUserIdVoiceIdPost).xiApiKey(xiApiKey).execute();

Add Sharing Voice

Add a sharing voice to your collection of voices in VoiceLab.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoicesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String newName = "newName_example"; // The name that identifies this voice. This will be displayed in the dropdown of the website.
    String publicUserId = "63e06b7e7cafdc46be4d2e0b3f045940231ae058d508589653d74d1265a574ca"; // Public user ID used to publicly identify ElevenLabs users.
    String voiceId = "21m00Tcm4TlvDq8ikWAM"; // Voice ID to be used, you can use https://api.elevenlabs.io/v1/voices to list all the available voices.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      AddVoiceResponseModel result = client
              .voices
              .addToCollection(newName, publicUserId, voiceId)
              .xiApiKey(xiApiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getVoiceId());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#addToCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddVoiceResponseModel> response = client
              .voices
              .addToCollection(newName, publicUserId, voiceId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#addToCollection");
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
| **publicUserId** | **String**| Public user ID used to publicly identify ElevenLabs users. | |
| **voiceId** | **String**| Voice ID to be used, you can use https://api.elevenlabs.io/v1/voices to list all the available voices. | |
| **bodyAddSharingVoiceV1VoicesAddPublicUserIdVoiceIdPost** | [**BodyAddSharingVoiceV1VoicesAddPublicUserIdVoiceIdPost**](BodyAddSharingVoiceV1VoicesAddPublicUserIdVoiceIdPost.md)|  | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

[**AddVoiceResponseModel**](AddVoiceResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="addVoiceToCollection"></a>
# **addVoiceToCollection**
> AddVoiceResponseModel addVoiceToCollection(name, files, bodyAddVoiceV1VoicesAddPost).xiApiKey(xiApiKey).description(description).labels(labels).execute();

Add Voice

Add a new voice to your collection of voices in VoiceLab.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoicesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String name = "name_example"; // The name that identifies this voice. This will be displayed in the dropdown of the website.
    List<File> files = Arrays.asList(); // One or more audio files to clone the voice from
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    String description = "description_example"; // How would you describe the voice?
    String labels = "labels_example"; // Serialized labels dictionary for the voice.
    try {
      AddVoiceResponseModel result = client
              .voices
              .addVoiceToCollection(name, files)
              .xiApiKey(xiApiKey)
              .description(description)
              .labels(labels)
              .execute();
      System.out.println(result);
      System.out.println(result.getVoiceId());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#addVoiceToCollection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddVoiceResponseModel> response = client
              .voices
              .addVoiceToCollection(name, files)
              .xiApiKey(xiApiKey)
              .description(description)
              .labels(labels)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#addVoiceToCollection");
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
| **name** | **String**| The name that identifies this voice. This will be displayed in the dropdown of the website. | |
| **files** | **List&lt;File&gt;**| One or more audio files to clone the voice from | |
| **bodyAddVoiceV1VoicesAddPost** | [**BodyAddVoiceV1VoicesAddPost**](BodyAddVoiceV1VoicesAddPost.md)|  | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |
| **description** | **String**| How would you describe the voice? | [optional] |
| **labels** | **String**| Serialized labels dictionary for the voice. | [optional] |

### Return type

[**AddVoiceResponseModel**](AddVoiceResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="deleteById"></a>
# **deleteById**
> Object deleteById(voiceId).xiApiKey(xiApiKey).execute();

Delete Voice

Deletes a voice by its ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoicesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String voiceId = "21m00Tcm4TlvDq8ikWAM"; // Voice ID to be used, you can use https://api.elevenlabs.io/v1/voices to list all the available voices.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      Object result = client
              .voices
              .deleteById(voiceId)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .voices
              .deleteById(voiceId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#deleteById");
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

<a name="editSettingsPost"></a>
# **editSettingsPost**
> Object editSettingsPost(voiceId, voiceSettingsResponseModel).xiApiKey(xiApiKey).execute();

Edit Voice Settings

Edit your settings for a specific voice. \&quot;similarity_boost\&quot; corresponds to\&quot;Clarity + Similarity Enhancement\&quot; in the web app and \&quot;stability\&quot; corresponds to \&quot;Stability\&quot; slider in the web app.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoicesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    Double stability = 3.4D;
    Double similarityBoost = 3.4D;
    String voiceId = "21m00Tcm4TlvDq8ikWAM"; // Voice ID to be used, you can use https://api.elevenlabs.io/v1/voices to list all the available voices.
    Double style = 0D;
    Boolean useSpeakerBoost = true;
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      Object result = client
              .voices
              .editSettingsPost(stability, similarityBoost, voiceId)
              .style(style)
              .useSpeakerBoost(useSpeakerBoost)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#editSettingsPost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .voices
              .editSettingsPost(stability, similarityBoost, voiceId)
              .style(style)
              .useSpeakerBoost(useSpeakerBoost)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#editSettingsPost");
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
| **voiceSettingsResponseModel** | [**VoiceSettingsResponseModel**](VoiceSettingsResponseModel.md)|  | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getDefaultVoiceSettings"></a>
# **getDefaultVoiceSettings**
> VoiceSettingsResponseModel getDefaultVoiceSettings().execute();

Get Default Voice Settings.

Gets the default settings for voices. \&quot;similarity_boost\&quot; corresponds to\&quot;Clarity + Similarity Enhancement\&quot; in the web app and \&quot;stability\&quot; corresponds to \&quot;Stability\&quot; slider in the web app.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoicesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    try {
      VoiceSettingsResponseModel result = client
              .voices
              .getDefaultVoiceSettings()
              .execute();
      System.out.println(result);
      System.out.println(result.getStability());
      System.out.println(result.getSimilarityBoost());
      System.out.println(result.getStyle());
      System.out.println(result.getUseSpeakerBoost());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#getDefaultVoiceSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VoiceSettingsResponseModel> response = client
              .voices
              .getDefaultVoiceSettings()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#getDefaultVoiceSettings");
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

[**VoiceSettingsResponseModel**](VoiceSettingsResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getSettings"></a>
# **getSettings**
> VoiceSettingsResponseModel getSettings(voiceId).xiApiKey(xiApiKey).execute();

Get Voice Settings

Returns the settings for a specific voice. \&quot;similarity_boost\&quot; corresponds to\&quot;Clarity + Similarity Enhancement\&quot; in the web app and \&quot;stability\&quot; corresponds to \&quot;Stability\&quot; slider in the web app.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoicesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String voiceId = "21m00Tcm4TlvDq8ikWAM"; // Voice ID to be used, you can use https://api.elevenlabs.io/v1/voices to list all the available voices.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      VoiceSettingsResponseModel result = client
              .voices
              .getSettings(voiceId)
              .xiApiKey(xiApiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getStability());
      System.out.println(result.getSimilarityBoost());
      System.out.println(result.getStyle());
      System.out.println(result.getUseSpeakerBoost());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#getSettings");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VoiceSettingsResponseModel> response = client
              .voices
              .getSettings(voiceId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#getSettings");
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
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

[**VoiceSettingsResponseModel**](VoiceSettingsResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getSharedVoices"></a>
# **getSharedVoices**
> GetLibraryVoicesResponseModel getSharedVoices().pageSize(pageSize).category(category).gender(gender).age(age).accent(accent).search(search).useCases(useCases).descriptives(descriptives).sort(sort).featured(featured).page(page).xiApiKey(xiApiKey).execute();

Get Voices

Gets a list of shared voices.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoicesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    Integer pageSize = 30; // How many shared voices to return at maximum. Can not exceed 500, defaults to 30.
    String category = "professional"; // voice category used for filtering
    String gender = "male"; // gender used for filtering
    String age = "young"; // age used for filtering
    String accent = "american"; // accent used for filtering
    String search = "tiktok"; // search term used for filtering
    List<String> useCases = Arrays.asList(); // use-case used for filtering
    List<String> descriptives = Arrays.asList(); // search term used for filtering
    String sort = "created_date"; // sort criteria
    Boolean featured = false; // Filter featured voices
    Integer page = 0;
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      GetLibraryVoicesResponseModel result = client
              .voices
              .getSharedVoices()
              .pageSize(pageSize)
              .category(category)
              .gender(gender)
              .age(age)
              .accent(accent)
              .search(search)
              .useCases(useCases)
              .descriptives(descriptives)
              .sort(sort)
              .featured(featured)
              .page(page)
              .xiApiKey(xiApiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getVoices());
      System.out.println(result.getLastSortId());
      System.out.println(result.getHasMore());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#getSharedVoices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetLibraryVoicesResponseModel> response = client
              .voices
              .getSharedVoices()
              .pageSize(pageSize)
              .category(category)
              .gender(gender)
              .age(age)
              .accent(accent)
              .search(search)
              .useCases(useCases)
              .descriptives(descriptives)
              .sort(sort)
              .featured(featured)
              .page(page)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#getSharedVoices");
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
| **pageSize** | **Integer**| How many shared voices to return at maximum. Can not exceed 500, defaults to 30. | [optional] [default to 30] |
| **category** | **String**| voice category used for filtering | [optional] |
| **gender** | **String**| gender used for filtering | [optional] |
| **age** | **String**| age used for filtering | [optional] |
| **accent** | **String**| accent used for filtering | [optional] |
| **search** | **String**| search term used for filtering | [optional] |
| **useCases** | [**List&lt;String&gt;**](String.md)| use-case used for filtering | [optional] |
| **descriptives** | [**List&lt;String&gt;**](String.md)| search term used for filtering | [optional] |
| **sort** | **String**| sort criteria | [optional] |
| **featured** | **Boolean**| Filter featured voices | [optional] [default to false] |
| **page** | **Integer**|  | [optional] [default to 0] |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

[**GetLibraryVoicesResponseModel**](GetLibraryVoicesResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getVoiceMetadata"></a>
# **getVoiceMetadata**
> VoiceResponseModel getVoiceMetadata(voiceId).withSettings(withSettings).xiApiKey(xiApiKey).execute();

Get Voice

Returns metadata about a specific voice.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoicesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String voiceId = "21m00Tcm4TlvDq8ikWAM"; // Voice ID to be used, you can use https://api.elevenlabs.io/v1/voices to list all the available voices.
    Boolean withSettings = false; // If set will return settings information corresponding to the voice, requires authorization.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      VoiceResponseModel result = client
              .voices
              .getVoiceMetadata(voiceId)
              .withSettings(withSettings)
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
      System.err.println("Exception when calling VoicesApi#getVoiceMetadata");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VoiceResponseModel> response = client
              .voices
              .getVoiceMetadata(voiceId)
              .withSettings(withSettings)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#getVoiceMetadata");
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
| **withSettings** | **Boolean**| If set will return settings information corresponding to the voice, requires authorization. | [optional] [default to false] |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

[**VoiceResponseModel**](VoiceResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="listAllVoices"></a>
# **listAllVoices**
> GetVoicesResponseModel listAllVoices().xiApiKey(xiApiKey).execute();

Get Voices

Gets a list of all available voices for a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoicesApi;
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
      GetVoicesResponseModel result = client
              .voices
              .listAllVoices()
              .xiApiKey(xiApiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getVoices());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#listAllVoices");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetVoicesResponseModel> response = client
              .voices
              .listAllVoices()
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#listAllVoices");
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

[**GetVoicesResponseModel**](GetVoicesResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="updateVoiceById"></a>
# **updateVoiceById**
> Object updateVoiceById(voiceId, name, bodyEditVoiceV1VoicesVoiceIdEditPost).xiApiKey(xiApiKey).description(description).files(files).labels(labels).execute();

Edit Voice

Edit a voice created by you.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VoicesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String voiceId = "21m00Tcm4TlvDq8ikWAM"; // Voice ID to be used, you can use https://api.elevenlabs.io/v1/voices to list all the available voices.
    String name = "name_example"; // The name that identifies this voice. This will be displayed in the dropdown of the website.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    String description = "description_example"; // How would you describe the voice?
    List<File> files = Arrays.asList(); // Audio files to add to the voice
    String labels = "labels_example"; // Serialized labels dictionary for the voice.
    try {
      Object result = client
              .voices
              .updateVoiceById(voiceId, name)
              .xiApiKey(xiApiKey)
              .description(description)
              .files(files)
              .labels(labels)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#updateVoiceById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .voices
              .updateVoiceById(voiceId, name)
              .xiApiKey(xiApiKey)
              .description(description)
              .files(files)
              .labels(labels)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VoicesApi#updateVoiceById");
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
| **name** | **String**| The name that identifies this voice. This will be displayed in the dropdown of the website. | |
| **bodyEditVoiceV1VoicesVoiceIdEditPost** | [**BodyEditVoiceV1VoicesVoiceIdEditPost**](BodyEditVoiceV1VoicesVoiceIdEditPost.md)|  | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |
| **description** | **String**| How would you describe the voice? | [optional] |
| **files** | **List&lt;File&gt;**| Audio files to add to the voice | [optional] |
| **labels** | **String**| Serialized labels dictionary for the voice. | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

