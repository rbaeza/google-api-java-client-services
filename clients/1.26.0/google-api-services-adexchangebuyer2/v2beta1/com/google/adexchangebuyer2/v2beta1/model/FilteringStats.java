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

package com.google.adexchangebuyer2.v2beta1.model;

/**
 * @OutputOnly Filtering reasons for this creative during a period of a single day (from midnight to
 * midnight Pacific).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FilteringStats extends com.google.api.client.json.GenericJson {

  /**
   * The day during which the data was collected. The data is collected from 00:00:00 to 23:59:59
   * PT. During switches from PST to PDT and back, the day may contain 23 or 25 hours of data
   * instead of the usual 24.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date date;

  /**
   * The set of filtering reasons for this date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Reason> reasons;

  /**
   * The day during which the data was collected. The data is collected from 00:00:00 to 23:59:59
   * PT. During switches from PST to PDT and back, the day may contain 23 or 25 hours of data
   * instead of the usual 24.
   * @return value or {@code null} for none
   */
  public Date getDate() {
    return date;
  }

  /**
   * The day during which the data was collected. The data is collected from 00:00:00 to 23:59:59
   * PT. During switches from PST to PDT and back, the day may contain 23 or 25 hours of data
   * instead of the usual 24.
   * @param date date or {@code null} for none
   */
  public FilteringStats setDate(Date date) {
    this.date = date;
    return this;
  }

  /**
   * The set of filtering reasons for this date.
   * @return value or {@code null} for none
   */
  public java.util.List<Reason> getReasons() {
    return reasons;
  }

  /**
   * The set of filtering reasons for this date.
   * @param reasons reasons or {@code null} for none
   */
  public FilteringStats setReasons(java.util.List<Reason> reasons) {
    this.reasons = reasons;
    return this;
  }

  @Override
  public FilteringStats set(String fieldName, Object value) {
    return (FilteringStats) super.set(fieldName, value);
  }

  @Override
  public FilteringStats clone() {
    return (FilteringStats) super.clone();
  }

}
