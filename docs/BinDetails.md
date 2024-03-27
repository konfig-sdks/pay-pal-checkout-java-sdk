

# BinDetails

Bank Identification Number (BIN) details used to fund a payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bin** | **String** | The Bank Identification Number (BIN) signifies the number that is being used to identify the granular level details (except the PII information) of the card. |  [optional] |
|**issuingBank** | **String** | The issuer of the card instrument. |  [optional] |
|**binCountryCode** | **String** | The [two-character ISO 3166-1 code](https://raw.githubusercontent.com) that identifies the country or region.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The country code for Great Britain is &lt;code&gt;GB&lt;/code&gt; and not &lt;code&gt;UK&lt;/code&gt; as used in the top-level domain names for that country. Use the &#x60;C2&#x60; country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.&lt;/blockquote&gt; |  [optional] |
|**products** | **List&lt;String&gt;** | The type of card product assigned to the BIN by the issuer. These values are defined by the issuer and may change over time. Some examples include: PREPAID_GIFT, CONSUMER, CORPORATE. |  [optional] |



