

# VoiceResponseModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  |
|**voiceId** | **String** |  |  |
|**name** | **String** |  |  |
|**samples** | [**List&lt;SampleResponseModel&gt;**](SampleResponseModel.md) |  |  |
|**category** | **String** |  |  |
|**fineTuning** | [**FineTuningResponseModel**](FineTuningResponseModel.md) |  |  |
|**labels** | **Map&lt;String, String&gt;** |  |  |
|**previewUrl** | **String** |  |  |
|**availableForTiers** | **List&lt;String&gt;** |  |  |
|**settings** | [**VoiceSettingsResponseModel**](VoiceSettingsResponseModel.md) |  |  |
|**sharing** | [**VoiceSharingResponseModel**](VoiceSharingResponseModel.md) |  |  |
|**highQualityBaseModelIds** | **List&lt;String&gt;** |  |  |
|**safetyControl** | [**SafetyControlEnum**](#SafetyControlEnum) |  |  [optional] |
|**voiceVerification** | [**VoiceVerificationResponseModel**](VoiceVerificationResponseModel.md) |  |  [optional] |



## Enum: SafetyControlEnum

| Name | Value |
|---- | -----|
| NONE | &quot;NONE&quot; |
| BAN | &quot;BAN&quot; |
| CAPTCHA | &quot;CAPTCHA&quot; |
| CAPTCHA_AND_MODERATION | &quot;CAPTCHA_AND_MODERATION&quot; |



