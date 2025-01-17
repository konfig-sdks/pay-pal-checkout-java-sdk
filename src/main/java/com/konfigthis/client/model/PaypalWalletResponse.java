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
import com.konfigthis.client.model.AddressPortable2;
import com.konfigthis.client.model.Name2;
import com.konfigthis.client.model.PaypalWalletAttributesResponse;
import com.konfigthis.client.model.Phone2;
import com.konfigthis.client.model.PhoneType2;
import com.konfigthis.client.model.TaxInfo;
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
 * The PayPal Wallet response.
 */
@ApiModel(description = "The PayPal Wallet response.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PaypalWalletResponse {
  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "email_address";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  /**
   * The account status indicates whether the buyer has verified the financial details associated with their PayPal account.
   */
  @JsonAdapter(AccountStatusEnum.Adapter.class)
 public enum AccountStatusEnum {
    VERIFIED("VERIFIED"),
    
    UNVERIFIED("UNVERIFIED");

    private String value;

    AccountStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountStatusEnum fromValue(String value) {
      for (AccountStatusEnum b : AccountStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_STATUS = "account_status";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_STATUS)
  private AccountStatusEnum accountStatus;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Name2 name;

  public static final String SERIALIZED_NAME_PHONE_TYPE = "phone_type";
  @SerializedName(SERIALIZED_NAME_PHONE_TYPE)
  private PhoneType2 phoneType;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private Phone2 phoneNumber;

  public static final String SERIALIZED_NAME_BIRTH_DATE = "birth_date";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private String birthDate;

  public static final String SERIALIZED_NAME_TAX_INFO = "tax_info";
  @SerializedName(SERIALIZED_NAME_TAX_INFO)
  private TaxInfo taxInfo;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private AddressPortable2 address;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private PaypalWalletAttributesResponse attributes;

  public PaypalWalletResponse() {
  }

  
  public PaypalWalletResponse(
     AccountStatusEnum accountStatus
  ) {
    this();
    this.accountStatus = accountStatus;
  }

  public PaypalWalletResponse emailAddress(String emailAddress) {
    
    
    if (emailAddress != null && emailAddress.length() < 3) {
      throw new IllegalArgumentException("Invalid value for emailAddress. Length must be greater than or equal to 3.");
    }
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters are allowed before and 255 characters are allowed after the &lt;code&gt;@&lt;/code&gt; sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted &lt;code&gt;@&lt;/code&gt; sign exists.&lt;/blockquote&gt;
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The internationalized email address.<blockquote><strong>Note:</strong> Up to 64 characters are allowed before and 255 characters are allowed after the <code>@</code> sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted <code>@</code> sign exists.</blockquote>")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    
    
    if (emailAddress != null && emailAddress.length() < 3) {
      throw new IllegalArgumentException("Invalid value for emailAddress. Length must be greater than or equal to 3.");
    }
    this.emailAddress = emailAddress;
  }


  public PaypalWalletResponse accountId(String accountId) {
    
    
    if (accountId != null && accountId.length() < 13) {
      throw new IllegalArgumentException("Invalid value for accountId. Length must be greater than or equal to 13.");
    }
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The PayPal payer ID, which is a masked version of the PayPal account number intended for use with third parties. The account number is reversibly encrypted and a proprietary variant of Base32 is used to encode the result.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The PayPal payer ID, which is a masked version of the PayPal account number intended for use with third parties. The account number is reversibly encrypted and a proprietary variant of Base32 is used to encode the result.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    
    
    if (accountId != null && accountId.length() < 13) {
      throw new IllegalArgumentException("Invalid value for accountId. Length must be greater than or equal to 13.");
    }
    this.accountId = accountId;
  }


   /**
   * The account status indicates whether the buyer has verified the financial details associated with their PayPal account.
   * @return accountStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account status indicates whether the buyer has verified the financial details associated with their PayPal account.")

  public AccountStatusEnum getAccountStatus() {
    return accountStatus;
  }




  public PaypalWalletResponse name(Name2 name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Name2 getName() {
    return name;
  }


  public void setName(Name2 name) {
    
    
    
    this.name = name;
  }


  public PaypalWalletResponse phoneType(PhoneType2 phoneType) {
    
    
    
    
    this.phoneType = phoneType;
    return this;
  }

   /**
   * Get phoneType
   * @return phoneType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PhoneType2 getPhoneType() {
    return phoneType;
  }


  public void setPhoneType(PhoneType2 phoneType) {
    
    
    
    this.phoneType = phoneType;
  }


  public PaypalWalletResponse phoneNumber(Phone2 phoneNumber) {
    
    
    
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Phone2 getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(Phone2 phoneNumber) {
    
    
    
    this.phoneNumber = phoneNumber;
  }


  public PaypalWalletResponse birthDate(String birthDate) {
    
    
    if (birthDate != null && birthDate.length() < 10) {
      throw new IllegalArgumentException("Invalid value for birthDate. Length must be greater than or equal to 10.");
    }
    
    this.birthDate = birthDate;
    return this;
  }

   /**
   * The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard &#x60;date_time&#x60; type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years.
   * @return birthDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard `date_time` type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years.")

  public String getBirthDate() {
    return birthDate;
  }


  public void setBirthDate(String birthDate) {
    
    
    if (birthDate != null && birthDate.length() < 10) {
      throw new IllegalArgumentException("Invalid value for birthDate. Length must be greater than or equal to 10.");
    }
    this.birthDate = birthDate;
  }


  public PaypalWalletResponse taxInfo(TaxInfo taxInfo) {
    
    
    
    
    this.taxInfo = taxInfo;
    return this;
  }

   /**
   * Get taxInfo
   * @return taxInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaxInfo getTaxInfo() {
    return taxInfo;
  }


  public void setTaxInfo(TaxInfo taxInfo) {
    
    
    
    this.taxInfo = taxInfo;
  }


  public PaypalWalletResponse address(AddressPortable2 address) {
    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AddressPortable2 getAddress() {
    return address;
  }


  public void setAddress(AddressPortable2 address) {
    
    
    
    this.address = address;
  }


  public PaypalWalletResponse attributes(PaypalWalletAttributesResponse attributes) {
    
    
    
    
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaypalWalletAttributesResponse getAttributes() {
    return attributes;
  }


  public void setAttributes(PaypalWalletAttributesResponse attributes) {
    
    
    
    this.attributes = attributes;
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
   * @return the PaypalWalletResponse instance itself
   */
  public PaypalWalletResponse putAdditionalProperty(String key, Object value) {
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
    PaypalWalletResponse paypalWalletResponse = (PaypalWalletResponse) o;
    return Objects.equals(this.emailAddress, paypalWalletResponse.emailAddress) &&
        Objects.equals(this.accountId, paypalWalletResponse.accountId) &&
        Objects.equals(this.accountStatus, paypalWalletResponse.accountStatus) &&
        Objects.equals(this.name, paypalWalletResponse.name) &&
        Objects.equals(this.phoneType, paypalWalletResponse.phoneType) &&
        Objects.equals(this.phoneNumber, paypalWalletResponse.phoneNumber) &&
        Objects.equals(this.birthDate, paypalWalletResponse.birthDate) &&
        Objects.equals(this.taxInfo, paypalWalletResponse.taxInfo) &&
        Objects.equals(this.address, paypalWalletResponse.address) &&
        Objects.equals(this.attributes, paypalWalletResponse.attributes)&&
        Objects.equals(this.additionalProperties, paypalWalletResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, accountId, accountStatus, name, phoneType, phoneNumber, birthDate, taxInfo, address, attributes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaypalWalletResponse {\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    taxInfo: ").append(toIndentedString(taxInfo)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
    openapiFields.add("email_address");
    openapiFields.add("account_id");
    openapiFields.add("account_status");
    openapiFields.add("name");
    openapiFields.add("phone_type");
    openapiFields.add("phone_number");
    openapiFields.add("birth_date");
    openapiFields.add("tax_info");
    openapiFields.add("address");
    openapiFields.add("attributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PaypalWalletResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PaypalWalletResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PaypalWalletResponse is not found in the empty JSON string", PaypalWalletResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("email_address") != null && !jsonObj.get("email_address").isJsonNull()) && !jsonObj.get("email_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_address").toString()));
      }
      if ((jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonNull()) && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if ((jsonObj.get("account_status") != null && !jsonObj.get("account_status").isJsonNull()) && !jsonObj.get("account_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_status").toString()));
      }
      // validate the optional field `name`
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) {
        Name2.validateJsonObject(jsonObj.getAsJsonObject("name"));
      }
      // validate the optional field `phone_number`
      if (jsonObj.get("phone_number") != null && !jsonObj.get("phone_number").isJsonNull()) {
        Phone2.validateJsonObject(jsonObj.getAsJsonObject("phone_number"));
      }
      if ((jsonObj.get("birth_date") != null && !jsonObj.get("birth_date").isJsonNull()) && !jsonObj.get("birth_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `birth_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("birth_date").toString()));
      }
      // validate the optional field `tax_info`
      if (jsonObj.get("tax_info") != null && !jsonObj.get("tax_info").isJsonNull()) {
        TaxInfo.validateJsonObject(jsonObj.getAsJsonObject("tax_info"));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        AddressPortable2.validateJsonObject(jsonObj.getAsJsonObject("address"));
      }
      // validate the optional field `attributes`
      if (jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) {
        PaypalWalletAttributesResponse.validateJsonObject(jsonObj.getAsJsonObject("attributes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PaypalWalletResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PaypalWalletResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PaypalWalletResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PaypalWalletResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<PaypalWalletResponse>() {
           @Override
           public void write(JsonWriter out, PaypalWalletResponse value) throws IOException {
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
           public PaypalWalletResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PaypalWalletResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PaypalWalletResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PaypalWalletResponse
  * @throws IOException if the JSON string is invalid with respect to PaypalWalletResponse
  */
  public static PaypalWalletResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PaypalWalletResponse.class);
  }

 /**
  * Convert an instance of PaypalWalletResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

