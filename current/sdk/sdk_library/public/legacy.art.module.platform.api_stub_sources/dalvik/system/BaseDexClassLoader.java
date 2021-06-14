/*
 * Copyright (C) 2011 The Android Open Source Project
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

/**
 * Base class for common functionality between various dex-based
 * {@link java.lang.ClassLoader ClassLoader} implementations.
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class BaseDexClassLoader extends java.lang.ClassLoader {

/**
 * Constructs an instance.
 * Note that all the *.jar and *.apk files from {@code dexPath} might be
 * first extracted in-memory before the code is loaded. This can be avoided
 * by passing raw dex files (*.dex) in the {@code dexPath}.
 *
 * @param dexPath the list of jar/apk files containing classes and
 * resources, delimited by {@code File.pathSeparator}, which
 * defaults to {@code ":"} on Android.
 * @param optimizedDirectory this parameter is deprecated and has no effect since API level 26.
 * @param librarySearchPath the list of directories containing native
 * libraries, delimited by {@code File.pathSeparator}; may be
 * {@code null}
 * @param parent the parent class loader
 */

public BaseDexClassLoader(java.lang.String dexPath, java.io.File optimizedDirectory, java.lang.String librarySearchPath, java.lang.ClassLoader parent) { throw new RuntimeException("Stub!"); }

/**
 * Reports the current class loader chain to the registered {@code reporter}.
 *
 * @hide
 */

public void reportClassLoaderChain() { throw new RuntimeException("Stub!"); }

protected java.lang.Class<?> findClass(java.lang.String name) throws java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }

/**
 * Adds a new dex path to path list.
 *
 * @param dexPath dex path to add to path list
 *
 * @hide
 */

public void addDexPath(@android.annotation.Nullable java.lang.String dexPath) { throw new RuntimeException("Stub!"); }

/**
 * Adds additional native paths for consideration in subsequent calls to
 * {@link #findLibrary(java.lang.String)}.
 *
 * @param libPaths collection of paths to be added to path list
 *
 * @hide
 */

public void addNativePath(@android.annotation.NonNull java.util.Collection<java.lang.String> libPaths) { throw new RuntimeException("Stub!"); }

protected java.net.URL findResource(java.lang.String name) { throw new RuntimeException("Stub!"); }

protected java.util.Enumeration<java.net.URL> findResources(java.lang.String name) { throw new RuntimeException("Stub!"); }

public java.lang.String findLibrary(java.lang.String name) { throw new RuntimeException("Stub!"); }

/**
 * Returns package information for the given package.
 * Unfortunately, instances of this class don't really have this
 * information, and as a non-secure {@code ClassLoader}, it isn't
 * even required to, according to the spec. Yet, we want to
 * provide it, in order to make all those hopeful callers of
 * {@code myClass.getPackage().getName()} happy. Thus we construct
 * a {@code Package} object the first time it is being requested
 * and fill most of the fields with fake values. The {@code
 * Package} object is then put into the {@code ClassLoader}'s
 * package cache, so we see the same one next time. We don't
 * create {@code Package} objects for {@code null} arguments or
 * for the default package.
 *
 * <p>There is a limited chance that we end up with multiple
 * {@code Package} objects representing the same package: It can
 * happen when when a package is scattered across different JAR
 * files which were loaded by different {@code ClassLoader}
 * instances. This is rather unlikely, and given that this whole
 * thing is more or less a workaround, probably not worth the
 * effort to address.
 *
 * @param name the name of the class
 * @return the package information for the class, or {@code null}
 * if there is no package information available for it
 */

protected synchronized java.lang.Package getPackage(java.lang.String name) { throw new RuntimeException("Stub!"); }

/**
 * Returns colon-separated set of directories where libraries should be
 * searched for first, before the standard set of directories.
 *
 * @return colon-separated set of search directories
 *
 * @hide
 */

@android.annotation.NonNull
public java.lang.String getLdLibraryPath() { throw new RuntimeException("Stub!"); }

public java.lang.String toString() { throw new RuntimeException("Stub!"); }

/**
 * Sets the reporter for dex load notifications.
 * Once set, all new instances of BaseDexClassLoader will report upon
 * constructions the loaded dex files.
 *
 * @param newReporter the new Reporter. Setting {@code null} will cancel reporting.
 * @hide
 */

public static void setReporter(@android.annotation.Nullable dalvik.system.BaseDexClassLoader.Reporter newReporter) { throw new RuntimeException("Stub!"); }
/**
 * Reports the construction of a {@link dalvik.system.BaseDexClassLoader BaseDexClassLoader} and provides opaque
 * information about the class loader chain.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public static interface Reporter {

/**
 * Reports the construction of a BaseDexClassLoader and provides opaque information about
 * the class loader chain. For example, if the childmost ClassLoader in the chain:
 * {@quote BaseDexClassLoader { foo.dex } -> BaseDexClassLoader { base.apk }
 *    -> BootClassLoader } was just initialized then the load of {@code "foo.dex"} would be
 * reported with a classLoaderContext of {@code "PCL[];PCL[base.apk]"}.
 *
 * @param contextsMap A map from dex file paths to the class loader context used to load
 *     each dex file.
 *
 * @hide
 */

public void report(@android.annotation.NonNull java.util.Map<java.lang.String,java.lang.String> contextsMap);
}

}

