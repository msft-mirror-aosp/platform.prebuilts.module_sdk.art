/*
 * Copyright (C) 2014 The Android Open Source Project
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

// -- This file was mechanically generated: Do not edit! -- //


package java.nio;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public abstract class ByteBuffer extends java.nio.Buffer implements java.lang.Comparable<java.nio.ByteBuffer> {

ByteBuffer() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.nio.ByteBuffer allocateDirect(int capacity) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.nio.ByteBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.nio.ByteBuffer wrap(@androidx.annotation.RecentlyNonNull byte[] array, int offset, int length) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.nio.ByteBuffer wrap(@androidx.annotation.RecentlyNonNull byte[] array) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer slice();

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer duplicate();

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer asReadOnlyBuffer();

public abstract byte get();

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer put(byte b);

public abstract byte get(int index);

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer put(int index, byte b);

@androidx.annotation.RecentlyNonNull
public java.nio.ByteBuffer get(@androidx.annotation.RecentlyNonNull byte[] dst, int offset, int length) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.nio.ByteBuffer get(@androidx.annotation.RecentlyNonNull byte[] dst) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.nio.ByteBuffer put(@androidx.annotation.RecentlyNonNull java.nio.ByteBuffer src) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.nio.ByteBuffer put(@androidx.annotation.RecentlyNonNull byte[] src, int offset, int length) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public final java.nio.ByteBuffer put(@androidx.annotation.RecentlyNonNull byte[] src) { throw new RuntimeException("Stub!"); }

public final boolean hasArray() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public final byte[] array() { throw new RuntimeException("Stub!"); }

public final int arrayOffset() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
@dalvik.annotation.codegen.CovariantReturnType(returnType=ByteBuffer.class, presentAfter=28)
public java.nio.Buffer position(int newPosition) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
@dalvik.annotation.codegen.CovariantReturnType(returnType=ByteBuffer.class, presentAfter=28)
public java.nio.Buffer limit(int newLimit) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
@dalvik.annotation.codegen.CovariantReturnType(returnType=ByteBuffer.class, presentAfter=28)
public java.nio.Buffer mark() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
@dalvik.annotation.codegen.CovariantReturnType(returnType=ByteBuffer.class, presentAfter=28)
public java.nio.Buffer reset() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
@dalvik.annotation.codegen.CovariantReturnType(returnType=ByteBuffer.class, presentAfter=28)
public java.nio.Buffer clear() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
@dalvik.annotation.codegen.CovariantReturnType(returnType=ByteBuffer.class, presentAfter=28)
public java.nio.Buffer flip() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
@dalvik.annotation.codegen.CovariantReturnType(returnType=ByteBuffer.class, presentAfter=28)
public java.nio.Buffer rewind() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer compact();

public abstract boolean isDirect();

@androidx.annotation.RecentlyNonNull
public java.lang.String toString() { throw new RuntimeException("Stub!"); }

public int hashCode() { throw new RuntimeException("Stub!"); }

public boolean equals(@androidx.annotation.RecentlyNullable java.lang.Object ob) { throw new RuntimeException("Stub!"); }

public int compareTo(@androidx.annotation.RecentlyNonNull java.nio.ByteBuffer that) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public final java.nio.ByteOrder order() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public final java.nio.ByteBuffer order(@androidx.annotation.RecentlyNonNull java.nio.ByteOrder bo) { throw new RuntimeException("Stub!"); }

public abstract char getChar();

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer putChar(char value);

public abstract char getChar(int index);

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer putChar(int index, char value);

@androidx.annotation.RecentlyNonNull
public abstract java.nio.CharBuffer asCharBuffer();

public abstract short getShort();

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer putShort(short value);

public abstract short getShort(int index);

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer putShort(int index, short value);

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ShortBuffer asShortBuffer();

public abstract int getInt();

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer putInt(int value);

public abstract int getInt(int index);

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer putInt(int index, int value);

@androidx.annotation.RecentlyNonNull
public abstract java.nio.IntBuffer asIntBuffer();

public abstract long getLong();

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer putLong(long value);

public abstract long getLong(int index);

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer putLong(int index, long value);

@androidx.annotation.RecentlyNonNull
public abstract java.nio.LongBuffer asLongBuffer();

public abstract float getFloat();

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer putFloat(float value);

public abstract float getFloat(int index);

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer putFloat(int index, float value);

@androidx.annotation.RecentlyNonNull
public abstract java.nio.FloatBuffer asFloatBuffer();

public abstract double getDouble();

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer putDouble(double value);

public abstract double getDouble(int index);

@androidx.annotation.RecentlyNonNull
public abstract java.nio.ByteBuffer putDouble(int index, double value);

@androidx.annotation.RecentlyNonNull
public abstract java.nio.DoubleBuffer asDoubleBuffer();

public void setAccessible(boolean value) { throw new RuntimeException("Stub!"); }
}

