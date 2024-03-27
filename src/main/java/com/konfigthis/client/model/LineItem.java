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
 * The line items for this purchase. If your merchant account has been configured for Level 3 processing this field will be passed to the processor on your behalf.
 */
@ApiModel(description = "The line items for this purchase. If your merchant account has been configured for Level 3 processing this field will be passed to the processor on your behalf.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LineItem {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UNIT_AMOUNT = "unit_amount";
  @SerializedName(SERIALIZED_NAME_UNIT_AMOUNT)
  private Money unitAmount;

  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  private Money tax;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private String quantity;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  /**
   * The item category type.
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
 public enum CategoryEnum {
    DIGITAL_GOODS("DIGITAL_GOODS"),
    
    PHYSICAL_GOODS("PHYSICAL_GOODS"),
    
    DONATION("DONATION");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private CategoryEnum category;

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

  public LineItem() {
  }

  public LineItem description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The detailed item description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The detailed item description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public LineItem name(String name) {
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    
    this.name = name;
    return this;
  }

   /**
   * The item name or title.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The item name or title.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    this.name = name;
  }


  public LineItem unitAmount(Money unitAmount) {
    
    
    
    
    this.unitAmount = unitAmount;
    return this;
  }

   /**
   * Get unitAmount
   * @return unitAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Money getUnitAmount() {
    return unitAmount;
  }


  public void setUnitAmount(Money unitAmount) {
    
    
    
    this.unitAmount = unitAmount;
  }


  public LineItem tax(Money tax) {
    
    
    
    
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Money getTax() {
    return tax;
  }


  public void setTax(Money tax) {
    
    
    
    this.tax = tax;
  }


  public LineItem quantity(String quantity) {
    
    
    
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The item quantity. Must be a whole number.
   * @return quantity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The item quantity. Must be a whole number.")

  public String getQuantity() {
    return quantity;
  }


  public void setQuantity(String quantity) {
    
    
    
    this.quantity = quantity;
  }


  public LineItem sku(String sku) {
    
    
    
    
    this.sku = sku;
    return this;
  }

   /**
   * The stock keeping unit (SKU) for the item.
   * @return sku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The stock keeping unit (SKU) for the item.")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    
    
    
    this.sku = sku;
  }


  public LineItem category(CategoryEnum category) {
    
    
    if (category != null && category.length() < 1) {
      throw new IllegalArgumentException("Invalid value for category. Length must be greater than or equal to 1.");
    }
    
    this.category = category;
    return this;
  }

   /**
   * The item category type.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The item category type.")

  public CategoryEnum getCategory() {
    return category;
  }


  public void setCategory(CategoryEnum category) {
    
    
    if (category != null && category.length() < 1) {
      throw new IllegalArgumentException("Invalid value for category. Length must be greater than or equal to 1.");
    }
    this.category = category;
  }


  public LineItem commodityCode(String commodityCode) {
    
    
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


  public LineItem discountAmount(Money discountAmount) {
    
    
    
    
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


  public LineItem totalAmount(Money totalAmount) {
    
    
    
    
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


  public LineItem unitOfMeasure(String unitOfMeasure) {
    
    
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
   * @return the LineItem instance itself
   */
  public LineItem putAdditionalProperty(String key, Object value) {
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
    LineItem lineItem = (LineItem) o;
    return Objects.equals(this.description, lineItem.description) &&
        Objects.equals(this.name, lineItem.name) &&
        Objects.equals(this.unitAmount, lineItem.unitAmount) &&
        Objects.equals(this.tax, lineItem.tax) &&
        Objects.equals(this.quantity, lineItem.quantity) &&
        Objects.equals(this.sku, lineItem.sku) &&
        Objects.equals(this.category, lineItem.category) &&
        Objects.equals(this.commodityCode, lineItem.commodityCode) &&
        Objects.equals(this.discountAmount, lineItem.discountAmount) &&
        Objects.equals(this.totalAmount, lineItem.totalAmount) &&
        Objects.equals(this.unitOfMeasure, lineItem.unitOfMeasure)&&
        Objects.equals(this.additionalProperties, lineItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, unitAmount, tax, quantity, sku, category, commodityCode, discountAmount, totalAmount, unitOfMeasure, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineItem {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unitAmount: ").append(toIndentedString(unitAmount)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("name");
    openapiFields.add("unit_amount");
    openapiFields.add("tax");
    openapiFields.add("quantity");
    openapiFields.add("sku");
    openapiFields.add("category");
    openapiFields.add("commodity_code");
    openapiFields.add("discount_amount");
    openapiFields.add("total_amount");
    openapiFields.add("unit_of_measure");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("unit_amount");
    openapiRequiredFields.add("quantity");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LineItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LineItem.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LineItem is not found in the empty JSON string", LineItem.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : LineItem.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `unit_amount`
      Money.validateJsonObject(jsonObj.getAsJsonObject("unit_amount"));
      // validate the optional field `tax`
      if (jsonObj.get("tax") != null && !jsonObj.get("tax").isJsonNull()) {
        Money.validateJsonObject(jsonObj.getAsJsonObject("tax"));
      }
      if (!jsonObj.get("quantity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quantity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quantity").toString()));
      }
      if ((jsonObj.get("sku") != null && !jsonObj.get("sku").isJsonNull()) && !jsonObj.get("sku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
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
       if (!LineItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LineItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LineItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LineItem.class));

       return (TypeAdapter<T>) new TypeAdapter<LineItem>() {
           @Override
           public void write(JsonWriter out, LineItem value) throws IOException {
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
           public LineItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LineItem instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LineItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LineItem
  * @throws IOException if the JSON string is invalid with respect to LineItem
  */
  public static LineItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LineItem.class);
  }

 /**
  * Convert an instance of LineItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

