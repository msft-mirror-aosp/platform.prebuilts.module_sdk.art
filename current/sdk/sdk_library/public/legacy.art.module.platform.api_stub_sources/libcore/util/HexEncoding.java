/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package libcore.util;


/**
 * Hexadecimal encoding where each byte is represented by two hexadecimal digits.
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class HexEncoding {

private HexEncoding() { throw new RuntimeException("Stub!"); }

/**
 * Encodes the provided byte as a two-digit hexadecimal String value.
 *
 * @param  b byte to encode
 * @param  upperCase {@code true} to use uppercase letters, {@code false}
 *         for lowercase
 * @return the encoded string
 *
 * @hide
 */

public static java.lang.String encodeToString(byte b, boolean upperCase) { throw new RuntimeException("Stub!"); }

/**
 * Encodes the provided data as a sequence of hexadecimal characters.
 *
 * @param  data byte array to encode
 * @return the encoded data, using uppercase letters
 *
 * @hide
 */

public static char[] encode(byte[] data) { throw new RuntimeException("Stub!"); }

/**
 * Encodes the provided data as a sequence of hexadecimal characters.
 *
 * @param  data byte array to encode
 * @param  upperCase {@code true} to use uppercase letters, {@code false}
 *         for lowercase
 * @return the encoded data
 *
 * @hide
 */

public static char[] encode(byte[] data, boolean upperCase) { throw new RuntimeException("Stub!"); }

/**
 * Encodes the provided data as a sequence of hexadecimal characters.
 *
 * @param  data byte array containing the data to encode
 * @param  offset offset of the data to encode in the {@code data} array
 * @param  len length of the data to encode in the {@code data} array
 * @return the encoded data, using uppercase letters
 *
 * @hide
 */

public static char[] encode(byte[] data, int offset, int len) { throw new RuntimeException("Stub!"); }

/**
 * Encodes the provided data as a sequence of hexadecimal characters.
 *
 * @param  data byte array to encode
 * @return the encoded data, using uppercase letters
 *
 * @hide
 */

public static java.lang.String encodeToString(byte[] data) { throw new RuntimeException("Stub!"); }

/**
 * Encodes the provided data as a sequence of hexadecimal characters.
 *
 * @param  data byte array to encode.
 * @param  upperCase {@code true} to use uppercase letters, {@code false}
 *         for lowercase
 * @return the encoded data
 *
 * @hide
 */

public static java.lang.String encodeToString(byte[] data, boolean upperCase) { throw new RuntimeException("Stub!"); }

/**
 * Decodes the provided hexadecimal sequence. Odd-length inputs are not
 * allowed.
 *
 * @param  encoded string of hexadecimal characters to decode. Letters
 *         can be either uppercase or lowercase.
 * @return the decoded data
 * @throws java.lang.IllegalArgumentException if the input is malformed
 *
 * @hide
 */

public static byte[] decode(java.lang.String encoded) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }

/**
 * Decodes the provided hexadecimal sequence.
 *
 * @param  encoded string of hexadecimal characters to decode. Letters
 *         can be either uppercase or lowercase.
 * @param  allowSingleChar If {@code true} odd-length inputs are allowed and
 *         the first character is interpreted as the lower bits of the first
 *         result byte. If {@code false} odd-length inputs are not allowed.
 * @return the decoded data
 * @throws java.lang.IllegalArgumentException if the input is malformed
 *
 * @hide
 */

public static byte[] decode(java.lang.String encoded, boolean allowSingleChar) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }

/**
 * Decodes the provided hexadecimal sequence. Odd-length inputs are not
 * allowed.
 *
 * @param  encoded char array of hexadecimal characters to decode. Letters
 *         can be either uppercase or lowercase.
 * @return the decoded data
 * @throws java.lang.IllegalArgumentException if the input is malformed
 *
 * @hide
 */

public static byte[] decode(char[] encoded) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }

/**
 * Decodes the provided hexadecimal sequence.
 *
 * @param  encoded char array of hexadecimal characters to decode. Letters
 *         can be either uppercase or lowercase.
 * @param  allowSingleChar If {@code true} odd-length inputs are allowed and
 *         the first character is interpreted as the lower bits of the first
 *         result byte. If {@code false} odd-length inputs are not allowed.
 * @return the decoded data
 * @throws java.lang.IllegalArgumentException if the input is malformed
 *
 * @hide
 */

public static byte[] decode(char[] encoded, boolean allowSingleChar) throws java.lang.IllegalArgumentException { throw new RuntimeException("Stub!"); }
}

