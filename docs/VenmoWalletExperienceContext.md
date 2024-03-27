

# VenmoWalletExperienceContext

Customizes the buyer experience during the approval process for payment with Venmo.<blockquote><strong>Note:</strong> Partners and Marketplaces might configure <code>shipping_preference</code> during partner account setup, which overrides the request values.</blockquote>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**brandName** | **String** | The business name of the merchant. The pattern is defined by an external party and supports Unicode. |  [optional] |
|**shippingPreference** | [**ShippingPreferenceEnum**](#ShippingPreferenceEnum) | The location from which the shipping address is derived. |  [optional] |



## Enum: ShippingPreferenceEnum

| Name | Value |
|---- | -----|
| GET_FROM_FILE | &quot;GET_FROM_FILE&quot; |
| NO_SHIPPING | &quot;NO_SHIPPING&quot; |
| SET_PROVIDED_ADDRESS | &quot;SET_PROVIDED_ADDRESS&quot; |



