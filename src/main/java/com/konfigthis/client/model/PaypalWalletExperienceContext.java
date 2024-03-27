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
 * Customizes the payer experience during the approval process for payment with PayPal.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Partners and Marketplaces might configure &lt;code&gt;brand_name&lt;/code&gt; and &lt;code&gt;shipping_preference&lt;/code&gt; during partner account setup, which overrides the request values.&lt;/blockquote&gt;
 */
@ApiModel(description = "Customizes the payer experience during the approval process for payment with PayPal.<blockquote><strong>Note:</strong> Partners and Marketplaces might configure <code>brand_name</code> and <code>shipping_preference</code> during partner account setup, which overrides the request values.</blockquote>")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaypalWalletExperienceContext {
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

  /**
   * The type of landing page to show on the PayPal site for customer checkout.
   */
  @JsonAdapter(LandingPageEnum.Adapter.class)
 public enum LandingPageEnum {
    LOGIN("LOGIN"),
    
    GUEST_CHECKOUT("GUEST_CHECKOUT"),
    
    NO_PREFERENCE("NO_PREFERENCE");

    private String value;

    LandingPageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LandingPageEnum fromValue(String value) {
      for (LandingPageEnum b : LandingPageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LandingPageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LandingPageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LandingPageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LandingPageEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LANDING_PAGE = "landing_page";
  @SerializedName(SERIALIZED_NAME_LANDING_PAGE)
  private LandingPageEnum landingPage = LandingPageEnum.NO_PREFERENCE;

  /**
   * Configures a &lt;strong&gt;Continue&lt;/strong&gt; or &lt;strong&gt;Pay Now&lt;/strong&gt; checkout flow.
   */
  @JsonAdapter(UserActionEnum.Adapter.class)
 public enum UserActionEnum {
    CONTINUE("CONTINUE"),
    
    PAY_NOW("PAY_NOW");

    private String value;

    UserActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UserActionEnum fromValue(String value) {
      for (UserActionEnum b : UserActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UserActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UserActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UserActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UserActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USER_ACTION = "user_action";
  @SerializedName(SERIALIZED_NAME_USER_ACTION)
  private UserActionEnum userAction = UserActionEnum.CONTINUE;

  /**
   * The merchant-preferred payment methods.
   */
  @JsonAdapter(PaymentMethodPreferenceEnum.Adapter.class)
 public enum PaymentMethodPreferenceEnum {
    UNRESTRICTED("UNRESTRICTED"),
    
    IMMEDIATE_PAYMENT_REQUIRED("IMMEDIATE_PAYMENT_REQUIRED");

    private String value;

    PaymentMethodPreferenceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentMethodPreferenceEnum fromValue(String value) {
      for (PaymentMethodPreferenceEnum b : PaymentMethodPreferenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PaymentMethodPreferenceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentMethodPreferenceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentMethodPreferenceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PaymentMethodPreferenceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_PREFERENCE = "payment_method_preference";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_PREFERENCE)
  private PaymentMethodPreferenceEnum paymentMethodPreference = PaymentMethodPreferenceEnum.UNRESTRICTED;

  public PaypalWalletExperienceContext() {
  }

  public PaypalWalletExperienceContext brandName(String brandName) {
    
    
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


  public PaypalWalletExperienceContext locale(String locale) {
    
    
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


  public PaypalWalletExperienceContext shippingPreference(ShippingPreferenceEnum shippingPreference) {
    
    
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


  public PaypalWalletExperienceContext returnUrl(URI returnUrl) {
    
    
    
    
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


  public PaypalWalletExperienceContext cancelUrl(URI cancelUrl) {
    
    
    
    
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


  public PaypalWalletExperienceContext landingPage(LandingPageEnum landingPage) {
    
    
    if (landingPage != null && landingPage.length() < 1) {
      throw new IllegalArgumentException("Invalid value for landingPage. Length must be greater than or equal to 1.");
    }
    
    this.landingPage = landingPage;
    return this;
  }

   /**
   * The type of landing page to show on the PayPal site for customer checkout.
   * @return landingPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NO_PREFERENCE", value = "The type of landing page to show on the PayPal site for customer checkout.")

  public LandingPageEnum getLandingPage() {
    return landingPage;
  }


  public void setLandingPage(LandingPageEnum landingPage) {
    
    
    if (landingPage != null && landingPage.length() < 1) {
      throw new IllegalArgumentException("Invalid value for landingPage. Length must be greater than or equal to 1.");
    }
    this.landingPage = landingPage;
  }


  public PaypalWalletExperienceContext userAction(UserActionEnum userAction) {
    
    
    if (userAction != null && userAction.length() < 1) {
      throw new IllegalArgumentException("Invalid value for userAction. Length must be greater than or equal to 1.");
    }
    
    this.userAction = userAction;
    return this;
  }

   /**
   * Configures a &lt;strong&gt;Continue&lt;/strong&gt; or &lt;strong&gt;Pay Now&lt;/strong&gt; checkout flow.
   * @return userAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CONTINUE", value = "Configures a <strong>Continue</strong> or <strong>Pay Now</strong> checkout flow.")

  public UserActionEnum getUserAction() {
    return userAction;
  }


  public void setUserAction(UserActionEnum userAction) {
    
    
    if (userAction != null && userAction.length() < 1) {
      throw new IllegalArgumentException("Invalid value for userAction. Length must be greater than or equal to 1.");
    }
    this.userAction = userAction;
  }


  public PaypalWalletExperienceContext paymentMethodPreference(PaymentMethodPreferenceEnum paymentMethodPreference) {
    
    
    if (paymentMethodPreference != null && paymentMethodPreference.length() < 1) {
      throw new IllegalArgumentException("Invalid value for paymentMethodPreference. Length must be greater than or equal to 1.");
    }
    
    this.paymentMethodPreference = paymentMethodPreference;
    return this;
  }

   /**
   * The merchant-preferred payment methods.
   * @return paymentMethodPreference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "UNRESTRICTED", value = "The merchant-preferred payment methods.")

  public PaymentMethodPreferenceEnum getPaymentMethodPreference() {
    return paymentMethodPreference;
  }


  public void setPaymentMethodPreference(PaymentMethodPreferenceEnum paymentMethodPreference) {
    
    
    if (paymentMethodPreference != null && paymentMethodPreference.length() < 1) {
      throw new IllegalArgumentException("Invalid value for paymentMethodPreference. Length must be greater than or equal to 1.");
    }
    this.paymentMethodPreference = paymentMethodPreference;
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
   * @return the PaypalWalletExperienceContext instance itself
   */
  public PaypalWalletExperienceContext putAdditionalProperty(String key, Object value) {
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
    PaypalWalletExperienceContext paypalWalletExperienceContext = (PaypalWalletExperienceContext) o;
    return Objects.equals(this.brandName, paypalWalletExperienceContext.brandName) &&
        Objects.equals(this.locale, paypalWalletExperienceContext.locale) &&
        Objects.equals(this.shippingPreference, paypalWalletExperienceContext.shippingPreference) &&
        Objects.equals(this.returnUrl, paypalWalletExperienceContext.returnUrl) &&
        Objects.equals(this.cancelUrl, paypalWalletExperienceContext.cancelUrl) &&
        Objects.equals(this.landingPage, paypalWalletExperienceContext.landingPage) &&
        Objects.equals(this.userAction, paypalWalletExperienceContext.userAction) &&
        Objects.equals(this.paymentMethodPreference, paypalWalletExperienceContext.paymentMethodPreference)&&
        Objects.equals(this.additionalProperties, paypalWalletExperienceContext.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandName, locale, shippingPreference, returnUrl, cancelUrl, landingPage, userAction, paymentMethodPreference, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaypalWalletExperienceContext {\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    shippingPreference: ").append(toIndentedString(shippingPreference)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    cancelUrl: ").append(toIndentedString(cancelUrl)).append("\n");
    sb.append("    landingPage: ").append(toIndentedString(landingPage)).append("\n");
    sb.append("    userAction: ").append(toIndentedString(userAction)).append("\n");
    sb.append("    paymentMethodPreference: ").append(toIndentedString(paymentMethodPreference)).append("\n");
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
    openapiFields.add("landing_page");
    openapiFields.add("user_action");
    openapiFields.add("payment_method_preference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaypalWalletExperienceContext
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaypalWalletExperienceContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaypalWalletExperienceContext is not found in the empty JSON string", PaypalWalletExperienceContext.openapiRequiredFields.toString()));
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
      if ((jsonObj.get("landing_page") != null && !jsonObj.get("landing_page").isJsonNull()) && !jsonObj.get("landing_page").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `landing_page` to be a primitive type in the JSON string but got `%s`", jsonObj.get("landing_page").toString()));
      }
      if ((jsonObj.get("user_action") != null && !jsonObj.get("user_action").isJsonNull()) && !jsonObj.get("user_action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_action").toString()));
      }
      if ((jsonObj.get("payment_method_preference") != null && !jsonObj.get("payment_method_preference").isJsonNull()) && !jsonObj.get("payment_method_preference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payment_method_preference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payment_method_preference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaypalWalletExperienceContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaypalWalletExperienceContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaypalWalletExperienceContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaypalWalletExperienceContext.class));

       return (TypeAdapter<T>) new TypeAdapter<PaypalWalletExperienceContext>() {
           @Override
           public void write(JsonWriter out, PaypalWalletExperienceContext value) throws IOException {
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
           public PaypalWalletExperienceContext read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaypalWalletExperienceContext instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaypalWalletExperienceContext given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaypalWalletExperienceContext
  * @throws IOException if the JSON string is invalid with respect to PaypalWalletExperienceContext
  */
  public static PaypalWalletExperienceContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaypalWalletExperienceContext.class);
  }

 /**
  * Convert an instance of PaypalWalletExperienceContext to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

