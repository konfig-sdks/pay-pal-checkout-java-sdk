

# BlikRequest

Information needed to pay using BLIK.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The full name representation like Mr J Smith. |  |
|**countryCode** | **String** | The [two-character ISO 3166-1 code](https://raw.githubusercontent.com) that identifies the country or region.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The country code for Great Britain is &lt;code&gt;GB&lt;/code&gt; and not &lt;code&gt;UK&lt;/code&gt; as used in the top-level domain names for that country. Use the &#x60;C2&#x60; country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.&lt;/blockquote&gt; |  |
|**email** | **String** | The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters are allowed before and 255 characters are allowed after the &lt;code&gt;@&lt;/code&gt; sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted &lt;code&gt;@&lt;/code&gt; sign exists.&lt;/blockquote&gt; |  [optional] |
|**experienceContext** | [**BlikExperienceContext**](BlikExperienceContext.md) |  |  [optional] |
|**level0** | [**BlikSeamless**](BlikSeamless.md) |  |  [optional] |
|**oneClick** | [**BlikOneClick**](BlikOneClick.md) |  |  [optional] |



