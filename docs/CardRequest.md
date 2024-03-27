

# CardRequest

The payment card to use to fund a payment. Can be a credit or debit card.<blockquote><strong>Note:</strong> Passing card number, cvv and expiry directly via the API requires <a href=\"https://www.pcisecuritystandards.org/pci_security/completing_self_assessment\"> PCI SAQ D compliance</a>. <br>*PayPal offers a mechanism by which you do not have to take on the <strong>PCI SAQ D</strong> burden by using hosted fields - refer to <a href=\"https://developer.paypal.com/docs/checkout/advanced/integrate/\">this Integration Guide</a>*.</blockquote>

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
|**vaultId** | **String** | The PayPal-generated ID for the vaulted payment source. This ID should be stored on the merchant&#39;s server so the saved payment source can be used for future transactions. |  [optional] |
|**storedCredential** | [**CardStoredCredential**](CardStoredCredential.md) |  |  [optional] |
|**networkToken** | [**NetworkTokenRequest**](NetworkTokenRequest.md) |  |  [optional] |
|**experienceContext** | [**CardExperienceContext**](CardExperienceContext.md) |  |  [optional] |



