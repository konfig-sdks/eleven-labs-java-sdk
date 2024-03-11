

# FineTuningResponseModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isAllowedToFineTune** | **Boolean** |  |  |
|**finetuningState** | [**FinetuningStateEnum**](#FinetuningStateEnum) |  |  |
|**verificationFailures** | **List&lt;String&gt;** |  |  |
|**verificationAttemptsCount** | **Integer** |  |  |
|**manualVerificationRequested** | **Boolean** |  |  |
|**language** | **String** |  |  [optional] |
|**finetuningProgress** | **Map&lt;String, Double&gt;** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**datasetDurationSeconds** | **Double** |  |  [optional] |
|**verificationAttempts** | [**List&lt;VerificationAttemptResponseModel&gt;**](VerificationAttemptResponseModel.md) |  |  [optional] |
|**sliceIds** | **List&lt;String&gt;** |  |  [optional] |
|**manualVerification** | [**ManualVerificationResponseModel**](ManualVerificationResponseModel.md) |  |  [optional] |



## Enum: FinetuningStateEnum

| Name | Value |
|---- | -----|
| NOT_STARTED | &quot;not_started&quot; |
| QUEUED | &quot;queued&quot; |
| FINE_TUNING | &quot;fine_tuning&quot; |
| FINE_TUNED | &quot;fine_tuned&quot; |
| FAILED | &quot;failed&quot; |
| DELAYED | &quot;delayed&quot; |



