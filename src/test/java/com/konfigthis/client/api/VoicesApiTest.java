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
import com.konfigthis.client.model.AddVoiceResponseModel;
import com.konfigthis.client.model.BodyAddSharingVoiceV1VoicesAddPublicUserIdVoiceIdPost;
import com.konfigthis.client.model.BodyAddVoiceV1VoicesAddPost;
import com.konfigthis.client.model.BodyEditVoiceV1VoicesVoiceIdEditPost;
import java.io.File;
import com.konfigthis.client.model.GetLibraryVoicesResponseModel;
import com.konfigthis.client.model.GetVoicesResponseModel;
import com.konfigthis.client.model.VoiceResponseModel;
import com.konfigthis.client.model.VoiceSettingsResponseModel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VoicesApi
 */
@Disabled
public class VoicesApiTest {

    private static VoicesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new VoicesApi(apiClient);
    }

    /**
     * Add Sharing Voice
     *
     * Add a sharing voice to your collection of voices in VoiceLab.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addToCollectionTest() throws ApiException {
        String newName = null;
        String publicUserId = null;
        String voiceId = null;
        String xiApiKey = null;
        AddVoiceResponseModel response = api.addToCollection(newName, publicUserId, voiceId)
                .xiApiKey(xiApiKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Add Voice
     *
     * Add a new voice to your collection of voices in VoiceLab.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addVoiceToCollectionTest() throws ApiException {
        String name = null;
        List<File> files = null;
        String xiApiKey = null;
        String description = null;
        String labels = null;
        AddVoiceResponseModel response = api.addVoiceToCollection(name, files)
                .xiApiKey(xiApiKey)
                .description(description)
                .labels(labels)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete Voice
     *
     * Deletes a voice by its ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteByIdTest() throws ApiException {
        String voiceId = null;
        String xiApiKey = null;
        Object response = api.deleteById(voiceId)
                .xiApiKey(xiApiKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit Voice Settings
     *
     * Edit your settings for a specific voice. \&quot;similarity_boost\&quot; corresponds to\&quot;Clarity + Similarity Enhancement\&quot; in the web app and \&quot;stability\&quot; corresponds to \&quot;Stability\&quot; slider in the web app.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editSettingsPostTest() throws ApiException {
        Double stability = null;
        Double similarityBoost = null;
        String voiceId = null;
        Double style = null;
        Boolean useSpeakerBoost = null;
        String xiApiKey = null;
        Object response = api.editSettingsPost(stability, similarityBoost, voiceId)
                .style(style)
                .useSpeakerBoost(useSpeakerBoost)
                .xiApiKey(xiApiKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Default Voice Settings.
     *
     * Gets the default settings for voices. \&quot;similarity_boost\&quot; corresponds to\&quot;Clarity + Similarity Enhancement\&quot; in the web app and \&quot;stability\&quot; corresponds to \&quot;Stability\&quot; slider in the web app.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDefaultVoiceSettingsTest() throws ApiException {
        VoiceSettingsResponseModel response = api.getDefaultVoiceSettings()
                .execute();
        // TODO: test validations
    }

    /**
     * Get Voice Settings
     *
     * Returns the settings for a specific voice. \&quot;similarity_boost\&quot; corresponds to\&quot;Clarity + Similarity Enhancement\&quot; in the web app and \&quot;stability\&quot; corresponds to \&quot;Stability\&quot; slider in the web app.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSettingsTest() throws ApiException {
        String voiceId = null;
        String xiApiKey = null;
        VoiceSettingsResponseModel response = api.getSettings(voiceId)
                .xiApiKey(xiApiKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Voices
     *
     * Gets a list of shared voices.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSharedVoicesTest() throws ApiException {
        Integer pageSize = null;
        String category = null;
        String gender = null;
        String age = null;
        String accent = null;
        String search = null;
        List<String> useCases = null;
        List<String> descriptives = null;
        String sort = null;
        Boolean featured = null;
        Integer page = null;
        String xiApiKey = null;
        GetLibraryVoicesResponseModel response = api.getSharedVoices()
                .pageSize(pageSize)
                .category(category)
                .gender(gender)
                .age(age)
                .accent(accent)
                .search(search)
                .useCases(useCases)
                .descriptives(descriptives)
                .sort(sort)
                .featured(featured)
                .page(page)
                .xiApiKey(xiApiKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Voice
     *
     * Returns metadata about a specific voice.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVoiceMetadataTest() throws ApiException {
        String voiceId = null;
        Boolean withSettings = null;
        String xiApiKey = null;
        VoiceResponseModel response = api.getVoiceMetadata(voiceId)
                .withSettings(withSettings)
                .xiApiKey(xiApiKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Voices
     *
     * Gets a list of all available voices for a user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllVoicesTest() throws ApiException {
        String xiApiKey = null;
        GetVoicesResponseModel response = api.listAllVoices()
                .xiApiKey(xiApiKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit Voice
     *
     * Edit a voice created by you.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateVoiceByIdTest() throws ApiException {
        String voiceId = null;
        String name = null;
        String xiApiKey = null;
        String description = null;
        List<File> files = null;
        String labels = null;
        Object response = api.updateVoiceById(voiceId, name)
                .xiApiKey(xiApiKey)
                .description(description)
                .files(files)
                .labels(labels)
                .execute();
        // TODO: test validations
    }

}
