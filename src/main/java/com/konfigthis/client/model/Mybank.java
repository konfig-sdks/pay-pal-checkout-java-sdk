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
 * Information used to pay using MyBank.
 */
@ApiModel(description = "Information used to pay using MyBank.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Mybank {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_BIC = "bic";
  @SerializedName(SERIALIZED_NAME_BIC)
  private String bic;

  public static final String SERIALIZED_NAME_IBAN_LAST_CHARS = "iban_last_chars";
  @SerializedName(SERIALIZED_NAME_IBAN_LAST_CHARS)
  private String ibanLastChars;

  public Mybank() {
  }

  public Mybank name(String name) {
    
    
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


  public Mybank countryCode(String countryCode) {
    
    
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


  public Mybank bic(String bic) {
    
    
    if (bic != null && bic.length() < 8) {
      throw new IllegalArgumentException("Invalid value for bic. Length must be greater than or equal to 8.");
    }
    
    this.bic = bic;
    return this;
  }

   /**
   * The business identification code (BIC). In payments systems, a BIC is used to identify a specific business, most commonly a bank.
   * @return bic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The business identification code (BIC). In payments systems, a BIC is used to identify a specific business, most commonly a bank.")

  public String getBic() {
    return bic;
  }


  public void setBic(String bic) {
    
    
    if (bic != null && bic.length() < 8) {
      throw new IllegalArgumentException("Invalid value for bic. Length must be greater than or equal to 8.");
    }
    this.bic = bic;
  }


  public Mybank ibanLastChars(String ibanLastChars) {
    
    
    if (ibanLastChars != null && ibanLastChars.length() < 4) {
      throw new IllegalArgumentException("Invalid value for ibanLastChars. Length must be greater than or equal to 4.");
    }
    
    this.ibanLastChars = ibanLastChars;
    return this;
  }

   /**
   * The last characters of the IBAN used to pay.
   * @return ibanLastChars
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last characters of the IBAN used to pay.")

  public String getIbanLastChars() {
    return ibanLastChars;
  }


  public void setIbanLastChars(String ibanLastChars) {
    
    
    if (ibanLastChars != null && ibanLastChars.length() < 4) {
      throw new IllegalArgumentException("Invalid value for ibanLastChars. Length must be greater than or equal to 4.");
    }
    this.ibanLastChars = ibanLastChars;
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
   * @return the Mybank instance itself
   */
  public Mybank putAdditionalProperty(String key, Object value) {
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
    Mybank mybank = (Mybank) o;
    return Objects.equals(this.name, mybank.name) &&
        Objects.equals(this.countryCode, mybank.countryCode) &&
        Objects.equals(this.bic, mybank.bic) &&
        Objects.equals(this.ibanLastChars, mybank.ibanLastChars)&&
        Objects.equals(this.additionalProperties, mybank.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, countryCode, bic, ibanLastChars, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mybank {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    ibanLastChars: ").append(toIndentedString(ibanLastChars)).append("\n");
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
    openapiFields.add("country_code");
    openapiFields.add("bic");
    openapiFields.add("iban_last_chars");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Mybank
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Mybank.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Mybank is not found in the empty JSON string", Mybank.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("country_code") != null && !jsonObj.get("country_code").isJsonNull()) && !jsonObj.get("country_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country_code").toString()));
      }
      if ((jsonObj.get("bic") != null && !jsonObj.get("bic").isJsonNull()) && !jsonObj.get("bic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bic").toString()));
      }
      if ((jsonObj.get("iban_last_chars") != null && !jsonObj.get("iban_last_chars").isJsonNull()) && !jsonObj.get("iban_last_chars").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iban_last_chars` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iban_last_chars").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Mybank.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Mybank' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Mybank> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Mybank.class));

       return (TypeAdapter<T>) new TypeAdapter<Mybank>() {
           @Override
           public void write(JsonWriter out, Mybank value) throws IOException {
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
           public Mybank read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Mybank instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Mybank given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Mybank
  * @throws IOException if the JSON string is invalid with respect to Mybank
  */
  public static Mybank fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Mybank.class);
  }

 /**
  * Convert an instance of Mybank to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

