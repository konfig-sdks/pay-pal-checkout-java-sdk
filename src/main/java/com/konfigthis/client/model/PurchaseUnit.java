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
import com.konfigthis.client.model.AmountWithBreakdown;
import com.konfigthis.client.model.Item;
import com.konfigthis.client.model.Payee;
import com.konfigthis.client.model.PaymentCollection;
import com.konfigthis.client.model.PaymentInstruction;
import com.konfigthis.client.model.ShippingWithTrackingDetails;
import com.konfigthis.client.model.SupplementaryData;
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
 * The purchase unit details. Used to capture required information for the payment contract.
 */
@ApiModel(description = "The purchase unit details. Used to capture required information for the payment contract.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PurchaseUnit {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_REFERENCE_ID = "reference_id";
  @SerializedName(SERIALIZED_NAME_REFERENCE_ID)
  private String referenceId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private AmountWithBreakdown amount;

  public static final String SERIALIZED_NAME_PAYEE = "payee";
  @SerializedName(SERIALIZED_NAME_PAYEE)
  private Payee payee;

  public static final String SERIALIZED_NAME_PAYMENT_INSTRUCTION = "payment_instruction";
  @SerializedName(SERIALIZED_NAME_PAYMENT_INSTRUCTION)
  private PaymentInstruction paymentInstruction;

  public static final String SERIALIZED_NAME_CUSTOM_ID = "custom_id";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ID)
  private String customId;

  public static final String SERIALIZED_NAME_INVOICE_ID = "invoice_id";
  @SerializedName(SERIALIZED_NAME_INVOICE_ID)
  private String invoiceId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SOFT_DESCRIPTOR = "soft_descriptor";
  @SerializedName(SERIALIZED_NAME_SOFT_DESCRIPTOR)
  private String softDescriptor;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<Item> items = null;

  public static final String SERIALIZED_NAME_SHIPPING = "shipping";
  @SerializedName(SERIALIZED_NAME_SHIPPING)
  private ShippingWithTrackingDetails shipping;

  public static final String SERIALIZED_NAME_SUPPLEMENTARY_DATA = "supplementary_data";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTARY_DATA)
  private SupplementaryData supplementaryData;

  public static final String SERIALIZED_NAME_PAYMENTS = "payments";
  @SerializedName(SERIALIZED_NAME_PAYMENTS)
  private PaymentCollection payments;

  public PurchaseUnit() {
  }

  public PurchaseUnit description(String description) {
    
    
    if (description != null && description.length() < 1) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 1.");
    }
    
    this.description = description;
    return this;
  }

   /**
   * The purchase description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The purchase description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    if (description != null && description.length() < 1) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 1.");
    }
    this.description = description;
  }


  public PurchaseUnit referenceId(String referenceId) {
    
    
    if (referenceId != null && referenceId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for referenceId. Length must be greater than or equal to 1.");
    }
    
    this.referenceId = referenceId;
    return this;
  }

   /**
   * The API caller-provided external ID for the purchase unit. Required for multiple purchase units when you must update the order through &#x60;PATCH&#x60;. If you omit this value and the order contains only one purchase unit, PayPal sets this value to &#x60;default&#x60;. &lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; If there are multiple purchase units, &lt;code&gt;reference_id&lt;/code&gt; is required for each purchase unit.&lt;/blockquote&gt;
   * @return referenceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The API caller-provided external ID for the purchase unit. Required for multiple purchase units when you must update the order through `PATCH`. If you omit this value and the order contains only one purchase unit, PayPal sets this value to `default`. <blockquote><strong>Note:</strong> If there are multiple purchase units, <code>reference_id</code> is required for each purchase unit.</blockquote>")

  public String getReferenceId() {
    return referenceId;
  }


  public void setReferenceId(String referenceId) {
    
    
    if (referenceId != null && referenceId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for referenceId. Length must be greater than or equal to 1.");
    }
    this.referenceId = referenceId;
  }


  public PurchaseUnit amount(AmountWithBreakdown amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AmountWithBreakdown getAmount() {
    return amount;
  }


  public void setAmount(AmountWithBreakdown amount) {
    
    
    
    this.amount = amount;
  }


  public PurchaseUnit payee(Payee payee) {
    
    
    
    
    this.payee = payee;
    return this;
  }

   /**
   * Get payee
   * @return payee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Payee getPayee() {
    return payee;
  }


  public void setPayee(Payee payee) {
    
    
    
    this.payee = payee;
  }


  public PurchaseUnit paymentInstruction(PaymentInstruction paymentInstruction) {
    
    
    
    
    this.paymentInstruction = paymentInstruction;
    return this;
  }

   /**
   * Get paymentInstruction
   * @return paymentInstruction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentInstruction getPaymentInstruction() {
    return paymentInstruction;
  }


  public void setPaymentInstruction(PaymentInstruction paymentInstruction) {
    
    
    
    this.paymentInstruction = paymentInstruction;
  }


  public PurchaseUnit customId(String customId) {
    
    
    if (customId != null && customId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for customId. Length must be greater than or equal to 1.");
    }
    
    this.customId = customId;
    return this;
  }

   /**
   * The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports.
   * @return customId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports.")

  public String getCustomId() {
    return customId;
  }


  public void setCustomId(String customId) {
    
    
    if (customId != null && customId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for customId. Length must be greater than or equal to 1.");
    }
    this.customId = customId;
  }


  public PurchaseUnit invoiceId(String invoiceId) {
    
    
    if (invoiceId != null && invoiceId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for invoiceId. Length must be greater than or equal to 1.");
    }
    
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The API caller-provided external invoice ID for this order.
   * @return invoiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The API caller-provided external invoice ID for this order.")

  public String getInvoiceId() {
    return invoiceId;
  }


  public void setInvoiceId(String invoiceId) {
    
    
    if (invoiceId != null && invoiceId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for invoiceId. Length must be greater than or equal to 1.");
    }
    this.invoiceId = invoiceId;
  }


  public PurchaseUnit id(String id) {
    
    
    if (id != null && id.length() < 1) {
      throw new IllegalArgumentException("Invalid value for id. Length must be greater than or equal to 1.");
    }
    
    this.id = id;
    return this;
  }

   /**
   * The PayPal-generated ID for the purchase unit. This ID appears in both the payer&#39;s transaction history and the emails that the payer receives. In addition, this ID is available in transaction and settlement reports that merchants and API callers can use to reconcile transactions. This ID is only available when an order is saved by calling &lt;code&gt;v2/checkout/orders/id/save&lt;/code&gt;.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The PayPal-generated ID for the purchase unit. This ID appears in both the payer's transaction history and the emails that the payer receives. In addition, this ID is available in transaction and settlement reports that merchants and API callers can use to reconcile transactions. This ID is only available when an order is saved by calling <code>v2/checkout/orders/id/save</code>.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    if (id != null && id.length() < 1) {
      throw new IllegalArgumentException("Invalid value for id. Length must be greater than or equal to 1.");
    }
    this.id = id;
  }


  public PurchaseUnit softDescriptor(String softDescriptor) {
    
    
    if (softDescriptor != null && softDescriptor.length() < 1) {
      throw new IllegalArgumentException("Invalid value for softDescriptor. Length must be greater than or equal to 1.");
    }
    
    this.softDescriptor = softDescriptor;
    return this;
  }

   /**
   * The payment descriptor on account transactions on the customer&#39;s credit card statement, that PayPal sends to processors. The maximum length of the soft descriptor information that you can pass in the API field is 22 characters, in the following format:&lt;code&gt;22 - len(PAYPAL * (8)) - len(&lt;var&gt;Descriptor in Payment Receiving Preferences of Merchant account&lt;/var&gt; + 1)&lt;/code&gt;The PAYPAL prefix uses 8 characters.&lt;br/&gt;&lt;br/&gt;The soft descriptor supports the following ASCII characters:&lt;ul&gt;&lt;li&gt;Alphanumeric characters&lt;/li&gt;&lt;li&gt;Dashes&lt;/li&gt;&lt;li&gt;Asterisks&lt;/li&gt;&lt;li&gt;Periods (.)&lt;/li&gt;&lt;li&gt;Spaces&lt;/li&gt;&lt;/ul&gt;For Wallet payments marketplace integrations:&lt;ul&gt;&lt;li&gt;The merchant descriptor in the Payment Receiving Preferences must be the marketplace name.&lt;/li&gt;&lt;li&gt;You can&#39;t use the remaining space to show the customer service number.&lt;/li&gt;&lt;li&gt;The remaining spaces can be a combination of seller name and country.&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;For unbranded payments (Direct Card) marketplace integrations, use a combination of the seller name and phone number.
   * @return softDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payment descriptor on account transactions on the customer's credit card statement, that PayPal sends to processors. The maximum length of the soft descriptor information that you can pass in the API field is 22 characters, in the following format:<code>22 - len(PAYPAL * (8)) - len(<var>Descriptor in Payment Receiving Preferences of Merchant account</var> + 1)</code>The PAYPAL prefix uses 8 characters.<br/><br/>The soft descriptor supports the following ASCII characters:<ul><li>Alphanumeric characters</li><li>Dashes</li><li>Asterisks</li><li>Periods (.)</li><li>Spaces</li></ul>For Wallet payments marketplace integrations:<ul><li>The merchant descriptor in the Payment Receiving Preferences must be the marketplace name.</li><li>You can't use the remaining space to show the customer service number.</li><li>The remaining spaces can be a combination of seller name and country.</li></ul><br/>For unbranded payments (Direct Card) marketplace integrations, use a combination of the seller name and phone number.")

  public String getSoftDescriptor() {
    return softDescriptor;
  }


  public void setSoftDescriptor(String softDescriptor) {
    
    
    if (softDescriptor != null && softDescriptor.length() < 1) {
      throw new IllegalArgumentException("Invalid value for softDescriptor. Length must be greater than or equal to 1.");
    }
    this.softDescriptor = softDescriptor;
  }


  public PurchaseUnit items(List<Item> items) {
    
    
    
    
    this.items = items;
    return this;
  }

  public PurchaseUnit addItemsItem(Item itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * An array of items that the customer purchases from the merchant.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of items that the customer purchases from the merchant.")

  public List<Item> getItems() {
    return items;
  }


  public void setItems(List<Item> items) {
    
    
    
    this.items = items;
  }


  public PurchaseUnit shipping(ShippingWithTrackingDetails shipping) {
    
    
    
    
    this.shipping = shipping;
    return this;
  }

   /**
   * Get shipping
   * @return shipping
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShippingWithTrackingDetails getShipping() {
    return shipping;
  }


  public void setShipping(ShippingWithTrackingDetails shipping) {
    
    
    
    this.shipping = shipping;
  }


  public PurchaseUnit supplementaryData(SupplementaryData supplementaryData) {
    
    
    
    
    this.supplementaryData = supplementaryData;
    return this;
  }

   /**
   * Get supplementaryData
   * @return supplementaryData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SupplementaryData getSupplementaryData() {
    return supplementaryData;
  }


  public void setSupplementaryData(SupplementaryData supplementaryData) {
    
    
    
    this.supplementaryData = supplementaryData;
  }


  public PurchaseUnit payments(PaymentCollection payments) {
    
    
    
    
    this.payments = payments;
    return this;
  }

   /**
   * Get payments
   * @return payments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentCollection getPayments() {
    return payments;
  }


  public void setPayments(PaymentCollection payments) {
    
    
    
    this.payments = payments;
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
   * @return the PurchaseUnit instance itself
   */
  public PurchaseUnit putAdditionalProperty(String key, Object value) {
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
    PurchaseUnit purchaseUnit = (PurchaseUnit) o;
    return Objects.equals(this.description, purchaseUnit.description) &&
        Objects.equals(this.referenceId, purchaseUnit.referenceId) &&
        Objects.equals(this.amount, purchaseUnit.amount) &&
        Objects.equals(this.payee, purchaseUnit.payee) &&
        Objects.equals(this.paymentInstruction, purchaseUnit.paymentInstruction) &&
        Objects.equals(this.customId, purchaseUnit.customId) &&
        Objects.equals(this.invoiceId, purchaseUnit.invoiceId) &&
        Objects.equals(this.id, purchaseUnit.id) &&
        Objects.equals(this.softDescriptor, purchaseUnit.softDescriptor) &&
        Objects.equals(this.items, purchaseUnit.items) &&
        Objects.equals(this.shipping, purchaseUnit.shipping) &&
        Objects.equals(this.supplementaryData, purchaseUnit.supplementaryData) &&
        Objects.equals(this.payments, purchaseUnit.payments)&&
        Objects.equals(this.additionalProperties, purchaseUnit.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, referenceId, amount, payee, paymentInstruction, customId, invoiceId, id, softDescriptor, items, shipping, supplementaryData, payments, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseUnit {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    paymentInstruction: ").append(toIndentedString(paymentInstruction)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    softDescriptor: ").append(toIndentedString(softDescriptor)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("reference_id");
    openapiFields.add("amount");
    openapiFields.add("payee");
    openapiFields.add("payment_instruction");
    openapiFields.add("custom_id");
    openapiFields.add("invoice_id");
    openapiFields.add("id");
    openapiFields.add("soft_descriptor");
    openapiFields.add("items");
    openapiFields.add("shipping");
    openapiFields.add("supplementary_data");
    openapiFields.add("payments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PurchaseUnit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PurchaseUnit.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PurchaseUnit is not found in the empty JSON string", PurchaseUnit.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("reference_id") != null && !jsonObj.get("reference_id").isJsonNull()) && !jsonObj.get("reference_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference_id").toString()));
      }
      // validate the optional field `amount`
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) {
        AmountWithBreakdown.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
      // validate the optional field `payee`
      if (jsonObj.get("payee") != null && !jsonObj.get("payee").isJsonNull()) {
        Payee.validateJsonObject(jsonObj.getAsJsonObject("payee"));
      }
      // validate the optional field `payment_instruction`
      if (jsonObj.get("payment_instruction") != null && !jsonObj.get("payment_instruction").isJsonNull()) {
        PaymentInstruction.validateJsonObject(jsonObj.getAsJsonObject("payment_instruction"));
      }
      if ((jsonObj.get("custom_id") != null && !jsonObj.get("custom_id").isJsonNull()) && !jsonObj.get("custom_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_id").toString()));
      }
      if ((jsonObj.get("invoice_id") != null && !jsonObj.get("invoice_id").isJsonNull()) && !jsonObj.get("invoice_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_id").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("soft_descriptor") != null && !jsonObj.get("soft_descriptor").isJsonNull()) && !jsonObj.get("soft_descriptor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `soft_descriptor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("soft_descriptor").toString()));
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            Item.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `shipping`
      if (jsonObj.get("shipping") != null && !jsonObj.get("shipping").isJsonNull()) {
        ShippingWithTrackingDetails.validateJsonObject(jsonObj.getAsJsonObject("shipping"));
      }
      // validate the optional field `supplementary_data`
      if (jsonObj.get("supplementary_data") != null && !jsonObj.get("supplementary_data").isJsonNull()) {
        SupplementaryData.validateJsonObject(jsonObj.getAsJsonObject("supplementary_data"));
      }
      // validate the optional field `payments`
      if (jsonObj.get("payments") != null && !jsonObj.get("payments").isJsonNull()) {
        PaymentCollection.validateJsonObject(jsonObj.getAsJsonObject("payments"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PurchaseUnit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PurchaseUnit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PurchaseUnit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PurchaseUnit.class));

       return (TypeAdapter<T>) new TypeAdapter<PurchaseUnit>() {
           @Override
           public void write(JsonWriter out, PurchaseUnit value) throws IOException {
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
           public PurchaseUnit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PurchaseUnit instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PurchaseUnit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PurchaseUnit
  * @throws IOException if the JSON string is invalid with respect to PurchaseUnit
  */
  public static PurchaseUnit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PurchaseUnit.class);
  }

 /**
  * Convert an instance of PurchaseUnit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
