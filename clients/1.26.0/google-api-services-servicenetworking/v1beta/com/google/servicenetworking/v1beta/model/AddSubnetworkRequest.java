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

package com.google.servicenetworking.v1beta.model;

/**
 * Request to create a subnetwork in a previously peered service network.
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
public final class AddSubnetworkRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Resource representing service consumer. It may be different from the project number
   * in consumer network parameter in case of that network being a shared VPC network. In that case,
   * Service Networking will validate that this resource belongs to that shared VPC. For example
   * 'projects/123456'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumer;

  /**
   * Required. Network name in the consumer project.   This network must have been already peered
   * with a shared VPC network using CreateConnection method. Must be in a form
   * 'projects/{project}/global/networks/{network}'. {project} is a project number, as in '12345'
   * {network} is network name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerNetwork;

  /**
   * Optional. Description of the subnetwork.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. The prefix length of the IP range. Use usual CIDR range notation. For example, '30'
   * to provision subnet with x.x.x.x/30 CIDR range. Actual range will be determined using allocated
   * range for the consumer peered network and returned in the result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer ipPrefixLength;

  /**
   * Required. Cloud [region](/compute/docs/reference/rest/v1/regions) for the new subnetwork.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * Required. Name for the new subnetwork. Must be a legal
   * [subnetwork](compute/docs/reference/rest/v1/subnetworks) name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetwork;

  /**
   * Optional. List of members that will be granted 'compute.networkUser' role on the newly added
   * subnetwork.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> subnetworkUsers;

  /**
   * Required. Resource representing service consumer. It may be different from the project number
   * in consumer network parameter in case of that network being a shared VPC network. In that case,
   * Service Networking will validate that this resource belongs to that shared VPC. For example
   * 'projects/123456'.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumer() {
    return consumer;
  }

  /**
   * Required. Resource representing service consumer. It may be different from the project number
   * in consumer network parameter in case of that network being a shared VPC network. In that case,
   * Service Networking will validate that this resource belongs to that shared VPC. For example
   * 'projects/123456'.
   * @param consumer consumer or {@code null} for none
   */
  public AddSubnetworkRequest setConsumer(java.lang.String consumer) {
    this.consumer = consumer;
    return this;
  }

  /**
   * Required. Network name in the consumer project.   This network must have been already peered
   * with a shared VPC network using CreateConnection method. Must be in a form
   * 'projects/{project}/global/networks/{network}'. {project} is a project number, as in '12345'
   * {network} is network name.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerNetwork() {
    return consumerNetwork;
  }

  /**
   * Required. Network name in the consumer project.   This network must have been already peered
   * with a shared VPC network using CreateConnection method. Must be in a form
   * 'projects/{project}/global/networks/{network}'. {project} is a project number, as in '12345'
   * {network} is network name.
   * @param consumerNetwork consumerNetwork or {@code null} for none
   */
  public AddSubnetworkRequest setConsumerNetwork(java.lang.String consumerNetwork) {
    this.consumerNetwork = consumerNetwork;
    return this;
  }

  /**
   * Optional. Description of the subnetwork.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. Description of the subnetwork.
   * @param description description or {@code null} for none
   */
  public AddSubnetworkRequest setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. The prefix length of the IP range. Use usual CIDR range notation. For example, '30'
   * to provision subnet with x.x.x.x/30 CIDR range. Actual range will be determined using allocated
   * range for the consumer peered network and returned in the result.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIpPrefixLength() {
    return ipPrefixLength;
  }

  /**
   * Required. The prefix length of the IP range. Use usual CIDR range notation. For example, '30'
   * to provision subnet with x.x.x.x/30 CIDR range. Actual range will be determined using allocated
   * range for the consumer peered network and returned in the result.
   * @param ipPrefixLength ipPrefixLength or {@code null} for none
   */
  public AddSubnetworkRequest setIpPrefixLength(java.lang.Integer ipPrefixLength) {
    this.ipPrefixLength = ipPrefixLength;
    return this;
  }

  /**
   * Required. Cloud [region](/compute/docs/reference/rest/v1/regions) for the new subnetwork.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * Required. Cloud [region](/compute/docs/reference/rest/v1/regions) for the new subnetwork.
   * @param region region or {@code null} for none
   */
  public AddSubnetworkRequest setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * Required. Name for the new subnetwork. Must be a legal
   * [subnetwork](compute/docs/reference/rest/v1/subnetworks) name.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetwork() {
    return subnetwork;
  }

  /**
   * Required. Name for the new subnetwork. Must be a legal
   * [subnetwork](compute/docs/reference/rest/v1/subnetworks) name.
   * @param subnetwork subnetwork or {@code null} for none
   */
  public AddSubnetworkRequest setSubnetwork(java.lang.String subnetwork) {
    this.subnetwork = subnetwork;
    return this;
  }

  /**
   * Optional. List of members that will be granted 'compute.networkUser' role on the newly added
   * subnetwork.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSubnetworkUsers() {
    return subnetworkUsers;
  }

  /**
   * Optional. List of members that will be granted 'compute.networkUser' role on the newly added
   * subnetwork.
   * @param subnetworkUsers subnetworkUsers or {@code null} for none
   */
  public AddSubnetworkRequest setSubnetworkUsers(java.util.List<java.lang.String> subnetworkUsers) {
    this.subnetworkUsers = subnetworkUsers;
    return this;
  }

  @Override
  public AddSubnetworkRequest set(String fieldName, Object value) {
    return (AddSubnetworkRequest) super.set(fieldName, value);
  }

  @Override
  public AddSubnetworkRequest clone() {
    return (AddSubnetworkRequest) super.clone();
  }

}
