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


import com.konfigthis.client.model.BodyTextToSpeechV1TextToSpeechVoiceIdPost;
import com.konfigthis.client.model.BodyTextToSpeechV1TextToSpeechVoiceIdStreamPost;
import com.konfigthis.client.model.PronunciationDictionaryVersionLocatorDBModel;
import com.konfigthis.client.model.VoiceSettingsResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class TextToSpeechApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TextToSpeechApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public TextToSpeechApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call convertTextToSpeechCall(String voiceId, BodyTextToSpeechV1TextToSpeechVoiceIdPost bodyTextToSpeechV1TextToSpeechVoiceIdPost, Integer optimizeStreamingLatency, String outputFormat, String xiApiKey, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = bodyTextToSpeechV1TextToSpeechVoiceIdPost;

        // create path and map variables
        String localVarPath = "/v1/text-to-speech/{voice_id}"
            .replace("{" + "voice_id" + "}", localVarApiClient.escapeString(voiceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (optimizeStreamingLatency != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("optimize_streaming_latency", optimizeStreamingLatency));
        }

        if (outputFormat != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("output_format", outputFormat));
        }

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
    private okhttp3.Call convertTextToSpeechValidateBeforeCall(String voiceId, BodyTextToSpeechV1TextToSpeechVoiceIdPost bodyTextToSpeechV1TextToSpeechVoiceIdPost, Integer optimizeStreamingLatency, String outputFormat, String xiApiKey, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'voiceId' is set
        if (voiceId == null) {
            throw new ApiException("Missing the required parameter 'voiceId' when calling convertTextToSpeech(Async)");
        }

        // verify the required parameter 'bodyTextToSpeechV1TextToSpeechVoiceIdPost' is set
        if (bodyTextToSpeechV1TextToSpeechVoiceIdPost == null) {
            throw new ApiException("Missing the required parameter 'bodyTextToSpeechV1TextToSpeechVoiceIdPost' when calling convertTextToSpeech(Async)");
        }

        return convertTextToSpeechCall(voiceId, bodyTextToSpeechV1TextToSpeechVoiceIdPost, optimizeStreamingLatency, outputFormat, xiApiKey, _callback);

    }


    private ApiResponse<Void> convertTextToSpeechWithHttpInfo(String voiceId, BodyTextToSpeechV1TextToSpeechVoiceIdPost bodyTextToSpeechV1TextToSpeechVoiceIdPost, Integer optimizeStreamingLatency, String outputFormat, String xiApiKey) throws ApiException {
        okhttp3.Call localVarCall = convertTextToSpeechValidateBeforeCall(voiceId, bodyTextToSpeechV1TextToSpeechVoiceIdPost, optimizeStreamingLatency, outputFormat, xiApiKey, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call convertTextToSpeechAsync(String voiceId, BodyTextToSpeechV1TextToSpeechVoiceIdPost bodyTextToSpeechV1TextToSpeechVoiceIdPost, Integer optimizeStreamingLatency, String outputFormat, String xiApiKey, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = convertTextToSpeechValidateBeforeCall(voiceId, bodyTextToSpeechV1TextToSpeechVoiceIdPost, optimizeStreamingLatency, outputFormat, xiApiKey, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class ConvertTextToSpeechRequestBuilder {
        private final String text;
        private final String voiceId;
        private String modelId;
        private VoiceSettingsResponseModel voiceSettings;
        private List<PronunciationDictionaryVersionLocatorDBModel> pronunciationDictionaryLocators;
        private Integer optimizeStreamingLatency;
        private String outputFormat;
        private String xiApiKey;

        private ConvertTextToSpeechRequestBuilder(String text, String voiceId) {
            this.text = text;
            this.voiceId = voiceId;
        }

        /**
         * Set modelId
         * @param modelId Identifier of the model that will be used, you can query them using GET /v1/models. The model needs to have support for text to speech, you can check this using the can_do_text_to_speech property. (optional, default to eleven_monolingual_v1)
         * @return ConvertTextToSpeechRequestBuilder
         */
        public ConvertTextToSpeechRequestBuilder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        
        /**
         * Set voiceSettings
         * @param voiceSettings Voice settings overriding stored setttings for the given voice. They are applied only on the given request. (optional)
         * @return ConvertTextToSpeechRequestBuilder
         */
        public ConvertTextToSpeechRequestBuilder voiceSettings(VoiceSettingsResponseModel voiceSettings) {
            this.voiceSettings = voiceSettings;
            return this;
        }
        
        /**
         * Set pronunciationDictionaryLocators
         * @param pronunciationDictionaryLocators A list of pronunciation dictionary locators (id, version_id) to be applied to the text. They will be applied in order. You may have up to 3 locators per request (optional)
         * @return ConvertTextToSpeechRequestBuilder
         */
        public ConvertTextToSpeechRequestBuilder pronunciationDictionaryLocators(List<PronunciationDictionaryVersionLocatorDBModel> pronunciationDictionaryLocators) {
            this.pronunciationDictionaryLocators = pronunciationDictionaryLocators;
            return this;
        }
        
        /**
         * Set optimizeStreamingLatency
         * @param optimizeStreamingLatency You can turn on latency optimizations at some cost of quality. The best possible final latency varies by model. Possible values: 0 - default mode (no latency optimizations) 1 - normal latency optimizations (about 50% of possible latency improvement of option 3) 2 - strong latency optimizations (about 75% of possible latency improvement of option 3) 3 - max latency optimizations 4 - max latency optimizations, but also with text normalizer turned off for even more latency savings (best latency, but can mispronounce eg numbers and dates).  Defaults to 0.  (optional, default to 0)
         * @return ConvertTextToSpeechRequestBuilder
         */
        public ConvertTextToSpeechRequestBuilder optimizeStreamingLatency(Integer optimizeStreamingLatency) {
            this.optimizeStreamingLatency = optimizeStreamingLatency;
            return this;
        }
        
        /**
         * Set outputFormat
         * @param outputFormat Output format of the generated audio. Must be one of: mp3_22050_32 - output format, mp3 with 22.05kHz sample rate at 32kbps. mp3_44100_32 - output format, mp3 with 44.1kHz sample rate at 32kbps. mp3_44100_64 - output format, mp3 with 44.1kHz sample rate at 64kbps. mp3_44100_96 - output format, mp3 with 44.1kHz sample rate at 96kbps. mp3_44100_128 - default output format, mp3 with 44.1kHz sample rate at 128kbps. mp3_44100_192 - output format, mp3 with 44.1kHz sample rate at 192kbps. Requires you to be subscribed to Creator tier or above. pcm_16000 - PCM format (S16LE) with 16kHz sample rate. pcm_22050 - PCM format (S16LE) with 22.05kHz sample rate. pcm_24000 - PCM format (S16LE) with 24kHz sample rate. pcm_44100 - PCM format (S16LE) with 44.1kHz sample rate. Requires you to be subscribed to Pro tier or above. ulaw_8000 - μ-law format (sometimes written mu-law, often approximated as u-law) with 8kHz sample rate. Note that this format is commonly used for Twilio audio inputs.  (optional, default to mp3_44100_128)
         * @return ConvertTextToSpeechRequestBuilder
         */
        public ConvertTextToSpeechRequestBuilder outputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        
        /**
         * Set xiApiKey
         * @param xiApiKey Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. (optional)
         * @return ConvertTextToSpeechRequestBuilder
         */
        public ConvertTextToSpeechRequestBuilder xiApiKey(String xiApiKey) {
            this.xiApiKey = xiApiKey;
            return this;
        }
        
        /**
         * Build call for convertTextToSpeech
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
            BodyTextToSpeechV1TextToSpeechVoiceIdPost bodyTextToSpeechV1TextToSpeechVoiceIdPost = buildBodyParams();
            return convertTextToSpeechCall(voiceId, bodyTextToSpeechV1TextToSpeechVoiceIdPost, optimizeStreamingLatency, outputFormat, xiApiKey, _callback);
        }

        private BodyTextToSpeechV1TextToSpeechVoiceIdPost buildBodyParams() {
            BodyTextToSpeechV1TextToSpeechVoiceIdPost bodyTextToSpeechV1TextToSpeechVoiceIdPost = new BodyTextToSpeechV1TextToSpeechVoiceIdPost();
            bodyTextToSpeechV1TextToSpeechVoiceIdPost.text(this.text);
            bodyTextToSpeechV1TextToSpeechVoiceIdPost.modelId(this.modelId);
            bodyTextToSpeechV1TextToSpeechVoiceIdPost.voiceSettings(this.voiceSettings);
            bodyTextToSpeechV1TextToSpeechVoiceIdPost.pronunciationDictionaryLocators(this.pronunciationDictionaryLocators);
            return bodyTextToSpeechV1TextToSpeechVoiceIdPost;
        }

        /**
         * Execute convertTextToSpeech request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            BodyTextToSpeechV1TextToSpeechVoiceIdPost bodyTextToSpeechV1TextToSpeechVoiceIdPost = buildBodyParams();
            convertTextToSpeechWithHttpInfo(voiceId, bodyTextToSpeechV1TextToSpeechVoiceIdPost, optimizeStreamingLatency, outputFormat, xiApiKey);
        }

        /**
         * Execute convertTextToSpeech request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            BodyTextToSpeechV1TextToSpeechVoiceIdPost bodyTextToSpeechV1TextToSpeechVoiceIdPost = buildBodyParams();
            return convertTextToSpeechWithHttpInfo(voiceId, bodyTextToSpeechV1TextToSpeechVoiceIdPost, optimizeStreamingLatency, outputFormat, xiApiKey);
        }

        /**
         * Execute convertTextToSpeech request (asynchronously)
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
            BodyTextToSpeechV1TextToSpeechVoiceIdPost bodyTextToSpeechV1TextToSpeechVoiceIdPost = buildBodyParams();
            return convertTextToSpeechAsync(voiceId, bodyTextToSpeechV1TextToSpeechVoiceIdPost, optimizeStreamingLatency, outputFormat, xiApiKey, _callback);
        }
    }

    /**
     * Text To Speech
     * Converts text into speech using a voice of your choice and returns audio.
     * @param voiceId Voice ID to be used, you can use https://api.elevenlabs.io/v1/voices to list all the available voices. (required)
     * @param bodyTextToSpeechV1TextToSpeechVoiceIdPost  (required)
     * @return ConvertTextToSpeechRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public ConvertTextToSpeechRequestBuilder convertTextToSpeech(String text, String voiceId) throws IllegalArgumentException {
        if (text == null) throw new IllegalArgumentException("\"text\" is required but got null");
            

        if (voiceId == null) throw new IllegalArgumentException("\"voiceId\" is required but got null");
            

        return new ConvertTextToSpeechRequestBuilder(text, voiceId);
    }
    private okhttp3.Call convertTextToSpeechStreamCall(String voiceId, BodyTextToSpeechV1TextToSpeechVoiceIdStreamPost bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost, Integer optimizeStreamingLatency, String outputFormat, String xiApiKey, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost;

        // create path and map variables
        String localVarPath = "/v1/text-to-speech/{voice_id}/stream"
            .replace("{" + "voice_id" + "}", localVarApiClient.escapeString(voiceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (optimizeStreamingLatency != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("optimize_streaming_latency", optimizeStreamingLatency));
        }

        if (outputFormat != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("output_format", outputFormat));
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
    private okhttp3.Call convertTextToSpeechStreamValidateBeforeCall(String voiceId, BodyTextToSpeechV1TextToSpeechVoiceIdStreamPost bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost, Integer optimizeStreamingLatency, String outputFormat, String xiApiKey, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'voiceId' is set
        if (voiceId == null) {
            throw new ApiException("Missing the required parameter 'voiceId' when calling convertTextToSpeechStream(Async)");
        }

        // verify the required parameter 'bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost' is set
        if (bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost == null) {
            throw new ApiException("Missing the required parameter 'bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost' when calling convertTextToSpeechStream(Async)");
        }

        return convertTextToSpeechStreamCall(voiceId, bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost, optimizeStreamingLatency, outputFormat, xiApiKey, _callback);

    }


    private ApiResponse<Void> convertTextToSpeechStreamWithHttpInfo(String voiceId, BodyTextToSpeechV1TextToSpeechVoiceIdStreamPost bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost, Integer optimizeStreamingLatency, String outputFormat, String xiApiKey) throws ApiException {
        okhttp3.Call localVarCall = convertTextToSpeechStreamValidateBeforeCall(voiceId, bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost, optimizeStreamingLatency, outputFormat, xiApiKey, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call convertTextToSpeechStreamAsync(String voiceId, BodyTextToSpeechV1TextToSpeechVoiceIdStreamPost bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost, Integer optimizeStreamingLatency, String outputFormat, String xiApiKey, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = convertTextToSpeechStreamValidateBeforeCall(voiceId, bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost, optimizeStreamingLatency, outputFormat, xiApiKey, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class ConvertTextToSpeechStreamRequestBuilder {
        private final String text;
        private final String voiceId;
        private String modelId;
        private VoiceSettingsResponseModel voiceSettings;
        private List<PronunciationDictionaryVersionLocatorDBModel> pronunciationDictionaryLocators;
        private Integer optimizeStreamingLatency;
        private String outputFormat;
        private String xiApiKey;

        private ConvertTextToSpeechStreamRequestBuilder(String text, String voiceId) {
            this.text = text;
            this.voiceId = voiceId;
        }

        /**
         * Set modelId
         * @param modelId Identifier of the model that will be used, you can query them using GET /v1/models. The model needs to have support for text to speech, you can check this using the can_do_text_to_speech property. (optional, default to eleven_monolingual_v1)
         * @return ConvertTextToSpeechStreamRequestBuilder
         */
        public ConvertTextToSpeechStreamRequestBuilder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        
        /**
         * Set voiceSettings
         * @param voiceSettings Voice settings overriding stored setttings for the given voice. They are applied only on the given request. (optional)
         * @return ConvertTextToSpeechStreamRequestBuilder
         */
        public ConvertTextToSpeechStreamRequestBuilder voiceSettings(VoiceSettingsResponseModel voiceSettings) {
            this.voiceSettings = voiceSettings;
            return this;
        }
        
        /**
         * Set pronunciationDictionaryLocators
         * @param pronunciationDictionaryLocators A list of pronunciation dictionary locators (id, version_id) to be applied to the text. They will be applied in order. You may have up to 3 locators per request (optional)
         * @return ConvertTextToSpeechStreamRequestBuilder
         */
        public ConvertTextToSpeechStreamRequestBuilder pronunciationDictionaryLocators(List<PronunciationDictionaryVersionLocatorDBModel> pronunciationDictionaryLocators) {
            this.pronunciationDictionaryLocators = pronunciationDictionaryLocators;
            return this;
        }
        
        /**
         * Set optimizeStreamingLatency
         * @param optimizeStreamingLatency You can turn on latency optimizations at some cost of quality. The best possible final latency varies by model. Possible values: 0 - default mode (no latency optimizations) 1 - normal latency optimizations (about 50% of possible latency improvement of option 3) 2 - strong latency optimizations (about 75% of possible latency improvement of option 3) 3 - max latency optimizations 4 - max latency optimizations, but also with text normalizer turned off for even more latency savings (best latency, but can mispronounce eg numbers and dates).  Defaults to 0.  (optional, default to 0)
         * @return ConvertTextToSpeechStreamRequestBuilder
         */
        public ConvertTextToSpeechStreamRequestBuilder optimizeStreamingLatency(Integer optimizeStreamingLatency) {
            this.optimizeStreamingLatency = optimizeStreamingLatency;
            return this;
        }
        
        /**
         * Set outputFormat
         * @param outputFormat Output format of the generated audio. Must be one of: mp3_22050_32 - output format, mp3 with 22.05kHz sample rate at 32kbps. mp3_44100_32 - output format, mp3 with 44.1kHz sample rate at 32kbps. mp3_44100_64 - output format, mp3 with 44.1kHz sample rate at 64kbps. mp3_44100_96 - output format, mp3 with 44.1kHz sample rate at 96kbps. mp3_44100_128 - default output format, mp3 with 44.1kHz sample rate at 128kbps. mp3_44100_192 - output format, mp3 with 44.1kHz sample rate at 192kbps. Requires you to be subscribed to Creator tier or above. pcm_16000 - PCM format (S16LE) with 16kHz sample rate. pcm_22050 - PCM format (S16LE) with 22.05kHz sample rate. pcm_24000 - PCM format (S16LE) with 24kHz sample rate. pcm_44100 - PCM format (S16LE) with 44.1kHz sample rate. Requires you to be subscribed to Pro tier or above. ulaw_8000 - μ-law format (sometimes written mu-law, often approximated as u-law) with 8kHz sample rate. Note that this format is commonly used for Twilio audio inputs.  (optional, default to mp3_44100_128)
         * @return ConvertTextToSpeechStreamRequestBuilder
         */
        public ConvertTextToSpeechStreamRequestBuilder outputFormat(String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }
        
        /**
         * Set xiApiKey
         * @param xiApiKey Your API key. This is required by most endpoints to access our API programatically. You can view your xi-api-key using the &#39;Profile&#39; tab on the website. (optional)
         * @return ConvertTextToSpeechStreamRequestBuilder
         */
        public ConvertTextToSpeechStreamRequestBuilder xiApiKey(String xiApiKey) {
            this.xiApiKey = xiApiKey;
            return this;
        }
        
        /**
         * Build call for convertTextToSpeechStream
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
            BodyTextToSpeechV1TextToSpeechVoiceIdStreamPost bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost = buildBodyParams();
            return convertTextToSpeechStreamCall(voiceId, bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost, optimizeStreamingLatency, outputFormat, xiApiKey, _callback);
        }

        private BodyTextToSpeechV1TextToSpeechVoiceIdStreamPost buildBodyParams() {
            BodyTextToSpeechV1TextToSpeechVoiceIdStreamPost bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost = new BodyTextToSpeechV1TextToSpeechVoiceIdStreamPost();
            bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost.text(this.text);
            bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost.modelId(this.modelId);
            bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost.voiceSettings(this.voiceSettings);
            bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost.pronunciationDictionaryLocators(this.pronunciationDictionaryLocators);
            return bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost;
        }

        /**
         * Execute convertTextToSpeechStream request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            BodyTextToSpeechV1TextToSpeechVoiceIdStreamPost bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost = buildBodyParams();
            convertTextToSpeechStreamWithHttpInfo(voiceId, bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost, optimizeStreamingLatency, outputFormat, xiApiKey);
        }

        /**
         * Execute convertTextToSpeechStream request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            BodyTextToSpeechV1TextToSpeechVoiceIdStreamPost bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost = buildBodyParams();
            return convertTextToSpeechStreamWithHttpInfo(voiceId, bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost, optimizeStreamingLatency, outputFormat, xiApiKey);
        }

        /**
         * Execute convertTextToSpeechStream request (asynchronously)
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
            BodyTextToSpeechV1TextToSpeechVoiceIdStreamPost bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost = buildBodyParams();
            return convertTextToSpeechStreamAsync(voiceId, bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost, optimizeStreamingLatency, outputFormat, xiApiKey, _callback);
        }
    }

    /**
     * Text To Speech
     * Converts text into speech using a voice of your choice and returns audio as an audio stream.
     * @param voiceId Voice ID to be used, you can use https://api.elevenlabs.io/v1/voices to list all the available voices. (required)
     * @param bodyTextToSpeechV1TextToSpeechVoiceIdStreamPost  (required)
     * @return ConvertTextToSpeechStreamRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public ConvertTextToSpeechStreamRequestBuilder convertTextToSpeechStream(String text, String voiceId) throws IllegalArgumentException {
        if (text == null) throw new IllegalArgumentException("\"text\" is required but got null");
            

        if (voiceId == null) throw new IllegalArgumentException("\"voiceId\" is required but got null");
            

        return new ConvertTextToSpeechStreamRequestBuilder(text, voiceId);
    }
}
