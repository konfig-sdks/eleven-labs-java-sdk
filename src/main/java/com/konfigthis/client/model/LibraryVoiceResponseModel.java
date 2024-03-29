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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * LibraryVoiceResponseModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LibraryVoiceResponseModel {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PUBLIC_OWNER_ID = "public_owner_id";
  @SerializedName(SERIALIZED_NAME_PUBLIC_OWNER_ID)
  private String publicOwnerId;

  public static final String SERIALIZED_NAME_VOICE_ID = "voice_id";
  @SerializedName(SERIALIZED_NAME_VOICE_ID)
  private String voiceId;

  public static final String SERIALIZED_NAME_DATE_UNIX = "date_unix";
  @SerializedName(SERIALIZED_NAME_DATE_UNIX)
  private Integer dateUnix;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ACCENT = "accent";
  @SerializedName(SERIALIZED_NAME_ACCENT)
  private String accent;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_AGE = "age";
  @SerializedName(SERIALIZED_NAME_AGE)
  private String age;

  public static final String SERIALIZED_NAME_DESCRIPTIVE = "descriptive";
  @SerializedName(SERIALIZED_NAME_DESCRIPTIVE)
  private String descriptive;

  public static final String SERIALIZED_NAME_USE_CASE = "use_case";
  @SerializedName(SERIALIZED_NAME_USE_CASE)
  private String useCase;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_PREVIEW_URL = "preview_url";
  @SerializedName(SERIALIZED_NAME_PREVIEW_URL)
  private String previewUrl;

  public static final String SERIALIZED_NAME_USAGE_CHARACTER_COUNT1Y = "usage_character_count_1y";
  @SerializedName(SERIALIZED_NAME_USAGE_CHARACTER_COUNT1Y)
  private Integer usageCharacterCount1y;

  public static final String SERIALIZED_NAME_USAGE_CHARACTER_COUNT7D = "usage_character_count_7d";
  @SerializedName(SERIALIZED_NAME_USAGE_CHARACTER_COUNT7D)
  private Integer usageCharacterCount7d;

  public static final String SERIALIZED_NAME_CLONED_BY_COUNT = "cloned_by_count";
  @SerializedName(SERIALIZED_NAME_CLONED_BY_COUNT)
  private Integer clonedByCount;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private Double rate;

  public static final String SERIALIZED_NAME_FREE_USERS_ALLOWED = "free_users_allowed";
  @SerializedName(SERIALIZED_NAME_FREE_USERS_ALLOWED)
  private Boolean freeUsersAllowed;

  public static final String SERIALIZED_NAME_LIVE_MODERATION_ENABLED = "live_moderation_enabled";
  @SerializedName(SERIALIZED_NAME_LIVE_MODERATION_ENABLED)
  private Boolean liveModerationEnabled;

  public static final String SERIALIZED_NAME_NOTICE_PERIOD = "notice_period";
  @SerializedName(SERIALIZED_NAME_NOTICE_PERIOD)
  private Integer noticePeriod;

  public static final String SERIALIZED_NAME_INSTAGRAM_USERNAME = "instagram_username";
  @SerializedName(SERIALIZED_NAME_INSTAGRAM_USERNAME)
  private String instagramUsername;

  public static final String SERIALIZED_NAME_TWITTER_USERNAME = "twitter_username";
  @SerializedName(SERIALIZED_NAME_TWITTER_USERNAME)
  private String twitterUsername;

  public static final String SERIALIZED_NAME_YOUTUBE_USERNAME = "youtube_username";
  @SerializedName(SERIALIZED_NAME_YOUTUBE_USERNAME)
  private String youtubeUsername;

  public static final String SERIALIZED_NAME_TIKTOK_USERNAME = "tiktok_username";
  @SerializedName(SERIALIZED_NAME_TIKTOK_USERNAME)
  private String tiktokUsername;

  public static final String SERIALIZED_NAME_FEATURED = "featured";
  @SerializedName(SERIALIZED_NAME_FEATURED)
  private Boolean featured;

  public LibraryVoiceResponseModel() {
  }

  public LibraryVoiceResponseModel description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public LibraryVoiceResponseModel publicOwnerId(String publicOwnerId) {
    
    
    
    
    this.publicOwnerId = publicOwnerId;
    return this;
  }

   /**
   * Get publicOwnerId
   * @return publicOwnerId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPublicOwnerId() {
    return publicOwnerId;
  }


  public void setPublicOwnerId(String publicOwnerId) {
    
    
    
    this.publicOwnerId = publicOwnerId;
  }


  public LibraryVoiceResponseModel voiceId(String voiceId) {
    
    
    
    
    this.voiceId = voiceId;
    return this;
  }

   /**
   * Get voiceId
   * @return voiceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getVoiceId() {
    return voiceId;
  }


  public void setVoiceId(String voiceId) {
    
    
    
    this.voiceId = voiceId;
  }


  public LibraryVoiceResponseModel dateUnix(Integer dateUnix) {
    
    
    
    
    this.dateUnix = dateUnix;
    return this;
  }

   /**
   * Get dateUnix
   * @return dateUnix
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getDateUnix() {
    return dateUnix;
  }


  public void setDateUnix(Integer dateUnix) {
    
    
    
    this.dateUnix = dateUnix;
  }


  public LibraryVoiceResponseModel name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public LibraryVoiceResponseModel accent(String accent) {
    
    
    
    
    this.accent = accent;
    return this;
  }

   /**
   * Get accent
   * @return accent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAccent() {
    return accent;
  }


  public void setAccent(String accent) {
    
    
    
    this.accent = accent;
  }


  public LibraryVoiceResponseModel gender(String gender) {
    
    
    
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    
    
    
    this.gender = gender;
  }


  public LibraryVoiceResponseModel age(String age) {
    
    
    
    
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAge() {
    return age;
  }


  public void setAge(String age) {
    
    
    
    this.age = age;
  }


  public LibraryVoiceResponseModel descriptive(String descriptive) {
    
    
    
    
    this.descriptive = descriptive;
    return this;
  }

   /**
   * Get descriptive
   * @return descriptive
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescriptive() {
    return descriptive;
  }


  public void setDescriptive(String descriptive) {
    
    
    
    this.descriptive = descriptive;
  }


  public LibraryVoiceResponseModel useCase(String useCase) {
    
    
    
    
    this.useCase = useCase;
    return this;
  }

   /**
   * Get useCase
   * @return useCase
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUseCase() {
    return useCase;
  }


  public void setUseCase(String useCase) {
    
    
    
    this.useCase = useCase;
  }


  public LibraryVoiceResponseModel category(String category) {
    
    
    
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    
    
    
    this.category = category;
  }


  public LibraryVoiceResponseModel language(String language) {
    
    
    
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    
    
    
    this.language = language;
  }


  public LibraryVoiceResponseModel previewUrl(String previewUrl) {
    
    
    
    
    this.previewUrl = previewUrl;
    return this;
  }

   /**
   * Get previewUrl
   * @return previewUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPreviewUrl() {
    return previewUrl;
  }


  public void setPreviewUrl(String previewUrl) {
    
    
    
    this.previewUrl = previewUrl;
  }


  public LibraryVoiceResponseModel usageCharacterCount1y(Integer usageCharacterCount1y) {
    
    
    
    
    this.usageCharacterCount1y = usageCharacterCount1y;
    return this;
  }

   /**
   * Get usageCharacterCount1y
   * @return usageCharacterCount1y
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getUsageCharacterCount1y() {
    return usageCharacterCount1y;
  }


  public void setUsageCharacterCount1y(Integer usageCharacterCount1y) {
    
    
    
    this.usageCharacterCount1y = usageCharacterCount1y;
  }


  public LibraryVoiceResponseModel usageCharacterCount7d(Integer usageCharacterCount7d) {
    
    
    
    
    this.usageCharacterCount7d = usageCharacterCount7d;
    return this;
  }

   /**
   * Get usageCharacterCount7d
   * @return usageCharacterCount7d
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getUsageCharacterCount7d() {
    return usageCharacterCount7d;
  }


  public void setUsageCharacterCount7d(Integer usageCharacterCount7d) {
    
    
    
    this.usageCharacterCount7d = usageCharacterCount7d;
  }


  public LibraryVoiceResponseModel clonedByCount(Integer clonedByCount) {
    
    
    
    
    this.clonedByCount = clonedByCount;
    return this;
  }

   /**
   * Get clonedByCount
   * @return clonedByCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getClonedByCount() {
    return clonedByCount;
  }


  public void setClonedByCount(Integer clonedByCount) {
    
    
    
    this.clonedByCount = clonedByCount;
  }


  public LibraryVoiceResponseModel rate(Double rate) {
    
    
    
    
    this.rate = rate;
    return this;
  }

  public LibraryVoiceResponseModel rate(Integer rate) {
    
    
    
    
    this.rate = rate.doubleValue();
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getRate() {
    return rate;
  }


  public void setRate(Double rate) {
    
    
    
    this.rate = rate;
  }


  public LibraryVoiceResponseModel freeUsersAllowed(Boolean freeUsersAllowed) {
    
    
    
    
    this.freeUsersAllowed = freeUsersAllowed;
    return this;
  }

   /**
   * Get freeUsersAllowed
   * @return freeUsersAllowed
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getFreeUsersAllowed() {
    return freeUsersAllowed;
  }


  public void setFreeUsersAllowed(Boolean freeUsersAllowed) {
    
    
    
    this.freeUsersAllowed = freeUsersAllowed;
  }


  public LibraryVoiceResponseModel liveModerationEnabled(Boolean liveModerationEnabled) {
    
    
    
    
    this.liveModerationEnabled = liveModerationEnabled;
    return this;
  }

   /**
   * Get liveModerationEnabled
   * @return liveModerationEnabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getLiveModerationEnabled() {
    return liveModerationEnabled;
  }


  public void setLiveModerationEnabled(Boolean liveModerationEnabled) {
    
    
    
    this.liveModerationEnabled = liveModerationEnabled;
  }


  public LibraryVoiceResponseModel noticePeriod(Integer noticePeriod) {
    
    
    
    
    this.noticePeriod = noticePeriod;
    return this;
  }

   /**
   * Get noticePeriod
   * @return noticePeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getNoticePeriod() {
    return noticePeriod;
  }


  public void setNoticePeriod(Integer noticePeriod) {
    
    
    
    this.noticePeriod = noticePeriod;
  }


  public LibraryVoiceResponseModel instagramUsername(String instagramUsername) {
    
    
    
    
    this.instagramUsername = instagramUsername;
    return this;
  }

   /**
   * Get instagramUsername
   * @return instagramUsername
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getInstagramUsername() {
    return instagramUsername;
  }


  public void setInstagramUsername(String instagramUsername) {
    
    
    
    this.instagramUsername = instagramUsername;
  }


  public LibraryVoiceResponseModel twitterUsername(String twitterUsername) {
    
    
    
    
    this.twitterUsername = twitterUsername;
    return this;
  }

   /**
   * Get twitterUsername
   * @return twitterUsername
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTwitterUsername() {
    return twitterUsername;
  }


  public void setTwitterUsername(String twitterUsername) {
    
    
    
    this.twitterUsername = twitterUsername;
  }


  public LibraryVoiceResponseModel youtubeUsername(String youtubeUsername) {
    
    
    
    
    this.youtubeUsername = youtubeUsername;
    return this;
  }

   /**
   * Get youtubeUsername
   * @return youtubeUsername
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getYoutubeUsername() {
    return youtubeUsername;
  }


  public void setYoutubeUsername(String youtubeUsername) {
    
    
    
    this.youtubeUsername = youtubeUsername;
  }


  public LibraryVoiceResponseModel tiktokUsername(String tiktokUsername) {
    
    
    
    
    this.tiktokUsername = tiktokUsername;
    return this;
  }

   /**
   * Get tiktokUsername
   * @return tiktokUsername
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTiktokUsername() {
    return tiktokUsername;
  }


  public void setTiktokUsername(String tiktokUsername) {
    
    
    
    this.tiktokUsername = tiktokUsername;
  }


  public LibraryVoiceResponseModel featured(Boolean featured) {
    
    
    
    
    this.featured = featured;
    return this;
  }

   /**
   * Get featured
   * @return featured
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getFeatured() {
    return featured;
  }


  public void setFeatured(Boolean featured) {
    
    
    
    this.featured = featured;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the LibraryVoiceResponseModel instance itself
   */
  public LibraryVoiceResponseModel putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryVoiceResponseModel libraryVoiceResponseModel = (LibraryVoiceResponseModel) o;
    return Objects.equals(this.description, libraryVoiceResponseModel.description) &&
        Objects.equals(this.publicOwnerId, libraryVoiceResponseModel.publicOwnerId) &&
        Objects.equals(this.voiceId, libraryVoiceResponseModel.voiceId) &&
        Objects.equals(this.dateUnix, libraryVoiceResponseModel.dateUnix) &&
        Objects.equals(this.name, libraryVoiceResponseModel.name) &&
        Objects.equals(this.accent, libraryVoiceResponseModel.accent) &&
        Objects.equals(this.gender, libraryVoiceResponseModel.gender) &&
        Objects.equals(this.age, libraryVoiceResponseModel.age) &&
        Objects.equals(this.descriptive, libraryVoiceResponseModel.descriptive) &&
        Objects.equals(this.useCase, libraryVoiceResponseModel.useCase) &&
        Objects.equals(this.category, libraryVoiceResponseModel.category) &&
        Objects.equals(this.language, libraryVoiceResponseModel.language) &&
        Objects.equals(this.previewUrl, libraryVoiceResponseModel.previewUrl) &&
        Objects.equals(this.usageCharacterCount1y, libraryVoiceResponseModel.usageCharacterCount1y) &&
        Objects.equals(this.usageCharacterCount7d, libraryVoiceResponseModel.usageCharacterCount7d) &&
        Objects.equals(this.clonedByCount, libraryVoiceResponseModel.clonedByCount) &&
        Objects.equals(this.rate, libraryVoiceResponseModel.rate) &&
        Objects.equals(this.freeUsersAllowed, libraryVoiceResponseModel.freeUsersAllowed) &&
        Objects.equals(this.liveModerationEnabled, libraryVoiceResponseModel.liveModerationEnabled) &&
        Objects.equals(this.noticePeriod, libraryVoiceResponseModel.noticePeriod) &&
        Objects.equals(this.instagramUsername, libraryVoiceResponseModel.instagramUsername) &&
        Objects.equals(this.twitterUsername, libraryVoiceResponseModel.twitterUsername) &&
        Objects.equals(this.youtubeUsername, libraryVoiceResponseModel.youtubeUsername) &&
        Objects.equals(this.tiktokUsername, libraryVoiceResponseModel.tiktokUsername) &&
        Objects.equals(this.featured, libraryVoiceResponseModel.featured)&&
        Objects.equals(this.additionalProperties, libraryVoiceResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, publicOwnerId, voiceId, dateUnix, name, accent, gender, age, descriptive, useCase, category, language, previewUrl, usageCharacterCount1y, usageCharacterCount7d, clonedByCount, rate, freeUsersAllowed, liveModerationEnabled, noticePeriod, instagramUsername, twitterUsername, youtubeUsername, tiktokUsername, featured, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryVoiceResponseModel {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    publicOwnerId: ").append(toIndentedString(publicOwnerId)).append("\n");
    sb.append("    voiceId: ").append(toIndentedString(voiceId)).append("\n");
    sb.append("    dateUnix: ").append(toIndentedString(dateUnix)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accent: ").append(toIndentedString(accent)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    descriptive: ").append(toIndentedString(descriptive)).append("\n");
    sb.append("    useCase: ").append(toIndentedString(useCase)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
    sb.append("    usageCharacterCount1y: ").append(toIndentedString(usageCharacterCount1y)).append("\n");
    sb.append("    usageCharacterCount7d: ").append(toIndentedString(usageCharacterCount7d)).append("\n");
    sb.append("    clonedByCount: ").append(toIndentedString(clonedByCount)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    freeUsersAllowed: ").append(toIndentedString(freeUsersAllowed)).append("\n");
    sb.append("    liveModerationEnabled: ").append(toIndentedString(liveModerationEnabled)).append("\n");
    sb.append("    noticePeriod: ").append(toIndentedString(noticePeriod)).append("\n");
    sb.append("    instagramUsername: ").append(toIndentedString(instagramUsername)).append("\n");
    sb.append("    twitterUsername: ").append(toIndentedString(twitterUsername)).append("\n");
    sb.append("    youtubeUsername: ").append(toIndentedString(youtubeUsername)).append("\n");
    sb.append("    tiktokUsername: ").append(toIndentedString(tiktokUsername)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("description");
    openapiFields.add("public_owner_id");
    openapiFields.add("voice_id");
    openapiFields.add("date_unix");
    openapiFields.add("name");
    openapiFields.add("accent");
    openapiFields.add("gender");
    openapiFields.add("age");
    openapiFields.add("descriptive");
    openapiFields.add("use_case");
    openapiFields.add("category");
    openapiFields.add("language");
    openapiFields.add("preview_url");
    openapiFields.add("usage_character_count_1y");
    openapiFields.add("usage_character_count_7d");
    openapiFields.add("cloned_by_count");
    openapiFields.add("rate");
    openapiFields.add("free_users_allowed");
    openapiFields.add("live_moderation_enabled");
    openapiFields.add("notice_period");
    openapiFields.add("instagram_username");
    openapiFields.add("twitter_username");
    openapiFields.add("youtube_username");
    openapiFields.add("tiktok_username");
    openapiFields.add("featured");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("public_owner_id");
    openapiRequiredFields.add("voice_id");
    openapiRequiredFields.add("date_unix");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("accent");
    openapiRequiredFields.add("gender");
    openapiRequiredFields.add("age");
    openapiRequiredFields.add("descriptive");
    openapiRequiredFields.add("use_case");
    openapiRequiredFields.add("category");
    openapiRequiredFields.add("language");
    openapiRequiredFields.add("preview_url");
    openapiRequiredFields.add("usage_character_count_1y");
    openapiRequiredFields.add("usage_character_count_7d");
    openapiRequiredFields.add("cloned_by_count");
    openapiRequiredFields.add("rate");
    openapiRequiredFields.add("free_users_allowed");
    openapiRequiredFields.add("live_moderation_enabled");
    openapiRequiredFields.add("notice_period");
    openapiRequiredFields.add("instagram_username");
    openapiRequiredFields.add("twitter_username");
    openapiRequiredFields.add("youtube_username");
    openapiRequiredFields.add("tiktok_username");
    openapiRequiredFields.add("featured");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LibraryVoiceResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LibraryVoiceResponseModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LibraryVoiceResponseModel is not found in the empty JSON string", LibraryVoiceResponseModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LibraryVoiceResponseModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("public_owner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `public_owner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("public_owner_id").toString()));
      }
      if (!jsonObj.get("voice_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voice_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voice_id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("accent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accent").toString()));
      }
      if (!jsonObj.get("gender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gender").toString()));
      }
      if (!jsonObj.get("age").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `age` to be a primitive type in the JSON string but got `%s`", jsonObj.get("age").toString()));
      }
      if (!jsonObj.get("descriptive").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `descriptive` to be a primitive type in the JSON string but got `%s`", jsonObj.get("descriptive").toString()));
      }
      if (!jsonObj.get("use_case").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `use_case` to be a primitive type in the JSON string but got `%s`", jsonObj.get("use_case").toString()));
      }
      if (!jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (!jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (!jsonObj.get("preview_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preview_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preview_url").toString()));
      }
      if (!jsonObj.get("instagram_username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instagram_username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instagram_username").toString()));
      }
      if (!jsonObj.get("twitter_username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `twitter_username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("twitter_username").toString()));
      }
      if (!jsonObj.get("youtube_username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `youtube_username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("youtube_username").toString()));
      }
      if (!jsonObj.get("tiktok_username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tiktok_username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tiktok_username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LibraryVoiceResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LibraryVoiceResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LibraryVoiceResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LibraryVoiceResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<LibraryVoiceResponseModel>() {
           @Override
           public void write(JsonWriter out, LibraryVoiceResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public LibraryVoiceResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LibraryVoiceResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LibraryVoiceResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LibraryVoiceResponseModel
  * @throws IOException if the JSON string is invalid with respect to LibraryVoiceResponseModel
  */
  public static LibraryVoiceResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LibraryVoiceResponseModel.class);
  }

 /**
  * Convert an instance of LibraryVoiceResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

