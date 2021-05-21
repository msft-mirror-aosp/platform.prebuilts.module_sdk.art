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

import java.io.FileDescriptor;

/**
 * Access to low-level system functionality. Most of these are system calls. Most users will want
 * to use higher-level APIs where available, but this class provides access to the underlying
 * primitives used to implement the higher-level APIs.
 *
 * <p>The corresponding constants can be found in {@link android.system.OsConstants OsConstants}.
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class Os {

private Os() { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/accept.2.html">accept(2)</a>.
 */

public static java.io.FileDescriptor accept(java.io.FileDescriptor fd, java.net.InetSocketAddress peerAddress) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/access.2.html">access(2)</a>.
 */

public static boolean access(java.lang.String path, int mode) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/bind.2.html">bind(2)</a>.
 */

public static void bind(java.io.FileDescriptor fd, java.net.InetAddress address, int port) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/bind.2.html">bind(2)</a>.
 */

public static void bind(@android.annotation.NonNull java.io.FileDescriptor fd, @android.annotation.NonNull java.net.SocketAddress address) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/capget.2.html">capget(2)</a>.
 *
 * @param hdr capabilities header, containing version and pid
 * @return list of capabilities data structures, each containing effective, permitted,
 *         and inheritable fields are bit masks of the capabilities
 * @throws android.system.ErrnoException if {@code hdr} structure contains invalid data
 *
 * @hide
 */

@android.annotation.Nullable
public static android.system.StructUserCapData[] capget(@android.annotation.NonNull android.system.StructUserCapHeader hdr) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/capset.2.html">capset(2)</a>.
 *
 * @param hdr capabilities header, containing version and pid
 * @param data capabilities data list, containing effective, permitted,
 *             and inheritable fields. Must be the same length as returned value
 * @throws android.system.ErrnoException if {@code hdr} structure contains invalid data; or
 *                        an attempt was made to add a capability to the permitted
 *                        set, or to set a capability in the effective set that is
 *                        not in the permitted set; or
 *                        the caller attempted to use
 *                        {@link capset( StructUserCapHeader , StructUserCapData[])}
 *                        to modify the capabilities of a thread other than itself,
 *                        but lacked sufficient privilege;
 *                        or there is no such thread.
 *
 * @hide
 */

public static void capset(@android.annotation.NonNull android.system.StructUserCapHeader hdr, @android.annotation.NonNull android.system.StructUserCapData[] data) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/chmod.2.html">chmod(2)</a>.
 */

public static void chmod(java.lang.String path, int mode) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/chown.2.html">chown(2)</a>.
 */

public static void chown(java.lang.String path, int uid, int gid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/close.2.html">close(2)</a>.
 */

public static void close(java.io.FileDescriptor fd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/connect.2.html">connect(2)</a>.
 */

public static void connect(java.io.FileDescriptor fd, java.net.InetAddress address, int port) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/connect.2.html">connect(2)</a>.
 */

public static void connect(@android.annotation.NonNull java.io.FileDescriptor fd, @android.annotation.NonNull java.net.SocketAddress address) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/dup.2.html">dup(2)</a>.
 */

public static java.io.FileDescriptor dup(java.io.FileDescriptor oldFd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/dup2.2.html">dup2(2)</a>.
 */

public static java.io.FileDescriptor dup2(java.io.FileDescriptor oldFd, int newFd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man3/environ.3.html">environ(3)</a>.
 */

public static java.lang.String[] environ() { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/execv.2.html">execv(2)</a>.
 */

public static void execv(java.lang.String filename, java.lang.String[] argv) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/execve.2.html">execve(2)</a>.
 */

public static void execve(java.lang.String filename, java.lang.String[] argv, java.lang.String[] envp) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/fchmod.2.html">fchmod(2)</a>.
 */

public static void fchmod(java.io.FileDescriptor fd, int mode) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/fchown.2.html">fchown(2)</a>.
 */

public static void fchown(java.io.FileDescriptor fd, int uid, int gid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/fcntl.2.html">fcntl(2)</a>.
 */

public static int fcntlInt(@android.annotation.NonNull java.io.FileDescriptor fd, int cmd, int arg) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/fdatasync.2.html">fdatasync(2)</a>.
 */

public static void fdatasync(java.io.FileDescriptor fd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/fstat.2.html">fstat(2)</a>.
 */

public static android.system.StructStat fstat(java.io.FileDescriptor fd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/fstatvfs.2.html">fstatvfs(2)</a>.
 */

public static android.system.StructStatVfs fstatvfs(java.io.FileDescriptor fd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/fsync.2.html">fsync(2)</a>.
 */

public static void fsync(java.io.FileDescriptor fd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/ftruncate.2.html">ftruncate(2)</a>.
 */

public static void ftruncate(java.io.FileDescriptor fd, long length) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man3/gai_strerror.3.html">gai_strerror(3)</a>.
 */

public static java.lang.String gai_strerror(int error) { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/getegid.2.html">getegid(2)</a>.
 */

public static int getegid() { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/geteuid.2.html">geteuid(2)</a>.
 */

public static int geteuid() { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/getgid.2.html">getgid(2)</a>.
 */

public static int getgid() { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man3/getenv.3.html">getenv(3)</a>.
 */

public static java.lang.String getenv(java.lang.String name) { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/getpeername.2.html">getpeername(2)</a>.
 */

public static java.net.SocketAddress getpeername(java.io.FileDescriptor fd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * Gets process's pgid (process group ID).
 *
 * See <a href="http://man7.org/linux/man-pages/man2/getpgid.2.html">getpgid(2)</a>.
 *
 * @param pid process id to get the pgid of
 * @return process's pgid
 * @throws android.system.ErrnoException if {@code pid} does not match any process
 *
 * @hide
 */

public static int getpgid(int pid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/getpid.2.html">getpid(2)</a>.
 */

public static int getpid() { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/getppid.2.html">getppid(2)</a>.
 */

public static int getppid() { throw new RuntimeException("Stub!"); }

/**
 * Gets the resource limit.
 *
 * See <a href="https://man7.org/linux/man-pages/man3/vlimit.3.html">getrlimit(2)</a>.
 *
 * @param resource resource id
 * @return         the limit of the given resource
 * @throws android.system.ErrnoException the value specified in {@code resource} is not valid
 *
 * @hide
 */

@android.annotation.Nullable
public static android.system.StructRlimit getrlimit(int resource) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/getsockname.2.html">getsockname(2)</a>.
 */

public static java.net.SocketAddress getsockname(java.io.FileDescriptor fd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * Gets socket options for the socket referred to by the file descriptor {@code fd}.
 *
 * See <a href="https://man7.org/linux/man-pages/man2/getsockopt.2.html">getsockopt(2)</a>.
 * For the list of available options see <a href="https://man7.org/linux/man-pages/man7/socket.7.html">socket(7)</a>.
 *
 * @param fd    file descriptor of the socket to get options of
 * @param level level at which the {@code option} resides. For example,
 *              to indicate that an option is to be interpreted by the TCP protocol,
 *              level should be set to the protocol number of TCP
 * @param option name of the option to get
 * @return socket options for file descriptor {@code fd}
 * @throws android.system.ErrnoException if {@code fd} is invalid; or
 *                        {@code option} is unknown at given {@code level}
 *
 * @hide
 */

public static int getsockoptInt(@android.annotation.NonNull java.io.FileDescriptor fd, int level, int option) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * Gets {@link android.system.OsConstants#SO_LINGER OsConstants#SO_LINGER} option for the socket referred to by the file descriptor {@code fd}.
 * When enabled, a {@link close(FileDescriptor) or {@link shutdown(FileDescriptor, int)} will
 * not return until all queued messages for the socket have been successfully sent or the
 * linger timeout has been reached. Otherwise, the call returns immediately and the closing is
 * done in the background.
 *
 * See <a href="https://man7.org/linux/man-pages/man7/socket.7.html">socket(7)</a>.
 *
 * @param fd     file descriptor of the socket to get {@code OsConstants.SO_LINGER} option of
 * @param level  level at which the {@code option} resides
 * @param option name of the option to get
 * @return       {@link StructLinger} associated with given {@code fd}
 * @throws ErrnoException
 */

@android.annotation.Nullable
public static android.system.StructLinger getsockoptLinger(@android.annotation.NonNull java.io.FileDescriptor fd, int level, int option) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/setsockopt.2.html">getsockopt(2)</a>.
 *
 * <p>Only for use with {@code option} values that return a {@code struct timeval} such as
 * {@link android.system.OsConstants#SO_RCVTIMEO OsConstants#SO_RCVTIMEO} and {@link android.system.OsConstants#SO_SNDTIMEO OsConstants#SO_SNDTIMEO}. Use with other
 * options may throw an {@code IllegalArgumentException} or return junk values.
 */

@android.annotation.NonNull
public static android.system.StructTimeval getsockoptTimeval(@android.annotation.NonNull java.io.FileDescriptor fd, int level, int option) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/gettid.2.html">gettid(2)</a>.
 */

public static int gettid() { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/getuid.2.html">getuid(2)</a>.
 */

public static int getuid() { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/getxattr.2.html">getxattr(2)</a>
 */

public static byte[] getxattr(java.lang.String path, java.lang.String name) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man3/if_indextoname.3.html">if_indextoname(3)</a>.
 */

public static java.lang.String if_indextoname(int index) { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man3/if_nametoindex.3.html">if_nametoindex(3)</a>.
 */

public static int if_nametoindex(java.lang.String name) { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man3/inet_pton.3.html">inet_pton(3)</a>.
 */

public static java.net.InetAddress inet_pton(int family, java.lang.String address) { throw new RuntimeException("Stub!"); }

/**
 * See <a href="https://man7.org/linux/man-pages/man2/ioctl.2.html">ioctl(3)</a>.
 * System call manipulates the underlying device parameters of special files. In particular,
 * many operating characteristics of character special files.
 *
 * @param fd    an open file descriptor
 * @param cmd   encoded in it whether the argument is an "in" parameter or "out" parameter
 * @return      returns a nonnegative value on success
 * @throws android.system.ErrnoException A checked exception thrown when {@link android.system.Os Os} methods fail.
 *                        {@see android.system.ErrnoException}
 *
 * @hide
 */

public static int ioctlInt(@android.annotation.NonNull java.io.FileDescriptor fd, int cmd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man3/isatty.3.html">isatty(3)</a>.
 */

public static boolean isatty(java.io.FileDescriptor fd) { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/kill.2.html">kill(2)</a>.
 */

public static void kill(int pid, int signal) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/lchown.2.html">lchown(2)</a>.
 */

public static void lchown(java.lang.String path, int uid, int gid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/link.2.html">link(2)</a>.
 */

public static void link(java.lang.String oldPath, java.lang.String newPath) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/listen.2.html">listen(2)</a>.
 */

public static void listen(java.io.FileDescriptor fd, int backlog) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/listxattr.2.html">listxattr(2)</a>
 */

public static java.lang.String[] listxattr(java.lang.String path) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/lseek.2.html">lseek(2)</a>.
 */

public static long lseek(java.io.FileDescriptor fd, long offset, int whence) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/lstat.2.html">lstat(2)</a>.
 */

public static android.system.StructStat lstat(java.lang.String path) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/memfd_create.2.html">memfd_create(2)</a>.
 */

@android.annotation.NonNull
public static java.io.FileDescriptor memfd_create(@android.annotation.NonNull java.lang.String name, int flags) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/mincore.2.html">mincore(2)</a>.
 */

public static void mincore(long address, long byteCount, byte[] vector) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/mkdir.2.html">mkdir(2)</a>.
 */

public static void mkdir(java.lang.String path, int mode) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man3/mkfifo.3.html">mkfifo(3)</a>.
 */

public static void mkfifo(java.lang.String path, int mode) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/mlock.2.html">mlock(2)</a>.
 */

public static void mlock(long address, long byteCount) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/mmap.2.html">mmap(2)</a>.
 */

public static long mmap(long address, long byteCount, int prot, int flags, java.io.FileDescriptor fd, long offset) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/msync.2.html">msync(2)</a>.
 */

public static void msync(long address, long byteCount, int flags) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/munlock.2.html">munlock(2)</a>.
 */

public static void munlock(long address, long byteCount) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/munmap.2.html">munmap(2)</a>.
 */

public static void munmap(long address, long byteCount) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/open.2.html">open(2)</a>.
 */

public static java.io.FileDescriptor open(java.lang.String path, int flags, int mode) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/pipe.2.html">pipe(2)</a>.
 */

public static java.io.FileDescriptor[] pipe() throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * Creates a pipe, a unidirectional data channel that can be used for interprocess communication.
 *
 * See <a href="http://man7.org/linux/man-pages/man2/pipe.2.html">pipe(2)</a>.
 *
 * @param flags bitmask of options, e.g. {@link android.system.OsConstants#O_CLOEXEC OsConstants#O_CLOEXEC}, {@link android.system.OsConstants#O_DIRECT OsConstants#O_DIRECT}
 *              or {@link android.system.OsConstants#O_NONBLOCK OsConstants#O_NONBLOCK}.
 *              If {@code flags} is {@code 0}, then {@link pipe2(int)} is the same as {@link pipe()}.
 * @return array of two file descriptors referring to the ends of the pipe, where
 *         first file descriptor is the read end of the pipe, and second is a write end
 * @throws android.system.ErrnoException if {@code flags} contains invalid value; or
 *                        the per-process limit on the number of open file
 *                        descriptors has been reached; or
 *                        the system-wide limit on the total number of open files
 *                        has been reached; or
 *                        the user hard limit on memory that can be allocated for
 *                        pipes has been reached and the caller is not privileged
 *
 * @hide
 */

@android.annotation.Nullable
public static java.io.FileDescriptor[] pipe2(int flags) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/poll.2.html">poll(2)</a>.
 *
 * <p>Note that in Lollipop this could throw an {@code ErrnoException} with {@code EINTR}.
 * In later releases, the implementation will automatically just restart the system call with
 * an appropriately reduced timeout.
 */

public static int poll(android.system.StructPollfd[] fds, int timeoutMs) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man3/posix_fallocate.3.html">posix_fallocate(3)</a>.
 */

public static void posix_fallocate(java.io.FileDescriptor fd, long offset, long length) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/prctl.2.html">prctl(2)</a>.
 */

public static int prctl(int option, long arg2, long arg3, long arg4, long arg5) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/pread.2.html">pread(2)</a>.
 */

public static int pread(java.io.FileDescriptor fd, java.nio.ByteBuffer buffer, long offset) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/pread.2.html">pread(2)</a>.
 */

public static int pread(java.io.FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, long offset) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/pwrite.2.html">pwrite(2)</a>.
 */

public static int pwrite(java.io.FileDescriptor fd, java.nio.ByteBuffer buffer, long offset) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/pwrite.2.html">pwrite(2)</a>.
 */

public static int pwrite(java.io.FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, long offset) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/read.2.html">read(2)</a>.
 */

public static int read(java.io.FileDescriptor fd, java.nio.ByteBuffer buffer) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/read.2.html">read(2)</a>.
 */

public static int read(java.io.FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/readlink.2.html">readlink(2)</a>.
 */

public static java.lang.String readlink(java.lang.String path) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * Eexpands all symbolic links and resolves references to {@code /./},
 * {@code /../} and extra {@code /} characters string named by path
 * to produce a canonicalized absolute pathname.
 *
 * See <a href="http://man7.org/linux/man-pages/man3/realpath.3.html">realpath(3)</a>.
 *
 * @param path string to resolve
 * @return     resolved path if no error occurred. Returns {@code null} if {@code path}
 *             is {@code null}
 * @throws android.system.ErrnoException read or search permission was denied for a component of
 *                        the path prefix; or an I/O error occurred while reading
 *                        from the filesystem; or too many symbolic links were
 *                        encountered in translating the pathname; or
 *                        the named file does not exist; or a component of the path
 *                        prefix is not a directory
 *
 * @hide
 */

@android.annotation.Nullable
public static java.lang.String realpath(@android.annotation.Nullable java.lang.String path) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/readv.2.html">readv(2)</a>.
 */

public static int readv(java.io.FileDescriptor fd, java.lang.Object[] buffers, int[] offsets, int[] byteCounts) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/recvfrom.2.html">recvfrom(2)</a>.
 */

public static int recvfrom(java.io.FileDescriptor fd, java.nio.ByteBuffer buffer, int flags, java.net.InetSocketAddress srcAddress) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/recvfrom.2.html">recvfrom(2)</a>.
 */

public static int recvfrom(java.io.FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, java.net.InetSocketAddress srcAddress) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/recvmsg.2.html">recvmsg(2)</a>.
 */

public static int recvmsg(@android.annotation.NonNull java.io.FileDescriptor fd, @android.annotation.NonNull android.system.StructMsghdr msg, int flags) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man3/remove.3.html">remove(3)</a>.
 */

public static void remove(java.lang.String path) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/removexattr.2.html">removexattr(2)</a>.
 */

public static void removexattr(java.lang.String path, java.lang.String name) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/rename.2.html">rename(2)</a>.
 */

public static void rename(java.lang.String oldPath, java.lang.String newPath) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/sendfile.2.html">sendfile(2)</a>.
 */

public static long sendfile(java.io.FileDescriptor outFd, java.io.FileDescriptor inFd, android.system.Int64Ref offset, long byteCount) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/sendmsg.2.html">sendmsg(2)</a>.
 */

public static int sendmsg(@android.annotation.NonNull java.io.FileDescriptor fd, @android.annotation.NonNull android.system.StructMsghdr msg, int flags) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/sendto.2.html">sendto(2)</a>.
 */

public static int sendto(java.io.FileDescriptor fd, java.nio.ByteBuffer buffer, int flags, java.net.InetAddress inetAddress, int port) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/sendto.2.html">sendto(2)</a>.
 */

public static int sendto(java.io.FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, java.net.InetAddress inetAddress, int port) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/sendto.2.html">sendto(2)</a>.
 */

public static int sendto(@android.annotation.NonNull java.io.FileDescriptor fd, @android.annotation.NonNull byte[] bytes, int byteOffset, int byteCount, int flags, @android.annotation.Nullable java.net.SocketAddress address) throws android.system.ErrnoException, java.net.SocketException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/setegid.2.html">setegid(2)</a>.
 * @deprecated Android Applications do not have sufficient privileges to call this method.
 */

@Deprecated
public static void setegid(int egid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man3/setenv.3.html">setenv(3)</a>.
 */

public static void setenv(java.lang.String name, java.lang.String value, boolean overwrite) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/seteuid.2.html">seteuid(2)</a>.
 * @deprecated Android Applications do not have sufficient privileges to call this method.
 */

@Deprecated
public static void seteuid(int euid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/setgid.2.html">setgid(2)</a>.
 * @deprecated Android Applications do not have sufficient privileges to call this method.
 */

@Deprecated
public static void setgid(int gid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * Sets process's pgid (process group ID).
 *
 * See <a href="http://man7.org/linux/man-pages/man2/setpgid.2.html">setpgid(2)</a>.
 *
 * @param pid  process id to set the pgid of
 * @param pgid new pgid for process {@code pid}
 * @throws android.system.ErrnoException an attempt was made to change the process group ID of one
 *                        of the children of the calling process and the child had
 *                        already performed an {@link execve(String, String[], String[])}; or
 *                        {@code pgid} is less than {@code 0}; or
 *                        an attempt was made to move a process into a process group
 *                        in a different session, or to change the process group ID
 *                        of one of the children of the calling process and the
 *                        child was in a different session, or to change the process
 *                        group ID of a session leader; or
 *                        {@code pid} is not the calling process and not a child
 *                        of the calling process
 *
 * @hide
 */

public static void setpgid(int pid, int pgid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * Set real and/or effective group ID of the calling process.
 *
 * See <a href="http://man7.org/linux/man-pages/man2/setregid.2.html">setregid(2)</a>.
 *
 * @param rgid real group ID
 * @param egid effective group ID
 * @throws android.system.ErrnoException one or more of the target group IDs is not valid
 *                        in this user namespace; or the calling process is
 *                        not privileged
 *
 * @hide
 */

public static void setregid(int rgid, int egid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * Set real and/or effective user ID of the calling process.
 *
 * See <a href="http://man7.org/linux/man-pages/man2/setreuid.2.html">setreuid(2)</a>.
 *
 * @param ruid real user ID
 * @param euid effective user ID
 * @throws android.system.ErrnoException one or more of the target user IDs is not valid
 *                        in this user namespace; or the calling process is
 *                        not privileged
 *
 * @hide
 */

public static void setreuid(int ruid, int euid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/setsid.2.html">setsid(2)</a>.
 */

public static int setsid() throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * Sets a supplied socket {@code option} to {@code value}.
 *
 * See <a href="https://man7.org/linux/man-pages/man2/getsockopt.2.html">getsockopt(2)</a>.
 * For the list of available options see <a href="https://man7.org/linux/man-pages/man7/socket.7.html">socket(7)</a>.
 * Corresponding socket options constants reside in {@link OsCosntants}, e.g. {@link android.system.OsConstants#SO_REUSEADDR OsConstants#SO_REUSEADDR}.
 *
 * @param fd    file descriptor of the socket to set options of
 * @param level level at which the {@code option} resides. For example,
 *              to indicate that an option is to be interpreted by the TCP protocol,
 *              level should be set to the protocol number of TCP
 * @param option name of the option to set
 * @param value  interface name
 * @return socket options for file descriptor {@code fd}
 * @throws android.system.ErrnoException if {@code fd} is invalid; or
 *                        {@code option} is unknown at given {@code level}
 *
 * @hide
 */

public static void setsockoptIfreq(@android.annotation.NonNull java.io.FileDescriptor fd, int level, int option, @android.annotation.Nullable java.lang.String value) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/setsockopt.2.html">setsockopt(2)</a>.
 */

public static void setsockoptInt(java.io.FileDescriptor fd, int level, int option, int value) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * Sets {@link android.system.OsConstants#SO_LINGER OsConstants#SO_LINGER} option for the socket referred to by the file descriptor
 * {@code fd}.
 *
 * @param fd     file descriptor
 * @param level  level at which the {@code option} resides
 * @param option name of the option to set
 * @param value  {@link android.system.StructLinger StructLinger} to set for {@code fd}
 * @throws android.system.ErrnoException if {@code fd} is invalid; or
 *                        {@code option} is unknown at given {@code level}
 */

public static void setsockoptLinger(@android.annotation.NonNull java.io.FileDescriptor fd, int level, int option, @android.annotation.NonNull android.system.StructLinger value) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/setsockopt.2.html">setsockopt(2)</a>.
 *
 * <p>Only for use with {@code option} values that take a {@code struct timeval} such as
 * {@link android.system.OsConstants#SO_RCVTIMEO OsConstants#SO_RCVTIMEO} and {@link android.system.OsConstants#SO_SNDTIMEO OsConstants#SO_SNDTIMEO}. Use with other
 * options is likely to cause incorrect behavior.
 */

public static void setsockoptTimeval(@android.annotation.NonNull java.io.FileDescriptor fd, int level, int option, @android.annotation.NonNull android.system.StructTimeval value) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/setuid.2.html">setuid(2)</a>.
 * @deprecated Android Applications do not have sufficient privileges to call this method.
 */

@Deprecated
public static void setuid(int uid) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/setxattr.2.html">setxattr(2)</a>
 */

public static void setxattr(java.lang.String path, java.lang.String name, byte[] value, int flags) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/shutdown.2.html">shutdown(2)</a>.
 */

public static void shutdown(java.io.FileDescriptor fd, int how) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/socket.2.html">socket(2)</a>.
 */

public static java.io.FileDescriptor socket(int domain, int type, int protocol) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/socketpair.2.html">socketpair(2)</a>.
 */

public static void socketpair(int domain, int type, int protocol, java.io.FileDescriptor fd1, java.io.FileDescriptor fd2) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * Moves data between two file descriptors without copying
 * between kernel address space and user address space. It
 * transfers up to {@code len} bytes of data from the file descriptor {@code fdIn}
 * to the file descriptor {@code fdOut}, where one of the file descriptors
 * must refer to a pipe.
 *
 * The following semantics apply for {@code fdIn} and {@code offIn}:
 * <ul>
 *   <li>If {@code fdIn} refers to a pipe, then {@code offIn} must be {@code null}.</li>
 *   <li>If {@code fdIn} does not refer to a pipe and {@code offIn} is {@code null}, then
 *       bytes are read from {@code fdIn} starting from the file offset, and
 *       the file offset is adjusted appropriately.</li>
 *   <li>If {@code fdIn} does not refer to a pipe and {@code offIn} is not {@code null}, then
 *       {@code offIn} must point to a buffer which specifies the starting
 *       offset from which bytes will be read from {@code fdIn}; in this case,
 *       the file offset of {@code fdIn} is not changed.</li>
 * </ul>
 *
 * Analogous statements apply for {@code fdOut} and {@code offOut}.
 *
 * The flags argument is a bit mask that is composed by ORing
 * together zero or more of the following values:
 * <ul>
 *   <li>{@link android.system.OsConstants#SPLICE_F_MOVE OsConstants#SPLICE_F_MOVE}
 *       Attempt to move pages instead of copying. This is only a
 *       hint to the kernel: pages may still be copied if the
 *       kernel cannot move the pages from the pipe, or if the pipe
 *       buffers don't refer to full pages.</li>
 *   <li>{@link android.system.OsConstants#SPLICE_F_NONBLOCK OsConstants#SPLICE_F_NONBLOCK}
 *       Do not block on I/O. This makes the splice pipe
 *       operations nonblocking, but
 *       {@link splice(FileDescriptor, Int64Ref, FileDescriptor, Int64Ref, long, int)}
 *       may nevertheless block because the file descriptors that are spliced
 *       to/from may block (unless they have the {@link android.system.OsConstants#O_NONBLOCK OsConstants#O_NONBLOCK} flag set).</li>
 *   <li>{@link android.system.OsConstants#SPLICE_F_MORE OsConstants#SPLICE_F_MORE}
 *       More data will be coming in a subsequent splice.</li>
 *   <li>{@link android.system.OsConstants#SPLICE_F_GIFT OsConstants#SPLICE_F_GIFT} Unused</li>
 * </ul>
 *
 * See <a href="http://man7.org/linux/man-pages/man2/splice.2.html">splice(2)</a>.
 *
 * @param fdIn   file descriptor to read from
 * @param offIn  {@code null} for pipe; file offset; or pointer to a buffer that specifies starting offset
 * @param fdOut  file descriptor to write to
 * @param offOut {@code null} for pipe; file offset; or pointer to a buffer that specifies starting offset
 * @param len    number of bytes to read/write
 * @param flags  bitmask of options
 * @return       number of bytes spliced on success. A return value of {@code 0} means end of input.
 * @throws android.system.ErrnoException if target fs does not support splicing; or
 *                        target file opened in append mode; or
 *                        one or both file descriptors are invalid; or
 *                        neither of file descriptors refer to a pipe; or
 *                        {@code fdIn} and {@code fdOut} refer to a same pipe
 *
 * @hide
 */

public static long splice(@android.annotation.NonNull java.io.FileDescriptor fdIn, @android.annotation.Nullable android.system.Int64Ref offIn, @android.annotation.NonNull java.io.FileDescriptor fdOut, @android.annotation.Nullable android.system.Int64Ref offOut, long len, int flags) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/stat.2.html">stat(2)</a>.
 */

public static android.system.StructStat stat(java.lang.String path) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/statvfs.2.html">statvfs(2)</a>.
 */

public static android.system.StructStatVfs statvfs(java.lang.String path) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man3/strerror.3.html">strerror(2)</a>.
 */

public static java.lang.String strerror(int errno) { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man3/strsignal.3.html">strsignal(3)</a>.
 */

public static java.lang.String strsignal(int signal) { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/symlink.2.html">symlink(2)</a>.
 */

public static void symlink(java.lang.String oldPath, java.lang.String newPath) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man3/sysconf.3.html">sysconf(3)</a>.
 */

public static long sysconf(int name) { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man3/tcdrain.3.html">tcdrain(3)</a>.
 */

public static void tcdrain(java.io.FileDescriptor fd) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man3/tcsendbreak.3.html">tcsendbreak(3)</a>.
 */

public static void tcsendbreak(java.io.FileDescriptor fd, int duration) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/umask.2.html">umask(2)</a>.
 */

public static int umask(int mask) { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/uname.2.html">uname(2)</a>.
 */

public static android.system.StructUtsname uname() { throw new RuntimeException("Stub!"); }

/**
 * Deletes a name from the filesystem. If that name was the last link to a file
 * and no processes have the file open, the file is deleted and the space it was
 * using is made available for reuse.
 *
 * See <a href="http://man7.org/linux/man-pages/man2/unlink.2.html">unlink(2)</a>.
 *
 * @param pathname name in the filesystem to delete
 * @throws android.system.ErrnoException write access to {@code pathname} is not allowed; or
 *                        I/O error occurred; or
 *                        {@code pathname} refers to directory; or
 *                        too many symbolic links were encountered in translating {@code pathname}; or
 *                        {@code pathname} is used by the system or another process
 *
 * @hide
 */

public static void unlink(@android.annotation.Nullable java.lang.String pathname) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man3/unsetenv.3.html">unsetenv(3)</a>.
 */

public static void unsetenv(java.lang.String name) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/write.2.html">write(2)</a>.
 */

public static int write(java.io.FileDescriptor fd, java.nio.ByteBuffer buffer) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/write.2.html">write(2)</a>.
 */

public static int write(java.io.FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }

/**
 * See <a href="http://man7.org/linux/man-pages/man2/writev.2.html">writev(2)</a>.
 */

public static int writev(java.io.FileDescriptor fd, java.lang.Object[] buffers, int[] offsets, int[] byteCounts) throws android.system.ErrnoException, java.io.InterruptedIOException { throw new RuntimeException("Stub!"); }
}

