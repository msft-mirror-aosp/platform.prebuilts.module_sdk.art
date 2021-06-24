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


/**
 * A NativeAllocationRegistry is used to associate native allocations with
 * Java objects and register them with the runtime.
 * There are two primary benefits of registering native allocations associated
 * with Java objects:
 * <ol>
 *  <li>The runtime will account for the native allocations when scheduling
 *  garbage collection to run.</li>
 *  <li>The runtime will arrange for the native allocation to be automatically
 *  freed by a user-supplied function when the associated Java object becomes
 *  unreachable.</li>
 * </ol>
 * A separate NativeAllocationRegistry should be instantiated for each kind
 * of native allocation, where the kind of a native allocation consists of the
 * native function used to free the allocation and the estimated size of the
 * allocation. Once a NativeAllocationRegistry is instantiated, it can be
 * used to register any number of native allocations of that kind.
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class NativeAllocationRegistry {

/**
 * Constructs a {@link libcore.util.NativeAllocationRegistry NativeAllocationRegistry} for a particular kind of native
 * allocation.
 * <p>
 * New code should use the preceding factory methods rather than calling this
 * constructor directly.
 * <p>
 * The {@code size} should be an estimate of the total number of
 * native bytes this kind of native allocation takes up excluding bytes allocated
 * with system malloc. Different
 * {@link libcore.util.NativeAllocationRegistry NativeAllocationRegistry}s must be used to register native allocations
 * with different estimated sizes, even if they use the same
 * {@code freeFunction}. This is used to help inform the garbage
 * collector about the possible need for collection. Memory allocated with
 * native malloc is implicitly included, and ideally should not be included in this
 * argument.
 * <p>
 * @param classLoader  ClassLoader that was used to load the native
 *                     library {@code freeFunction} belongs to.
 * @param freeFunction address of a native function used to free this
 *                     kind of native allocation
 * @param size         estimated size in bytes of this kind of native
 *                     allocation, excluding memory allocated with system malloc.
 *                     A value of 0 indicates that the memory was allocated mainly
 *                     with malloc.
 *
 * @hide
 */

public NativeAllocationRegistry(@androidx.annotation.RecentlyNonNull java.lang.ClassLoader classLoader, long freeFunction, long size) { throw new RuntimeException("Stub!"); }

/**
 * Return a {@link libcore.util.NativeAllocationRegistry NativeAllocationRegistry} for native memory that is mostly
 * allocated by means other than the system memory allocator. For example,
 * the memory may be allocated directly with mmap.
 * @param classLoader  ClassLoader that was used to load the native
 *                     library defining freeFunction.
 *                     This ensures that the the native library isn't unloaded
 *                     before {@code freeFunction} is called.
 * @param freeFunction address of a native function of type
 *                     {@code void f(void* nativePtr)} used to free this
 *                     kind of native allocation
 * @param size         estimated size in bytes of the part of the described
 *                     native memory that is not allocated with system malloc.
 *                     Approximate values are acceptable.
 * @return allocated {@link libcore.util.NativeAllocationRegistry NativeAllocationRegistry}
 * @throws java.lang.IllegalArgumentException If {@code size} is negative
 *
 * @hide
 */

public static libcore.util.NativeAllocationRegistry createNonmalloced(@androidx.annotation.RecentlyNonNull java.lang.ClassLoader classLoader, long freeFunction, long size) { throw new RuntimeException("Stub!"); }

/**
 * Return a {@link libcore.util.NativeAllocationRegistry NativeAllocationRegistry} for native memory that is mostly
 * allocated by the system memory allocator.
 * For example, the memory may be allocated directly with new or malloc.
 * <p>
 * The native function should have the type:
 * <pre>
 *    void f(void* nativePtr);
 * </pre>
 * <p>
 * @param classLoader  ClassLoader that was used to load the native
 *                     library {@code freeFunction} belongs to.
 * @param freeFunction address of a native function of type
 *                     {@code void f(void* nativePtr)} used to free this
 *                     kind of native allocation
 * @param size         estimated size in bytes of the part of the described
 *                     native memory allocated with system malloc.
 *                     Approximate values are acceptable. For sizes less than
 *                     a few hundered KB, use the simplified overload below.
 * @return allocated {@link libcore.util.NativeAllocationRegistry NativeAllocationRegistry}
 * @throws java.lang.IllegalArgumentException If {@code size} is negative
 *
 * @hide
 */

public static libcore.util.NativeAllocationRegistry createMalloced(@androidx.annotation.RecentlyNonNull java.lang.ClassLoader classLoader, long freeFunction, long size) { throw new RuntimeException("Stub!"); }

/**
 * Return a {@link libcore.util.NativeAllocationRegistry NativeAllocationRegistry} for native memory that is mostly
 * allocated by the system memory allocator. This version is preferred
 * for smaller objects (typically less than a few hundred KB).
 * @param classLoader  ClassLoader that was used to load the native
 *                     library {@code freeFunction} belongs to.
 * @param freeFunction address of a native function of type
 *                     {@code void f(void* nativePtr)} used to free this
 *                     kind of native allocation
 * @return allocated {@link libcore.util.NativeAllocationRegistry NativeAllocationRegistry}
 *
 * @hide
 */

public static libcore.util.NativeAllocationRegistry createMalloced(@androidx.annotation.RecentlyNonNull java.lang.ClassLoader classLoader, long freeFunction) { throw new RuntimeException("Stub!"); }

/**
 * Registers a new native allocation and associated Java object with the
 * runtime.
 * This {@link libcore.util.NativeAllocationRegistry NativeAllocationRegistry}'s {@code freeFunction} will
 * automatically be called with {@code nativePtr} as its sole
 * argument when {@code referent} becomes unreachable. If you
 * maintain copies of {@code nativePtr} outside
 * {@code referent}, you must not access these after
 * {@code referent} becomes unreachable, because they may be dangling
 * pointers.
 * <p>
 * The returned Runnable can be used to free the native allocation before
 * {@code referent} becomes unreachable. The runnable will have no
 * effect if the native allocation has already been freed by the runtime
 * or by using the runnable.
 * <p>
 * WARNING: This unconditionally takes ownership, i.e. deallocation
 * responsibility of nativePtr. nativePtr will be DEALLOCATED IMMEDIATELY
 * if the registration attempt throws an exception (other than one reporting
 * a programming error).
 *
 * @param referent      Non-{@code null} java object to associate the native allocation with
 * @param nativePtr     Non-zero address of the native allocation
 * @return runnable to explicitly free native allocation
 * @throws java.lang.IllegalArgumentException if either referent or nativePtr is {@code null}.
 * @throws java.lang.OutOfMemoryError  if there is not enough space on the Java heap
 *                           in which to register the allocation. In this
 *                           case, {@code freeFunction} will be
 *                           called with {@code nativePtr} as its
 *                           argument before the {@link java.lang.OutOfMemoryError OutOfMemoryError} is
 *                           thrown.
 *
 * @hide
 */

@androidx.annotation.RecentlyNonNull
public java.lang.Runnable registerNativeAllocation(@androidx.annotation.RecentlyNonNull java.lang.Object referent, long nativePtr) { throw new RuntimeException("Stub!"); }

/**
 * Calls {@code freeFunction}({@code nativePtr}).
 * Provided as a convenience in the case where you wish to manually free a
 * native allocation using a {@code freeFunction} without using a
 * {@link libcore.util.NativeAllocationRegistry NativeAllocationRegistry}.
 *
 * @param freeFunction address of a native function used to free this
 *                     kind of native allocation
 * @param nativePtr    pointer to pass to freeing function
 *
 * @hide
 */

public static native void applyFreeFunction(long freeFunction, long nativePtr);
}

