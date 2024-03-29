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
import com.konfigthis.client.model.BodyEditVanityLinkAdminN8enylacgdVanityLinkVanityLinkIdUpdatePost;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminApi
 */
@Disabled
public class AdminApiTest {

    private static AdminApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AdminApi(apiClient);
    }

    /**
     * Archive Coupon
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void archiveCouponPromocodePostTest() throws ApiException {
        String promocode = null;
        Object response = api.archiveCouponPromocodePost(promocode)
                .execute();
        // TODO: test validations
    }

    /**
     * Edit Vanity Link
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editVanityLinkTest() throws ApiException {
        String vanitySlug = null;
        String targetUrl = null;
        String comment = null;
        String vanityLinkId = null;
        Object response = api.editVanityLink(vanitySlug, targetUrl, comment, vanityLinkId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get All Coupons
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllCouponsTest() throws ApiException {
        Object response = api.getAllCoupons()
                .execute();
        // TODO: test validations
    }

    /**
     * Get All Vanity Links
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllVanityLinksTest() throws ApiException {
        Object response = api.getAllVanityLinks()
                .execute();
        // TODO: test validations
    }

    /**
     * Get Vanity Link
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVanityLinkTest() throws ApiException {
        String slug = null;
        Object response = api.getVanityLink(slug)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete Vanity Link
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeVanityLinkTest() throws ApiException {
        String vanityLinkId = null;
        Object response = api.removeVanityLink(vanityLinkId)
                .execute();
        // TODO: test validations
    }

}
