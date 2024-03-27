

# PurchaseUnitRequest

The purchase unit request. Includes required information for the payment contract.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The purchase description. The maximum length of the character is dependent on the type of characters used. The character length is specified assuming a US ASCII character. Depending on type of character; (e.g. accented character, Japanese characters) the number of characters that that can be specified as input might not equal the permissible max length. |  [optional] |
|**referenceId** | **String** | The API caller-provided external ID for the purchase unit. Required for multiple purchase units when you must update the order through &#x60;PATCH&#x60;. If you omit this value and the order contains only one purchase unit, PayPal sets this value to &#x60;default&#x60;. |  [optional] |
|**amount** | [**AmountWithBreakdown**](AmountWithBreakdown.md) |  |  |
|**payee** | [**Payee**](Payee.md) |  |  [optional] |
|**paymentInstruction** | [**PaymentInstruction**](PaymentInstruction.md) |  |  [optional] |
|**customId** | **String** | The API caller-provided external ID. Used to reconcile client transactions with PayPal transactions. Appears in transaction and settlement reports but is not visible to the payer. |  [optional] |
|**invoiceId** | **String** | The API caller-provided external invoice number for this order. Appears in both the payer&#39;s transaction history and the emails that the payer receives. |  [optional] |
|**softDescriptor** | **String** | The soft descriptor is the dynamic text used to construct the statement descriptor that appears on a payer&#39;s card statement.&lt;br&gt;&lt;br&gt;If an Order is paid using the \&quot;PayPal Wallet\&quot;, the statement descriptor will appear in following format on the payer&#39;s card statement: &lt;code&gt;&lt;var&gt;PAYPAL_prefix&lt;/var&gt;+(space)+&lt;var&gt;merchant_descriptor&lt;/var&gt;+(space)+ &lt;var&gt;soft_descriptor&lt;/var&gt;&lt;/code&gt;&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The merchant descriptor is the descriptor of the merchant’s payment receiving preferences which can be seen by logging into the merchant account https://www.sandbox.paypal.com/businessprofile/settings/info/edit&lt;/blockquote&gt;The &lt;code&gt;PAYPAL&lt;/code&gt; prefix uses 8 characters. Only the first 22 characters will be displayed in the statement. &lt;br&gt;For example, if:&lt;ul&gt;&lt;li&gt;The PayPal prefix toggle is &lt;code&gt;PAYPAL *&lt;/code&gt;.&lt;/li&gt;&lt;li&gt;The merchant descriptor in the profile is &lt;code&gt;Janes Gift&lt;/code&gt;.&lt;/li&gt;&lt;li&gt;The soft descriptor is &lt;code&gt;800-123-1234&lt;/code&gt;.&lt;/li&gt;&lt;/ul&gt;Then, the statement descriptor on the card is &lt;code&gt;PAYPAL * Janes Gift 80&lt;/code&gt;. |  [optional] |
|**items** | [**List&lt;Item&gt;**](Item.md) | An array of items that the customer purchases from the merchant. |  [optional] |
|**shipping** | [**ShippingDetail**](ShippingDetail.md) |  |  [optional] |
|**supplementaryData** | [**SupplementaryData**](SupplementaryData.md) |  |  [optional] |



