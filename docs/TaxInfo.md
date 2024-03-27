

# TaxInfo

The tax ID of the customer. The customer is also known as the payer. Both `tax_id` and `tax_id_type` are required.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**taxId** | **String** | The customer&#39;s tax ID value. |  |
|**taxIdType** | [**TaxIdTypeEnum**](#TaxIdTypeEnum) | The customer&#39;s tax ID type. |  |



## Enum: TaxIdTypeEnum

| Name | Value |
|---- | -----|
| CPF | &quot;BR_CPF&quot; |
| CNPJ | &quot;BR_CNPJ&quot; |



