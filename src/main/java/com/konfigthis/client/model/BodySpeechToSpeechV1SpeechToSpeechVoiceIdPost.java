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
import java.io.File;
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
 * BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost {
  public static final String SERIALIZED_NAME_AUDIO = "audio";
  @SerializedName(SERIALIZED_NAME_AUDIO)
  private File audio;

  public static final String SERIALIZED_NAME_MODEL_ID = "model_id";
  @SerializedName(SERIALIZED_NAME_MODEL_ID)
  private String modelId = "eleven_english_sts_v2";

  public static final String SERIALIZED_NAME_VOICE_SETTINGS = "voice_settings";
  @SerializedName(SERIALIZED_NAME_VOICE_SETTINGS)
  private String voiceSettings;

  public BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost() {
  }

  public BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost audio(File audio) {
    
    
    
    
    this.audio = audio;
    return this;
  }

   /**
   * The audio file which holds the content and emotion that will control the generated speech.
   * @return audio
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The audio file which holds the content and emotion that will control the generated speech.")

  public File getAudio() {
    return audio;
  }


  public void setAudio(File audio) {
    
    
    
    this.audio = audio;
  }


  public BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost modelId(String modelId) {
    
    
    
    
    this.modelId = modelId;
    return this;
  }

   /**
   * Identifier of the model that will be used, you can query them using GET /v1/models. The model needs to have support for speech to speech, you can check this using the can_do_voice_conversion property.
   * @return modelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "eleven_english_sts_v2", value = "Identifier of the model that will be used, you can query them using GET /v1/models. The model needs to have support for speech to speech, you can check this using the can_do_voice_conversion property.")

  public String getModelId() {
    return modelId;
  }


  public void setModelId(String modelId) {
    
    
    
    this.modelId = modelId;
  }


  public BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost voiceSettings(String voiceSettings) {
    
    
    
    
    this.voiceSettings = voiceSettings;
    return this;
  }

   /**
   * Voice settings overriding stored setttings for the given voice. They are applied only on the given request. Needs to be send as a JSON encoded string.
   * @return voiceSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Voice settings overriding stored setttings for the given voice. They are applied only on the given request. Needs to be send as a JSON encoded string.")

  public String getVoiceSettings() {
    return voiceSettings;
  }


  public void setVoiceSettings(String voiceSettings) {
    
    
    
    this.voiceSettings = voiceSettings;
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
   * @return the BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost instance itself
   */
  public BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost putAdditionalProperty(String key, Object value) {
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
    BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost bodySpeechToSpeechV1SpeechToSpeechVoiceIdPost = (BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost) o;
    return Objects.equals(this.audio, bodySpeechToSpeechV1SpeechToSpeechVoiceIdPost.audio) &&
        Objects.equals(this.modelId, bodySpeechToSpeechV1SpeechToSpeechVoiceIdPost.modelId) &&
        Objects.equals(this.voiceSettings, bodySpeechToSpeechV1SpeechToSpeechVoiceIdPost.voiceSettings)&&
        Objects.equals(this.additionalProperties, bodySpeechToSpeechV1SpeechToSpeechVoiceIdPost.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audio, modelId, voiceSettings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost {\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    voiceSettings: ").append(toIndentedString(voiceSettings)).append("\n");
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
    openapiFields.add("audio");
    openapiFields.add("model_id");
    openapiFields.add("voice_settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("audio");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost is not found in the empty JSON string", BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("model_id") != null && !jsonObj.get("model_id").isJsonNull()) && !jsonObj.get("model_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model_id").toString()));
      }
      if ((jsonObj.get("voice_settings") != null && !jsonObj.get("voice_settings").isJsonNull()) && !jsonObj.get("voice_settings").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voice_settings` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voice_settings").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost.class));

       return (TypeAdapter<T>) new TypeAdapter<BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost>() {
           @Override
           public void write(JsonWriter out, BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost value) throws IOException {
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
           public BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost
  * @throws IOException if the JSON string is invalid with respect to BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost
  */
  public static BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost.class);
  }

 /**
  * Convert an instance of BodySpeechToSpeechV1SpeechToSpeechVoiceIdPost to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
