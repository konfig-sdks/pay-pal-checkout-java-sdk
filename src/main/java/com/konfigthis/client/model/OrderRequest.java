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
import com.konfigthis.client.model.CheckoutPaymentIntent;
import com.konfigthis.client.model.OrderApplicationContext;
import com.konfigthis.client.model.Payer;
import com.konfigthis.client.model.PaymentSource;
import com.konfigthis.client.model.PurchaseUnitRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * The order request details.
 */
@ApiModel(description = "The order request details.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OrderRequest {
  public static final String SERIALIZED_NAME_INTENT = "intent";
  @SerializedName(SERIALIZED_NAME_INTENT)
  private CheckoutPaymentIntent intent;

  public static final String SERIALIZED_NAME_PAYER = "payer";
  @SerializedName(SERIALIZED_NAME_PAYER)
  private Payer payer;

  public static final String SERIALIZED_NAME_PURCHASE_UNITS = "purchase_units";
  @SerializedName(SERIALIZED_NAME_PURCHASE_UNITS)
  private List<PurchaseUnitRequest> purchaseUnits = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAYMENT_SOURCE = "payment_source";
  @SerializedName(SERIALIZED_NAME_PAYMENT_SOURCE)
  private PaymentSource paymentSource;

  public static final String SERIALIZED_NAME_APPLICATION_CONTEXT = "application_context";
  @SerializedName(SERIALIZED_NAME_APPLICATION_CONTEXT)
  private OrderApplicationContext applicationContext;

  public OrderRequest() {
  }

  public OrderRequest intent(CheckoutPaymentIntent intent) {
    
    
    
    
    this.intent = intent;
    return this;
  }

   /**
   * Get intent
   * @return intent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CheckoutPaymentIntent getIntent() {
    return intent;
  }


  public void setIntent(CheckoutPaymentIntent intent) {
    
    
    
    this.intent = intent;
  }


  public OrderRequest payer(Payer payer) {
    
    
    
    
    this.payer = payer;
    return this;
  }

   /**
   * Get payer
   * @return payer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Payer getPayer() {
    return payer;
  }


  public void setPayer(Payer payer) {
    
    
    
    this.payer = payer;
  }


  public OrderRequest purchaseUnits(List<PurchaseUnitRequest> purchaseUnits) {
    
    
    
    
    this.purchaseUnits = purchaseUnits;
    return this;
  }

  public OrderRequest addPurchaseUnitsItem(PurchaseUnitRequest purchaseUnitsItem) {
    this.purchaseUnits.add(purchaseUnitsItem);
    return this;
  }

   /**
   * An array of purchase units. Each purchase unit establishes a contract between a payer and the payee. Each purchase unit represents either a full or partial order that the payer intends to purchase from the payee.
   * @return purchaseUnits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "An array of purchase units. Each purchase unit establishes a contract between a payer and the payee. Each purchase unit represents either a full or partial order that the payer intends to purchase from the payee.")

  public List<PurchaseUnitRequest> getPurchaseUnits() {
    return purchaseUnits;
  }


  public void setPurchaseUnits(List<PurchaseUnitRequest> purchaseUnits) {
    
    
    
    this.purchaseUnits = purchaseUnits;
  }


  public OrderRequest paymentSource(PaymentSource paymentSource) {
    
    
    
    
    this.paymentSource = paymentSource;
    return this;
  }

   /**
   * Get paymentSource
   * @return paymentSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentSource getPaymentSource() {
    return paymentSource;
  }


  public void setPaymentSource(PaymentSource paymentSource) {
    
    
    
    this.paymentSource = paymentSource;
  }


  public OrderRequest applicationContext(OrderApplicationContext applicationContext) {
    
    
    
    
    this.applicationContext = applicationContext;
    return this;
  }

   /**
   * Get applicationContext
   * @return applicationContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OrderApplicationContext getApplicationContext() {
    return applicationContext;
  }


  public void setApplicationContext(OrderApplicationContext applicationContext) {
    
    
    
    this.applicationContext = applicationContext;
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
   * @return the OrderRequest instance itself
   */
  public OrderRequest putAdditionalProperty(String key, Object value) {
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
    OrderRequest orderRequest = (OrderRequest) o;
    return Objects.equals(this.intent, orderRequest.intent) &&
        Objects.equals(this.payer, orderRequest.payer) &&
        Objects.equals(this.purchaseUnits, orderRequest.purchaseUnits) &&
        Objects.equals(this.paymentSource, orderRequest.paymentSource) &&
        Objects.equals(this.applicationContext, orderRequest.applicationContext)&&
        Objects.equals(this.additionalProperties, orderRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intent, payer, purchaseUnits, paymentSource, applicationContext, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRequest {\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    purchaseUnits: ").append(toIndentedString(purchaseUnits)).append("\n");
    sb.append("    paymentSource: ").append(toIndentedString(paymentSource)).append("\n");
    sb.append("    applicationContext: ").append(toIndentedString(applicationContext)).append("\n");
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
    openapiFields.add("intent");
    openapiFields.add("payer");
    openapiFields.add("purchase_units");
    openapiFields.add("payment_source");
    openapiFields.add("application_context");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("intent");
    openapiRequiredFields.add("purchase_units");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrderRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderRequest is not found in the empty JSON string", OrderRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `payer`
      if (jsonObj.get("payer") != null && !jsonObj.get("payer").isJsonNull()) {
        Payer.validateJsonObject(jsonObj.getAsJsonObject("payer"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("purchase_units").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `purchase_units` to be an array in the JSON string but got `%s`", jsonObj.get("purchase_units").toString()));
      }

      JsonArray jsonArraypurchaseUnits = jsonObj.getAsJsonArray("purchase_units");
      // validate the required field `purchase_units` (array)
      for (int i = 0; i < jsonArraypurchaseUnits.size(); i++) {
        PurchaseUnitRequest.validateJsonObject(jsonArraypurchaseUnits.get(i).getAsJsonObject());
      };
      // validate the optional field `payment_source`
      if (jsonObj.get("payment_source") != null && !jsonObj.get("payment_source").isJsonNull()) {
        PaymentSource.validateJsonObject(jsonObj.getAsJsonObject("payment_source"));
      }
      // validate the optional field `application_context`
      if (jsonObj.get("application_context") != null && !jsonObj.get("application_context").isJsonNull()) {
        OrderApplicationContext.validateJsonObject(jsonObj.getAsJsonObject("application_context"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderRequest>() {
           @Override
           public void write(JsonWriter out, OrderRequest value) throws IOException {
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
           public OrderRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OrderRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OrderRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderRequest
  * @throws IOException if the JSON string is invalid with respect to OrderRequest
  */
  public static OrderRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderRequest.class);
  }

 /**
  * Convert an instance of OrderRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

