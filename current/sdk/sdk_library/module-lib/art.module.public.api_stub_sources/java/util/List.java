/*
 * Copyright (c) 1997, 2018, Oracle and/or its affiliates. All rights reserved.
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
public interface List<E> extends java.util.Collection<E> {

public int size();

public boolean isEmpty();

public boolean contains(@androidx.annotation.RecentlyNullable java.lang.Object o);

@androidx.annotation.RecentlyNonNull
public java.util.Iterator<E> iterator();

@androidx.annotation.RecentlyNonNull
public java.lang.Object[] toArray();

@androidx.annotation.RecentlyNonNull
public <T> T[] toArray(@androidx.annotation.RecentlyNonNull T[] a);

public boolean add(E e);

public boolean remove(@androidx.annotation.RecentlyNullable java.lang.Object o);

public boolean containsAll(@androidx.annotation.RecentlyNonNull java.util.Collection<?> c);

public boolean addAll(@androidx.annotation.RecentlyNonNull java.util.Collection<? extends E> c);

public boolean addAll(int index, @androidx.annotation.RecentlyNonNull java.util.Collection<? extends E> c);

public boolean removeAll(@androidx.annotation.RecentlyNonNull java.util.Collection<?> c);

public boolean retainAll(@androidx.annotation.RecentlyNonNull java.util.Collection<?> c);

public default void replaceAll(@androidx.annotation.RecentlyNonNull java.util.function.UnaryOperator<E> operator) { throw new RuntimeException("Stub!"); }

public default void sort(@androidx.annotation.RecentlyNullable java.util.Comparator<? super E> c) { throw new RuntimeException("Stub!"); }

public void clear();

public boolean equals(@androidx.annotation.RecentlyNullable java.lang.Object o);

public int hashCode();

public E get(int index);

public E set(int index, E element);

public void add(int index, E element);

public E remove(int index);

public int indexOf(@androidx.annotation.RecentlyNullable java.lang.Object o);

public int lastIndexOf(@androidx.annotation.RecentlyNullable java.lang.Object o);

@androidx.annotation.RecentlyNonNull
public java.util.ListIterator<E> listIterator();

@androidx.annotation.RecentlyNonNull
public java.util.ListIterator<E> listIterator(int index);

@androidx.annotation.RecentlyNonNull
public java.util.List<E> subList(int fromIndex, int toIndex);

@androidx.annotation.RecentlyNonNull
public default java.util.Spliterator<E> spliterator() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.List<E> of() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.List<E> of(@androidx.annotation.RecentlyNonNull E e1) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.List<E> of(@androidx.annotation.RecentlyNonNull E e1, @androidx.annotation.RecentlyNonNull E e2) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.List<E> of(@androidx.annotation.RecentlyNonNull E e1, @androidx.annotation.RecentlyNonNull E e2, @androidx.annotation.RecentlyNonNull E e3) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.List<E> of(@androidx.annotation.RecentlyNonNull E e1, @androidx.annotation.RecentlyNonNull E e2, @androidx.annotation.RecentlyNonNull E e3, @androidx.annotation.RecentlyNonNull E e4) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.List<E> of(@androidx.annotation.RecentlyNonNull E e1, @androidx.annotation.RecentlyNonNull E e2, @androidx.annotation.RecentlyNonNull E e3, @androidx.annotation.RecentlyNonNull E e4, @androidx.annotation.RecentlyNonNull E e5) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.List<E> of(@androidx.annotation.RecentlyNonNull E e1, @androidx.annotation.RecentlyNonNull E e2, @androidx.annotation.RecentlyNonNull E e3, @androidx.annotation.RecentlyNonNull E e4, @androidx.annotation.RecentlyNonNull E e5, @androidx.annotation.RecentlyNonNull E e6) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.List<E> of(@androidx.annotation.RecentlyNonNull E e1, @androidx.annotation.RecentlyNonNull E e2, @androidx.annotation.RecentlyNonNull E e3, @androidx.annotation.RecentlyNonNull E e4, @androidx.annotation.RecentlyNonNull E e5, @androidx.annotation.RecentlyNonNull E e6, @androidx.annotation.RecentlyNonNull E e7) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.List<E> of(@androidx.annotation.RecentlyNonNull E e1, @androidx.annotation.RecentlyNonNull E e2, @androidx.annotation.RecentlyNonNull E e3, @androidx.annotation.RecentlyNonNull E e4, @androidx.annotation.RecentlyNonNull E e5, @androidx.annotation.RecentlyNonNull E e6, @androidx.annotation.RecentlyNonNull E e7, @androidx.annotation.RecentlyNonNull E e8) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.List<E> of(@androidx.annotation.RecentlyNonNull E e1, @androidx.annotation.RecentlyNonNull E e2, @androidx.annotation.RecentlyNonNull E e3, @androidx.annotation.RecentlyNonNull E e4, @androidx.annotation.RecentlyNonNull E e5, @androidx.annotation.RecentlyNonNull E e6, @androidx.annotation.RecentlyNonNull E e7, @androidx.annotation.RecentlyNonNull E e8, @androidx.annotation.RecentlyNonNull E e9) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.List<E> of(@androidx.annotation.RecentlyNonNull E e1, @androidx.annotation.RecentlyNonNull E e2, @androidx.annotation.RecentlyNonNull E e3, @androidx.annotation.RecentlyNonNull E e4, @androidx.annotation.RecentlyNonNull E e5, @androidx.annotation.RecentlyNonNull E e6, @androidx.annotation.RecentlyNonNull E e7, @androidx.annotation.RecentlyNonNull E e8, @androidx.annotation.RecentlyNonNull E e9, @androidx.annotation.RecentlyNonNull E e10) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
@java.lang.SafeVarargs
public static <E> java.util.List<E> of(@androidx.annotation.RecentlyNonNull E... elements) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.List<E> copyOf(@androidx.annotation.RecentlyNonNull java.util.Collection<? extends E> coll) { throw new RuntimeException("Stub!"); }
}

