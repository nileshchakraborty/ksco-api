# DefaultApi

All URIs are relative to *https://http://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registration**](DefaultApi.md#registration) | **POST** /registration | Updates a pet in the store with form data


<a name="registration"></a>
# **registration**
> registration(user, email, session)

Updates a pet in the store with form data

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://http://localhost:8080/api/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String user = "user_example"; // String | username
    String email = "email_example"; // String | email
    String session = "session_example"; // String | session token
    try {
      apiInstance.registration(user, email, session);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#registration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | **String**| username |
 **email** | **String**| email |
 **session** | **String**| session token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | true/false |  -  |
**405** | Invalid input |  -  |

