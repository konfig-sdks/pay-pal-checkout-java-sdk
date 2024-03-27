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
 * Defines how and when the payment source gets vaulted.
 */
@JsonAdapter(StoreInVaultInstruction.Adapter.class)public enum StoreInVaultInstruction {
  
  ON_SUCCESS("ON_SUCCESS");

  private String value;

  StoreInVaultInstruction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StoreInVaultInstruction fromValue(String value) {
    for (StoreInVaultInstruction b : StoreInVaultInstruction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StoreInVaultInstruction> {
    @Override
    public void write(final JsonWriter jsonWriter, final StoreInVaultInstruction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StoreInVaultInstruction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StoreInVaultInstruction.fromValue(value);
    }
  }
}

