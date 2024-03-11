

# BodyAddProjectV1ProjectsAddPost


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | An optional name of the author of the project, this will be added as metadata to the mp3 file on project / chapter download. |  [optional] |
|**name** | **String** | The name of the project, used for identification only. |  |
|**fromUrl** | **String** | An optional URL from which we will extract content to initialize the project. If this is set, &#39;from_url&#39; must be null. If neither &#39;from_url&#39; or &#39;from_document&#39; are provided we will initialize the project as blank. |  [optional] |
|**fromDocument** | **File** | An optional .epub, .pdf, .txt or similar file can be provided. If provided, we will initialize the project with its content. If this is set, &#39;from_url&#39; must be null.  If neither &#39;from_url&#39; or &#39;from_document&#39; are provided we will initialize the project as blank. |  [optional] |
|**defaultTitleVoiceId** | **String** | The voice_id that corresponds to the default voice used for new titles. |  |
|**defaultParagraphVoiceId** | **String** | The voice_id that corresponds to the default voice used for new paragraphs. |  |
|**defaultModelId** | **String** | The model_id of the model to be used for this project, you can query GET https://api.elevenlabs.io/v1/models to list all available models. |  |
|**qualityPreset** | **String** | Output quality of the generated audio. Must be one of: standard - standard output format, 128kbps with 44.1kHz sample rate. high - high quality output format, 192kbps with 44.1kHz sample rate and major improvements on our side. Using this setting increases the character cost by 20%. ultra - ultra quality output format, 192kbps with 44.1kHz sample rate and highest improvements on our side. Using this setting increases the character cost by 50%.  |  [optional] |
|**author** | **String** | An optional name of the author of the project, this will be added as metadata to the mp3 file on project / chapter download. |  [optional] |
|**isbnNumber** | **String** | An optional ISBN number of the project you want to create, this will be added as metadata to the mp3 file on project / chapter download. |  [optional] |
|**acxVolumeNormalization** | **Boolean** | [Deprecated] When the project is downloaded, should the returned audio have postprocessing in order to make it compliant with audiobook normalized volume requirements |  [optional] |
|**volumeNormalization** | **Boolean** | When the project is downloaded, should the returned audio have postprocessing in order to make it compliant with audiobook normalized volume requirements |  [optional] |
|**pronunciationDictionaryLocators** | **List&lt;String&gt;** | A list of pronunciation dictionary locators (id, version_id) encoded as a list of JSON strings for pronunciation dictionaries to be applied to the text.  A list of json encoded strings is required as adding projects may occur through formData as opposed to jsonBody |  |
|**callbackUrl** | **String** | A url that will be called by our service when the project is converted with a json containing the status of the conversion |  [optional] |



