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

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * Loads DEX files. This class is meant for internal use and should not be used
 * by applications.
 *
 * @deprecated This class should not be used directly by applications. It will hurt
 *     performance in most cases and will lead to incorrect execution of bytecode in
 *     the worst case. Applications should use one of the standard classloaders such
 *     as {@link dalvik.system.PathClassLoader} instead. <b>This API will be removed
 *     in a future Android release</b>.
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
@Deprecated
public final class DexFile {

/**
 * Opens a DEX file from a given File object.
 *
 * @deprecated Applications should use one of the standard classloaders such
 *     as {@link dalvik.system.PathClassLoader} instead. <b>This API will be removed
 *     in a future Android release</b>.
 */

@Deprecated
public DexFile(java.io.File file) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Opens a DEX file from a given filename.
 *
 * @deprecated Applications should use one of the standard classloaders such
 *     as {@link dalvik.system.PathClassLoader} instead. <b>This API will be removed
 *     in a future Android release</b>.
 */

@Deprecated
public DexFile(java.lang.String fileName) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Open a DEX file, specifying the file in which the optimized DEX
 * data should be written.  If the optimized form exists and appears
 * to be current, it will be used; if not, the VM will attempt to
 * regenerate it.
 *
 * @deprecated Applications should use one of the standard classloaders such
 *     as {@link dalvik.system.PathClassLoader} instead. <b>This API will be removed
 *     in a future Android release</b>.
 */

@Deprecated
public static dalvik.system.DexFile loadDex(java.lang.String sourcePathName, java.lang.String outputPathName, int flags) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Gets the name of the (already opened) DEX file.
 *
 * @return the file name
 */

@Deprecated
public java.lang.String getName() { throw new RuntimeException("Stub!"); }

@Deprecated
public java.lang.String toString() { throw new RuntimeException("Stub!"); }

/**
 * Closes the DEX file.
 * <p>
 * This may not be able to release all of the resources. If classes from this DEX file are
 * still resident, the DEX file can't be unmapped. In the case where we do not release all
 * the resources, close is called again in the finalizer.
 *
 * @throws java.io.IOException
 *             if an I/O error occurs during closing the file, which
 *             normally should not happen
 */

@Deprecated
public void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Loads a class. Returns the class on success, or a {@code null} reference
 * on failure.
 * <p>
 * If you are not calling this from a class loader, this is most likely not
 * going to do what you want. Use {@link java.lang.Class#forName(java.lang.String) Class#forName(String)} instead.
 * <p>
 * The method does not throw {@link java.lang.ClassNotFoundException ClassNotFoundException} if the class
 * isn't found because it isn't reasonable to throw exceptions wildly every
 * time a class is not found in the first DEX file we look at.
 *
 * @param name
 *            the class name, which should look like "java/lang/String"
 *
 * @param loader
 *            the class loader that tries to load the class (in most cases
 *            the caller of the method
 *
 * @return the {@link java.lang.Class Class} object representing the class, or {@code null}
 *         if the class cannot be loaded
 */

@Deprecated
public java.lang.Class loadClass(java.lang.String name, java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }

/**
 * Enumerate the names of the classes in this DEX file.
 *
 * @return an enumeration of names of classes contained in the DEX file, in
 *         the usual internal form (like "java/lang/String").
 */

@Deprecated
public java.util.Enumeration<java.lang.String> entries() { throw new RuntimeException("Stub!"); }

/**
 * Called when the class is finalized. Makes sure the DEX file is closed.
 *
 * @throws java.io.IOException
 *             if an I/O error occurs during closing the file, which
 *             normally should not happen
 */

@Deprecated
protected void finalize() throws java.lang.Throwable { throw new RuntimeException("Stub!"); }

/**
 * Returns true if the VM believes that the apk/jar file is out of date
 * and should be passed through "dexopt" again.
 *
 * @param fileName the absolute path to the apk/jar file to examine.
 * @return true if dexopt should be called on the file, false otherwise.
 * @throws java.io.FileNotFoundException if fileName is not readable,
 *         not a file, or not present.
 * @throws java.io.IOException if fileName is not a valid apk/jar file or
 *         if problems occur while parsing it.
 * @throws java.lang.NullPointerException if fileName is null.
 */

@Deprecated
public static native boolean isDexOptNeeded(java.lang.String fileName) throws java.io.FileNotFoundException, java.io.IOException;

/**
 * Returns the VM's opinion of what kind of dexopt is needed to make the
 * apk/jar file up to date, where {@code targetMode} is used to indicate what
 * type of compilation the caller considers up-to-date, and {@code newProfile}
 * is used to indicate whether profile information has changed recently.
 *
 * @param fileName the absolute path to the apk/jar file to examine.
 * @param instructionSet instruction set to examine
 * @param compilerFilter a compiler filter to use for what a caller considers up-to-date.
 * @param classLoaderContext a string encoding the class loader context the dex file
 *        is intended to have at runtime.
 * @param newProfile flag that describes whether a profile corresponding
 *        to the dex file has been recently updated and should be considered
 *        in the state of the file.
 * @param downgrade flag that describes if the purpose of dexopt is to downgrade the
 *        compiler filter. If set to false, will be evaluated as an upgrade request.
 * @return NO_DEXOPT_NEEDED, or DEX2OAT_*. See documentation
 *         of the particular status code for more information on its
 *         meaning. Returns a positive status code if the status refers to
 *         the oat file in the oat location. Returns a negative status
 *         code if the status refers to the oat file in the odex location.
 * @throws java.io.FileNotFoundException if fileName is not readable,
 *         not a file, or not present.
 * @throws java.io.IOException if fileName is not a valid apk/jar file or
 *         if problems occur while parsing it.
 * @throws java.lang.NullPointerException if {@code fileName} is {@code null}.
 *
 * @hide
 */

@Deprecated
public static native int getDexOptNeeded(@android.annotation.NonNull java.lang.String fileName, @android.annotation.NonNull java.lang.String instructionSet, @android.annotation.NonNull java.lang.String compilerFilter, @android.annotation.Nullable java.lang.String classLoaderContext, boolean newProfile, boolean downgrade) throws java.io.FileNotFoundException, java.io.IOException;

/**
 * Retrieves the optimization info for a dex file.
 *
 * @param fileName       path to dex file
 * @param instructionSet instruction set to get optimization info for
 * @return {@link dalvik.system.DexFile.OptimizationInfo OptimizationInfo} for {@code fileName} dex file
 * @throws java.io.FileNotFoundException if {@code fileName} not found
 *
 * @hide
 */

@Deprecated
@android.annotation.NonNull
public static dalvik.system.DexFile.OptimizationInfo getDexFileOptimizationInfo(@android.annotation.NonNull java.lang.String fileName, @android.annotation.NonNull java.lang.String instructionSet) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }

/**
 * Returns the paths of the optimized files generated for {@code fileName}.
 * If no optimized code exists the method returns {@code null}.
 *
 * @param fileName       path to dex file
 * @param instructionSet instruction set to get optimized files for
 * @return paths to optimized code, or {@code null} if they do not exist
 * @throws java.io.FileNotFoundException
 *
 * @hide
 */

@Deprecated
@android.annotation.Nullable
public static native java.lang.String[] getDexFileOutputPaths(@android.annotation.NonNull java.lang.String fileName, @android.annotation.NonNull java.lang.String instructionSet) throws java.io.FileNotFoundException;

/**
 * Returns whether the given filter is a valid filter.
 *
 * @param filter filter string
 * @return whether given filter string is a valid filter
 *
 * @hide
 */

@Deprecated
public static native boolean isValidCompilerFilter(@android.annotation.NonNull java.lang.String filter);

/**
 * Returns whether the given filter is based on profiles.
 *
 * @param filter filter string
 * @return whether given filter string is based on profiles
 *
 * @hide
 */

@Deprecated
public static native boolean isProfileGuidedCompilerFilter(@android.annotation.NonNull java.lang.String filter);

/**
 * Returns the version of the compiler filter that is suitable for safe mode.
 * If the input is not a valid filter, or the filter is already suitable for
 * safe mode, this returns the input.
 *
 * @param filter filter string
 * @return version of the compiler filter that is suitable for safe mode
 *
 * @hide
 */

@Deprecated
@android.annotation.NonNull
public static native java.lang.String getSafeModeCompilerFilter(@android.annotation.NonNull java.lang.String filter);

/**
 * dex2oat should be run to update the apk/jar because the existing code
 * is out of date with respect to the target compiler filter.
 *
 * See {@link #getDexOptNeeded(java.lang.String,java.lang.String,java.lang.String,boolean,boolean)}.
 *
 * @hide
 */

@Deprecated public static final int DEX2OAT_FOR_FILTER = 3; // 0x3

/**
 * No dexopt should (or can) be done to update the apk/jar.
 *
 * See {@link #getDexOptNeeded(java.lang.String,java.lang.String,java.lang.String,boolean,boolean)}.
 *
 * @hide
 */

@Deprecated public static final int NO_DEXOPT_NEEDED = 0; // 0x0
/**
 * Encapsulates information about the optimizations performed on a dex file.
 *
 * Note that the info is only meant for debugging and is not guaranteed to be
 * stable across releases and/or devices.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
@Deprecated
public static final class OptimizationInfo {

private OptimizationInfo() { throw new RuntimeException("Stub!"); }

/**
 * Returns the human readable refined status of the validity of the odex file.
 *
 * @return optimization status
 */

@Deprecated
@android.annotation.NonNull
public java.lang.String getStatus() { throw new RuntimeException("Stub!"); }

/**
 * Returns the reason of a particular optimization used.
 *
 * @return optimization reason
 */

@Deprecated
@android.annotation.NonNull
public java.lang.String getReason() { throw new RuntimeException("Stub!"); }
}

}

