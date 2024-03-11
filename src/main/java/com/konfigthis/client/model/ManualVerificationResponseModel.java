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
import com.konfigthis.client.model.ManualVerificationFileResponseModel;
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
 * ManualVerificationResponseModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ManualVerificationResponseModel {
  public static final String SERIALIZED_NAME_EXTRA_TEXT = "extra_text";
  @SerializedName(SERIALIZED_NAME_EXTRA_TEXT)
  private String extraText;

  public static final String SERIALIZED_NAME_REQUEST_TIME_UNIX = "request_time_unix";
  @SerializedName(SERIALIZED_NAME_REQUEST_TIME_UNIX)
  private Integer requestTimeUnix;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<ManualVerificationFileResponseModel> files = new ArrayList<>();

  public ManualVerificationResponseModel() {
  }

  public ManualVerificationResponseModel extraText(String extraText) {
    
    
    
    
    this.extraText = extraText;
    return this;
  }

   /**
   * Get extraText
   * @return extraText
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getExtraText() {
    return extraText;
  }


  public void setExtraText(String extraText) {
    
    
    
    this.extraText = extraText;
  }


  public ManualVerificationResponseModel requestTimeUnix(Integer requestTimeUnix) {
    
    
    
    
    this.requestTimeUnix = requestTimeUnix;
    return this;
  }

   /**
   * Get requestTimeUnix
   * @return requestTimeUnix
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getRequestTimeUnix() {
    return requestTimeUnix;
  }


  public void setRequestTimeUnix(Integer requestTimeUnix) {
    
    
    
    this.requestTimeUnix = requestTimeUnix;
  }


  public ManualVerificationResponseModel files(List<ManualVerificationFileResponseModel> files) {
    
    
    
    
    this.files = files;
    return this;
  }

  public ManualVerificationResponseModel addFilesItem(ManualVerificationFileResponseModel filesItem) {
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ManualVerificationFileResponseModel> getFiles() {
    return files;
  }


  public void setFiles(List<ManualVerificationFileResponseModel> files) {
    
    
    
    this.files = files;
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
   * @return the ManualVerificationResponseModel instance itself
   */
  public ManualVerificationResponseModel putAdditionalProperty(String key, Object value) {
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
    ManualVerificationResponseModel manualVerificationResponseModel = (ManualVerificationResponseModel) o;
    return Objects.equals(this.extraText, manualVerificationResponseModel.extraText) &&
        Objects.equals(this.requestTimeUnix, manualVerificationResponseModel.requestTimeUnix) &&
        Objects.equals(this.files, manualVerificationResponseModel.files)&&
        Objects.equals(this.additionalProperties, manualVerificationResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extraText, requestTimeUnix, files, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualVerificationResponseModel {\n");
    sb.append("    extraText: ").append(toIndentedString(extraText)).append("\n");
    sb.append("    requestTimeUnix: ").append(toIndentedString(requestTimeUnix)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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
    openapiFields.add("extra_text");
    openapiFields.add("request_time_unix");
    openapiFields.add("files");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("extra_text");
    openapiRequiredFields.add("request_time_unix");
    openapiRequiredFields.add("files");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ManualVerificationResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ManualVerificationResponseModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ManualVerificationResponseModel is not found in the empty JSON string", ManualVerificationResponseModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ManualVerificationResponseModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("extra_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extra_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extra_text").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("files").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `files` to be an array in the JSON string but got `%s`", jsonObj.get("files").toString()));
      }

      JsonArray jsonArrayfiles = jsonObj.getAsJsonArray("files");
      // validate the required field `files` (array)
      for (int i = 0; i < jsonArrayfiles.size(); i++) {
        ManualVerificationFileResponseModel.validateJsonObject(jsonArrayfiles.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManualVerificationResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManualVerificationResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManualVerificationResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManualVerificationResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ManualVerificationResponseModel>() {
           @Override
           public void write(JsonWriter out, ManualVerificationResponseModel value) throws IOException {
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
           public ManualVerificationResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ManualVerificationResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ManualVerificationResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManualVerificationResponseModel
  * @throws IOException if the JSON string is invalid with respect to ManualVerificationResponseModel
  */
  public static ManualVerificationResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManualVerificationResponseModel.class);
  }

 /**
  * Convert an instance of ManualVerificationResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

