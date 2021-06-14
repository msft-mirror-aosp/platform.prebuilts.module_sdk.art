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

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class VMDebug {

private VMDebug() { throw new RuntimeException("Stub!"); }

@dalvik.annotation.optimization.FastNative
public static native long lastDebuggerActivity();

@dalvik.annotation.optimization.FastNative
public static native boolean isDebuggingEnabled();

@dalvik.annotation.optimization.FastNative
public static native boolean isDebuggerConnected();

public static native java.lang.String[] getVmFeatureList();

public static void startMethodTracing(java.lang.String traceFileName, int bufferSize, int flags, boolean samplingEnabled, int intervalUs) { throw new RuntimeException("Stub!"); }

public static void startMethodTracing(java.lang.String traceFileName, java.io.FileDescriptor fd, int bufferSize, int flags, boolean samplingEnabled, int intervalUs, boolean streamingOutput) { throw new RuntimeException("Stub!"); }

public static void startMethodTracingDdms(int bufferSize, int flags, boolean samplingEnabled, int intervalUs) { throw new RuntimeException("Stub!"); }

public static native int getMethodTracingMode();

public static native void stopMethodTracing();

@dalvik.annotation.optimization.FastNative
public static native long threadCpuTimeNanos();

public static native void startAllocCounting();

public static native void stopAllocCounting();

public static native int getAllocCount(int kind);

public static native void resetAllocCount(int kinds);

@dalvik.annotation.optimization.FastNative
public static native void printLoadedClasses(int flags);

@dalvik.annotation.optimization.FastNative
public static native int getLoadedClassCount();

public static void dumpHprofData(java.lang.String filename) throws java.io.IOException { throw new RuntimeException("Stub!"); }

public static native void dumpHprofDataDdms();

public static void dumpHprofData(java.lang.String fileName, java.io.FileDescriptor fd) throws java.io.IOException { throw new RuntimeException("Stub!"); }

public static native void dumpReferenceTables();

public static native long countInstancesOfClass(java.lang.Class klass, boolean assignable);

public static native long[] countInstancesOfClasses(java.lang.Class[] classes, boolean assignable);

public static java.lang.String getRuntimeStat(java.lang.String statName) { throw new RuntimeException("Stub!"); }

public static java.util.Map<java.lang.String,java.lang.String> getRuntimeStats() { throw new RuntimeException("Stub!"); }

public static void attachAgent(java.lang.String agent, java.lang.ClassLoader classLoader) throws java.io.IOException { throw new RuntimeException("Stub!"); }

public static native void setAllocTrackerStackDepth(int stackDepth);

public static final int KIND_ALL_COUNTS = -1; // 0xffffffff

public static final int KIND_GLOBAL_ALLOCATED_BYTES = 2; // 0x2

public static final int KIND_GLOBAL_ALLOCATED_OBJECTS = 1; // 0x1

public static final int KIND_GLOBAL_CLASS_INIT_COUNT = 32; // 0x20

public static final int KIND_GLOBAL_CLASS_INIT_TIME = 64; // 0x40

public static final int KIND_GLOBAL_FREED_BYTES = 8; // 0x8

public static final int KIND_GLOBAL_FREED_OBJECTS = 4; // 0x4

public static final int KIND_GLOBAL_GC_INVOCATIONS = 16; // 0x10

public static final int KIND_THREAD_ALLOCATED_BYTES = 131072; // 0x20000

public static final int KIND_THREAD_ALLOCATED_OBJECTS = 65536; // 0x10000

public static final int KIND_THREAD_GC_INVOCATIONS = 1048576; // 0x100000

public static final int TRACE_COUNT_ALLOCS = 1; // 0x1
}

