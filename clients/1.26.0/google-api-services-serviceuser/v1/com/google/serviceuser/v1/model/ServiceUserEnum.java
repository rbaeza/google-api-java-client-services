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
 * Enum type definition.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service User API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceUserEnum extends com.google.api.client.json.GenericJson {

  /**
   * Enum value definitions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EnumValue> enumvalue;

  /**
   * Enum type name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Protocol buffer options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Option> options;

  /**
   * The source context.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SourceContext sourceContext;

  /**
   * The source syntax.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String syntax;

  /**
   * Enum value definitions.
   * @return value or {@code null} for none
   */
  public java.util.List<EnumValue> getEnumvalue() {
    return enumvalue;
  }

  /**
   * Enum value definitions.
   * @param enumvalue enumvalue or {@code null} for none
   */
  public ServiceUserEnum setEnumvalue(java.util.List<EnumValue> enumvalue) {
    this.enumvalue = enumvalue;
    return this;
  }

  /**
   * Enum type name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Enum type name.
   * @param name name or {@code null} for none
   */
  public ServiceUserEnum setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Protocol buffer options.
   * @return value or {@code null} for none
   */
  public java.util.List<Option> getOptions() {
    return options;
  }

  /**
   * Protocol buffer options.
   * @param options options or {@code null} for none
   */
  public ServiceUserEnum setOptions(java.util.List<Option> options) {
    this.options = options;
    return this;
  }

  /**
   * The source context.
   * @return value or {@code null} for none
   */
  public SourceContext getSourceContext() {
    return sourceContext;
  }

  /**
   * The source context.
   * @param sourceContext sourceContext or {@code null} for none
   */
  public ServiceUserEnum setSourceContext(SourceContext sourceContext) {
    this.sourceContext = sourceContext;
    return this;
  }

  /**
   * The source syntax.
   * @return value or {@code null} for none
   */
  public java.lang.String getSyntax() {
    return syntax;
  }

  /**
   * The source syntax.
   * @param syntax syntax or {@code null} for none
   */
  public ServiceUserEnum setSyntax(java.lang.String syntax) {
    this.syntax = syntax;
    return this;
  }

  @Override
  public ServiceUserEnum set(String fieldName, Object value) {
    return (ServiceUserEnum) super.set(fieldName, value);
  }

  @Override
  public ServiceUserEnum clone() {
    return (ServiceUserEnum) super.clone();
  }

}
