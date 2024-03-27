

# Patch

The JSON patch object to apply partial updates to resources.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**op** | [**OpEnum**](#OpEnum) | The operation. |  |
|**path** | **String** | The &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc6901\&quot;&gt;JSON Pointer&lt;/a&gt; to the target document location at which to complete the operation. |  [optional] |
|**value** | **Object** | The value to apply. The &lt;code&gt;remove&lt;/code&gt;, &lt;code&gt;copy&lt;/code&gt;, and &lt;code&gt;move&lt;/code&gt; operations do not require a value. Since &lt;a href&#x3D;\&quot;https://www.rfc-editor.org/rfc/rfc69021\&quot;&gt;JSON Patch&lt;/a&gt; allows any type for &lt;code&gt;value&lt;/code&gt;, the &lt;code&gt;type&lt;/code&gt; property is not specified. |  [optional] |
|**from** | **String** | The &lt;a href&#x3D;\&quot;https://tools.ietf.org/html/rfc6901\&quot;&gt;JSON Pointer&lt;/a&gt; to the target document location from which to move the value. Required for the &lt;code&gt;move&lt;/code&gt; operation. |  [optional] |



## Enum: OpEnum

| Name | Value |
|---- | -----|
| ADD | &quot;add&quot; |
| REMOVE | &quot;remove&quot; |
| REPLACE | &quot;replace&quot; |
| MOVE | &quot;move&quot; |
| COPY | &quot;copy&quot; |
| TEST | &quot;test&quot; |



