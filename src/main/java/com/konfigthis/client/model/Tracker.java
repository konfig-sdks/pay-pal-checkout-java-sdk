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
import com.konfigthis.client.model.TrackerItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * The tracking response on creation of tracker.
 */
@ApiModel(description = "The tracking response on creation of tracker.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Tracker {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Object status = null;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<TrackerItem> items = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<LinkDescription> links = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private String updateTime;

  public Tracker() {
  }

  
  public Tracker(
     String id, 
     List<LinkDescription> links
  ) {
    this();
    this.id = id;
    this.links = links;
  }

   /**
   * The tracker id.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tracker id.")

  public String getId() {
    return id;
  }




  public Tracker status(Object status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getStatus() {
    return status;
  }


  public void setStatus(Object status) {
    
    
    
    this.status = status;
  }


  public Tracker items(List<TrackerItem> items) {
    
    
    
    
    this.items = items;
    return this;
  }

  public Tracker addItemsItem(TrackerItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * An array of details of items in the shipment.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of details of items in the shipment.")

  public List<TrackerItem> getItems() {
    return items;
  }


  public void setItems(List<TrackerItem> items) {
    
    
    
    this.items = items;
  }


   /**
   * An array of request-related HATEOAS links.
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of request-related HATEOAS links.")

  public List<LinkDescription> getLinks() {
    return links;
  }




  public Tracker createTime(String createTime) {
    
    
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


  public Tracker updateTime(String updateTime) {
    
    
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
   * @return the Tracker instance itself
   */
  public Tracker putAdditionalProperty(String key, Object value) {
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
    Tracker tracker = (Tracker) o;
    return Objects.equals(this.id, tracker.id) &&
        Objects.equals(this.status, tracker.status) &&
        Objects.equals(this.items, tracker.items) &&
        Objects.equals(this.links, tracker.links) &&
        Objects.equals(this.createTime, tracker.createTime) &&
        Objects.equals(this.updateTime, tracker.updateTime)&&
        Objects.equals(this.additionalProperties, tracker.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, items, links, createTime, updateTime, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tracker {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("status");
    openapiFields.add("items");
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
  * @throws IOException if the JSON Object is invalid with respect to Tracker
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Tracker.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Tracker is not found in the empty JSON string", Tracker.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
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
            TrackerItem.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
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
       if (!Tracker.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Tracker' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Tracker> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Tracker.class));

       return (TypeAdapter<T>) new TypeAdapter<Tracker>() {
           @Override
           public void write(JsonWriter out, Tracker value) throws IOException {
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
           public Tracker read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Tracker instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Tracker given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Tracker
  * @throws IOException if the JSON string is invalid with respect to Tracker
  */
  public static Tracker fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Tracker.class);
  }

 /**
  * Convert an instance of Tracker to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

