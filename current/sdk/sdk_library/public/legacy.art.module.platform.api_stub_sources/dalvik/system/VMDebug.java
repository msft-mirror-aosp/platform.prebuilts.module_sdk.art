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

import java.io.FileDescriptor;
import java.io.IOException;

/**
 * Provides access to some VM-specific debug features. Though this class and
 * many of its members are public, this class is meant to be wrapped in a more
 * friendly way for use by application developers. On the Android platform, the
 * recommended way to access this functionality is through the class
 * <code>android.os.Debug</code>.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class VMDebug {

private VMDebug() { throw new RuntimeException("Stub!"); }

/**
 * Returns the time since the last known debugger activity.
 *
 * @return the time in milliseconds, or -1 if the debugger is not connected
 *
 * @hide
 */

@dalvik.annotation.optimization.FastNative
public static native long lastDebuggerActivity();

/**
 * Determines if debugging is enabled in this VM.  If debugging is not
 * enabled, a debugger cannot be attached.
 *
 * @return true if debugging is enabled
 *
 * @hide
 */

@dalvik.annotation.optimization.FastNative
public static native boolean isDebuggingEnabled();

/**
 * Determines if a debugger is currently attached.
 *
 * @return true if (and only if) a debugger is connected
 *
 * @hide
 */

@dalvik.annotation.optimization.FastNative
public static native boolean isDebuggerConnected();

/**
 * Returns an array of strings that identify VM features.  This is
 * used by DDMS to determine what sorts of operations the VM can
 * perform.
 *
 * @return array of strings identifying VM features
 *
 * @hide
 */

public static native java.lang.String[] getVmFeatureList();

/**
 * Start method tracing, specifying a file name as well as a default
 * buffer size. See <a
 * href="{@docRoot}guide/developing/tools/traceview.html"> Running the
 * Traceview Debugging Program</a> for information about reading
 * trace files.
 *
 * <p>You can use either a fully qualified path and
 * name, or just a name. If only a name is specified, the file will
 * be created under the /sdcard/ directory. If a name is not given,
 * the default is /sdcard/dmtrace.trace.</p>
 *
 * @param traceFileName   name to give the trace file
 * @param bufferSize      the maximum size of both files combined. If passed
 *                        as {@code 0}, it defaults to 8MB.
 * @param flags           flags to control method tracing. The only one that
 *                        is currently defined is {@link #TRACE_COUNT_ALLOCS}.
 * @param samplingEnabled if true, sample profiling is enabled. Otherwise,
 *                        method instrumentation is used.
 * @param intervalUs      the time between samples in microseconds when
 *                        sampling is enabled.
 *
 * @hide
 */

public static void startMethodTracing(java.lang.String traceFileName, int bufferSize, int flags, boolean samplingEnabled, int intervalUs) { throw new RuntimeException("Stub!"); }

/**
 * Like {@link #startMethodTracing(java.lang.String,int,int)}, but taking an already-opened
 * {@code FileDescriptor} in which the trace is written.  The file name is also
 * supplied simply for logging.  Makes a dup of the file descriptor.
 * Streams tracing data to the file if streamingOutput is true.
 *
 * @param traceFileName   name to give the trace file
 * @param fd              already opened {@code FileDescriptor} in which trace is written
 * @param bufferSize      the maximum size of both files combined. If passed
 *                        as {@code 0}, it defaults to 8MB.
 * @param flags           flags to control method tracing. The only one that
 *                        is currently defined is {@link #TRACE_COUNT_ALLOCS}.
 * @param samplingEnabled if true, sample profiling is enabled. Otherwise,
 *                        method instrumentation is used.
 * @param intervalUs      the time between samples in microseconds when
 *                        sampling is enabled.
 * @param streamingOutput streams tracing data to the duped {@code fd} file descriptor
 *                        if {@code streamingOutput} is {@code true}.
 *
 * @hide
 */

public static void startMethodTracing(java.lang.String traceFileName, java.io.FileDescriptor fd, int bufferSize, int flags, boolean samplingEnabled, int intervalUs, boolean streamingOutput) { throw new RuntimeException("Stub!"); }

/**
 * Starts method tracing without a backing file.  When {@link #stopMethodTracing()}
 * is called, the result is sent directly to DDMS.  (If DDMS is not
 * attached when tracing ends, the profiling data will be discarded.)
 *
 * @param bufferSize      the maximum size of both files combined. If passed
 *                        as {@code 0}, it defaults to 8MB.
 * @param flags           flags to control method tracing. The only one that
 *                        is currently defined is {@link #TRACE_COUNT_ALLOCS}.
 * @param samplingEnabled if true, sample profiling is enabled. Otherwise,
 *                        method instrumentation is used.
 * @param intervalUs      the time between samples in microseconds when
 *                        sampling is enabled.
 *
 * @hide
 */

public static void startMethodTracingDdms(int bufferSize, int flags, boolean samplingEnabled, int intervalUs) { throw new RuntimeException("Stub!"); }

/**
 * Determine whether method tracing is currently active and what type is
 * active.
 *
 * @hide
 */

public static native int getMethodTracingMode();

/**
 * Stops method tracing.
 *
 * @hide
 */

public static native void stopMethodTracing();

/**
 * Get an indication of thread CPU usage. The value returned indicates the
 * amount of time that the current thread has spent executing code or
 * waiting for certain types of I/O.
 * <p>
 * The time is expressed in nanoseconds, and is only meaningful when
 * compared to the result from an earlier call. Note that nanosecond
 * resolution does not imply nanosecond accuracy.
 *
 * @return the CPU usage. A value of -1 means the system does not support
 *         this feature.
 *
 * @hide
 */

@dalvik.annotation.optimization.FastNative
public static native long threadCpuTimeNanos();

/**
 * Starts counting the number and aggregate size of memory allocations.
 *
 * @hide
 */

public static native void startAllocCounting();

/**
 * Stops counting the number and aggregate size of memory allocations.
 *
 * @hide
 */

public static native void stopAllocCounting();

/**
 * Returns information on the number of objects allocated by the runtime between a
 * {@link #startAllocCounting() start} and {@link #stopAllocCounting() stop}.
 *
 * @param kind either {@code KIND_GLOBAL_*} or {@code KIND_THREAD_*}.
 *
 * @hide
 */

public static native int getAllocCount(int kind);

/**
 * Resets counting the number and aggregate size of memory allocations for the given kinds.
 *
 * @param kinds a union of {@code KIND_GLOBAL_*} and {@code KIND_THREAD_*}.
 *
 * @hide
 */

public static native void resetAllocCount(int kinds);

/**
 * Dumps a list of loaded class to the log file.
 *
 * @param flags a union of {@link android.os.Debug.SHOW_FULL_DETAIL},
 *    {@link android.os.Debug.SHOW_CLASSLOADER}, and {@link android.os.Debug.SHOW_INITIALIZED}.
 *
 * @hide
 */

@dalvik.annotation.optimization.FastNative
public static native void printLoadedClasses(int flags);

/**
 * Gets the number of loaded classes.
 *
 * @return the number of loaded classes
 *
 * @hide
 */

@dalvik.annotation.optimization.FastNative
public static native int getLoadedClassCount();

/**
 * Dumps "hprof" data to the specified file.  This may cause a GC.
 *
 * The VM may create a temporary file in the same directory.
 *
 * @param filename Full pathname of output file (e.g. "/sdcard/dump.hprof").
 * @throws java.lang.UnsupportedOperationException if the VM was built without
 *         HPROF support.
 * @throws java.io.IOException if an error occurs while opening or writing files.
 *
 * @hide
 */

public static void dumpHprofData(java.lang.String filename) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Collects "hprof" heap data and sends it to DDMS.  This may cause a GC.
 *
 * @throws java.lang.UnsupportedOperationException if the VM was built without
 *         HPROF support.
 *
 * @hide
 */

public static native void dumpHprofDataDdms();

/**
 * Dumps "hprof" heap data to a file, by name or descriptor.
 *
 * @param fileName Name of output file.  If fd is non-null, the
 *        file name is only used in log messages (and may be null).
 * @param fd Descriptor of open file that will receive the output.
 *        If this is null, the fileName is used instead.
 * @throws {@link java.io.IOException IOException} if an error occurs while opening or writing files.
 *
 * @hide
 */

public static void dumpHprofData(java.lang.String fileName, java.io.FileDescriptor fd) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Dumps the contents of the VM reference tables (e.g. JNI locals and
 * globals) to the log file.
 *
 * @hide
 */

public static native void dumpReferenceTables();

/**
 * Counts the instances of a class.
 * It is the caller's responsibility to do GC if they don't want unreachable
 * objects to get counted.
 *
 * @param klass the class to be counted.
 * @param assignable if true, any instance whose class is assignable to
 *                   {@code klass}, as defined by {@link java.lang.Class#isAssignableFrom Class#isAssignableFrom},
 *                   is counted. If false, only instances whose class is
 *                   equal to {@code klass} are counted.
 * @return the number of matching instances.
 *
 * @hide
 */

public static native long countInstancesOfClass(java.lang.Class klass, boolean assignable);

/**
 * Counts the instances of classes.
 * It is the caller's responsibility to do GC if they don't want unreachable
 * objects to get counted.
 *
 * @param classes the classes to be counted.
 * @param assignable if true, any instance whose class is assignable to
 *                   {@code classes[i]}, as defined by {@link java.lang.Class#isAssignableFrom Class#isAssignableFrom},
 *                   is counted. If false, only instances whose class is
 *                   equal to {@code classes[i]} are counted.
 * @return an array containing the number of matching instances. The value
 *         for index {@code i} is the number of instances of
 *         the class {@code classes[i]}
 *
 * @hide
 */

public static native long[] countInstancesOfClasses(java.lang.Class[] classes, boolean assignable);

/**
 * Returns the value of a particular runtime statistic or {@code null} if no
 * such runtime statistic exists.
 *
 * @param statName the name of the runtime statistic to look up.
 *
 * @return the value of the runtime statistic.
 *
 * @hide
 */

public static java.lang.String getRuntimeStat(java.lang.String statName) { throw new RuntimeException("Stub!"); }

/**
 * Returns a map of the names/values of the runtime statistics
 * that {@link #getRuntimeStat()} supports.
 *
 * @return a map of the names/values of the supported runtime statistics.
 *
 * @hide
 */

public static java.util.Map<java.lang.String,java.lang.String> getRuntimeStats() { throw new RuntimeException("Stub!"); }

/**
 * Attaches an agent to the VM.
 *
 * @param agent       The path to the agent .so file plus optional agent arguments.
 * @param classLoader The classloader to use as a loading context.
 *
 * @throws java.io.IOException if an error occurs while opening {@code agent} file.
 *
 * @hide
 */

public static void attachAgent(java.lang.String agent, java.lang.ClassLoader classLoader) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Sets the number of frames recorded for allocation tracking.
 *
 * @param stackDepth The number of frames captured for each stack trace.
 *
 * @hide
 */

public static native void setAllocTrackerStackDepth(int stackDepth);

/**
 * Constant for {@link #getAllocCount(int)} to get all possible stats.
 *
 * @hide
 */

public static final int KIND_ALL_COUNTS = -1; // 0xffffffff

/**
 * Constant for {@link #getAllocCount(int)}
 * to get the cumulative size of all objects allocated.
 *
 * @hide
 */

public static final int KIND_GLOBAL_ALLOCATED_BYTES = 2; // 0x2

/**
 * Constant for {@link #getAllocCount(int)}
 * to get the number of all allocated objects.
 *
 * @hide
 */

public static final int KIND_GLOBAL_ALLOCATED_OBJECTS = 1; // 0x1

/**
 * Constant for {@link #getAllocCount(int)}
 * to get the number of initialized classes.
 *
 * @hide
 */

public static final int KIND_GLOBAL_CLASS_INIT_COUNT = 32; // 0x20

/**
 * Constant for {@link #getAllocCount(int)}
 * to get the cumulative time spent in class initialization.
 *
 * @hide
 */

public static final int KIND_GLOBAL_CLASS_INIT_TIME = 64; // 0x40

/**
 * Constant for {@link #getAllocCount(int)}
 * to get the cumulative size of all freed objects.
 *
 * @hide
 */

public static final int KIND_GLOBAL_FREED_BYTES = 8; // 0x8

/**
 * Constant for {@link #getAllocCount(int)}
 * to get the number of freed objects.
 *
 * @hide
 */

public static final int KIND_GLOBAL_FREED_OBJECTS = 4; // 0x4

/**
 * Constant for {@link #getAllocCount(int)}
 * to get the number of times an allocation triggered a blocking GC.
 *
 * @hide
 */

public static final int KIND_GLOBAL_GC_INVOCATIONS = 16; // 0x10

/**
 * Constant for {@link #getAllocCount(int)}
 * to get the cumulative size of all objects allocated for current thread.
 *
 * @hide
 */

public static final int KIND_THREAD_ALLOCATED_BYTES = 131072; // 0x20000

/**
 * Constant for {@link #getAllocCount(int)}
 * to get the number of all allocated objects for current thread.
 *
 * @hide
 */

public static final int KIND_THREAD_ALLOCATED_OBJECTS = 65536; // 0x10000

/**
 * Constant for {@link #getAllocCount(int)}
 * to get the number of times an allocation triggered a blocking GC for current thread.
 *
 * @hide
 */

public static final int KIND_THREAD_GC_INVOCATIONS = 1048576; // 0x100000

/**
 * flag for startMethodTracing(), which adds the results from
 * startAllocCounting to the trace key file.
 *
 * @hide
 */

public static final int TRACE_COUNT_ALLOCS = 1; // 0x1
}

