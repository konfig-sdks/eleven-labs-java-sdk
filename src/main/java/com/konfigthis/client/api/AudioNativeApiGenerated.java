/*
 * ElevenLabs API Documentation
 * This is the documentation for the ElevenLabs API. You can use this API to use our service programmatically, this is done by using your xi-api-key. <br/> You can view your xi-api-key using the 'Profile' tab on https://elevenlabs.io. Our API is experimental so all endpoints are subject to change.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.AudioNativeCreateProjectResponseModel;
import com.konfigthis.client.model.BodyCreatesAudioNativeEnabledProjectV1AudioNativePost;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AudioNativeApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AudioNativeApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AudioNativeApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createProjectWithEmbeddableHtmlCall(String name, File _file, BodyCreatesAudioNativeEnabledProjectV1AudioNativePost bodyCreatesAudioNativeEnabledProjectV1AudioNativePost, String xiApiKey, String title, String image, String author, Boolean small, String textColor, String backgroundColor, Integer sessionization, String voiceId, String modelId, Boolean autoConvert, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = bodyCreatesAudioNativeEnabledProjectV1AudioNativePost;

        // create path and map variables
        String localVarPath = "/v1/audio-native";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (title != null) {
            localVarFormParams.put("title", title);
        }

        if (name != null) {
            localVarFormParams.put("name", name);
        }

        if (image != null) {
            localVarFormParams.put("image", image);
        }

        if (author != null) {
            localVarFormParams.put("author", author);
        }

        if (small != null) {
            localVarFormParams.put("small", small);
        }

        if (textColor != null) {
            localVarFormParams.put("text_color", textColor);
        }

        if (backgroundColor != null) {
            localVarFormParams.put("background_color", backgroundColor);
        }

        if (sessionization != null) {
            localVarFormParams.put("sessionization", sessionization);
        }

        if (voiceId != null) {
            localVarFormParams.put("voice_id", voiceId);
        }

        if (modelId != null) {
            localVarFormParams.put("model_id", modelId);
        }

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        if (autoConvert != null) {
            localVarFormParams.put("auto_convert", autoConvert);
        }

        if (xiApiKey != null) {
            localVarHeaderParams.put("xi-api-key", localVarApiClient.parameterToString(xiApiKey));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createProjectWithEmbeddableHtmlValidateBeforeCall(String name, File _file, BodyCreatesAudioNativeEnabledProjectV1AudioNativePost bodyCreatesAudioNativeEnabledProjectV1AudioNativePost, String xiApiKey, String title, String image, String author, Boolean small, String textColor, String backgroundColor, Integer sessionization, String voiceId, String modelId, Boolean autoConvert, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling createProjectWithEmbeddableHtml(Async)");
        }

        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException("Missing the required parameter '_file' when calling createProjectWithEmbeddableHtml(Async)");
        }

        // verify the required parameter 'bodyCreatesAudioNativeEnabledProjectV1AudioNativePost' is set
        if (bodyCreatesAudioNativeEnabledProjectV1AudioNativePost == null) {
            throw new ApiException("Missing the required parameter 'bodyCreatesAudioNativeEnabledProjectV1AudioNativePost' when calling createProjectWithEmbeddableHtml(Async)");
        }

        return createProjectWithEmbeddableHtmlCall(name, _file, bodyCreatesAudioNativeEnabledProjectV1AudioNativePost, xiApiKey, title, image, author, small, textColor, backgroundColor, sessionization, voiceId, modelId, autoConvert, _callback);

    }


    private ApiResponse<AudioNativeCreateProjectResponseModel> createProjectWithEmbeddableHtmlWithHttpInfo(String name, File _file, BodyCreatesAudioNativeEnabledProjectV1AudioNativePost bodyCreatesAudioNativeEnabledProjectV1AudioNativePost, String xiApiKey, String title, String image, String author, Boolean small, String textColor, String backgroundColor, Integer sessionization, String voiceId, String modelId, Boolean autoConvert) throws ApiException {
        okhttp3.Call localVarCall = createProjectWithEmbeddableHtmlValidateBeforeCall(name, _file, bodyCreatesAudioNativeEnabledProjectV1AudioNativePost, xiApiKey, title, image, author, small, textColor, backgroundColor, sessionization, voiceId, modelId, autoConvert, null);
        Type localVarReturnType = new TypeToken<AudioNativeCreateProjectResponseModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createProjectWithEmbeddableHtmlAsync(String name, File _file, BodyCreatesAudioNativeEnabledProjectV1AudioNativePost bodyCreatesAudioNativeEnabledProjectV1AudioNativePost, String xiApiKey, String title, String image, String author, Boolean small, String textColor, String backgroundColor, Integer sessionization, String voiceId, String modelId, Boolean autoConvert, final ApiCallback<AudioNativeCreateProjectResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createProjectWithEmbeddableHtmlValidateBeforeCall(name, _file, bodyCreatesAudioNativeEnabledProjectV1AudioNativePost, xiApiKey, title, image, author, small, textColor, backgroundColor, sessionization, voiceId, modelId, autoConvert, _callback);
        Type localVarReturnType = new TypeToken<AudioNativeCreateProjectResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateProjectWithEmbeddableHtmlRequestBuilder {
        private final String name;
        private final File _file;
        private String xiApiKey;
        private String title;
        private String image;
        private String author;
        private Boolean small;
        private String textColor;
        private String backgroundColor;
        private Integer sessionization;
        private String voiceId;
        private String modelId;
        private Boolean autoConvert;

        private CreateProjectWithEmbeddableHtmlRequestBuilder(String name, File _file) {
            this.name = name;
            this._file = _file;
        }

        /**
         * Set xiApiKey
         * @param xiApiKey Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. (optional)
         * @return CreateProjectWithEmbeddableHtmlRequestBuilder
         */
        public CreateProjectWithEmbeddableHtmlRequestBuilder xiApiKey(String xiApiKey) {
            this.xiApiKey = xiApiKey;
            return this;
        }
        
        /**
         * Set title
         * @param title Title used in the player and inserted at the top of the uploaded article. If not provided, the default title set in the Player settings is used. (optional)
         * @return CreateProjectWithEmbeddableHtmlRequestBuilder
         */
        public CreateProjectWithEmbeddableHtmlRequestBuilder title(String title) {
            this.title = title;
            return this;
        }
        
        /**
         * Set image
         * @param image Image URL used in the player. If not provided, default image set in the Player settings is used. (optional)
         * @return CreateProjectWithEmbeddableHtmlRequestBuilder
         */
        public CreateProjectWithEmbeddableHtmlRequestBuilder image(String image) {
            this.image = image;
            return this;
        }
        
        /**
         * Set author
         * @param author Author used in the player and inserted at the start of the uploaded article. If not provided, the default author set in the Player settings is used. (optional)
         * @return CreateProjectWithEmbeddableHtmlRequestBuilder
         */
        public CreateProjectWithEmbeddableHtmlRequestBuilder author(String author) {
            this.author = author;
            return this;
        }
        
        /**
         * Set small
         * @param small Whether to use small player or not. If not provided, default value set in the Player settings is used. (optional, default to false)
         * @return CreateProjectWithEmbeddableHtmlRequestBuilder
         */
        public CreateProjectWithEmbeddableHtmlRequestBuilder small(Boolean small) {
            this.small = small;
            return this;
        }
        
        /**
         * Set textColor
         * @param textColor Text color used in the player. If not provided, default text color set in the Player settings is used. (optional)
         * @return CreateProjectWithEmbeddableHtmlRequestBuilder
         */
        public CreateProjectWithEmbeddableHtmlRequestBuilder textColor(String textColor) {
            this.textColor = textColor;
            return this;
        }
        
        /**
         * Set backgroundColor
         * @param backgroundColor Background color used in the player. If not provided, default background color set in the Player settings is used. (optional)
         * @return CreateProjectWithEmbeddableHtmlRequestBuilder
         */
        public CreateProjectWithEmbeddableHtmlRequestBuilder backgroundColor(String backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }
        
        /**
         * Set sessionization
         * @param sessionization Specifies for how many minutes to persist the session across page reloads. If not provided, default sessionization set in the Player settings is used. (optional, default to 0)
         * @return CreateProjectWithEmbeddableHtmlRequestBuilder
         */
        public CreateProjectWithEmbeddableHtmlRequestBuilder sessionization(Integer sessionization) {
            this.sessionization = sessionization;
            return this;
        }
        
        /**
         * Set voiceId
         * @param voiceId Voice ID used to voice the content. If not provided, default voice ID set in the Player settings is used. (optional)
         * @return CreateProjectWithEmbeddableHtmlRequestBuilder
         */
        public CreateProjectWithEmbeddableHtmlRequestBuilder voiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        
        /**
         * Set modelId
         * @param modelId TTS Model ID used in the player. If not provided, default model ID set in the Player settings is used. (optional)
         * @return CreateProjectWithEmbeddableHtmlRequestBuilder
         */
        public CreateProjectWithEmbeddableHtmlRequestBuilder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        
        /**
         * Set autoConvert
         * @param autoConvert Whether to auto convert the project to audio or not. (optional, default to false)
         * @return CreateProjectWithEmbeddableHtmlRequestBuilder
         */
        public CreateProjectWithEmbeddableHtmlRequestBuilder autoConvert(Boolean autoConvert) {
            this.autoConvert = autoConvert;
            return this;
        }
        
        /**
         * Build call for createProjectWithEmbeddableHtml
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            BodyCreatesAudioNativeEnabledProjectV1AudioNativePost bodyCreatesAudioNativeEnabledProjectV1AudioNativePost = buildBodyParams();
            return createProjectWithEmbeddableHtmlCall(name, _file, bodyCreatesAudioNativeEnabledProjectV1AudioNativePost, xiApiKey, title, image, author, small, textColor, backgroundColor, sessionization, voiceId, modelId, autoConvert, _callback);
        }

        private BodyCreatesAudioNativeEnabledProjectV1AudioNativePost buildBodyParams() {
            BodyCreatesAudioNativeEnabledProjectV1AudioNativePost bodyCreatesAudioNativeEnabledProjectV1AudioNativePost = new BodyCreatesAudioNativeEnabledProjectV1AudioNativePost();
            bodyCreatesAudioNativeEnabledProjectV1AudioNativePost.title(this.title);
            bodyCreatesAudioNativeEnabledProjectV1AudioNativePost.name(this.name);
            bodyCreatesAudioNativeEnabledProjectV1AudioNativePost.image(this.image);
            bodyCreatesAudioNativeEnabledProjectV1AudioNativePost.author(this.author);
            bodyCreatesAudioNativeEnabledProjectV1AudioNativePost.small(this.small);
            bodyCreatesAudioNativeEnabledProjectV1AudioNativePost.textColor(this.textColor);
            bodyCreatesAudioNativeEnabledProjectV1AudioNativePost.backgroundColor(this.backgroundColor);
            bodyCreatesAudioNativeEnabledProjectV1AudioNativePost.sessionization(this.sessionization);
            bodyCreatesAudioNativeEnabledProjectV1AudioNativePost.voiceId(this.voiceId);
            bodyCreatesAudioNativeEnabledProjectV1AudioNativePost.modelId(this.modelId);
            bodyCreatesAudioNativeEnabledProjectV1AudioNativePost._file(this._file);
            bodyCreatesAudioNativeEnabledProjectV1AudioNativePost.autoConvert(this.autoConvert);
            return bodyCreatesAudioNativeEnabledProjectV1AudioNativePost;
        }

        /**
         * Execute createProjectWithEmbeddableHtml request
         * @return AudioNativeCreateProjectResponseModel
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public AudioNativeCreateProjectResponseModel execute() throws ApiException {
            BodyCreatesAudioNativeEnabledProjectV1AudioNativePost bodyCreatesAudioNativeEnabledProjectV1AudioNativePost = buildBodyParams();
            ApiResponse<AudioNativeCreateProjectResponseModel> localVarResp = createProjectWithEmbeddableHtmlWithHttpInfo(name, _file, bodyCreatesAudioNativeEnabledProjectV1AudioNativePost, xiApiKey, title, image, author, small, textColor, backgroundColor, sessionization, voiceId, modelId, autoConvert);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createProjectWithEmbeddableHtml request with HTTP info returned
         * @return ApiResponse&lt;AudioNativeCreateProjectResponseModel&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AudioNativeCreateProjectResponseModel> executeWithHttpInfo() throws ApiException {
            BodyCreatesAudioNativeEnabledProjectV1AudioNativePost bodyCreatesAudioNativeEnabledProjectV1AudioNativePost = buildBodyParams();
            return createProjectWithEmbeddableHtmlWithHttpInfo(name, _file, bodyCreatesAudioNativeEnabledProjectV1AudioNativePost, xiApiKey, title, image, author, small, textColor, backgroundColor, sessionization, voiceId, modelId, autoConvert);
        }

        /**
         * Execute createProjectWithEmbeddableHtml request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AudioNativeCreateProjectResponseModel> _callback) throws ApiException {
            BodyCreatesAudioNativeEnabledProjectV1AudioNativePost bodyCreatesAudioNativeEnabledProjectV1AudioNativePost = buildBodyParams();
            return createProjectWithEmbeddableHtmlAsync(name, _file, bodyCreatesAudioNativeEnabledProjectV1AudioNativePost, xiApiKey, title, image, author, small, textColor, backgroundColor, sessionization, voiceId, modelId, autoConvert, _callback);
        }
    }

    /**
     * Creates Audionative Enabled Project.
     * Creates AudioNative enabled project, optionally starts conversion and returns project id and embeddable html snippet.
     * @param name Project name. (required)
     * @param _file Either txt or HTML input file containing the article content. HTML should be formatted as follows &#39;&amp;lt;html&amp;gt;&amp;lt;body&amp;gt;&amp;lt;div&amp;gt;&amp;lt;p&amp;gt;Your content&amp;lt;/p&amp;gt;&amp;lt;h5&amp;gt;More of your content&amp;lt;/h5&amp;gt;&amp;lt;p&amp;gt;Some more of your content&amp;lt;/p&amp;gt;&amp;lt;/div&amp;gt;&amp;lt;/body&amp;gt;&amp;lt;/html&amp;gt;&#39; (required)
     * @param bodyCreatesAudioNativeEnabledProjectV1AudioNativePost  (required)
     * @return CreateProjectWithEmbeddableHtmlRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public CreateProjectWithEmbeddableHtmlRequestBuilder createProjectWithEmbeddableHtml(String name, File _file) throws IllegalArgumentException {
        if (name == null) throw new IllegalArgumentException("\"name\" is required but got null");
            

        if (_file == null) throw new IllegalArgumentException("\"_file\" is required but got null");
        return new CreateProjectWithEmbeddableHtmlRequestBuilder(name, _file);
    }
}
