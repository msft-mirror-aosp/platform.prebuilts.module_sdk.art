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

import java.io.FileDescriptor;
import java.io.IOException;
import java.net.Socket;

/** @hide */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class IoUtils {

private IoUtils() { throw new RuntimeException("Stub!"); }

/**
 * Acquires ownership of an integer file descriptor from a {@link java.io.FileDescriptor FileDescriptor}.
 *
 * This method invalidates the {@link java.io.FileDescriptor FileDescriptor} passed in.
 *
 * The important part of this function is that you are taking ownership of a resource that you
 * must either clean up yourself, or hand off to some other object that does that for you.
 *
 * See bionic/include/android/fdsan.h for more details.
 *
 * @param fd {@link java.io.FileDescriptor FileDescriptor} to take ownership from, must be non-{@code null}.
 * @return raw file descriptor
 * @throws java.lang.NullPointerException if fd is null
 */

public static int acquireRawFd(@androidx.annotation.RecentlyNonNull java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }

/**
 * Assigns ownership of an unowned {@link java.io.FileDescriptor FileDescriptor}.
 *
 * Associates the supplied {@link java.io.FileDescriptor FileDescriptor} and the underlying Unix file descriptor with an owner
 * ID derived from the supplied {@code owner} object. If the {@link java.io.FileDescriptor FileDescriptor} already has an
 * associated owner an {@link java.lang.IllegalStateException IllegalStateException} will be thrown. If the underlying Unix
 * file descriptor already has an associated owner, the process will abort.
 *
 * See bionic/include/android/fdsan.h for more details.
 *
 * @param fd    {@link java.io.FileDescriptor FileDescriptor} to take ownership from, must be non-{@code null}.
 * @param owner owner object
 * @throws java.lang.NullPointerException if {@code fd} or {@code owner} are {@code null}
 * @throws java.lang.IllegalStateException if {@code fd} is already owned
 */

public static void setFdOwner(@androidx.annotation.RecentlyNonNull java.io.FileDescriptor fd, @androidx.annotation.RecentlyNonNull java.lang.Object owner) { throw new RuntimeException("Stub!"); }

/**
 * Closes a file descriptor, so that it no longer refers to any file and may
 * be reused. Also resets the internal int to -1.
 *
 * @param fd is {@link java.io.FileDescriptor FileDescriptor} instance, invalid value is ignored.
 * @throws java.io.IOException if an I/O error occurred.
 */

public static void close(@androidx.annotation.RecentlyNullable java.io.FileDescriptor fd) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Closes {@link AutoClosable} instance, ignoring any checked exceptions.
 *
 * @param close is AutoClosable instance, null value is ignored.
 */

public static void closeQuietly(@androidx.annotation.RecentlyNullable java.lang.AutoCloseable closeable) { throw new RuntimeException("Stub!"); }

/**
 * Calls {@link #close(java.io.FileDescriptor)}, ignoring any exceptions.
 *
 * @param fd is {@link java.io.FileDescriptor FileDescriptor} instance, invalid value is ignored.
 */

public static void closeQuietly(@androidx.annotation.RecentlyNullable java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }

/**
 * Closes socket, ignoring any exceptions.
 *
 * @param socket is {@link java.net.Socket Socket} instance, {@code null} value is ignored.
 */

public static void closeQuietly(@androidx.annotation.RecentlyNullable java.net.Socket socket) { throw new RuntimeException("Stub!"); }

/**
 * Sets file descriptor to be blocking or non-blocking.
 *
 * @param fd is {@link java.io.FileDescriptor FileDescriptor} instance
 * @param blocking is a boolean that defines whether fd should be blocking or non-blocking
 * @throws java.io.IOException if system API call fails
 */

public static void setBlocking(@androidx.annotation.RecentlyNonNull java.io.FileDescriptor fd, boolean blocking) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Returns the contents of {@code absolutePath} as a byte array.
 *
 * @param absolutePath path to a file to read
 * @return contents of the file at {@code absolutePath} as byte array
 * @throws java.io.IOException if there was I/O error
 */

@androidx.annotation.RecentlyNonNull
public static byte[] readFileAsByteArray(@androidx.annotation.RecentlyNonNull java.lang.String absolutePath) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Returns the contents of {@code absolutePath} as a {@link java.lang.String String}. The contents are assumed to be UTF-8.
 *
 * @param absolutePath path to a file to read
 * @return contents of the file at {@code absolutePath} as {@link java.lang.String String}
 * @throws java.io.IOException if there was I/O error
 */

@androidx.annotation.RecentlyNonNull
public static java.lang.String readFileAsString(@androidx.annotation.RecentlyNonNull java.lang.String absolutePath) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Do not use. Use createTemporaryDirectory instead.
 *
 * Used by frameworks/base unit tests to clean up a temporary directory.
 * Deliberately ignores errors, on the assumption that test cleanup is only
 * supposed to be best-effort.
 *
 * @deprecated Use {@link TestIoUtils#createTemporaryDirectory} instead.
 */

@Deprecated
public static void deleteContents(java.io.File dir) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}

