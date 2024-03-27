

# PurchaseUnit

The purchase unit details. Used to capture required information for the payment contract.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The purchase description. |  [optional] |
|**referenceId** | **String** | The API caller-provided external ID for the purchase unit. Required for multiple purchase units when you must update the order through &#x60;PATCH&#x60;. If you omit this value and the order contains only one purchase unit, PayPal sets this value to &#x60;default&#x60;. &lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; If there are multiple purchase units, &lt;code&gt;reference_id&lt;/code&gt; is required for each purchase unit.&lt;/blockquote&gt; |  [optional] |
|**amount** | [**AmountWithBreakdown**](AmountWithBreakdown.md) |  |  [optional] |
|**payee** | [**Payee**](Payee.md) |  |  [optional] |
|**paymentInstruction** | [**PaymentInstruction**](PaymentInstruction.md) |  |  [optional] |
|**customId** | **String** | The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports. |  [optional] |
|**invoiceId** | **String** | The API caller-provided external invoice ID for this order. |  [optional] |
|**id** | **String** | The PayPal-generated ID for the purchase unit. This ID appears in both the payer&#39;s transaction history and the emails that the payer receives. In addition, this ID is available in transaction and settlement reports that merchants and API callers can use to reconcile transactions. This ID is only available when an order is saved by calling &lt;code&gt;v2/checkout/orders/id/save&lt;/code&gt;. |  [optional] |
|**softDescriptor** | **String** | The payment descriptor on account transactions on the customer&#39;s credit card statement, that PayPal sends to processors. The maximum length of the soft descriptor information that you can pass in the API field is 22 characters, in the following format:&lt;code&gt;22 - len(PAYPAL * (8)) - len(&lt;var&gt;Descriptor in Payment Receiving Preferences of Merchant account&lt;/var&gt; + 1)&lt;/code&gt;The PAYPAL prefix uses 8 characters.&lt;br/&gt;&lt;br/&gt;The soft descriptor supports the following ASCII characters:&lt;ul&gt;&lt;li&gt;Alphanumeric characters&lt;/li&gt;&lt;li&gt;Dashes&lt;/li&gt;&lt;li&gt;Asterisks&lt;/li&gt;&lt;li&gt;Periods (.)&lt;/li&gt;&lt;li&gt;Spaces&lt;/li&gt;&lt;/ul&gt;For Wallet payments marketplace integrations:&lt;ul&gt;&lt;li&gt;The merchant descriptor in the Payment Receiving Preferences must be the marketplace name.&lt;/li&gt;&lt;li&gt;You can&#39;t use the remaining space to show the customer service number.&lt;/li&gt;&lt;li&gt;The remaining spaces can be a combination of seller name and country.&lt;/li&gt;&lt;/ul&gt;&lt;br/&gt;For unbranded payments (Direct Card) marketplace integrations, use a combination of the seller name and phone number. |  [optional] |
|**items** | [**List&lt;Item&gt;**](Item.md) | An array of items that the customer purchases from the merchant. |  [optional] |
|**shipping** | [**ShippingWithTrackingDetails**](ShippingWithTrackingDetails.md) |  |  [optional] |
|**supplementaryData** | [**SupplementaryData**](SupplementaryData.md) |  |  [optional] |
|**payments** | [**PaymentCollection**](PaymentCollection.md) |  |  [optional] |



