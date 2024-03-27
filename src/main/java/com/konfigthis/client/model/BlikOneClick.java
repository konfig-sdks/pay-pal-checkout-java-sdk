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
 * Information used to pay using BLIK one-click flow.
 */
@ApiModel(description = "Information used to pay using BLIK one-click flow.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BlikOneClick {
  public static final String SERIALIZED_NAME_AUTH_CODE = "auth_code";
  @SerializedName(SERIALIZED_NAME_AUTH_CODE)
  private String authCode;

  public static final String SERIALIZED_NAME_CONSUMER_REFERENCE = "consumer_reference";
  @SerializedName(SERIALIZED_NAME_CONSUMER_REFERENCE)
  private String consumerReference;

  public static final String SERIALIZED_NAME_ALIAS_LABEL = "alias_label";
  @SerializedName(SERIALIZED_NAME_ALIAS_LABEL)
  private String aliasLabel;

  public static final String SERIALIZED_NAME_ALIAS_KEY = "alias_key";
  @SerializedName(SERIALIZED_NAME_ALIAS_KEY)
  private String aliasKey;

  public BlikOneClick() {
  }

  public BlikOneClick authCode(String authCode) {
    
    
    if (authCode != null && authCode.length() < 6) {
      throw new IllegalArgumentException("Invalid value for authCode. Length must be greater than or equal to 6.");
    }
    
    this.authCode = authCode;
    return this;
  }

   /**
   * The 6-digit code used to authenticate a consumer within BLIK.
   * @return authCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The 6-digit code used to authenticate a consumer within BLIK.")

  public String getAuthCode() {
    return authCode;
  }


  public void setAuthCode(String authCode) {
    
    
    if (authCode != null && authCode.length() < 6) {
      throw new IllegalArgumentException("Invalid value for authCode. Length must be greater than or equal to 6.");
    }
    this.authCode = authCode;
  }


  public BlikOneClick consumerReference(String consumerReference) {
    
    
    if (consumerReference != null && consumerReference.length() < 3) {
      throw new IllegalArgumentException("Invalid value for consumerReference. Length must be greater than or equal to 3.");
    }
    
    this.consumerReference = consumerReference;
    return this;
  }

   /**
   * The merchant generated, unique reference serving as a primary identifier for accounts connected between Blik and a merchant.
   * @return consumerReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The merchant generated, unique reference serving as a primary identifier for accounts connected between Blik and a merchant.")

  public String getConsumerReference() {
    return consumerReference;
  }


  public void setConsumerReference(String consumerReference) {
    
    
    if (consumerReference != null && consumerReference.length() < 3) {
      throw new IllegalArgumentException("Invalid value for consumerReference. Length must be greater than or equal to 3.");
    }
    this.consumerReference = consumerReference;
  }


  public BlikOneClick aliasLabel(String aliasLabel) {
    
    
    if (aliasLabel != null && aliasLabel.length() < 8) {
      throw new IllegalArgumentException("Invalid value for aliasLabel. Length must be greater than or equal to 8.");
    }
    
    this.aliasLabel = aliasLabel;
    return this;
  }

   /**
   * A bank defined identifier used as a display name to allow the payer to differentiate between multiple registered bank accounts.
   * @return aliasLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A bank defined identifier used as a display name to allow the payer to differentiate between multiple registered bank accounts.")

  public String getAliasLabel() {
    return aliasLabel;
  }


  public void setAliasLabel(String aliasLabel) {
    
    
    if (aliasLabel != null && aliasLabel.length() < 8) {
      throw new IllegalArgumentException("Invalid value for aliasLabel. Length must be greater than or equal to 8.");
    }
    this.aliasLabel = aliasLabel;
  }


  public BlikOneClick aliasKey(String aliasKey) {
    
    
    if (aliasKey != null && aliasKey.length() < 1) {
      throw new IllegalArgumentException("Invalid value for aliasKey. Length must be greater than or equal to 1.");
    }
    
    this.aliasKey = aliasKey;
    return this;
  }

   /**
   * A Blik-defined identifier for a specific Blik-enabled bank account that is associated with a given merchant. Used only in conjunction with a Consumer Reference.
   * @return aliasKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A Blik-defined identifier for a specific Blik-enabled bank account that is associated with a given merchant. Used only in conjunction with a Consumer Reference.")

  public String getAliasKey() {
    return aliasKey;
  }


  public void setAliasKey(String aliasKey) {
    
    
    if (aliasKey != null && aliasKey.length() < 1) {
      throw new IllegalArgumentException("Invalid value for aliasKey. Length must be greater than or equal to 1.");
    }
    this.aliasKey = aliasKey;
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
   * @return the BlikOneClick instance itself
   */
  public BlikOneClick putAdditionalProperty(String key, Object value) {
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
    BlikOneClick blikOneClick = (BlikOneClick) o;
    return Objects.equals(this.authCode, blikOneClick.authCode) &&
        Objects.equals(this.consumerReference, blikOneClick.consumerReference) &&
        Objects.equals(this.aliasLabel, blikOneClick.aliasLabel) &&
        Objects.equals(this.aliasKey, blikOneClick.aliasKey)&&
        Objects.equals(this.additionalProperties, blikOneClick.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authCode, consumerReference, aliasLabel, aliasKey, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlikOneClick {\n");
    sb.append("    authCode: ").append(toIndentedString(authCode)).append("\n");
    sb.append("    consumerReference: ").append(toIndentedString(consumerReference)).append("\n");
    sb.append("    aliasLabel: ").append(toIndentedString(aliasLabel)).append("\n");
    sb.append("    aliasKey: ").append(toIndentedString(aliasKey)).append("\n");
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
    openapiFields.add("auth_code");
    openapiFields.add("consumer_reference");
    openapiFields.add("alias_label");
    openapiFields.add("alias_key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("consumer_reference");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BlikOneClick
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BlikOneClick.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlikOneClick is not found in the empty JSON string", BlikOneClick.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BlikOneClick.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("auth_code") != null && !jsonObj.get("auth_code").isJsonNull()) && !jsonObj.get("auth_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth_code").toString()));
      }
      if (!jsonObj.get("consumer_reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumer_reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumer_reference").toString()));
      }
      if ((jsonObj.get("alias_label") != null && !jsonObj.get("alias_label").isJsonNull()) && !jsonObj.get("alias_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alias_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alias_label").toString()));
      }
      if ((jsonObj.get("alias_key") != null && !jsonObj.get("alias_key").isJsonNull()) && !jsonObj.get("alias_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `alias_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("alias_key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlikOneClick.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlikOneClick' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlikOneClick> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlikOneClick.class));

       return (TypeAdapter<T>) new TypeAdapter<BlikOneClick>() {
           @Override
           public void write(JsonWriter out, BlikOneClick value) throws IOException {
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
           public BlikOneClick read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BlikOneClick instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BlikOneClick given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlikOneClick
  * @throws IOException if the JSON string is invalid with respect to BlikOneClick
  */
  public static BlikOneClick fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlikOneClick.class);
  }

 /**
  * Convert an instance of BlikOneClick to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
