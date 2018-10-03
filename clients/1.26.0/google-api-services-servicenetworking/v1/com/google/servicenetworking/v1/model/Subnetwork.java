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

package com.google.servicenetworking.v1.model;

/**
 * Message returning the created service subnetwork.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Networking API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Subnetwork extends com.google.api.client.json.GenericJson {

  /**
   * Subnetwork CIDR range in "10.x.x.x/y" format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipCidrRange;

  /**
   * Subnetwork name. See https://cloud.google.com/compute/docs/vpc/
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Subnetwork CIDR range in "10.x.x.x/y" format.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpCidrRange() {
    return ipCidrRange;
  }

  /**
   * Subnetwork CIDR range in "10.x.x.x/y" format.
   * @param ipCidrRange ipCidrRange or {@code null} for none
   */
  public Subnetwork setIpCidrRange(java.lang.String ipCidrRange) {
    this.ipCidrRange = ipCidrRange;
    return this;
  }

  /**
   * Subnetwork name. See https://cloud.google.com/compute/docs/vpc/
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Subnetwork name. See https://cloud.google.com/compute/docs/vpc/
   * @param name name or {@code null} for none
   */
  public Subnetwork setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public Subnetwork set(String fieldName, Object value) {
    return (Subnetwork) super.set(fieldName, value);
  }

  @Override
  public Subnetwork clone() {
    return (Subnetwork) super.clone();
  }

}
