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
 * Returned in the google.longrunning.Operation response field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirestoreAdminV1beta2ExportDocumentsResponse extends com.google.api.client.json.GenericJson {

  /**
   * Location of the output files. This can be used to begin an import into Cloud Firestore (this
   * project or another project) after the operation completes successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputUriPrefix;

  /**
   * Location of the output files. This can be used to begin an import into Cloud Firestore (this
   * project or another project) after the operation completes successfully.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputUriPrefix() {
    return outputUriPrefix;
  }

  /**
   * Location of the output files. This can be used to begin an import into Cloud Firestore (this
   * project or another project) after the operation completes successfully.
   * @param outputUriPrefix outputUriPrefix or {@code null} for none
   */
  public GoogleFirestoreAdminV1beta2ExportDocumentsResponse setOutputUriPrefix(java.lang.String outputUriPrefix) {
    this.outputUriPrefix = outputUriPrefix;
    return this;
  }

  @Override
  public GoogleFirestoreAdminV1beta2ExportDocumentsResponse set(String fieldName, Object value) {
    return (GoogleFirestoreAdminV1beta2ExportDocumentsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleFirestoreAdminV1beta2ExportDocumentsResponse clone() {
    return (GoogleFirestoreAdminV1beta2ExportDocumentsResponse) super.clone();
  }

}
