

# PaypalWalletVaultResponse

The details about a saved PayPal Wallet payment source.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The PayPal-generated ID for the saved payment source. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The vault status. |  [optional] |
|**customer** | [**PaypalWalletCustomer**](PaypalWalletCustomer.md) |  |  [optional] |
|**links** | [**List&lt;LinkDescription&gt;**](LinkDescription.md) | An array of request-related HATEOAS links. |  [optional] [readonly] |
|**ownerId** | **Object** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| VAULTED | &quot;VAULTED&quot; |
| CREATED | &quot;CREATED&quot; |
| APPROVED | &quot;APPROVED&quot; |



