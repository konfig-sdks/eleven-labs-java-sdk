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


import com.konfigthis.client.model.BodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost;
import com.konfigthis.client.model.BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost;
import com.konfigthis.client.model.VoiceGenerationParameterResponseModel;
import com.konfigthis.client.model.VoiceResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class VoiceGenerationApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VoiceGenerationApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public VoiceGenerationApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call createVoiceCall(BodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost, String xiApiKey, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost;

        // create path and map variables
        String localVarPath = "/v1/voice-generation/create-voice";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createVoiceValidateBeforeCall(BodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost, String xiApiKey, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost' is set
        if (bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost == null) {
            throw new ApiException("Missing the required parameter 'bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost' when calling createVoice(Async)");
        }

        return createVoiceCall(bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost, xiApiKey, _callback);

    }


    private ApiResponse<VoiceResponseModel> createVoiceWithHttpInfo(BodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost, String xiApiKey) throws ApiException {
        okhttp3.Call localVarCall = createVoiceValidateBeforeCall(bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost, xiApiKey, null);
        Type localVarReturnType = new TypeToken<VoiceResponseModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createVoiceAsync(BodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost, String xiApiKey, final ApiCallback<VoiceResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createVoiceValidateBeforeCall(bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost, xiApiKey, _callback);
        Type localVarReturnType = new TypeToken<VoiceResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateVoiceRequestBuilder {
        private final String voiceName;
        private final String voiceDescription;
        private final String generatedVoiceId;
        private Map<String, String> labels;
        private String xiApiKey;

        private CreateVoiceRequestBuilder(String voiceName, String voiceDescription, String generatedVoiceId) {
            this.voiceName = voiceName;
            this.voiceDescription = voiceDescription;
            this.generatedVoiceId = generatedVoiceId;
        }

        /**
         * Set labels
         * @param labels Optional, metadata to add to the created voice. Defaults to None. (optional)
         * @return CreateVoiceRequestBuilder
         */
        public CreateVoiceRequestBuilder labels(Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        
        /**
         * Set xiApiKey
         * @param xiApiKey Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. (optional)
         * @return CreateVoiceRequestBuilder
         */
        public CreateVoiceRequestBuilder xiApiKey(String xiApiKey) {
            this.xiApiKey = xiApiKey;
            return this;
        }
        
        /**
         * Build call for createVoice
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
            BodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost = buildBodyParams();
            return createVoiceCall(bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost, xiApiKey, _callback);
        }

        private BodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost buildBodyParams() {
            BodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost = new BodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost();
            bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost.voiceName(this.voiceName);
            bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost.voiceDescription(this.voiceDescription);
            bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost.generatedVoiceId(this.generatedVoiceId);
            bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost.labels(this.labels);
            return bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost;
        }

        /**
         * Execute createVoice request
         * @return VoiceResponseModel
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public VoiceResponseModel execute() throws ApiException {
            BodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost = buildBodyParams();
            ApiResponse<VoiceResponseModel> localVarResp = createVoiceWithHttpInfo(bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost, xiApiKey);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createVoice request with HTTP info returned
         * @return ApiResponse&lt;VoiceResponseModel&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<VoiceResponseModel> executeWithHttpInfo() throws ApiException {
            BodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost = buildBodyParams();
            return createVoiceWithHttpInfo(bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost, xiApiKey);
        }

        /**
         * Execute createVoice request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<VoiceResponseModel> _callback) throws ApiException {
            BodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost = buildBodyParams();
            return createVoiceAsync(bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost, xiApiKey, _callback);
        }
    }

    /**
     * Create A Previously Generated Voice
     * Create a previously generated voice. This endpoint should be called after you fetched a generated_voice_id using /v1/voice-generation/generate-voice.
     * @param bodyCreateAPreviouslyGeneratedVoiceV1VoiceGenerationCreateVoicePost  (required)
     * @return CreateVoiceRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public CreateVoiceRequestBuilder createVoice(String voiceName, String voiceDescription, String generatedVoiceId) throws IllegalArgumentException {
        if (voiceName == null) throw new IllegalArgumentException("\"voiceName\" is required but got null");
            

        if (voiceDescription == null) throw new IllegalArgumentException("\"voiceDescription\" is required but got null");
            

        if (generatedVoiceId == null) throw new IllegalArgumentException("\"generatedVoiceId\" is required but got null");
            

        return new CreateVoiceRequestBuilder(voiceName, voiceDescription, generatedVoiceId);
    }
    private okhttp3.Call generateRandomVoiceCall(BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost, String xiApiKey, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost;

        // create path and map variables
        String localVarPath = "/v1/voice-generation/generate-voice";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xiApiKey != null) {
            localVarHeaderParams.put("xi-api-key", localVarApiClient.parameterToString(xiApiKey));
        }

        final String[] localVarAccepts = {
            "audio/mpeg",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call generateRandomVoiceValidateBeforeCall(BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost, String xiApiKey, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost' is set
        if (bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost == null) {
            throw new ApiException("Missing the required parameter 'bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost' when calling generateRandomVoice(Async)");
        }

        return generateRandomVoiceCall(bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost, xiApiKey, _callback);

    }


    private ApiResponse<Void> generateRandomVoiceWithHttpInfo(BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost, String xiApiKey) throws ApiException {
        okhttp3.Call localVarCall = generateRandomVoiceValidateBeforeCall(bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost, xiApiKey, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call generateRandomVoiceAsync(BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost, String xiApiKey, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = generateRandomVoiceValidateBeforeCall(bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost, xiApiKey, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class GenerateRandomVoiceRequestBuilder {
        private final String gender;
        private final String accent;
        private final String age;
        private final Double accentStrength;
        private final String text;
        private String xiApiKey;

        private GenerateRandomVoiceRequestBuilder(String gender, String accent, String age, double accentStrength, String text) {
            this.gender = gender;
            this.accent = accent;
            this.age = age;
            this.accentStrength = accentStrength;
            this.text = text;
        }

        /**
         * Set xiApiKey
         * @param xiApiKey Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. (optional)
         * @return GenerateRandomVoiceRequestBuilder
         */
        public GenerateRandomVoiceRequestBuilder xiApiKey(String xiApiKey) {
            this.xiApiKey = xiApiKey;
            return this;
        }
        
        /**
         * Build call for generateRandomVoice
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
            BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost = buildBodyParams();
            return generateRandomVoiceCall(bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost, xiApiKey, _callback);
        }

        private BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost buildBodyParams() {
            BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost = new BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost();
            if (this.gender != null)
            bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost.gender(BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost.GenderEnum.fromValue(this.gender));
            bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost.accent(this.accent);
            if (this.age != null)
            bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost.age(BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost.AgeEnum.fromValue(this.age));
            bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost.accentStrength(this.accentStrength);
            bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost.text(this.text);
            return bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost;
        }

        /**
         * Execute generateRandomVoice request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost = buildBodyParams();
            generateRandomVoiceWithHttpInfo(bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost, xiApiKey);
        }

        /**
         * Execute generateRandomVoice request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost = buildBodyParams();
            return generateRandomVoiceWithHttpInfo(bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost, xiApiKey);
        }

        /**
         * Execute generateRandomVoice request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            BodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost = buildBodyParams();
            return generateRandomVoiceAsync(bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost, xiApiKey, _callback);
        }
    }

    /**
     * Generate A Random Voice
     * Generate a random voice based on parameters. This method returns a generated_voice_id in the response header, and a sample of the voice in the body. If you like the generated voice call /v1/voice-generation/create-voice with the generated_voice_id to create the voice.
     * @param bodyGenerateARandomVoiceV1VoiceGenerationGenerateVoicePost  (required)
     * @return GenerateRandomVoiceRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public GenerateRandomVoiceRequestBuilder generateRandomVoice(String gender, String accent, String age, double accentStrength, String text) throws IllegalArgumentException {
        if (gender == null) throw new IllegalArgumentException("\"gender\" is required but got null");
            

        if (accent == null) throw new IllegalArgumentException("\"accent\" is required but got null");
            

        if (age == null) throw new IllegalArgumentException("\"age\" is required but got null");
            

        
        if (text == null) throw new IllegalArgumentException("\"text\" is required but got null");
            

        return new GenerateRandomVoiceRequestBuilder(gender, accent, age, accentStrength, text);
    }
    private okhttp3.Call getVoiceGenerationParametersCall(final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/voice-generation/generate-voice/parameters";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getVoiceGenerationParametersValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getVoiceGenerationParametersCall(_callback);

    }


    private ApiResponse<VoiceGenerationParameterResponseModel> getVoiceGenerationParametersWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getVoiceGenerationParametersValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<VoiceGenerationParameterResponseModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getVoiceGenerationParametersAsync(final ApiCallback<VoiceGenerationParameterResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = getVoiceGenerationParametersValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<VoiceGenerationParameterResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetVoiceGenerationParametersRequestBuilder {

        private GetVoiceGenerationParametersRequestBuilder() {
        }

        /**
         * Build call for getVoiceGenerationParameters
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
            return getVoiceGenerationParametersCall(_callback);
        }


        /**
         * Execute getVoiceGenerationParameters request
         * @return VoiceGenerationParameterResponseModel
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public VoiceGenerationParameterResponseModel execute() throws ApiException {
            ApiResponse<VoiceGenerationParameterResponseModel> localVarResp = getVoiceGenerationParametersWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getVoiceGenerationParameters request with HTTP info returned
         * @return ApiResponse&lt;VoiceGenerationParameterResponseModel&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<VoiceGenerationParameterResponseModel> executeWithHttpInfo() throws ApiException {
            return getVoiceGenerationParametersWithHttpInfo();
        }

        /**
         * Execute getVoiceGenerationParameters request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<VoiceGenerationParameterResponseModel> _callback) throws ApiException {
            return getVoiceGenerationParametersAsync(_callback);
        }
    }

    /**
     * Voice Generation Parameters
     * Get possible parameters for the /v1/voice-generation/generate-voice endpoint.
     * @return GetVoiceGenerationParametersRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public GetVoiceGenerationParametersRequestBuilder getVoiceGenerationParameters() throws IllegalArgumentException {
        return new GetVoiceGenerationParametersRequestBuilder();
    }
}