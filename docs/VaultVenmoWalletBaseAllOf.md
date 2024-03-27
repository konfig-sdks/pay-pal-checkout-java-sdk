

# VaultVenmoWalletBaseAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description displayed to Venmo consumer on the approval flow for Venmo, as well as on the Venmo payment token management experience on Venmo.com. |  [optional] |
|**usagePattern** | [**UsagePatternEnum**](#UsagePatternEnum) | Expected business/pricing model for the billing agreement. |  [optional] |
|**usageType** | [**UsageTypeEnum**](#UsageTypeEnum) | The usage type associated with the Venmo payment token. |  [optional] |
|**customerType** | [**CustomerTypeEnum**](#CustomerTypeEnum) | The customer type associated with the Venmo payment token. This is to indicate whether the customer acting on the merchant / platform is either a business or a consumer. |  [optional] |
|**permitMultiplePaymentTokens** | **Boolean** | Create multiple payment tokens for the same payer, merchant/platform combination. Use this when the customer has not logged in at merchant/platform. The payment token thus generated, can then also be used to create the customer account at merchant/platform. Use this also when multiple payment tokens are required for the same payer, different customer at merchant/platform. This helps to identify customers distinctly even though they may share the same Venmo account. |  [optional] |



## Enum: UsagePatternEnum

| Name | Value |
|---- | -----|
| IMMEDIATE | &quot;IMMEDIATE&quot; |
| DEFERRED | &quot;DEFERRED&quot; |
| RECURRING_PREPAID | &quot;RECURRING_PREPAID&quot; |
| RECURRING_POSTPAID | &quot;RECURRING_POSTPAID&quot; |
| THRESHOLD_PREPAID | &quot;THRESHOLD_PREPAID&quot; |
| THRESHOLD_POSTPAID | &quot;THRESHOLD_POSTPAID&quot; |



## Enum: UsageTypeEnum

| Name | Value |
|---- | -----|
| MERCHANT | &quot;MERCHANT&quot; |
| PLATFORM | &quot;PLATFORM&quot; |



## Enum: CustomerTypeEnum

| Name | Value |
|---- | -----|
| CONSUMER | &quot;CONSUMER&quot; |
| BUSINESS | &quot;BUSINESS&quot; |



