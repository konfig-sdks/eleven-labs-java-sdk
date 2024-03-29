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
import com.konfigthis.client.model.AddPronunciationDictionaryResponseModel;
import com.konfigthis.client.model.BodyAddAPronunciationDictionaryV1PronunciationDictionariesAddFromFilePost;
import java.io.File;
import com.konfigthis.client.model.GetPronunciationDictionaryMetadataResponseModel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PronunciationDictionaryApi
 */
@Disabled
public class PronunciationDictionaryApiTest {

    private static PronunciationDictionaryApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PronunciationDictionaryApi(apiClient);
    }

    /**
     * Add A Pronunciation Dictionary
     *
     * Creates a new pronunciation dictionary from a lexicon .PLS file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createFromFileTest() throws ApiException {
        String name = null;
        String xiApiKey = null;
        String description = null;
        File _file = null;
        AddPronunciationDictionaryResponseModel response = api.createFromFile(name)
                .xiApiKey(xiApiKey)
                .description(description)
                ._file(_file)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Metadata For A Pronunciation Dictionary
     *
     * Get metadata for a pronunciation dictionary
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMetadataTest() throws ApiException {
        String pronunciationDictionaryId = null;
        String xiApiKey = null;
        GetPronunciationDictionaryMetadataResponseModel response = api.getMetadata(pronunciationDictionaryId)
                .xiApiKey(xiApiKey)
                .execute();
        // TODO: test validations
    }

}
