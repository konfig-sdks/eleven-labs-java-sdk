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
import com.konfigthis.client.model.SpeechHistoryItemResponseModel;
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
 * GetSpeechHistoryResponseModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetSpeechHistoryResponseModel {
  public static final String SERIALIZED_NAME_HISTORY = "history";
  @SerializedName(SERIALIZED_NAME_HISTORY)
  private List<SpeechHistoryItemResponseModel> history = new ArrayList<>();

  public static final String SERIALIZED_NAME_LAST_HISTORY_ITEM_ID = "last_history_item_id";
  @SerializedName(SERIALIZED_NAME_LAST_HISTORY_ITEM_ID)
  private String lastHistoryItemId;

  public static final String SERIALIZED_NAME_HAS_MORE = "has_more";
  @SerializedName(SERIALIZED_NAME_HAS_MORE)
  private Boolean hasMore;

  public GetSpeechHistoryResponseModel() {
  }

  public GetSpeechHistoryResponseModel history(List<SpeechHistoryItemResponseModel> history) {
    
    
    
    
    this.history = history;
    return this;
  }

  public GetSpeechHistoryResponseModel addHistoryItem(SpeechHistoryItemResponseModel historyItem) {
    this.history.add(historyItem);
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<SpeechHistoryItemResponseModel> getHistory() {
    return history;
  }


  public void setHistory(List<SpeechHistoryItemResponseModel> history) {
    
    
    
    this.history = history;
  }


  public GetSpeechHistoryResponseModel lastHistoryItemId(String lastHistoryItemId) {
    
    
    
    
    this.lastHistoryItemId = lastHistoryItemId;
    return this;
  }

   /**
   * Get lastHistoryItemId
   * @return lastHistoryItemId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLastHistoryItemId() {
    return lastHistoryItemId;
  }


  public void setLastHistoryItemId(String lastHistoryItemId) {
    
    
    
    this.lastHistoryItemId = lastHistoryItemId;
  }


  public GetSpeechHistoryResponseModel hasMore(Boolean hasMore) {
    
    
    
    
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getHasMore() {
    return hasMore;
  }


  public void setHasMore(Boolean hasMore) {
    
    
    
    this.hasMore = hasMore;
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
   * @return the GetSpeechHistoryResponseModel instance itself
   */
  public GetSpeechHistoryResponseModel putAdditionalProperty(String key, Object value) {
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
    GetSpeechHistoryResponseModel getSpeechHistoryResponseModel = (GetSpeechHistoryResponseModel) o;
    return Objects.equals(this.history, getSpeechHistoryResponseModel.history) &&
        Objects.equals(this.lastHistoryItemId, getSpeechHistoryResponseModel.lastHistoryItemId) &&
        Objects.equals(this.hasMore, getSpeechHistoryResponseModel.hasMore)&&
        Objects.equals(this.additionalProperties, getSpeechHistoryResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(history, lastHistoryItemId, hasMore, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSpeechHistoryResponseModel {\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    lastHistoryItemId: ").append(toIndentedString(lastHistoryItemId)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
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
    openapiFields.add("history");
    openapiFields.add("last_history_item_id");
    openapiFields.add("has_more");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("history");
    openapiRequiredFields.add("last_history_item_id");
    openapiRequiredFields.add("has_more");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetSpeechHistoryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetSpeechHistoryResponseModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetSpeechHistoryResponseModel is not found in the empty JSON string", GetSpeechHistoryResponseModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GetSpeechHistoryResponseModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("history").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `history` to be an array in the JSON string but got `%s`", jsonObj.get("history").toString()));
      }

      JsonArray jsonArrayhistory = jsonObj.getAsJsonArray("history");
      // validate the required field `history` (array)
      for (int i = 0; i < jsonArrayhistory.size(); i++) {
        SpeechHistoryItemResponseModel.validateJsonObject(jsonArrayhistory.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("last_history_item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_history_item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_history_item_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetSpeechHistoryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetSpeechHistoryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetSpeechHistoryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetSpeechHistoryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<GetSpeechHistoryResponseModel>() {
           @Override
           public void write(JsonWriter out, GetSpeechHistoryResponseModel value) throws IOException {
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
           public GetSpeechHistoryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetSpeechHistoryResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetSpeechHistoryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetSpeechHistoryResponseModel
  * @throws IOException if the JSON string is invalid with respect to GetSpeechHistoryResponseModel
  */
  public static GetSpeechHistoryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetSpeechHistoryResponseModel.class);
  }

 /**
  * Convert an instance of GetSpeechHistoryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

