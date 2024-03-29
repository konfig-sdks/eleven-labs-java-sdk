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
import com.konfigthis.client.model.SubscriptionResponseModel;
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
 * UserResponseModel
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UserResponseModel {
  public static final String SERIALIZED_NAME_SUBSCRIPTION = "subscription";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION)
  private SubscriptionResponseModel subscription;

  public static final String SERIALIZED_NAME_IS_NEW_USER = "is_new_user";
  @SerializedName(SERIALIZED_NAME_IS_NEW_USER)
  private Boolean isNewUser;

  public static final String SERIALIZED_NAME_XI_API_KEY = "xi_api_key";
  @SerializedName(SERIALIZED_NAME_XI_API_KEY)
  private String xiApiKey;

  public static final String SERIALIZED_NAME_CAN_USE_DELAYED_PAYMENT_METHODS = "can_use_delayed_payment_methods";
  @SerializedName(SERIALIZED_NAME_CAN_USE_DELAYED_PAYMENT_METHODS)
  private Boolean canUseDelayedPaymentMethods;

  public static final String SERIALIZED_NAME_IS_ONBOARDING_COMPLETED = "is_onboarding_completed";
  @SerializedName(SERIALIZED_NAME_IS_ONBOARDING_COMPLETED)
  private Boolean isOnboardingCompleted;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public UserResponseModel() {
  }

  public UserResponseModel subscription(SubscriptionResponseModel subscription) {
    
    
    
    
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SubscriptionResponseModel getSubscription() {
    return subscription;
  }


  public void setSubscription(SubscriptionResponseModel subscription) {
    
    
    
    this.subscription = subscription;
  }


  public UserResponseModel isNewUser(Boolean isNewUser) {
    
    
    
    
    this.isNewUser = isNewUser;
    return this;
  }

   /**
   * Get isNewUser
   * @return isNewUser
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsNewUser() {
    return isNewUser;
  }


  public void setIsNewUser(Boolean isNewUser) {
    
    
    
    this.isNewUser = isNewUser;
  }


  public UserResponseModel xiApiKey(String xiApiKey) {
    
    
    
    
    this.xiApiKey = xiApiKey;
    return this;
  }

   /**
   * Get xiApiKey
   * @return xiApiKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getXiApiKey() {
    return xiApiKey;
  }


  public void setXiApiKey(String xiApiKey) {
    
    
    
    this.xiApiKey = xiApiKey;
  }


  public UserResponseModel canUseDelayedPaymentMethods(Boolean canUseDelayedPaymentMethods) {
    
    
    
    
    this.canUseDelayedPaymentMethods = canUseDelayedPaymentMethods;
    return this;
  }

   /**
   * Get canUseDelayedPaymentMethods
   * @return canUseDelayedPaymentMethods
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCanUseDelayedPaymentMethods() {
    return canUseDelayedPaymentMethods;
  }


  public void setCanUseDelayedPaymentMethods(Boolean canUseDelayedPaymentMethods) {
    
    
    
    this.canUseDelayedPaymentMethods = canUseDelayedPaymentMethods;
  }


  public UserResponseModel isOnboardingCompleted(Boolean isOnboardingCompleted) {
    
    
    
    
    this.isOnboardingCompleted = isOnboardingCompleted;
    return this;
  }

   /**
   * Get isOnboardingCompleted
   * @return isOnboardingCompleted
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsOnboardingCompleted() {
    return isOnboardingCompleted;
  }


  public void setIsOnboardingCompleted(Boolean isOnboardingCompleted) {
    
    
    
    this.isOnboardingCompleted = isOnboardingCompleted;
  }


  public UserResponseModel firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
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
   * @return the UserResponseModel instance itself
   */
  public UserResponseModel putAdditionalProperty(String key, Object value) {
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
    UserResponseModel userResponseModel = (UserResponseModel) o;
    return Objects.equals(this.subscription, userResponseModel.subscription) &&
        Objects.equals(this.isNewUser, userResponseModel.isNewUser) &&
        Objects.equals(this.xiApiKey, userResponseModel.xiApiKey) &&
        Objects.equals(this.canUseDelayedPaymentMethods, userResponseModel.canUseDelayedPaymentMethods) &&
        Objects.equals(this.isOnboardingCompleted, userResponseModel.isOnboardingCompleted) &&
        Objects.equals(this.firstName, userResponseModel.firstName)&&
        Objects.equals(this.additionalProperties, userResponseModel.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscription, isNewUser, xiApiKey, canUseDelayedPaymentMethods, isOnboardingCompleted, firstName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResponseModel {\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    isNewUser: ").append(toIndentedString(isNewUser)).append("\n");
    sb.append("    xiApiKey: ").append(toIndentedString(xiApiKey)).append("\n");
    sb.append("    canUseDelayedPaymentMethods: ").append(toIndentedString(canUseDelayedPaymentMethods)).append("\n");
    sb.append("    isOnboardingCompleted: ").append(toIndentedString(isOnboardingCompleted)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
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
    openapiFields.add("subscription");
    openapiFields.add("is_new_user");
    openapiFields.add("xi_api_key");
    openapiFields.add("can_use_delayed_payment_methods");
    openapiFields.add("is_onboarding_completed");
    openapiFields.add("first_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("subscription");
    openapiRequiredFields.add("is_new_user");
    openapiRequiredFields.add("xi_api_key");
    openapiRequiredFields.add("can_use_delayed_payment_methods");
    openapiRequiredFields.add("is_onboarding_completed");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserResponseModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserResponseModel is not found in the empty JSON string", UserResponseModel.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserResponseModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `subscription`
      SubscriptionResponseModel.validateJsonObject(jsonObj.getAsJsonObject("subscription"));
      if (!jsonObj.get("xi_api_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `xi_api_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("xi_api_key").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<UserResponseModel>() {
           @Override
           public void write(JsonWriter out, UserResponseModel value) throws IOException {
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
           public UserResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UserResponseModel instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UserResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserResponseModel
  * @throws IOException if the JSON string is invalid with respect to UserResponseModel
  */
  public static UserResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserResponseModel.class);
  }

 /**
  * Convert an instance of UserResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

