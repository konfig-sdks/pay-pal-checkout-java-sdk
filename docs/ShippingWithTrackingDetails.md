

# ShippingWithTrackingDetails

The order shipping details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**Name**](Name.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | A classification for the method of purchase fulfillment (e.g shipping, in-store pickup, etc). Either &#x60;type&#x60; or &#x60;options&#x60; may be present, but not both. |  [optional] |
|**options** | [**List&lt;ShippingOption&gt;**](ShippingOption.md) | An array of shipping options that the payee or merchant offers to the payer to ship or pick up their items. |  [optional] |
|**address** | [**AddressPortable**](AddressPortable.md) |  |  [optional] |
|**trackers** | [**List&lt;Tracker&gt;**](Tracker.md) | An array of trackers for a transaction. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SHIPPING | &quot;SHIPPING&quot; |
| PICKUP_IN_PERSON | &quot;PICKUP_IN_PERSON&quot; |
| PICKUP_IN_STORE | &quot;PICKUP_IN_STORE&quot; |
| PICKUP_FROM_PERSON | &quot;PICKUP_FROM_PERSON&quot; |



