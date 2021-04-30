/*
 * Copyright (C) 2007 The Android Open Source Project
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

import java.util.function.Consumer;

/**
 * Provides an interface to VM-global, Dalvik-specific features.
 * An application cannot create its own Runtime instance, and must obtain
 * one from the getRuntime method.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class VMRuntime {

private VMRuntime() { throw new RuntimeException("Stub!"); }

/**
 * Sets the hidden API usage logger {@link #hiddenApiUsageLogger}.
 * It should only be called if {@link #setHiddenApiAccessLogSamplingRate(int)}
 * is called with a value > 0
 *
 * @param hiddenApiUsageLogger an object implement {@code HiddenApiUsageLogger} that the runtime
 *          will call for logging hidden API checks.
 */

public static void setHiddenApiUsageLogger(dalvik.system.VMRuntime.HiddenApiUsageLogger hiddenApiUsageLogger) { throw new RuntimeException("Stub!"); }

/**
 * Returns the object that represents the current runtime.
 * @return the runtime object
 */

public static dalvik.system.VMRuntime getRuntime() { throw new RuntimeException("Stub!"); }

/**
 * Returns the name of the shared library providing the VM implementation.
 *
 * @return the name of the shared library providing the VM implementation.
 */

public native java.lang.String vmLibrary();

/**
 * Returns the VM's instruction set.
 *
 * @return the VM's instruction set.
 */

public native java.lang.String vmInstructionSet();

/**
 * Returns whether the VM is running in 64-bit mode.
 *
 * @return true if VM is running in 64-bit mode, false otherwise.
 */

@dalvik.annotation.optimization.FastNative
public native boolean is64Bit();

/**
 * Returns whether the VM is running with JNI checking enabled.
 *
 * @return true if the VM is running with JNI checking enabled,
 *         and false otherwise.
 */

@dalvik.annotation.optimization.FastNative
public native boolean isCheckJniEnabled();

/**
 * Sets the target SDK version. Should only be called before the
 * app starts to run, because it may change the VM's behavior in
 * dangerous ways. Defaults to {@link #SDK_VERSION_CUR_DEVELOPMENT}.
 *
 * @param targetSdkVersion the SDK version the app wants to run with.
 */

public synchronized void setTargetSdkVersion(int targetSdkVersion) { throw new RuntimeException("Stub!"); }

/**
 * Sets the disabled compat changes. Should only be called before the
 * app starts to run, because it may change the VM's behavior in
 * dangerous ways. Defaults to empty.
 *
 * @param disabledCompatChanges An array of ChangeIds that we want to disable.
 */

public synchronized void setDisabledCompatChanges(long[] disabledCompatChanges) { throw new RuntimeException("Stub!"); }

/**
 * Gets the target SDK version. See {@link #setTargetSdkVersion} for
 * special values.
 *
 * @return the target SDK version.
 */

public synchronized int getTargetSdkVersion() { throw new RuntimeException("Stub!"); }

/**
 * Sets the list of exemptions from hidden API access enforcement.
 *
 * @param signaturePrefixes
 *         A list of signature prefixes. Each item in the list is a prefix match on the type
 *         signature of a blacklisted API. All matching APIs are treated as if they were on
 *         the whitelist: access permitted, and no logging..
 */

public native void setHiddenApiExemptions(java.lang.String[] signaturePrefixes);

/**
 * Sets the log sampling rate of hidden API accesses written to the event log.
 *
 * @param rate Proportion of hidden API accesses that will be logged; an integer between
 *                0 and 0x10000 inclusive.
 */

public native void setHiddenApiAccessLogSamplingRate(int rate);

/**
 * Returns an array allocated in an area of the Java heap where it will never be moved.
 * This is used to implement native allocations on the Java heap, such as DirectByteBuffers
 * and Bitmaps.
 *
 * @param componentType the component type of the returned array.
 * @param length the length of the returned array.
 * @return array allocated in an area of the heap where it will never be moved.
 */

@dalvik.annotation.optimization.FastNative
public native java.lang.Object newNonMovableArray(java.lang.Class<?> componentType, int length);

/**
 * Returns an array of at least {@code minLength}, but potentially larger. The increased size
 * comes from avoiding any padding after the array. The amount of padding varies depending on
 * the componentType and the memory allocator implementation.
 *
 * @param componentType the component type of the returned array.
 * @param minLength     the minimum length of the returned array. The actual length could
 *                      be greater.
 * @return              array of at least of {@code minLength}
 */

@dalvik.annotation.optimization.FastNative
public native java.lang.Object newUnpaddedArray(java.lang.Class<?> componentType, int minLength);

/**
 * Returns the address of {@code array[0]}. This differs from using JNI in that JNI
 * might lie and give you the address of a copy of the array when in forcecopy mode.
 *
 * @param array the object we want the native address of.
 * @return native address of {@code array[0]}.
 */

@dalvik.annotation.optimization.FastNative
public native long addressOf(java.lang.Object array);

/**
 * Removes any growth limits, allowing the application to allocate
 * up to the maximum heap size.
 */

public native void clearGrowthLimit();

/**
 * Make the current growth limit the new non growth limit capacity by releasing pages which
 * are after the growth limit but before the non growth limit capacity.
 */

public native void clampGrowthLimit();

/**
 * Returns true if native debugging is on.
 *
 * @return true if native debugging is on, false otherwise.
 */

@dalvik.annotation.optimization.FastNative
public native boolean isNativeDebuggable();

/**
 * Registers a native allocation so that the heap knows about it and performs GC as required.
 * If the number of native allocated bytes exceeds the native allocation watermark, the
 * function requests a concurrent GC. If the native bytes allocated exceeds a second higher
 * watermark, it is determined that the application is registering native allocations at an
 * unusually high rate and a GC is performed inside of the function to prevent memory usage
 * from excessively increasing. Memory allocated via system malloc() should not be included
 * in this count. The argument must be the same as that later passed to registerNativeFree(),
 * but may otherwise be approximate.
 *
 * @param bytes the number of bytes of the native object.
 */

public native void registerNativeAllocation(long bytes);

/**
 * Backward compatibility version of {@link #registerNativeAllocation(long)}. We used to pass
 * an int instead of a long. The RenderScript support library looks it up via reflection.
 * @deprecated Use {@link #registerNativeAllocation(long)} instead.
 *
 * @param bytes the number of bytes of the native object.
 */

@Deprecated
public void registerNativeAllocation(int bytes) { throw new RuntimeException("Stub!"); }

/**
 * Registers a native free by reducing the number of native bytes accounted for.
 *
 * @param bytes the number of bytes of the freed object.
 */

public native void registerNativeFree(long bytes);

/**
 * Backward compatibility version of {@link #registerNativeFree(long)}.
 * @deprecated Use {@link #registerNativeFree(long)} instead.
 *
 * @param bytes the number of bytes of the freed object.
 */

@Deprecated
public void registerNativeFree(int bytes) { throw new RuntimeException("Stub!"); }

/**
 * Request that a garbage collection gets started on a different thread.
 */

public native void requestConcurrentGC();

/**
 * Let the heap know of the new process state. This can change allocation and garbage collection
 * behavior regarding trimming and compaction.
 *
 * @param state The state of the process, as defined in art/runtime/process_state.h.
 */

public native void updateProcessState(int state);

/**
 * Let the runtime know that the application startup is completed. This may affect behavior
 * related to profiling and startup caches.
 */

public native void notifyStartupCompleted();

/**
 * Fill in dex caches with classes, fields, and methods that are
 * already loaded. Typically used after Zygote preloading.
 */

public native void preloadDexCaches();

/**
 * Register application info.
 * @param profileFile the path of the file where the profile information should be stored.
 * @param codePaths the code paths that should be profiled.
 */

public static native void registerAppInfo(java.lang.String profileFile, java.lang.String[] codePaths);

/**
 * Returns the runtime instruction set corresponding to a given ABI. Multiple
 * compatible ABIs might map to the same instruction set. For example
 * {@code armeabi-v7a} and {@code armeabi} might map to the instruction set {@code arm}.
 *
 * This influences the compilation of the applications classes.
 *
 * @param abi The ABI we want the instruction set from.
 */

public static java.lang.String getInstructionSet(java.lang.String abi) { throw new RuntimeException("Stub!"); }

/**
 * Returns whether the given {@code instructionSet} is 64 bits.
 *
 * @param instructionSet a string representing an instruction set.
 *
 * @return true if given {@code instructionSet} is 64 bits, false otherwise.
 */

public static boolean is64BitInstructionSet(java.lang.String instructionSet) { throw new RuntimeException("Stub!"); }

/**
 * Returns whether the given {@code abi} is 64 bits.
 *
 * @param abi a string representing an ABI.
 *
 * @return true if given {@code abi} is 64 bits, false otherwise.
 */

public static boolean is64BitAbi(java.lang.String abi) { throw new RuntimeException("Stub!"); }

/**
 * Used to notify the runtime that boot completed.
 */

public static native void bootCompleted();

/**
 * Used to notify the runtime to reset Jit counters. This is done for the boot image
 * profiling configuration to avoid samples during class preloading. This helps avoid
 * the regression from disabling class profiling.
 */

public static native void resetJitCounters();

/**
 * Returns the instruction set of the current runtime.
 *
 * @return instruction set of the current runtime.
 */

public static native java.lang.String getCurrentInstructionSet();

/**
 * Register the current execution thread to the runtime as sensitive thread.
 * Should be called just once. Subsequent calls are ignored.
 */

public static native void registerSensitiveThread();

/**
 * Sets a callback that the runtime can call whenever a usage of a non SDK API is detected.
 *
 * @param consumer an object implementing the {@code java.util.function.Consumer} interface that
 *      the runtime will call whenever a usage of a non SDK API is detected.
 */

public static void setNonSdkApiUsageConsumer(java.util.function.Consumer<java.lang.String> consumer) { throw new RuntimeException("Stub!"); }

/**
 * Sets whether or not the runtime should dedupe detection and warnings for hidden API usage.
 *
 * @param dedupe if set, only the first usage of each API will be detected. The default
 *      behaviour is to dedupe.
 */

public static native void setDedupeHiddenApiWarnings(boolean dedupe);

/**
 * Sets the package name of the app running in this process.
 *
 * @param packageName the value being set
 */

public static native void setProcessPackageName(java.lang.String packageName);

/**
 * Sets the full path to data directory of the app running in this process.
 *
 * @param dataDir the value being set
 */

public static native void setProcessDataDirectory(java.lang.String dataDir);

/**
 * Returns whether {@code encodedClassLoaderContext} is a valid encoded class loader context.
 * A class loader context is an internal opaque format used by the runtime to encode the
 * class loader hierarchy (including each ClassLoader's classpath) used to load a dex file.
 *
 * @param encodedClassLoaderContext the class loader context to analyze
 * @throws java.lang.NullPointerException if {@code encodedClassLoaderContext is null.
 * @return {@code true} if {@code encodedClassLoaderContext} is a non-null valid encoded class
 *         loader context.
 */

public static native boolean isValidClassLoaderContext(java.lang.String encodedClassLoaderContext);

/**
 * Magic version number for a current development build, which has not
 * yet turned into an official release. This number must be larger than
 * any released version in {@code android.os.Build.VERSION_CODES}.
 * @hide
 */

public static final int SDK_VERSION_CUR_DEVELOPMENT = 10000; // 0x2710
/**
 * Interface for logging hidden API usage events.
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public static interface HiddenApiUsageLogger {

/**
 * Logs hidden API access
 *
 * @param sampledValue value that was sampled, to be compared against the
 *      sampling rate
 * @param appPackageName package name of the app attempting the access
 * @param signature signature of the method being called, i.e
 *      class_name->member_name:type_signature (e.g.
 *      {@code com.android.app.Activity->mDoReportFullyDrawn:Z}) for fields and
 *      class_name->method_name_and_signature for methods (e.g
 *      {@code com.android.app.Activity->finish(I)V})
 * @param accessType how the accessed was done
 * @param accessDenied whether the access was allowed or not
 */

public void hiddenApiUsed(int sampledValue, java.lang.String appPackageName, java.lang.String signature, int accessType, boolean accessDenied);

/**
 *  Used when a method has been accessed via JNI.
 */

public static final int ACCESS_METHOD_JNI = 2; // 0x2

/**
 * Used when a method is accessed at link time. Never logged, added only
 * for completeness.
 */

public static final int ACCESS_METHOD_LINKING = 3; // 0x3

/**
 * Internal test value that does not correspond to an actual access by the
 * application. Never logged, added for completeness.
 */

public static final int ACCESS_METHOD_NONE = 0; // 0x0

/**
 *  Used when a method has been accessed via reflection.
 */

public static final int ACCESS_METHOD_REFLECTION = 1; // 0x1
}

}

