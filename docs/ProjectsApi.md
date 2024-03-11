# ProjectsApi

All URIs are relative to *https://api.elevenlabs.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewProject**](ProjectsApi.md#createNewProject) | **POST** /v1/projects/add | Add Project |
| [**deleteById**](ProjectsApi.md#deleteById) | **DELETE** /v1/projects/{project_id} | Delete Project |
| [**deleteChapterById**](ProjectsApi.md#deleteChapterById) | **DELETE** /v1/projects/{project_id}/chapters/{chapter_id} | Delete Chapter |
| [**getAllProjects**](ProjectsApi.md#getAllProjects) | **GET** /v1/projects | Get Projects |
| [**getById**](ProjectsApi.md#getById) | **GET** /v1/projects/{project_id} | Get Project By Id |
| [**getChapterById**](ProjectsApi.md#getChapterById) | **GET** /v1/projects/{project_id}/chapters/{chapter_id} | Get Chapter By Id |
| [**getChapterSnapshots**](ProjectsApi.md#getChapterSnapshots) | **GET** /v1/projects/{project_id}/chapters/{chapter_id}/snapshots | Get Chapter Snapshots |
| [**listChapters**](ProjectsApi.md#listChapters) | **GET** /v1/projects/{project_id}/chapters | Get Chapters |
| [**listSnapshots**](ProjectsApi.md#listSnapshots) | **GET** /v1/projects/{project_id}/snapshots | Get Project Snapshots |
| [**startChapterConversion**](ProjectsApi.md#startChapterConversion) | **POST** /v1/projects/{project_id}/chapters/{chapter_id}/convert | Convert Chapter |
| [**startConversion**](ProjectsApi.md#startConversion) | **POST** /v1/projects/{project_id}/convert | Convert Project |
| [**streamAudioFromSnapshot**](ProjectsApi.md#streamAudioFromSnapshot) | **POST** /v1/projects/{project_id}/snapshots/{project_snapshot_id}/stream | Stream Project Audio |
| [**streamAudioFromSnapshotPost**](ProjectsApi.md#streamAudioFromSnapshotPost) | **POST** /v1/projects/{project_id}/chapters/{chapter_id}/snapshots/{chapter_snapshot_id}/stream | Stream Chapter Audio |
| [**updatePronunciationDictionaries**](ProjectsApi.md#updatePronunciationDictionaries) | **POST** /v1/projects/{project_id}/update-pronunciation-dictionaries | Update Pronunciation Dictionaries |


<a name="createNewProject"></a>
# **createNewProject**
> AddProjectResponseModel createNewProject(name, defaultTitleVoiceId, defaultParagraphVoiceId, defaultModelId, pronunciationDictionaryLocators, bodyAddProjectV1ProjectsAddPost).xiApiKey(xiApiKey).title(title).fromUrl(fromUrl).fromDocument(fromDocument).qualityPreset(qualityPreset).author(author).isbnNumber(isbnNumber).acxVolumeNormalization(acxVolumeNormalization).volumeNormalization(volumeNormalization).callbackUrl(callbackUrl).execute();

Add Project

Creates a new project, it can be either initialized as blank, from a document or from a URL.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String name = "name_example"; // The name of the project, used for identification only.
    String defaultTitleVoiceId = "defaultTitleVoiceId_example"; // The voice_id that corresponds to the default voice used for new titles.
    String defaultParagraphVoiceId = "defaultParagraphVoiceId_example"; // The voice_id that corresponds to the default voice used for new paragraphs.
    String defaultModelId = "defaultModelId_example"; // The model_id of the model to be used for this project, you can query GET https://api.elevenlabs.io/v1/models to list all available models.
    List<String> pronunciationDictionaryLocators = Arrays.asList(); // A list of pronunciation dictionary locators (id, version_id) encoded as a list of JSON strings for pronunciation dictionaries to be applied to the text.  A list of json encoded strings is required as adding projects may occur through formData as opposed to jsonBody
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    String title = "title_example"; // An optional name of the author of the project, this will be added as metadata to the mp3 file on project / chapter download.
    String fromUrl = "fromUrl_example"; // An optional URL from which we will extract content to initialize the project. If this is set, 'from_url' must be null. If neither 'from_url' or 'from_document' are provided we will initialize the project as blank.
    File fromDocument = new File("/path/to/file"); // An optional .epub, .pdf, .txt or similar file can be provided. If provided, we will initialize the project with its content. If this is set, 'from_url' must be null.  If neither 'from_url' or 'from_document' are provided we will initialize the project as blank.
    String qualityPreset = "standard"; // Output quality of the generated audio. Must be one of: standard - standard output format, 128kbps with 44.1kHz sample rate. high - high quality output format, 192kbps with 44.1kHz sample rate and major improvements on our side. Using this setting increases the character cost by 20%. ultra - ultra quality output format, 192kbps with 44.1kHz sample rate and highest improvements on our side. Using this setting increases the character cost by 50%. 
    String author = "author_example"; // An optional name of the author of the project, this will be added as metadata to the mp3 file on project / chapter download.
    String isbnNumber = "isbnNumber_example"; // An optional ISBN number of the project you want to create, this will be added as metadata to the mp3 file on project / chapter download.
    Boolean acxVolumeNormalization = false; // [Deprecated] When the project is downloaded, should the returned audio have postprocessing in order to make it compliant with audiobook normalized volume requirements
    Boolean volumeNormalization = false; // When the project is downloaded, should the returned audio have postprocessing in order to make it compliant with audiobook normalized volume requirements
    String callbackUrl = "callbackUrl_example"; // A url that will be called by our service when the project is converted with a json containing the status of the conversion
    try {
      AddProjectResponseModel result = client
              .projects
              .createNewProject(name, defaultTitleVoiceId, defaultParagraphVoiceId, defaultModelId, pronunciationDictionaryLocators)
              .xiApiKey(xiApiKey)
              .title(title)
              .fromUrl(fromUrl)
              .fromDocument(fromDocument)
              .qualityPreset(qualityPreset)
              .author(author)
              .isbnNumber(isbnNumber)
              .acxVolumeNormalization(acxVolumeNormalization)
              .volumeNormalization(volumeNormalization)
              .callbackUrl(callbackUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getProject());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createNewProject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AddProjectResponseModel> response = client
              .projects
              .createNewProject(name, defaultTitleVoiceId, defaultParagraphVoiceId, defaultModelId, pronunciationDictionaryLocators)
              .xiApiKey(xiApiKey)
              .title(title)
              .fromUrl(fromUrl)
              .fromDocument(fromDocument)
              .qualityPreset(qualityPreset)
              .author(author)
              .isbnNumber(isbnNumber)
              .acxVolumeNormalization(acxVolumeNormalization)
              .volumeNormalization(volumeNormalization)
              .callbackUrl(callbackUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createNewProject");
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
| **name** | **String**| The name of the project, used for identification only. | |
| **defaultTitleVoiceId** | **String**| The voice_id that corresponds to the default voice used for new titles. | |
| **defaultParagraphVoiceId** | **String**| The voice_id that corresponds to the default voice used for new paragraphs. | |
| **defaultModelId** | **String**| The model_id of the model to be used for this project, you can query GET https://api.elevenlabs.io/v1/models to list all available models. | |
| **pronunciationDictionaryLocators** | [**List&lt;String&gt;**](String.md)| A list of pronunciation dictionary locators (id, version_id) encoded as a list of JSON strings for pronunciation dictionaries to be applied to the text.  A list of json encoded strings is required as adding projects may occur through formData as opposed to jsonBody | |
| **bodyAddProjectV1ProjectsAddPost** | [**BodyAddProjectV1ProjectsAddPost**](BodyAddProjectV1ProjectsAddPost.md)|  | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |
| **title** | **String**| An optional name of the author of the project, this will be added as metadata to the mp3 file on project / chapter download. | [optional] |
| **fromUrl** | **String**| An optional URL from which we will extract content to initialize the project. If this is set, &#39;from_url&#39; must be null. If neither &#39;from_url&#39; or &#39;from_document&#39; are provided we will initialize the project as blank. | [optional] |
| **fromDocument** | **File**| An optional .epub, .pdf, .txt or similar file can be provided. If provided, we will initialize the project with its content. If this is set, &#39;from_url&#39; must be null.  If neither &#39;from_url&#39; or &#39;from_document&#39; are provided we will initialize the project as blank. | [optional] |
| **qualityPreset** | **String**| Output quality of the generated audio. Must be one of: standard - standard output format, 128kbps with 44.1kHz sample rate. high - high quality output format, 192kbps with 44.1kHz sample rate and major improvements on our side. Using this setting increases the character cost by 20%. ultra - ultra quality output format, 192kbps with 44.1kHz sample rate and highest improvements on our side. Using this setting increases the character cost by 50%.  | [optional] [default to standard] |
| **author** | **String**| An optional name of the author of the project, this will be added as metadata to the mp3 file on project / chapter download. | [optional] |
| **isbnNumber** | **String**| An optional ISBN number of the project you want to create, this will be added as metadata to the mp3 file on project / chapter download. | [optional] |
| **acxVolumeNormalization** | **Boolean**| [Deprecated] When the project is downloaded, should the returned audio have postprocessing in order to make it compliant with audiobook normalized volume requirements | [optional] [default to false] |
| **volumeNormalization** | **Boolean**| When the project is downloaded, should the returned audio have postprocessing in order to make it compliant with audiobook normalized volume requirements | [optional] [default to false] |
| **callbackUrl** | **String**| A url that will be called by our service when the project is converted with a json containing the status of the conversion | [optional] |

### Return type

[**AddProjectResponseModel**](AddProjectResponseModel.md)

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
> Object deleteById(projectId).xiApiKey(xiApiKey).execute();

Delete Project

Delete a project by its project_id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String projectId = "21m00Tcm4TlvDq8ikWAM"; // The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      Object result = client
              .projects
              .deleteById(projectId)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .projects
              .deleteById(projectId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteById");
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
| **projectId** | **String**| The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects. | |
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

<a name="deleteChapterById"></a>
# **deleteChapterById**
> Object deleteChapterById(projectId, chapterId).xiApiKey(xiApiKey).execute();

Delete Chapter

Delete a chapter by its chapter_id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String projectId = "21m00Tcm4TlvDq8ikWAM"; // The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects.
    String chapterId = "21m00Tcm4TlvDq8ikWAM"; // The chapter_id of the chapter. You can query GET https://api.elevenlabs.io/v1/projects/{project_id}/chapters to list all available chapters for a project.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      Object result = client
              .projects
              .deleteChapterById(projectId, chapterId)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteChapterById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .projects
              .deleteChapterById(projectId, chapterId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteChapterById");
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
| **projectId** | **String**| The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects. | |
| **chapterId** | **String**| The chapter_id of the chapter. You can query GET https://api.elevenlabs.io/v1/projects/{project_id}/chapters to list all available chapters for a project. | |
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

<a name="getAllProjects"></a>
# **getAllProjects**
> GetProjectsResponseModel getAllProjects().xiApiKey(xiApiKey).execute();

Get Projects

Returns a list of your projects together and its metadata.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
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
      GetProjectsResponseModel result = client
              .projects
              .getAllProjects()
              .xiApiKey(xiApiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getProjects());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getAllProjects");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetProjectsResponseModel> response = client
              .projects
              .getAllProjects()
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getAllProjects");
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

[**GetProjectsResponseModel**](GetProjectsResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getById"></a>
# **getById**
> ProjectExtendedResponseModel getById(projectId).xiApiKey(xiApiKey).execute();

Get Project By Id

Returns information about a specific project. This endpoint returns more detailed information about a project than GET api.elevenlabs.io/v1/projects.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String projectId = "21m00Tcm4TlvDq8ikWAM"; // The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      ProjectExtendedResponseModel result = client
              .projects
              .getById(projectId)
              .xiApiKey(xiApiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getProjectId());
      System.out.println(result.getName());
      System.out.println(result.getCreateDateUnix());
      System.out.println(result.getDefaultTitleVoiceId());
      System.out.println(result.getDefaultParagraphVoiceId());
      System.out.println(result.getDefaultModelId());
      System.out.println(result.getLastConversionDateUnix());
      System.out.println(result.getCanBeDownloaded());
      System.out.println(result.getState());
      System.out.println(result.getChapters());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectExtendedResponseModel> response = client
              .projects
              .getById(projectId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getById");
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
| **projectId** | **String**| The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects. | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

[**ProjectExtendedResponseModel**](ProjectExtendedResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getChapterById"></a>
# **getChapterById**
> ChapterResponseModel getChapterById(projectId, chapterId).xiApiKey(xiApiKey).execute();

Get Chapter By Id

Returns information about a specific chapter.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String projectId = "21m00Tcm4TlvDq8ikWAM"; // The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects.
    String chapterId = "21m00Tcm4TlvDq8ikWAM"; // The chapter_id of the chapter. You can query GET https://api.elevenlabs.io/v1/projects/{project_id}/chapters to list all available chapters for a project.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      ChapterResponseModel result = client
              .projects
              .getChapterById(projectId, chapterId)
              .xiApiKey(xiApiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getChapterId());
      System.out.println(result.getName());
      System.out.println(result.getLastConversionDateUnix());
      System.out.println(result.getConversionProgress());
      System.out.println(result.getCanBeDownloaded());
      System.out.println(result.getState());
      System.out.println(result.getStatistics());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getChapterById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChapterResponseModel> response = client
              .projects
              .getChapterById(projectId, chapterId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getChapterById");
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
| **projectId** | **String**| The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects. | |
| **chapterId** | **String**| The chapter_id of the chapter. You can query GET https://api.elevenlabs.io/v1/projects/{project_id}/chapters to list all available chapters for a project. | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

[**ChapterResponseModel**](ChapterResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getChapterSnapshots"></a>
# **getChapterSnapshots**
> ChapterSnapshotsResponseModel getChapterSnapshots(projectId, chapterId).xiApiKey(xiApiKey).execute();

Get Chapter Snapshots

Gets information about all the snapshots of a chapter, each snapshot corresponds can be downloaded as audio. Whenever a chapter is converted a snapshot will be automatically created.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String projectId = "21m00Tcm4TlvDq8ikWAM"; // The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects.
    String chapterId = "21m00Tcm4TlvDq8ikWAM"; // The chapter_id of the chapter. You can query GET https://api.elevenlabs.io/v1/projects/{project_id}/chapters to list all available chapters for a project.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      ChapterSnapshotsResponseModel result = client
              .projects
              .getChapterSnapshots(projectId, chapterId)
              .xiApiKey(xiApiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getSnapshots());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getChapterSnapshots");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChapterSnapshotsResponseModel> response = client
              .projects
              .getChapterSnapshots(projectId, chapterId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getChapterSnapshots");
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
| **projectId** | **String**| The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects. | |
| **chapterId** | **String**| The chapter_id of the chapter. You can query GET https://api.elevenlabs.io/v1/projects/{project_id}/chapters to list all available chapters for a project. | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

[**ChapterSnapshotsResponseModel**](ChapterSnapshotsResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="listChapters"></a>
# **listChapters**
> GetChaptersResponseModel listChapters(projectId).xiApiKey(xiApiKey).execute();

Get Chapters

Returns a list of your chapters for a project together and its metadata.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String projectId = "21m00Tcm4TlvDq8ikWAM"; // The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      GetChaptersResponseModel result = client
              .projects
              .listChapters(projectId)
              .xiApiKey(xiApiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getChapters());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#listChapters");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetChaptersResponseModel> response = client
              .projects
              .listChapters(projectId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#listChapters");
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
| **projectId** | **String**| The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects. | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

[**GetChaptersResponseModel**](GetChaptersResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="listSnapshots"></a>
# **listSnapshots**
> ProjectSnapshotsResponseModel listSnapshots(projectId).xiApiKey(xiApiKey).execute();

Get Project Snapshots

Gets the snapshots of a project.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String projectId = "21m00Tcm4TlvDq8ikWAM"; // The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      ProjectSnapshotsResponseModel result = client
              .projects
              .listSnapshots(projectId)
              .xiApiKey(xiApiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getSnapshots());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#listSnapshots");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProjectSnapshotsResponseModel> response = client
              .projects
              .listSnapshots(projectId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#listSnapshots");
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
| **projectId** | **String**| The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects. | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

[**ProjectSnapshotsResponseModel**](ProjectSnapshotsResponseModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="startChapterConversion"></a>
# **startChapterConversion**
> Object startChapterConversion(projectId, chapterId).xiApiKey(xiApiKey).execute();

Convert Chapter

Starts conversion of a specific chapter.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String projectId = "21m00Tcm4TlvDq8ikWAM"; // The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects.
    String chapterId = "21m00Tcm4TlvDq8ikWAM"; // The chapter_id of the chapter. You can query GET https://api.elevenlabs.io/v1/projects/{project_id}/chapters to list all available chapters for a project.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      Object result = client
              .projects
              .startChapterConversion(projectId, chapterId)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#startChapterConversion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .projects
              .startChapterConversion(projectId, chapterId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#startChapterConversion");
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
| **projectId** | **String**| The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects. | |
| **chapterId** | **String**| The chapter_id of the chapter. You can query GET https://api.elevenlabs.io/v1/projects/{project_id}/chapters to list all available chapters for a project. | |
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

<a name="startConversion"></a>
# **startConversion**
> Object startConversion(projectId).xiApiKey(xiApiKey).execute();

Convert Project

Starts conversion of a project and all of its chapters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String projectId = "21m00Tcm4TlvDq8ikWAM"; // The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      Object result = client
              .projects
              .startConversion(projectId)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#startConversion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .projects
              .startConversion(projectId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#startConversion");
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
| **projectId** | **String**| The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects. | |
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

<a name="streamAudioFromSnapshot"></a>
# **streamAudioFromSnapshot**
> streamAudioFromSnapshot(projectId, projectSnapshotId).xiApiKey(xiApiKey).execute();

Stream Project Audio

Stream the audio from a project snapshot.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String projectId = "21m00Tcm4TlvDq8ikWAM"; // The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects.
    String projectSnapshotId = "21m00Tcm4TlvDq8ikWAM"; // The project_snapshot_id of the project snapshot. You can query GET /v1/projects/{project_id}/snapshots to list all available snapshots for a project.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      client
              .projects
              .streamAudioFromSnapshot(projectId, projectSnapshotId)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#streamAudioFromSnapshot");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .projects
              .streamAudioFromSnapshot(projectId, projectSnapshotId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#streamAudioFromSnapshot");
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
| **projectId** | **String**| The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects. | |
| **projectSnapshotId** | **String**| The project_snapshot_id of the project snapshot. You can query GET /v1/projects/{project_id}/snapshots to list all available snapshots for a project. | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="streamAudioFromSnapshotPost"></a>
# **streamAudioFromSnapshotPost**
> streamAudioFromSnapshotPost(projectId, chapterId, chapterSnapshotId).xiApiKey(xiApiKey).execute();

Stream Chapter Audio

Stream the audio from a chapter snapshot. Use GET /v1/projects/{project_id}/chapters/{chapter_id}/snapshots to return the chapter snapshots of a chapter.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    String projectId = "21m00Tcm4TlvDq8ikWAM"; // The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects.
    String chapterId = "21m00Tcm4TlvDq8ikWAM"; // The chapter_id of the chapter. You can query GET https://api.elevenlabs.io/v1/projects/{project_id}/chapters to list all available chapters for a project.
    String chapterSnapshotId = "21m00Tcm4TlvDq8ikWAM"; // The chapter_snapshot_id of the chapter snapshot. You can query GET /v1/projects/{project_id}/chapters/{chapter_id}/snapshots to the all available snapshots for a chapter.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      client
              .projects
              .streamAudioFromSnapshotPost(projectId, chapterId, chapterSnapshotId)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#streamAudioFromSnapshotPost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .projects
              .streamAudioFromSnapshotPost(projectId, chapterId, chapterSnapshotId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#streamAudioFromSnapshotPost");
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
| **projectId** | **String**| The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects. | |
| **chapterId** | **String**| The chapter_id of the chapter. You can query GET https://api.elevenlabs.io/v1/projects/{project_id}/chapters to list all available chapters for a project. | |
| **chapterSnapshotId** | **String**| The chapter_snapshot_id of the chapter snapshot. You can query GET /v1/projects/{project_id}/chapters/{chapter_id}/snapshots to the all available snapshots for a chapter. | |
| **xiApiKey** | **String**| Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="updatePronunciationDictionaries"></a>
# **updatePronunciationDictionaries**
> Object updatePronunciationDictionaries(projectId, bodyUpdatePronunciationDictionariesV1ProjectsProjectIdUpdatePronunciationDictionariesPost).xiApiKey(xiApiKey).execute();

Update Pronunciation Dictionaries

Updates the set of pronunciation dictionaries acting on a project. This will automatically mark text within this project as requiring reconverting where the new dictionary would apply or the old one no longer does.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ElevenLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProjectsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.elevenlabs.io";
    ElevenLabs client = new ElevenLabs(configuration);
    List<PronunciationDictionaryVersionLocatorDBModel> pronunciationDictionaryLocators = Arrays.asList(); // A list of pronunciation dictionary locators (id, version_id) encoded as a list of JSON strings for pronunciation dictionaries to be applied to the text.  A list of json encoded strings is required as adding projects may occur through formData as opposed to jsonBody
    String projectId = "21m00Tcm4TlvDq8ikWAM"; // The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects.
    String xiApiKey = "xiApiKey_example"; // Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the 'Profile' tab on the website.
    try {
      Object result = client
              .projects
              .updatePronunciationDictionaries(pronunciationDictionaryLocators, projectId)
              .xiApiKey(xiApiKey)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updatePronunciationDictionaries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .projects
              .updatePronunciationDictionaries(pronunciationDictionaryLocators, projectId)
              .xiApiKey(xiApiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updatePronunciationDictionaries");
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
| **projectId** | **String**| The project_id of the project, you can query GET https://api.elevenlabs.io/v1/projects to list all available projects. | |
| **bodyUpdatePronunciationDictionariesV1ProjectsProjectIdUpdatePronunciationDictionariesPost** | [**BodyUpdatePronunciationDictionariesV1ProjectsProjectIdUpdatePronunciationDictionariesPost**](BodyUpdatePronunciationDictionariesV1ProjectsProjectIdUpdatePronunciationDictionariesPost.md)|  | |
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

