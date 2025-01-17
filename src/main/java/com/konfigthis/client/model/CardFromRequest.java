/*
 * Orders
 * An order represents a payment between two or more parties. Use the Orders API to create, update, retrieve, authorize, and capture orders.
 *
 * The version of the OpenAPI document: 2.13
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
 * Representation of card details as received in the request.
 */
@ApiModel(description = "Representation of card details as received in the request.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CardFromRequest {
  public static final String SERIALIZED_NAME_EXPIRY = "expiry";
  @SerializedName(SERIALIZED_NAME_EXPIRY)
  private String expiry;

  public static final String SERIALIZED_NAME_LAST_DIGITS = "last_digits";
  @SerializedName(SERIALIZED_NAME_LAST_DIGITS)
  private String lastDigits;

  public CardFromRequest() {
  }

  
  public CardFromRequest(
     String lastDigits
  ) {
    this();
    this.lastDigits = lastDigits;
  }

  public CardFromRequest expiry(String expiry) {
    
    
    if (expiry != null && expiry.length() < 7) {
      throw new IllegalArgumentException("Invalid value for expiry. Length must be greater than or equal to 7.");
    }
    
    this.expiry = expiry;
    return this;
  }

   /**
   * The year and month, in ISO-8601 &#x60;YYYY-MM&#x60; date format. See [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).
   * @return expiry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The year and month, in ISO-8601 `YYYY-MM` date format. See [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).")

  public String getExpiry() {
    return expiry;
  }


  public void setExpiry(String expiry) {
    
    
    if (expiry != null && expiry.length() < 7) {
      throw new IllegalArgumentException("Invalid value for expiry. Length must be greater than or equal to 7.");
    }
    this.expiry = expiry;
  }


   /**
   * The last digits of the payment card.
   * @return lastDigits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last digits of the payment card.")

  public String getLastDigits() {
    return lastDigits;
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
   * @return the CardFromRequest instance itself
   */
  public CardFromRequest putAdditionalProperty(String key, Object value) {
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
    CardFromRequest cardFromRequest = (CardFromRequest) o;
    return Objects.equals(this.expiry, cardFromRequest.expiry) &&
        Objects.equals(this.lastDigits, cardFromRequest.lastDigits)&&
        Objects.equals(this.additionalProperties, cardFromRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiry, lastDigits, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardFromRequest {\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    lastDigits: ").append(toIndentedString(lastDigits)).append("\n");
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
    openapiFields.add("expiry");
    openapiFields.add("last_digits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CardFromRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CardFromRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardFromRequest is not found in the empty JSON string", CardFromRequest.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("expiry") != null && !jsonObj.get("expiry").isJsonNull()) && !jsonObj.get("expiry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiry").toString()));
      }
      if ((jsonObj.get("last_digits") != null && !jsonObj.get("last_digits").isJsonNull()) && !jsonObj.get("last_digits").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_digits` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_digits").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardFromRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardFromRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardFromRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardFromRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CardFromRequest>() {
           @Override
           public void write(JsonWriter out, CardFromRequest value) throws IOException {
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
           public CardFromRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CardFromRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CardFromRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardFromRequest
  * @throws IOException if the JSON string is invalid with respect to CardFromRequest
  */
  public static CardFromRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardFromRequest.class);
  }

 /**
  * Convert an instance of CardFromRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

