

# Item

The details for the items to be purchased.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The detailed item description. |  [optional] |
|**name** | **String** | The item name or title. |  |
|**unitAmount** | [**Money**](Money.md) |  |  |
|**tax** | [**Money**](Money.md) |  |  [optional] |
|**quantity** | **String** | The item quantity. Must be a whole number. |  |
|**sku** | **String** | The stock keeping unit (SKU) for the item. |  [optional] |
|**category** | [**CategoryEnum**](#CategoryEnum) | The item category type. |  [optional] |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| DIGITAL_GOODS | &quot;DIGITAL_GOODS&quot; |
| PHYSICAL_GOODS | &quot;PHYSICAL_GOODS&quot; |
| DONATION | &quot;DONATION&quot; |



