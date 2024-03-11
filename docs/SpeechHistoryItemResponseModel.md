

# SpeechHistoryItemResponseModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**historyItemId** | **String** |  |  |
|**requestId** | **String** |  |  |
|**voiceId** | **String** |  |  |
|**modelId** | **String** |  |  |
|**voiceName** | **String** |  |  |
|**voiceCategory** | [**VoiceCategoryEnum**](#VoiceCategoryEnum) |  |  |
|**text** | **String** |  |  |
|**dateUnix** | **Integer** |  |  |
|**characterCountChangeFrom** | **Integer** |  |  |
|**characterCountChangeTo** | **Integer** |  |  |
|**contentType** | **String** |  |  |
|**state** | [**StateEnum**](#StateEnum) |  |  |
|**settings** | **Object** |  |  |
|**feedback** | [**FeedbackResponseModel**](FeedbackResponseModel.md) |  |  |
|**shareLinkId** | **String** |  |  |
|**source** | [**SourceEnum**](#SourceEnum) |  |  |



## Enum: VoiceCategoryEnum

| Name | Value |
|---- | -----|
| PREMADE | &quot;premade&quot; |
| CLONED | &quot;cloned&quot; |
| GENERATED | &quot;generated&quot; |
| PROFESSIONAL | &quot;professional&quot; |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| DELETED | &quot;deleted&quot; |
| PROCESSING | &quot;processing&quot; |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| TTS | &quot;TTS&quot; |
| STS | &quot;STS&quot; |



