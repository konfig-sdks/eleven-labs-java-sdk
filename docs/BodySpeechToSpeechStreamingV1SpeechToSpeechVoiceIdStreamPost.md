

# BodySpeechToSpeechStreamingV1SpeechToSpeechVoiceIdStreamPost


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**audio** | **File** | The audio file which holds the content and emotion that will control the generated speech. |  |
|**modelId** | **String** | Identifier of the model that will be used, you can query them using GET /v1/models. The model needs to have support for speech to speech, you can check this using the can_do_voice_conversion property. |  [optional] |
|**voiceSettings** | **String** | Voice settings overriding stored setttings for the given voice. They are applied only on the given request. Needs to be send as a JSON encoded string. |  [optional] |



