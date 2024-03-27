

# StoredPaymentSource

Provides additional details to process a payment using a `payment_source` that has been stored or is intended to be stored (also referred to as stored_credential or card-on-file).<br/>Parameter compatibility:<br/><ul><li>`payment_type=ONE_TIME` is compatible only with `payment_initiator=CUSTOMER`.</li><li>`usage=FIRST` is compatible only with `payment_initiator=CUSTOMER`.</li><li>`previous_transaction_reference` or `previous_network_transaction_reference` is compatible only with `payment_initiator=MERCHANT`.</li><li>Only one of the parameters - `previous_transaction_reference` and `previous_network_transaction_reference` - can be present in the request.</li></ul>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**paymentInitiator** | **PaymentInitiator** |  |  |
|**paymentType** | **StoredPaymentSourcePaymentType** |  |  |
|**usage** | **StoredPaymentSourceUsageType** |  |  [optional] |
|**previousNetworkTransactionReference** | [**NetworkTransactionReference**](NetworkTransactionReference.md) |  |  [optional] |



