

# BlikExperienceContext

Customizes the payer experience during the approval process for the BLIK payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**brandName** | **String** | The label that overrides the business name in the PayPal account on the PayPal site. The pattern is defined by an external party and supports Unicode. |  [optional] |
|**locale** | **String** | The [language tag](https://tools.ietf.org/html/bcp47#section-2) for the language in which to localize the error-related strings, such as messages, issues, and suggested actions. The tag is made up of the [ISO 639-2 language code](https://www.loc.gov/standards/iso639-2/php/code_list.php), the optional [ISO-15924 script tag](https://www.unicode.org/iso15924/codelists.html), and the [ISO-3166 alpha-2 country code](https://raw.githubusercontent.com) or [M49 region code](https://unstats.un.org/unsd/methodology/m49/). |  [optional] |
|**shippingPreference** | [**ShippingPreferenceEnum**](#ShippingPreferenceEnum) | The location from which the shipping address is derived. |  [optional] |
|**returnUrl** | **URI** | Describes the URL. |  [optional] |
|**cancelUrl** | **URI** | Describes the URL. |  [optional] |
|**consumerIp** | **String** | An Internet Protocol address (IP address). This address assigns a numerical label to each device that is connected to a computer network through the Internet Protocol. Supports IPv4 and IPv6 addresses. |  [optional] |
|**consumerUserAgent** | **String** | The payer&#39;s User Agent. For example, Mozilla/5.0 (Macintosh; Intel Mac OS X x.y; rv:42.0). |  [optional] |



## Enum: ShippingPreferenceEnum

| Name | Value |
|---- | -----|
| GET_FROM_FILE | &quot;GET_FROM_FILE&quot; |
| NO_SHIPPING | &quot;NO_SHIPPING&quot; |
| SET_PROVIDED_ADDRESS | &quot;SET_PROVIDED_ADDRESS&quot; |



