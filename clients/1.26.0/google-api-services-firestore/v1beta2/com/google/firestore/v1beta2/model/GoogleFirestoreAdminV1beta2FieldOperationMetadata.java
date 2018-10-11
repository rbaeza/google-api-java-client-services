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

package com.google.firestore.v1beta2.model;

/**
 * Metadata for google.longrunning.Operation results from FirestoreAdmin.UpdateField.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirestoreAdminV1beta2FieldOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The progress, in bytes, of this operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleFirestoreAdminV1beta2Progress bytesProgress;

  /**
   * The progress, in documents, of this operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleFirestoreAdminV1beta2Progress documentProgress;

  /**
   * The time this operation completed. Will be unset if operation still in progress.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * The field resource that this operation is acting on. For example: `projects/{project_id}/databa
   * ses/{database_id}/collectionGroups/{collection_id}/fields/{field_path}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String field;

  /**
   * A list of IndexConfigDelta, which describe the intent of this operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleFirestoreAdminV1beta2IndexConfigDelta> indexConfigDeltas;

  /**
   * The time this operation started.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * The state of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The progress, in bytes, of this operation.
   * @return value or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2Progress getBytesProgress() {
    return bytesProgress;
  }

  /**
   * The progress, in bytes, of this operation.
   * @param bytesProgress bytesProgress or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2FieldOperationMetadata setBytesProgress(GoogleFirestoreAdminV1beta2Progress bytesProgress) {
    this.bytesProgress = bytesProgress;
    return this;
  }

  /**
   * The progress, in documents, of this operation.
   * @return value or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2Progress getDocumentProgress() {
    return documentProgress;
  }

  /**
   * The progress, in documents, of this operation.
   * @param documentProgress documentProgress or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2FieldOperationMetadata setDocumentProgress(GoogleFirestoreAdminV1beta2Progress documentProgress) {
    this.documentProgress = documentProgress;
    return this;
  }

  /**
   * The time this operation completed. Will be unset if operation still in progress.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The time this operation completed. Will be unset if operation still in progress.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2FieldOperationMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The field resource that this operation is acting on. For example: `projects/{project_id}/databa
   * ses/{database_id}/collectionGroups/{collection_id}/fields/{field_path}`
   * @return value or {@code null} for none
   */
  public java.lang.String getField() {
    return field;
  }

  /**
   * The field resource that this operation is acting on. For example: `projects/{project_id}/databa
   * ses/{database_id}/collectionGroups/{collection_id}/fields/{field_path}`
   * @param field field or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2FieldOperationMetadata setField(java.lang.String field) {
    this.field = field;
    return this;
  }

  /**
   * A list of IndexConfigDelta, which describe the intent of this operation.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleFirestoreAdminV1beta2IndexConfigDelta> getIndexConfigDeltas() {
    return indexConfigDeltas;
  }

  /**
   * A list of IndexConfigDelta, which describe the intent of this operation.
   * @param indexConfigDeltas indexConfigDeltas or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2FieldOperationMetadata setIndexConfigDeltas(java.util.List<GoogleFirestoreAdminV1beta2IndexConfigDelta> indexConfigDeltas) {
    this.indexConfigDeltas = indexConfigDeltas;
    return this;
  }

  /**
   * The time this operation started.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The time this operation started.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2FieldOperationMetadata setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The state of the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of the operation.
   * @param state state or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2FieldOperationMetadata setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleFirestoreAdminV1beta2FieldOperationMetadata set(String fieldName, Object value) {
    return (GoogleFirestoreAdminV1beta2FieldOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleFirestoreAdminV1beta2FieldOperationMetadata clone() {
    return (GoogleFirestoreAdminV1beta2FieldOperationMetadata) super.clone();
  }

}
