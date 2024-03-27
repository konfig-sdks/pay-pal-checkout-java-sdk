

# ApplePayPaymentData

Information about the decrypted apple pay payment data for the token like cryptogram, eci indicator.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cryptogram** | **String** | Online payment cryptogram, as defined by 3D Secure. The pattern is defined by an external party and supports Unicode. |  [optional] |
|**eciIndicator** | **String** | ECI indicator, as defined by 3- Secure. The pattern is defined by an external party and supports Unicode. |  [optional] |
|**emvData** | **String** | Encoded Apple Pay EMV Payment Structure used for payments in China. The pattern is defined by an external party and supports Unicode. |  [optional] |
|**pin** | **String** | Bank Key encrypted Apple Pay PIN. The pattern is defined by an external party and supports Unicode. |  [optional] |



