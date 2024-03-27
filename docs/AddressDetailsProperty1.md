

# AddressDetailsProperty1

The non-portable additional address details include fine-grain address information for Compliance, Risk, and other scenarios. This isn't portable with common third-party and open source applications. This can include data that is redundant with core fields. For example, `address_portable.address_line_1` is usually a combination of `address_details.street_number`, `street_name`, and `street_type`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**streetNumber** | **String** | The street number. |  [optional] |
|**streetName** | **String** | The street name. Just &#x60;Drury&#x60; in &#x60;Drury Lane&#x60;. |  [optional] |
|**streetType** | **String** | The street type. For example, avenue, boulevard, road, or expressway. |  [optional] |
|**deliveryService** | **String** | The delivery service. Post office box, bag number, or post office name. |  [optional] |
|**buildingName** | **String** | A named locations that represents the premise. Usually a building name or number or collection of buildings with a common name or number. For example, &lt;code&gt;Craven House&lt;/code&gt;. |  [optional] |
|**subBuilding** | **String** | The first-order entity below a named building or location that represents the sub-premise. Usually a single building within a collection of buildings with a common name. Can be a flat, story, floor, room, or apartment. |  [optional] |



