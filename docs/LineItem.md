

# LineItem

The line items for this purchase. If your merchant account has been configured for Level 3 processing this field will be passed to the processor on your behalf.

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
|**commodityCode** | **String** | Code used to classify items purchased and track the total amount spent across various categories of products and services. Different corporate purchasing organizations may use different standards, but the United Nations Standard Products and Services Code (UNSPSC) is frequently used. |  [optional] |
|**discountAmount** | [**Money**](Money.md) |  |  [optional] |
|**totalAmount** | [**Money**](Money.md) |  |  [optional] |
|**unitOfMeasure** | **String** | Unit of measure is a standard used to express the magnitude of a quantity in international trade. Most commonly used (but not limited to) examples are: Acre (ACR), Ampere (AMP), Centigram (CGM), Centimetre (CMT), Cubic inch (INQ), Cubic metre (MTQ), Fluid ounce (OZA), Foot (FOT), Hour (HUR), Item (ITM), Kilogram (KGM), Kilometre (KMT), Kilowatt (KWT), Liquid gallon (GLL), Liter (LTR), Pounds (LBS), Square foot (FTK). |  [optional] |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| DIGITAL_GOODS | &quot;DIGITAL_GOODS&quot; |
| PHYSICAL_GOODS | &quot;PHYSICAL_GOODS&quot; |
| DONATION | &quot;DONATION&quot; |



