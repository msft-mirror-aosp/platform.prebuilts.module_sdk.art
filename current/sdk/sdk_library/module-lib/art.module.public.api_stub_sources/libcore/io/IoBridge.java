/*
 * Copyright (C) 2011 The Android Open Source Project
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
public final class IoBridge {

private IoBridge() { throw new RuntimeException("Stub!"); }

public static void closeAndSignalBlockedThreads(@androidx.annotation.RecentlyNonNull java.io.FileDescriptor fd) throws java.io.IOException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.io.FileDescriptor open(@androidx.annotation.RecentlyNonNull java.lang.String path, int flags) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }

public static int read(@androidx.annotation.RecentlyNonNull java.io.FileDescriptor fd, @androidx.annotation.RecentlyNonNull byte[] bytes, int byteOffset, int byteCount) throws java.io.IOException { throw new RuntimeException("Stub!"); }

public static void write(@androidx.annotation.RecentlyNonNull java.io.FileDescriptor fd, @androidx.annotation.RecentlyNonNull byte[] bytes, int byteOffset, int byteCount) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}

