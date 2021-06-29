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

import java.io.FileDescriptor;
import android.system.ErrnoException;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * Collection of utility methods to work with blocking and non-blocking I/O that wrap raw POSIX
 * system calls, e.g. {@link android.system.Os}. These wrappers are to signal other blocked I/O
 * threads and avoid boilerplate code of routine error checks when using raw system calls.
 *
 * <p>
 * For example, when using {@link libcore.io.Os#read(java.io.FileDescriptor,byte[],int,int) Os#read(FileDescriptor, byte[], int, int)}, return value can
 * contain:
 * <ul>
 *   <li>{@code 0} which means EOF</li>
 *   <li>{@code N > 0} which means number of bytes read</li>
 *   <li>{@code -1} which means error, and {@link android.system.ErrnoException ErrnoException} is thrown</li>
 * </ul>
 *
 * <p>
 * {@link android.system.ErrnoException ErrnoException} in its turn can be one of:
 * <ul>
 *   <li>{@link android.system.OsConstants#EAGAIN} which means the file descriptor refers to a file
 *       or a socket, which has been marked nonblocking
 *       ({@link android.system.OsConstants#O_NONBLOCK}), and the read would block</li>
 *   <li>{@link android.system.OsConstants#EBADF} which means the file descriptor is not a valid
 *       file descriptor or is not open for reading</li>
 *   <li>{@link android.system.OsConstants#EFAULT} which means given buffer is outside accessible
 *       address space</li>
 *   <li>{@link android.system.OsConstants#EINTR} which means the call was interrupted by a signal
 *       before any data was read</li>
 *   <li>{@link android.system.OsConstants#EINVAL} which means the file descriptor is attached to
 *       an object which is unsuitable for reading; or the file was opened with the
 *       {@link android.system.OsConstants#O_DIRECT} flag, and either the address specified in
 *       {@code buffer}, the value specified in {@code count}, or the file {@code offset} is not
 *       suitably aligned</li>
 *   <li>{@link android.system.OsConstants#EIO} which means I/O error happened</li>
 *   <li>{@link android.system.OsConstants#EISDIR} which means the file descriptor refers to a
 *       directory</li>
 * </ul>
 *
 * All these errors require handling, and this class contains some wrapper methods that handle most
 * common cases, making usage of system calls more user friendly.
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
 * {@link libcore.io.AsynchronousCloseMonitor AsynchronousCloseMonitor} before they entered the blocking operation. {@code fd} will be
 * invalid after this call.
 *
 * <p>This method is a no-op if passed a {@code null} or already-closed file descriptor.
 *
 * @param fd file descriptor to be closed
 * @throws java.io.IOException if underlying system call fails with {@link android.system.ErrnoException ErrnoException}
 *
 * @hide
 */

public static void closeAndSignalBlockedThreads(@androidx.annotation.RecentlyNonNull java.io.FileDescriptor fd) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Wrapper for {@link libcore.io.Os#open(java.lang.String,int,int) Os#open(String, int, int)} that behaves similar to {@link java.io.File}.
 * When a {@link java.io.File} is opened and there is an error, it throws
 * {@link java.io.FileNotFoundException} regardless of what went wrong, when POSIX
 * {@link libcore.io.Os#open(java.lang.String,int,int) Os#open(String, int, int)} throws more grained exceptions of what went wrong.
 *
 * <p>Additionally, attempt to open directory using {@link java.io.File} is also error, however
 * POSIX {@link libcore.io.Os#open(java.lang.String,int,int) Os#open(String, int, int)} for read-only directories is not error.
 *
 * @see <a href="https://man7.org/linux/man-pages/man2/open.2.html">open(2)</a>.
 *
 * @param path  path of the file to be opened
 * @param flags bitmask of the access, file creation and file status flags
 * @return {@link java.io.FileDescriptor FileDescriptor} of an opened file
 * @throws java.io.FileNotFoundException if there was error opening file under {@code path}
 *
 * @hide
 */

@androidx.annotation.RecentlyNonNull
public static java.io.FileDescriptor open(@androidx.annotation.RecentlyNonNull java.lang.String path, int flags) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }

/**
 * Wrapper for {@link libcore.io.Os#read(java.io.FileDescriptor,byte[],int,int) Os#read(FileDescriptor, byte[], int, int)} that behaves similar to
 * {@link java.io.FileInputStream#read(byte[], int, int)} and
 * {@link java.io.FileReader#read(char[], int, int)} which interpret reading at {@code EOF} as
 * error, when POSIX system call returns {@code 0} (and future reads return {@code -1}).
 *
 * <p>@see <a href="https://man7.org/linux/man-pages/man2/read.2.html">read(2)</a>.
 *
 * @param fd         file descriptor to read from
 * @param bytes      buffer to put data read from {@code fd}
 * @param byteOffset offset in {@code bytes} buffer to put read data at
 * @param byteCount  number of bytes to read from {@code fd}
 * @return           number of bytes read, if read operation was successful
 * @throws java.io.IOException if underlying system call returned error
 *
 * @hide
 */

public static int read(@androidx.annotation.RecentlyNonNull java.io.FileDescriptor fd, @androidx.annotation.RecentlyNonNull byte[] bytes, int byteOffset, int byteCount) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Wrapper for {@link libcore.io.Os#write(java.io.FileDescriptor,byte[],int,int) Os#write(FileDescriptor, byte[], int, int)} that behaves similar to
 * {@link java.io.FileOutputStream#write(byte[], int, int)} and
 * {@link java.io.FileWriter#write(char[], int, int)} which always either write all requested
 * bytes, or fail with error; as opposed to POSIX write, when the number of bytes written may
 * be less than {@code bytes}. This may happen, for example, if there is insufficient space on
 * the underlying  physical medium, or the {@code RLIMIT_FSIZE} resource limit is encountered,
 * or the call was interrupted by a signal handler after having written less than {@code bytes}
 * bytes.
 *
 * <p>@see <a href="https://man7.org/linux/man-pages/man2/write.2.html">write(2)</a>.
 *
 * @param fd         file descriptor to write to
 * @param bytes      buffer containing the data to be written
 * @param byteOffset offset in {@code bytes} buffer to read written data from
 * @param byteCount  number of bytes to write to {@code fd}
 * @throws java.io.IOException if underlying system call returned error
 *
 * @hide
 */

public static void write(@androidx.annotation.RecentlyNonNull java.io.FileDescriptor fd, @androidx.annotation.RecentlyNonNull byte[] bytes, int byteOffset, int byteCount) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}

