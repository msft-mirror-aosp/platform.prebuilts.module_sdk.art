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


/**
 * A collection of methods for performing low-level, unsafe operations.
 * Although the class and all methods are public, use of this class is
 * limited because only trusted code can obtain instances of it.
 *
 * @author John R. Rose
 * @see #getUnsafe
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class Unsafe {

private Unsafe() { throw new RuntimeException("Stub!"); }

/**
 * Gets the unique instance of this class. This is only allowed in
 * very limited situations.
 */

public static sun.misc.Unsafe getUnsafe() { throw new RuntimeException("Stub!"); }

/**
 * Gets the raw byte offset from the start of an object's memory to
 * the memory used to store the indicated instance field.
 *
 * @param field non-{@code null}; the field in question, which must be an
 * instance field
 * @return the offset to the field
 */

public long objectFieldOffset(java.lang.reflect.Field field) { throw new RuntimeException("Stub!"); }

/**
 * Gets the offset from the start of an array object's memory to
 * the memory used to store its initial (zeroeth) element.
 *
 * @param clazz non-{@code null}; class in question; must be an array class
 * @return the offset to the initial element
 */

public int arrayBaseOffset(java.lang.Class clazz) { throw new RuntimeException("Stub!"); }

/**
 * Gets the size of each element of the given array class.
 *
 * @param clazz non-{@code null}; class in question; must be an array class
 * @return &gt; 0; the size of each element of the array
 */

public int arrayIndexScale(java.lang.Class clazz) { throw new RuntimeException("Stub!"); }

/**
 * Gets an {@code int} field from the given object.
 *
 * @param obj non-{@code null}; object containing int field
 * @param offset offset to the field within {@code obj}
 * @return the retrieved value
 */

@dalvik.annotation.optimization.FastNative
public native int getInt(java.lang.Object obj, long offset);

/**
 * Stores an {@code int} field into the given object.
 *
 * @param obj non-{@code null}; object containing int field
 * @param offset offset to the field within {@code obj}
 * @param newValue the value to store
 */

@dalvik.annotation.optimization.FastNative
public native void putInt(java.lang.Object obj, long offset, int newValue);

/**
 * Gets a {@code long} field from the given object.
 *
 * @param obj non-{@code null}; object containing the field
 * @param offset offset to the field within {@code obj}
 * @return the retrieved value
 */

@dalvik.annotation.optimization.FastNative
public native long getLong(java.lang.Object obj, long offset);

/**
 * Stores a {@code long} field into the given object.
 *
 * @param obj non-{@code null}; object containing the field
 * @param offset offset to the field within {@code obj}
 * @param newValue the value to store
 */

@dalvik.annotation.optimization.FastNative
public native void putLong(java.lang.Object obj, long offset, long newValue);

/**
 * Gets an {@code obj} field from the given object.
 *
 * @param obj non-{@code null}; object containing the field
 * @param offset offset to the field within {@code obj}
 * @return the retrieved value
 */

@dalvik.annotation.optimization.FastNative
public native java.lang.Object getObject(java.lang.Object obj, long offset);

/**
 * Stores an {@code obj} field into the given object.
 *
 * @param obj non-{@code null}; object containing the field
 * @param offset offset to the field within {@code obj}
 * @param newValue the value to store
 */

@dalvik.annotation.optimization.FastNative
public native void putObject(java.lang.Object obj, long offset, java.lang.Object newValue);

/**
 * Gets a {@code boolean} field from the given object.
 *
 * @param obj non-{@code null}; object containing boolean field
 * @param offset offset to the field within {@code obj}
 * @return the retrieved value
 */

@dalvik.annotation.optimization.FastNative
public native boolean getBoolean(java.lang.Object obj, long offset);

/**
 * Stores a {@code boolean} field into the given object.
 *
 * @param obj non-{@code null}; object containing boolean field
 * @param offset offset to the field within {@code obj}
 * @param newValue the value to store
 */

@dalvik.annotation.optimization.FastNative
public native void putBoolean(java.lang.Object obj, long offset, boolean newValue);

/**
 * Gets a {@code byte} field from the given object.
 *
 * @param obj non-{@code null}; object containing byte field
 * @param offset offset to the field within {@code obj}
 * @return the retrieved value
 */

@dalvik.annotation.optimization.FastNative
public native byte getByte(java.lang.Object obj, long offset);

/**
 * Stores a {@code byte} field into the given object.
 *
 * @param obj non-{@code null}; object containing byte field
 * @param offset offset to the field within {@code obj}
 * @param newValue the value to store
 */

@dalvik.annotation.optimization.FastNative
public native void putByte(java.lang.Object obj, long offset, byte newValue);

/**
 * Gets a {@code float} field from the given object.
 *
 * @param obj non-{@code null}; object containing float field
 * @param offset offset to the field within {@code obj}
 * @return the retrieved value
 */

@dalvik.annotation.optimization.FastNative
public native float getFloat(java.lang.Object obj, long offset);

/**
 * Stores a {@code float} field into the given object.
 *
 * @param obj non-{@code null}; object containing float field
 * @param offset offset to the field within {@code obj}
 * @param newValue the value to store
 */

@dalvik.annotation.optimization.FastNative
public native void putFloat(java.lang.Object obj, long offset, float newValue);

/**
 * Gets a {@code double} field from the given object.
 *
 * @param obj non-{@code null}; object containing double field
 * @param offset offset to the field within {@code obj}
 * @return the retrieved value
 */

@dalvik.annotation.optimization.FastNative
public native double getDouble(java.lang.Object obj, long offset);

/**
 * Stores a {@code double} field into the given object.
 *
 * @param obj non-{@code null}; object containing double field
 * @param offset offset to the field within {@code obj}
 * @param newValue the value to store
 */

@dalvik.annotation.optimization.FastNative
public native void putDouble(java.lang.Object obj, long offset, double newValue);

/**
 * Gets {@code byte} from given address in memory.
 *
 * @param address address in memory
 * @return {@code byte} value
 */

@dalvik.annotation.optimization.FastNative
public native byte getByte(long address);

/**
 * Stores a {@code byte} into the given memory address.
 *
 * @param address address in memory where to store the value
 * @param newValue the value to store
 */

@dalvik.annotation.optimization.FastNative
public native void putByte(long address, byte x);

/**
 * Gets {@code int} from given address in memory.
 *
 * @param address address in memory
 * @return {@code int} value
 */

@dalvik.annotation.optimization.FastNative
public native int getInt(long address);

/**
 * Stores a {@code int} into the given memory address.
 *
 * @param address address in memory where to store the value
 * @param newValue the value to store
 */

@dalvik.annotation.optimization.FastNative
public native void putInt(long address, int x);

/**
 * Gets {@code long} from given address in memory.
 *
 * @param address address in memory
 * @return {@code long} value
 */

@dalvik.annotation.optimization.FastNative
public native long getLong(long address);

/**
 * Stores a {@code long} into the given memory address.
 *
 * @param address address in memory where to store the value
 * @param newValue the value to store
 */

@dalvik.annotation.optimization.FastNative
public native void putLong(long address, long x);

/**
 * Gets {@code long} from given address in memory.
 *
 * @param address address in memory
 * @return {@code long} value
 */

@dalvik.annotation.optimization.FastNative
public native float getFloat(long address);

/**
 * Stores a {@code float} into the given memory address.
 *
 * @param address address in memory where to store the value
 * @param newValue the value to store
 */

@dalvik.annotation.optimization.FastNative
public native void putFloat(long address, float x);

/**
 * Gets {@code double} from given address in memory.
 *
 * @param address address in memory
 * @return {@code double} value
 */

@dalvik.annotation.optimization.FastNative
public native double getDouble(long address);

/**
 * Stores a {@code double} into the given memory address.
 *
 * @param address address in memory where to store the value
 * @param newValue the value to store
 */

@dalvik.annotation.optimization.FastNative
public native void putDouble(long address, double x);

/**
 * Sets all bytes in a given block of memory to a copy of another block.
 *
 * @param srcAddr address of the source memory to be copied from
 * @param dstAddr address of the destination memory to copy to
 * @param bytes number of bytes to copy
 */

@dalvik.annotation.optimization.FastNative
public native void copyMemory(long srcAddr, long dstAddr, long bytes);
}

