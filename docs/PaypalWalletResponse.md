

# PaypalWalletResponse

The PayPal Wallet response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailAddress** | **String** | The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters are allowed before and 255 characters are allowed after the &lt;code&gt;@&lt;/code&gt; sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted &lt;code&gt;@&lt;/code&gt; sign exists.&lt;/blockquote&gt; |  [optional] |
|**accountId** | **String** | The PayPal payer ID, which is a masked version of the PayPal account number intended for use with third parties. The account number is reversibly encrypted and a proprietary variant of Base32 is used to encode the result. |  [optional] |
|**accountStatus** | [**AccountStatusEnum**](#AccountStatusEnum) | The account status indicates whether the buyer has verified the financial details associated with their PayPal account. |  [optional] [readonly] |
|**name** | [**Name2**](Name2.md) |  |  [optional] |
|**phoneType** | **PhoneType2** |  |  [optional] |
|**phoneNumber** | [**Phone2**](Phone2.md) |  |  [optional] |
|**birthDate** | **String** | The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard &#x60;date_time&#x60; type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years. |  [optional] |
|**taxInfo** | [**TaxInfo**](TaxInfo.md) |  |  [optional] |
|**address** | [**AddressPortable2**](AddressPortable2.md) |  |  [optional] |
|**attributes** | [**PaypalWalletAttributesResponse**](PaypalWalletAttributesResponse.md) |  |  [optional] |



## Enum: AccountStatusEnum

| Name | Value |
|---- | -----|
| VERIFIED | &quot;VERIFIED&quot; |
| UNVERIFIED | &quot;UNVERIFIED&quot; |



