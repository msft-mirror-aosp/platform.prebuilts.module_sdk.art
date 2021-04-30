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

import android.system.ErrnoException;
import java.io.FileDescriptor;
import android.system.StructStat;

/**
 * Subclass this if you want to override some {@link libcore.io.Os Os} methods but otherwise delegate.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class ForwardingOs implements libcore.io.Os {

/**
 * Constructs new {@link libcore.io.ForwardingOs ForwardingOs}.
 *
 * @param os {@link libcore.io.Os Os} delegate for not overridden methods
 */

protected ForwardingOs(@androidx.annotation.RecentlyNonNull libcore.io.Os os) { throw new RuntimeException("Stub!"); }

/**
 * Checks whether the calling process can access the file
 * {@code path}. If {@code path} is a symbolic link, it is dereferenced.
 *
 * The mode specifies the accessibility check(s) to be performed,
 * and is either the value {@link android.system.OsConstants#F_OK},
 * or a mask consisting of the bitwise OR of one or more of
 * {@link android.system.OsConstants#R_OK}, {@link android.system.OsConstants#W_OK},
 * and {@link android.system.OsConstants#X_OK}.
 *
 * {@link android.system.OsConstants#F_OK} tests for the
 * existence of the file. {@link android.system.OsConstants#R_OK},
 * {@link android.system.OsConstants#W_OK}, and {@link android.system.OsConstants#X_OK}
 * test whether the file exists and grants read, write, and execute permissions, respectively.
 *
 * @see <a href="https://man7.org/linux/man-pages/man2/access.2.html">access(2)</a>.
 *
 * @param path path of the file to check access for
 * @param mode accessibility checks mask
 * @return {@code true} if file is accessible (all requested permissions granted,
 *         or mode is {@link android.system.OsConstants#F_OK} and the file exists));
 *         and throws otherwise
 * @throws android.system.ErrnoException if at least one bit in mode asked for a permission that is denied,
 *                        or mode is {@link android.system.OsConstants#F_OK} and the file
 *                        does not exist, or some other error occurred. See the full list
 *                        of errors in the "See Also" list.
 */

public boolean access(@androidx.annotation.RecentlyNullable java.lang.String path, int mode) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * Opens the file specified by {@code path}.
 *
 * If the specified file does not exist, it may optionally (if
 * {@link android.system.OsConstants#O_CREAT} is specified in flags)
 * be created by {@link #open(java.lang.String,int,int)}.
 *
 * The argument flags must include one of the following access
 * modes: {@link android.system.OsConstants#O_RDONLY},
 * {@link android.system.OsConstants#O_WRONLY}, or
 * {@link android.system.OsConstants#O_RDWR}. These request opening the
 * file read-only, write-only, or read/write, respectively.
 *
 * In addition, zero or more file creation flags and file status
 * flags can be bitwise-or'd in flags. The file creation flags are
 * {@link android.system.OsConstants#O_CLOEXEC}, {@link android.system.OsConstants#O_CREAT},
 * {@link android.system.OsConstants#O_DIRECTORY}, {@link android.system.OsConstants#O_EXCL},
 * {@link android.system.OsConstants#O_NOCTTY}, {@link android.system.OsConstants#O_NOFOLLOW},
 * {@link android.system.OsConstants#O_TMPFILE}, and {@link android.system.OsConstants#O_TRUNC}.
 *
 * @see <a href="https://man7.org/linux/man-pages/man2/open.2.html">open(2)</a>.
 *
 * @param path  path of the file to be opened
 * @param flags bitmask of the access, file creation and file status flags
 * @param mode  specifies the file mode bits to be applied when a new file is
 *              created. If neither {@link android.system.OsConstants#O_CREAT}
 *              nor {@link android.system.OsConstants#O_TMPFILE} is specified in
 *              flags, then mode is ignored (and can thus be specified as 0, or simply omitted).
 * @return {@link java.io.FileDescriptor FileDescriptor} of an opened file
 * @throws android.system.ErrnoException if requested access to the file is not allowed, or search
 *                        permission is denied for one of the directories in the
 *                        path prefix of {@code path}, or the file did not exist yet and
 *                        write access to the parent directory is not allowed, or other error.
 *                        See the full list of errors in the "See Also" list.
 */

public java.io.FileDescriptor open(@androidx.annotation.RecentlyNullable java.lang.String path, int flags, int mode) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * Deletes a name from the filesystem.
 *
 * If the removed name was the last link to a file and no processes
 * have the file open, the file is deleted and the space it was
 * using is made available for reuse.
 *
 * If the name was the last link to a file, but any processes still
 * have the file open, the file will remain in existence until the
 * last file descriptor referring to it is closed.
 *
 * If the name referred to a symbolic link, the link is removed.
 *
 * If the name referred to a socket, FIFO, or device, the name is
 * removed, but processes which have the object open may continue to
 * use it.
 *
 * @see <a href="https://man7.org/linux/man-pages/man3/remove.3.html">remove(3)</a>.
 *
 * @param path file to delete
 * @throws android.system.ErrnoException if access to {@code path} is not allowed, an I/O error occurred.
 *                        See the full list of errors in the "See Also" list.
 */

public void remove(@androidx.annotation.RecentlyNullable java.lang.String path) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * Renames a file, moving it between directories if required.
 *
 * @see <a href="https://man7.org/linux/man-pages/man2/rename.2.html">rename(2)</a>.
 *
 * @param oldPath file to be moved to a new location {@code newPath}
 * @param newPath destination to move file {@code oldPath}
 * @throws android.system.ErrnoException if write permission is denied for the directory containing
 *                        {@code oldPath} or {@code newPath}, or, search permission is denied for
 *                        one of the directories in the path prefix of {@code oldPath} or
 *                        {@code newPath}, or {@code oldPath} is a directory and does not allow
 *                        write permission. See the full list of errors in the "See Also" list.
 */

public void rename(@androidx.annotation.RecentlyNullable java.lang.String oldPath, @androidx.annotation.RecentlyNullable java.lang.String newPath) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * Returns information about a file.
 *
 * @see <a href="https://man7.org/linux/man-pages/man2/lstat.2.html">stat(2)</a>.
 *
 * @param path path to file to get info about
 * @return {@link android.system.StructStat StructStat} containing information about the file
 * @throws android.system.ErrnoException See the full list of errors in the "See Also" list.
 */

@androidx.annotation.RecentlyNullable
public android.system.StructStat stat(@androidx.annotation.RecentlyNullable java.lang.String path) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

/**
 * Deletes a name from the filesystem.
 *
 * If the removed name was the last link to a file and no processes
 * have the file open, the file is deleted and the space it was
 * using is made available for reuse.
 *
 * If the name was the last link to a file, but any processes still
 * have the file open, the file will remain in existence until the
 * last file descriptor referring to it is closed.
 *
 * If the name referred to a symbolic link, the link is removed.
 *
 * If the name referred to a socket, FIFO, or device, the name is
 * removed, but processes which have the object open may continue to
 * use it.
 *
 * @see <a href="https://man7.org/linux/man-pages/man2/unlink.2.html">unlink(2)</a>.
 *
 * @param pathname file to unlink
 * @throws android.system.ErrnoException if access to {@code pathname} is not allowed, an I/O error occurred.
 *                        See the full list of errors in the "See Also" list.
 */

public void unlink(@androidx.annotation.RecentlyNullable java.lang.String pathname) throws android.system.ErrnoException { throw new RuntimeException("Stub!"); }

public java.lang.String toString() { throw new RuntimeException("Stub!"); }
}

