/*
 * Copyright (c) 2000, 2013, Oracle and/or its affiliates. All rights reserved.
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


package sun.misc;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class Unsafe {

private Unsafe() { throw new RuntimeException("Stub!"); }

public static sun.misc.Unsafe getUnsafe() { throw new RuntimeException("Stub!"); }

public long objectFieldOffset(java.lang.reflect.Field field) { throw new RuntimeException("Stub!"); }

public int arrayBaseOffset(java.lang.Class clazz) { throw new RuntimeException("Stub!"); }

public int arrayIndexScale(java.lang.Class clazz) { throw new RuntimeException("Stub!"); }

@dalvik.annotation.optimization.FastNative
public native int getInt(java.lang.Object obj, long offset);

@dalvik.annotation.optimization.FastNative
public native void putInt(java.lang.Object obj, long offset, int newValue);

@dalvik.annotation.optimization.FastNative
public native long getLong(java.lang.Object obj, long offset);

@dalvik.annotation.optimization.FastNative
public native void putLong(java.lang.Object obj, long offset, long newValue);

@dalvik.annotation.optimization.FastNative
public native java.lang.Object getObject(java.lang.Object obj, long offset);

@dalvik.annotation.optimization.FastNative
public native void putObject(java.lang.Object obj, long offset, java.lang.Object newValue);

@dalvik.annotation.optimization.FastNative
public native boolean getBoolean(java.lang.Object obj, long offset);

@dalvik.annotation.optimization.FastNative
public native void putBoolean(java.lang.Object obj, long offset, boolean newValue);

@dalvik.annotation.optimization.FastNative
public native byte getByte(java.lang.Object obj, long offset);

@dalvik.annotation.optimization.FastNative
public native void putByte(java.lang.Object obj, long offset, byte newValue);

@dalvik.annotation.optimization.FastNative
public native float getFloat(java.lang.Object obj, long offset);

@dalvik.annotation.optimization.FastNative
public native void putFloat(java.lang.Object obj, long offset, float newValue);

@dalvik.annotation.optimization.FastNative
public native double getDouble(java.lang.Object obj, long offset);

@dalvik.annotation.optimization.FastNative
public native void putDouble(java.lang.Object obj, long offset, double newValue);

@dalvik.annotation.optimization.FastNative
public native byte getByte(long address);

@dalvik.annotation.optimization.FastNative
public native void putByte(long address, byte x);

@dalvik.annotation.optimization.FastNative
public native int getInt(long address);

@dalvik.annotation.optimization.FastNative
public native void putInt(long address, int x);

@dalvik.annotation.optimization.FastNative
public native long getLong(long address);

@dalvik.annotation.optimization.FastNative
public native void putLong(long address, long x);

@dalvik.annotation.optimization.FastNative
public native float getFloat(long address);

@dalvik.annotation.optimization.FastNative
public native void putFloat(long address, float x);

@dalvik.annotation.optimization.FastNative
public native double getDouble(long address);

@dalvik.annotation.optimization.FastNative
public native void putDouble(long address, double x);

@dalvik.annotation.optimization.FastNative
public native void copyMemory(long srcAddr, long dstAddr, long bytes);
}

