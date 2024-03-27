

# VenmoWalletResponse

Venmo wallet response.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**emailAddress** | **String** | The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters are allowed before and 255 characters are allowed after the &lt;code&gt;@&lt;/code&gt; sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted &lt;code&gt;@&lt;/code&gt; sign exists.&lt;/blockquote&gt; |  [optional] |
|**accountId** | **String** | The PayPal payer ID, which is a masked version of the PayPal account number intended for use with third parties. The account number is reversibly encrypted and a proprietary variant of Base32 is used to encode the result. |  [optional] |
|**userName** | **String** | The Venmo user name chosen by the user, also know as a Venmo handle. |  [optional] |
|**name** | [**Name2**](Name2.md) |  |  [optional] |
|**phoneNumber** | [**Phone2**](Phone2.md) |  |  [optional] |
|**address** | [**AddressPortable2**](AddressPortable2.md) |  |  [optional] |
|**attributes** | [**VenmoWalletAttributesResponse**](VenmoWalletAttributesResponse.md) |  |  [optional] |



