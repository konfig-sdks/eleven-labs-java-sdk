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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SamplesApi
 */
@Disabled
public class SamplesApiTest {

    private static SamplesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SamplesApi(apiClient);
    }

    /**
     * Get Audio From Sample
     *
     * Returns the audio corresponding to a sample attached to a voice.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAudioFromSampleTest() throws ApiException {
        String voiceId = null;
        String sampleId = null;
        String xiApiKey = null;
        api.getAudioFromSample(voiceId, sampleId)
                .xiApiKey(xiApiKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete Sample
     *
     * Removes a sample by its ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeByIdTest() throws ApiException {
        String voiceId = null;
        String sampleId = null;
        String xiApiKey = null;
        Object response = api.removeById(voiceId, sampleId)
                .xiApiKey(xiApiKey)
                .execute();
        // TODO: test validations
    }

}
