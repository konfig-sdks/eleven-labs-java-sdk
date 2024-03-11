

# BodyCreatesAudioNativeEnabledProjectV1AudioNativePost


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Title used in the player and inserted at the top of the uploaded article. If not provided, the default title set in the Player settings is used. |  [optional] |
|**name** | **String** | Project name. |  |
|**image** | **String** | Image URL used in the player. If not provided, default image set in the Player settings is used. |  [optional] |
|**author** | **String** | Author used in the player and inserted at the start of the uploaded article. If not provided, the default author set in the Player settings is used. |  [optional] |
|**small** | **Boolean** | Whether to use small player or not. If not provided, default value set in the Player settings is used. |  [optional] |
|**textColor** | **String** | Text color used in the player. If not provided, default text color set in the Player settings is used. |  [optional] |
|**backgroundColor** | **String** | Background color used in the player. If not provided, default background color set in the Player settings is used. |  [optional] |
|**sessionization** | **Integer** | Specifies for how many minutes to persist the session across page reloads. If not provided, default sessionization set in the Player settings is used. |  [optional] |
|**voiceId** | **String** | Voice ID used to voice the content. If not provided, default voice ID set in the Player settings is used. |  [optional] |
|**modelId** | **String** | TTS Model ID used in the player. If not provided, default model ID set in the Player settings is used. |  [optional] |
|**_file** | **File** | Either txt or HTML input file containing the article content. HTML should be formatted as follows &#39;&amp;lt;html&amp;gt;&amp;lt;body&amp;gt;&amp;lt;div&amp;gt;&amp;lt;p&amp;gt;Your content&amp;lt;/p&amp;gt;&amp;lt;h5&amp;gt;More of your content&amp;lt;/h5&amp;gt;&amp;lt;p&amp;gt;Some more of your content&amp;lt;/p&amp;gt;&amp;lt;/div&amp;gt;&amp;lt;/body&amp;gt;&amp;lt;/html&amp;gt;&#39; |  |
|**autoConvert** | **Boolean** | Whether to auto convert the project to audio or not. |  [optional] |



