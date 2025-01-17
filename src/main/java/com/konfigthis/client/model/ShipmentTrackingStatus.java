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
 * The status of the item shipment. For allowed values, see &lt;a href&#x3D;\&quot;/docs/tracking/reference/shipping-status/\&quot;&gt;Shipping Statuses&lt;/a&gt;.
 */
@JsonAdapter(ShipmentTrackingStatus.Adapter.class)public enum ShipmentTrackingStatus {
  
  CANCELLED("CANCELLED"),
  
  DELIVERED("DELIVERED"),
  
  LOCAL_PICKUP("LOCAL_PICKUP"),
  
  ON_HOLD("ON_HOLD"),
  
  SHIPPED("SHIPPED"),
  
  SHIPMENT_CREATED("SHIPMENT_CREATED"),
  
  DROPPED_OFF("DROPPED_OFF"),
  
  IN_TRANSIT("IN_TRANSIT"),
  
  RETURNED("RETURNED"),
  
  LABEL_PRINTED("LABEL_PRINTED"),
  
  ERROR("ERROR"),
  
  UNCONFIRMED("UNCONFIRMED"),
  
  PICKUP_FAILED("PICKUP_FAILED"),
  
  DELIVERY_DELAYED("DELIVERY_DELAYED"),
  
  DELIVERY_SCHEDULED("DELIVERY_SCHEDULED"),
  
  DELIVERY_FAILED("DELIVERY_FAILED"),
  
  INRETURN("INRETURN"),
  
  IN_PROCESS("IN_PROCESS"),
  
  NEW("NEW"),
  
  VOID("VOID"),
  
  PROCESSED("PROCESSED"),
  
  NOT_SHIPPED("NOT_SHIPPED"),
  
  COMPLETED("COMPLETED");

  private String value;

  ShipmentTrackingStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ShipmentTrackingStatus fromValue(String value) {
    for (ShipmentTrackingStatus b : ShipmentTrackingStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ShipmentTrackingStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ShipmentTrackingStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ShipmentTrackingStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ShipmentTrackingStatus.fromValue(value);
    }
  }
}

