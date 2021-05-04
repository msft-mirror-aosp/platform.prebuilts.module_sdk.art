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


package android.system;


/**
 * Corresponds to C's {@code struct linger} from
 * <a href="http://pubs.opengroup.org/onlinepubs/9699919799/basedefs/sys_socket.h.html">&lt;sys/socket.h&gt;</a>
 *
 * When enabled, a {@link Os.close(java.io.FileDescriptor) or
 * {@link Os.shutdown(java.io.FileDescriptor, int)} will
 * not return until all queued messages for the socket have been successfully sent or the
 * linger timeout has been reached. Otherwise, the call returns immediately and the closing is
 * done in the background.
 *
 * See <a href="https://man7.org/linux/man-pages/man7/socket.7.html">socket(7)</a>
 * for linger struct description.
 *
 * @see {@link Os.getsockoptLinger(java.io.FileDescriptor, int, int)}.
 * @see {@link OsConstants.SO_LINGER}.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class StructLinger {

/**
 * Constructs linger structure.
 *
 * @param l_onoff  whether or not linger is enabled, non-zero is on
 * @param l_linger linger time, in seconds
 */

public StructLinger(int l_onoff, int l_linger) { throw new RuntimeException("Stub!"); }

/**
 * Returns whether linger is on or not.
 *
 * @return {@code true} if linger is enabled, and {@code false} otherwise
 */

public boolean isOn() { throw new RuntimeException("Stub!"); }

public java.lang.String toString() { throw new RuntimeException("Stub!"); }

/** Linger time in seconds. */

public final int l_linger;
{ l_linger = 0; }
}

