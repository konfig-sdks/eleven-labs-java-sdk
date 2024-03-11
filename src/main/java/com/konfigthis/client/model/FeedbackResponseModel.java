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
 * FeedbackResponseModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FeedbackResponseModel {
  public static final String SERIALIZED_NAME_THUMBS_UP = "thumbs_up";
  @SerializedName(SERIALIZED_NAME_THUMBS_UP)
  private Boolean thumbsUp;

  public static final String SERIALIZED_NAME_FEEDBACK = "feedback";
  @SerializedName(SERIALIZED_NAME_FEEDBACK)
  private String feedback;

  public static final String SERIALIZED_NAME_EMOTIONS = "emotions";
  @SerializedName(SERIALIZED_NAME_EMOTIONS)
  private Boolean emotions;

  public static final String SERIALIZED_NAME_INACCURATE_CLONE = "inaccurate_clone";
  @SerializedName(SERIALIZED_NAME_INACCURATE_CLONE)
  private Boolean inaccurateClone;

  public static final String SERIALIZED_NAME_GLITCHES = "glitches";
  @SerializedName(SERIALIZED_NAME_GLITCHES)
  private Boolean glitches;

  public static final String SERIALIZED_NAME_AUDIO_QUALITY = "audio_quality";
  @SerializedName(SERIALIZED_NAME_AUDIO_QUALITY)
  private Boolean audioQuality;

  public static final String SERIALIZED_NAME_OTHER = "other";
  @SerializedName(SERIALIZED_NAME_OTHER)
  private Boolean other;

  public static final String SERIALIZED_NAME_REVIEW_STATUS = "review_status";
  @SerializedName(SERIALIZED_NAME_REVIEW_STATUS)
  private String reviewStatus = "not_reviewed";

  public FeedbackResponseModel() {
  }

  public FeedbackResponseModel thumbsUp(Boolean thumbsUp) {
    
    
    
    
    this.thumbsUp = thumbsUp;
    return this;
  }

   /**
   * Get thumbsUp
   * @return thumbsUp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getThumbsUp() {
    return thumbsUp;
  }


  public void setThumbsUp(Boolean thumbsUp) {
    
    
    
    this.thumbsUp = thumbsUp;
  }


  public FeedbackResponseModel feedback(String feedback) {
    
    
    
    
    this.feedback = feedback;
    return this;
  }

   /**
   * Get feedback
   * @return feedback
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFeedback() {
    return feedback;
  }


  public void setFeedback(String feedback) {
    
    
    
    this.feedback = feedback;
  }


  public FeedbackResponseModel emotions(Boolean emotions) {
    
    
    
    
    this.emotions = emotions;
    return this;
  }

   /**
   * Get emotions
   * @return emotions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getEmotions() {
    return emotions;
  }


  public void setEmotions(Boolean emotions) {
    
    
    
    this.emotions = emotions;
  }


  public FeedbackResponseModel inaccurateClone(Boolean inaccurateClone) {
    
    
    
    
    this.inaccurateClone = inaccurateClone;
    return this;
  }

   /**
   * Get inaccurateClone
   * @return inaccurateClone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getInaccurateClone() {
    return inaccurateClone;
  }


  public void setInaccurateClone(Boolean inaccurateClone) {
    
    
    
    this.inaccurateClone = inaccurateClone;
  }


  public FeedbackResponseModel glitches(Boolean glitches) {
    
    
    
    
    this.glitches = glitches;
    return this;
  }

   /**
   * Get glitches
   * @return glitches
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getGlitches() {
    return glitches;
  }


  public void setGlitches(Boolean glitches) {
    
    
    
    this.glitches = glitches;
  }


  public FeedbackResponseModel audioQuality(Boolean audioQuality) {
    
    
    
    
    this.audioQuality = audioQuality;
    return this;
  }

   /**
   * Get audioQuality
   * @return audioQuality
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getAudioQuality() {
    return audioQuality;
  }


  public void setAudioQuality(Boolean audioQuality) {
    
    
    
    this.audioQuality = audioQuality;
  }


  public FeedbackResponseModel other(Boolean other) {
    
    
    
    
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getOther() {
    return other;
  }


  public void setOther(Boolean other) {
    
    
    
    this.other = other;
  }


  public FeedbackResponseModel reviewStatus(String reviewStatus) {
    
    
    
    
    this.reviewStatus = reviewStatus;
    return this;
  }

   /**
   * Get reviewStatus
   * @return reviewStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "not_reviewed", value = "")

  public String getReviewStatus() {
    return reviewStatus;
  }


  public void setReviewStatus(String reviewStatus) {
    
    
    
    this.reviewStatus = reviewStatus;
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
   * @return the FeedbackResponseModel instance itself
   */
  public FeedbackResponseModel putAdditionalProperty(String key, Object value) {
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
    FeedbackResponseModel feedbackResponseModel = (FeedbackResponseModel) o;
    return Objects.equals(this.thumbsUp, feedbackResponseModel.thumbsUp) &&
        Objects.equals(this.feedback, feedbackResponseModel.feedback) &&
        Objects.equals(this.emotions, feedbackResponseModel.emotions) &&
        Objects.equals(this.inaccurateClone, feedbackResponseModel.inaccurateClone) &&
        Objects.equals(this.glitches, feedbackResponseModel.glitches) &&
        Objects.equals(this.audioQuality, feedbackResponseModel.audioQuality) &&
        Objects.equals(this.other, feedbackResponseModel.other) &&
        Objects.equals(this.reviewStatus, feedbackResponseModel.reviewStatus)&&
        Objects.equals(this.additionalProperties, feedbackResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thumbsUp, feedback, emotions, inaccurateClone, glitches, audioQuality, other, reviewStatus, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackResponseModel {\n");
    sb.append("    thumbsUp: ").append(toIndentedString(thumbsUp)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    emotions: ").append(toIndentedString(emotions)).append("\n");
    sb.append("    inaccurateClone: ").append(toIndentedString(inaccurateClone)).append("\n");
    sb.append("    glitches: ").append(toIndentedString(glitches)).append("\n");
    sb.append("    audioQuality: ").append(toIndentedString(audioQuality)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
    sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
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
    openapiFields.add("thumbs_up");
    openapiFields.add("feedback");
    openapiFields.add("emotions");
    openapiFields.add("inaccurate_clone");
    openapiFields.add("glitches");
    openapiFields.add("audio_quality");
    openapiFields.add("other");
    openapiFields.add("review_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("thumbs_up");
    openapiRequiredFields.add("feedback");
    openapiRequiredFields.add("emotions");
    openapiRequiredFields.add("inaccurate_clone");
    openapiRequiredFields.add("glitches");
    openapiRequiredFields.add("audio_quality");
    openapiRequiredFields.add("other");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FeedbackResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FeedbackResponseModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeedbackResponseModel is not found in the empty JSON string", FeedbackResponseModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FeedbackResponseModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("feedback").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feedback` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feedback").toString()));
      }
      if ((jsonObj.get("review_status") != null && !jsonObj.get("review_status").isJsonNull()) && !jsonObj.get("review_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `review_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("review_status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeedbackResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeedbackResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeedbackResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeedbackResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<FeedbackResponseModel>() {
           @Override
           public void write(JsonWriter out, FeedbackResponseModel value) throws IOException {
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
           public FeedbackResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FeedbackResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FeedbackResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FeedbackResponseModel
  * @throws IOException if the JSON string is invalid with respect to FeedbackResponseModel
  */
  public static FeedbackResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeedbackResponseModel.class);
  }

 /**
  * Convert an instance of FeedbackResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

