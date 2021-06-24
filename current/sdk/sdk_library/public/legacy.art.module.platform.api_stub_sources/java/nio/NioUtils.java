/* Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package java.nio;


/**
 * @hide internal use only
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class NioUtils {

private NioUtils() { throw new RuntimeException("Stub!"); }

/**
 * Frees {@link java.nio.DirectByteBuffer DirectByteBuffer} running associated {@link sun.misc.Cleaner Cleaner}.
 *
 * @param buffer to free with associated {@code Cleaner}
 *
 * @hide
 */

public static void freeDirectBuffer(java.nio.ByteBuffer buffer) { throw new RuntimeException("Stub!"); }

/**
 * Exposes the array backing a non-direct {@link java.nio.ByteBuffer ByteBuffer}, even if
 * the {@link java.nio.ByteBuffer ByteBuffer} is read-only.
 * Normally, attempting to access the array backing a read-only buffer throws.
 *
 * @param b  {@link java.nio.ByteBuffer ByteBuffer} to access its backing array.
 * @return   buffer's underlying array.
 *
 * @hide
 */

public static byte[] unsafeArray(java.nio.ByteBuffer b) { throw new RuntimeException("Stub!"); }

/**
 * Exposes the array offset for the array backing a non-direct {@link java.nio.ByteBuffer ByteBuffer},
 * even if the {@link java.nio.ByteBuffer ByteBuffer} is read-only.
 *
 * @param b  {@link java.nio.ByteBuffer ByteBuffer} to access its backing array offset.
 * @return   buffer's underlying array data offset.
 *
 * @hide
 */

public static int unsafeArrayOffset(java.nio.ByteBuffer b) { throw new RuntimeException("Stub!"); }
}

