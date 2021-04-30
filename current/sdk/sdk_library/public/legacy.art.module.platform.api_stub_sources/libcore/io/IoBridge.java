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

import java.io.FileNotFoundException;
import java.net.SocketException;
import java.net.InetSocketAddress;

/**
 * Implements java.io/java.net/java.nio semantics in terms of the underlying POSIX system calls.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class IoBridge {

private IoBridge() { throw new RuntimeException("Stub!"); }

/**
 * Closes the Unix file descriptor associated with the supplied file descriptor, resets the
 * internal int to -1, and sends a signal to any threads are currently blocking. In order for
 * the signal to be sent the blocked threads must have registered with the
 * AsynchronousCloseMonitor before they entered the blocking operation. {@code fd} will be
 * invalid after this call.
 *
 * <p>This method is a no-op if passed a {@code null} or already-closed file descriptor.
 */

public static void closeAndSignalBlockedThreads(java.io.FileDescriptor fd) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * java.io only throws FileNotFoundException when opening files, regardless of what actually
 * went wrong. Additionally, java.io is more restrictive than POSIX when it comes to opening
 * directories: POSIX says read-only is okay, but java.io doesn't even allow that.
 */

public static java.io.FileDescriptor open(java.lang.String path, int flags) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }

/**
 * java.io thinks that a read at EOF is an error and should return -1, contrary to traditional
 * Unix practice where you'd read until you got 0 bytes (and any future read would return -1).
 */

public static int read(java.io.FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * java.io always writes every byte it's asked to, or fails with an error. (That is, unlike
 * Unix it never just writes as many bytes as happens to be convenient.)
 */

public static void write(java.io.FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount) throws java.io.IOException { throw new RuntimeException("Stub!"); }

public static int sendto(java.io.FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, java.net.InetAddress inetAddress, int port) throws java.io.IOException { throw new RuntimeException("Stub!"); }

public static int recvfrom(boolean isRead, java.io.FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, java.net.DatagramPacket packet, boolean isConnected) throws java.io.IOException { throw new RuntimeException("Stub!"); }

public static java.io.FileDescriptor socket(int domain, int type, int protocol) throws java.net.SocketException { throw new RuntimeException("Stub!"); }

/**
 * @throws java.net.SocketException if fd is not currently bound to an InetSocketAddress
 */

public static java.net.InetSocketAddress getLocalInetSocketAddress(java.io.FileDescriptor fd) throws java.net.SocketException { throw new RuntimeException("Stub!"); }
}

