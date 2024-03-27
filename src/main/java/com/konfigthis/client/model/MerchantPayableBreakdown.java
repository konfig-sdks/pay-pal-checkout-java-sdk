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
import com.konfigthis.client.model.Money;
import com.konfigthis.client.model.NetAmountBreakdownItem;
import com.konfigthis.client.model.PlatformFee;
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
 * The breakdown of the refund.
 */
@ApiModel(description = "The breakdown of the refund.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MerchantPayableBreakdown {
  public static final String SERIALIZED_NAME_GROSS_AMOUNT = "gross_amount";
  @SerializedName(SERIALIZED_NAME_GROSS_AMOUNT)
  private Money grossAmount;

  public static final String SERIALIZED_NAME_PAYPAL_FEE = "paypal_fee";
  @SerializedName(SERIALIZED_NAME_PAYPAL_FEE)
  private Money paypalFee;

  public static final String SERIALIZED_NAME_PAYPAL_FEE_IN_RECEIVABLE_CURRENCY = "paypal_fee_in_receivable_currency";
  @SerializedName(SERIALIZED_NAME_PAYPAL_FEE_IN_RECEIVABLE_CURRENCY)
  private Money paypalFeeInReceivableCurrency;

  public static final String SERIALIZED_NAME_NET_AMOUNT = "net_amount";
  @SerializedName(SERIALIZED_NAME_NET_AMOUNT)
  private Money netAmount;

  public static final String SERIALIZED_NAME_NET_AMOUNT_IN_RECEIVABLE_CURRENCY = "net_amount_in_receivable_currency";
  @SerializedName(SERIALIZED_NAME_NET_AMOUNT_IN_RECEIVABLE_CURRENCY)
  private Money netAmountInReceivableCurrency;

  public static final String SERIALIZED_NAME_PLATFORM_FEES = "platform_fees";
  @SerializedName(SERIALIZED_NAME_PLATFORM_FEES)
  private List<PlatformFee> platformFees = null;

  public static final String SERIALIZED_NAME_NET_AMOUNT_BREAKDOWN = "net_amount_breakdown";
  @SerializedName(SERIALIZED_NAME_NET_AMOUNT_BREAKDOWN)
  private List<NetAmountBreakdownItem> netAmountBreakdown = null;

  public static final String SERIALIZED_NAME_TOTAL_REFUNDED_AMOUNT = "total_refunded_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_REFUNDED_AMOUNT)
  private Money totalRefundedAmount;

  public MerchantPayableBreakdown() {
  }

  
  public MerchantPayableBreakdown(
     List<NetAmountBreakdownItem> netAmountBreakdown
  ) {
    this();
    this.netAmountBreakdown = netAmountBreakdown;
  }

  public MerchantPayableBreakdown grossAmount(Money grossAmount) {
    
    
    
    
    this.grossAmount = grossAmount;
    return this;
  }

   /**
   * Get grossAmount
   * @return grossAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getGrossAmount() {
    return grossAmount;
  }


  public void setGrossAmount(Money grossAmount) {
    
    
    
    this.grossAmount = grossAmount;
  }


  public MerchantPayableBreakdown paypalFee(Money paypalFee) {
    
    
    
    
    this.paypalFee = paypalFee;
    return this;
  }

   /**
   * Get paypalFee
   * @return paypalFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getPaypalFee() {
    return paypalFee;
  }


  public void setPaypalFee(Money paypalFee) {
    
    
    
    this.paypalFee = paypalFee;
  }


  public MerchantPayableBreakdown paypalFeeInReceivableCurrency(Money paypalFeeInReceivableCurrency) {
    
    
    
    
    this.paypalFeeInReceivableCurrency = paypalFeeInReceivableCurrency;
    return this;
  }

   /**
   * Get paypalFeeInReceivableCurrency
   * @return paypalFeeInReceivableCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getPaypalFeeInReceivableCurrency() {
    return paypalFeeInReceivableCurrency;
  }


  public void setPaypalFeeInReceivableCurrency(Money paypalFeeInReceivableCurrency) {
    
    
    
    this.paypalFeeInReceivableCurrency = paypalFeeInReceivableCurrency;
  }


  public MerchantPayableBreakdown netAmount(Money netAmount) {
    
    
    
    
    this.netAmount = netAmount;
    return this;
  }

   /**
   * Get netAmount
   * @return netAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getNetAmount() {
    return netAmount;
  }


  public void setNetAmount(Money netAmount) {
    
    
    
    this.netAmount = netAmount;
  }


  public MerchantPayableBreakdown netAmountInReceivableCurrency(Money netAmountInReceivableCurrency) {
    
    
    
    
    this.netAmountInReceivableCurrency = netAmountInReceivableCurrency;
    return this;
  }

   /**
   * Get netAmountInReceivableCurrency
   * @return netAmountInReceivableCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getNetAmountInReceivableCurrency() {
    return netAmountInReceivableCurrency;
  }


  public void setNetAmountInReceivableCurrency(Money netAmountInReceivableCurrency) {
    
    
    
    this.netAmountInReceivableCurrency = netAmountInReceivableCurrency;
  }


  public MerchantPayableBreakdown platformFees(List<PlatformFee> platformFees) {
    
    
    
    
    this.platformFees = platformFees;
    return this;
  }

  public MerchantPayableBreakdown addPlatformFeesItem(PlatformFee platformFeesItem) {
    if (this.platformFees == null) {
      this.platformFees = new ArrayList<>();
    }
    this.platformFees.add(platformFeesItem);
    return this;
  }

   /**
   * An array of platform or partner fees, commissions, or brokerage fees for the refund.
   * @return platformFees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of platform or partner fees, commissions, or brokerage fees for the refund.")

  public List<PlatformFee> getPlatformFees() {
    return platformFees;
  }


  public void setPlatformFees(List<PlatformFee> platformFees) {
    
    
    
    this.platformFees = platformFees;
  }


   /**
   * An array of breakdown values for the net amount. Returned when the currency of the refund is different from the currency of the PayPal account where the payee holds their funds.
   * @return netAmountBreakdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of breakdown values for the net amount. Returned when the currency of the refund is different from the currency of the PayPal account where the payee holds their funds.")

  public List<NetAmountBreakdownItem> getNetAmountBreakdown() {
    return netAmountBreakdown;
  }




  public MerchantPayableBreakdown totalRefundedAmount(Money totalRefundedAmount) {
    
    
    
    
    this.totalRefundedAmount = totalRefundedAmount;
    return this;
  }

   /**
   * Get totalRefundedAmount
   * @return totalRefundedAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getTotalRefundedAmount() {
    return totalRefundedAmount;
  }


  public void setTotalRefundedAmount(Money totalRefundedAmount) {
    
    
    
    this.totalRefundedAmount = totalRefundedAmount;
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
   * @return the MerchantPayableBreakdown instance itself
   */
  public MerchantPayableBreakdown putAdditionalProperty(String key, Object value) {
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
    MerchantPayableBreakdown merchantPayableBreakdown = (MerchantPayableBreakdown) o;
    return Objects.equals(this.grossAmount, merchantPayableBreakdown.grossAmount) &&
        Objects.equals(this.paypalFee, merchantPayableBreakdown.paypalFee) &&
        Objects.equals(this.paypalFeeInReceivableCurrency, merchantPayableBreakdown.paypalFeeInReceivableCurrency) &&
        Objects.equals(this.netAmount, merchantPayableBreakdown.netAmount) &&
        Objects.equals(this.netAmountInReceivableCurrency, merchantPayableBreakdown.netAmountInReceivableCurrency) &&
        Objects.equals(this.platformFees, merchantPayableBreakdown.platformFees) &&
        Objects.equals(this.netAmountBreakdown, merchantPayableBreakdown.netAmountBreakdown) &&
        Objects.equals(this.totalRefundedAmount, merchantPayableBreakdown.totalRefundedAmount)&&
        Objects.equals(this.additionalProperties, merchantPayableBreakdown.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grossAmount, paypalFee, paypalFeeInReceivableCurrency, netAmount, netAmountInReceivableCurrency, platformFees, netAmountBreakdown, totalRefundedAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantPayableBreakdown {\n");
    sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
    sb.append("    paypalFee: ").append(toIndentedString(paypalFee)).append("\n");
    sb.append("    paypalFeeInReceivableCurrency: ").append(toIndentedString(paypalFeeInReceivableCurrency)).append("\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
    sb.append("    netAmountInReceivableCurrency: ").append(toIndentedString(netAmountInReceivableCurrency)).append("\n");
    sb.append("    platformFees: ").append(toIndentedString(platformFees)).append("\n");
    sb.append("    netAmountBreakdown: ").append(toIndentedString(netAmountBreakdown)).append("\n");
    sb.append("    totalRefundedAmount: ").append(toIndentedString(totalRefundedAmount)).append("\n");
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
    openapiFields.add("gross_amount");
    openapiFields.add("paypal_fee");
    openapiFields.add("paypal_fee_in_receivable_currency");
    openapiFields.add("net_amount");
    openapiFields.add("net_amount_in_receivable_currency");
    openapiFields.add("platform_fees");
    openapiFields.add("net_amount_breakdown");
    openapiFields.add("total_refunded_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MerchantPayableBreakdown
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MerchantPayableBreakdown.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MerchantPayableBreakdown is not found in the empty JSON string", MerchantPayableBreakdown.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `gross_amount`
      if (jsonObj.get("gross_amount") != null && !jsonObj.get("gross_amount").isJsonNull()) {
        Money.validateJsonObject(jsonObj.getAsJsonObject("gross_amount"));
      }
      // validate the optional field `paypal_fee`
      if (jsonObj.get("paypal_fee") != null && !jsonObj.get("paypal_fee").isJsonNull()) {
        Money.validateJsonObject(jsonObj.getAsJsonObject("paypal_fee"));
      }
      // validate the optional field `paypal_fee_in_receivable_currency`
      if (jsonObj.get("paypal_fee_in_receivable_currency") != null && !jsonObj.get("paypal_fee_in_receivable_currency").isJsonNull()) {
        Money.validateJsonObject(jsonObj.getAsJsonObject("paypal_fee_in_receivable_currency"));
      }
      // validate the optional field `net_amount`
      if (jsonObj.get("net_amount") != null && !jsonObj.get("net_amount").isJsonNull()) {
        Money.validateJsonObject(jsonObj.getAsJsonObject("net_amount"));
      }
      // validate the optional field `net_amount_in_receivable_currency`
      if (jsonObj.get("net_amount_in_receivable_currency") != null && !jsonObj.get("net_amount_in_receivable_currency").isJsonNull()) {
        Money.validateJsonObject(jsonObj.getAsJsonObject("net_amount_in_receivable_currency"));
      }
      if (jsonObj.get("platform_fees") != null && !jsonObj.get("platform_fees").isJsonNull()) {
        JsonArray jsonArrayplatformFees = jsonObj.getAsJsonArray("platform_fees");
        if (jsonArrayplatformFees != null) {
          // ensure the json data is an array
          if (!jsonObj.get("platform_fees").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `platform_fees` to be an array in the JSON string but got `%s`", jsonObj.get("platform_fees").toString()));
          }

          // validate the optional field `platform_fees` (array)
          for (int i = 0; i < jsonArrayplatformFees.size(); i++) {
            PlatformFee.validateJsonObject(jsonArrayplatformFees.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("net_amount_breakdown") != null && !jsonObj.get("net_amount_breakdown").isJsonNull()) {
        JsonArray jsonArraynetAmountBreakdown = jsonObj.getAsJsonArray("net_amount_breakdown");
        if (jsonArraynetAmountBreakdown != null) {
          // ensure the json data is an array
          if (!jsonObj.get("net_amount_breakdown").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `net_amount_breakdown` to be an array in the JSON string but got `%s`", jsonObj.get("net_amount_breakdown").toString()));
          }

          // validate the optional field `net_amount_breakdown` (array)
          for (int i = 0; i < jsonArraynetAmountBreakdown.size(); i++) {
            NetAmountBreakdownItem.validateJsonObject(jsonArraynetAmountBreakdown.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `total_refunded_amount`
      if (jsonObj.get("total_refunded_amount") != null && !jsonObj.get("total_refunded_amount").isJsonNull()) {
        Money.validateJsonObject(jsonObj.getAsJsonObject("total_refunded_amount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MerchantPayableBreakdown.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MerchantPayableBreakdown' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MerchantPayableBreakdown> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MerchantPayableBreakdown.class));

       return (TypeAdapter<T>) new TypeAdapter<MerchantPayableBreakdown>() {
           @Override
           public void write(JsonWriter out, MerchantPayableBreakdown value) throws IOException {
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
           public MerchantPayableBreakdown read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MerchantPayableBreakdown instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MerchantPayableBreakdown given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MerchantPayableBreakdown
  * @throws IOException if the JSON string is invalid with respect to MerchantPayableBreakdown
  */
  public static MerchantPayableBreakdown fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MerchantPayableBreakdown.class);
  }

 /**
  * Convert an instance of MerchantPayableBreakdown to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

