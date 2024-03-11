

# BodyDubAVideoOrAnAudioFileV1DubbingPost


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | **String** | automatic or manual. |  [optional] |
|**_file** | **File** | One or more audio files to clone the voice from |  [optional] |
|**csvFile** | **File** | CSV file containing transcription/translation metadata |  [optional] |
|**foregroundAudioFile** | **File** | For use only with csv input |  [optional] |
|**backgroundAudioFile** | **File** | For use only with csv input |  [optional] |
|**name** | **String** | Name of the dubbing project. |  [optional] |
|**sourceUrl** | **String** | URL of the source video/audio file. |  [optional] |
|**sourceLang** | **String** | Source language. |  [optional] |
|**targetLang** | **String** | Target language. |  |
|**numSpeakers** | **Integer** | Number of speakers to use for the dubbing. |  [optional] |
|**watermark** | **Boolean** | Whether to apply watermark to the output video. |  [optional] |
|**startTime** | **Integer** | Start time of the source video/audio file. |  [optional] |
|**endTime** | **Integer** | End time of the source video/audio file. |  [optional] |
|**highestResolution** | **Boolean** | Whether to use the highest resolution available. |  [optional] |
|**dubbingStudio** | **Boolean** | Whether to prepare dub for edits in dubbing studio. |  [optional] |



