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
public final class IoUtils {

private IoUtils() { throw new RuntimeException("Stub!"); }

public static int acquireRawFd(@androidx.annotation.RecentlyNonNull java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }

public static void setFdOwner(@androidx.annotation.RecentlyNonNull java.io.FileDescriptor fd, @androidx.annotation.RecentlyNonNull java.lang.Object owner) { throw new RuntimeException("Stub!"); }

public static void close(@androidx.annotation.RecentlyNullable java.io.FileDescriptor fd) throws java.io.IOException { throw new RuntimeException("Stub!"); }

public static void closeQuietly(@androidx.annotation.RecentlyNullable java.lang.AutoCloseable closeable) { throw new RuntimeException("Stub!"); }

public static void closeQuietly(@androidx.annotation.RecentlyNullable java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }

public static void closeQuietly(@androidx.annotation.RecentlyNullable java.net.Socket socket) { throw new RuntimeException("Stub!"); }

public static void setBlocking(@androidx.annotation.RecentlyNonNull java.io.FileDescriptor fd, boolean blocking) throws java.io.IOException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static byte[] readFileAsByteArray(@androidx.annotation.RecentlyNonNull java.lang.String absolutePath) throws java.io.IOException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String readFileAsString(@androidx.annotation.RecentlyNonNull java.lang.String absolutePath) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}

