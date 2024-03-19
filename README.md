<div align="left">

[![Visit Elevenlabs](./header.png)](https://elevenlabs.com)

# [Elevenlabs](https://elevenlabs.com)

This is the documentation for the ElevenLabs API. You can use this API to use our service programmatically, this is done by using your xi-api-key. <br/> You can view your xi-api-key using the 'Profile' tab on https://elevenlabs.io. Our API is experimental so all endpoints are subject to change.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=ElevenLabs&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>eleven-labs-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:eleven-labs-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/eleven-labs-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.elevenlabs.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PronunciationDictionaryApi* | [**createFromFile**](docs/PronunciationDictionaryApi.md#createFromFile) | **POST** /v1/pronunciation-dictionaries/add-from-file | Add A Pronunciation Dictionary
*PronunciationDictionaryApi* | [**getMetadata**](docs/PronunciationDictionaryApi.md#getMetadata) | **GET** /v1/pronunciation-dictionaries/{pronunciation_dictionary_id} | Get Metadata For A Pronunciation Dictionary
*AdminApi* | [**archiveCouponPromocodePost**](docs/AdminApi.md#archiveCouponPromocodePost) | **POST** /admin/n8enylacgd/coupon/{promocode}/archive | Archive Coupon
*AdminApi* | [**editVanityLink**](docs/AdminApi.md#editVanityLink) | **POST** /admin/n8enylacgd/vanity-link/{vanity_link_id}/update | Edit Vanity Link
*AdminApi* | [**getAllCoupons**](docs/AdminApi.md#getAllCoupons) | **GET** /admin/n8enylacgd/coupons | Get All Coupons
*AdminApi* | [**getAllVanityLinks**](docs/AdminApi.md#getAllVanityLinks) | **GET** /admin/n8enylacgd/vanity-links | Get All Vanity Links
*AdminApi* | [**getVanityLink**](docs/AdminApi.md#getVanityLink) | **GET** /admin/n8enylacgd/vanity-link/{slug} | Get Vanity Link
*AdminApi* | [**removeVanityLink**](docs/AdminApi.md#removeVanityLink) | **POST** /admin/n8enylacgd/vanity-link/{vanity_link_id}/delete | Delete Vanity Link
*AudioNativeApi* | [**createProjectWithEmbeddableHtml**](docs/AudioNativeApi.md#createProjectWithEmbeddableHtml) | **POST** /v1/audio-native | Creates Audionative Enabled Project.
*DubbingApi* | [**deleteProject**](docs/DubbingApi.md#deleteProject) | **DELETE** /v1/dubbing/{dubbing_id} | Delete Dubbing Project
*DubbingApi* | [**fileInLanguage**](docs/DubbingApi.md#fileInLanguage) | **POST** /v1/dubbing | Dub A Video Or An Audio File
*DubbingApi* | [**getFile**](docs/DubbingApi.md#getFile) | **GET** /v1/dubbing/{dubbing_id}/audio/{language_code} | Get Dubbed File
*DubbingApi* | [**getProjectMetadata**](docs/DubbingApi.md#getProjectMetadata) | **GET** /v1/dubbing/{dubbing_id} | Get Dubbing Project Metadata
*ModelsApi* | [**listAvailableModels**](docs/ModelsApi.md#listAvailableModels) | **GET** /v1/models | Get Models
*ProjectsApi* | [**createNewProject**](docs/ProjectsApi.md#createNewProject) | **POST** /v1/projects/add | Add Project
*ProjectsApi* | [**deleteById**](docs/ProjectsApi.md#deleteById) | **DELETE** /v1/projects/{project_id} | Delete Project
*ProjectsApi* | [**deleteChapterById**](docs/ProjectsApi.md#deleteChapterById) | **DELETE** /v1/projects/{project_id}/chapters/{chapter_id} | Delete Chapter
*ProjectsApi* | [**getAllProjects**](docs/ProjectsApi.md#getAllProjects) | **GET** /v1/projects | Get Projects
*ProjectsApi* | [**getById**](docs/ProjectsApi.md#getById) | **GET** /v1/projects/{project_id} | Get Project By Id
*ProjectsApi* | [**getChapterById**](docs/ProjectsApi.md#getChapterById) | **GET** /v1/projects/{project_id}/chapters/{chapter_id} | Get Chapter By Id
*ProjectsApi* | [**getChapterSnapshots**](docs/ProjectsApi.md#getChapterSnapshots) | **GET** /v1/projects/{project_id}/chapters/{chapter_id}/snapshots | Get Chapter Snapshots
*ProjectsApi* | [**listChapters**](docs/ProjectsApi.md#listChapters) | **GET** /v1/projects/{project_id}/chapters | Get Chapters
*ProjectsApi* | [**listSnapshots**](docs/ProjectsApi.md#listSnapshots) | **GET** /v1/projects/{project_id}/snapshots | Get Project Snapshots
*ProjectsApi* | [**startChapterConversion**](docs/ProjectsApi.md#startChapterConversion) | **POST** /v1/projects/{project_id}/chapters/{chapter_id}/convert | Convert Chapter
*ProjectsApi* | [**startConversion**](docs/ProjectsApi.md#startConversion) | **POST** /v1/projects/{project_id}/convert | Convert Project
*ProjectsApi* | [**streamAudioFromSnapshot**](docs/ProjectsApi.md#streamAudioFromSnapshot) | **POST** /v1/projects/{project_id}/snapshots/{project_snapshot_id}/stream | Stream Project Audio
*ProjectsApi* | [**streamAudioFromSnapshotPost**](docs/ProjectsApi.md#streamAudioFromSnapshotPost) | **POST** /v1/projects/{project_id}/chapters/{chapter_id}/snapshots/{chapter_snapshot_id}/stream | Stream Chapter Audio
*ProjectsApi* | [**updatePronunciationDictionaries**](docs/ProjectsApi.md#updatePronunciationDictionaries) | **POST** /v1/projects/{project_id}/update-pronunciation-dictionaries | Update Pronunciation Dictionaries
*RedirectApi* | [**toMintlifyDocsGet**](docs/RedirectApi.md#toMintlifyDocsGet) | **GET** /docs | Redirect To Mintlify
*SamplesApi* | [**getAudioFromSample**](docs/SamplesApi.md#getAudioFromSample) | **GET** /v1/voices/{voice_id}/samples/{sample_id}/audio | Get Audio From Sample
*SamplesApi* | [**removeById**](docs/SamplesApi.md#removeById) | **DELETE** /v1/voices/{voice_id}/samples/{sample_id} | Delete Sample
*SpeechHistoryApi* | [**deleteHistoryItemById**](docs/SpeechHistoryApi.md#deleteHistoryItemById) | **DELETE** /v1/history/{history_item_id} | Delete History Item
*SpeechHistoryApi* | [**downloadHistoryItems**](docs/SpeechHistoryApi.md#downloadHistoryItems) | **POST** /v1/history/download | Download History Items
*SpeechHistoryApi* | [**getGeneratedAudioMetadata**](docs/SpeechHistoryApi.md#getGeneratedAudioMetadata) | **GET** /v1/history | Get Generated Items
*SpeechHistoryApi* | [**getHistoryItemAudio**](docs/SpeechHistoryApi.md#getHistoryItemAudio) | **GET** /v1/history/{history_item_id}/audio | Get Audio From History Item
*SpeechHistoryApi* | [**getHistoryItemById**](docs/SpeechHistoryApi.md#getHistoryItemById) | **GET** /v1/history/{history_item_id} | Get History Item By Id
*SpeechToSpeechApi* | [**createWithVoice**](docs/SpeechToSpeechApi.md#createWithVoice) | **POST** /v1/speech-to-speech/{voice_id} | Speech To Speech
*SpeechToSpeechApi* | [**createWithVoice_0**](docs/SpeechToSpeechApi.md#createWithVoice_0) | **POST** /v1/speech-to-speech/{voice_id}/stream | Speech To Speech Streaming
*TextToSpeechApi* | [**convertTextToSpeech**](docs/TextToSpeechApi.md#convertTextToSpeech) | **POST** /v1/text-to-speech/{voice_id} | Text To Speech
*TextToSpeechApi* | [**convertTextToSpeechStream**](docs/TextToSpeechApi.md#convertTextToSpeechStream) | **POST** /v1/text-to-speech/{voice_id}/stream | Text To Speech
*UserApi* | [**getInfo**](docs/UserApi.md#getInfo) | **GET** /v1/user | Get User Info
*UserApi* | [**getSubscriptionInfo**](docs/UserApi.md#getSubscriptionInfo) | **GET** /v1/user/subscription | Get User Subscription Info
*VoiceGenerationApi* | [**createVoice**](docs/VoiceGenerationApi.md#createVoice) | **POST** /v1/voice-generation/create-voice | Create A Previously Generated Voice
*VoiceGenerationApi* | [**generateRandomVoice**](docs/VoiceGenerationApi.md#generateRandomVoice) | **POST** /v1/voice-generation/generate-voice | Generate A Random Voice
*VoiceGenerationApi* | [**getVoiceGenerationParameters**](docs/VoiceGenerationApi.md#getVoiceGenerationParameters) | **GET** /v1/voice-generation/generate-voice/parameters | Voice Generation Parameters
*VoicesApi* | [**addToCollection**](docs/VoicesApi.md#addToCollection) | **POST** /v1/voices/add/{public_user_id}/{voice_id} | Add Sharing Voice
*VoicesApi* | [**addVoiceToCollection**](docs/VoicesApi.md#addVoiceToCollection) | **POST** /v1/voices/add | Add Voice
*VoicesApi* | [**deleteById**](docs/VoicesApi.md#deleteById) | **DELETE** /v1/voices/{voice_id} | Delete Voice
*VoicesApi* | [**editSettingsPost**](docs/VoicesApi.md#editSettingsPost) | **POST** /v1/voices/{voice_id}/settings/edit | Edit Voice Settings
*VoicesApi* | [**getDefaultVoiceSettings**](docs/VoicesApi.md#getDefaultVoiceSettings) | **GET** /v1/voices/settings/default | Get Default Voice Settings.
*VoicesApi* | [**getSettings**](docs/VoicesApi.md#getSettings) | **GET** /v1/voices/{voice_id}/settings | Get Voice Settings
*VoicesApi* | [**getSharedVoices**](docs/VoicesApi.md#getSharedVoices) | **GET** /v1/shared-voices | Get Voices
*VoicesApi* | [**getVoiceMetadata**](docs/VoicesApi.md#getVoiceMetadata) | **GET** /v1/voices/{voice_id} | Get Voice
*VoicesApi* | [**listAllVoices**](docs/VoicesApi.md#listAllVoices) | **GET** /v1/voices | Get Voices
*VoicesApi* | [**updateVoiceById**](docs/VoicesApi.md#updateVoiceById) | **POST** /v1/voices/{voice_id}/edit | Edit Voice
*WorkspaceApi* | [**getSsoProviderAdmin**](docs/WorkspaceApi.md#getSsoProviderAdmin) | **GET** /admin/{admin_url_prefix}/sso-provider | Get Sso Provider Admin


## Documentation for Models

 - [AddProjectResponseModel](docs/AddProjectResponseModel.md)
 - [AddPronunciationDictionaryResponseModel](docs/AddPronunciationDictionaryResponseModel.md)
 - [AddVoiceResponseModel](docs/AddVoiceResponseModel.md)
 - [AudioNativeCreateProjectResponseModel](docs/AudioNativeCreateProjectResponseModel.md)
 - [BodyAddAPronunciationDictionaryV1PronunciationDictionariesAddFromFilePost](docs/BodyAddAPronunciationDictionaryV1PronunciationDictionariesAddFromFilePost.md)
 - [BodyAddProjectV1ProjectsAddPost](docs/BodyAddProjectV1ProjectsAddPost.md)
 - [BodyAddSharingVoiceV1VoicesAddPublicUserIdVoiceIdPost](docs/BodyAddSharingVoiceV1VoicesAddPublicUserIdVoiceIdPost.md)
 - [BodyAddVoiceV1VoicesAddPost](docs/BodyAddVoiceV1VoicesAddPost.md)
 - [BodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost](docs/BodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost.md)
 - [BodyCreatesAudioNativeEnabledProjectV1AudioNativePost](docs/BodyCreatesAudioNativeEnabledProjectV1AudioNativePost.md)
 - [BodyDownloadHistoryItemsV1HistoryDownloadPost](docs/BodyDownloadHistoryItemsV1HistoryDownloadPost.md)
 - [BodyDubAVideoOrAnAudioFileV1DubbingPost](docs/BodyDubAVideoOrAnAudioFileV1DubbingPost.md)
 - [BodyEditVanityLinkAdminN8enylacgdVanityLinkVanityLinkIdUpdatePost](docs/BodyEditVanityLinkAdminN8enylacgdVanityLinkVanityLinkIdUpdatePost.md)
 - [BodyEditVoiceV1VoicesVoiceIdEditPost](docs/BodyEditVoiceV1VoicesVoiceIdEditPost.md)
 - [BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost](docs/BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost.md)
 - [BodySpeechToSpeechStreamingV1SpeechToSpeechVoiceIdStreamPost](docs/BodySpeechToSpeechStreamingV1SpeechToSpeechVoiceIdStreamPost.md)
 - [BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost](docs/BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost.md)
 - [BodyTextToSpeechV1TextToSpeechVoiceIdPost](docs/BodyTextToSpeechV1TextToSpeechVoiceIdPost.md)
 - [BodyTextToSpeechV1TextToSpeechVoiceIdStreamPost](docs/BodyTextToSpeechV1TextToSpeechVoiceIdStreamPost.md)
 - [BodyUpdatePronunciationDictionariesV1ProjectsProjectIdUpdatePronunciationDictionariesPost](docs/BodyUpdatePronunciationDictionariesV1ProjectsProjectIdUpdatePronunciationDictionariesPost.md)
 - [ChapterResponseModel](docs/ChapterResponseModel.md)
 - [ChapterSnapshotResponseModel](docs/ChapterSnapshotResponseModel.md)
 - [ChapterSnapshotsResponseModel](docs/ChapterSnapshotsResponseModel.md)
 - [ChapterStatisticsResponseModel](docs/ChapterStatisticsResponseModel.md)
 - [DoDubbingResponseModel](docs/DoDubbingResponseModel.md)
 - [DubbingMetadataResponse](docs/DubbingMetadataResponse.md)
 - [ExtendedSubscriptionResponseModel](docs/ExtendedSubscriptionResponseModel.md)
 - [FeedbackResponseModel](docs/FeedbackResponseModel.md)
 - [FineTuningResponseModel](docs/FineTuningResponseModel.md)
 - [GetChaptersResponseModel](docs/GetChaptersResponseModel.md)
 - [GetLibraryVoicesResponseModel](docs/GetLibraryVoicesResponseModel.md)
 - [GetProjectsResponseModel](docs/GetProjectsResponseModel.md)
 - [GetPronunciationDictionaryMetadataResponseModel](docs/GetPronunciationDictionaryMetadataResponseModel.md)
 - [GetSpeechHistoryResponseModel](docs/GetSpeechHistoryResponseModel.md)
 - [GetVoicesResponseModel](docs/GetVoicesResponseModel.md)
 - [InvoiceResponseModel](docs/InvoiceResponseModel.md)
 - [LanguageResponseModel](docs/LanguageResponseModel.md)
 - [LibraryVoiceResponseModel](docs/LibraryVoiceResponseModel.md)
 - [ManualVerificationFileResponseModel](docs/ManualVerificationFileResponseModel.md)
 - [ManualVerificationResponseModel](docs/ManualVerificationResponseModel.md)
 - [ModelResponseModel](docs/ModelResponseModel.md)
 - [ProjectExtendedResponseModel](docs/ProjectExtendedResponseModel.md)
 - [ProjectResponseModel](docs/ProjectResponseModel.md)
 - [ProjectSnapshotResponseModel](docs/ProjectSnapshotResponseModel.md)
 - [ProjectSnapshotsResponseModel](docs/ProjectSnapshotsResponseModel.md)
 - [PronunciationDictionaryVersionLocatorDBModel](docs/PronunciationDictionaryVersionLocatorDBModel.md)
 - [RecordingResponseModel](docs/RecordingResponseModel.md)
 - [SampleResponseModel](docs/SampleResponseModel.md)
 - [SpeechHistoryItemResponseModel](docs/SpeechHistoryItemResponseModel.md)
 - [SsoProviderDBModel](docs/SsoProviderDBModel.md)
 - [SubscriptionResponseModel](docs/SubscriptionResponseModel.md)
 - [UserResponseModel](docs/UserResponseModel.md)
 - [ValidationError](docs/ValidationError.md)
 - [VerificationAttemptResponseModel](docs/VerificationAttemptResponseModel.md)
 - [VoiceGenerationParameterOptionResponseModel](docs/VoiceGenerationParameterOptionResponseModel.md)
 - [VoiceGenerationParameterResponseModel](docs/VoiceGenerationParameterResponseModel.md)
 - [VoiceResponseModel](docs/VoiceResponseModel.md)
 - [VoiceSettingsResponseModel](docs/VoiceSettingsResponseModel.md)
 - [VoiceSharingResponseModel](docs/VoiceSharingResponseModel.md)
 - [VoiceVerificationResponseModel](docs/VoiceVerificationResponseModel.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
