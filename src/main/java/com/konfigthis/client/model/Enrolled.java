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
 * Status of Authentication eligibility.
 */
@JsonAdapter(Enrolled.Adapter.class)public enum Enrolled {
  
  Y("Y"),
  
  N("N"),
  
  U("U"),
  
  B("B");

  private String value;

  Enrolled(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Enrolled fromValue(String value) {
    for (Enrolled b : Enrolled.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Enrolled> {
    @Override
    public void write(final JsonWriter jsonWriter, final Enrolled enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Enrolled read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Enrolled.fromValue(value);
    }
  }
}

