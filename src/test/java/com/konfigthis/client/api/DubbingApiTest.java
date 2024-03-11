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
import com.konfigthis.client.model.BodyDubAVideoOrAnAudioFileV1DubbingPost;
import com.konfigthis.client.model.DoDubbingResponseModel;
import java.io.File;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DubbingApi
 */
@Disabled
public class DubbingApiTest {

    private static DubbingApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DubbingApi(apiClient);
    }

    /**
     * Delete Dubbing Project
     *
     * Deletes a dubbing project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProjectTest() throws ApiException {
        String dubbingId = null;
        String xiApiKey = null;
        Object response = api.deleteProject(dubbingId)
                .xiApiKey(xiApiKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Dub A Video Or An Audio File
     *
     * Dubs provided audio or video file into given language.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fileInLanguageTest() throws ApiException {
        String targetLang = null;
        String xiApiKey = null;
        String mode = null;
        File _file = null;
        File csvFile = null;
        File foregroundAudioFile = null;
        File backgroundAudioFile = null;
        String name = null;
        String sourceUrl = null;
        String sourceLang = null;
        Integer numSpeakers = null;
        Boolean watermark = null;
        Integer startTime = null;
        Integer endTime = null;
        Boolean highestResolution = null;
        Boolean dubbingStudio = null;
        DoDubbingResponseModel response = api.fileInLanguage(targetLang)
                .xiApiKey(xiApiKey)
                .mode(mode)
                ._file(_file)
                .csvFile(csvFile)
                .foregroundAudioFile(foregroundAudioFile)
                .backgroundAudioFile(backgroundAudioFile)
                .name(name)
                .sourceUrl(sourceUrl)
                .sourceLang(sourceLang)
                .numSpeakers(numSpeakers)
                .watermark(watermark)
                .startTime(startTime)
                .endTime(endTime)
                .highestResolution(highestResolution)
                .dubbingStudio(dubbingStudio)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Dubbed File
     *
     * Returns dubbed file.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFileTest() throws ApiException {
        String dubbingId = null;
        String languageCode = null;
        String xiApiKey = null;
        Object response = api.getFile(dubbingId, languageCode)
                .xiApiKey(xiApiKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Dubbing Project Metadata
     *
     * Returns metadata about a dubbing project, including whether it&#39;s still in progress or not
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectMetadataTest() throws ApiException {
        String dubbingId = null;
        String xiApiKey = null;
        Object response = api.getProjectMetadata(dubbingId)
                .xiApiKey(xiApiKey)
                .execute();
        // TODO: test validations
    }

}