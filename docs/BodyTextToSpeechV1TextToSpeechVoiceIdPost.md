

# BodyTextToSpeechV1TextToSpeechVoiceIdPost


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**text** | **String** | The text that will get converted into speech. |  |
|**modelId** | **String** | Identifier of the model that will be used, you can query them using GET /v1/models. The model needs to have support for text to speech, you can check this using the can_do_text_to_speech property. |  [optional] |
|**voiceSettings** | [**VoiceSettingsResponseModel**](VoiceSettingsResponseModel.md) | Voice settings overriding stored setttings for the given voice. They are applied only on the given request. |  [optional] |
|**pronunciationDictionaryLocators** | [**List&lt;PronunciationDictionaryVersionLocatorDBModel&gt;**](PronunciationDictionaryVersionLocatorDBModel.md) | A list of pronunciation dictionary locators (id, version_id) to be applied to the text. They will be applied in order. You may have up to 3 locators per request |  [optional] |



