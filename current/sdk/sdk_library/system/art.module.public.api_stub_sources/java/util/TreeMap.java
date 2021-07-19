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
public class TreeMap<K, V> extends java.util.AbstractMap<K,V> implements java.util.NavigableMap<K,V>, java.lang.Cloneable, java.io.Serializable {

public TreeMap() { throw new RuntimeException("Stub!"); }

public TreeMap(@androidx.annotation.RecentlyNullable java.util.Comparator<? super K> comparator) { throw new RuntimeException("Stub!"); }

public TreeMap(@androidx.annotation.RecentlyNonNull java.util.Map<? extends K,? extends V> m) { throw new RuntimeException("Stub!"); }

public TreeMap(@androidx.annotation.RecentlyNonNull java.util.SortedMap<K,? extends V> m) { throw new RuntimeException("Stub!"); }

public int size() { throw new RuntimeException("Stub!"); }

public boolean containsKey(@androidx.annotation.RecentlyNullable java.lang.Object key) { throw new RuntimeException("Stub!"); }

public boolean containsValue(@androidx.annotation.RecentlyNullable java.lang.Object value) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public V get(@androidx.annotation.RecentlyNullable java.lang.Object key) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.util.Comparator<? super K> comparator() { throw new RuntimeException("Stub!"); }

public K firstKey() { throw new RuntimeException("Stub!"); }

public K lastKey() { throw new RuntimeException("Stub!"); }

public void putAll(@androidx.annotation.RecentlyNonNull java.util.Map<? extends K,? extends V> map) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public V put(K key, V value) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public V remove(@androidx.annotation.RecentlyNullable java.lang.Object key) { throw new RuntimeException("Stub!"); }

public void clear() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.Object clone() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.util.Map.Entry<K,V> firstEntry() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.util.Map.Entry<K,V> lastEntry() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.util.Map.Entry<K,V> pollFirstEntry() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.util.Map.Entry<K,V> pollLastEntry() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.util.Map.Entry<K,V> lowerEntry(K key) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public K lowerKey(K key) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.util.Map.Entry<K,V> floorEntry(K key) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public K floorKey(K key) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.util.Map.Entry<K,V> ceilingEntry(K key) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public K ceilingKey(K key) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.util.Map.Entry<K,V> higherEntry(K key) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public K higherKey(K key) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Set<K> keySet() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.NavigableSet<K> navigableKeySet() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.NavigableSet<K> descendingKeySet() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Collection<V> values() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Set<java.util.Map.Entry<K,V>> entrySet() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.NavigableMap<K,V> descendingMap() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.NavigableMap<K,V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.NavigableMap<K,V> headMap(K toKey, boolean inclusive) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.NavigableMap<K,V> tailMap(K fromKey, boolean inclusive) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.SortedMap<K,V> subMap(K fromKey, K toKey) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.SortedMap<K,V> headMap(K toKey) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.SortedMap<K,V> tailMap(K fromKey) { throw new RuntimeException("Stub!"); }

public boolean replace(K key, @androidx.annotation.RecentlyNullable V oldValue, V newValue) { throw new RuntimeException("Stub!"); }

public V replace(K key, V value) { throw new RuntimeException("Stub!"); }

public void forEach(@androidx.annotation.RecentlyNonNull java.util.function.BiConsumer<? super K,? super V> action) { throw new RuntimeException("Stub!"); }

public void replaceAll(@androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super K,? super V,? extends V> function) { throw new RuntimeException("Stub!"); }
}

