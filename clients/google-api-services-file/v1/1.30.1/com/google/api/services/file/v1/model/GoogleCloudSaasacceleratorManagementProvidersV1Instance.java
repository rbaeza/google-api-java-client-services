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

package com.google.api.services.file.v1.model;

/**
 * Instance represents the interface for SLM services to actuate the state of control plane
 * resources.
 *
 * Example Instance in JSON, where   consumer-project=snapchat,   producer-project=cloud-sql:
 *
 * ```json Instance: {   "name":   "projects/snapchat/locations/us-east1/instances/prod-instance",
 * "create_time": {     "seconds": 1526406431,   },   "labels": {     "env": "prod",     "foo":
 * "bar"   },   "state": READY,   "software_versions": {     "software_update": "cloud-
 * sql-09-28-2018",   },   "maintenance_policy_names": {     "UpdatePolicy":
 * "projects/snapchat/locations/us-east1/maintenancePolicies/prod-update-policy",   }
 * "tenant_project_id": "cloud-sql-test-tenant",   "producer_metadata": {     "cloud-sql-tier":
 * "basic",     "cloud-sql-instance-size": "1G",   },   "provisioned_resources": [     {
 * "resource-type": "compute-instance",       "resource-url":
 * "https://www.googleapis.com/compute/v1/projects/cloud-sql/zones/us-east1-b/instances/vm-1",     }
 * ],   "maintenance_schedules": {     "csa_rollout": {        "start_time": {           "seconds":
 * 1526406431,        },        "end_time": {           "seconds": 1535406431,        },     },
 * "ncsa_rollout": {        "start_time": {           "seconds": 1526406431,        },
 * "end_time": {           "seconds": 1535406431,        },     }   },   "consumer_defined_name":
 * "my-sql-instance1", } ```
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Filestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSaasacceleratorManagementProvidersV1Instance extends com.google.api.client.json.GenericJson {

  /**
   * consumer_defined_name is the name that is set by the consumer. On the other hand Name field
   * represents system-assigned id of an instance so consumers are not necessarily aware of it.
   * consumer_defined_name is used for notification/UI purposes for consumer to recognize their
   * instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerDefinedName;

  /**
   * Output only. Timestamp when the resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. Resource labels to represent user provided metadata. Each label is a key-value pair,
   * where both the key and the value are arbitrary strings provided by the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The MaintenancePolicies that have been attached to the instance. The key must be of the type
   * name of the oneof policy name defined in MaintenancePolicy, and the referenced policy must
   * define the same policy type. For complete details of MaintenancePolicy, please refer to go
   * /cloud-saas-mw-ug.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> maintenancePolicyNames;

  /**
   * The MaintenanceSchedule contains the scheduling information of published maintenance schedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule> maintenanceSchedules;

  /**
   * Unique name of the resource. It uses the form:
   * `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Custom string attributes used primarily to expose producer-specific information in
   * monitoring dashboards. See go/get-instance-metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> producerMetadata;

  /**
   * Output only. The list of data plane resources provisioned for this instance, e.g. compute VMs.
   * See go/get-instance-metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource> provisionedResources;

  /**
   * The map between RolloutType and the corresponding RolloutMetadata. This is only mutated by
   * rollout service. For actuation implementation, this information is pass-through for Rollout
   * management. Producer shall not modify by itself. For update of a single entry in this map, the
   * update field mask shall follow this sementics: go/advanced-field-masks
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudSaasacceleratorManagementProvidersV1RolloutMetadata> rolloutMetadata;

  /**
   * Link to the SLM instance template. Only populated when updating SLM instances via SSA's
   * Actuation service adaptor. Service producers with custom control plane (e.g. Cloud SQL) doesn't
   * need to populate this field. Instead they should use software_versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String slmInstanceTemplate;

  /**
   * Output only. SLO metadata for instance classification in the Standardized dataplane SLO
   * platform. See go/cloud-ssa-standard-slo for feature description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata sloMetadata;

  /**
   * Software versions that are used to deploy this instance. This can be mutated by rollout
   * services.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> softwareVersions;

  /**
   * Output only. Current lifecycle state of the resource (e.g. if it's being created or ready to
   * use).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. ID of the associated GCP tenant project. See go/get-instance-metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tenantProjectId;

  /**
   * Output only. Timestamp when the resource was last modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * consumer_defined_name is the name that is set by the consumer. On the other hand Name field
   * represents system-assigned id of an instance so consumers are not necessarily aware of it.
   * consumer_defined_name is used for notification/UI purposes for consumer to recognize their
   * instances.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerDefinedName() {
    return consumerDefinedName;
  }

  /**
   * consumer_defined_name is the name that is set by the consumer. On the other hand Name field
   * represents system-assigned id of an instance so consumers are not necessarily aware of it.
   * consumer_defined_name is used for notification/UI purposes for consumer to recognize their
   * instances.
   * @param consumerDefinedName consumerDefinedName or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setConsumerDefinedName(java.lang.String consumerDefinedName) {
    this.consumerDefinedName = consumerDefinedName;
    return this;
  }

  /**
   * Output only. Timestamp when the resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when the resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. Resource labels to represent user provided metadata. Each label is a key-value pair,
   * where both the key and the value are arbitrary strings provided by the user.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Resource labels to represent user provided metadata. Each label is a key-value pair,
   * where both the key and the value are arbitrary strings provided by the user.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The MaintenancePolicies that have been attached to the instance. The key must be of the type
   * name of the oneof policy name defined in MaintenancePolicy, and the referenced policy must
   * define the same policy type. For complete details of MaintenancePolicy, please refer to go
   * /cloud-saas-mw-ug.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMaintenancePolicyNames() {
    return maintenancePolicyNames;
  }

  /**
   * The MaintenancePolicies that have been attached to the instance. The key must be of the type
   * name of the oneof policy name defined in MaintenancePolicy, and the referenced policy must
   * define the same policy type. For complete details of MaintenancePolicy, please refer to go
   * /cloud-saas-mw-ug.
   * @param maintenancePolicyNames maintenancePolicyNames or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setMaintenancePolicyNames(java.util.Map<String, java.lang.String> maintenancePolicyNames) {
    this.maintenancePolicyNames = maintenancePolicyNames;
    return this;
  }

  /**
   * The MaintenanceSchedule contains the scheduling information of published maintenance schedule.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule> getMaintenanceSchedules() {
    return maintenanceSchedules;
  }

  /**
   * The MaintenanceSchedule contains the scheduling information of published maintenance schedule.
   * @param maintenanceSchedules maintenanceSchedules or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setMaintenanceSchedules(java.util.Map<String, GoogleCloudSaasacceleratorManagementProvidersV1MaintenanceSchedule> maintenanceSchedules) {
    this.maintenanceSchedules = maintenanceSchedules;
    return this;
  }

  /**
   * Unique name of the resource. It uses the form:
   * `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Unique name of the resource. It uses the form:
   * `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * @param name name or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Custom string attributes used primarily to expose producer-specific information in
   * monitoring dashboards. See go/get-instance-metadata.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getProducerMetadata() {
    return producerMetadata;
  }

  /**
   * Output only. Custom string attributes used primarily to expose producer-specific information in
   * monitoring dashboards. See go/get-instance-metadata.
   * @param producerMetadata producerMetadata or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setProducerMetadata(java.util.Map<String, java.lang.String> producerMetadata) {
    this.producerMetadata = producerMetadata;
    return this;
  }

  /**
   * Output only. The list of data plane resources provisioned for this instance, e.g. compute VMs.
   * See go/get-instance-metadata.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource> getProvisionedResources() {
    return provisionedResources;
  }

  /**
   * Output only. The list of data plane resources provisioned for this instance, e.g. compute VMs.
   * See go/get-instance-metadata.
   * @param provisionedResources provisionedResources or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setProvisionedResources(java.util.List<GoogleCloudSaasacceleratorManagementProvidersV1ProvisionedResource> provisionedResources) {
    this.provisionedResources = provisionedResources;
    return this;
  }

  /**
   * The map between RolloutType and the corresponding RolloutMetadata. This is only mutated by
   * rollout service. For actuation implementation, this information is pass-through for Rollout
   * management. Producer shall not modify by itself. For update of a single entry in this map, the
   * update field mask shall follow this sementics: go/advanced-field-masks
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudSaasacceleratorManagementProvidersV1RolloutMetadata> getRolloutMetadata() {
    return rolloutMetadata;
  }

  /**
   * The map between RolloutType and the corresponding RolloutMetadata. This is only mutated by
   * rollout service. For actuation implementation, this information is pass-through for Rollout
   * management. Producer shall not modify by itself. For update of a single entry in this map, the
   * update field mask shall follow this sementics: go/advanced-field-masks
   * @param rolloutMetadata rolloutMetadata or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setRolloutMetadata(java.util.Map<String, GoogleCloudSaasacceleratorManagementProvidersV1RolloutMetadata> rolloutMetadata) {
    this.rolloutMetadata = rolloutMetadata;
    return this;
  }

  /**
   * Link to the SLM instance template. Only populated when updating SLM instances via SSA's
   * Actuation service adaptor. Service producers with custom control plane (e.g. Cloud SQL) doesn't
   * need to populate this field. Instead they should use software_versions.
   * @return value or {@code null} for none
   */
  public java.lang.String getSlmInstanceTemplate() {
    return slmInstanceTemplate;
  }

  /**
   * Link to the SLM instance template. Only populated when updating SLM instances via SSA's
   * Actuation service adaptor. Service producers with custom control plane (e.g. Cloud SQL) doesn't
   * need to populate this field. Instead they should use software_versions.
   * @param slmInstanceTemplate slmInstanceTemplate or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setSlmInstanceTemplate(java.lang.String slmInstanceTemplate) {
    this.slmInstanceTemplate = slmInstanceTemplate;
    return this;
  }

  /**
   * Output only. SLO metadata for instance classification in the Standardized dataplane SLO
   * platform. See go/cloud-ssa-standard-slo for feature description.
   * @return value or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata getSloMetadata() {
    return sloMetadata;
  }

  /**
   * Output only. SLO metadata for instance classification in the Standardized dataplane SLO
   * platform. See go/cloud-ssa-standard-slo for feature description.
   * @param sloMetadata sloMetadata or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setSloMetadata(GoogleCloudSaasacceleratorManagementProvidersV1SloMetadata sloMetadata) {
    this.sloMetadata = sloMetadata;
    return this;
  }

  /**
   * Software versions that are used to deploy this instance. This can be mutated by rollout
   * services.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getSoftwareVersions() {
    return softwareVersions;
  }

  /**
   * Software versions that are used to deploy this instance. This can be mutated by rollout
   * services.
   * @param softwareVersions softwareVersions or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setSoftwareVersions(java.util.Map<String, java.lang.String> softwareVersions) {
    this.softwareVersions = softwareVersions;
    return this;
  }

  /**
   * Output only. Current lifecycle state of the resource (e.g. if it's being created or ready to
   * use).
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. Current lifecycle state of the resource (e.g. if it's being created or ready to
   * use).
   * @param state state or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. ID of the associated GCP tenant project. See go/get-instance-metadata.
   * @return value or {@code null} for none
   */
  public java.lang.String getTenantProjectId() {
    return tenantProjectId;
  }

  /**
   * Output only. ID of the associated GCP tenant project. See go/get-instance-metadata.
   * @param tenantProjectId tenantProjectId or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setTenantProjectId(java.lang.String tenantProjectId) {
    this.tenantProjectId = tenantProjectId;
    return this;
  }

  /**
   * Output only. Timestamp when the resource was last modified.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Timestamp when the resource was last modified.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance set(String fieldName, Object value) {
    return (GoogleCloudSaasacceleratorManagementProvidersV1Instance) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSaasacceleratorManagementProvidersV1Instance clone() {
    return (GoogleCloudSaasacceleratorManagementProvidersV1Instance) super.clone();
  }

}
