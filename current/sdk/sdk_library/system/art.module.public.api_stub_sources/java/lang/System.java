/*
 * Copyright (C) 2014 The Android Open Source Project
 * Copyright (c) 1994, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.lang;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class System {

private System() { throw new RuntimeException("Stub!"); }

public static void setIn(@androidx.annotation.RecentlyNullable java.io.InputStream in) { throw new RuntimeException("Stub!"); }

public static void setOut(@androidx.annotation.RecentlyNullable java.io.PrintStream out) { throw new RuntimeException("Stub!"); }

public static void setErr(@androidx.annotation.RecentlyNullable java.io.PrintStream err) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public static java.io.Console console() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public static java.nio.channels.Channel inheritedChannel() throws java.io.IOException { throw new RuntimeException("Stub!"); }

public static void setSecurityManager(@androidx.annotation.RecentlyNullable java.lang.SecurityManager s) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public static java.lang.SecurityManager getSecurityManager() { throw new RuntimeException("Stub!"); }

public static native long currentTimeMillis();

public static native long nanoTime();

public static native void arraycopy(@androidx.annotation.RecentlyNonNull java.lang.Object src, int srcPos, @androidx.annotation.RecentlyNonNull java.lang.Object dest, int destPos, int length);

public static int identityHashCode(@androidx.annotation.RecentlyNullable java.lang.Object x) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.Properties getProperties() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String lineSeparator() { throw new RuntimeException("Stub!"); }

public static void setProperties(@androidx.annotation.RecentlyNullable java.util.Properties props) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public static java.lang.String getProperty(@androidx.annotation.RecentlyNonNull java.lang.String key) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public static java.lang.String getProperty(@androidx.annotation.RecentlyNonNull java.lang.String key, @androidx.annotation.RecentlyNullable java.lang.String def) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public static java.lang.String setProperty(@androidx.annotation.RecentlyNonNull java.lang.String key, @androidx.annotation.RecentlyNullable java.lang.String value) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public static java.lang.String clearProperty(@androidx.annotation.RecentlyNonNull java.lang.String key) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public static java.lang.String getenv(@androidx.annotation.RecentlyNonNull java.lang.String name) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.Map<java.lang.String,java.lang.String> getenv() { throw new RuntimeException("Stub!"); }

public static void exit(int status) { throw new RuntimeException("Stub!"); }

public static void gc() { throw new RuntimeException("Stub!"); }

public static void runFinalization() { throw new RuntimeException("Stub!"); }

@Deprecated
public static void runFinalizersOnExit(boolean value) { throw new RuntimeException("Stub!"); }

public static void load(@androidx.annotation.RecentlyNonNull java.lang.String filename) { throw new RuntimeException("Stub!"); }

public static void loadLibrary(@androidx.annotation.RecentlyNonNull java.lang.String libname) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static native java.lang.String mapLibraryName(@androidx.annotation.RecentlyNonNull java.lang.String libname);

public static final java.io.PrintStream err;
static { err = null; }

public static final java.io.InputStream in;
static { in = null; }

public static final java.io.PrintStream out;
static { out = null; }
}

