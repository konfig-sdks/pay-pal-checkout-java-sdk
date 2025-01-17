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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * A classification for the method of purchase fulfillment.
 */
@JsonAdapter(ShippingType.Adapter.class)public enum ShippingType {
  
  SHIPPING("SHIPPING"),
  
  PICKUP("PICKUP"),
  
  PICKUP_IN_STORE("PICKUP_IN_STORE"),
  
  PICKUP_FROM_PERSON("PICKUP_FROM_PERSON");

  private String value;

  ShippingType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ShippingType fromValue(String value) {
    for (ShippingType b : ShippingType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ShippingType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ShippingType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ShippingType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ShippingType.fromValue(value);
    }
  }
}

