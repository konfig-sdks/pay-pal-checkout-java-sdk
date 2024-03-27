

# OrderTrackerRequest

The tracking details of an order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **String** | The PayPal transaction ID. |  |
|**trackingNumber** | **String** | The tracking number for the shipment. This property supports Unicode. |  [optional] |
|**trackingNumberType** | **ShipmentTrackingNumberType** |  |  [optional] |
|**status** | **ShipmentTrackingStatus** |  |  |
|**shipmentDate** | **String** | The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard &#x60;date_time&#x60; type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years. |  [optional] |
|**carrier** | **ShipmentCarrier** |  |  [optional] |
|**carrierNameOther** | **String** | The name of the carrier for the shipment. Provide this value only if the carrier parameter is OTHER. This property supports Unicode. |  [optional] |
|**postagePaymentId** | **String** | The postage payment ID. This property supports Unicode. |  [optional] [readonly] |
|**notifyBuyer** | **Boolean** | If true, sends an email notification to the buyer of the PayPal transaction. The email contains the tracking information that was uploaded through the API. |  [optional] |
|**quantity** | **Integer** | The quantity of items shipped. |  [optional] [readonly] |
|**trackingNumberValidated** | **Boolean** | Indicates whether the carrier validated the tracking number. |  [optional] [readonly] |
|**lastUpdatedTime** | **String** | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt; |  [optional] |
|**shipmentDirection** | [**ShipmentDirectionEnum**](#ShipmentDirectionEnum) | To denote whether the shipment is sent forward to the receiver or returned back. |  [optional] |
|**shipmentUploader** | [**ShipmentUploaderEnum**](#ShipmentUploaderEnum) | To denote which party uploaded the shipment tracking info. |  [optional] [readonly] |
|**captureId** | **String** | The PayPal capture ID. |  |
|**notifyPayer** | **Boolean** | If true, sends an email notification to the payer of the PayPal transaction. The email contains the tracking information that was uploaded through the API. |  [optional] |
|**items** | [**List&lt;TrackerItem&gt;**](TrackerItem.md) | An array of details of items in the shipment. |  [optional] |



## Enum: ShipmentDirectionEnum

| Name | Value |
|---- | -----|
| FORWARD | &quot;FORWARD&quot; |
| RETURN | &quot;RETURN&quot; |



## Enum: ShipmentUploaderEnum

| Name | Value |
|---- | -----|
| MERCHANT | &quot;MERCHANT&quot; |
| CONSUMER | &quot;CONSUMER&quot; |
| PARTNER | &quot;PARTNER&quot; |



