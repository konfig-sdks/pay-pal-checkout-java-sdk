

# Tracker

The tracking response on creation of tracker.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The tracker id. |  [optional] [readonly] |
|**status** | **Object** |  |  [optional] |
|**items** | [**List&lt;TrackerItem&gt;**](TrackerItem.md) | An array of details of items in the shipment. |  [optional] |
|**links** | [**List&lt;LinkDescription&gt;**](LinkDescription.md) | An array of request-related HATEOAS links. |  [optional] [readonly] |
|**createTime** | **String** | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt; |  [optional] |
|**updateTime** | **String** | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression provides guidance but does not reject all invalid dates.&lt;/blockquote&gt; |  [optional] |



