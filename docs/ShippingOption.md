

# ShippingOption

The options that the payee or merchant offers to the payer to ship or pick up their items.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | A unique ID that identifies a payer-selected shipping option. |  |
|**label** | **String** | A description that the payer sees, which helps them choose an appropriate shipping option. For example, &#x60;Free Shipping&#x60;, &#x60;USPS Priority Shipping&#x60;, &#x60;Expédition prioritaire USPS&#x60;, or &#x60;USPS yōuxiān fā huò&#x60;. Localize this description to the payer&#39;s locale. |  |
|**type** | **ShippingType** |  |  [optional] |
|**amount** | [**Money**](Money.md) |  |  [optional] |
|**selected** | **Boolean** | If the API request sets &#x60;selected &#x3D; true&#x60;, it represents the shipping option that the payee or merchant expects to be pre-selected for the payer when they first view the &#x60;shipping.options&#x60; in the PayPal Checkout experience. As part of the response if a &#x60;shipping.option&#x60; contains &#x60;selected&#x3D;true&#x60;, it represents the shipping option that the payer selected during the course of checkout with PayPal. Only one &#x60;shipping.option&#x60; can be set to &#x60;selected&#x3D;true&#x60;. |  |



