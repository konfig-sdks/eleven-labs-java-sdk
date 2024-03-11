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
import com.konfigthis.client.model.RecordingResponseModel;
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
 * VerificationAttemptResponseModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VerificationAttemptResponseModel {
  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_DATE_UNIX = "date_unix";
  @SerializedName(SERIALIZED_NAME_DATE_UNIX)
  private Integer dateUnix;

  public static final String SERIALIZED_NAME_ACCEPTED = "accepted";
  @SerializedName(SERIALIZED_NAME_ACCEPTED)
  private Boolean accepted;

  public static final String SERIALIZED_NAME_SIMILARITY = "similarity";
  @SerializedName(SERIALIZED_NAME_SIMILARITY)
  private Double similarity;

  public static final String SERIALIZED_NAME_LEVENSHTEIN_DISTANCE = "levenshtein_distance";
  @SerializedName(SERIALIZED_NAME_LEVENSHTEIN_DISTANCE)
  private Double levenshteinDistance;

  public static final String SERIALIZED_NAME_RECORDING = "recording";
  @SerializedName(SERIALIZED_NAME_RECORDING)
  private RecordingResponseModel recording;

  public VerificationAttemptResponseModel() {
  }

  public VerificationAttemptResponseModel text(String text) {
    
    
    
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    
    
    
    this.text = text;
  }


  public VerificationAttemptResponseModel dateUnix(Integer dateUnix) {
    
    
    
    
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


  public VerificationAttemptResponseModel accepted(Boolean accepted) {
    
    
    
    
    this.accepted = accepted;
    return this;
  }

   /**
   * Get accepted
   * @return accepted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getAccepted() {
    return accepted;
  }


  public void setAccepted(Boolean accepted) {
    
    
    
    this.accepted = accepted;
  }


  public VerificationAttemptResponseModel similarity(Double similarity) {
    
    
    
    
    this.similarity = similarity;
    return this;
  }

  public VerificationAttemptResponseModel similarity(Integer similarity) {
    
    
    
    
    this.similarity = similarity.doubleValue();
    return this;
  }

   /**
   * Get similarity
   * @return similarity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getSimilarity() {
    return similarity;
  }


  public void setSimilarity(Double similarity) {
    
    
    
    this.similarity = similarity;
  }


  public VerificationAttemptResponseModel levenshteinDistance(Double levenshteinDistance) {
    
    
    
    
    this.levenshteinDistance = levenshteinDistance;
    return this;
  }

  public VerificationAttemptResponseModel levenshteinDistance(Integer levenshteinDistance) {
    
    
    
    
    this.levenshteinDistance = levenshteinDistance.doubleValue();
    return this;
  }

   /**
   * Get levenshteinDistance
   * @return levenshteinDistance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Double getLevenshteinDistance() {
    return levenshteinDistance;
  }


  public void setLevenshteinDistance(Double levenshteinDistance) {
    
    
    
    this.levenshteinDistance = levenshteinDistance;
  }


  public VerificationAttemptResponseModel recording(RecordingResponseModel recording) {
    
    
    
    
    this.recording = recording;
    return this;
  }

   /**
   * Get recording
   * @return recording
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecordingResponseModel getRecording() {
    return recording;
  }


  public void setRecording(RecordingResponseModel recording) {
    
    
    
    this.recording = recording;
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
   * @return the VerificationAttemptResponseModel instance itself
   */
  public VerificationAttemptResponseModel putAdditionalProperty(String key, Object value) {
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
    VerificationAttemptResponseModel verificationAttemptResponseModel = (VerificationAttemptResponseModel) o;
    return Objects.equals(this.text, verificationAttemptResponseModel.text) &&
        Objects.equals(this.dateUnix, verificationAttemptResponseModel.dateUnix) &&
        Objects.equals(this.accepted, verificationAttemptResponseModel.accepted) &&
        Objects.equals(this.similarity, verificationAttemptResponseModel.similarity) &&
        Objects.equals(this.levenshteinDistance, verificationAttemptResponseModel.levenshteinDistance) &&
        Objects.equals(this.recording, verificationAttemptResponseModel.recording)&&
        Objects.equals(this.additionalProperties, verificationAttemptResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, dateUnix, accepted, similarity, levenshteinDistance, recording, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationAttemptResponseModel {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    dateUnix: ").append(toIndentedString(dateUnix)).append("\n");
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
    sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
    sb.append("    levenshteinDistance: ").append(toIndentedString(levenshteinDistance)).append("\n");
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
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
    openapiFields.add("text");
    openapiFields.add("date_unix");
    openapiFields.add("accepted");
    openapiFields.add("similarity");
    openapiFields.add("levenshtein_distance");
    openapiFields.add("recording");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("text");
    openapiRequiredFields.add("date_unix");
    openapiRequiredFields.add("accepted");
    openapiRequiredFields.add("similarity");
    openapiRequiredFields.add("levenshtein_distance");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VerificationAttemptResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VerificationAttemptResponseModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerificationAttemptResponseModel is not found in the empty JSON string", VerificationAttemptResponseModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VerificationAttemptResponseModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      // validate the optional field `recording`
      if (jsonObj.get("recording") != null && !jsonObj.get("recording").isJsonNull()) {
        RecordingResponseModel.validateJsonObject(jsonObj.getAsJsonObject("recording"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerificationAttemptResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerificationAttemptResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerificationAttemptResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerificationAttemptResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<VerificationAttemptResponseModel>() {
           @Override
           public void write(JsonWriter out, VerificationAttemptResponseModel value) throws IOException {
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
           public VerificationAttemptResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VerificationAttemptResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VerificationAttemptResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VerificationAttemptResponseModel
  * @throws IOException if the JSON string is invalid with respect to VerificationAttemptResponseModel
  */
  public static VerificationAttemptResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerificationAttemptResponseModel.class);
  }

 /**
  * Convert an instance of VerificationAttemptResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

