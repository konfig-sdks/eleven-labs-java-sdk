

# BodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**voiceName** | **String** | Name to use for the created voice. |  |
|**voiceDescription** | **String** | Description to use for the created voice. |  |
|**generatedVoiceId** | **String** | The generated_voice_id to create, call POST /v1/voice-generation/generate-voice and fetch the generated_voice_id from the response header if don&#39;t have one yet. |  |
|**labels** | **Map&lt;String, String&gt;** | Optional, metadata to add to the created voice. Defaults to None. |  [optional] |



