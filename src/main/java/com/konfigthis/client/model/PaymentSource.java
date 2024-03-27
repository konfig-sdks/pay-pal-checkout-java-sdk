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
import com.konfigthis.client.model.ApplePayRequest;
import com.konfigthis.client.model.BancontactRequest;
import com.konfigthis.client.model.BlikRequest;
import com.konfigthis.client.model.CardRequest;
import com.konfigthis.client.model.EpsRequest;
import com.konfigthis.client.model.GiropayRequest;
import com.konfigthis.client.model.IdealRequest;
import com.konfigthis.client.model.MybankRequest;
import com.konfigthis.client.model.P24Request;
import com.konfigthis.client.model.PaypalWallet;
import com.konfigthis.client.model.SofortRequest;
import com.konfigthis.client.model.Token;
import com.konfigthis.client.model.TrustlyRequest;
import com.konfigthis.client.model.VenmoWalletRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * The payment source definition.
 */
@ApiModel(description = "The payment source definition.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentSource {
  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private CardRequest card;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private Token token;

  public static final String SERIALIZED_NAME_PAYPAL = "paypal";
  @SerializedName(SERIALIZED_NAME_PAYPAL)
  private PaypalWallet paypal;

  public static final String SERIALIZED_NAME_BANCONTACT = "bancontact";
  @SerializedName(SERIALIZED_NAME_BANCONTACT)
  private BancontactRequest bancontact;

  public static final String SERIALIZED_NAME_BLIK = "blik";
  @SerializedName(SERIALIZED_NAME_BLIK)
  private BlikRequest blik;

  public static final String SERIALIZED_NAME_EPS = "eps";
  @SerializedName(SERIALIZED_NAME_EPS)
  private EpsRequest eps;

  public static final String SERIALIZED_NAME_GIROPAY = "giropay";
  @SerializedName(SERIALIZED_NAME_GIROPAY)
  private GiropayRequest giropay;

  public static final String SERIALIZED_NAME_IDEAL = "ideal";
  @SerializedName(SERIALIZED_NAME_IDEAL)
  private IdealRequest ideal;

  public static final String SERIALIZED_NAME_MYBANK = "mybank";
  @SerializedName(SERIALIZED_NAME_MYBANK)
  private MybankRequest mybank;

  public static final String SERIALIZED_NAME_P24 = "p24";
  @SerializedName(SERIALIZED_NAME_P24)
  private P24Request p24;

  public static final String SERIALIZED_NAME_SOFORT = "sofort";
  @SerializedName(SERIALIZED_NAME_SOFORT)
  private SofortRequest sofort;

  public static final String SERIALIZED_NAME_TRUSTLY = "trustly";
  @SerializedName(SERIALIZED_NAME_TRUSTLY)
  private TrustlyRequest trustly;

  public static final String SERIALIZED_NAME_APPLE_PAY = "apple_pay";
  @SerializedName(SERIALIZED_NAME_APPLE_PAY)
  private ApplePayRequest applePay;

  public static final String SERIALIZED_NAME_GOOGLE_PAY = "google_pay";
  @SerializedName(SERIALIZED_NAME_GOOGLE_PAY)
  private Object googlePay = null;

  public static final String SERIALIZED_NAME_VENMO = "venmo";
  @SerializedName(SERIALIZED_NAME_VENMO)
  private VenmoWalletRequest venmo;

  public PaymentSource() {
  }

  public PaymentSource card(CardRequest card) {
    
    
    
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CardRequest getCard() {
    return card;
  }


  public void setCard(CardRequest card) {
    
    
    
    this.card = card;
  }


  public PaymentSource token(Token token) {
    
    
    
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Token getToken() {
    return token;
  }


  public void setToken(Token token) {
    
    
    
    this.token = token;
  }


  public PaymentSource paypal(PaypalWallet paypal) {
    
    
    
    
    this.paypal = paypal;
    return this;
  }

   /**
   * Get paypal
   * @return paypal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaypalWallet getPaypal() {
    return paypal;
  }


  public void setPaypal(PaypalWallet paypal) {
    
    
    
    this.paypal = paypal;
  }


  public PaymentSource bancontact(BancontactRequest bancontact) {
    
    
    
    
    this.bancontact = bancontact;
    return this;
  }

   /**
   * Get bancontact
   * @return bancontact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BancontactRequest getBancontact() {
    return bancontact;
  }


  public void setBancontact(BancontactRequest bancontact) {
    
    
    
    this.bancontact = bancontact;
  }


  public PaymentSource blik(BlikRequest blik) {
    
    
    
    
    this.blik = blik;
    return this;
  }

   /**
   * Get blik
   * @return blik
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BlikRequest getBlik() {
    return blik;
  }


  public void setBlik(BlikRequest blik) {
    
    
    
    this.blik = blik;
  }


  public PaymentSource eps(EpsRequest eps) {
    
    
    
    
    this.eps = eps;
    return this;
  }

   /**
   * Get eps
   * @return eps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EpsRequest getEps() {
    return eps;
  }


  public void setEps(EpsRequest eps) {
    
    
    
    this.eps = eps;
  }


  public PaymentSource giropay(GiropayRequest giropay) {
    
    
    
    
    this.giropay = giropay;
    return this;
  }

   /**
   * Get giropay
   * @return giropay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GiropayRequest getGiropay() {
    return giropay;
  }


  public void setGiropay(GiropayRequest giropay) {
    
    
    
    this.giropay = giropay;
  }


  public PaymentSource ideal(IdealRequest ideal) {
    
    
    
    
    this.ideal = ideal;
    return this;
  }

   /**
   * Get ideal
   * @return ideal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdealRequest getIdeal() {
    return ideal;
  }


  public void setIdeal(IdealRequest ideal) {
    
    
    
    this.ideal = ideal;
  }


  public PaymentSource mybank(MybankRequest mybank) {
    
    
    
    
    this.mybank = mybank;
    return this;
  }

   /**
   * Get mybank
   * @return mybank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MybankRequest getMybank() {
    return mybank;
  }


  public void setMybank(MybankRequest mybank) {
    
    
    
    this.mybank = mybank;
  }


  public PaymentSource p24(P24Request p24) {
    
    
    
    
    this.p24 = p24;
    return this;
  }

   /**
   * Get p24
   * @return p24
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public P24Request getP24() {
    return p24;
  }


  public void setP24(P24Request p24) {
    
    
    
    this.p24 = p24;
  }


  public PaymentSource sofort(SofortRequest sofort) {
    
    
    
    
    this.sofort = sofort;
    return this;
  }

   /**
   * Get sofort
   * @return sofort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SofortRequest getSofort() {
    return sofort;
  }


  public void setSofort(SofortRequest sofort) {
    
    
    
    this.sofort = sofort;
  }


  public PaymentSource trustly(TrustlyRequest trustly) {
    
    
    
    
    this.trustly = trustly;
    return this;
  }

   /**
   * Get trustly
   * @return trustly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TrustlyRequest getTrustly() {
    return trustly;
  }


  public void setTrustly(TrustlyRequest trustly) {
    
    
    
    this.trustly = trustly;
  }


  public PaymentSource applePay(ApplePayRequest applePay) {
    
    
    
    
    this.applePay = applePay;
    return this;
  }

   /**
   * Get applePay
   * @return applePay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ApplePayRequest getApplePay() {
    return applePay;
  }


  public void setApplePay(ApplePayRequest applePay) {
    
    
    
    this.applePay = applePay;
  }


  public PaymentSource googlePay(Object googlePay) {
    
    
    
    
    this.googlePay = googlePay;
    return this;
  }

   /**
   * Get googlePay
   * @return googlePay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getGooglePay() {
    return googlePay;
  }


  public void setGooglePay(Object googlePay) {
    
    
    
    this.googlePay = googlePay;
  }


  public PaymentSource venmo(VenmoWalletRequest venmo) {
    
    
    
    
    this.venmo = venmo;
    return this;
  }

   /**
   * Get venmo
   * @return venmo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VenmoWalletRequest getVenmo() {
    return venmo;
  }


  public void setVenmo(VenmoWalletRequest venmo) {
    
    
    
    this.venmo = venmo;
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
   * @return the PaymentSource instance itself
   */
  public PaymentSource putAdditionalProperty(String key, Object value) {
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
    PaymentSource paymentSource = (PaymentSource) o;
    return Objects.equals(this.card, paymentSource.card) &&
        Objects.equals(this.token, paymentSource.token) &&
        Objects.equals(this.paypal, paymentSource.paypal) &&
        Objects.equals(this.bancontact, paymentSource.bancontact) &&
        Objects.equals(this.blik, paymentSource.blik) &&
        Objects.equals(this.eps, paymentSource.eps) &&
        Objects.equals(this.giropay, paymentSource.giropay) &&
        Objects.equals(this.ideal, paymentSource.ideal) &&
        Objects.equals(this.mybank, paymentSource.mybank) &&
        Objects.equals(this.p24, paymentSource.p24) &&
        Objects.equals(this.sofort, paymentSource.sofort) &&
        Objects.equals(this.trustly, paymentSource.trustly) &&
        Objects.equals(this.applePay, paymentSource.applePay) &&
        Objects.equals(this.googlePay, paymentSource.googlePay) &&
        Objects.equals(this.venmo, paymentSource.venmo)&&
        Objects.equals(this.additionalProperties, paymentSource.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, token, paypal, bancontact, blik, eps, giropay, ideal, mybank, p24, sofort, trustly, applePay, googlePay, venmo, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSource {\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    paypal: ").append(toIndentedString(paypal)).append("\n");
    sb.append("    bancontact: ").append(toIndentedString(bancontact)).append("\n");
    sb.append("    blik: ").append(toIndentedString(blik)).append("\n");
    sb.append("    eps: ").append(toIndentedString(eps)).append("\n");
    sb.append("    giropay: ").append(toIndentedString(giropay)).append("\n");
    sb.append("    ideal: ").append(toIndentedString(ideal)).append("\n");
    sb.append("    mybank: ").append(toIndentedString(mybank)).append("\n");
    sb.append("    p24: ").append(toIndentedString(p24)).append("\n");
    sb.append("    sofort: ").append(toIndentedString(sofort)).append("\n");
    sb.append("    trustly: ").append(toIndentedString(trustly)).append("\n");
    sb.append("    applePay: ").append(toIndentedString(applePay)).append("\n");
    sb.append("    googlePay: ").append(toIndentedString(googlePay)).append("\n");
    sb.append("    venmo: ").append(toIndentedString(venmo)).append("\n");
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
    openapiFields.add("card");
    openapiFields.add("token");
    openapiFields.add("paypal");
    openapiFields.add("bancontact");
    openapiFields.add("blik");
    openapiFields.add("eps");
    openapiFields.add("giropay");
    openapiFields.add("ideal");
    openapiFields.add("mybank");
    openapiFields.add("p24");
    openapiFields.add("sofort");
    openapiFields.add("trustly");
    openapiFields.add("apple_pay");
    openapiFields.add("google_pay");
    openapiFields.add("venmo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentSource
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentSource.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentSource is not found in the empty JSON string", PaymentSource.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `card`
      if (jsonObj.get("card") != null && !jsonObj.get("card").isJsonNull()) {
        CardRequest.validateJsonObject(jsonObj.getAsJsonObject("card"));
      }
      // validate the optional field `token`
      if (jsonObj.get("token") != null && !jsonObj.get("token").isJsonNull()) {
        Token.validateJsonObject(jsonObj.getAsJsonObject("token"));
      }
      // validate the optional field `paypal`
      if (jsonObj.get("paypal") != null && !jsonObj.get("paypal").isJsonNull()) {
        PaypalWallet.validateJsonObject(jsonObj.getAsJsonObject("paypal"));
      }
      // validate the optional field `bancontact`
      if (jsonObj.get("bancontact") != null && !jsonObj.get("bancontact").isJsonNull()) {
        BancontactRequest.validateJsonObject(jsonObj.getAsJsonObject("bancontact"));
      }
      // validate the optional field `blik`
      if (jsonObj.get("blik") != null && !jsonObj.get("blik").isJsonNull()) {
        BlikRequest.validateJsonObject(jsonObj.getAsJsonObject("blik"));
      }
      // validate the optional field `eps`
      if (jsonObj.get("eps") != null && !jsonObj.get("eps").isJsonNull()) {
        EpsRequest.validateJsonObject(jsonObj.getAsJsonObject("eps"));
      }
      // validate the optional field `giropay`
      if (jsonObj.get("giropay") != null && !jsonObj.get("giropay").isJsonNull()) {
        GiropayRequest.validateJsonObject(jsonObj.getAsJsonObject("giropay"));
      }
      // validate the optional field `ideal`
      if (jsonObj.get("ideal") != null && !jsonObj.get("ideal").isJsonNull()) {
        IdealRequest.validateJsonObject(jsonObj.getAsJsonObject("ideal"));
      }
      // validate the optional field `mybank`
      if (jsonObj.get("mybank") != null && !jsonObj.get("mybank").isJsonNull()) {
        MybankRequest.validateJsonObject(jsonObj.getAsJsonObject("mybank"));
      }
      // validate the optional field `p24`
      if (jsonObj.get("p24") != null && !jsonObj.get("p24").isJsonNull()) {
        P24Request.validateJsonObject(jsonObj.getAsJsonObject("p24"));
      }
      // validate the optional field `sofort`
      if (jsonObj.get("sofort") != null && !jsonObj.get("sofort").isJsonNull()) {
        SofortRequest.validateJsonObject(jsonObj.getAsJsonObject("sofort"));
      }
      // validate the optional field `trustly`
      if (jsonObj.get("trustly") != null && !jsonObj.get("trustly").isJsonNull()) {
        TrustlyRequest.validateJsonObject(jsonObj.getAsJsonObject("trustly"));
      }
      // validate the optional field `apple_pay`
      if (jsonObj.get("apple_pay") != null && !jsonObj.get("apple_pay").isJsonNull()) {
        ApplePayRequest.validateJsonObject(jsonObj.getAsJsonObject("apple_pay"));
      }
      // validate the optional field `venmo`
      if (jsonObj.get("venmo") != null && !jsonObj.get("venmo").isJsonNull()) {
        VenmoWalletRequest.validateJsonObject(jsonObj.getAsJsonObject("venmo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentSource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentSource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentSource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentSource.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentSource>() {
           @Override
           public void write(JsonWriter out, PaymentSource value) throws IOException {
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
           public PaymentSource read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentSource instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentSource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentSource
  * @throws IOException if the JSON string is invalid with respect to PaymentSource
  */
  public static PaymentSource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentSource.class);
  }

 /**
  * Convert an instance of PaymentSource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

