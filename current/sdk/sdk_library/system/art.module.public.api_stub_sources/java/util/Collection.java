/*
 * Copyright (c) 1997, 2013, Oracle and/or its affiliates. All rights reserved.
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
public interface Collection<E> extends java.lang.Iterable<E> {

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

public boolean removeAll(@androidx.annotation.RecentlyNonNull java.util.Collection<?> c);

public default boolean removeIf(@androidx.annotation.RecentlyNonNull java.util.function.Predicate<? super E> filter) { throw new RuntimeException("Stub!"); }

public boolean retainAll(@androidx.annotation.RecentlyNonNull java.util.Collection<?> c);

public void clear();

public boolean equals(@androidx.annotation.RecentlyNullable java.lang.Object o);

public int hashCode();

@androidx.annotation.RecentlyNonNull
public default java.util.Spliterator<E> spliterator() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public default java.util.stream.Stream<E> stream() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public default java.util.stream.Stream<E> parallelStream() { throw new RuntimeException("Stub!"); }
}

