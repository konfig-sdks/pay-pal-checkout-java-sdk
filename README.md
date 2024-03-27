<div align="left">

[![Visit Paypal](./header.png)](https://www.paypal.com&#x2F;)

# [Paypal](https://www.paypal.com&#x2F;)

An order represents a payment between two or more parties. Use the Orders API to create, update, retrieve, authorize, and capture orders.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=PayPal&serviceName=Checkout&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>pay-pal-checkout-java-sdk</artifactId>
  <version>2.13</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:pay-pal-checkout-java-sdk:2.13"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/pay-pal-checkout-java-sdk-2.13.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api-m.sandbox.paypal.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OrdersApi* | [**addTrackingInformation**](docs/OrdersApi.md#addTrackingInformation) | **POST** /v2/checkout/orders/{id}/track | Add tracking information for an Order.
*OrdersApi* | [**authorizePaymentOrder**](docs/OrdersApi.md#authorizePaymentOrder) | **POST** /v2/checkout/orders/{id}/authorize | Authorize payment for order
*OrdersApi* | [**capturePayment**](docs/OrdersApi.md#capturePayment) | **POST** /v2/checkout/orders/{id}/capture | Capture payment for order
*OrdersApi* | [**confirmPaymentSource**](docs/OrdersApi.md#confirmPaymentSource) | **POST** /v2/checkout/orders/{id}/confirm-payment-source | Confirm the Order
*OrdersApi* | [**createOrder**](docs/OrdersApi.md#createOrder) | **POST** /v2/checkout/orders | Create order
*OrdersApi* | [**showDetails**](docs/OrdersApi.md#showDetails) | **GET** /v2/checkout/orders/{id} | Show order details
*OrdersApi* | [**updateOrderStatus**](docs/OrdersApi.md#updateOrderStatus) | **PATCH** /v2/checkout/orders/{id} | Update order
*TrackersApi* | [**updateTrackingInfo**](docs/TrackersApi.md#updateTrackingInfo) | **PATCH** /v2/checkout/orders/{id}/trackers/{tracker_id} | Update or cancel tracking information for a PayPal order


## Documentation for Models

 - [ActivityTimestamps](docs/ActivityTimestamps.md)
 - [AddressDetailsProperty](docs/AddressDetailsProperty.md)
 - [AddressDetailsProperty1](docs/AddressDetailsProperty1.md)
 - [AddressPortable](docs/AddressPortable.md)
 - [AddressPortable2](docs/AddressPortable2.md)
 - [AmountBreakdown](docs/AmountBreakdown.md)
 - [AmountWithBreakdown](docs/AmountWithBreakdown.md)
 - [AmountWithBreakdownAllOf](docs/AmountWithBreakdownAllOf.md)
 - [ApplePayDecryptedTokenData](docs/ApplePayDecryptedTokenData.md)
 - [ApplePayPaymentData](docs/ApplePayPaymentData.md)
 - [ApplePayRequest](docs/ApplePayRequest.md)
 - [AuthenticationResponse](docs/AuthenticationResponse.md)
 - [Authorization](docs/Authorization.md)
 - [AuthorizationAllOf](docs/AuthorizationAllOf.md)
 - [AuthorizationStatus](docs/AuthorizationStatus.md)
 - [AuthorizationStatusDetails](docs/AuthorizationStatusDetails.md)
 - [AuthorizationWithAdditionalData](docs/AuthorizationWithAdditionalData.md)
 - [AuthorizationWithAdditionalDataAllOf](docs/AuthorizationWithAdditionalDataAllOf.md)
 - [Bancontact](docs/Bancontact.md)
 - [BancontactRequest](docs/BancontactRequest.md)
 - [BinDetails](docs/BinDetails.md)
 - [Blik](docs/Blik.md)
 - [BlikExperienceContext](docs/BlikExperienceContext.md)
 - [BlikExperienceContextAllOf](docs/BlikExperienceContextAllOf.md)
 - [BlikOneClick](docs/BlikOneClick.md)
 - [BlikOneClickResponse](docs/BlikOneClickResponse.md)
 - [BlikRequest](docs/BlikRequest.md)
 - [BlikSeamless](docs/BlikSeamless.md)
 - [Capture](docs/Capture.md)
 - [CaptureAllOf](docs/CaptureAllOf.md)
 - [CaptureStatus](docs/CaptureStatus.md)
 - [CaptureStatusDetails](docs/CaptureStatusDetails.md)
 - [Card](docs/Card.md)
 - [CardAttributes](docs/CardAttributes.md)
 - [CardAttributesResponse](docs/CardAttributesResponse.md)
 - [CardBrand](docs/CardBrand.md)
 - [CardExperienceContext](docs/CardExperienceContext.md)
 - [CardFromRequest](docs/CardFromRequest.md)
 - [CardRequest](docs/CardRequest.md)
 - [CardRequestAllOf](docs/CardRequestAllOf.md)
 - [CardResponse](docs/CardResponse.md)
 - [CardStoredCredential](docs/CardStoredCredential.md)
 - [CardSupplementaryData](docs/CardSupplementaryData.md)
 - [CardType](docs/CardType.md)
 - [CheckoutPaymentIntent](docs/CheckoutPaymentIntent.md)
 - [CobrandedCard](docs/CobrandedCard.md)
 - [ConfirmOrderRequest](docs/ConfirmOrderRequest.md)
 - [Customer](docs/Customer.md)
 - [DisbursementMode](docs/DisbursementMode.md)
 - [EciFlag](docs/EciFlag.md)
 - [Enrolled](docs/Enrolled.md)
 - [Eps](docs/Eps.md)
 - [EpsRequest](docs/EpsRequest.md)
 - [Error400](docs/Error400.md)
 - [Error401](docs/Error401.md)
 - [Error403](docs/Error403.md)
 - [Error404](docs/Error404.md)
 - [Error409](docs/Error409.md)
 - [Error415](docs/Error415.md)
 - [Error422](docs/Error422.md)
 - [Error503](docs/Error503.md)
 - [ErrorDetails](docs/ErrorDetails.md)
 - [ErrorLinkDescription](docs/ErrorLinkDescription.md)
 - [ErrorLocation](docs/ErrorLocation.md)
 - [ExchangeRate](docs/ExchangeRate.md)
 - [ExperienceContextBase](docs/ExperienceContextBase.md)
 - [Giropay](docs/Giropay.md)
 - [GiropayRequest](docs/GiropayRequest.md)
 - [INVALIDACCOUNTSTATUS](docs/INVALIDACCOUNTSTATUS.md)
 - [INVALIDRESOURCEID](docs/INVALIDRESOURCEID.md)
 - [Ideal](docs/Ideal.md)
 - [IdealRequest](docs/IdealRequest.md)
 - [Item](docs/Item.md)
 - [Level2CardProcessingData](docs/Level2CardProcessingData.md)
 - [Level3CardProcessingData](docs/Level3CardProcessingData.md)
 - [LiabilityShift](docs/LiabilityShift.md)
 - [LineItem](docs/LineItem.md)
 - [LineItemAllOf](docs/LineItemAllOf.md)
 - [LinkDescription](docs/LinkDescription.md)
 - [MerchantPayableBreakdown](docs/MerchantPayableBreakdown.md)
 - [Model400](docs/Model400.md)
 - [Model401](docs/Model401.md)
 - [Model403](docs/Model403.md)
 - [Model404](docs/Model404.md)
 - [Model422](docs/Model422.md)
 - [Money](docs/Money.md)
 - [Money2](docs/Money2.md)
 - [Mybank](docs/Mybank.md)
 - [MybankRequest](docs/MybankRequest.md)
 - [Name](docs/Name.md)
 - [Name2](docs/Name2.md)
 - [NetAmountBreakdownItem](docs/NetAmountBreakdownItem.md)
 - [NetworkTokenRequest](docs/NetworkTokenRequest.md)
 - [NetworkTransactionReference](docs/NetworkTransactionReference.md)
 - [Order](docs/Order.md)
 - [OrderAllOf](docs/OrderAllOf.md)
 - [OrderApplicationContext](docs/OrderApplicationContext.md)
 - [OrderAuthorizeRequest](docs/OrderAuthorizeRequest.md)
 - [OrderAuthorizeResponse](docs/OrderAuthorizeResponse.md)
 - [OrderCaptureRequest](docs/OrderCaptureRequest.md)
 - [OrderConfirmApplicationContext](docs/OrderConfirmApplicationContext.md)
 - [OrderRequest](docs/OrderRequest.md)
 - [OrderStatus](docs/OrderStatus.md)
 - [OrderTrackerRequest](docs/OrderTrackerRequest.md)
 - [OrderTrackerRequestAllOf](docs/OrderTrackerRequestAllOf.md)
 - [OrdersAddTrackingInformation403Response](docs/OrdersAddTrackingInformation403Response.md)
 - [OrdersAddTrackingInformation404Response](docs/OrdersAddTrackingInformation404Response.md)
 - [OrdersAddTrackingInformation422Response](docs/OrdersAddTrackingInformation422Response.md)
 - [OrdersAddTrackingInformationResponse](docs/OrdersAddTrackingInformationResponse.md)
 - [OrdersAuthorize400](docs/OrdersAuthorize400.md)
 - [OrdersAuthorize403](docs/OrdersAuthorize403.md)
 - [OrdersAuthorize422](docs/OrdersAuthorize422.md)
 - [OrdersAuthorizePaymentOrder401Response](docs/OrdersAuthorizePaymentOrder401Response.md)
 - [OrdersAuthorizePaymentOrder403Response](docs/OrdersAuthorizePaymentOrder403Response.md)
 - [OrdersAuthorizePaymentOrder404Response](docs/OrdersAuthorizePaymentOrder404Response.md)
 - [OrdersAuthorizePaymentOrder422Response](docs/OrdersAuthorizePaymentOrder422Response.md)
 - [OrdersAuthorizePaymentOrderResponse](docs/OrdersAuthorizePaymentOrderResponse.md)
 - [OrdersCapture400](docs/OrdersCapture400.md)
 - [OrdersCapture403](docs/OrdersCapture403.md)
 - [OrdersCapture422](docs/OrdersCapture422.md)
 - [OrdersCapturePayment401Response](docs/OrdersCapturePayment401Response.md)
 - [OrdersCapturePayment403Response](docs/OrdersCapturePayment403Response.md)
 - [OrdersCapturePayment404Response](docs/OrdersCapturePayment404Response.md)
 - [OrdersCapturePayment422Response](docs/OrdersCapturePayment422Response.md)
 - [OrdersCapturePaymentResponse](docs/OrdersCapturePaymentResponse.md)
 - [OrdersConfirm400](docs/OrdersConfirm400.md)
 - [OrdersConfirm422](docs/OrdersConfirm422.md)
 - [OrdersConfirmPaymentSource403Response](docs/OrdersConfirmPaymentSource403Response.md)
 - [OrdersConfirmPaymentSource422Response](docs/OrdersConfirmPaymentSource422Response.md)
 - [OrdersConfirmPaymentSourceResponse](docs/OrdersConfirmPaymentSourceResponse.md)
 - [OrdersCreateOrder401Response](docs/OrdersCreateOrder401Response.md)
 - [OrdersCreateOrder422Response](docs/OrdersCreateOrder422Response.md)
 - [OrdersCreateOrderResponse](docs/OrdersCreateOrderResponse.md)
 - [OrdersPatch400](docs/OrdersPatch400.md)
 - [OrdersPatch422](docs/OrdersPatch422.md)
 - [OrdersShowDetails404Response](docs/OrdersShowDetails404Response.md)
 - [OrdersShowDetailsResponse](docs/OrdersShowDetailsResponse.md)
 - [OrdersTrackCreate400](docs/OrdersTrackCreate400.md)
 - [OrdersTrackCreate403](docs/OrdersTrackCreate403.md)
 - [OrdersTrackCreate422](docs/OrdersTrackCreate422.md)
 - [OrdersTrackersPatch400](docs/OrdersTrackersPatch400.md)
 - [OrdersTrackersPatch403](docs/OrdersTrackersPatch403.md)
 - [OrdersTrackersPatch404](docs/OrdersTrackersPatch404.md)
 - [OrdersTrackersPatch422](docs/OrdersTrackersPatch422.md)
 - [OrdersUpdateOrderStatus401Response](docs/OrdersUpdateOrderStatus401Response.md)
 - [OrdersUpdateOrderStatus404Response](docs/OrdersUpdateOrderStatus404Response.md)
 - [OrdersUpdateOrderStatus422Response](docs/OrdersUpdateOrderStatus422Response.md)
 - [OrdersUpdateOrderStatusResponse](docs/OrdersUpdateOrderStatusResponse.md)
 - [P24](docs/P24.md)
 - [P24Request](docs/P24Request.md)
 - [PERMISSIONDENIED](docs/PERMISSIONDENIED.md)
 - [ParesStatus](docs/ParesStatus.md)
 - [Patch](docs/Patch.md)
 - [Payee](docs/Payee.md)
 - [PayeeBase](docs/PayeeBase.md)
 - [PayeePaymentMethodPreference](docs/PayeePaymentMethodPreference.md)
 - [Payer](docs/Payer.md)
 - [PayerAllOf](docs/PayerAllOf.md)
 - [PayerBase](docs/PayerBase.md)
 - [PaymentCollection](docs/PaymentCollection.md)
 - [PaymentInitiator](docs/PaymentInitiator.md)
 - [PaymentInstruction](docs/PaymentInstruction.md)
 - [PaymentMethod](docs/PaymentMethod.md)
 - [PaymentSource](docs/PaymentSource.md)
 - [PaymentSourceResponse](docs/PaymentSourceResponse.md)
 - [PaypalWallet](docs/PaypalWallet.md)
 - [PaypalWalletAttributes](docs/PaypalWalletAttributes.md)
 - [PaypalWalletAttributesResponse](docs/PaypalWalletAttributesResponse.md)
 - [PaypalWalletCustomer](docs/PaypalWalletCustomer.md)
 - [PaypalWalletExperienceContext](docs/PaypalWalletExperienceContext.md)
 - [PaypalWalletResponse](docs/PaypalWalletResponse.md)
 - [PaypalWalletVaultResponse](docs/PaypalWalletVaultResponse.md)
 - [PaypalWalletVaultResponseAllOf](docs/PaypalWalletVaultResponseAllOf.md)
 - [Phone](docs/Phone.md)
 - [Phone2](docs/Phone2.md)
 - [PhoneType](docs/PhoneType.md)
 - [PhoneType2](docs/PhoneType2.md)
 - [PhoneWithType](docs/PhoneWithType.md)
 - [PlatformFee](docs/PlatformFee.md)
 - [ProcessingInstruction](docs/ProcessingInstruction.md)
 - [ProcessorResponse](docs/ProcessorResponse.md)
 - [PurchaseUnit](docs/PurchaseUnit.md)
 - [PurchaseUnitRequest](docs/PurchaseUnitRequest.md)
 - [Refund](docs/Refund.md)
 - [RefundAllOf](docs/RefundAllOf.md)
 - [RefundStatus](docs/RefundStatus.md)
 - [RefundStatusDetails](docs/RefundStatusDetails.md)
 - [SellerProtection](docs/SellerProtection.md)
 - [SellerReceivableBreakdown](docs/SellerReceivableBreakdown.md)
 - [ShipmentCarrier](docs/ShipmentCarrier.md)
 - [ShipmentTracker](docs/ShipmentTracker.md)
 - [ShipmentTrackingNumberType](docs/ShipmentTrackingNumberType.md)
 - [ShipmentTrackingStatus](docs/ShipmentTrackingStatus.md)
 - [ShippingDetail](docs/ShippingDetail.md)
 - [ShippingOption](docs/ShippingOption.md)
 - [ShippingType](docs/ShippingType.md)
 - [ShippingWithTrackingDetails](docs/ShippingWithTrackingDetails.md)
 - [ShippingWithTrackingDetailsAllOf](docs/ShippingWithTrackingDetailsAllOf.md)
 - [Sofort](docs/Sofort.md)
 - [SofortRequest](docs/SofortRequest.md)
 - [StoreInVaultInstruction](docs/StoreInVaultInstruction.md)
 - [StoredPaymentSource](docs/StoredPaymentSource.md)
 - [StoredPaymentSourcePaymentType](docs/StoredPaymentSourcePaymentType.md)
 - [StoredPaymentSourceUsageType](docs/StoredPaymentSourceUsageType.md)
 - [SupplementaryData](docs/SupplementaryData.md)
 - [TRACKERIDNOTFOUND](docs/TRACKERIDNOTFOUND.md)
 - [TaxInfo](docs/TaxInfo.md)
 - [ThreeDSecureAuthenticationResponse](docs/ThreeDSecureAuthenticationResponse.md)
 - [Token](docs/Token.md)
 - [Tracker](docs/Tracker.md)
 - [TrackerAllOf](docs/TrackerAllOf.md)
 - [TrackerItem](docs/TrackerItem.md)
 - [TrackersUpdateTrackingInfo403Response](docs/TrackersUpdateTrackingInfo403Response.md)
 - [TrackersUpdateTrackingInfo404Response](docs/TrackersUpdateTrackingInfo404Response.md)
 - [TrackersUpdateTrackingInfo422Response](docs/TrackersUpdateTrackingInfo422Response.md)
 - [TrackersUpdateTrackingInfoResponse](docs/TrackersUpdateTrackingInfoResponse.md)
 - [Trustly](docs/Trustly.md)
 - [TrustlyRequest](docs/TrustlyRequest.md)
 - [V3VaultInstructionBase](docs/V3VaultInstructionBase.md)
 - [VaultInstructionBase](docs/VaultInstructionBase.md)
 - [VaultPaypalWalletBase](docs/VaultPaypalWalletBase.md)
 - [VaultPaypalWalletBaseAllOf](docs/VaultPaypalWalletBaseAllOf.md)
 - [VaultResponse](docs/VaultResponse.md)
 - [VaultVenmoWalletBase](docs/VaultVenmoWalletBase.md)
 - [VaultVenmoWalletBaseAllOf](docs/VaultVenmoWalletBaseAllOf.md)
 - [VenmoWalletAttributes](docs/VenmoWalletAttributes.md)
 - [VenmoWalletAttributesResponse](docs/VenmoWalletAttributesResponse.md)
 - [VenmoWalletExperienceContext](docs/VenmoWalletExperienceContext.md)
 - [VenmoWalletRequest](docs/VenmoWalletRequest.md)
 - [VenmoWalletResponse](docs/VenmoWalletResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
