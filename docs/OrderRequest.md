

# OrderRequest

The order request details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**intent** | **CheckoutPaymentIntent** |  |  |
|**payer** | [**Payer**](Payer.md) |  |  [optional] |
|**purchaseUnits** | [**List&lt;PurchaseUnitRequest&gt;**](PurchaseUnitRequest.md) | An array of purchase units. Each purchase unit establishes a contract between a payer and the payee. Each purchase unit represents either a full or partial order that the payer intends to purchase from the payee. |  |
|**paymentSource** | [**PaymentSource**](PaymentSource.md) |  |  [optional] |
|**applicationContext** | [**OrderApplicationContext**](OrderApplicationContext.md) |  |  [optional] |



