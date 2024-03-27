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
 * The person or party who initiated or triggered the payment.
 */
@JsonAdapter(PaymentInitiator.Adapter.class)public enum PaymentInitiator {
  
  CUSTOMER("CUSTOMER"),
  
  MERCHANT("MERCHANT");

  private String value;

  PaymentInitiator(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentInitiator fromValue(String value) {
    for (PaymentInitiator b : PaymentInitiator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PaymentInitiator> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentInitiator enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentInitiator read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentInitiator.fromValue(value);
    }
  }
}
