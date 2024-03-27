

# OrderApplicationContext

Customizes the payer experience during the approval process for the payment with PayPal.<blockquote><strong>Note:</strong> Partners and Marketplaces might configure <code>brand_name</code> and <code>shipping_preference</code> during partner account setup, which overrides the request values.</blockquote>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**brandName** | **String** | DEPRECATED. The label that overrides the business name in the PayPal account on the PayPal site. The fields in &#x60;application_context&#x60; are now available in the &#x60;experience_context&#x60; object under the &#x60;payment_source&#x60; which supports them (eg. &#x60;payment_source.paypal.experience_context.brand_name&#x60;). Please specify this field in the &#x60;experience_context&#x60; object instead of the &#x60;application_context&#x60; object. |  [optional] |
|**locale** | **String** | The [language tag](https://tools.ietf.org/html/bcp47#section-2) for the language in which to localize the error-related strings, such as messages, issues, and suggested actions. The tag is made up of the [ISO 639-2 language code](https://www.loc.gov/standards/iso639-2/php/code_list.php), the optional [ISO-15924 script tag](https://www.unicode.org/iso15924/codelists.html), and the [ISO-3166 alpha-2 country code](https://raw.githubusercontent.com) or [M49 region code](https://unstats.un.org/unsd/methodology/m49/). |  [optional] |
|**landingPage** | [**LandingPageEnum**](#LandingPageEnum) | DEPRECATED. DEPRECATED. The type of landing page to show on the PayPal site for customer checkout.  The fields in &#x60;application_context&#x60; are now available in the &#x60;experience_context&#x60; object under the &#x60;payment_source&#x60; which supports them (eg. &#x60;payment_source.paypal.experience_context.landing_page&#x60;). Please specify this field in the &#x60;experience_context&#x60; object instead of the &#x60;application_context&#x60; object. |  [optional] |
|**shippingPreference** | [**ShippingPreferenceEnum**](#ShippingPreferenceEnum) | DEPRECATED. DEPRECATED. The shipping preference:&lt;ul&gt;&lt;li&gt;Displays the shipping address to the customer.&lt;/li&gt;&lt;li&gt;Enables the customer to choose an address on the PayPal site.&lt;/li&gt;&lt;li&gt;Restricts the customer from changing the address during the payment-approval process.&lt;/li&gt;&lt;/ul&gt;.  The fields in &#x60;application_context&#x60; are now available in the &#x60;experience_context&#x60; object under the &#x60;payment_source&#x60; which supports them (eg. &#x60;payment_source.paypal.experience_context.shipping_preference&#x60;). Please specify this field in the &#x60;experience_context&#x60; object instead of the &#x60;application_context&#x60; object. |  [optional] |
|**userAction** | [**UserActionEnum**](#UserActionEnum) | DEPRECATED. Configures a &lt;strong&gt;Continue&lt;/strong&gt; or &lt;strong&gt;Pay Now&lt;/strong&gt; checkout flow.  The fields in &#x60;application_context&#x60; are now available in the &#x60;experience_context&#x60; object under the &#x60;payment_source&#x60; which supports them (eg. &#x60;payment_source.paypal.experience_context.user_action&#x60;). Please specify this field in the &#x60;experience_context&#x60; object instead of the &#x60;application_context&#x60; object. |  [optional] |
|**paymentMethod** | [**PaymentMethod**](PaymentMethod.md) |  |  [optional] |
|**returnUrl** | **URI** | DEPRECATED. The URL where the customer is redirected after the customer approves the payment. The fields in &#x60;application_context&#x60; are now available in the &#x60;experience_context&#x60; object under the &#x60;payment_source&#x60; which supports them (eg. &#x60;payment_source.paypal.experience_context.return_url&#x60;). Please specify this field in the &#x60;experience_context&#x60; object instead of the &#x60;application_context&#x60; object. |  [optional] |
|**cancelUrl** | **URI** | DEPRECATED. The URL where the customer is redirected after the customer cancels the payment. The fields in &#x60;application_context&#x60; are now available in the &#x60;experience_context&#x60; object under the &#x60;payment_source&#x60; which supports them (eg. &#x60;payment_source.paypal.experience_context.cancel_url&#x60;). Please specify this field in the &#x60;experience_context&#x60; object instead of the &#x60;application_context&#x60; object. |  [optional] |
|**storedPaymentSource** | [**StoredPaymentSource**](StoredPaymentSource.md) |  |  [optional] |



## Enum: LandingPageEnum

| Name | Value |
|---- | -----|
| LOGIN | &quot;LOGIN&quot; |
| BILLING | &quot;BILLING&quot; |
| NO_PREFERENCE | &quot;NO_PREFERENCE&quot; |



## Enum: ShippingPreferenceEnum

| Name | Value |
|---- | -----|
| GET_FROM_FILE | &quot;GET_FROM_FILE&quot; |
| NO_SHIPPING | &quot;NO_SHIPPING&quot; |
| SET_PROVIDED_ADDRESS | &quot;SET_PROVIDED_ADDRESS&quot; |



## Enum: UserActionEnum

| Name | Value |
|---- | -----|
| CONTINUE | &quot;CONTINUE&quot; |
| PAY_NOW | &quot;PAY_NOW&quot; |



