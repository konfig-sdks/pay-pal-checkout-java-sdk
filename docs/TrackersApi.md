# TrackersApi

All URIs are relative to *https://api-m.sandbox.paypal.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateTrackingInfo**](TrackersApi.md#updateTrackingInfo) | **PATCH** /v2/checkout/orders/{id}/trackers/{tracker_id} | Update or cancel tracking information for a PayPal order |


<a name="updateTrackingInfo"></a>
# **updateTrackingInfo**
> updateTrackingInfo(id, trackerId).patch(patch).execute();

Update or cancel tracking information for a PayPal order

Updates or cancels the tracking information for a PayPal order, by ID. Updatable attributes or objects:&lt;br/&gt;&lt;br/&gt;&lt;table&gt;&lt;thead&gt;&lt;th&gt;Attribute&lt;/th&gt;&lt;th&gt;Op&lt;/th&gt;&lt;th&gt;Notes&lt;/th&gt;&lt;/thead&gt;&lt;tbody&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;items&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;td&gt;Using replace op for &lt;code&gt;items&lt;/code&gt; will replace the entire &lt;code&gt;items&lt;/code&gt; object with the value sent in request.&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;notify_payer&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace, add&lt;/td&gt;&lt;td&gt;&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;&lt;code&gt;status&lt;/code&gt;&lt;/td&gt;&lt;td&gt;replace&lt;/td&gt;&lt;td&gt;Only patching status to CANCELLED is currently supported.&lt;/td&gt;&lt;/tr&gt;&lt;/tbody&gt;&lt;/table&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.PayPalCheckout;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TrackersApi;
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
    String trackerId = "trackerId_example"; // The order tracking ID.
    try {
      client
              .trackers
              .updateTrackingInfo(id, trackerId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackersApi#updateTrackingInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .trackers
              .updateTrackingInfo(id, trackerId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TrackersApi#updateTrackingInfo");
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
| **trackerId** | **String**| The order tracking ID. | |
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

