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
@Deprecated
public final class DexFile {

@Deprecated
public DexFile(java.io.File file) throws java.io.IOException { throw new RuntimeException("Stub!"); }

@Deprecated
public DexFile(java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }

@Deprecated
public static dalvik.system.DexFile loadDex(java.lang.String sourcePathName, java.lang.String outputPathName, int flags) throws java.io.IOException { throw new RuntimeException("Stub!"); }

@Deprecated
public java.lang.String getName() { throw new RuntimeException("Stub!"); }

@Deprecated
public java.lang.String toString() { throw new RuntimeException("Stub!"); }

@Deprecated
public void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }

@Deprecated
public java.lang.Class loadClass(java.lang.String name, java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }

@Deprecated
public java.util.Enumeration<java.lang.String> entries() { throw new RuntimeException("Stub!"); }

@Deprecated
protected void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }

@Deprecated
public static native boolean isDexOptNeeded(java.lang.String fileName) throws java.io.FileNotFoundException, java.io.IOException;

@Deprecated
public static native int getDexOptNeeded(@android.annotation.NonNull java.lang.String fileName, @android.annotation.NonNull java.lang.String instructionSet, @android.annotation.NonNull java.lang.String compilerFilter, @android.annotation.Nullable java.lang.String classLoaderContext, boolean newProfile, boolean downgrade) throws java.io.FileNotFoundException, java.io.IOException;

@Deprecated
@android.annotation.NonNull
public static dalvik.system.DexFile.OptimizationInfo getDexFileOptimizationInfo(@android.annotation.NonNull java.lang.String fileName, @android.annotation.NonNull java.lang.String instructionSet) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }

@Deprecated
@android.annotation.Nullable
public static native java.lang.String[] getDexFileOutputPaths(@android.annotation.NonNull java.lang.String fileName, @android.annotation.NonNull java.lang.String instructionSet) throws java.io.FileNotFoundException;

@Deprecated
public static native boolean isValidCompilerFilter(@android.annotation.NonNull java.lang.String filter);

@Deprecated
public static native boolean isProfileGuidedCompilerFilter(@android.annotation.NonNull java.lang.String filter);

@Deprecated
@android.annotation.NonNull
public static native java.lang.String getSafeModeCompilerFilter(@android.annotation.NonNull java.lang.String filter);

@Deprecated public static final int DEX2OAT_FOR_FILTER = 3; // 0x3

@Deprecated public static final int NO_DEXOPT_NEEDED = 0; // 0x0
@SuppressWarnings({"unchecked", "deprecation", "all"})
@Deprecated
public static final class OptimizationInfo {

private OptimizationInfo() { throw new RuntimeException("Stub!"); }

@Deprecated
@android.annotation.NonNull
public java.lang.String getStatus() { throw new RuntimeException("Stub!"); }

@Deprecated
@android.annotation.NonNull
public java.lang.String getReason() { throw new RuntimeException("Stub!"); }
}

}

