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
 * The funds that are held on behalf of the merchant.
 */
@JsonAdapter(DisbursementMode.Adapter.class)public enum DisbursementMode {
  
  INSTANT("INSTANT"),
  
  DELAYED("DELAYED");

  private String value;

  DisbursementMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DisbursementMode fromValue(String value) {
    for (DisbursementMode b : DisbursementMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DisbursementMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final DisbursementMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DisbursementMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DisbursementMode.fromValue(value);
    }
  }
}

