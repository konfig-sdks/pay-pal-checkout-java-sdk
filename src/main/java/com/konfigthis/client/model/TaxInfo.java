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
 * The tax ID of the customer. The customer is also known as the payer. Both &#x60;tax_id&#x60; and &#x60;tax_id_type&#x60; are required.
 */
@ApiModel(description = "The tax ID of the customer. The customer is also known as the payer. Both `tax_id` and `tax_id_type` are required.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TaxInfo {
  public static final String SERIALIZED_NAME_TAX_ID = "tax_id";
  @SerializedName(SERIALIZED_NAME_TAX_ID)
  private String taxId;

  /**
   * The customer&#39;s tax ID type.
   */
  @JsonAdapter(TaxIdTypeEnum.Adapter.class)
 public enum TaxIdTypeEnum {
    CPF("BR_CPF"),
    
    CNPJ("BR_CNPJ");

    private String value;

    TaxIdTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TaxIdTypeEnum fromValue(String value) {
      for (TaxIdTypeEnum b : TaxIdTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TaxIdTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TaxIdTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TaxIdTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TaxIdTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TAX_ID_TYPE = "tax_id_type";
  @SerializedName(SERIALIZED_NAME_TAX_ID_TYPE)
  private TaxIdTypeEnum taxIdType;

  public TaxInfo() {
  }

  public TaxInfo taxId(String taxId) {
    
    
    if (taxId != null && taxId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for taxId. Length must be greater than or equal to 1.");
    }
    
    this.taxId = taxId;
    return this;
  }

   /**
   * The customer&#39;s tax ID value.
   * @return taxId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The customer's tax ID value.")

  public String getTaxId() {
    return taxId;
  }


  public void setTaxId(String taxId) {
    
    
    if (taxId != null && taxId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for taxId. Length must be greater than or equal to 1.");
    }
    this.taxId = taxId;
  }


  public TaxInfo taxIdType(TaxIdTypeEnum taxIdType) {
    
    
    if (taxIdType != null && taxIdType.length() < 1) {
      throw new IllegalArgumentException("Invalid value for taxIdType. Length must be greater than or equal to 1.");
    }
    
    this.taxIdType = taxIdType;
    return this;
  }

   /**
   * The customer&#39;s tax ID type.
   * @return taxIdType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The customer's tax ID type.")

  public TaxIdTypeEnum getTaxIdType() {
    return taxIdType;
  }


  public void setTaxIdType(TaxIdTypeEnum taxIdType) {
    
    
    if (taxIdType != null && taxIdType.length() < 1) {
      throw new IllegalArgumentException("Invalid value for taxIdType. Length must be greater than or equal to 1.");
    }
    this.taxIdType = taxIdType;
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
   * @return the TaxInfo instance itself
   */
  public TaxInfo putAdditionalProperty(String key, Object value) {
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
    TaxInfo taxInfo = (TaxInfo) o;
    return Objects.equals(this.taxId, taxInfo.taxId) &&
        Objects.equals(this.taxIdType, taxInfo.taxIdType)&&
        Objects.equals(this.additionalProperties, taxInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxId, taxIdType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxInfo {\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    taxIdType: ").append(toIndentedString(taxIdType)).append("\n");
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
    openapiFields.add("tax_id");
    openapiFields.add("tax_id_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tax_id");
    openapiRequiredFields.add("tax_id_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaxInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TaxInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaxInfo is not found in the empty JSON string", TaxInfo.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TaxInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("tax_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_id").toString()));
      }
      if (!jsonObj.get("tax_id_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tax_id_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tax_id_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaxInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaxInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaxInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaxInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TaxInfo>() {
           @Override
           public void write(JsonWriter out, TaxInfo value) throws IOException {
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
           public TaxInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaxInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaxInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaxInfo
  * @throws IOException if the JSON string is invalid with respect to TaxInfo
  */
  public static TaxInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaxInfo.class);
  }

 /**
  * Convert an instance of TaxInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
