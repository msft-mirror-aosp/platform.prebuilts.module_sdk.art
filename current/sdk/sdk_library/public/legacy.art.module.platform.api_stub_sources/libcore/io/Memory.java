/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */


package libcore.io;


/**
 * Unsafe access to memory.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class Memory {

private Memory() { throw new RuntimeException("Stub!"); }

/**
 * Gets int value from a byte buffer {@code src} at offset {@code offset} using
 * {@code order} byte order.
 *
 * @param src    source byte buffer
 * @param offset offset in {@code src} to get bytes from
 * @param order  byte order
 * @return int value
 */

public static int peekInt(@androidx.annotation.RecentlyNonNull byte[] src, int offset, @androidx.annotation.RecentlyNonNull java.nio.ByteOrder order) { throw new RuntimeException("Stub!"); }

/**
 * Gets short value from a byte buffer {@code src} at offset {@code offset} using
 * {@code order} byte order.
 *
 * @param src    source byte buffer
 * @param offset offset in {@code src} to get bytes from
 * @param order  byte order
 * @return short value
 */

public static short peekShort(@androidx.annotation.RecentlyNonNull byte[] src, int offset, @androidx.annotation.RecentlyNonNull java.nio.ByteOrder order) { throw new RuntimeException("Stub!"); }

/**
 * Writes given int value {@code value} to a byte buffer {@code dst} using
 * {@code order} byte order.
 *
 * @param dst    byte buffer where to write {@code value}
 * @param offset offset in {@code dst} to put value to
 * @param value  int value to write
 * @param order  byte order
 */

public static void pokeInt(@androidx.annotation.RecentlyNonNull byte[] dst, int offset, int value, @androidx.annotation.RecentlyNonNull java.nio.ByteOrder order) { throw new RuntimeException("Stub!"); }

/**
 * Writes given long value {@code value} to a byte buffer {@code dst} using
 * {@code order} byte order.
 *
 * @param dst    byte buffer where to write {@code value}
 * @param offset offset in {@code dst} to put value to
 * @param value  long value to write
 * @param order  byte order
 */

public static void pokeLong(@androidx.annotation.RecentlyNonNull byte[] dst, int offset, long value, @androidx.annotation.RecentlyNonNull java.nio.ByteOrder order) { throw new RuntimeException("Stub!"); }

/**
 * Writes given short value {@code value} to a byte buffer {@code dst} using
 * {@code order} byte order.
 *
 * @param dst    byte buffer where to write {@code value}
 * @param offset offset in {@code dst} to put value to
 * @param value  short value to write
 * @param order  byte order
 */

public static void pokeShort(@androidx.annotation.RecentlyNonNull byte[] dst, int offset, short value, @androidx.annotation.RecentlyNonNull java.nio.ByteOrder order) { throw new RuntimeException("Stub!"); }

/**
 * Copies {@code byteCount} bytes from the source {@code srcObject} to the
 * destination {@code dstObject}. The objects are either instances of
 * {@code DirectByteBuffer} or {@code byte[]}. The offsets in the {@code byte[]}
 * case must include the {@link Buffer#arrayOffset()} if the array came from a
 * {@link Buffer#array()} call.
 *
 * <p>We could make this private and provide the four type-safe variants, but then
 * {@link ByteBuffer#put(ByteBuffer)} would need to work out which to call based on
 * whether the source and destination buffers are direct or not.
 *
 * @param dstObject destination buffer
 * @param dstOffset offset in the destination buffer
 * @param srcObject source buffer
 * @param srcOffset offset in the source buffer
 * @param byteCount number of bytes to copy
 *
 * @hide make type-safe before making public?
 */

public static native void memmove(@androidx.annotation.RecentlyNonNull java.lang.Object dstObject, int dstOffset, @androidx.annotation.RecentlyNonNull java.lang.Object srcObject, int srcOffset, long byteCount);
}

