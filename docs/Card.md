

# Card

The payment card to use to fund a payment. Can be a credit or debit card.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier of the instrument. |  [optional] |
|**name** | **String** | The card holder&#39;s name as it appears on the card. |  [optional] |
|**number** | **String** | The primary account number (PAN) for the payment card. |  [optional] |
|**expiry** | **String** | The year and month, in ISO-8601 &#x60;YYYY-MM&#x60; date format. See [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). |  [optional] |
|**securityCode** | **String** | The three- or four-digit security code of the card. Also known as the CVV, CVC, CVN, CVE, or CID. This parameter cannot be present in the request when &#x60;payment_initiator&#x3D;MERCHANT&#x60;. |  [optional] |
|**lastDigits** | **String** | The last digits of the payment card. |  [optional] [readonly] |
|**cardType** | **CardBrand** |  |  [optional] |
|**type** | **CardType** |  |  [optional] |
|**brand** | **CardBrand** |  |  [optional] |
|**billingAddress** | [**AddressPortable**](AddressPortable.md) |  |  [optional] |
|**attributes** | [**CardAttributes**](CardAttributes.md) |  |  [optional] |



