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
import com.konfigthis.client.model.CardExperienceContext;
import com.konfigthis.client.model.CardStoredCredential;
import com.konfigthis.client.model.NetworkTokenRequest;
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
 * CardRequestAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CardRequestAllOf {
  public static final String SERIALIZED_NAME_VAULT_ID = "vault_id";
  @SerializedName(SERIALIZED_NAME_VAULT_ID)
  private String vaultId;

  public static final String SERIALIZED_NAME_STORED_CREDENTIAL = "stored_credential";
  @SerializedName(SERIALIZED_NAME_STORED_CREDENTIAL)
  private CardStoredCredential storedCredential;

  public static final String SERIALIZED_NAME_NETWORK_TOKEN = "network_token";
  @SerializedName(SERIALIZED_NAME_NETWORK_TOKEN)
  private NetworkTokenRequest networkToken;

  public static final String SERIALIZED_NAME_EXPERIENCE_CONTEXT = "experience_context";
  @SerializedName(SERIALIZED_NAME_EXPERIENCE_CONTEXT)
  private CardExperienceContext experienceContext;

  public CardRequestAllOf() {
  }

  public CardRequestAllOf vaultId(String vaultId) {
    
    
    if (vaultId != null && vaultId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for vaultId. Length must be greater than or equal to 1.");
    }
    
    this.vaultId = vaultId;
    return this;
  }

   /**
   * The PayPal-generated ID for the vaulted payment source. This ID should be stored on the merchant&#39;s server so the saved payment source can be used for future transactions.
   * @return vaultId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The PayPal-generated ID for the vaulted payment source. This ID should be stored on the merchant's server so the saved payment source can be used for future transactions.")

  public String getVaultId() {
    return vaultId;
  }


  public void setVaultId(String vaultId) {
    
    
    if (vaultId != null && vaultId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for vaultId. Length must be greater than or equal to 1.");
    }
    this.vaultId = vaultId;
  }


  public CardRequestAllOf storedCredential(CardStoredCredential storedCredential) {
    
    
    
    
    this.storedCredential = storedCredential;
    return this;
  }

   /**
   * Get storedCredential
   * @return storedCredential
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CardStoredCredential getStoredCredential() {
    return storedCredential;
  }


  public void setStoredCredential(CardStoredCredential storedCredential) {
    
    
    
    this.storedCredential = storedCredential;
  }


  public CardRequestAllOf networkToken(NetworkTokenRequest networkToken) {
    
    
    
    
    this.networkToken = networkToken;
    return this;
  }

   /**
   * Get networkToken
   * @return networkToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NetworkTokenRequest getNetworkToken() {
    return networkToken;
  }


  public void setNetworkToken(NetworkTokenRequest networkToken) {
    
    
    
    this.networkToken = networkToken;
  }


  public CardRequestAllOf experienceContext(CardExperienceContext experienceContext) {
    
    
    
    
    this.experienceContext = experienceContext;
    return this;
  }

   /**
   * Get experienceContext
   * @return experienceContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CardExperienceContext getExperienceContext() {
    return experienceContext;
  }


  public void setExperienceContext(CardExperienceContext experienceContext) {
    
    
    
    this.experienceContext = experienceContext;
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
   * @return the CardRequestAllOf instance itself
   */
  public CardRequestAllOf putAdditionalProperty(String key, Object value) {
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
    CardRequestAllOf cardRequestAllOf = (CardRequestAllOf) o;
    return Objects.equals(this.vaultId, cardRequestAllOf.vaultId) &&
        Objects.equals(this.storedCredential, cardRequestAllOf.storedCredential) &&
        Objects.equals(this.networkToken, cardRequestAllOf.networkToken) &&
        Objects.equals(this.experienceContext, cardRequestAllOf.experienceContext)&&
        Objects.equals(this.additionalProperties, cardRequestAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vaultId, storedCredential, networkToken, experienceContext, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardRequestAllOf {\n");
    sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
    sb.append("    storedCredential: ").append(toIndentedString(storedCredential)).append("\n");
    sb.append("    networkToken: ").append(toIndentedString(networkToken)).append("\n");
    sb.append("    experienceContext: ").append(toIndentedString(experienceContext)).append("\n");
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
    openapiFields.add("vault_id");
    openapiFields.add("stored_credential");
    openapiFields.add("network_token");
    openapiFields.add("experience_context");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CardRequestAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CardRequestAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CardRequestAllOf is not found in the empty JSON string", CardRequestAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("vault_id") != null && !jsonObj.get("vault_id").isJsonNull()) && !jsonObj.get("vault_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vault_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vault_id").toString()));
      }
      // validate the optional field `stored_credential`
      if (jsonObj.get("stored_credential") != null && !jsonObj.get("stored_credential").isJsonNull()) {
        CardStoredCredential.validateJsonObject(jsonObj.getAsJsonObject("stored_credential"));
      }
      // validate the optional field `network_token`
      if (jsonObj.get("network_token") != null && !jsonObj.get("network_token").isJsonNull()) {
        NetworkTokenRequest.validateJsonObject(jsonObj.getAsJsonObject("network_token"));
      }
      // validate the optional field `experience_context`
      if (jsonObj.get("experience_context") != null && !jsonObj.get("experience_context").isJsonNull()) {
        CardExperienceContext.validateJsonObject(jsonObj.getAsJsonObject("experience_context"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CardRequestAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CardRequestAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CardRequestAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CardRequestAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<CardRequestAllOf>() {
           @Override
           public void write(JsonWriter out, CardRequestAllOf value) throws IOException {
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
           public CardRequestAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CardRequestAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CardRequestAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CardRequestAllOf
  * @throws IOException if the JSON string is invalid with respect to CardRequestAllOf
  */
  public static CardRequestAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CardRequestAllOf.class);
  }

 /**
  * Convert an instance of CardRequestAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

