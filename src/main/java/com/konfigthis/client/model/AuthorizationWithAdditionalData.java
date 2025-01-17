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
import com.konfigthis.client.model.AuthorizationStatusDetails;
import com.konfigthis.client.model.LinkDescription;
import com.konfigthis.client.model.Money;
import com.konfigthis.client.model.NetworkTransactionReference;
import com.konfigthis.client.model.ProcessorResponse;
import com.konfigthis.client.model.SellerProtection;
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
 * The authorization with additional payment details, such as risk assessment and processor response. These details are populated only for certain payment methods.
 */
@ApiModel(description = "The authorization with additional payment details, such as risk assessment and processor response. These details are populated only for certain payment methods.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AuthorizationWithAdditionalData {
  /**
   * The status for the authorized payment.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    CREATED("CREATED"),
    
    CAPTURED("CAPTURED"),
    
    DENIED("DENIED"),
    
    PARTIALLY_CAPTURED("PARTIALLY_CAPTURED"),
    
    VOIDED("VOIDED"),
    
    PENDING("PENDING");

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
  private AuthorizationStatusDetails statusDetails;

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

  public static final String SERIALIZED_NAME_NETWORK_TRANSACTION_REFERENCE = "network_transaction_reference";
  @SerializedName(SERIALIZED_NAME_NETWORK_TRANSACTION_REFERENCE)
  private NetworkTransactionReference networkTransactionReference;

  public static final String SERIALIZED_NAME_SELLER_PROTECTION = "seller_protection";
  @SerializedName(SERIALIZED_NAME_SELLER_PROTECTION)
  private SellerProtection sellerProtection;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME = "expiration_time";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME)
  private String expirationTime;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkDescription> links = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public static final String SERIALIZED_NAME_PROCESSOR_RESPONSE = "processor_response";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_RESPONSE)
  private ProcessorResponse processorResponse;

  public AuthorizationWithAdditionalData() {
  }

  
  public AuthorizationWithAdditionalData(
     StatusEnum status, 
     String id, 
     String invoiceId, 
     List<LinkDescription> links
  ) {
    this();
    this.status = status;
    this.id = id;
    this.invoiceId = invoiceId;
    this.links = links;
  }

   /**
   * The status for the authorized payment.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status for the authorized payment.")

  public StatusEnum getStatus() {
    return status;
  }




  public AuthorizationWithAdditionalData statusDetails(AuthorizationStatusDetails statusDetails) {
    
    
    
    
    this.statusDetails = statusDetails;
    return this;
  }

   /**
   * Get statusDetails
   * @return statusDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AuthorizationStatusDetails getStatusDetails() {
    return statusDetails;
  }


  public void setStatusDetails(AuthorizationStatusDetails statusDetails) {
    
    
    
    this.statusDetails = statusDetails;
  }


   /**
   * The PayPal-generated ID for the authorized payment.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The PayPal-generated ID for the authorized payment.")

  public String getId() {
    return id;
  }




  public AuthorizationWithAdditionalData amount(Money amount) {
    
    
    
    
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




  public AuthorizationWithAdditionalData customId(String customId) {
    
    
    
    
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
    
    
    
    this.customId = customId;
  }


  public AuthorizationWithAdditionalData networkTransactionReference(NetworkTransactionReference networkTransactionReference) {
    
    
    
    
    this.networkTransactionReference = networkTransactionReference;
    return this;
  }

   /**
   * Get networkTransactionReference
   * @return networkTransactionReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NetworkTransactionReference getNetworkTransactionReference() {
    return networkTransactionReference;
  }


  public void setNetworkTransactionReference(NetworkTransactionReference networkTransactionReference) {
    
    
    
    this.networkTransactionReference = networkTransactionReference;
  }


  public AuthorizationWithAdditionalData sellerProtection(SellerProtection sellerProtection) {
    
    
    
    
    this.sellerProtection = sellerProtection;
    return this;
  }

   /**
   * Get sellerProtection
   * @return sellerProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SellerProtection getSellerProtection() {
    return sellerProtection;
  }


  public void setSellerProtection(SellerProtection sellerProtection) {
    
    
    
    this.sellerProtection = sellerProtection;
  }


  public AuthorizationWithAdditionalData expirationTime(String expirationTime) {
    
    
    if (expirationTime != null && expirationTime.length() < 20) {
      throw new IllegalArgumentException("Invalid value for expirationTime. Length must be greater than or equal to 20.");
    }
    
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
   * @return expirationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>")

  public String getExpirationTime() {
    return expirationTime;
  }


  public void setExpirationTime(String expirationTime) {
    
    
    if (expirationTime != null && expirationTime.length() < 20) {
      throw new IllegalArgumentException("Invalid value for expirationTime. Length must be greater than or equal to 20.");
    }
    this.expirationTime = expirationTime;
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




  public AuthorizationWithAdditionalData createTime(String createTime) {
    
    
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


  public AuthorizationWithAdditionalData updateTime(String updateTime) {
    
    
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


  public AuthorizationWithAdditionalData processorResponse(ProcessorResponse processorResponse) {
    
    
    
    
    this.processorResponse = processorResponse;
    return this;
  }

   /**
   * Get processorResponse
   * @return processorResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProcessorResponse getProcessorResponse() {
    return processorResponse;
  }


  public void setProcessorResponse(ProcessorResponse processorResponse) {
    
    
    
    this.processorResponse = processorResponse;
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
   * @return the AuthorizationWithAdditionalData instance itself
   */
  public AuthorizationWithAdditionalData putAdditionalProperty(String key, Object value) {
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
    AuthorizationWithAdditionalData authorizationWithAdditionalData = (AuthorizationWithAdditionalData) o;
    return Objects.equals(this.status, authorizationWithAdditionalData.status) &&
        Objects.equals(this.statusDetails, authorizationWithAdditionalData.statusDetails) &&
        Objects.equals(this.id, authorizationWithAdditionalData.id) &&
        Objects.equals(this.amount, authorizationWithAdditionalData.amount) &&
        Objects.equals(this.invoiceId, authorizationWithAdditionalData.invoiceId) &&
        Objects.equals(this.customId, authorizationWithAdditionalData.customId) &&
        Objects.equals(this.networkTransactionReference, authorizationWithAdditionalData.networkTransactionReference) &&
        Objects.equals(this.sellerProtection, authorizationWithAdditionalData.sellerProtection) &&
        Objects.equals(this.expirationTime, authorizationWithAdditionalData.expirationTime) &&
        Objects.equals(this.links, authorizationWithAdditionalData.links) &&
        Objects.equals(this.createTime, authorizationWithAdditionalData.createTime) &&
        Objects.equals(this.updateTime, authorizationWithAdditionalData.updateTime) &&
        Objects.equals(this.processorResponse, authorizationWithAdditionalData.processorResponse)&&
        Objects.equals(this.additionalProperties, authorizationWithAdditionalData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, statusDetails, id, amount, invoiceId, customId, networkTransactionReference, sellerProtection, expirationTime, links, createTime, updateTime, processorResponse, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationWithAdditionalData {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    networkTransactionReference: ").append(toIndentedString(networkTransactionReference)).append("\n");
    sb.append("    sellerProtection: ").append(toIndentedString(sellerProtection)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    processorResponse: ").append(toIndentedString(processorResponse)).append("\n");
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
    openapiFields.add("network_transaction_reference");
    openapiFields.add("seller_protection");
    openapiFields.add("expiration_time");
    openapiFields.add("links");
    openapiFields.add("create_time");
    openapiFields.add("update_time");
    openapiFields.add("processor_response");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthorizationWithAdditionalData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AuthorizationWithAdditionalData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthorizationWithAdditionalData is not found in the empty JSON string", AuthorizationWithAdditionalData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `status_details`
      if (jsonObj.get("status_details") != null && !jsonObj.get("status_details").isJsonNull()) {
        AuthorizationStatusDetails.validateJsonObject(jsonObj.getAsJsonObject("status_details"));
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
      // validate the optional field `network_transaction_reference`
      if (jsonObj.get("network_transaction_reference") != null && !jsonObj.get("network_transaction_reference").isJsonNull()) {
        NetworkTransactionReference.validateJsonObject(jsonObj.getAsJsonObject("network_transaction_reference"));
      }
      // validate the optional field `seller_protection`
      if (jsonObj.get("seller_protection") != null && !jsonObj.get("seller_protection").isJsonNull()) {
        SellerProtection.validateJsonObject(jsonObj.getAsJsonObject("seller_protection"));
      }
      if ((jsonObj.get("expiration_time") != null && !jsonObj.get("expiration_time").isJsonNull()) && !jsonObj.get("expiration_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiration_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiration_time").toString()));
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
      // validate the optional field `processor_response`
      if (jsonObj.get("processor_response") != null && !jsonObj.get("processor_response").isJsonNull()) {
        ProcessorResponse.validateJsonObject(jsonObj.getAsJsonObject("processor_response"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorizationWithAdditionalData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorizationWithAdditionalData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorizationWithAdditionalData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorizationWithAdditionalData.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorizationWithAdditionalData>() {
           @Override
           public void write(JsonWriter out, AuthorizationWithAdditionalData value) throws IOException {
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
           public AuthorizationWithAdditionalData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AuthorizationWithAdditionalData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AuthorizationWithAdditionalData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorizationWithAdditionalData
  * @throws IOException if the JSON string is invalid with respect to AuthorizationWithAdditionalData
  */
  public static AuthorizationWithAdditionalData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorizationWithAdditionalData.class);
  }

 /**
  * Convert an instance of AuthorizationWithAdditionalData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

