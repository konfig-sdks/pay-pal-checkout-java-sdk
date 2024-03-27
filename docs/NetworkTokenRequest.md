

# NetworkTokenRequest

The Third Party Network token used to fund a payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**number** | **String** | Third party network token number. |  |
|**expiry** | **String** | The year and month, in ISO-8601 &#x60;YYYY-MM&#x60; date format. See [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). |  |
|**cryptogram** | **String** | An Encrypted one-time use value that&#39;s sent along with Network Token. This field is not required to be present for recurring transactions. |  [optional] |
|**eciFlag** | **EciFlag** |  |  [optional] |
|**tokenRequestorId** | **String** | A TRID, or a Token Requestor ID, is an identifier used by merchants to request network tokens from card networks. A TRID is a precursor to obtaining a network token for a credit card primary account number (PAN), and will aid in enabling secure card on file (COF) payments and reducing fraud. |  [optional] |



