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
import com.konfigthis.client.model.VerificationAttemptResponseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * VoiceVerificationResponseModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VoiceVerificationResponseModel {
  public static final String SERIALIZED_NAME_REQUIRES_VERIFICATION = "requires_verification";
  @SerializedName(SERIALIZED_NAME_REQUIRES_VERIFICATION)
  private Boolean requiresVerification;

  public static final String SERIALIZED_NAME_IS_VERIFIED = "is_verified";
  @SerializedName(SERIALIZED_NAME_IS_VERIFIED)
  private Boolean isVerified;

  public static final String SERIALIZED_NAME_VERIFICATION_FAILURES = "verification_failures";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_FAILURES)
  private List<String> verificationFailures = new ArrayList<>();

  public static final String SERIALIZED_NAME_VERIFICATION_ATTEMPTS_COUNT = "verification_attempts_count";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ATTEMPTS_COUNT)
  private Integer verificationAttemptsCount;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_VERIFICATION_ATTEMPTS = "verification_attempts";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ATTEMPTS)
  private List<VerificationAttemptResponseModel> verificationAttempts = null;

  public VoiceVerificationResponseModel() {
  }

  public VoiceVerificationResponseModel requiresVerification(Boolean requiresVerification) {
    
    
    
    
    this.requiresVerification = requiresVerification;
    return this;
  }

   /**
   * Get requiresVerification
   * @return requiresVerification
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getRequiresVerification() {
    return requiresVerification;
  }


  public void setRequiresVerification(Boolean requiresVerification) {
    
    
    
    this.requiresVerification = requiresVerification;
  }


  public VoiceVerificationResponseModel isVerified(Boolean isVerified) {
    
    
    
    
    this.isVerified = isVerified;
    return this;
  }

   /**
   * Get isVerified
   * @return isVerified
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsVerified() {
    return isVerified;
  }


  public void setIsVerified(Boolean isVerified) {
    
    
    
    this.isVerified = isVerified;
  }


  public VoiceVerificationResponseModel verificationFailures(List<String> verificationFailures) {
    
    
    
    
    this.verificationFailures = verificationFailures;
    return this;
  }

  public VoiceVerificationResponseModel addVerificationFailuresItem(String verificationFailuresItem) {
    this.verificationFailures.add(verificationFailuresItem);
    return this;
  }

   /**
   * Get verificationFailures
   * @return verificationFailures
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getVerificationFailures() {
    return verificationFailures;
  }


  public void setVerificationFailures(List<String> verificationFailures) {
    
    
    
    this.verificationFailures = verificationFailures;
  }


  public VoiceVerificationResponseModel verificationAttemptsCount(Integer verificationAttemptsCount) {
    
    
    
    
    this.verificationAttemptsCount = verificationAttemptsCount;
    return this;
  }

   /**
   * Get verificationAttemptsCount
   * @return verificationAttemptsCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getVerificationAttemptsCount() {
    return verificationAttemptsCount;
  }


  public void setVerificationAttemptsCount(Integer verificationAttemptsCount) {
    
    
    
    this.verificationAttemptsCount = verificationAttemptsCount;
  }


  public VoiceVerificationResponseModel language(String language) {
    
    
    
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    
    
    
    this.language = language;
  }


  public VoiceVerificationResponseModel verificationAttempts(List<VerificationAttemptResponseModel> verificationAttempts) {
    
    
    
    
    this.verificationAttempts = verificationAttempts;
    return this;
  }

  public VoiceVerificationResponseModel addVerificationAttemptsItem(VerificationAttemptResponseModel verificationAttemptsItem) {
    if (this.verificationAttempts == null) {
      this.verificationAttempts = new ArrayList<>();
    }
    this.verificationAttempts.add(verificationAttemptsItem);
    return this;
  }

   /**
   * Get verificationAttempts
   * @return verificationAttempts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VerificationAttemptResponseModel> getVerificationAttempts() {
    return verificationAttempts;
  }


  public void setVerificationAttempts(List<VerificationAttemptResponseModel> verificationAttempts) {
    
    
    
    this.verificationAttempts = verificationAttempts;
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
   * @return the VoiceVerificationResponseModel instance itself
   */
  public VoiceVerificationResponseModel putAdditionalProperty(String key, Object value) {
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
    VoiceVerificationResponseModel voiceVerificationResponseModel = (VoiceVerificationResponseModel) o;
    return Objects.equals(this.requiresVerification, voiceVerificationResponseModel.requiresVerification) &&
        Objects.equals(this.isVerified, voiceVerificationResponseModel.isVerified) &&
        Objects.equals(this.verificationFailures, voiceVerificationResponseModel.verificationFailures) &&
        Objects.equals(this.verificationAttemptsCount, voiceVerificationResponseModel.verificationAttemptsCount) &&
        Objects.equals(this.language, voiceVerificationResponseModel.language) &&
        Objects.equals(this.verificationAttempts, voiceVerificationResponseModel.verificationAttempts)&&
        Objects.equals(this.additionalProperties, voiceVerificationResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requiresVerification, isVerified, verificationFailures, verificationAttemptsCount, language, verificationAttempts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoiceVerificationResponseModel {\n");
    sb.append("    requiresVerification: ").append(toIndentedString(requiresVerification)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
    sb.append("    verificationFailures: ").append(toIndentedString(verificationFailures)).append("\n");
    sb.append("    verificationAttemptsCount: ").append(toIndentedString(verificationAttemptsCount)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    verificationAttempts: ").append(toIndentedString(verificationAttempts)).append("\n");
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
    openapiFields.add("requires_verification");
    openapiFields.add("is_verified");
    openapiFields.add("verification_failures");
    openapiFields.add("verification_attempts_count");
    openapiFields.add("language");
    openapiFields.add("verification_attempts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("requires_verification");
    openapiRequiredFields.add("is_verified");
    openapiRequiredFields.add("verification_failures");
    openapiRequiredFields.add("verification_attempts_count");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoiceVerificationResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VoiceVerificationResponseModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoiceVerificationResponseModel is not found in the empty JSON string", VoiceVerificationResponseModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VoiceVerificationResponseModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("verification_failures") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("verification_failures").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `verification_failures` to be an array in the JSON string but got `%s`", jsonObj.get("verification_failures").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (jsonObj.get("verification_attempts") != null && !jsonObj.get("verification_attempts").isJsonNull()) {
        JsonArray jsonArrayverificationAttempts = jsonObj.getAsJsonArray("verification_attempts");
        if (jsonArrayverificationAttempts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("verification_attempts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `verification_attempts` to be an array in the JSON string but got `%s`", jsonObj.get("verification_attempts").toString()));
          }

          // validate the optional field `verification_attempts` (array)
          for (int i = 0; i < jsonArrayverificationAttempts.size(); i++) {
            VerificationAttemptResponseModel.validateJsonObject(jsonArrayverificationAttempts.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoiceVerificationResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoiceVerificationResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoiceVerificationResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoiceVerificationResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<VoiceVerificationResponseModel>() {
           @Override
           public void write(JsonWriter out, VoiceVerificationResponseModel value) throws IOException {
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
           public VoiceVerificationResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VoiceVerificationResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VoiceVerificationResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoiceVerificationResponseModel
  * @throws IOException if the JSON string is invalid with respect to VoiceVerificationResponseModel
  */
  public static VoiceVerificationResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoiceVerificationResponseModel.class);
  }

 /**
  * Convert an instance of VoiceVerificationResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

