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
import com.konfigthis.client.model.Bancontact;
import com.konfigthis.client.model.Blik;
import com.konfigthis.client.model.CardResponse;
import com.konfigthis.client.model.Eps;
import com.konfigthis.client.model.Giropay;
import com.konfigthis.client.model.Ideal;
import com.konfigthis.client.model.Mybank;
import com.konfigthis.client.model.P24;
import com.konfigthis.client.model.PaypalWalletResponse;
import com.konfigthis.client.model.Sofort;
import com.konfigthis.client.model.Trustly;
import com.konfigthis.client.model.VenmoWalletResponse;
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
 * The payment source used to fund the payment.
 */
@ApiModel(description = "The payment source used to fund the payment.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaymentSourceResponse {
  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private CardResponse card;

  public static final String SERIALIZED_NAME_PAYPAL = "paypal";
  @SerializedName(SERIALIZED_NAME_PAYPAL)
  private PaypalWalletResponse paypal;

  public static final String SERIALIZED_NAME_BANCONTACT = "bancontact";
  @SerializedName(SERIALIZED_NAME_BANCONTACT)
  private Bancontact bancontact;

  public static final String SERIALIZED_NAME_BLIK = "blik";
  @SerializedName(SERIALIZED_NAME_BLIK)
  private Blik blik;

  public static final String SERIALIZED_NAME_EPS = "eps";
  @SerializedName(SERIALIZED_NAME_EPS)
  private Eps eps;

  public static final String SERIALIZED_NAME_GIROPAY = "giropay";
  @SerializedName(SERIALIZED_NAME_GIROPAY)
  private Giropay giropay;

  public static final String SERIALIZED_NAME_IDEAL = "ideal";
  @SerializedName(SERIALIZED_NAME_IDEAL)
  private Ideal ideal;

  public static final String SERIALIZED_NAME_MYBANK = "mybank";
  @SerializedName(SERIALIZED_NAME_MYBANK)
  private Mybank mybank;

  public static final String SERIALIZED_NAME_P24 = "p24";
  @SerializedName(SERIALIZED_NAME_P24)
  private P24 p24;

  public static final String SERIALIZED_NAME_SOFORT = "sofort";
  @SerializedName(SERIALIZED_NAME_SOFORT)
  private Sofort sofort;

  public static final String SERIALIZED_NAME_TRUSTLY = "trustly";
  @SerializedName(SERIALIZED_NAME_TRUSTLY)
  private Trustly trustly;

  public static final String SERIALIZED_NAME_VENMO = "venmo";
  @SerializedName(SERIALIZED_NAME_VENMO)
  private VenmoWalletResponse venmo;

  public PaymentSourceResponse() {
  }

  public PaymentSourceResponse card(CardResponse card) {
    
    
    
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CardResponse getCard() {
    return card;
  }


  public void setCard(CardResponse card) {
    
    
    
    this.card = card;
  }


  public PaymentSourceResponse paypal(PaypalWalletResponse paypal) {
    
    
    
    
    this.paypal = paypal;
    return this;
  }

   /**
   * Get paypal
   * @return paypal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaypalWalletResponse getPaypal() {
    return paypal;
  }


  public void setPaypal(PaypalWalletResponse paypal) {
    
    
    
    this.paypal = paypal;
  }


  public PaymentSourceResponse bancontact(Bancontact bancontact) {
    
    
    
    
    this.bancontact = bancontact;
    return this;
  }

   /**
   * Get bancontact
   * @return bancontact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Bancontact getBancontact() {
    return bancontact;
  }


  public void setBancontact(Bancontact bancontact) {
    
    
    
    this.bancontact = bancontact;
  }


  public PaymentSourceResponse blik(Blik blik) {
    
    
    
    
    this.blik = blik;
    return this;
  }

   /**
   * Get blik
   * @return blik
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Blik getBlik() {
    return blik;
  }


  public void setBlik(Blik blik) {
    
    
    
    this.blik = blik;
  }


  public PaymentSourceResponse eps(Eps eps) {
    
    
    
    
    this.eps = eps;
    return this;
  }

   /**
   * Get eps
   * @return eps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Eps getEps() {
    return eps;
  }


  public void setEps(Eps eps) {
    
    
    
    this.eps = eps;
  }


  public PaymentSourceResponse giropay(Giropay giropay) {
    
    
    
    
    this.giropay = giropay;
    return this;
  }

   /**
   * Get giropay
   * @return giropay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Giropay getGiropay() {
    return giropay;
  }


  public void setGiropay(Giropay giropay) {
    
    
    
    this.giropay = giropay;
  }


  public PaymentSourceResponse ideal(Ideal ideal) {
    
    
    
    
    this.ideal = ideal;
    return this;
  }

   /**
   * Get ideal
   * @return ideal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Ideal getIdeal() {
    return ideal;
  }


  public void setIdeal(Ideal ideal) {
    
    
    
    this.ideal = ideal;
  }


  public PaymentSourceResponse mybank(Mybank mybank) {
    
    
    
    
    this.mybank = mybank;
    return this;
  }

   /**
   * Get mybank
   * @return mybank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Mybank getMybank() {
    return mybank;
  }


  public void setMybank(Mybank mybank) {
    
    
    
    this.mybank = mybank;
  }


  public PaymentSourceResponse p24(P24 p24) {
    
    
    
    
    this.p24 = p24;
    return this;
  }

   /**
   * Get p24
   * @return p24
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public P24 getP24() {
    return p24;
  }


  public void setP24(P24 p24) {
    
    
    
    this.p24 = p24;
  }


  public PaymentSourceResponse sofort(Sofort sofort) {
    
    
    
    
    this.sofort = sofort;
    return this;
  }

   /**
   * Get sofort
   * @return sofort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Sofort getSofort() {
    return sofort;
  }


  public void setSofort(Sofort sofort) {
    
    
    
    this.sofort = sofort;
  }


  public PaymentSourceResponse trustly(Trustly trustly) {
    
    
    
    
    this.trustly = trustly;
    return this;
  }

   /**
   * Get trustly
   * @return trustly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Trustly getTrustly() {
    return trustly;
  }


  public void setTrustly(Trustly trustly) {
    
    
    
    this.trustly = trustly;
  }


  public PaymentSourceResponse venmo(VenmoWalletResponse venmo) {
    
    
    
    
    this.venmo = venmo;
    return this;
  }

   /**
   * Get venmo
   * @return venmo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VenmoWalletResponse getVenmo() {
    return venmo;
  }


  public void setVenmo(VenmoWalletResponse venmo) {
    
    
    
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
   * @return the PaymentSourceResponse instance itself
   */
  public PaymentSourceResponse putAdditionalProperty(String key, Object value) {
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
    PaymentSourceResponse paymentSourceResponse = (PaymentSourceResponse) o;
    return Objects.equals(this.card, paymentSourceResponse.card) &&
        Objects.equals(this.paypal, paymentSourceResponse.paypal) &&
        Objects.equals(this.bancontact, paymentSourceResponse.bancontact) &&
        Objects.equals(this.blik, paymentSourceResponse.blik) &&
        Objects.equals(this.eps, paymentSourceResponse.eps) &&
        Objects.equals(this.giropay, paymentSourceResponse.giropay) &&
        Objects.equals(this.ideal, paymentSourceResponse.ideal) &&
        Objects.equals(this.mybank, paymentSourceResponse.mybank) &&
        Objects.equals(this.p24, paymentSourceResponse.p24) &&
        Objects.equals(this.sofort, paymentSourceResponse.sofort) &&
        Objects.equals(this.trustly, paymentSourceResponse.trustly) &&
        Objects.equals(this.venmo, paymentSourceResponse.venmo)&&
        Objects.equals(this.additionalProperties, paymentSourceResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(card, paypal, bancontact, blik, eps, giropay, ideal, mybank, p24, sofort, trustly, venmo, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSourceResponse {\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
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
    openapiFields.add("venmo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaymentSourceResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaymentSourceResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaymentSourceResponse is not found in the empty JSON string", PaymentSourceResponse.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `card`
      if (jsonObj.get("card") != null && !jsonObj.get("card").isJsonNull()) {
        CardResponse.validateJsonObject(jsonObj.getAsJsonObject("card"));
      }
      // validate the optional field `paypal`
      if (jsonObj.get("paypal") != null && !jsonObj.get("paypal").isJsonNull()) {
        PaypalWalletResponse.validateJsonObject(jsonObj.getAsJsonObject("paypal"));
      }
      // validate the optional field `bancontact`
      if (jsonObj.get("bancontact") != null && !jsonObj.get("bancontact").isJsonNull()) {
        Bancontact.validateJsonObject(jsonObj.getAsJsonObject("bancontact"));
      }
      // validate the optional field `blik`
      if (jsonObj.get("blik") != null && !jsonObj.get("blik").isJsonNull()) {
        Blik.validateJsonObject(jsonObj.getAsJsonObject("blik"));
      }
      // validate the optional field `eps`
      if (jsonObj.get("eps") != null && !jsonObj.get("eps").isJsonNull()) {
        Eps.validateJsonObject(jsonObj.getAsJsonObject("eps"));
      }
      // validate the optional field `giropay`
      if (jsonObj.get("giropay") != null && !jsonObj.get("giropay").isJsonNull()) {
        Giropay.validateJsonObject(jsonObj.getAsJsonObject("giropay"));
      }
      // validate the optional field `ideal`
      if (jsonObj.get("ideal") != null && !jsonObj.get("ideal").isJsonNull()) {
        Ideal.validateJsonObject(jsonObj.getAsJsonObject("ideal"));
      }
      // validate the optional field `mybank`
      if (jsonObj.get("mybank") != null && !jsonObj.get("mybank").isJsonNull()) {
        Mybank.validateJsonObject(jsonObj.getAsJsonObject("mybank"));
      }
      // validate the optional field `p24`
      if (jsonObj.get("p24") != null && !jsonObj.get("p24").isJsonNull()) {
        P24.validateJsonObject(jsonObj.getAsJsonObject("p24"));
      }
      // validate the optional field `sofort`
      if (jsonObj.get("sofort") != null && !jsonObj.get("sofort").isJsonNull()) {
        Sofort.validateJsonObject(jsonObj.getAsJsonObject("sofort"));
      }
      // validate the optional field `trustly`
      if (jsonObj.get("trustly") != null && !jsonObj.get("trustly").isJsonNull()) {
        Trustly.validateJsonObject(jsonObj.getAsJsonObject("trustly"));
      }
      // validate the optional field `venmo`
      if (jsonObj.get("venmo") != null && !jsonObj.get("venmo").isJsonNull()) {
        VenmoWalletResponse.validateJsonObject(jsonObj.getAsJsonObject("venmo"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaymentSourceResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaymentSourceResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaymentSourceResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaymentSourceResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PaymentSourceResponse>() {
           @Override
           public void write(JsonWriter out, PaymentSourceResponse value) throws IOException {
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
           public PaymentSourceResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaymentSourceResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaymentSourceResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaymentSourceResponse
  * @throws IOException if the JSON string is invalid with respect to PaymentSourceResponse
  */
  public static PaymentSourceResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaymentSourceResponse.class);
  }

 /**
  * Convert an instance of PaymentSourceResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

