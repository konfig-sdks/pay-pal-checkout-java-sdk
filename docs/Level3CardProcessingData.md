

# Level3CardProcessingData

The level 3 card processing data collections, If your merchant account has been configured for Level 3 processing this field will be passed to the processor on your behalf. Please contact your PayPal Technical Account Manager to define level 3 data for your business.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**shippingAmount** | [**Money**](Money.md) |  |  [optional] |
|**dutyAmount** | [**Money**](Money.md) |  |  [optional] |
|**discountAmount** | [**Money**](Money.md) |  |  [optional] |
|**shippingAddress** | [**AddressPortable**](AddressPortable.md) |  |  [optional] |
|**shipsFromPostalCode** | **String** | Use this field to specify the postal code of the shipping location. |  [optional] |
|**lineItems** | [**List&lt;LineItem&gt;**](LineItem.md) | A list of the items that were purchased with this payment. If your merchant account has been configured for Level 3 processing this field will be passed to the processor on your behalf. |  [optional] |



