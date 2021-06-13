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
public final class VMRuntime {

private VMRuntime() { throw new RuntimeException("Stub!"); }

public static void setHiddenApiUsageLogger(dalvik.system.VMRuntime.HiddenApiUsageLogger hiddenApiUsageLogger) { throw new RuntimeException("Stub!"); }

public static dalvik.system.VMRuntime getRuntime() { throw new RuntimeException("Stub!"); }

public native java.lang.String vmLibrary();

public native java.lang.String vmInstructionSet();

@dalvik.annotation.optimization.FastNative
public native boolean is64Bit();

@dalvik.annotation.optimization.FastNative
public native boolean isCheckJniEnabled();

public synchronized void setTargetSdkVersion(int targetSdkVersion) { throw new RuntimeException("Stub!"); }

public synchronized void setDisabledCompatChanges(long[] disabledCompatChanges) { throw new RuntimeException("Stub!"); }

public synchronized int getTargetSdkVersion() { throw new RuntimeException("Stub!"); }

public native void setHiddenApiExemptions(java.lang.String[] signaturePrefixes);

public native void setHiddenApiAccessLogSamplingRate(int rate);

@dalvik.annotation.optimization.FastNative
public native java.lang.Object newNonMovableArray(java.lang.Class<?> componentType, int length);

@dalvik.annotation.optimization.FastNative
public native java.lang.Object newUnpaddedArray(java.lang.Class<?> componentType, int minLength);

@dalvik.annotation.optimization.FastNative
public native long addressOf(java.lang.Object array);

public native void clearGrowthLimit();

public native void clampGrowthLimit();

@dalvik.annotation.optimization.FastNative
public native boolean isNativeDebuggable();

public native void registerNativeAllocation(long bytes);

@Deprecated
public void registerNativeAllocation(int bytes) { throw new RuntimeException("Stub!"); }

public native void registerNativeFree(long bytes);

@Deprecated
public void registerNativeFree(int bytes) { throw new RuntimeException("Stub!"); }

public native void requestConcurrentGC();

public native void updateProcessState(int state);

public native void notifyStartupCompleted();

public native void preloadDexCaches();

public static native void registerAppInfo(java.lang.String packageName, java.lang.String currentProfileFile, java.lang.String referenceProfileFile, java.lang.String[] appCodePaths, int codePathsType);

public static java.lang.String getInstructionSet(java.lang.String abi) { throw new RuntimeException("Stub!"); }

public static boolean is64BitInstructionSet(java.lang.String instructionSet) { throw new RuntimeException("Stub!"); }

public static boolean is64BitAbi(java.lang.String abi) { throw new RuntimeException("Stub!"); }

public static native void bootCompleted();

public static native void resetJitCounters();

public static native java.lang.String getCurrentInstructionSet();

public static native void registerSensitiveThread();

public static void setNonSdkApiUsageConsumer(java.util.function.Consumer<java.lang.String> consumer) { throw new RuntimeException("Stub!"); }

public static native void setDedupeHiddenApiWarnings(boolean dedupe);

public static native void setProcessPackageName(java.lang.String packageName);

public static native void setProcessDataDirectory(java.lang.String dataDir);

public static native boolean isValidClassLoaderContext(java.lang.String encodedClassLoaderContext);

public static final int CODE_PATH_TYPE_PRIMARY_APK = 1; // 0x1

public static final int CODE_PATH_TYPE_SECONDARY_DEX = 4; // 0x4

public static final int CODE_PATH_TYPE_SPLIT_APK = 2; // 0x2

public static final int SDK_VERSION_CUR_DEVELOPMENT = 10000; // 0x2710
@SuppressWarnings({"unchecked", "deprecation", "all"})
public static interface HiddenApiUsageLogger {

public void hiddenApiUsed(int sampledValue, java.lang.String appPackageName, java.lang.String signature, int accessType, boolean accessDenied);

public static final int ACCESS_METHOD_JNI = 2; // 0x2

public static final int ACCESS_METHOD_LINKING = 3; // 0x3

public static final int ACCESS_METHOD_NONE = 0; // 0x0

public static final int ACCESS_METHOD_REFLECTION = 1; // 0x1
}

}

