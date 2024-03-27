

# OrderAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the order. |  [optional] [readonly] |
|**paymentSource** | [**PaymentSourceResponse**](PaymentSourceResponse.md) |  |  [optional] |
|**intent** | **CheckoutPaymentIntent** |  |  [optional] |
|**processingInstruction** | **ProcessingInstruction** |  |  [optional] |
|**payer** | [**Payer**](Payer.md) |  |  [optional] |
|**purchaseUnits** | [**List&lt;PurchaseUnit&gt;**](PurchaseUnit.md) | An array of purchase units. Each purchase unit establishes a contract between a customer and merchant. Each purchase unit represents either a full or partial order that the customer intends to purchase from the merchant. |  [optional] |
|**status** | **OrderStatus** |  |  [optional] |
|**links** | [**List&lt;LinkDescription&gt;**](LinkDescription.md) | An array of request-related HATEOAS links. To complete payer approval, use the &#x60;approve&#x60; link to redirect the payer. The API caller has 3 hours (default setting, this which can be changed by your account manager to 24/48/72 hours to accommodate your use case) from the time the order is created, to redirect your payer. Once redirected, the API caller has 3 hours for the payer to approve the order and either authorize or capture the order. If you are not using the PayPal JavaScript SDK to initiate PayPal Checkout (in context) ensure that you include &#x60;application_context.return_url&#x60; is specified or you will get \&quot;We&#39;re sorry, Things don&#39;t appear to be working at the moment\&quot; after the payer approves the payment. |  [optional] [readonly] |



