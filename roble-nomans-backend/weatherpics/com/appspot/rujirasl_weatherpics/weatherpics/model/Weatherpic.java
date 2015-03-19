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
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2015-01-14 17:53:03 UTC)
 * on 2015-02-10 at 21:06:57 UTC 
 * Modify at your own risk.
 */

package com.appspot.rujirasl_weatherpics.weatherpics.model;

/**
 * Model definition for Weatherpic.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the weatherpics. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Weatherpic extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String caption;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityKey;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("image_url")
  private java.lang.String imageUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("last_touch_date_time")
  private java.lang.String lastTouchDateTime;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCaption() {
    return caption;
  }

  /**
   * @param caption caption or {@code null} for none
   */
  public Weatherpic setCaption(java.lang.String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityKey() {
    return entityKey;
  }

  /**
   * @param entityKey entityKey or {@code null} for none
   */
  public Weatherpic setEntityKey(java.lang.String entityKey) {
    this.entityKey = entityKey;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUrl() {
    return imageUrl;
  }

  /**
   * @param imageUrl imageUrl or {@code null} for none
   */
  public Weatherpic setImageUrl(java.lang.String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLastTouchDateTime() {
    return lastTouchDateTime;
  }

  /**
   * @param lastTouchDateTime lastTouchDateTime or {@code null} for none
   */
  public Weatherpic setLastTouchDateTime(java.lang.String lastTouchDateTime) {
    this.lastTouchDateTime = lastTouchDateTime;
    return this;
  }

  @Override
  public Weatherpic set(String fieldName, Object value) {
    return (Weatherpic) super.set(fieldName, value);
  }

  @Override
  public Weatherpic clone() {
    return (Weatherpic) super.clone();
  }

}
