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
import com.konfigthis.client.model.StoreInVaultInstruction;
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
 * Resource consolidating common request and response attirbutes for vaulting Venmo Wallet.
 */
@ApiModel(description = "Resource consolidating common request and response attirbutes for vaulting Venmo Wallet.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VaultVenmoWalletBase {
  public static final String SERIALIZED_NAME_STORE_IN_VAULT = "store_in_vault";
  @SerializedName(SERIALIZED_NAME_STORE_IN_VAULT)
  private StoreInVaultInstruction storeInVault;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Expected business/pricing model for the billing agreement.
   */
  @JsonAdapter(UsagePatternEnum.Adapter.class)
 public enum UsagePatternEnum {
    IMMEDIATE("IMMEDIATE"),
    
    DEFERRED("DEFERRED"),
    
    RECURRING_PREPAID("RECURRING_PREPAID"),
    
    RECURRING_POSTPAID("RECURRING_POSTPAID"),
    
    THRESHOLD_PREPAID("THRESHOLD_PREPAID"),
    
    THRESHOLD_POSTPAID("THRESHOLD_POSTPAID");

    private String value;

    UsagePatternEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UsagePatternEnum fromValue(String value) {
      for (UsagePatternEnum b : UsagePatternEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UsagePatternEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UsagePatternEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UsagePatternEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UsagePatternEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USAGE_PATTERN = "usage_pattern";
  @SerializedName(SERIALIZED_NAME_USAGE_PATTERN)
  private UsagePatternEnum usagePattern;

  /**
   * The usage type associated with the Venmo payment token.
   */
  @JsonAdapter(UsageTypeEnum.Adapter.class)
 public enum UsageTypeEnum {
    MERCHANT("MERCHANT"),
    
    PLATFORM("PLATFORM");

    private String value;

    UsageTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UsageTypeEnum fromValue(String value) {
      for (UsageTypeEnum b : UsageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UsageTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UsageTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UsageTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UsageTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_USAGE_TYPE = "usage_type";
  @SerializedName(SERIALIZED_NAME_USAGE_TYPE)
  private UsageTypeEnum usageType;

  /**
   * The customer type associated with the Venmo payment token. This is to indicate whether the customer acting on the merchant / platform is either a business or a consumer.
   */
  @JsonAdapter(CustomerTypeEnum.Adapter.class)
 public enum CustomerTypeEnum {
    CONSUMER("CONSUMER"),
    
    BUSINESS("BUSINESS");

    private String value;

    CustomerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CustomerTypeEnum fromValue(String value) {
      for (CustomerTypeEnum b : CustomerTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CustomerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CustomerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CustomerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CustomerTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CUSTOMER_TYPE = "customer_type";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_TYPE)
  private CustomerTypeEnum customerType = CustomerTypeEnum.CONSUMER;

  public static final String SERIALIZED_NAME_PERMIT_MULTIPLE_PAYMENT_TOKENS = "permit_multiple_payment_tokens";
  @SerializedName(SERIALIZED_NAME_PERMIT_MULTIPLE_PAYMENT_TOKENS)
  private Boolean permitMultiplePaymentTokens = false;

  public VaultVenmoWalletBase() {
  }

  public VaultVenmoWalletBase storeInVault(StoreInVaultInstruction storeInVault) {
    
    
    
    
    this.storeInVault = storeInVault;
    return this;
  }

   /**
   * Get storeInVault
   * @return storeInVault
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public StoreInVaultInstruction getStoreInVault() {
    return storeInVault;
  }


  public void setStoreInVault(StoreInVaultInstruction storeInVault) {
    
    
    
    this.storeInVault = storeInVault;
  }


  public VaultVenmoWalletBase description(String description) {
    
    
    if (description != null && description.length() < 1) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 1.");
    }
    
    this.description = description;
    return this;
  }

   /**
   * The description displayed to Venmo consumer on the approval flow for Venmo, as well as on the Venmo payment token management experience on Venmo.com.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description displayed to Venmo consumer on the approval flow for Venmo, as well as on the Venmo payment token management experience on Venmo.com.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    if (description != null && description.length() < 1) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 1.");
    }
    this.description = description;
  }


  public VaultVenmoWalletBase usagePattern(UsagePatternEnum usagePattern) {
    
    
    if (usagePattern != null && usagePattern.length() < 1) {
      throw new IllegalArgumentException("Invalid value for usagePattern. Length must be greater than or equal to 1.");
    }
    
    this.usagePattern = usagePattern;
    return this;
  }

   /**
   * Expected business/pricing model for the billing agreement.
   * @return usagePattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expected business/pricing model for the billing agreement.")

  public UsagePatternEnum getUsagePattern() {
    return usagePattern;
  }


  public void setUsagePattern(UsagePatternEnum usagePattern) {
    
    
    if (usagePattern != null && usagePattern.length() < 1) {
      throw new IllegalArgumentException("Invalid value for usagePattern. Length must be greater than or equal to 1.");
    }
    this.usagePattern = usagePattern;
  }


  public VaultVenmoWalletBase usageType(UsageTypeEnum usageType) {
    
    
    if (usageType != null && usageType.length() < 1) {
      throw new IllegalArgumentException("Invalid value for usageType. Length must be greater than or equal to 1.");
    }
    
    this.usageType = usageType;
    return this;
  }

   /**
   * The usage type associated with the Venmo payment token.
   * @return usageType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The usage type associated with the Venmo payment token.")

  public UsageTypeEnum getUsageType() {
    return usageType;
  }


  public void setUsageType(UsageTypeEnum usageType) {
    
    
    if (usageType != null && usageType.length() < 1) {
      throw new IllegalArgumentException("Invalid value for usageType. Length must be greater than or equal to 1.");
    }
    this.usageType = usageType;
  }


  public VaultVenmoWalletBase customerType(CustomerTypeEnum customerType) {
    
    
    if (customerType != null && customerType.length() < 1) {
      throw new IllegalArgumentException("Invalid value for customerType. Length must be greater than or equal to 1.");
    }
    
    this.customerType = customerType;
    return this;
  }

   /**
   * The customer type associated with the Venmo payment token. This is to indicate whether the customer acting on the merchant / platform is either a business or a consumer.
   * @return customerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CONSUMER", value = "The customer type associated with the Venmo payment token. This is to indicate whether the customer acting on the merchant / platform is either a business or a consumer.")

  public CustomerTypeEnum getCustomerType() {
    return customerType;
  }


  public void setCustomerType(CustomerTypeEnum customerType) {
    
    
    if (customerType != null && customerType.length() < 1) {
      throw new IllegalArgumentException("Invalid value for customerType. Length must be greater than or equal to 1.");
    }
    this.customerType = customerType;
  }


  public VaultVenmoWalletBase permitMultiplePaymentTokens(Boolean permitMultiplePaymentTokens) {
    
    
    
    
    this.permitMultiplePaymentTokens = permitMultiplePaymentTokens;
    return this;
  }

   /**
   * Create multiple payment tokens for the same payer, merchant/platform combination. Use this when the customer has not logged in at merchant/platform. The payment token thus generated, can then also be used to create the customer account at merchant/platform. Use this also when multiple payment tokens are required for the same payer, different customer at merchant/platform. This helps to identify customers distinctly even though they may share the same Venmo account.
   * @return permitMultiplePaymentTokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Create multiple payment tokens for the same payer, merchant/platform combination. Use this when the customer has not logged in at merchant/platform. The payment token thus generated, can then also be used to create the customer account at merchant/platform. Use this also when multiple payment tokens are required for the same payer, different customer at merchant/platform. This helps to identify customers distinctly even though they may share the same Venmo account.")

  public Boolean getPermitMultiplePaymentTokens() {
    return permitMultiplePaymentTokens;
  }


  public void setPermitMultiplePaymentTokens(Boolean permitMultiplePaymentTokens) {
    
    
    
    this.permitMultiplePaymentTokens = permitMultiplePaymentTokens;
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
   * @return the VaultVenmoWalletBase instance itself
   */
  public VaultVenmoWalletBase putAdditionalProperty(String key, Object value) {
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
    VaultVenmoWalletBase vaultVenmoWalletBase = (VaultVenmoWalletBase) o;
    return Objects.equals(this.storeInVault, vaultVenmoWalletBase.storeInVault) &&
        Objects.equals(this.description, vaultVenmoWalletBase.description) &&
        Objects.equals(this.usagePattern, vaultVenmoWalletBase.usagePattern) &&
        Objects.equals(this.usageType, vaultVenmoWalletBase.usageType) &&
        Objects.equals(this.customerType, vaultVenmoWalletBase.customerType) &&
        Objects.equals(this.permitMultiplePaymentTokens, vaultVenmoWalletBase.permitMultiplePaymentTokens)&&
        Objects.equals(this.additionalProperties, vaultVenmoWalletBase.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeInVault, description, usagePattern, usageType, customerType, permitMultiplePaymentTokens, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VaultVenmoWalletBase {\n");
    sb.append("    storeInVault: ").append(toIndentedString(storeInVault)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    usagePattern: ").append(toIndentedString(usagePattern)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    permitMultiplePaymentTokens: ").append(toIndentedString(permitMultiplePaymentTokens)).append("\n");
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
    openapiFields.add("store_in_vault");
    openapiFields.add("description");
    openapiFields.add("usage_pattern");
    openapiFields.add("usage_type");
    openapiFields.add("customer_type");
    openapiFields.add("permit_multiple_payment_tokens");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("store_in_vault");
    openapiRequiredFields.add("usage_type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VaultVenmoWalletBase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VaultVenmoWalletBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VaultVenmoWalletBase is not found in the empty JSON string", VaultVenmoWalletBase.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VaultVenmoWalletBase.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("usage_pattern") != null && !jsonObj.get("usage_pattern").isJsonNull()) && !jsonObj.get("usage_pattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usage_pattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usage_pattern").toString()));
      }
      if (!jsonObj.get("usage_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `usage_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("usage_type").toString()));
      }
      if ((jsonObj.get("customer_type") != null && !jsonObj.get("customer_type").isJsonNull()) && !jsonObj.get("customer_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VaultVenmoWalletBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VaultVenmoWalletBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VaultVenmoWalletBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VaultVenmoWalletBase.class));

       return (TypeAdapter<T>) new TypeAdapter<VaultVenmoWalletBase>() {
           @Override
           public void write(JsonWriter out, VaultVenmoWalletBase value) throws IOException {
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
           public VaultVenmoWalletBase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VaultVenmoWalletBase instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VaultVenmoWalletBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VaultVenmoWalletBase
  * @throws IOException if the JSON string is invalid with respect to VaultVenmoWalletBase
  */
  public static VaultVenmoWalletBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VaultVenmoWalletBase.class);
  }

 /**
  * Convert an instance of VaultVenmoWalletBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

