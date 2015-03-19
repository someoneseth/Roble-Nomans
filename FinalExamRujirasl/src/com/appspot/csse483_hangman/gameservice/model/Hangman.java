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
 * on 2015-02-20 at 21:52:14 UTC 
 * Modify at your own risk.
 */

package com.appspot.csse483_hangman.gameservice.model;

/**
 * Model definition for Hangman.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the gameservice. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Hangman extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creator;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("display_word")
  private java.lang.String displayWord;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityKey;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String guesses;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("last_touch_date_time")
  private java.lang.String lastTouchDateTime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("secret_word")
  private java.lang.String secretWord;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCreator() {
    return creator;
  }

  /**
   * @param creator creator or {@code null} for none
   */
  public Hangman setCreator(java.lang.String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayWord() {
    return displayWord;
  }

  /**
   * @param displayWord displayWord or {@code null} for none
   */
  public Hangman setDisplayWord(java.lang.String displayWord) {
    this.displayWord = displayWord;
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
  public Hangman setEntityKey(java.lang.String entityKey) {
    this.entityKey = entityKey;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getGuesses() {
    return guesses;
  }

  /**
   * @param guesses guesses or {@code null} for none
   */
  public Hangman setGuesses(java.lang.String guesses) {
    this.guesses = guesses;
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
  public Hangman setLastTouchDateTime(java.lang.String lastTouchDateTime) {
    this.lastTouchDateTime = lastTouchDateTime;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSecretWord() {
    return secretWord;
  }

  /**
   * @param secretWord secretWord or {@code null} for none
   */
  public Hangman setSecretWord(java.lang.String secretWord) {
    this.secretWord = secretWord;
    return this;
  }

  @Override
  public Hangman set(String fieldName, Object value) {
    return (Hangman) super.set(fieldName, value);
  }

  @Override
  public Hangman clone() {
    return (Hangman) super.clone();
  }

}
