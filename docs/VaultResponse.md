

# VaultResponse

The details about a saved payment source.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The PayPal-generated ID for the saved payment source. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The vault status. |  [optional] |
|**customer** | [**Customer**](Customer.md) |  |  [optional] |
|**links** | [**List&lt;LinkDescription&gt;**](LinkDescription.md) | An array of request-related HATEOAS links. |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| VAULTED | &quot;VAULTED&quot; |
| CREATED | &quot;CREATED&quot; |
| APPROVED | &quot;APPROVED&quot; |



