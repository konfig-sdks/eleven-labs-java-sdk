

# ProjectExtendedResponseModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**projectId** | **String** |  |  |
|**name** | **String** |  |  |
|**createDateUnix** | **Integer** |  |  |
|**defaultTitleVoiceId** | **String** |  |  |
|**defaultParagraphVoiceId** | **String** |  |  |
|**defaultModelId** | **String** |  |  |
|**lastConversionDateUnix** | **Integer** |  |  |
|**canBeDownloaded** | **Boolean** |  |  |
|**state** | [**StateEnum**](#StateEnum) |  |  |
|**chapters** | [**List&lt;ChapterResponseModel&gt;**](ChapterResponseModel.md) |  |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;default&quot; |
| CONVERTING | &quot;converting&quot; |
| IN_QUEUE | &quot;in_queue&quot; |



