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

package com.google.androidenterprise.model;

/**
 * Model definition for AdministratorWebTokenSpecPlaySearch.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdministratorWebTokenSpecPlaySearch extends com.google.api.client.json.GenericJson {

  /**
   * Allow access to the iframe in approve mode. Default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean approveApps;

  /**
   * Whether the Play Search page is displayed. Default is true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Allow access to the iframe in approve mode. Default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getApproveApps() {
    return approveApps;
  }

  /**
   * Allow access to the iframe in approve mode. Default is false.
   * @param approveApps approveApps or {@code null} for none
   */
  public AdministratorWebTokenSpecPlaySearch setApproveApps(java.lang.Boolean approveApps) {
    this.approveApps = approveApps;
    return this;
  }

  /**
   * Whether the Play Search page is displayed. Default is true.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Whether the Play Search page is displayed. Default is true.
   * @param enabled enabled or {@code null} for none
   */
  public AdministratorWebTokenSpecPlaySearch setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  @Override
  public AdministratorWebTokenSpecPlaySearch set(String fieldName, Object value) {
    return (AdministratorWebTokenSpecPlaySearch) super.set(fieldName, value);
  }

  @Override
  public AdministratorWebTokenSpecPlaySearch clone() {
    return (AdministratorWebTokenSpecPlaySearch) super.clone();
  }

}
