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

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class BaseDexClassLoader extends java.lang.ClassLoader {

public BaseDexClassLoader(java.lang.String dexPath, java.io.File optimizedDirectory, java.lang.String librarySearchPath, java.lang.ClassLoader parent) { throw new RuntimeException("Stub!"); }

public void reportClassLoaderChain() { throw new RuntimeException("Stub!"); }

protected java.lang.Class<?> findClass(java.lang.String name) throws java.lang.ClassNotFoundException { throw new RuntimeException("Stub!"); }

public void addDexPath(@android.annotation.Nullable java.lang.String dexPath) { throw new RuntimeException("Stub!"); }

public void addNativePath(@android.annotation.NonNull java.util.Collection<java.lang.String> libPaths) { throw new RuntimeException("Stub!"); }

protected java.net.URL findResource(java.lang.String name) { throw new RuntimeException("Stub!"); }

protected java.util.Enumeration<java.net.URL> findResources(java.lang.String name) { throw new RuntimeException("Stub!"); }

public java.lang.String findLibrary(java.lang.String name) { throw new RuntimeException("Stub!"); }

protected synchronized java.lang.Package getPackage(java.lang.String name) { throw new RuntimeException("Stub!"); }

@android.annotation.NonNull
public java.lang.String getLdLibraryPath() { throw new RuntimeException("Stub!"); }

public java.lang.String toString() { throw new RuntimeException("Stub!"); }

public static void setReporter(@android.annotation.Nullable dalvik.system.BaseDexClassLoader.Reporter newReporter) { throw new RuntimeException("Stub!"); }
@SuppressWarnings({"unchecked", "deprecation", "all"})
public static interface Reporter {

public void report(@android.annotation.NonNull java.util.Map<java.lang.String,java.lang.String> contextsMap);
}

}
