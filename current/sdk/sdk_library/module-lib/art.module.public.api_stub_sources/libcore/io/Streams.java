/*
 * Copyright (C) 2010 The Android Open Source Project
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


package libcore.io;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class Streams {

private Streams() { throw new RuntimeException("Stub!"); }

public static int readSingleByte(@androidx.annotation.RecentlyNonNull java.io.InputStream in) throws java.io.IOException { throw new RuntimeException("Stub!"); }

public static void writeSingleByte(@androidx.annotation.RecentlyNonNull java.io.OutputStream out, int b) throws java.io.IOException { throw new RuntimeException("Stub!"); }

public static void readFully(@androidx.annotation.RecentlyNonNull java.io.InputStream in, @androidx.annotation.RecentlyNonNull byte[] dst) throws java.io.IOException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static byte[] readFully(@androidx.annotation.RecentlyNonNull java.io.InputStream in) throws java.io.IOException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static byte[] readFullyNoClose(@androidx.annotation.RecentlyNonNull java.io.InputStream in) throws java.io.IOException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String readFully(@androidx.annotation.RecentlyNonNull java.io.Reader reader) throws java.io.IOException { throw new RuntimeException("Stub!"); }

public static long skipByReading(@androidx.annotation.RecentlyNonNull java.io.InputStream in, long byteCount) throws java.io.IOException { throw new RuntimeException("Stub!"); }

public static int copy(@androidx.annotation.RecentlyNonNull java.io.InputStream in, @androidx.annotation.RecentlyNonNull java.io.OutputStream out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}

