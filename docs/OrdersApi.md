# OrdersApi

All URIs are relative to *https://api-m.sandbox.paypal.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addTrackingInformation**](OrdersApi.md#addTrackingInformation) | **POST** /v2/checkout/orders/{id}/track | Add tracking information for an Order. |
| [**authorizePaymentOrder**](OrdersApi.md#authorizePaymentOrder) | **POST** /v2/checkout/orders/{id}/authorize | Authorize payment for order |
| [**capturePayment**](OrdersApi.md#capturePayment) | **POST** /v2/checkout/orders/{id}/capture | Capture payment for order |
| [**confirmPaymentSource**](OrdersApi.md#confirmPaymentSource) | **POST** /v2/checkout/orders/{id}/confirm-payment-source | Confirm the Order |
| [**createOrder**](OrdersApi.md#createOrder) | **POST** /v2/checkout/orders | Create order |
| [**showDetails**](OrdersApi.md#showDetails) | **GET** /v2/checkout/orders/{id} | Show order details |
| [**updateOrderStatus**](OrdersApi.md#updateOrderStatus) | **PATCH** /v2/checkout/orders/{id} | Update order |


<a name="addTrackingInformation"></a>
# **addTrackingInformation**
> Order addTrackingInformation(id, orderTrackerRequest).payPalAuthAssertion(payPalAuthAssertion).execute();

Add tracking information for an Order.

Adds tracking information for an Order.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalCheckout;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-m.sandbox.paypal.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    PayPalCheckout client = new PayPalCheckout(configuration);
    String id = "id_example"; // The ID of the order that the tracking information is associated with.
    String transactionId = "transactionId_example"; // The PayPal transaction ID.
    String trackingNumber = "trackingNumber_example"; // The tracking number for the shipment. This property supports Unicode.
    ShipmentTrackingNumberType trackingNumberType = ShipmentTrackingNumberType.fromValue("CARRIER_PROVIDED");
    ShipmentTrackingStatus status = ShipmentTrackingStatus.fromValue("CANCELLED");
    String shipmentDate = "shipmentDate_example"; // The stand-alone date, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values, such as a date of birth, you should use dates with no associated time or time-zone data. Whenever possible, use the standard `date_time` type. This regular expression does not validate all dates. For example, February 31 is valid and nothing is known about leap years.
    ShipmentCarrier carrier = ShipmentCarrier.fromValue("DPD_RU");
    String carrierNameOther = "carrierNameOther_example"; // The name of the carrier for the shipment. Provide this value only if the carrier parameter is OTHER. This property supports Unicode.
    String postagePaymentId = "postagePaymentId_example"; // The postage payment ID. This property supports Unicode.
    Boolean notifyBuyer = false; // If true, sends an email notification to the buyer of the PayPal transaction. The email contains the tracking information that was uploaded through the API.
    Integer quantity = 56; // The quantity of items shipped.
    Boolean trackingNumberValidated = true; // Indicates whether the carrier validated the tracking number.
    String lastUpdatedTime = "lastUpdatedTime_example"; // The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote>
    String shipmentDirection = "FORWARD"; // To denote whether the shipment is sent forward to the receiver or returned back.
    String shipmentUploader = "MERCHANT"; // To denote which party uploaded the shipment tracking info.
    String captureId = "captureId_example"; // The PayPal capture ID.
    Boolean notifyPayer = false; // If true, sends an email notification to the payer of the PayPal transaction. The email contains the tracking information that was uploaded through the API.
    List<TrackerItem> items = Arrays.asList(); // An array of details of items in the shipment.
    String payPalAuthAssertion = "payPalAuthAssertion_example"; // An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see <a href=\"/api/rest/requests/#paypal-auth-assertion\">PayPal-Auth-Assertion</a>.
    try {
      Order result = client
              .orders
              .addTrackingInformation(id)
              .transactionId(transactionId)
              .trackingNumber(trackingNumber)
              .trackingNumberType(trackingNumberType)
              .status(status)
              .shipmentDate(shipmentDate)
              .carrier(carrier)
              .carrierNameOther(carrierNameOther)
              .postagePaymentId(postagePaymentId)
              .notifyBuyer(notifyBuyer)
              .quantity(quantity)
              .trackingNumberValidated(trackingNumberValidated)
              .lastUpdatedTime(lastUpdatedTime)
              .shipmentDirection(shipmentDirection)
              .shipmentUploader(shipmentUploader)
              .captureId(captureId)
              .notifyPayer(notifyPayer)
              .items(items)
              .payPalAuthAssertion(payPalAuthAssertion)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreateTime());
      System.out.println(result.getUpdateTime());
      System.out.println(result.getId());
      System.out.println(result.getPaymentSource());
      System.out.println(result.getIntent());
      System.out.println(result.getProcessingInstruction());
      System.out.println(result.getPayer());
      System.out.println(result.getPurchaseUnits());
      System.out.println(result.getStatus());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#addTrackingInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Order> response = client
              .orders
              .addTrackingInformation(id)
              .transactionId(transactionId)
              .trackingNumber(trackingNumber)
              .trackingNumberType(trackingNumberType)
              .status(status)
              .shipmentDate(shipmentDate)
              .carrier(carrier)
              .carrierNameOther(carrierNameOther)
              .postagePaymentId(postagePaymentId)
              .notifyBuyer(notifyBuyer)
              .quantity(quantity)
              .trackingNumberValidated(trackingNumberValidated)
              .lastUpdatedTime(lastUpdatedTime)
              .shipmentDirection(shipmentDirection)
              .shipmentUploader(shipmentUploader)
              .captureId(captureId)
              .notifyPayer(notifyPayer)
              .items(items)
              .payPalAuthAssertion(payPalAuthAssertion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#addTrackingInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the order that the tracking information is associated with. | |
| **orderTrackerRequest** | [**OrderTrackerRequest**](OrderTrackerRequest.md)|  | |
| **payPalAuthAssertion** | **String**| An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see &lt;a href&#x3D;\&quot;/api/rest/requests/#paypal-auth-assertion\&quot;&gt;PayPal-Auth-Assertion&lt;/a&gt;. | [optional] |

### Return type

[**Order**](Order.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response to an idempotent request returns the HTTP &#x60;200 OK&#x60; status code with a JSON response body that shows tracker details. |  -  |
| **201** | A successful response to a non-idempotent request returns the HTTP &#x60;201 Created&#x60; status code with a JSON response body that shows tracker details. If a duplicate response is retried, returns the HTTP &#x60;200 OK&#x60; status code. |  -  |
| **0** | The default response. |  -  |

<a name="authorizePaymentOrder"></a>
# **authorizePaymentOrder**
> OrderAuthorizeResponse authorizePaymentOrder(id).payPalRequestId(payPalRequestId).prefer(prefer).payPalClientMetadataId(payPalClientMetadataId).payPalAuthAssertion(payPalAuthAssertion).orderAuthorizeRequest(orderAuthorizeRequest).execute();

Authorize payment for order

Authorizes payment for an order. To successfully authorize payment for an order, the buyer must first approve the order or a valid payment_source must be provided in the request. A buyer can approve the order upon being redirected to the rel:approve URL that was returned in the HATEOAS links in the create order response.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; For error handling and troubleshooting, see &lt;a href&#x3D;\&quot;/api/rest/reference/orders/v2/errors/#authorize-order\&quot;&gt;Orders v2 errors&lt;/a&gt;.&lt;/blockquote&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalCheckout;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-m.sandbox.paypal.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    PayPalCheckout client = new PayPalCheckout(configuration);
    String id = "id_example"; // The ID of the order that the tracking information is associated with.
    PaymentSource paymentSource = new PaymentSource();
    String payPalRequestId = "payPalRequestId_example"; // The server stores keys for 6 hours. The API callers can request the times to up to 72 hours by speaking to their Account Manager.
    String prefer = "return=minimal"; // The preferred server response upon successful completion of the request. Value is:<ul><li><code>return=minimal</code>. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links.</li><li><code>return=representation</code>. The server returns a complete resource representation, including the current state of the resource.</li></ul>
    String payPalClientMetadataId = "payPalClientMetadataId_example";
    String payPalAuthAssertion = "payPalAuthAssertion_example"; // An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see <a href=\"/api/rest/requests/#paypal-auth-assertion\">PayPal-Auth-Assertion</a>.
    try {
      OrderAuthorizeResponse result = client
              .orders
              .authorizePaymentOrder(id)
              .paymentSource(paymentSource)
              .payPalRequestId(payPalRequestId)
              .prefer(prefer)
              .payPalClientMetadataId(payPalClientMetadataId)
              .payPalAuthAssertion(payPalAuthAssertion)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreateTime());
      System.out.println(result.getUpdateTime());
      System.out.println(result.getId());
      System.out.println(result.getPaymentSource());
      System.out.println(result.getIntent());
      System.out.println(result.getProcessingInstruction());
      System.out.println(result.getPayer());
      System.out.println(result.getPurchaseUnits());
      System.out.println(result.getStatus());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#authorizePaymentOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OrderAuthorizeResponse> response = client
              .orders
              .authorizePaymentOrder(id)
              .paymentSource(paymentSource)
              .payPalRequestId(payPalRequestId)
              .prefer(prefer)
              .payPalClientMetadataId(payPalClientMetadataId)
              .payPalAuthAssertion(payPalAuthAssertion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#authorizePaymentOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the order that the tracking information is associated with. | |
| **payPalRequestId** | **String**| The server stores keys for 6 hours. The API callers can request the times to up to 72 hours by speaking to their Account Manager. | [optional] |
| **prefer** | **String**| The preferred server response upon successful completion of the request. Value is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return&#x3D;minimal&lt;/code&gt;. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the &lt;code&gt;id&lt;/code&gt;, &lt;code&gt;status&lt;/code&gt; and HATEOAS links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return&#x3D;representation&lt;/code&gt;. The server returns a complete resource representation, including the current state of the resource.&lt;/li&gt;&lt;/ul&gt; | [optional] [default to return&#x3D;minimal] |
| **payPalClientMetadataId** | **String**|  | [optional] |
| **payPalAuthAssertion** | **String**| An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see &lt;a href&#x3D;\&quot;/api/rest/requests/#paypal-auth-assertion\&quot;&gt;PayPal-Auth-Assertion&lt;/a&gt;. | [optional] |
| **orderAuthorizeRequest** | [**OrderAuthorizeRequest**](OrderAuthorizeRequest.md)|  | [optional] |

### Return type

[**OrderAuthorizeResponse**](OrderAuthorizeResponse.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response to an idempotent request returns the HTTP &#x60;200 OK&#x60; status code with a JSON response body that shows authorized payment details. |  -  |
| **201** | A successful response to a non-idempotent request returns the HTTP &#x60;201 Created&#x60; status code with a JSON response body that shows authorized payment details. If a duplicate response is retried, returns the HTTP &#x60;200 OK&#x60; status code. By default, the response is minimal. If you need the complete resource representation, you must pass the &lt;a href&#x3D;\&quot;/docs/api/orders/v2/#orders-authorize-header-parameters\&quot;&gt;&lt;code&gt;Prefer: return&#x3D;representation&lt;/code&gt; request header&lt;/a&gt;. |  -  |
| **0** | The default response. |  -  |

<a name="capturePayment"></a>
# **capturePayment**
> Order capturePayment(id).payPalRequestId(payPalRequestId).prefer(prefer).payPalClientMetadataId(payPalClientMetadataId).payPalAuthAssertion(payPalAuthAssertion).orderCaptureRequest(orderCaptureRequest).execute();

Capture payment for order

Captures payment for an order. To successfully capture payment for an order, the buyer must first approve the order or a valid payment_source must be provided in the request. A buyer can approve the order upon being redirected to the rel:approve URL that was returned in the HATEOAS links in the create order response.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; For error handling and troubleshooting, see &lt;a href&#x3D;\&quot;/api/rest/reference/orders/v2/errors/#capture-order\&quot;&gt;Orders v2 errors&lt;/a&gt;.&lt;/blockquote&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalCheckout;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-m.sandbox.paypal.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    PayPalCheckout client = new PayPalCheckout(configuration);
    String id = "id_example"; // The ID of the order that the tracking information is associated with.
    PaymentSource paymentSource = new PaymentSource();
    String payPalRequestId = "payPalRequestId_example"; // The server stores keys for 6 hours. The API callers can request the times to up to 72 hours by speaking to their Account Manager.
    String prefer = "return=minimal"; // The preferred server response upon successful completion of the request. Value is:<ul><li><code>return=minimal</code>. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links.</li><li><code>return=representation</code>. The server returns a complete resource representation, including the current state of the resource.</li></ul>
    String payPalClientMetadataId = "payPalClientMetadataId_example";
    String payPalAuthAssertion = "payPalAuthAssertion_example"; // An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see <a href=\"/api/rest/requests/#paypal-auth-assertion\">PayPal-Auth-Assertion</a>.
    try {
      Order result = client
              .orders
              .capturePayment(id)
              .paymentSource(paymentSource)
              .payPalRequestId(payPalRequestId)
              .prefer(prefer)
              .payPalClientMetadataId(payPalClientMetadataId)
              .payPalAuthAssertion(payPalAuthAssertion)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreateTime());
      System.out.println(result.getUpdateTime());
      System.out.println(result.getId());
      System.out.println(result.getPaymentSource());
      System.out.println(result.getIntent());
      System.out.println(result.getProcessingInstruction());
      System.out.println(result.getPayer());
      System.out.println(result.getPurchaseUnits());
      System.out.println(result.getStatus());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#capturePayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Order> response = client
              .orders
              .capturePayment(id)
              .paymentSource(paymentSource)
              .payPalRequestId(payPalRequestId)
              .prefer(prefer)
              .payPalClientMetadataId(payPalClientMetadataId)
              .payPalAuthAssertion(payPalAuthAssertion)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#capturePayment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the order that the tracking information is associated with. | |
| **payPalRequestId** | **String**| The server stores keys for 6 hours. The API callers can request the times to up to 72 hours by speaking to their Account Manager. | [optional] |
| **prefer** | **String**| The preferred server response upon successful completion of the request. Value is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return&#x3D;minimal&lt;/code&gt;. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the &lt;code&gt;id&lt;/code&gt;, &lt;code&gt;status&lt;/code&gt; and HATEOAS links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return&#x3D;representation&lt;/code&gt;. The server returns a complete resource representation, including the current state of the resource.&lt;/li&gt;&lt;/ul&gt; | [optional] [default to return&#x3D;minimal] |
| **payPalClientMetadataId** | **String**|  | [optional] |
| **payPalAuthAssertion** | **String**| An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see &lt;a href&#x3D;\&quot;/api/rest/requests/#paypal-auth-assertion\&quot;&gt;PayPal-Auth-Assertion&lt;/a&gt;. | [optional] |
| **orderCaptureRequest** | [**OrderCaptureRequest**](OrderCaptureRequest.md)|  | [optional] |

### Return type

[**Order**](Order.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response to an idempotent request returns the HTTP &#x60;200 OK&#x60; status code with a JSON response body that shows captured payment details. |  -  |
| **201** | A successful response to a non-idempotent request returns the HTTP &#x60;201 Created&#x60; status code with a JSON response body that shows captured payment details. If a duplicate response is retried, returns the HTTP &#x60;200 OK&#x60; status code. By default, the response is minimal. If you need the complete resource representation, pass the &lt;a href&#x3D;\&quot;/docs/api/orders/v2/#orders-authorize-header-parameters\&quot;&gt;&lt;code&gt;Prefer: return&#x3D;representation&lt;/code&gt; request header&lt;/a&gt;. |  -  |
| **0** | The default response. |  -  |

<a name="confirmPaymentSource"></a>
# **confirmPaymentSource**
> Order confirmPaymentSource(id).payPalClientMetadataId(payPalClientMetadataId).prefer(prefer).confirmOrderRequest(confirmOrderRequest).execute();

Confirm the Order

Payer confirms their intent to pay for the the Order with the given payment source.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalCheckout;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-m.sandbox.paypal.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    PayPalCheckout client = new PayPalCheckout(configuration);
    PaymentSource paymentSource = new PaymentSource();
    String id = "id_example"; // The ID of the order that the tracking information is associated with.
    ProcessingInstruction processingInstruction = ProcessingInstruction.fromValue("ORDER_COMPLETE_ON_PAYMENT_APPROVAL");
    OrderConfirmApplicationContext applicationContext = new OrderConfirmApplicationContext();
    String payPalClientMetadataId = "payPalClientMetadataId_example";
    String prefer = "return=minimal"; // The preferred server response upon successful completion of the request. Value is:<ul><li><code>return=minimal</code>. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links.</li><li><code>return=representation</code>. The server returns a complete resource representation, including the current state of the resource.</li></ul>
    try {
      Order result = client
              .orders
              .confirmPaymentSource(paymentSource, id)
              .processingInstruction(processingInstruction)
              .applicationContext(applicationContext)
              .payPalClientMetadataId(payPalClientMetadataId)
              .prefer(prefer)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreateTime());
      System.out.println(result.getUpdateTime());
      System.out.println(result.getId());
      System.out.println(result.getPaymentSource());
      System.out.println(result.getIntent());
      System.out.println(result.getProcessingInstruction());
      System.out.println(result.getPayer());
      System.out.println(result.getPurchaseUnits());
      System.out.println(result.getStatus());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#confirmPaymentSource");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Order> response = client
              .orders
              .confirmPaymentSource(paymentSource, id)
              .processingInstruction(processingInstruction)
              .applicationContext(applicationContext)
              .payPalClientMetadataId(payPalClientMetadataId)
              .prefer(prefer)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#confirmPaymentSource");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the order that the tracking information is associated with. | |
| **payPalClientMetadataId** | **String**|  | [optional] |
| **prefer** | **String**| The preferred server response upon successful completion of the request. Value is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return&#x3D;minimal&lt;/code&gt;. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the &lt;code&gt;id&lt;/code&gt;, &lt;code&gt;status&lt;/code&gt; and HATEOAS links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return&#x3D;representation&lt;/code&gt;. The server returns a complete resource representation, including the current state of the resource.&lt;/li&gt;&lt;/ul&gt; | [optional] [default to return&#x3D;minimal] |
| **confirmOrderRequest** | [**ConfirmOrderRequest**](ConfirmOrderRequest.md)|  | [optional] |

### Return type

[**Order**](Order.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request indicates that the payment source was added to the Order. A successful request returns the HTTP &#x60;200 OK&#x60; status code with a JSON response body that shows order details. |  -  |
| **0** | The default response. |  -  |

<a name="createOrder"></a>
# **createOrder**
> Order createOrder(orderRequest).payPalRequestId(payPalRequestId).payPalPartnerAttributionId(payPalPartnerAttributionId).payPalClientMetadataId(payPalClientMetadataId).prefer(prefer).execute();

Create order

Creates an order. Merchants and partners can add Level 2 and 3 data to payments to reduce risk and payment processing costs. For more information about processing payments, see &lt;a href&#x3D;\&quot;https://developer.paypal.com/docs/checkout/advanced/processing/\&quot;&gt;checkout&lt;/a&gt; or &lt;a href&#x3D;\&quot;https://developer.paypal.com/docs/multiparty/checkout/advanced/processing/\&quot;&gt;multiparty checkout&lt;/a&gt;.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; For error handling and troubleshooting, see &lt;a href&#x3D;\&quot;/api/rest/reference/orders/v2/errors/#create-order\&quot;&gt;Orders v2 errors&lt;/a&gt;.&lt;/blockquote&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalCheckout;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-m.sandbox.paypal.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    PayPalCheckout client = new PayPalCheckout(configuration);
    CheckoutPaymentIntent intent = CheckoutPaymentIntent.fromValue("CAPTURE");
    List<PurchaseUnitRequest> purchaseUnits = Arrays.asList(); // An array of purchase units. Each purchase unit establishes a contract between a payer and the payee. Each purchase unit represents either a full or partial order that the payer intends to purchase from the payee.
    Payer payer = new Payer();
    PaymentSource paymentSource = new PaymentSource();
    OrderApplicationContext applicationContext = new OrderApplicationContext();
    String payPalRequestId = "payPalRequestId_example"; // The server stores keys for 6 hours. The API callers can request the times to up to 72 hours by speaking to their Account Manager.
    String payPalPartnerAttributionId = "payPalPartnerAttributionId_example";
    String payPalClientMetadataId = "payPalClientMetadataId_example";
    String prefer = "return=minimal"; // The preferred server response upon successful completion of the request. Value is:<ul><li><code>return=minimal</code>. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the <code>id</code>, <code>status</code> and HATEOAS links.</li><li><code>return=representation</code>. The server returns a complete resource representation, including the current state of the resource.</li></ul>
    try {
      Order result = client
              .orders
              .createOrder(intent, purchaseUnits)
              .payer(payer)
              .paymentSource(paymentSource)
              .applicationContext(applicationContext)
              .payPalRequestId(payPalRequestId)
              .payPalPartnerAttributionId(payPalPartnerAttributionId)
              .payPalClientMetadataId(payPalClientMetadataId)
              .prefer(prefer)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreateTime());
      System.out.println(result.getUpdateTime());
      System.out.println(result.getId());
      System.out.println(result.getPaymentSource());
      System.out.println(result.getIntent());
      System.out.println(result.getProcessingInstruction());
      System.out.println(result.getPayer());
      System.out.println(result.getPurchaseUnits());
      System.out.println(result.getStatus());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Order> response = client
              .orders
              .createOrder(intent, purchaseUnits)
              .payer(payer)
              .paymentSource(paymentSource)
              .applicationContext(applicationContext)
              .payPalRequestId(payPalRequestId)
              .payPalPartnerAttributionId(payPalPartnerAttributionId)
              .payPalClientMetadataId(payPalClientMetadataId)
              .prefer(prefer)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderRequest** | [**OrderRequest**](OrderRequest.md)|  | |
| **payPalRequestId** | **String**| The server stores keys for 6 hours. The API callers can request the times to up to 72 hours by speaking to their Account Manager. | [optional] |
| **payPalPartnerAttributionId** | **String**|  | [optional] |
| **payPalClientMetadataId** | **String**|  | [optional] |
| **prefer** | **String**| The preferred server response upon successful completion of the request. Value is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return&#x3D;minimal&lt;/code&gt;. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the &lt;code&gt;id&lt;/code&gt;, &lt;code&gt;status&lt;/code&gt; and HATEOAS links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return&#x3D;representation&lt;/code&gt;. The server returns a complete resource representation, including the current state of the resource.&lt;/li&gt;&lt;/ul&gt; | [optional] [default to return&#x3D;minimal] |

### Return type

[**Order**](Order.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response to an idempotent request returns the HTTP &#x60;200 OK&#x60; status code with a JSON response body that shows order details. |  -  |
| **201** | A successful request returns the HTTP &#x60;201 Created&#x60; status code and a JSON response body that includes by default a minimal response with the ID, status, and HATEOAS links. If you require the complete order resource representation, you must pass the &lt;a href&#x3D;\&quot;/docs/api/orders/v2/#orders-create-header-parameters\&quot;&gt;&lt;code&gt;Prefer: return&#x3D;representation&lt;/code&gt; request header&lt;/a&gt;. This header value is not the default. |  -  |
| **0** | The default response. |  -  |

<a name="showDetails"></a>
# **showDetails**
> Order showDetails(id).fields(fields).execute();

Show order details

Shows details for an order, by ID.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; For error handling and troubleshooting, see &lt;a href&#x3D;\&quot;/api/rest/reference/orders/v2/errors/#get-order\&quot;&gt;Orders v2 errors&lt;/a&gt;.&lt;/blockquote&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalCheckout;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-m.sandbox.paypal.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    PayPalCheckout client = new PayPalCheckout(configuration);
    String id = "id_example"; // The ID of the order that the tracking information is associated with.
    String fields = "fields_example"; // A comma-separated list of fields that should be returned for the order. Valid filter field is `payment_source`.
    try {
      Order result = client
              .orders
              .showDetails(id)
              .fields(fields)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreateTime());
      System.out.println(result.getUpdateTime());
      System.out.println(result.getId());
      System.out.println(result.getPaymentSource());
      System.out.println(result.getIntent());
      System.out.println(result.getProcessingInstruction());
      System.out.println(result.getPayer());
      System.out.println(result.getPurchaseUnits());
      System.out.println(result.getStatus());
      System.out.println(result.getLinks());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#showDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Order> response = client
              .orders
              .showDetails(id)
              .fields(fields)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#showDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the order that the tracking information is associated with. | |
| **fields** | **String**| A comma-separated list of fields that should be returned for the order. Valid filter field is &#x60;payment_source&#x60;. | [optional] |

### Return type

[**Order**](Order.md)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful request returns the HTTP &#x60;200 OK&#x60; status code and a JSON response body that shows order details. |  -  |
| **0** | The default response. |  -  |

<a name="updateOrderStatus"></a>
# **updateOrderStatus**
> updateOrderStatus(id).patch(patch).execute();

Update order

Updates an order with a &#x60;CREATED&#x60; or &#x60;APPROVED&#x60; status. You cannot update an order with the &#x60;COMPLETED&#x60; status.&lt;br/&gt;&lt;br/&gt;To make an update, you must provide a &#x60;reference_id&#x60;. If you omit this value with an order that contains only one purchase unit, PayPal sets the value to &#x60;default&#x60; which enables you to use the path: &lt;code&gt;\\\&quot;/purchase_units/@reference_id&#x3D;&#x3D;&#39;default&#39;/{attribute-or-object}\\\&quot;&lt;/code&gt;. Merchants and partners can add Level 2 and 3 data to payments to reduce risk and payment processing costs. For more information about processing payments, see &lt;a href&#x3D;\&quot;https://developer.paypal.com/docs/checkout/advanced/processing/\&quot;&gt;checkout&lt;/a&gt; or &lt;a href&#x3D;\&quot;https://developer.paypal.com/docs/multiparty/checkout/advanced/processing/\&quot;&gt;multiparty checkout&lt;/a&gt;.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; For error handling and troubleshooting, see &lt;a href&#x3D;\\\&quot;/api/rest/reference/orders/v2/errors/#patch-order\\\&quot;&gt;Orders v2 errors&lt;/a&gt;.&lt;/blockquote&gt;Patchable attributes or objects:&lt;br/&gt;&lt;br/&gt;&lt;table&gt;&lt;thead&gt;&lt;th&gt;Attribute&lt;/th&gt;&lt;th&gt;Op&lt;/th&gt;&lt;th&gt;Notes&lt;/th&gt;&lt;/thead&gt;&lt;tbody&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;intent&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;payer&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace, add&lt;/td&gt;&lt;td&gt;Using replace op for &lt;code&gt;payer&lt;/code&gt; will replace the whole &lt;code&gt;payer&lt;/code&gt; object with the value sent in request.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;purchase_units&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace, add&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;purchase_units[].custom_id&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace, add, remove&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;purchase_units[].description&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace, add, remove&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;purchase_units[].payee.email&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;purchase_units[].shipping.name&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace, add&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;purchase_units[].shipping.address&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace, add&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;purchase_units[].shipping.type&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace, add&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;purchase_units[].soft_descriptor&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace, remove&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;purchase_units[].amount&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;purchase_units[].items&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace, add, remove&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;purchase_units[].invoice_id&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace, add, remove&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;purchase_units[].payment_instruction&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;purchase_units[].payment_instruction.disbursement_mode&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;td&gt;By default, &lt;code&gt;disbursement_mode&lt;/code&gt; is &lt;code&gt;INSTANT&lt;/code&gt;.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;purchase_units[].payment_instruction.platform_fees&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace, add, remove&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;purchase_units[].supplementary_data.airline&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace, add, remove&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;purchase_units[].supplementary_data.card&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace, add, remove&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;application_context.client_configuration&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace, add&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;/tbody&gt;&lt;/table&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalCheckout;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OrdersApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api-m.sandbox.paypal.com";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    PayPalCheckout client = new PayPalCheckout(configuration);
    String id = "id_example"; // The ID of the order that the tracking information is associated with.
    try {
      client
              .orders
              .updateOrderStatus(id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#updateOrderStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .orders
              .updateOrderStatus(id)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#updateOrderStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the order that the tracking information is associated with. | |
| **patch** | [**List&lt;Patch&gt;**](Patch.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[Oauth2](../README.md#Oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | A successful request returns the HTTP &#x60;204 No Content&#x60; status code with an empty object in the JSON response body. |  -  |
| **0** | The default response. |  -  |

