/*
 * Copyright (C) 2015 The Android Open Source Project
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


package android.system;


/**
 * A UNIX-domain (AF_UNIX / AF_LOCAL) socket address.
 *
 * See <a href="https://man7.org/linux/man-pages/man7/unix.7.html">unix(7)</a>.
 *
 * @see android.system.OsConstants#AF_UNIX
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class UnixSocketAddress extends java.net.SocketAddress {

private UnixSocketAddress() { throw new RuntimeException("Stub!"); }

/**
 * Creates a named, filesystem {@link android.system.OsConstants#AF_UNIX OsConstants#AF_UNIX} socket address.
 *
 * See <a href="https://man7.org/linux/man-pages/man7/unix.7.html">unix(7)</a>.
 *
 * @param pathname filename for named unix socket
 * @throws java.lang.NullPointerException if {@code name} is {@code null}
 * @throws java.lang.IllegalArgumentException if {@code name} is invalid, e.g. too long
 */

public static android.system.UnixSocketAddress createFileSystem(java.lang.String pathName) { throw new RuntimeException("Stub!"); }

public boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }

public int hashCode() { throw new RuntimeException("Stub!"); }

public java.lang.String toString() { throw new RuntimeException("Stub!"); }
}

