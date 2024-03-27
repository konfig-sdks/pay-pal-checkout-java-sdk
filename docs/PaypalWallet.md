

# PaypalWallet

A resource that identifies a PayPal Wallet is used for payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultId** | **String** | The PayPal-generated ID for the vaulted payment source. This ID should be stored on the merchant&#39;s server so the saved payment source can be used for future transactions. |  [optional] |
|**emailAddress** | **String** | The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters are allowed before and 255 characters are allowed after the &lt;code&gt;@&lt;/code&gt; sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted &lt;code&gt;@&lt;/code&gt; sign exists.&lt;/blockquote&gt; |  [optional] |
|**name** | [**Name2**](Name2.md) |  |  [optional] |
|**phone** | [**PhoneWithType**](PhoneWithType.md) |  |  [optional] |
|**birthDate** | **String** | The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard &#x60;date_time&#x60; type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years. |  [optional] |
|**taxInfo** | [**TaxInfo**](TaxInfo.md) |  |  [optional] |
|**address** | [**AddressPortable2**](AddressPortable2.md) |  |  [optional] |
|**attributes** | [**PaypalWalletAttributes**](PaypalWalletAttributes.md) |  |  [optional] |
|**experienceContext** | [**PaypalWalletExperienceContext**](PaypalWalletExperienceContext.md) |  |  [optional] |
|**billingAgreementId** | **String** | The PayPal billing agreement ID. References an approved recurring payment for goods or services. |  [optional] |



