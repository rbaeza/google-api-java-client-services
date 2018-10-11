/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.servicemanagement.model;

/**
 * Response message for ListServiceConfigs method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListServiceConfigsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The token of the next page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of service configuration resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Service> serviceConfigs;

  static {
    // hack to force ProGuard to consider Service used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Service.class);
  }

  /**
   * The token of the next page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * The token of the next page of results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListServiceConfigsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of service configuration resources.
   * @return value or {@code null} for none
   */
  public java.util.List<Service> getServiceConfigs() {
    return serviceConfigs;
  }

  /**
   * The list of service configuration resources.
   * @param serviceConfigs serviceConfigs or {@code null} for none
   */
  public ListServiceConfigsResponse setServiceConfigs(java.util.List<Service> serviceConfigs) {
    this.serviceConfigs = serviceConfigs;
    return this;
  }

  @Override
  public ListServiceConfigsResponse set(String fieldName, Object value) {
    return (ListServiceConfigsResponse) super.set(fieldName, value);
  }

  @Override
  public ListServiceConfigsResponse clone() {
    return (ListServiceConfigsResponse) super.clone();
  }

}
