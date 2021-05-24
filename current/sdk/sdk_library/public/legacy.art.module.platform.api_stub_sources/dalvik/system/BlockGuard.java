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


package dalvik.system;


/**
 * Interface that enables {@code StrictMode} to install callbacks to implement
 * its policy detection and penalty behavior in {@code libcore} code.
 * <p>
 * The framework separately defines {@code StrictMode.ThreadPolicy} and
 * {@code StrictMode.VmPolicy}, so we mirror that separation here; the former is
 * designed for per-thread policies, and the latter for process-wide policies.
 * <p>
 * Note that this is all best-effort to catch most accidental mistakes and isn't
 * intended to be a perfect mechanism, nor provide any sort of security.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class BlockGuard {

private BlockGuard() { throw new RuntimeException("Stub!"); }

/**
 * Get the per-thread policy for the current thread.
 *
 * @return the current thread's policy. Will return the {@link #LAX_POLICY}
 *         instance if nothing else is set.
 */

@android.annotation.NonNull
public static dalvik.system.BlockGuard.Policy getThreadPolicy() { throw new RuntimeException("Stub!"); }

/**
 * Sets the per-thread policy for the current thread.
 * <p>
 * This should only be called by {@code StrictMode}, since there can only be
 * one policy active at any given time.
 *
 * @param policy policy to set. Use the public {@link #LAX_POLICY} if you
 *            want to unset the active policy.
 */

public static void setThreadPolicy(@android.annotation.NonNull dalvik.system.BlockGuard.Policy policy) { throw new RuntimeException("Stub!"); }

/**
 * Get the per-process policy for the current process.
 *
 * @return the current process's policy. Will return the
 *         {@link #LAX_VM_POLICY} instance if nothing else is set.
 */

@android.annotation.NonNull
public static dalvik.system.BlockGuard.VmPolicy getVmPolicy() { throw new RuntimeException("Stub!"); }

/**
 * Set the per-process policy for the current process.
 * <p>
 * This should only be called by {@code StrictMode}, since there can only be
 * one policy active at any given time.
 *
 * @param policy policy to set. Use the public {@link #LAX_VM_POLICY} if you
 *            want to unset the active policy.
 */

public static void setVmPolicy(@android.annotation.NonNull dalvik.system.BlockGuard.VmPolicy policy) { throw new RuntimeException("Stub!"); }

/**
 * The default, permissive per-thread policy.
 */

public static final dalvik.system.BlockGuard.Policy LAX_POLICY;
static { LAX_POLICY = null; }

/**
 * The default, permissive per-process policy.
 */

public static final dalvik.system.BlockGuard.VmPolicy LAX_VM_POLICY;
static { LAX_VM_POLICY = null; }
/**
 * Per-thread interface used to implement {@code StrictMode.ThreadPolicy}.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public static interface Policy {

/**
 * Called on disk writes.
 */

public void onWriteToDisk();

/**
 * Called on disk reads.
 */

public void onReadFromDisk();

/**
 * Called on unbuffered input/ouput operations.
 */

public void onUnbufferedIO();

/**
 * Returns the policy bitmask, for shipping over Binder calls
 * to remote threads/processes and reinstantiating the policy
 * there. The bits in the mask are from the {@code DISALLOW_*} and
 * {@code PENALTY_*} constants declared in {@code StrictMode} class.
 *
 * @return policy bitmask
 */

public int getPolicyMask();
}

/**
 * Per-process interface used to implement {@code StrictMode.VmPolicy}.
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public static interface VmPolicy {

/**
 * Called by core libraries code when the given path is accessed. This
 * allows an implementation to alert developers to unexpected path
 * access, such as trying to access encrypted files before the
 * encryption key has been installed.
 * <p>
 * This only needs to be called once when a path is first accessed by
 * the process; it doesn't need to be invoked for each subsequent
 * read/write. (In contrast, we always need to call the per-thread
 * policy for every read/write, since ownership of an open file can move
 * between threads.)
 * <p>
 * Note that this is all best-effort to catch most accidental mistakes
 * and isn't intended to be a perfect mechanism, nor provide any sort of
 * security.
 *
 * @param path The path in the local file system that is being accessed
 *            for reading or writing.
 */

public void onPathAccess(@android.annotation.NonNull java.lang.String path);
}

}

