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

package com.google.alertcenter.v1beta1.model;

/**
 * Response message for an alert listing request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Alert Center API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListAlertsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of alerts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Alert> alerts;

  /**
   * If not empty, indicates that there may be more alerts that match the request; this value can be
   * passed in a new ListAlertsRequest to get the next page of values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of alerts.
   * @return value or {@code null} for none
   */
  public java.util.List<Alert> getAlerts() {
    return alerts;
  }

  /**
   * The list of alerts.
   * @param alerts alerts or {@code null} for none
   */
  public ListAlertsResponse setAlerts(java.util.List<Alert> alerts) {
    this.alerts = alerts;
    return this;
  }

  /**
   * If not empty, indicates that there may be more alerts that match the request; this value can be
   * passed in a new ListAlertsRequest to get the next page of values.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If not empty, indicates that there may be more alerts that match the request; this value can be
   * passed in a new ListAlertsRequest to get the next page of values.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListAlertsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListAlertsResponse set(String fieldName, Object value) {
    return (ListAlertsResponse) super.set(fieldName, value);
  }

  @Override
  public ListAlertsResponse clone() {
    return (ListAlertsResponse) super.clone();
  }

}
