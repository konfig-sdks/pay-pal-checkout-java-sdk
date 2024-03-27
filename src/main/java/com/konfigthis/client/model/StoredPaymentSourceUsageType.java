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
 * Indicates if this is a &#x60;first&#x60; or &#x60;subsequent&#x60; payment using a stored payment source (also referred to as stored credential or card on file).
 */
@JsonAdapter(StoredPaymentSourceUsageType.Adapter.class)public enum StoredPaymentSourceUsageType {
  
  FIRST("FIRST"),
  
  SUBSEQUENT("SUBSEQUENT"),
  
  DERIVED("DERIVED");

  private String value;

  StoredPaymentSourceUsageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StoredPaymentSourceUsageType fromValue(String value) {
    for (StoredPaymentSourceUsageType b : StoredPaymentSourceUsageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StoredPaymentSourceUsageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final StoredPaymentSourceUsageType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StoredPaymentSourceUsageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StoredPaymentSourceUsageType.fromValue(value);
    }
  }
}

