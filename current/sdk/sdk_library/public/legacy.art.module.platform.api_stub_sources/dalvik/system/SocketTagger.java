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


package dalvik.system;

import java.net.SocketException;

/**
 * Callbacks for socket assignment and reassignment.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public abstract class SocketTagger {

public SocketTagger() { throw new RuntimeException("Stub!"); }

/**
 * Notified when {@code socketDescriptor} is assigned to the current
 * thread. The socket is either newly connected or reused from a connection
 * pool. Implementations of this method should be thread-safe.
 *
 * @param socketDescriptor to be assigned to the current thread
 * @throws java.net.SocketException when {@link java.net.SocketException SocketException} occurs
 */

public abstract void tag(java.io.FileDescriptor socketDescriptor) throws java.net.SocketException;

/**
 * Notified when {@code socketDescriptor} is released from the current
 * thread to a connection pool. Implementations of this method should be
 * thread-safe.
 *
 * <p><strong>Note:</strong> this method will not be invoked when the socket
 * is closed.
 *
 * @param socketDescriptor to be released from the current thread to a connection pool
 * @throws java.net.SocketException when {@link java.net.SocketException SocketException} occurs
 */

public abstract void untag(java.io.FileDescriptor socketDescriptor) throws java.net.SocketException;

/**
 * Notified when {@code socket} is assigned to the current
 * thread. The socket is either newly connected or reused from a connection
 * pool. Implementations of this method should be thread-safe.
 *
 * @param socket to be assigned to the current thread
 * @throws java.net.SocketException when {@link java.net.SocketException SocketException} occurs
 */

public final void tag(java.net.Socket socket) throws java.net.SocketException { throw new RuntimeException("Stub!"); }

/**
 * Notified when {@code socket} is released from the current
 * thread to a connection pool. Implementations of this method should be
 * thread-safe.
 *
 * <p><strong>Note:</strong> this method will not be invoked when the socket
 * is closed.
 *
 * @param socket           to be released from the current thread
 *                         to a connection pool
 * @throws java.net.SocketException when {@link java.net.SocketException SocketException} occurs
 */

public final void untag(java.net.Socket socket) throws java.net.SocketException { throw new RuntimeException("Stub!"); }

/**
 * Notified when {@code socket} is assigned to the current thread.
 * The socket is either newly connected or reused from a connection
 * pool. Implementations of this method should be thread-safe.
 *
 * @param socket           to be assigned to the current thread
 * @throws java.net.SocketException when {@link java.net.SocketException SocketException} occurs
 */

public final void tag(java.net.DatagramSocket socket) throws java.net.SocketException { throw new RuntimeException("Stub!"); }

/**
 * Notified when {@code socket} is released from the current
 * thread to a connection pool. Implementations of this method should be
 * thread-safe.
 *
 * <p><strong>Note:</strong> this method will not be invoked when the socket
 * is closed.
 *
 * @param socket           to be released from the current thread
 *                         to a connection pool
 * @throws java.net.SocketException when {@link java.net.SocketException SocketException} occurs
 */

public final void untag(java.net.DatagramSocket socket) throws java.net.SocketException { throw new RuntimeException("Stub!"); }

/**
 * Sets this process' socket tagger to {@code tagger}.
 *
 * @param tagger socket tagger to be assigned to this process
 */

public static synchronized void set(dalvik.system.SocketTagger tagger) { throw new RuntimeException("Stub!"); }

/**
 * Returns this process socket tagger.
 *
 * @return {@link dalvik.system.SocketTagger SocketTagger} assigned to this process
 */

public static synchronized dalvik.system.SocketTagger get() { throw new RuntimeException("Stub!"); }
}

