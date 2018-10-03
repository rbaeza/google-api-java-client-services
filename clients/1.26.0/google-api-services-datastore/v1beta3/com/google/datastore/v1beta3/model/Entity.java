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

package com.google.datastore.v1beta3.model;

/**
 * A Datastore data object.
 *
 * An entity is limited to 1 megabyte when stored. That _roughly_ corresponds to a limit of 1
 * megabyte for the serialized form of this message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Entity extends com.google.api.client.json.GenericJson {

  /**
   * The entity's key.
   *
   * An entity must have a key, unless otherwise documented (for example, an entity in
   * `Value.entity_value` may have no key). An entity's kind is its key path's last element's kind,
   * or null if it has no key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Key key;

  /**
   * The entity's properties. The map's keys are property names. A property name matching regex
   * `__.*__` is reserved. A reserved property name is forbidden in certain documented contexts. The
   * name must not contain more than 500 characters. The name cannot be `""`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, Value> properties;

  /**
   * The entity's key.
   *
   * An entity must have a key, unless otherwise documented (for example, an entity in
   * `Value.entity_value` may have no key). An entity's kind is its key path's last element's kind,
   * or null if it has no key.
   * @return value or {@code null} for none
   */
  public Key getKey() {
    return key;
  }

  /**
   * The entity's key.
   *
   * An entity must have a key, unless otherwise documented (for example, an entity in
   * `Value.entity_value` may have no key). An entity's kind is its key path's last element's kind,
   * or null if it has no key.
   * @param key key or {@code null} for none
   */
  public Entity setKey(Key key) {
    this.key = key;
    return this;
  }

  /**
   * The entity's properties. The map's keys are property names. A property name matching regex
   * `__.*__` is reserved. A reserved property name is forbidden in certain documented contexts. The
   * name must not contain more than 500 characters. The name cannot be `""`.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, Value> getProperties() {
    return properties;
  }

  /**
   * The entity's properties. The map's keys are property names. A property name matching regex
   * `__.*__` is reserved. A reserved property name is forbidden in certain documented contexts. The
   * name must not contain more than 500 characters. The name cannot be `""`.
   * @param properties properties or {@code null} for none
   */
  public Entity setProperties(java.util.Map<String, Value> properties) {
    this.properties = properties;
    return this;
  }

  @Override
  public Entity set(String fieldName, Object value) {
    return (Entity) super.set(fieldName, value);
  }

  @Override
  public Entity clone() {
    return (Entity) super.clone();
  }

}
