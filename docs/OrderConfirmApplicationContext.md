

# OrderConfirmApplicationContext

Customizes the payer confirmation experience.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**brandName** | **String** | Label to present to your payer as part of the PayPal hosted web experience. |  [optional] |
|**locale** | **String** | The [language tag](https://tools.ietf.org/html/bcp47#section-2) for the language in which to localize the error-related strings, such as messages, issues, and suggested actions. The tag is made up of the [ISO 639-2 language code](https://www.loc.gov/standards/iso639-2/php/code_list.php), the optional [ISO-15924 script tag](https://www.unicode.org/iso15924/codelists.html), and the [ISO-3166 alpha-2 country code](https://raw.githubusercontent.com) or [M49 region code](https://unstats.un.org/unsd/methodology/m49/). |  [optional] |
|**returnUrl** | **URI** | The URL where the customer is redirected after the customer approves the payment. |  [optional] |
|**cancelUrl** | **URI** | The URL where the customer is redirected after the customer cancels the payment. |  [optional] |
|**storedPaymentSource** | [**StoredPaymentSource**](StoredPaymentSource.md) |  |  [optional] |



