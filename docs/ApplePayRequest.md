

# ApplePayRequest

Information needed to pay using ApplePay.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | ApplePay transaction identifier, this will be the unique identifier for this transaction provided by Apple. The pattern is defined by an external party and supports Unicode. |  [optional] |
|**name** | **String** | The full name representation like Mr J Smith. |  [optional] |
|**emailAddress** | **String** | The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters are allowed before and 255 characters are allowed after the &lt;code&gt;@&lt;/code&gt; sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted &lt;code&gt;@&lt;/code&gt; sign exists.&lt;/blockquote&gt; |  [optional] |
|**phoneNumber** | [**Phone**](Phone.md) |  |  [optional] |
|**decryptedToken** | [**ApplePayDecryptedTokenData**](ApplePayDecryptedTokenData.md) |  |  [optional] |
|**storedCredential** | [**CardStoredCredential**](CardStoredCredential.md) |  |  [optional] |
|**vaultId** | **String** | The PayPal-generated ID for the vaulted payment source. This ID should be stored on the merchant&#39;s server so the saved payment source can be used for future transactions. |  [optional] |
|**attributes** | **Object** |  |  [optional] |



