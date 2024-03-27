

# Payer

The customer who approves and pays for the order. The customer is also known as the payer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailAddress** | **String** | The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters are allowed before and 255 characters are allowed after the &lt;code&gt;@&lt;/code&gt; sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted &lt;code&gt;@&lt;/code&gt; sign exists.&lt;/blockquote&gt; |  [optional] |
|**payerId** | **String** | The account identifier for a PayPal account. |  [optional] |
|**name** | [**Name**](Name.md) |  |  [optional] |
|**phone** | [**PhoneWithType**](PhoneWithType.md) |  |  [optional] |
|**birthDate** | **String** | The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard &#x60;date_time&#x60; type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years. |  [optional] |
|**taxInfo** | [**TaxInfo**](TaxInfo.md) |  |  [optional] |
|**address** | [**AddressPortable**](AddressPortable.md) |  |  [optional] |



