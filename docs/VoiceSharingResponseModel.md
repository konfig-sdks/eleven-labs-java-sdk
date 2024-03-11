

# VoiceSharingResponseModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**historyItemSampleId** | **String** |  |  |
|**dateUnix** | **Integer** |  |  |
|**whitelistedEmails** | **List&lt;String&gt;** |  |  |
|**publicOwnerId** | **String** |  |  |
|**originalVoiceId** | **String** |  |  |
|**financialRewardsEnabled** | **Boolean** |  |  |
|**freeUsersAllowed** | **Boolean** |  |  |
|**liveModerationEnabled** | **Boolean** |  |  |
|**rate** | **Double** |  |  |
|**noticePeriod** | **Integer** |  |  |
|**disableAtUnix** | **Integer** |  |  |
|**voiceMixingAllowed** | **Boolean** |  |  |
|**instagramUsername** | **String** |  |  |
|**twitterUsername** | **String** |  |  |
|**youtubeUsername** | **String** |  |  |
|**tiktokUsername** | **String** |  |  |
|**featured** | **Boolean** |  |  |
|**banReason** | **String** |  |  |
|**likedByCount** | **Integer** |  |  |
|**clonedByCount** | **Integer** |  |  |
|**name** | **String** |  |  |
|**labels** | **Map&lt;String, String&gt;** |  |  |
|**reviewStatus** | [**ReviewStatusEnum**](#ReviewStatusEnum) |  |  |
|**reviewMessage** | **String** |  |  |
|**enabledInLibrary** | **Boolean** |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ENABLED | &quot;enabled&quot; |
| DISABLED | &quot;disabled&quot; |
| COPIED | &quot;copied&quot; |
| COPIED_DISABLED | &quot;copied_disabled&quot; |



## Enum: ReviewStatusEnum

| Name | Value |
|---- | -----|
| NOT_REQUESTED | &quot;not_requested&quot; |
| PENDING | &quot;pending&quot; |
| DECLINED | &quot;declined&quot; |
| ALLOWED | &quot;allowed&quot; |
| ALLOWED_WITH_CHANGES | &quot;allowed_with_changes&quot; |



