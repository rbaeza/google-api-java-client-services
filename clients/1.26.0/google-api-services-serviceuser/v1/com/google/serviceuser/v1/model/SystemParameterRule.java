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

package com.google.serviceuser.v1.model;

/**
 * Define a system parameter rule mapping system parameter definitions to methods.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service User API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SystemParameterRule extends com.google.api.client.json.GenericJson {

  /**
   * Define parameters. Multiple names may be defined for a parameter. For a given method call, only
   * one of them should be used. If multiple names are used the behavior is implementation-
   * dependent. If none of the specified names are present the behavior is parameter-dependent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SystemParameter> parameters;

  static {
    // hack to force ProGuard to consider SystemParameter used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SystemParameter.class);
  }

  /**
   * Selects the methods to which this rule applies. Use '*' to indicate all methods in all APIs.
   *
   * Refer to selector for syntax details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selector;

  /**
   * Define parameters. Multiple names may be defined for a parameter. For a given method call, only
   * one of them should be used. If multiple names are used the behavior is implementation-
   * dependent. If none of the specified names are present the behavior is parameter-dependent.
   * @return value or {@code null} for none
   */
  public java.util.List<SystemParameter> getParameters() {
    return parameters;
  }

  /**
   * Define parameters. Multiple names may be defined for a parameter. For a given method call, only
   * one of them should be used. If multiple names are used the behavior is implementation-
   * dependent. If none of the specified names are present the behavior is parameter-dependent.
   * @param parameters parameters or {@code null} for none
   */
  public SystemParameterRule setParameters(java.util.List<SystemParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Selects the methods to which this rule applies. Use '*' to indicate all methods in all APIs.
   *
   * Refer to selector for syntax details.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelector() {
    return selector;
  }

  /**
   * Selects the methods to which this rule applies. Use '*' to indicate all methods in all APIs.
   *
   * Refer to selector for syntax details.
   * @param selector selector or {@code null} for none
   */
  public SystemParameterRule setSelector(java.lang.String selector) {
    this.selector = selector;
    return this;
  }

  @Override
  public SystemParameterRule set(String fieldName, Object value) {
    return (SystemParameterRule) super.set(fieldName, value);
  }

  @Override
  public SystemParameterRule clone() {
    return (SystemParameterRule) super.clone();
  }

}
