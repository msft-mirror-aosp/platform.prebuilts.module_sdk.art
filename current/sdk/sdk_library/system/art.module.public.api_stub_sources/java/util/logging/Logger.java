/*
 * Copyright (c) 2000, 2014, Oracle and/or its affiliates. All rights reserved.
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



package java.util.logging;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class Logger {

protected Logger(@androidx.annotation.RecentlyNullable java.lang.String name, @androidx.annotation.RecentlyNullable java.lang.String resourceBundleName) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final java.util.logging.Logger getGlobal() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.logging.Logger getLogger(@androidx.annotation.RecentlyNonNull java.lang.String name) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.logging.Logger getLogger(@androidx.annotation.RecentlyNonNull java.lang.String name, @androidx.annotation.RecentlyNullable java.lang.String resourceBundleName) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.logging.Logger getAnonymousLogger() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.logging.Logger getAnonymousLogger(@androidx.annotation.RecentlyNullable java.lang.String resourceBundleName) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.util.ResourceBundle getResourceBundle() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.lang.String getResourceBundleName() { throw new RuntimeException("Stub!"); }

public void setFilter(@androidx.annotation.RecentlyNullable java.util.logging.Filter newFilter) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.util.logging.Filter getFilter() { throw new RuntimeException("Stub!"); }

public void log(@androidx.annotation.RecentlyNonNull java.util.logging.LogRecord record) { throw new RuntimeException("Stub!"); }

public void log(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNullable java.lang.String msg) { throw new RuntimeException("Stub!"); }

public void log(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNonNull java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }

public void log(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNullable java.lang.String msg, @androidx.annotation.RecentlyNullable java.lang.Object param1) { throw new RuntimeException("Stub!"); }

public void log(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNullable java.lang.String msg, @androidx.annotation.RecentlyNullable java.lang.Object[] params) { throw new RuntimeException("Stub!"); }

public void log(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNullable java.lang.String msg, @androidx.annotation.RecentlyNullable java.lang.Throwable thrown) { throw new RuntimeException("Stub!"); }

public void log(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNullable java.lang.Throwable thrown, @androidx.annotation.RecentlyNonNull java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }

public void logp(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod, @androidx.annotation.RecentlyNullable java.lang.String msg) { throw new RuntimeException("Stub!"); }

public void logp(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod, @androidx.annotation.RecentlyNonNull java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }

public void logp(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod, @androidx.annotation.RecentlyNullable java.lang.String msg, @androidx.annotation.RecentlyNullable java.lang.Object param1) { throw new RuntimeException("Stub!"); }

public void logp(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod, @androidx.annotation.RecentlyNullable java.lang.String msg, @androidx.annotation.RecentlyNullable java.lang.Object[] params) { throw new RuntimeException("Stub!"); }

public void logp(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod, @androidx.annotation.RecentlyNullable java.lang.String msg, @androidx.annotation.RecentlyNullable java.lang.Throwable thrown) { throw new RuntimeException("Stub!"); }

public void logp(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod, @androidx.annotation.RecentlyNullable java.lang.Throwable thrown, @androidx.annotation.RecentlyNonNull java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }

@Deprecated
public void logrb(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod, @androidx.annotation.RecentlyNullable java.lang.String bundleName, @androidx.annotation.RecentlyNullable java.lang.String msg) { throw new RuntimeException("Stub!"); }

@Deprecated
public void logrb(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod, @androidx.annotation.RecentlyNullable java.lang.String bundleName, @androidx.annotation.RecentlyNullable java.lang.String msg, @androidx.annotation.RecentlyNullable java.lang.Object param1) { throw new RuntimeException("Stub!"); }

@Deprecated
public void logrb(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod, @androidx.annotation.RecentlyNullable java.lang.String bundleName, @androidx.annotation.RecentlyNullable java.lang.String msg, @androidx.annotation.RecentlyNullable java.lang.Object[] params) { throw new RuntimeException("Stub!"); }

public void logrb(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod, @androidx.annotation.RecentlyNullable java.util.ResourceBundle bundle, @androidx.annotation.RecentlyNullable java.lang.String msg, @androidx.annotation.RecentlyNullable java.lang.Object... params) { throw new RuntimeException("Stub!"); }

@Deprecated
public void logrb(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod, @androidx.annotation.RecentlyNullable java.lang.String bundleName, @androidx.annotation.RecentlyNullable java.lang.String msg, @androidx.annotation.RecentlyNullable java.lang.Throwable thrown) { throw new RuntimeException("Stub!"); }

public void logrb(@androidx.annotation.RecentlyNonNull java.util.logging.Level level, @androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod, @androidx.annotation.RecentlyNullable java.util.ResourceBundle bundle, @androidx.annotation.RecentlyNullable java.lang.String msg, @androidx.annotation.RecentlyNullable java.lang.Throwable thrown) { throw new RuntimeException("Stub!"); }

public void entering(@androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod) { throw new RuntimeException("Stub!"); }

public void entering(@androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod, @androidx.annotation.RecentlyNullable java.lang.Object param1) { throw new RuntimeException("Stub!"); }

public void entering(@androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod, @androidx.annotation.RecentlyNullable java.lang.Object[] params) { throw new RuntimeException("Stub!"); }

public void exiting(@androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod) { throw new RuntimeException("Stub!"); }

public void exiting(@androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod, @androidx.annotation.RecentlyNullable java.lang.Object result) { throw new RuntimeException("Stub!"); }

public void throwing(@androidx.annotation.RecentlyNullable java.lang.String sourceClass, @androidx.annotation.RecentlyNullable java.lang.String sourceMethod, @androidx.annotation.RecentlyNullable java.lang.Throwable thrown) { throw new RuntimeException("Stub!"); }

public void severe(@androidx.annotation.RecentlyNullable java.lang.String msg) { throw new RuntimeException("Stub!"); }

public void warning(@androidx.annotation.RecentlyNullable java.lang.String msg) { throw new RuntimeException("Stub!"); }

public void info(@androidx.annotation.RecentlyNullable java.lang.String msg) { throw new RuntimeException("Stub!"); }

public void config(@androidx.annotation.RecentlyNullable java.lang.String msg) { throw new RuntimeException("Stub!"); }

public void fine(@androidx.annotation.RecentlyNullable java.lang.String msg) { throw new RuntimeException("Stub!"); }

public void finer(@androidx.annotation.RecentlyNullable java.lang.String msg) { throw new RuntimeException("Stub!"); }

public void finest(@androidx.annotation.RecentlyNullable java.lang.String msg) { throw new RuntimeException("Stub!"); }

public void severe(@androidx.annotation.RecentlyNonNull java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }

public void warning(@androidx.annotation.RecentlyNonNull java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }

public void info(@androidx.annotation.RecentlyNonNull java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }

public void config(@androidx.annotation.RecentlyNonNull java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }

public void fine(@androidx.annotation.RecentlyNonNull java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }

public void finer(@androidx.annotation.RecentlyNonNull java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }

public void finest(@androidx.annotation.RecentlyNonNull java.util.function.Supplier<java.lang.String> msgSupplier) { throw new RuntimeException("Stub!"); }

public void setLevel(@androidx.annotation.RecentlyNullable java.util.logging.Level newLevel) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.util.logging.Level getLevel() { throw new RuntimeException("Stub!"); }

public boolean isLoggable(@androidx.annotation.RecentlyNonNull java.util.logging.Level level) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.lang.String getName() { throw new RuntimeException("Stub!"); }

public void addHandler(@androidx.annotation.RecentlyNonNull java.util.logging.Handler handler) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }

public void removeHandler(@androidx.annotation.RecentlyNullable java.util.logging.Handler handler) throws java.lang.SecurityException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.logging.Handler[] getHandlers() { throw new RuntimeException("Stub!"); }

public void setUseParentHandlers(boolean useParentHandlers) { throw new RuntimeException("Stub!"); }

public boolean getUseParentHandlers() { throw new RuntimeException("Stub!"); }

public void setResourceBundle(@androidx.annotation.RecentlyNonNull java.util.ResourceBundle bundle) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.util.logging.Logger getParent() { throw new RuntimeException("Stub!"); }

public void setParent(@androidx.annotation.RecentlyNonNull java.util.logging.Logger parent) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull public static final java.lang.String GLOBAL_LOGGER_NAME = "global";

@Deprecated @androidx.annotation.RecentlyNonNull public static final java.util.logging.Logger global;
static { global = null; }
}

