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
 * BodyDubAVideoOrAnAudioFileV1DubbingPost
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BodyDubAVideoOrAnAudioFileV1DubbingPost {
  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_FILE = "file";
  @SerializedName(SERIALIZED_NAME_FILE)
  private File _file;

  public static final String SERIALIZED_NAME_CSV_FILE = "csv_file";
  @SerializedName(SERIALIZED_NAME_CSV_FILE)
  private File csvFile;

  public static final String SERIALIZED_NAME_FOREGROUND_AUDIO_FILE = "foreground_audio_file";
  @SerializedName(SERIALIZED_NAME_FOREGROUND_AUDIO_FILE)
  private File foregroundAudioFile;

  public static final String SERIALIZED_NAME_BACKGROUND_AUDIO_FILE = "background_audio_file";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_AUDIO_FILE)
  private File backgroundAudioFile;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SOURCE_URL = "source_url";
  @SerializedName(SERIALIZED_NAME_SOURCE_URL)
  private String sourceUrl;

  public static final String SERIALIZED_NAME_SOURCE_LANG = "source_lang";
  @SerializedName(SERIALIZED_NAME_SOURCE_LANG)
  private String sourceLang = "auto";

  public static final String SERIALIZED_NAME_TARGET_LANG = "target_lang";
  @SerializedName(SERIALIZED_NAME_TARGET_LANG)
  private String targetLang;

  public static final String SERIALIZED_NAME_NUM_SPEAKERS = "num_speakers";
  @SerializedName(SERIALIZED_NAME_NUM_SPEAKERS)
  private Integer numSpeakers = 0;

  public static final String SERIALIZED_NAME_WATERMARK = "watermark";
  @SerializedName(SERIALIZED_NAME_WATERMARK)
  private Boolean watermark = false;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Integer startTime;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Integer endTime;

  public static final String SERIALIZED_NAME_HIGHEST_RESOLUTION = "highest_resolution";
  @SerializedName(SERIALIZED_NAME_HIGHEST_RESOLUTION)
  private Boolean highestResolution = false;

  public static final String SERIALIZED_NAME_DUBBING_STUDIO = "dubbing_studio";
  @SerializedName(SERIALIZED_NAME_DUBBING_STUDIO)
  private Boolean dubbingStudio = false;

  public BodyDubAVideoOrAnAudioFileV1DubbingPost() {
  }

  public BodyDubAVideoOrAnAudioFileV1DubbingPost mode(String mode) {
    
    
    
    
    this.mode = mode;
    return this;
  }

   /**
   * automatic or manual.
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "automatic or manual.")

  public String getMode() {
    return mode;
  }


  public void setMode(String mode) {
    
    
    
    this.mode = mode;
  }


  public BodyDubAVideoOrAnAudioFileV1DubbingPost _file(File _file) {
    
    
    
    
    this._file = _file;
    return this;
  }

   /**
   * One or more audio files to clone the voice from
   * @return _file
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One or more audio files to clone the voice from")

  public File getFile() {
    return _file;
  }


  public void setFile(File _file) {
    
    
    
    this._file = _file;
  }


  public BodyDubAVideoOrAnAudioFileV1DubbingPost csvFile(File csvFile) {
    
    
    
    
    this.csvFile = csvFile;
    return this;
  }

   /**
   * CSV file containing transcription/translation metadata
   * @return csvFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSV file containing transcription/translation metadata")

  public File getCsvFile() {
    return csvFile;
  }


  public void setCsvFile(File csvFile) {
    
    
    
    this.csvFile = csvFile;
  }


  public BodyDubAVideoOrAnAudioFileV1DubbingPost foregroundAudioFile(File foregroundAudioFile) {
    
    
    
    
    this.foregroundAudioFile = foregroundAudioFile;
    return this;
  }

   /**
   * For use only with csv input
   * @return foregroundAudioFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For use only with csv input")

  public File getForegroundAudioFile() {
    return foregroundAudioFile;
  }


  public void setForegroundAudioFile(File foregroundAudioFile) {
    
    
    
    this.foregroundAudioFile = foregroundAudioFile;
  }


  public BodyDubAVideoOrAnAudioFileV1DubbingPost backgroundAudioFile(File backgroundAudioFile) {
    
    
    
    
    this.backgroundAudioFile = backgroundAudioFile;
    return this;
  }

   /**
   * For use only with csv input
   * @return backgroundAudioFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For use only with csv input")

  public File getBackgroundAudioFile() {
    return backgroundAudioFile;
  }


  public void setBackgroundAudioFile(File backgroundAudioFile) {
    
    
    
    this.backgroundAudioFile = backgroundAudioFile;
  }


  public BodyDubAVideoOrAnAudioFileV1DubbingPost name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Name of the dubbing project.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the dubbing project.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public BodyDubAVideoOrAnAudioFileV1DubbingPost sourceUrl(String sourceUrl) {
    
    
    
    
    this.sourceUrl = sourceUrl;
    return this;
  }

   /**
   * URL of the source video/audio file.
   * @return sourceUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the source video/audio file.")

  public String getSourceUrl() {
    return sourceUrl;
  }


  public void setSourceUrl(String sourceUrl) {
    
    
    
    this.sourceUrl = sourceUrl;
  }


  public BodyDubAVideoOrAnAudioFileV1DubbingPost sourceLang(String sourceLang) {
    
    
    
    
    this.sourceLang = sourceLang;
    return this;
  }

   /**
   * Source language.
   * @return sourceLang
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "auto", value = "Source language.")

  public String getSourceLang() {
    return sourceLang;
  }


  public void setSourceLang(String sourceLang) {
    
    
    
    this.sourceLang = sourceLang;
  }


  public BodyDubAVideoOrAnAudioFileV1DubbingPost targetLang(String targetLang) {
    
    
    
    
    this.targetLang = targetLang;
    return this;
  }

   /**
   * Target language.
   * @return targetLang
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Target language.")

  public String getTargetLang() {
    return targetLang;
  }


  public void setTargetLang(String targetLang) {
    
    
    
    this.targetLang = targetLang;
  }


  public BodyDubAVideoOrAnAudioFileV1DubbingPost numSpeakers(Integer numSpeakers) {
    
    
    
    
    this.numSpeakers = numSpeakers;
    return this;
  }

   /**
   * Number of speakers to use for the dubbing.
   * @return numSpeakers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Number of speakers to use for the dubbing.")

  public Integer getNumSpeakers() {
    return numSpeakers;
  }


  public void setNumSpeakers(Integer numSpeakers) {
    
    
    
    this.numSpeakers = numSpeakers;
  }


  public BodyDubAVideoOrAnAudioFileV1DubbingPost watermark(Boolean watermark) {
    
    
    
    
    this.watermark = watermark;
    return this;
  }

   /**
   * Whether to apply watermark to the output video.
   * @return watermark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether to apply watermark to the output video.")

  public Boolean getWatermark() {
    return watermark;
  }


  public void setWatermark(Boolean watermark) {
    
    
    
    this.watermark = watermark;
  }


  public BodyDubAVideoOrAnAudioFileV1DubbingPost startTime(Integer startTime) {
    
    
    
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Start time of the source video/audio file.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start time of the source video/audio file.")

  public Integer getStartTime() {
    return startTime;
  }


  public void setStartTime(Integer startTime) {
    
    
    
    this.startTime = startTime;
  }


  public BodyDubAVideoOrAnAudioFileV1DubbingPost endTime(Integer endTime) {
    
    
    
    
    this.endTime = endTime;
    return this;
  }

   /**
   * End time of the source video/audio file.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End time of the source video/audio file.")

  public Integer getEndTime() {
    return endTime;
  }


  public void setEndTime(Integer endTime) {
    
    
    
    this.endTime = endTime;
  }


  public BodyDubAVideoOrAnAudioFileV1DubbingPost highestResolution(Boolean highestResolution) {
    
    
    
    
    this.highestResolution = highestResolution;
    return this;
  }

   /**
   * Whether to use the highest resolution available.
   * @return highestResolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether to use the highest resolution available.")

  public Boolean getHighestResolution() {
    return highestResolution;
  }


  public void setHighestResolution(Boolean highestResolution) {
    
    
    
    this.highestResolution = highestResolution;
  }


  public BodyDubAVideoOrAnAudioFileV1DubbingPost dubbingStudio(Boolean dubbingStudio) {
    
    
    
    
    this.dubbingStudio = dubbingStudio;
    return this;
  }

   /**
   * Whether to prepare dub for edits in dubbing studio.
   * @return dubbingStudio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether to prepare dub for edits in dubbing studio.")

  public Boolean getDubbingStudio() {
    return dubbingStudio;
  }


  public void setDubbingStudio(Boolean dubbingStudio) {
    
    
    
    this.dubbingStudio = dubbingStudio;
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
   * @return the BodyDubAVideoOrAnAudioFileV1DubbingPost instance itself
   */
  public BodyDubAVideoOrAnAudioFileV1DubbingPost putAdditionalProperty(String key, Object value) {
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
    BodyDubAVideoOrAnAudioFileV1DubbingPost bodyDubAVideoOrAnAudioFileV1DubbingPost = (BodyDubAVideoOrAnAudioFileV1DubbingPost) o;
    return Objects.equals(this.mode, bodyDubAVideoOrAnAudioFileV1DubbingPost.mode) &&
        Objects.equals(this._file, bodyDubAVideoOrAnAudioFileV1DubbingPost._file) &&
        Objects.equals(this.csvFile, bodyDubAVideoOrAnAudioFileV1DubbingPost.csvFile) &&
        Objects.equals(this.foregroundAudioFile, bodyDubAVideoOrAnAudioFileV1DubbingPost.foregroundAudioFile) &&
        Objects.equals(this.backgroundAudioFile, bodyDubAVideoOrAnAudioFileV1DubbingPost.backgroundAudioFile) &&
        Objects.equals(this.name, bodyDubAVideoOrAnAudioFileV1DubbingPost.name) &&
        Objects.equals(this.sourceUrl, bodyDubAVideoOrAnAudioFileV1DubbingPost.sourceUrl) &&
        Objects.equals(this.sourceLang, bodyDubAVideoOrAnAudioFileV1DubbingPost.sourceLang) &&
        Objects.equals(this.targetLang, bodyDubAVideoOrAnAudioFileV1DubbingPost.targetLang) &&
        Objects.equals(this.numSpeakers, bodyDubAVideoOrAnAudioFileV1DubbingPost.numSpeakers) &&
        Objects.equals(this.watermark, bodyDubAVideoOrAnAudioFileV1DubbingPost.watermark) &&
        Objects.equals(this.startTime, bodyDubAVideoOrAnAudioFileV1DubbingPost.startTime) &&
        Objects.equals(this.endTime, bodyDubAVideoOrAnAudioFileV1DubbingPost.endTime) &&
        Objects.equals(this.highestResolution, bodyDubAVideoOrAnAudioFileV1DubbingPost.highestResolution) &&
        Objects.equals(this.dubbingStudio, bodyDubAVideoOrAnAudioFileV1DubbingPost.dubbingStudio)&&
        Objects.equals(this.additionalProperties, bodyDubAVideoOrAnAudioFileV1DubbingPost.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, _file, csvFile, foregroundAudioFile, backgroundAudioFile, name, sourceUrl, sourceLang, targetLang, numSpeakers, watermark, startTime, endTime, highestResolution, dubbingStudio, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodyDubAVideoOrAnAudioFileV1DubbingPost {\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
    sb.append("    csvFile: ").append(toIndentedString(csvFile)).append("\n");
    sb.append("    foregroundAudioFile: ").append(toIndentedString(foregroundAudioFile)).append("\n");
    sb.append("    backgroundAudioFile: ").append(toIndentedString(backgroundAudioFile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
    sb.append("    sourceLang: ").append(toIndentedString(sourceLang)).append("\n");
    sb.append("    targetLang: ").append(toIndentedString(targetLang)).append("\n");
    sb.append("    numSpeakers: ").append(toIndentedString(numSpeakers)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    highestResolution: ").append(toIndentedString(highestResolution)).append("\n");
    sb.append("    dubbingStudio: ").append(toIndentedString(dubbingStudio)).append("\n");
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
    openapiFields.add("mode");
    openapiFields.add("file");
    openapiFields.add("csv_file");
    openapiFields.add("foreground_audio_file");
    openapiFields.add("background_audio_file");
    openapiFields.add("name");
    openapiFields.add("source_url");
    openapiFields.add("source_lang");
    openapiFields.add("target_lang");
    openapiFields.add("num_speakers");
    openapiFields.add("watermark");
    openapiFields.add("start_time");
    openapiFields.add("end_time");
    openapiFields.add("highest_resolution");
    openapiFields.add("dubbing_studio");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("target_lang");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BodyDubAVideoOrAnAudioFileV1DubbingPost
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BodyDubAVideoOrAnAudioFileV1DubbingPost.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BodyDubAVideoOrAnAudioFileV1DubbingPost is not found in the empty JSON string", BodyDubAVideoOrAnAudioFileV1DubbingPost.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BodyDubAVideoOrAnAudioFileV1DubbingPost.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("mode") != null && !jsonObj.get("mode").isJsonNull()) && !jsonObj.get("mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mode").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("source_url") != null && !jsonObj.get("source_url").isJsonNull()) && !jsonObj.get("source_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_url").toString()));
      }
      if ((jsonObj.get("source_lang") != null && !jsonObj.get("source_lang").isJsonNull()) && !jsonObj.get("source_lang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_lang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_lang").toString()));
      }
      if (!jsonObj.get("target_lang").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_lang` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_lang").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BodyDubAVideoOrAnAudioFileV1DubbingPost.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BodyDubAVideoOrAnAudioFileV1DubbingPost' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BodyDubAVideoOrAnAudioFileV1DubbingPost> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BodyDubAVideoOrAnAudioFileV1DubbingPost.class));

       return (TypeAdapter<T>) new TypeAdapter<BodyDubAVideoOrAnAudioFileV1DubbingPost>() {
           @Override
           public void write(JsonWriter out, BodyDubAVideoOrAnAudioFileV1DubbingPost value) throws IOException {
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
           public BodyDubAVideoOrAnAudioFileV1DubbingPost read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BodyDubAVideoOrAnAudioFileV1DubbingPost instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BodyDubAVideoOrAnAudioFileV1DubbingPost given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BodyDubAVideoOrAnAudioFileV1DubbingPost
  * @throws IOException if the JSON string is invalid with respect to BodyDubAVideoOrAnAudioFileV1DubbingPost
  */
  public static BodyDubAVideoOrAnAudioFileV1DubbingPost fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BodyDubAVideoOrAnAudioFileV1DubbingPost.class);
  }

 /**
  * Convert an instance of BodyDubAVideoOrAnAudioFileV1DubbingPost to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
