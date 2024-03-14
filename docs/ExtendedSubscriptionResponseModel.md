

# ExtendedSubscriptionResponseModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tier** | **String** |  |  |
|**characterCount** | **Integer** |  |  |
|**characterLimit** | **Integer** |  |  |
|**canExtendCharacterLimit** | **Boolean** |  |  |
|**allowedToExtendCharacterLimit** | **Boolean** |  |  |
|**nextCharacterCountResetUnix** | **Integer** |  |  |
|**voiceLimit** | **Integer** |  |  |
|**maxVoiceAddEdits** | **Integer** |  |  |
|**voiceAddEditCounter** | **Integer** |  |  |
|**professionalVoiceLimit** | **Integer** |  |  |
|**canExtendVoiceLimit** | **Boolean** |  |  |
|**canUseInstantVoiceCloning** | **Boolean** |  |  |
|**canUseProfessionalVoiceCloning** | **Boolean** |  |  |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**billingPeriod** | [**BillingPeriodEnum**](#BillingPeriodEnum) |  |  |
|**nextInvoice** | [**InvoiceResponseModel**](InvoiceResponseModel.md) |  |  |
|**hasOpenInvoices** | **Boolean** |  |  |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| USD | &quot;usd&quot; |
| EUR | &quot;eur&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| TRIALING | &quot;trialing&quot; |
| ACTIVE | &quot;active&quot; |
| INCOMPLETE | &quot;incomplete&quot; |
| INCOMPLETE_EXPIRED | &quot;incomplete_expired&quot; |
| PAST_DUE | &quot;past_due&quot; |
| CANCELED | &quot;canceled&quot; |
| UNPAID | &quot;unpaid&quot; |
| FREE | &quot;free&quot; |



## Enum: BillingPeriodEnum

| Name | Value |
|---- | -----|
| MONTHLY_PERIOD | &quot;monthly_period&quot; |
| ANNUAL_PERIOD | &quot;annual_period&quot; |



