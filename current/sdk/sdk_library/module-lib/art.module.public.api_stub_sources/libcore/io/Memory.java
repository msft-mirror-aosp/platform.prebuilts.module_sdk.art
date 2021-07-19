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

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class Memory {

private Memory() { throw new RuntimeException("Stub!"); }

public static int peekInt(@androidx.annotation.RecentlyNonNull byte[] src, int offset, @androidx.annotation.RecentlyNonNull java.nio.ByteOrder order) { throw new RuntimeException("Stub!"); }

public static short peekShort(@androidx.annotation.RecentlyNonNull byte[] src, int offset, @androidx.annotation.RecentlyNonNull java.nio.ByteOrder order) { throw new RuntimeException("Stub!"); }

public static void pokeInt(@androidx.annotation.RecentlyNonNull byte[] dst, int offset, int value, @androidx.annotation.RecentlyNonNull java.nio.ByteOrder order) { throw new RuntimeException("Stub!"); }

public static void pokeLong(@androidx.annotation.RecentlyNonNull byte[] dst, int offset, long value, @androidx.annotation.RecentlyNonNull java.nio.ByteOrder order) { throw new RuntimeException("Stub!"); }

public static void pokeShort(@androidx.annotation.RecentlyNonNull byte[] dst, int offset, short value, @androidx.annotation.RecentlyNonNull java.nio.ByteOrder order) { throw new RuntimeException("Stub!"); }

public static native void memmove(@androidx.annotation.RecentlyNonNull java.lang.Object dstObject, int dstOffset, @androidx.annotation.RecentlyNonNull java.lang.Object srcObject, int srcOffset, long byteCount);
}

