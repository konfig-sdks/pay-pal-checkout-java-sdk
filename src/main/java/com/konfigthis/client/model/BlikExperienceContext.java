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
import java.net.URI;

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
 * Customizes the payer experience during the approval process for the BLIK payment.
 */
@ApiModel(description = "Customizes the payer experience during the approval process for the BLIK payment.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BlikExperienceContext {
  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  /**
   * The location from which the shipping address is derived.
   */
  @JsonAdapter(ShippingPreferenceEnum.Adapter.class)
 public enum ShippingPreferenceEnum {
    GET_FROM_FILE("GET_FROM_FILE"),
    
    NO_SHIPPING("NO_SHIPPING"),
    
    SET_PROVIDED_ADDRESS("SET_PROVIDED_ADDRESS");

    private String value;

    ShippingPreferenceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ShippingPreferenceEnum fromValue(String value) {
      for (ShippingPreferenceEnum b : ShippingPreferenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ShippingPreferenceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ShippingPreferenceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ShippingPreferenceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ShippingPreferenceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SHIPPING_PREFERENCE = "shipping_preference";
  @SerializedName(SERIALIZED_NAME_SHIPPING_PREFERENCE)
  private ShippingPreferenceEnum shippingPreference = ShippingPreferenceEnum.GET_FROM_FILE;

  public static final String SERIALIZED_NAME_RETURN_URL = "return_url";
  @SerializedName(SERIALIZED_NAME_RETURN_URL)
  private URI returnUrl;

  public static final String SERIALIZED_NAME_CANCEL_URL = "cancel_url";
  @SerializedName(SERIALIZED_NAME_CANCEL_URL)
  private URI cancelUrl;

  public static final String SERIALIZED_NAME_CONSUMER_IP = "consumer_ip";
  @SerializedName(SERIALIZED_NAME_CONSUMER_IP)
  private String consumerIp;

  public static final String SERIALIZED_NAME_CONSUMER_USER_AGENT = "consumer_user_agent";
  @SerializedName(SERIALIZED_NAME_CONSUMER_USER_AGENT)
  private String consumerUserAgent;

  public BlikExperienceContext() {
  }

  public BlikExperienceContext brandName(String brandName) {
    
    
    if (brandName != null && brandName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for brandName. Length must be greater than or equal to 1.");
    }
    
    this.brandName = brandName;
    return this;
  }

   /**
   * The label that overrides the business name in the PayPal account on the PayPal site. The pattern is defined by an external party and supports Unicode.
   * @return brandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The label that overrides the business name in the PayPal account on the PayPal site. The pattern is defined by an external party and supports Unicode.")

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    
    
    if (brandName != null && brandName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for brandName. Length must be greater than or equal to 1.");
    }
    this.brandName = brandName;
  }


  public BlikExperienceContext locale(String locale) {
    
    
    if (locale != null && locale.length() < 2) {
      throw new IllegalArgumentException("Invalid value for locale. Length must be greater than or equal to 2.");
    }
    
    this.locale = locale;
    return this;
  }

   /**
   * The [language tag](https://tools.ietf.org/html/bcp47#section-2) for the language in which to localize the error-related strings, such as messages, issues, and suggested actions. The tag is made up of the [ISO 639-2 language code](https://www.loc.gov/standards/iso639-2/php/code_list.php), the optional [ISO-15924 script tag](https://www.unicode.org/iso15924/codelists.html), and the [ISO-3166 alpha-2 country code](https://raw.githubusercontent.com) or [M49 region code](https://unstats.un.org/unsd/methodology/m49/).
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [language tag](https://tools.ietf.org/html/bcp47#section-2) for the language in which to localize the error-related strings, such as messages, issues, and suggested actions. The tag is made up of the [ISO 639-2 language code](https://www.loc.gov/standards/iso639-2/php/code_list.php), the optional [ISO-15924 script tag](https://www.unicode.org/iso15924/codelists.html), and the [ISO-3166 alpha-2 country code](https://raw.githubusercontent.com) or [M49 region code](https://unstats.un.org/unsd/methodology/m49/).")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    
    
    if (locale != null && locale.length() < 2) {
      throw new IllegalArgumentException("Invalid value for locale. Length must be greater than or equal to 2.");
    }
    this.locale = locale;
  }


  public BlikExperienceContext shippingPreference(ShippingPreferenceEnum shippingPreference) {
    
    
    if (shippingPreference != null && shippingPreference.length() < 1) {
      throw new IllegalArgumentException("Invalid value for shippingPreference. Length must be greater than or equal to 1.");
    }
    
    this.shippingPreference = shippingPreference;
    return this;
  }

   /**
   * The location from which the shipping address is derived.
   * @return shippingPreference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GET_FROM_FILE", value = "The location from which the shipping address is derived.")

  public ShippingPreferenceEnum getShippingPreference() {
    return shippingPreference;
  }


  public void setShippingPreference(ShippingPreferenceEnum shippingPreference) {
    
    
    if (shippingPreference != null && shippingPreference.length() < 1) {
      throw new IllegalArgumentException("Invalid value for shippingPreference. Length must be greater than or equal to 1.");
    }
    this.shippingPreference = shippingPreference;
  }


  public BlikExperienceContext returnUrl(URI returnUrl) {
    
    
    
    
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * Describes the URL.
   * @return returnUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes the URL.")

  public URI getReturnUrl() {
    return returnUrl;
  }


  public void setReturnUrl(URI returnUrl) {
    
    
    
    this.returnUrl = returnUrl;
  }


  public BlikExperienceContext cancelUrl(URI cancelUrl) {
    
    
    
    
    this.cancelUrl = cancelUrl;
    return this;
  }

   /**
   * Describes the URL.
   * @return cancelUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes the URL.")

  public URI getCancelUrl() {
    return cancelUrl;
  }


  public void setCancelUrl(URI cancelUrl) {
    
    
    
    this.cancelUrl = cancelUrl;
  }


  public BlikExperienceContext consumerIp(String consumerIp) {
    
    
    if (consumerIp != null && consumerIp.length() < 7) {
      throw new IllegalArgumentException("Invalid value for consumerIp. Length must be greater than or equal to 7.");
    }
    
    this.consumerIp = consumerIp;
    return this;
  }

   /**
   * An Internet Protocol address (IP address). This address assigns a numerical label to each device that is connected to a computer network through the Internet Protocol. Supports IPv4 and IPv6 addresses.
   * @return consumerIp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An Internet Protocol address (IP address). This address assigns a numerical label to each device that is connected to a computer network through the Internet Protocol. Supports IPv4 and IPv6 addresses.")

  public String getConsumerIp() {
    return consumerIp;
  }


  public void setConsumerIp(String consumerIp) {
    
    
    if (consumerIp != null && consumerIp.length() < 7) {
      throw new IllegalArgumentException("Invalid value for consumerIp. Length must be greater than or equal to 7.");
    }
    this.consumerIp = consumerIp;
  }


  public BlikExperienceContext consumerUserAgent(String consumerUserAgent) {
    
    
    if (consumerUserAgent != null && consumerUserAgent.length() < 1) {
      throw new IllegalArgumentException("Invalid value for consumerUserAgent. Length must be greater than or equal to 1.");
    }
    
    this.consumerUserAgent = consumerUserAgent;
    return this;
  }

   /**
   * The payer&#39;s User Agent. For example, Mozilla/5.0 (Macintosh; Intel Mac OS X x.y; rv:42.0).
   * @return consumerUserAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payer's User Agent. For example, Mozilla/5.0 (Macintosh; Intel Mac OS X x.y; rv:42.0).")

  public String getConsumerUserAgent() {
    return consumerUserAgent;
  }


  public void setConsumerUserAgent(String consumerUserAgent) {
    
    
    if (consumerUserAgent != null && consumerUserAgent.length() < 1) {
      throw new IllegalArgumentException("Invalid value for consumerUserAgent. Length must be greater than or equal to 1.");
    }
    this.consumerUserAgent = consumerUserAgent;
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
   * @return the BlikExperienceContext instance itself
   */
  public BlikExperienceContext putAdditionalProperty(String key, Object value) {
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
    BlikExperienceContext blikExperienceContext = (BlikExperienceContext) o;
    return Objects.equals(this.brandName, blikExperienceContext.brandName) &&
        Objects.equals(this.locale, blikExperienceContext.locale) &&
        Objects.equals(this.shippingPreference, blikExperienceContext.shippingPreference) &&
        Objects.equals(this.returnUrl, blikExperienceContext.returnUrl) &&
        Objects.equals(this.cancelUrl, blikExperienceContext.cancelUrl) &&
        Objects.equals(this.consumerIp, blikExperienceContext.consumerIp) &&
        Objects.equals(this.consumerUserAgent, blikExperienceContext.consumerUserAgent)&&
        Objects.equals(this.additionalProperties, blikExperienceContext.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandName, locale, shippingPreference, returnUrl, cancelUrl, consumerIp, consumerUserAgent, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlikExperienceContext {\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    shippingPreference: ").append(toIndentedString(shippingPreference)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    cancelUrl: ").append(toIndentedString(cancelUrl)).append("\n");
    sb.append("    consumerIp: ").append(toIndentedString(consumerIp)).append("\n");
    sb.append("    consumerUserAgent: ").append(toIndentedString(consumerUserAgent)).append("\n");
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
    openapiFields.add("brand_name");
    openapiFields.add("locale");
    openapiFields.add("shipping_preference");
    openapiFields.add("return_url");
    openapiFields.add("cancel_url");
    openapiFields.add("consumer_ip");
    openapiFields.add("consumer_user_agent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BlikExperienceContext
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BlikExperienceContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BlikExperienceContext is not found in the empty JSON string", BlikExperienceContext.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("brand_name") != null && !jsonObj.get("brand_name").isJsonNull()) && !jsonObj.get("brand_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_name").toString()));
      }
      if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull()) && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      if ((jsonObj.get("shipping_preference") != null && !jsonObj.get("shipping_preference").isJsonNull()) && !jsonObj.get("shipping_preference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shipping_preference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shipping_preference").toString()));
      }
      if ((jsonObj.get("return_url") != null && !jsonObj.get("return_url").isJsonNull()) && !jsonObj.get("return_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `return_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("return_url").toString()));
      }
      if ((jsonObj.get("cancel_url") != null && !jsonObj.get("cancel_url").isJsonNull()) && !jsonObj.get("cancel_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancel_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancel_url").toString()));
      }
      if ((jsonObj.get("consumer_ip") != null && !jsonObj.get("consumer_ip").isJsonNull()) && !jsonObj.get("consumer_ip").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumer_ip` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumer_ip").toString()));
      }
      if ((jsonObj.get("consumer_user_agent") != null && !jsonObj.get("consumer_user_agent").isJsonNull()) && !jsonObj.get("consumer_user_agent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consumer_user_agent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consumer_user_agent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BlikExperienceContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BlikExperienceContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BlikExperienceContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BlikExperienceContext.class));

       return (TypeAdapter<T>) new TypeAdapter<BlikExperienceContext>() {
           @Override
           public void write(JsonWriter out, BlikExperienceContext value) throws IOException {
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
           public BlikExperienceContext read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BlikExperienceContext instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BlikExperienceContext given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BlikExperienceContext
  * @throws IOException if the JSON string is invalid with respect to BlikExperienceContext
  */
  public static BlikExperienceContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BlikExperienceContext.class);
  }

 /**
  * Convert an instance of BlikExperienceContext to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

