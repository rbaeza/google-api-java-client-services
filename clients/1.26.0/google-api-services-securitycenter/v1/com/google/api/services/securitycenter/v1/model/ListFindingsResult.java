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

package com.google.api.services.securitycenter.v1.model;

/**
 * Result containing the Finding and its StateChange.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListFindingsResult extends com.google.api.client.json.GenericJson {

  /**
   * Finding matching the search request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Finding finding;

  /**
   * State change of the finding between the points in time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateChange;

  /**
   * Finding matching the search request.
   * @return value or {@code null} for none
   */
  public Finding getFinding() {
    return finding;
  }

  /**
   * Finding matching the search request.
   * @param finding finding or {@code null} for none
   */
  public ListFindingsResult setFinding(Finding finding) {
    this.finding = finding;
    return this;
  }

  /**
   * State change of the finding between the points in time.
   * @return value or {@code null} for none
   */
  public java.lang.String getStateChange() {
    return stateChange;
  }

  /**
   * State change of the finding between the points in time.
   * @param stateChange stateChange or {@code null} for none
   */
  public ListFindingsResult setStateChange(java.lang.String stateChange) {
    this.stateChange = stateChange;
    return this;
  }

  @Override
  public ListFindingsResult set(String fieldName, Object value) {
    return (ListFindingsResult) super.set(fieldName, value);
  }

  @Override
  public ListFindingsResult clone() {
    return (ListFindingsResult) super.clone();
  }

}
