

# ApplePayDecryptedTokenData

Information about the Payment data obtained by decrypting Apple Pay token.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionAmount** | [**Money2**](Money2.md) |  |  [optional] |
|**tokenizedCard** | [**Card**](Card.md) |  |  |
|**deviceManufacturerId** | **String** | Apple Pay Hex-encoded device manufacturer identifier. The pattern is defined by an external party and supports Unicode. |  [optional] |
|**paymentDataType** | [**PaymentDataTypeEnum**](#PaymentDataTypeEnum) | Indicates the type of payment data passed, in case of Non China the payment data is 3DSECURE and for China it is EMV. |  [optional] |
|**paymentData** | [**ApplePayPaymentData**](ApplePayPaymentData.md) |  |  [optional] |



## Enum: PaymentDataTypeEnum

| Name | Value |
|---- | -----|
| _3DSECURE | &quot;3DSECURE&quot; |
| EMV | &quot;EMV&quot; |



