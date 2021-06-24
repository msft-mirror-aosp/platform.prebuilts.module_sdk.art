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


/**
 * Linux-like operating system. The user of this interface has access to various methods
 * that expose basic operating system functionality, like file and file descriptors operations
 * (open, close, read, write), socket operations (connect, bind, send*, recv*), process
 * operations (exec*, getpid), filesystem operations (mkdir, unlink, chmod, chown) and others.
 *
 * @see Linux
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface Os {

/**
 * Atomically sets the system's default {@link libcore.io.Os Os} implementation to be
 * {@code update} if the current value {@code == expect}.
 *
 * @param expect the expected value.
 * @param update the new value to set; must not be null.
 * @return whether the update was successful.
 *
 * @hide
 */

public static boolean compareAndSetDefault(libcore.io.Os expect, libcore.io.Os update) { throw new RuntimeException("Stub!"); }

/**
 * @return the system's default {@link libcore.io.Os Os} implementation currently in use.
 *
 * @hide
 */

public static libcore.io.Os getDefault() { throw new RuntimeException("Stub!"); }
}

