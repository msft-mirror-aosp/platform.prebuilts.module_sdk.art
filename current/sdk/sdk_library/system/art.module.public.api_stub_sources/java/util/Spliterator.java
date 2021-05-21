/*
 * Copyright (c) 2013, Oracle and/or its affiliates. All rights reserved.
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

package java.util;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface Spliterator<T> {

public boolean tryAdvance(java.util.function.Consumer<? super T> action);

public default void forEachRemaining(java.util.function.Consumer<? super T> action) { throw new RuntimeException("Stub!"); }

public java.util.Spliterator<T> trySplit();

public long estimateSize();

public default long getExactSizeIfKnown() { throw new RuntimeException("Stub!"); }

public int characteristics();

public default boolean hasCharacteristics(int characteristics) { throw new RuntimeException("Stub!"); }

public default java.util.Comparator<? super T> getComparator() { throw new RuntimeException("Stub!"); }

public static final int CONCURRENT = 4096; // 0x1000

public static final int DISTINCT = 1; // 0x1

public static final int IMMUTABLE = 1024; // 0x400

public static final int NONNULL = 256; // 0x100

public static final int ORDERED = 16; // 0x10

public static final int SIZED = 64; // 0x40

public static final int SORTED = 4; // 0x4

public static final int SUBSIZED = 16384; // 0x4000
@SuppressWarnings({"unchecked", "deprecation", "all"})
public static interface OfDouble extends java.util.Spliterator.OfPrimitive<java.lang.Double,java.util.function.DoubleConsumer,java.util.Spliterator.OfDouble> {

public java.util.Spliterator.OfDouble trySplit();

public boolean tryAdvance(java.util.function.DoubleConsumer action);

public default void forEachRemaining(java.util.function.DoubleConsumer action) { throw new RuntimeException("Stub!"); }

public default boolean tryAdvance(java.util.function.Consumer<? super java.lang.Double> action) { throw new RuntimeException("Stub!"); }

public default void forEachRemaining(java.util.function.Consumer<? super java.lang.Double> action) { throw new RuntimeException("Stub!"); }
}

@SuppressWarnings({"unchecked", "deprecation", "all"})
public static interface OfInt extends java.util.Spliterator.OfPrimitive<java.lang.Integer,java.util.function.IntConsumer,java.util.Spliterator.OfInt> {

public java.util.Spliterator.OfInt trySplit();

public boolean tryAdvance(java.util.function.IntConsumer action);

public default void forEachRemaining(java.util.function.IntConsumer action) { throw new RuntimeException("Stub!"); }

public default boolean tryAdvance(java.util.function.Consumer<? super java.lang.Integer> action) { throw new RuntimeException("Stub!"); }

public default void forEachRemaining(java.util.function.Consumer<? super java.lang.Integer> action) { throw new RuntimeException("Stub!"); }
}

@SuppressWarnings({"unchecked", "deprecation", "all"})
public static interface OfLong extends java.util.Spliterator.OfPrimitive<java.lang.Long,java.util.function.LongConsumer,java.util.Spliterator.OfLong> {

public java.util.Spliterator.OfLong trySplit();

public boolean tryAdvance(java.util.function.LongConsumer action);

public default void forEachRemaining(java.util.function.LongConsumer action) { throw new RuntimeException("Stub!"); }

public default boolean tryAdvance(java.util.function.Consumer<? super java.lang.Long> action) { throw new RuntimeException("Stub!"); }

public default void forEachRemaining(java.util.function.Consumer<? super java.lang.Long> action) { throw new RuntimeException("Stub!"); }
}

@SuppressWarnings({"unchecked", "deprecation", "all"})
public static interface OfPrimitive<T, T_CONS, T_SPLITR extends java.util.Spliterator.OfPrimitive<T, T_CONS, T_SPLITR>> extends java.util.Spliterator<T> {

public T_SPLITR trySplit();

public boolean tryAdvance(T_CONS action);

public default void forEachRemaining(T_CONS action) { throw new RuntimeException("Stub!"); }
}

}

