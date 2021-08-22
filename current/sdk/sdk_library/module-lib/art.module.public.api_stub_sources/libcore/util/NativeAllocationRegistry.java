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
 * limitations under the License
 */


package libcore.util;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class NativeAllocationRegistry {

public NativeAllocationRegistry(@androidx.annotation.RecentlyNonNull java.lang.ClassLoader classLoader, long freeFunction, long size) { throw new RuntimeException("Stub!"); }

public static libcore.util.NativeAllocationRegistry createNonmalloced(@androidx.annotation.RecentlyNonNull java.lang.ClassLoader classLoader, long freeFunction, long size) { throw new RuntimeException("Stub!"); }

public static libcore.util.NativeAllocationRegistry createMalloced(@androidx.annotation.RecentlyNonNull java.lang.ClassLoader classLoader, long freeFunction, long size) { throw new RuntimeException("Stub!"); }

public static libcore.util.NativeAllocationRegistry createMalloced(@androidx.annotation.RecentlyNonNull java.lang.ClassLoader classLoader, long freeFunction) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.Runnable registerNativeAllocation(@androidx.annotation.RecentlyNonNull java.lang.Object referent, long nativePtr) { throw new RuntimeException("Stub!"); }

public static native void applyFreeFunction(long freeFunction, long nativePtr);
}

