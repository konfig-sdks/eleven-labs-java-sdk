

# BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gender** | [**GenderEnum**](#GenderEnum) | Category code corresponding to the gender of the generated voice. Possible values: female, male. |  |
|**accent** | **String** | Category code corresponding to the accent of the generated voice. Possible values: american, british, african, australian, indian. |  |
|**age** | [**AgeEnum**](#AgeEnum) | Category code corresponding to the age of the generated voice. Possible values: young, middle_aged, old. |  |
|**accentStrength** | **Double** | The strength of the accent of the generated voice. Has to be between 0.3 and 2.0. |  |
|**text** | **String** | Text to generate, text length has to be between 100 and 1000. |  |



## Enum: GenderEnum

| Name | Value |
|---- | -----|
| FEMALE | &quot;female&quot; |
| MALE | &quot;male&quot; |



## Enum: AgeEnum

| Name | Value |
|---- | -----|
| YOUNG | &quot;young&quot; |
| MIDDLE_AGED | &quot;middle_aged&quot; |
| OLD | &quot;old&quot; |



