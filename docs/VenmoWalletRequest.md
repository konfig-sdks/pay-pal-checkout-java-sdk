

# VenmoWalletRequest

Information needed to pay using Venmo.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaultId** | **String** | The PayPal-generated ID for the vaulted payment source. This ID should be stored on the merchant&#39;s server so the saved payment source can be used for future transactions. |  [optional] |
|**emailAddress** | **String** | The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters are allowed before and 255 characters are allowed after the &lt;code&gt;@&lt;/code&gt; sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted &lt;code&gt;@&lt;/code&gt; sign exists.&lt;/blockquote&gt; |  [optional] |
|**experienceContext** | [**VenmoWalletExperienceContext**](VenmoWalletExperienceContext.md) |  |  [optional] |
|**attributes** | [**VenmoWalletAttributes**](VenmoWalletAttributes.md) |  |  [optional] |



