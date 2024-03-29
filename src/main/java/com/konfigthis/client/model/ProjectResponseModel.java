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
 * ProjectResponseModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProjectResponseModel {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATE_DATE_UNIX = "create_date_unix";
  @SerializedName(SERIALIZED_NAME_CREATE_DATE_UNIX)
  private Integer createDateUnix;

  public static final String SERIALIZED_NAME_DEFAULT_TITLE_VOICE_ID = "default_title_voice_id";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TITLE_VOICE_ID)
  private String defaultTitleVoiceId;

  public static final String SERIALIZED_NAME_DEFAULT_PARAGRAPH_VOICE_ID = "default_paragraph_voice_id";
  @SerializedName(SERIALIZED_NAME_DEFAULT_PARAGRAPH_VOICE_ID)
  private String defaultParagraphVoiceId;

  public static final String SERIALIZED_NAME_DEFAULT_MODEL_ID = "default_model_id";
  @SerializedName(SERIALIZED_NAME_DEFAULT_MODEL_ID)
  private String defaultModelId;

  public static final String SERIALIZED_NAME_LAST_CONVERSION_DATE_UNIX = "last_conversion_date_unix";
  @SerializedName(SERIALIZED_NAME_LAST_CONVERSION_DATE_UNIX)
  private Integer lastConversionDateUnix;

  public static final String SERIALIZED_NAME_CAN_BE_DOWNLOADED = "can_be_downloaded";
  @SerializedName(SERIALIZED_NAME_CAN_BE_DOWNLOADED)
  private Boolean canBeDownloaded;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private String author;

  public static final String SERIALIZED_NAME_ISBN_NUMBER = "isbn_number";
  @SerializedName(SERIALIZED_NAME_ISBN_NUMBER)
  private String isbnNumber;

  public static final String SERIALIZED_NAME_VOLUME_NORMALIZATION = "volume_normalization";
  @SerializedName(SERIALIZED_NAME_VOLUME_NORMALIZATION)
  private Boolean volumeNormalization;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
 public enum StateEnum {
    DEFAULT("default"),
    
    CONVERTING("converting");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public ProjectResponseModel() {
  }

  public ProjectResponseModel title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public ProjectResponseModel projectId(String projectId) {
    
    
    
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    
    
    
    this.projectId = projectId;
  }


  public ProjectResponseModel name(String name) {
    
    
    
    
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


  public ProjectResponseModel createDateUnix(Integer createDateUnix) {
    
    
    
    
    this.createDateUnix = createDateUnix;
    return this;
  }

   /**
   * Get createDateUnix
   * @return createDateUnix
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCreateDateUnix() {
    return createDateUnix;
  }


  public void setCreateDateUnix(Integer createDateUnix) {
    
    
    
    this.createDateUnix = createDateUnix;
  }


  public ProjectResponseModel defaultTitleVoiceId(String defaultTitleVoiceId) {
    
    
    
    
    this.defaultTitleVoiceId = defaultTitleVoiceId;
    return this;
  }

   /**
   * Get defaultTitleVoiceId
   * @return defaultTitleVoiceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDefaultTitleVoiceId() {
    return defaultTitleVoiceId;
  }


  public void setDefaultTitleVoiceId(String defaultTitleVoiceId) {
    
    
    
    this.defaultTitleVoiceId = defaultTitleVoiceId;
  }


  public ProjectResponseModel defaultParagraphVoiceId(String defaultParagraphVoiceId) {
    
    
    
    
    this.defaultParagraphVoiceId = defaultParagraphVoiceId;
    return this;
  }

   /**
   * Get defaultParagraphVoiceId
   * @return defaultParagraphVoiceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDefaultParagraphVoiceId() {
    return defaultParagraphVoiceId;
  }


  public void setDefaultParagraphVoiceId(String defaultParagraphVoiceId) {
    
    
    
    this.defaultParagraphVoiceId = defaultParagraphVoiceId;
  }


  public ProjectResponseModel defaultModelId(String defaultModelId) {
    
    
    
    
    this.defaultModelId = defaultModelId;
    return this;
  }

   /**
   * Get defaultModelId
   * @return defaultModelId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDefaultModelId() {
    return defaultModelId;
  }


  public void setDefaultModelId(String defaultModelId) {
    
    
    
    this.defaultModelId = defaultModelId;
  }


  public ProjectResponseModel lastConversionDateUnix(Integer lastConversionDateUnix) {
    
    
    
    
    this.lastConversionDateUnix = lastConversionDateUnix;
    return this;
  }

   /**
   * Get lastConversionDateUnix
   * @return lastConversionDateUnix
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getLastConversionDateUnix() {
    return lastConversionDateUnix;
  }


  public void setLastConversionDateUnix(Integer lastConversionDateUnix) {
    
    
    
    this.lastConversionDateUnix = lastConversionDateUnix;
  }


  public ProjectResponseModel canBeDownloaded(Boolean canBeDownloaded) {
    
    
    
    
    this.canBeDownloaded = canBeDownloaded;
    return this;
  }

   /**
   * Get canBeDownloaded
   * @return canBeDownloaded
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCanBeDownloaded() {
    return canBeDownloaded;
  }


  public void setCanBeDownloaded(Boolean canBeDownloaded) {
    
    
    
    this.canBeDownloaded = canBeDownloaded;
  }


  public ProjectResponseModel author(String author) {
    
    
    
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAuthor() {
    return author;
  }


  public void setAuthor(String author) {
    
    
    
    this.author = author;
  }


  public ProjectResponseModel isbnNumber(String isbnNumber) {
    
    
    
    
    this.isbnNumber = isbnNumber;
    return this;
  }

   /**
   * Get isbnNumber
   * @return isbnNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getIsbnNumber() {
    return isbnNumber;
  }


  public void setIsbnNumber(String isbnNumber) {
    
    
    
    this.isbnNumber = isbnNumber;
  }


  public ProjectResponseModel volumeNormalization(Boolean volumeNormalization) {
    
    
    
    
    this.volumeNormalization = volumeNormalization;
    return this;
  }

   /**
   * Get volumeNormalization
   * @return volumeNormalization
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getVolumeNormalization() {
    return volumeNormalization;
  }


  public void setVolumeNormalization(Boolean volumeNormalization) {
    
    
    
    this.volumeNormalization = volumeNormalization;
  }


  public ProjectResponseModel state(StateEnum state) {
    
    
    
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    
    
    
    this.state = state;
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
   * @return the ProjectResponseModel instance itself
   */
  public ProjectResponseModel putAdditionalProperty(String key, Object value) {
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
    ProjectResponseModel projectResponseModel = (ProjectResponseModel) o;
    return Objects.equals(this.title, projectResponseModel.title) &&
        Objects.equals(this.projectId, projectResponseModel.projectId) &&
        Objects.equals(this.name, projectResponseModel.name) &&
        Objects.equals(this.createDateUnix, projectResponseModel.createDateUnix) &&
        Objects.equals(this.defaultTitleVoiceId, projectResponseModel.defaultTitleVoiceId) &&
        Objects.equals(this.defaultParagraphVoiceId, projectResponseModel.defaultParagraphVoiceId) &&
        Objects.equals(this.defaultModelId, projectResponseModel.defaultModelId) &&
        Objects.equals(this.lastConversionDateUnix, projectResponseModel.lastConversionDateUnix) &&
        Objects.equals(this.canBeDownloaded, projectResponseModel.canBeDownloaded) &&
        Objects.equals(this.author, projectResponseModel.author) &&
        Objects.equals(this.isbnNumber, projectResponseModel.isbnNumber) &&
        Objects.equals(this.volumeNormalization, projectResponseModel.volumeNormalization) &&
        Objects.equals(this.state, projectResponseModel.state)&&
        Objects.equals(this.additionalProperties, projectResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, projectId, name, createDateUnix, defaultTitleVoiceId, defaultParagraphVoiceId, defaultModelId, lastConversionDateUnix, canBeDownloaded, author, isbnNumber, volumeNormalization, state, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectResponseModel {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createDateUnix: ").append(toIndentedString(createDateUnix)).append("\n");
    sb.append("    defaultTitleVoiceId: ").append(toIndentedString(defaultTitleVoiceId)).append("\n");
    sb.append("    defaultParagraphVoiceId: ").append(toIndentedString(defaultParagraphVoiceId)).append("\n");
    sb.append("    defaultModelId: ").append(toIndentedString(defaultModelId)).append("\n");
    sb.append("    lastConversionDateUnix: ").append(toIndentedString(lastConversionDateUnix)).append("\n");
    sb.append("    canBeDownloaded: ").append(toIndentedString(canBeDownloaded)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    isbnNumber: ").append(toIndentedString(isbnNumber)).append("\n");
    sb.append("    volumeNormalization: ").append(toIndentedString(volumeNormalization)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("project_id");
    openapiFields.add("name");
    openapiFields.add("create_date_unix");
    openapiFields.add("default_title_voice_id");
    openapiFields.add("default_paragraph_voice_id");
    openapiFields.add("default_model_id");
    openapiFields.add("last_conversion_date_unix");
    openapiFields.add("can_be_downloaded");
    openapiFields.add("author");
    openapiFields.add("isbn_number");
    openapiFields.add("volume_normalization");
    openapiFields.add("state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("project_id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("create_date_unix");
    openapiRequiredFields.add("default_title_voice_id");
    openapiRequiredFields.add("default_paragraph_voice_id");
    openapiRequiredFields.add("default_model_id");
    openapiRequiredFields.add("last_conversion_date_unix");
    openapiRequiredFields.add("can_be_downloaded");
    openapiRequiredFields.add("author");
    openapiRequiredFields.add("isbn_number");
    openapiRequiredFields.add("volume_normalization");
    openapiRequiredFields.add("state");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectResponseModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectResponseModel is not found in the empty JSON string", ProjectResponseModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectResponseModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("project_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("default_title_voice_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_title_voice_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_title_voice_id").toString()));
      }
      if (!jsonObj.get("default_paragraph_voice_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_paragraph_voice_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_paragraph_voice_id").toString()));
      }
      if (!jsonObj.get("default_model_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `default_model_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("default_model_id").toString()));
      }
      if (!jsonObj.get("author").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `author` to be a primitive type in the JSON string but got `%s`", jsonObj.get("author").toString()));
      }
      if (!jsonObj.get("isbn_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isbn_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isbn_number").toString()));
      }
      if (!jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectResponseModel>() {
           @Override
           public void write(JsonWriter out, ProjectResponseModel value) throws IOException {
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
           public ProjectResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectResponseModel
  * @throws IOException if the JSON string is invalid with respect to ProjectResponseModel
  */
  public static ProjectResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectResponseModel.class);
  }

 /**
  * Convert an instance of ProjectResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

