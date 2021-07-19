/*
 * Copyright (C) 2014 The Android Open Source Project
 * Copyright (c) 1997, 2014, Oracle and/or its affiliates. All rights reserved.
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
public class Collections {

private Collections() { throw new RuntimeException("Stub!"); }

public static <T extends java.lang.Comparable<? super T>> void sort(@androidx.annotation.RecentlyNonNull java.util.List<T> list) { throw new RuntimeException("Stub!"); }

public static <T> void sort(@androidx.annotation.RecentlyNonNull java.util.List<T> list, @androidx.annotation.RecentlyNullable java.util.Comparator<? super T> c) { throw new RuntimeException("Stub!"); }

public static <T> int binarySearch(@androidx.annotation.RecentlyNonNull java.util.List<? extends java.lang.Comparable<? super T>> list, @androidx.annotation.RecentlyNonNull T key) { throw new RuntimeException("Stub!"); }

public static <T> int binarySearch(@androidx.annotation.RecentlyNonNull java.util.List<? extends T> list, T key, @androidx.annotation.RecentlyNullable java.util.Comparator<? super T> c) { throw new RuntimeException("Stub!"); }

public static void reverse(@androidx.annotation.RecentlyNonNull java.util.List<?> list) { throw new RuntimeException("Stub!"); }

public static void shuffle(@androidx.annotation.RecentlyNonNull java.util.List<?> list) { throw new RuntimeException("Stub!"); }

public static void shuffle(@androidx.annotation.RecentlyNonNull java.util.List<?> list, @androidx.annotation.RecentlyNonNull java.util.Random rnd) { throw new RuntimeException("Stub!"); }

public static void swap(@androidx.annotation.RecentlyNonNull java.util.List<?> list, int i, int j) { throw new RuntimeException("Stub!"); }

public static <T> void fill(@androidx.annotation.RecentlyNonNull java.util.List<? super T> list, T obj) { throw new RuntimeException("Stub!"); }

public static <T> void copy(@androidx.annotation.RecentlyNonNull java.util.List<? super T> dest, @androidx.annotation.RecentlyNonNull java.util.List<? extends T> src) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T extends java.lang.Object & java.lang.Comparable<? super T>> T min(@androidx.annotation.RecentlyNonNull java.util.Collection<? extends T> coll) { throw new RuntimeException("Stub!"); }

public static <T> T min(@androidx.annotation.RecentlyNonNull java.util.Collection<? extends T> coll, @androidx.annotation.RecentlyNullable java.util.Comparator<? super T> comp) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T extends java.lang.Object & java.lang.Comparable<? super T>> T max(@androidx.annotation.RecentlyNonNull java.util.Collection<? extends T> coll) { throw new RuntimeException("Stub!"); }

public static <T> T max(@androidx.annotation.RecentlyNonNull java.util.Collection<? extends T> coll, @androidx.annotation.RecentlyNullable java.util.Comparator<? super T> comp) { throw new RuntimeException("Stub!"); }

public static void rotate(@androidx.annotation.RecentlyNonNull java.util.List<?> list, int distance) { throw new RuntimeException("Stub!"); }

public static <T> boolean replaceAll(@androidx.annotation.RecentlyNonNull java.util.List<T> list, T oldVal, T newVal) { throw new RuntimeException("Stub!"); }

public static int indexOfSubList(@androidx.annotation.RecentlyNonNull java.util.List<?> source, @androidx.annotation.RecentlyNonNull java.util.List<?> target) { throw new RuntimeException("Stub!"); }

public static int lastIndexOfSubList(@androidx.annotation.RecentlyNonNull java.util.List<?> source, @androidx.annotation.RecentlyNonNull java.util.List<?> target) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.Collection<T> unmodifiableCollection(@androidx.annotation.RecentlyNonNull java.util.Collection<? extends T> c) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.Set<T> unmodifiableSet(@androidx.annotation.RecentlyNonNull java.util.Set<? extends T> s) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.SortedSet<T> unmodifiableSortedSet(@androidx.annotation.RecentlyNonNull java.util.SortedSet<T> s) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.NavigableSet<T> unmodifiableNavigableSet(@androidx.annotation.RecentlyNonNull java.util.NavigableSet<T> s) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.List<T> unmodifiableList(@androidx.annotation.RecentlyNonNull java.util.List<? extends T> list) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Map<K,V> unmodifiableMap(@androidx.annotation.RecentlyNonNull java.util.Map<? extends K,? extends V> m) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.SortedMap<K,V> unmodifiableSortedMap(@androidx.annotation.RecentlyNonNull java.util.SortedMap<K,? extends V> m) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.NavigableMap<K,V> unmodifiableNavigableMap(@androidx.annotation.RecentlyNonNull java.util.NavigableMap<K,? extends V> m) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.Collection<T> synchronizedCollection(@androidx.annotation.RecentlyNonNull java.util.Collection<T> c) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.Set<T> synchronizedSet(@androidx.annotation.RecentlyNonNull java.util.Set<T> s) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.SortedSet<T> synchronizedSortedSet(@androidx.annotation.RecentlyNonNull java.util.SortedSet<T> s) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.NavigableSet<T> synchronizedNavigableSet(@androidx.annotation.RecentlyNonNull java.util.NavigableSet<T> s) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.List<T> synchronizedList(@androidx.annotation.RecentlyNonNull java.util.List<T> list) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Map<K,V> synchronizedMap(@androidx.annotation.RecentlyNonNull java.util.Map<K,V> m) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.SortedMap<K,V> synchronizedSortedMap(@androidx.annotation.RecentlyNonNull java.util.SortedMap<K,V> m) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.NavigableMap<K,V> synchronizedNavigableMap(@androidx.annotation.RecentlyNonNull java.util.NavigableMap<K,V> m) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.Collection<E> checkedCollection(@androidx.annotation.RecentlyNonNull java.util.Collection<E> c, @androidx.annotation.RecentlyNonNull java.lang.Class<E> type) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.Queue<E> checkedQueue(@androidx.annotation.RecentlyNonNull java.util.Queue<E> queue, @androidx.annotation.RecentlyNonNull java.lang.Class<E> type) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.Set<E> checkedSet(@androidx.annotation.RecentlyNonNull java.util.Set<E> s, @androidx.annotation.RecentlyNonNull java.lang.Class<E> type) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.SortedSet<E> checkedSortedSet(@androidx.annotation.RecentlyNonNull java.util.SortedSet<E> s, @androidx.annotation.RecentlyNonNull java.lang.Class<E> type) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.NavigableSet<E> checkedNavigableSet(@androidx.annotation.RecentlyNonNull java.util.NavigableSet<E> s, @androidx.annotation.RecentlyNonNull java.lang.Class<E> type) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.List<E> checkedList(@androidx.annotation.RecentlyNonNull java.util.List<E> list, @androidx.annotation.RecentlyNonNull java.lang.Class<E> type) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Map<K,V> checkedMap(@androidx.annotation.RecentlyNonNull java.util.Map<K,V> m, @androidx.annotation.RecentlyNonNull java.lang.Class<K> keyType, @androidx.annotation.RecentlyNonNull java.lang.Class<V> valueType) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.SortedMap<K,V> checkedSortedMap(@androidx.annotation.RecentlyNonNull java.util.SortedMap<K,V> m, @androidx.annotation.RecentlyNonNull java.lang.Class<K> keyType, @androidx.annotation.RecentlyNonNull java.lang.Class<V> valueType) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.NavigableMap<K,V> checkedNavigableMap(@androidx.annotation.RecentlyNonNull java.util.NavigableMap<K,V> m, @androidx.annotation.RecentlyNonNull java.lang.Class<K> keyType, @androidx.annotation.RecentlyNonNull java.lang.Class<V> valueType) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.Iterator<T> emptyIterator() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.ListIterator<T> emptyListIterator() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.Enumeration<T> emptyEnumeration() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final <T> java.util.Set<T> emptySet() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.SortedSet<E> emptySortedSet() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.NavigableSet<E> emptyNavigableSet() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final <T> java.util.List<T> emptyList() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final <K, V> java.util.Map<K,V> emptyMap() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final <K, V> java.util.SortedMap<K,V> emptySortedMap() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final <K, V> java.util.NavigableMap<K,V> emptyNavigableMap() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.Set<T> singleton(T o) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.List<T> singletonList(T o) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Map<K,V> singletonMap(K key, V value) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.List<T> nCopies(int n, T o) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.Comparator<T> reverseOrder() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.Comparator<T> reverseOrder(@androidx.annotation.RecentlyNullable java.util.Comparator<T> cmp) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.Enumeration<T> enumeration(@androidx.annotation.RecentlyNonNull java.util.Collection<T> c) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.ArrayList<T> list(@androidx.annotation.RecentlyNonNull java.util.Enumeration<T> e) { throw new RuntimeException("Stub!"); }

public static int frequency(@androidx.annotation.RecentlyNonNull java.util.Collection<?> c, @androidx.annotation.RecentlyNullable java.lang.Object o) { throw new RuntimeException("Stub!"); }

public static boolean disjoint(@androidx.annotation.RecentlyNonNull java.util.Collection<?> c1, @androidx.annotation.RecentlyNonNull java.util.Collection<?> c2) { throw new RuntimeException("Stub!"); }

@java.lang.SafeVarargs
public static <T> boolean addAll(@androidx.annotation.RecentlyNonNull java.util.Collection<? super T> c, @androidx.annotation.RecentlyNonNull T... elements) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <E> java.util.Set<E> newSetFromMap(@androidx.annotation.RecentlyNonNull java.util.Map<E,java.lang.Boolean> map) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <T> java.util.Queue<T> asLifoQueue(@androidx.annotation.RecentlyNonNull java.util.Deque<T> deque) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull public static final java.util.List EMPTY_LIST;
static { EMPTY_LIST = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Map EMPTY_MAP;
static { EMPTY_MAP = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Set EMPTY_SET;
static { EMPTY_SET = null; }
}

