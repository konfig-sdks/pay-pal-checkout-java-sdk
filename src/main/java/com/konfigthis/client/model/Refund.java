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
import com.konfigthis.client.model.LinkDescription;
import com.konfigthis.client.model.MerchantPayableBreakdown;
import com.konfigthis.client.model.Money;
import com.konfigthis.client.model.PayeeBase;
import com.konfigthis.client.model.RefundStatusDetails;
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
 * The refund information.
 */
@ApiModel(description = "The refund information.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Refund {
  /**
   * The status of the refund.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    CANCELLED("CANCELLED"),
    
    FAILED("FAILED"),
    
    PENDING("PENDING"),
    
    COMPLETED("COMPLETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_STATUS_DETAILS = "status_details";
  @SerializedName(SERIALIZED_NAME_STATUS_DETAILS)
  private RefundStatusDetails statusDetails;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Money amount;

  public static final String SERIALIZED_NAME_INVOICE_ID = "invoice_id";
  @SerializedName(SERIALIZED_NAME_INVOICE_ID)
  private String invoiceId;

  public static final String SERIALIZED_NAME_CUSTOM_ID = "custom_id";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ID)
  private String customId;

  public static final String SERIALIZED_NAME_ACQUIRER_REFERENCE_NUMBER = "acquirer_reference_number";
  @SerializedName(SERIALIZED_NAME_ACQUIRER_REFERENCE_NUMBER)
  private String acquirerReferenceNumber;

  public static final String SERIALIZED_NAME_NOTE_TO_PAYER = "note_to_payer";
  @SerializedName(SERIALIZED_NAME_NOTE_TO_PAYER)
  private String noteToPayer;

  public static final String SERIALIZED_NAME_SELLER_PAYABLE_BREAKDOWN = "seller_payable_breakdown";
  @SerializedName(SERIALIZED_NAME_SELLER_PAYABLE_BREAKDOWN)
  private MerchantPayableBreakdown sellerPayableBreakdown;

  public static final String SERIALIZED_NAME_PAYER = "payer";
  @SerializedName(SERIALIZED_NAME_PAYER)
  private PayeeBase payer;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkDescription> links = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public Refund() {
  }

  
  public Refund(
     StatusEnum status, 
     String id, 
     String invoiceId, 
     String noteToPayer, 
     List<LinkDescription> links
  ) {
    this();
    this.status = status;
    this.id = id;
    this.invoiceId = invoiceId;
    this.noteToPayer = noteToPayer;
    this.links = links;
  }

   /**
   * The status of the refund.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the refund.")

  public StatusEnum getStatus() {
    return status;
  }




  public Refund statusDetails(RefundStatusDetails statusDetails) {
    
    
    
    
    this.statusDetails = statusDetails;
    return this;
  }

   /**
   * Get statusDetails
   * @return statusDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RefundStatusDetails getStatusDetails() {
    return statusDetails;
  }


  public void setStatusDetails(RefundStatusDetails statusDetails) {
    
    
    
    this.statusDetails = statusDetails;
  }


   /**
   * The PayPal-generated ID for the refund.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The PayPal-generated ID for the refund.")

  public String getId() {
    return id;
  }




  public Refund amount(Money amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getAmount() {
    return amount;
  }


  public void setAmount(Money amount) {
    
    
    
    this.amount = amount;
  }


   /**
   * The API caller-provided external invoice number for this order. Appears in both the payer&#39;s transaction history and the emails that the payer receives.
   * @return invoiceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives.")

  public String getInvoiceId() {
    return invoiceId;
  }




  public Refund customId(String customId) {
    
    
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


  public Refund acquirerReferenceNumber(String acquirerReferenceNumber) {
    
    
    if (acquirerReferenceNumber != null && acquirerReferenceNumber.length() < 1) {
      throw new IllegalArgumentException("Invalid value for acquirerReferenceNumber. Length must be greater than or equal to 1.");
    }
    
    this.acquirerReferenceNumber = acquirerReferenceNumber;
    return this;
  }

   /**
   * Reference ID issued for the card transaction. This ID can be used to track the transaction across processors, card brands and issuing banks.
   * @return acquirerReferenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference ID issued for the card transaction. This ID can be used to track the transaction across processors, card brands and issuing banks.")

  public String getAcquirerReferenceNumber() {
    return acquirerReferenceNumber;
  }


  public void setAcquirerReferenceNumber(String acquirerReferenceNumber) {
    
    
    if (acquirerReferenceNumber != null && acquirerReferenceNumber.length() < 1) {
      throw new IllegalArgumentException("Invalid value for acquirerReferenceNumber. Length must be greater than or equal to 1.");
    }
    this.acquirerReferenceNumber = acquirerReferenceNumber;
  }


   /**
   * The reason for the refund. Appears in both the payer&#39;s transaction history and the emails that the payer receives.
   * @return noteToPayer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reason for the refund. Appears in both the payer's transaction history and the emails that the payer receives.")

  public String getNoteToPayer() {
    return noteToPayer;
  }




  public Refund sellerPayableBreakdown(MerchantPayableBreakdown sellerPayableBreakdown) {
    
    
    
    
    this.sellerPayableBreakdown = sellerPayableBreakdown;
    return this;
  }

   /**
   * Get sellerPayableBreakdown
   * @return sellerPayableBreakdown
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantPayableBreakdown getSellerPayableBreakdown() {
    return sellerPayableBreakdown;
  }


  public void setSellerPayableBreakdown(MerchantPayableBreakdown sellerPayableBreakdown) {
    
    
    
    this.sellerPayableBreakdown = sellerPayableBreakdown;
  }


  public Refund payer(PayeeBase payer) {
    
    
    
    
    this.payer = payer;
    return this;
  }

   /**
   * Get payer
   * @return payer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PayeeBase getPayer() {
    return payer;
  }


  public void setPayer(PayeeBase payer) {
    
    
    
    this.payer = payer;
  }


   /**
   * An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).")

  public List<LinkDescription> getLinks() {
    return links;
  }




  public Refund createTime(String createTime) {
    
    
    if (createTime != null && createTime.length() < 20) {
      throw new IllegalArgumentException("Invalid value for createTime. Length must be greater than or equal to 20.");
    }
    
    this.createTime = createTime;
    return this;
  }

   /**
   * The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>")

  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    
    
    if (createTime != null && createTime.length() < 20) {
      throw new IllegalArgumentException("Invalid value for createTime. Length must be greater than or equal to 20.");
    }
    this.createTime = createTime;
  }


  public Refund updateTime(String updateTime) {
    
    
    if (updateTime != null && updateTime.length() < 20) {
      throw new IllegalArgumentException("Invalid value for updateTime. Length must be greater than or equal to 20.");
    }
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>")

  public String getUpdateTime() {
    return updateTime;
  }


  public void setUpdateTime(String updateTime) {
    
    
    if (updateTime != null && updateTime.length() < 20) {
      throw new IllegalArgumentException("Invalid value for updateTime. Length must be greater than or equal to 20.");
    }
    this.updateTime = updateTime;
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
   * @return the Refund instance itself
   */
  public Refund putAdditionalProperty(String key, Object value) {
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
    Refund refund = (Refund) o;
    return Objects.equals(this.status, refund.status) &&
        Objects.equals(this.statusDetails, refund.statusDetails) &&
        Objects.equals(this.id, refund.id) &&
        Objects.equals(this.amount, refund.amount) &&
        Objects.equals(this.invoiceId, refund.invoiceId) &&
        Objects.equals(this.customId, refund.customId) &&
        Objects.equals(this.acquirerReferenceNumber, refund.acquirerReferenceNumber) &&
        Objects.equals(this.noteToPayer, refund.noteToPayer) &&
        Objects.equals(this.sellerPayableBreakdown, refund.sellerPayableBreakdown) &&
        Objects.equals(this.payer, refund.payer) &&
        Objects.equals(this.links, refund.links) &&
        Objects.equals(this.createTime, refund.createTime) &&
        Objects.equals(this.updateTime, refund.updateTime)&&
        Objects.equals(this.additionalProperties, refund.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, statusDetails, id, amount, invoiceId, customId, acquirerReferenceNumber, noteToPayer, sellerPayableBreakdown, payer, links, createTime, updateTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Refund {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    acquirerReferenceNumber: ").append(toIndentedString(acquirerReferenceNumber)).append("\n");
    sb.append("    noteToPayer: ").append(toIndentedString(noteToPayer)).append("\n");
    sb.append("    sellerPayableBreakdown: ").append(toIndentedString(sellerPayableBreakdown)).append("\n");
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
    openapiFields.add("status");
    openapiFields.add("status_details");
    openapiFields.add("id");
    openapiFields.add("amount");
    openapiFields.add("invoice_id");
    openapiFields.add("custom_id");
    openapiFields.add("acquirer_reference_number");
    openapiFields.add("note_to_payer");
    openapiFields.add("seller_payable_breakdown");
    openapiFields.add("payer");
    openapiFields.add("links");
    openapiFields.add("create_time");
    openapiFields.add("update_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Refund
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Refund.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Refund is not found in the empty JSON string", Refund.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status_details`
      if (jsonObj.get("status_details") != null && !jsonObj.get("status_details").isJsonNull()) {
        RefundStatusDetails.validateJsonObject(jsonObj.getAsJsonObject("status_details"));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `amount`
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull()) {
        Money.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
      if ((jsonObj.get("invoice_id") != null && !jsonObj.get("invoice_id").isJsonNull()) && !jsonObj.get("invoice_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_id").toString()));
      }
      if ((jsonObj.get("custom_id") != null && !jsonObj.get("custom_id").isJsonNull()) && !jsonObj.get("custom_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_id").toString()));
      }
      if ((jsonObj.get("acquirer_reference_number") != null && !jsonObj.get("acquirer_reference_number").isJsonNull()) && !jsonObj.get("acquirer_reference_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acquirer_reference_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acquirer_reference_number").toString()));
      }
      if ((jsonObj.get("note_to_payer") != null && !jsonObj.get("note_to_payer").isJsonNull()) && !jsonObj.get("note_to_payer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `note_to_payer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("note_to_payer").toString()));
      }
      // validate the optional field `seller_payable_breakdown`
      if (jsonObj.get("seller_payable_breakdown") != null && !jsonObj.get("seller_payable_breakdown").isJsonNull()) {
        MerchantPayableBreakdown.validateJsonObject(jsonObj.getAsJsonObject("seller_payable_breakdown"));
      }
      // validate the optional field `payer`
      if (jsonObj.get("payer") != null && !jsonObj.get("payer").isJsonNull()) {
        PayeeBase.validateJsonObject(jsonObj.getAsJsonObject("payer"));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        JsonArray jsonArraylinks = jsonObj.getAsJsonArray("links");
        if (jsonArraylinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("links").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
          }

          // validate the optional field `links` (array)
          for (int i = 0; i < jsonArraylinks.size(); i++) {
            LinkDescription.validateJsonObject(jsonArraylinks.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("create_time") != null && !jsonObj.get("create_time").isJsonNull()) && !jsonObj.get("create_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `create_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("create_time").toString()));
      }
      if ((jsonObj.get("update_time") != null && !jsonObj.get("update_time").isJsonNull()) && !jsonObj.get("update_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `update_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("update_time").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Refund.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Refund' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Refund> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Refund.class));

       return (TypeAdapter<T>) new TypeAdapter<Refund>() {
           @Override
           public void write(JsonWriter out, Refund value) throws IOException {
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
           public Refund read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Refund instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Refund given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Refund
  * @throws IOException if the JSON string is invalid with respect to Refund
  */
  public static Refund fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Refund.class);
  }

 /**
  * Convert an instance of Refund to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

