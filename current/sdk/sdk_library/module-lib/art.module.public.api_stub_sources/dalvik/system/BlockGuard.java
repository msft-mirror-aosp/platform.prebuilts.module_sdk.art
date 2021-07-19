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

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class BlockGuard {

private BlockGuard() { throw new RuntimeException("Stub!"); }

@android.annotation.NonNull
public static dalvik.system.BlockGuard.Policy getThreadPolicy() { throw new RuntimeException("Stub!"); }

public static void setThreadPolicy(@android.annotation.NonNull dalvik.system.BlockGuard.Policy policy) { throw new RuntimeException("Stub!"); }

@android.annotation.NonNull
public static dalvik.system.BlockGuard.VmPolicy getVmPolicy() { throw new RuntimeException("Stub!"); }

public static void setVmPolicy(@android.annotation.NonNull dalvik.system.BlockGuard.VmPolicy policy) { throw new RuntimeException("Stub!"); }

public static final dalvik.system.BlockGuard.Policy LAX_POLICY;
static { LAX_POLICY = null; }

public static final dalvik.system.BlockGuard.VmPolicy LAX_VM_POLICY;
static { LAX_VM_POLICY = null; }
@SuppressWarnings({"unchecked", "deprecation", "all"})
public static interface Policy {

public void onWriteToDisk();

public void onReadFromDisk();

public void onUnbufferedIO();

public int getPolicyMask();
}

@SuppressWarnings({"unchecked", "deprecation", "all"})
public static interface VmPolicy {

public void onPathAccess(@android.annotation.NonNull java.lang.String path);
}

}

