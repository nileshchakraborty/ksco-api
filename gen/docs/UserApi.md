# UserApi

All URIs are relative to *https://http://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loggedInUser**](UserApi.md#loggedInUser) | **GET** /user | User is logged in


<a name="loggedInUser"></a>
# **loggedInUser**
> loggedInUser()

User is logged in

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://http://localhost:8080/api/v1");

    UserApi apiInstance = new UserApi(defaultClient);
    try {
      apiInstance.loggedInUser();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#loggedInUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns true/false |  -  |

