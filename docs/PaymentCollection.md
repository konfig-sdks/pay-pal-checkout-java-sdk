

# PaymentCollection

The collection of payments, or transactions, for a purchase unit in an order. For example, authorized payments, captured payments, and refunds.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorizations** | [**List&lt;AuthorizationWithAdditionalData&gt;**](AuthorizationWithAdditionalData.md) | An array of authorized payments for a purchase unit. A purchase unit can have zero or more authorized payments. |  [optional] |
|**captures** | [**List&lt;Capture&gt;**](Capture.md) | An array of captured payments for a purchase unit. A purchase unit can have zero or more captured payments. |  [optional] |
|**refunds** | [**List&lt;Refund&gt;**](Refund.md) | An array of refunds for a purchase unit. A purchase unit can have zero or more refunds. |  [optional] |



