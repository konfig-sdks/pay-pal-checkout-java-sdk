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
 * LineItemAllOf
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LineItemAllOf {
  public static final String SERIALIZED_NAME_COMMODITY_CODE = "commodity_code";
  @SerializedName(SERIALIZED_NAME_COMMODITY_CODE)
  private String commodityCode;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private Money discountAmount;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Money totalAmount;

  public static final String SERIALIZED_NAME_UNIT_OF_MEASURE = "unit_of_measure";
  @SerializedName(SERIALIZED_NAME_UNIT_OF_MEASURE)
  private String unitOfMeasure;

  public LineItemAllOf() {
  }

  public LineItemAllOf commodityCode(String commodityCode) {
    
    
    if (commodityCode != null && commodityCode.length() < 1) {
      throw new IllegalArgumentException("Invalid value for commodityCode. Length must be greater than or equal to 1.");
    }
    
    this.commodityCode = commodityCode;
    return this;
  }

   /**
   * Code used to classify items purchased and track the total amount spent across various categories of products and services. Different corporate purchasing organizations may use different standards, but the United Nations Standard Products and Services Code (UNSPSC) is frequently used.
   * @return commodityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Code used to classify items purchased and track the total amount spent across various categories of products and services. Different corporate purchasing organizations may use different standards, but the United Nations Standard Products and Services Code (UNSPSC) is frequently used.")

  public String getCommodityCode() {
    return commodityCode;
  }


  public void setCommodityCode(String commodityCode) {
    
    
    if (commodityCode != null && commodityCode.length() < 1) {
      throw new IllegalArgumentException("Invalid value for commodityCode. Length must be greater than or equal to 1.");
    }
    this.commodityCode = commodityCode;
  }


  public LineItemAllOf discountAmount(Money discountAmount) {
    
    
    
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Get discountAmount
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(Money discountAmount) {
    
    
    
    this.discountAmount = discountAmount;
  }


  public LineItemAllOf totalAmount(Money totalAmount) {
    
    
    
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Money totalAmount) {
    
    
    
    this.totalAmount = totalAmount;
  }


  public LineItemAllOf unitOfMeasure(String unitOfMeasure) {
    
    
    if (unitOfMeasure != null && unitOfMeasure.length() < 1) {
      throw new IllegalArgumentException("Invalid value for unitOfMeasure. Length must be greater than or equal to 1.");
    }
    
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

   /**
   * Unit of measure is a standard used to express the magnitude of a quantity in international trade. Most commonly used (but not limited to) examples are: Acre (ACR), Ampere (AMP), Centigram (CGM), Centimetre (CMT), Cubic inch (INQ), Cubic metre (MTQ), Fluid ounce (OZA), Foot (FOT), Hour (HUR), Item (ITM), Kilogram (KGM), Kilometre (KMT), Kilowatt (KWT), Liquid gallon (GLL), Liter (LTR), Pounds (LBS), Square foot (FTK).
   * @return unitOfMeasure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unit of measure is a standard used to express the magnitude of a quantity in international trade. Most commonly used (but not limited to) examples are: Acre (ACR), Ampere (AMP), Centigram (CGM), Centimetre (CMT), Cubic inch (INQ), Cubic metre (MTQ), Fluid ounce (OZA), Foot (FOT), Hour (HUR), Item (ITM), Kilogram (KGM), Kilometre (KMT), Kilowatt (KWT), Liquid gallon (GLL), Liter (LTR), Pounds (LBS), Square foot (FTK).")

  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }


  public void setUnitOfMeasure(String unitOfMeasure) {
    
    
    if (unitOfMeasure != null && unitOfMeasure.length() < 1) {
      throw new IllegalArgumentException("Invalid value for unitOfMeasure. Length must be greater than or equal to 1.");
    }
    this.unitOfMeasure = unitOfMeasure;
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
   * @return the LineItemAllOf instance itself
   */
  public LineItemAllOf putAdditionalProperty(String key, Object value) {
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
    LineItemAllOf lineItemAllOf = (LineItemAllOf) o;
    return Objects.equals(this.commodityCode, lineItemAllOf.commodityCode) &&
        Objects.equals(this.discountAmount, lineItemAllOf.discountAmount) &&
        Objects.equals(this.totalAmount, lineItemAllOf.totalAmount) &&
        Objects.equals(this.unitOfMeasure, lineItemAllOf.unitOfMeasure)&&
        Objects.equals(this.additionalProperties, lineItemAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commodityCode, discountAmount, totalAmount, unitOfMeasure, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItemAllOf {\n");
    sb.append("    commodityCode: ").append(toIndentedString(commodityCode)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
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
    openapiFields.add("commodity_code");
    openapiFields.add("discount_amount");
    openapiFields.add("total_amount");
    openapiFields.add("unit_of_measure");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LineItemAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LineItemAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LineItemAllOf is not found in the empty JSON string", LineItemAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("commodity_code") != null && !jsonObj.get("commodity_code").isJsonNull()) && !jsonObj.get("commodity_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commodity_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commodity_code").toString()));
      }
      // validate the optional field `discount_amount`
      if (jsonObj.get("discount_amount") != null && !jsonObj.get("discount_amount").isJsonNull()) {
        Money.validateJsonObject(jsonObj.getAsJsonObject("discount_amount"));
      }
      // validate the optional field `total_amount`
      if (jsonObj.get("total_amount") != null && !jsonObj.get("total_amount").isJsonNull()) {
        Money.validateJsonObject(jsonObj.getAsJsonObject("total_amount"));
      }
      if ((jsonObj.get("unit_of_measure") != null && !jsonObj.get("unit_of_measure").isJsonNull()) && !jsonObj.get("unit_of_measure").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unit_of_measure` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unit_of_measure").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LineItemAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LineItemAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LineItemAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LineItemAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<LineItemAllOf>() {
           @Override
           public void write(JsonWriter out, LineItemAllOf value) throws IOException {
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
           public LineItemAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LineItemAllOf instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LineItemAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LineItemAllOf
  * @throws IOException if the JSON string is invalid with respect to LineItemAllOf
  */
  public static LineItemAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LineItemAllOf.class);
  }

 /**
  * Convert an instance of LineItemAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

