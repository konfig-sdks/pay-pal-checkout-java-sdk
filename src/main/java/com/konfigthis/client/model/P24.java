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
 * Information used to pay using P24(Przelewy24).
 */
@ApiModel(description = "Information used to pay using P24(Przelewy24).")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class P24 {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_PAYMENT_DESCRIPTOR = "payment_descriptor";
  @SerializedName(SERIALIZED_NAME_PAYMENT_DESCRIPTOR)
  private String paymentDescriptor;

  public static final String SERIALIZED_NAME_METHOD_ID = "method_id";
  @SerializedName(SERIALIZED_NAME_METHOD_ID)
  private String methodId;

  public static final String SERIALIZED_NAME_METHOD_DESCRIPTION = "method_description";
  @SerializedName(SERIALIZED_NAME_METHOD_DESCRIPTION)
  private String methodDescription;

  public P24() {
  }

  public P24 name(String name) {
    
    
    if (name != null && name.length() < 3) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 3.");
    }
    
    this.name = name;
    return this;
  }

   /**
   * The full name representation like Mr J Smith.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full name representation like Mr J Smith.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    if (name != null && name.length() < 3) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 3.");
    }
    this.name = name;
  }


  public P24 email(String email) {
    
    
    if (email != null && email.length() < 3) {
      throw new IllegalArgumentException("Invalid value for email. Length must be greater than or equal to 3.");
    }
    
    this.email = email;
    return this;
  }

   /**
   * The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters are allowed before and 255 characters are allowed after the &lt;code&gt;@&lt;/code&gt; sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted &lt;code&gt;@&lt;/code&gt; sign exists.&lt;/blockquote&gt;
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The internationalized email address.<blockquote><strong>Note:</strong> Up to 64 characters are allowed before and 255 characters are allowed after the <code>@</code> sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted <code>@</code> sign exists.</blockquote>")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    if (email != null && email.length() < 3) {
      throw new IllegalArgumentException("Invalid value for email. Length must be greater than or equal to 3.");
    }
    this.email = email;
  }


  public P24 countryCode(String countryCode) {
    
    
    if (countryCode != null && countryCode.length() < 2) {
      throw new IllegalArgumentException("Invalid value for countryCode. Length must be greater than or equal to 2.");
    }
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The [two-character ISO 3166-1 code](https://raw.githubusercontent.com) that identifies the country or region.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The country code for Great Britain is &lt;code&gt;GB&lt;/code&gt; and not &lt;code&gt;UK&lt;/code&gt; as used in the top-level domain names for that country. Use the &#x60;C2&#x60; country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.&lt;/blockquote&gt;
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [two-character ISO 3166-1 code](https://raw.githubusercontent.com) that identifies the country or region.<blockquote><strong>Note:</strong> The country code for Great Britain is <code>GB</code> and not <code>UK</code> as used in the top-level domain names for that country. Use the `C2` country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.</blockquote>")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    
    
    if (countryCode != null && countryCode.length() < 2) {
      throw new IllegalArgumentException("Invalid value for countryCode. Length must be greater than or equal to 2.");
    }
    this.countryCode = countryCode;
  }


  public P24 paymentDescriptor(String paymentDescriptor) {
    
    
    if (paymentDescriptor != null && paymentDescriptor.length() < 1) {
      throw new IllegalArgumentException("Invalid value for paymentDescriptor. Length must be greater than or equal to 1.");
    }
    
    this.paymentDescriptor = paymentDescriptor;
    return this;
  }

   /**
   * P24 generated payment description.
   * @return paymentDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "P24 generated payment description.")

  public String getPaymentDescriptor() {
    return paymentDescriptor;
  }


  public void setPaymentDescriptor(String paymentDescriptor) {
    
    
    if (paymentDescriptor != null && paymentDescriptor.length() < 1) {
      throw new IllegalArgumentException("Invalid value for paymentDescriptor. Length must be greater than or equal to 1.");
    }
    this.paymentDescriptor = paymentDescriptor;
  }


  public P24 methodId(String methodId) {
    
    
    if (methodId != null && methodId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for methodId. Length must be greater than or equal to 1.");
    }
    
    this.methodId = methodId;
    return this;
  }

   /**
   * Numeric identifier of the payment scheme or bank used for the payment.
   * @return methodId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Numeric identifier of the payment scheme or bank used for the payment.")

  public String getMethodId() {
    return methodId;
  }


  public void setMethodId(String methodId) {
    
    
    if (methodId != null && methodId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for methodId. Length must be greater than or equal to 1.");
    }
    this.methodId = methodId;
  }


  public P24 methodDescription(String methodDescription) {
    
    
    if (methodDescription != null && methodDescription.length() < 1) {
      throw new IllegalArgumentException("Invalid value for methodDescription. Length must be greater than or equal to 1.");
    }
    
    this.methodDescription = methodDescription;
    return this;
  }

   /**
   * Friendly name of the payment scheme or bank used for the payment.
   * @return methodDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Friendly name of the payment scheme or bank used for the payment.")

  public String getMethodDescription() {
    return methodDescription;
  }


  public void setMethodDescription(String methodDescription) {
    
    
    if (methodDescription != null && methodDescription.length() < 1) {
      throw new IllegalArgumentException("Invalid value for methodDescription. Length must be greater than or equal to 1.");
    }
    this.methodDescription = methodDescription;
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
   * @return the P24 instance itself
   */
  public P24 putAdditionalProperty(String key, Object value) {
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
    P24 p24 = (P24) o;
    return Objects.equals(this.name, p24.name) &&
        Objects.equals(this.email, p24.email) &&
        Objects.equals(this.countryCode, p24.countryCode) &&
        Objects.equals(this.paymentDescriptor, p24.paymentDescriptor) &&
        Objects.equals(this.methodId, p24.methodId) &&
        Objects.equals(this.methodDescription, p24.methodDescription)&&
        Objects.equals(this.additionalProperties, p24.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, countryCode, paymentDescriptor, methodId, methodDescription, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class P24 {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    paymentDescriptor: ").append(toIndentedString(paymentDescriptor)).append("\n");
    sb.append("    methodId: ").append(toIndentedString(methodId)).append("\n");
    sb.append("    methodDescription: ").append(toIndentedString(methodDescription)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("email");
    openapiFields.add("country_code");
    openapiFields.add("payment_descriptor");
    openapiFields.add("method_id");
    openapiFields.add("method_description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to P24
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!P24.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in P24 is not found in the empty JSON string", P24.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if ((jsonObj.get("payment_descriptor") != null && !jsonObj.get("payment_descriptor").isJsonNull()) && !jsonObj.get("payment_descriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_descriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_descriptor").toString()));
      }
      if ((jsonObj.get("method_id") != null && !jsonObj.get("method_id").isJsonNull()) && !jsonObj.get("method_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method_id").toString()));
      }
      if ((jsonObj.get("method_description") != null && !jsonObj.get("method_description").isJsonNull()) && !jsonObj.get("method_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method_description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!P24.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'P24' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<P24> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(P24.class));

       return (TypeAdapter<T>) new TypeAdapter<P24>() {
           @Override
           public void write(JsonWriter out, P24 value) throws IOException {
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
           public P24 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             P24 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of P24 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of P24
  * @throws IOException if the JSON string is invalid with respect to P24
  */
  public static P24 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, P24.class);
  }

 /**
  * Convert an instance of P24 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

