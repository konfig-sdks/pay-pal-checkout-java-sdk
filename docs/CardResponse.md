

# CardResponse

The payment card to use to fund a payment. Card can be a credit or debit card.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The card holder&#39;s name as it appears on the card. |  [optional] |
|**lastDigits** | **String** | The last digits of the payment card. |  [optional] [readonly] |
|**brand** | **CardBrand** |  |  [optional] |
|**availableNetworks** | **List&lt;CardBrand&gt;** | Array of brands or networks associated with the card. |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | The payment card type. |  [optional] [readonly] |
|**authenticationResult** | [**AuthenticationResponse**](AuthenticationResponse.md) |  |  [optional] |
|**attributes** | [**CardAttributesResponse**](CardAttributesResponse.md) |  |  [optional] |
|**fromRequest** | [**CardFromRequest**](CardFromRequest.md) |  |  [optional] |
|**expiry** | **String** | The year and month, in ISO-8601 &#x60;YYYY-MM&#x60; date format. See [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |
|**binDetails** | [**BinDetails**](BinDetails.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CREDIT | &quot;CREDIT&quot; |
| DEBIT | &quot;DEBIT&quot; |
| PREPAID | &quot;PREPAID&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |



