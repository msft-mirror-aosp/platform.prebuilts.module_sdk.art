/*
 * Copyright (c) 1997, 2017, Oracle and/or its affiliates. All rights reserved.
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
public interface Map<K, V> {

public int size();

public boolean isEmpty();

public boolean containsKey(@androidx.annotation.RecentlyNullable java.lang.Object key);

public boolean containsValue(@androidx.annotation.RecentlyNullable java.lang.Object value);

@androidx.annotation.RecentlyNullable
public V get(@androidx.annotation.RecentlyNullable java.lang.Object key);

@androidx.annotation.RecentlyNullable
public V put(K key, V value);

@androidx.annotation.RecentlyNullable
public V remove(@androidx.annotation.RecentlyNullable java.lang.Object key);

public void putAll(@androidx.annotation.RecentlyNonNull java.util.Map<? extends K,? extends V> m);

public void clear();

@androidx.annotation.RecentlyNonNull
public java.util.Set<K> keySet();

@androidx.annotation.RecentlyNonNull
public java.util.Collection<V> values();

@androidx.annotation.RecentlyNonNull
public java.util.Set<java.util.Map.Entry<K,V>> entrySet();

public boolean equals(@androidx.annotation.RecentlyNullable java.lang.Object o);

public int hashCode();

@androidx.annotation.RecentlyNullable
public default V getOrDefault(@androidx.annotation.RecentlyNullable java.lang.Object key, @androidx.annotation.RecentlyNullable V defaultValue) { throw new RuntimeException("Stub!"); }

public default void forEach(@androidx.annotation.RecentlyNonNull java.util.function.BiConsumer<? super K,? super V> action) { throw new RuntimeException("Stub!"); }

public default void replaceAll(@androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super K,? super V,? extends V> function) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public default V putIfAbsent(K key, V value) { throw new RuntimeException("Stub!"); }

public default boolean remove(@androidx.annotation.RecentlyNullable java.lang.Object key, @androidx.annotation.RecentlyNullable java.lang.Object value) { throw new RuntimeException("Stub!"); }

public default boolean replace(K key, @androidx.annotation.RecentlyNullable V oldValue, V newValue) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public default V replace(K key, V value) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public default V computeIfAbsent(K key, @androidx.annotation.RecentlyNonNull java.util.function.Function<? super K,? extends V> mappingFunction) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public default V computeIfPresent(K key, @androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super K,? super V,? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public default V compute(K key, @androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super K,? super V,? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public default V merge(K key, @androidx.annotation.RecentlyNonNull V value, @androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super V,? super V,? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Map<K,V> of() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Map<K,V> of(@androidx.annotation.RecentlyNonNull K k1, @androidx.annotation.RecentlyNonNull V v1) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Map<K,V> of(@androidx.annotation.RecentlyNonNull K k1, @androidx.annotation.RecentlyNonNull V v1, @androidx.annotation.RecentlyNonNull K k2, @androidx.annotation.RecentlyNonNull V v2) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Map<K,V> of(@androidx.annotation.RecentlyNonNull K k1, @androidx.annotation.RecentlyNonNull V v1, @androidx.annotation.RecentlyNonNull K k2, @androidx.annotation.RecentlyNonNull V v2, @androidx.annotation.RecentlyNonNull K k3, @androidx.annotation.RecentlyNonNull V v3) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Map<K,V> of(@androidx.annotation.RecentlyNonNull K k1, @androidx.annotation.RecentlyNonNull V v1, @androidx.annotation.RecentlyNonNull K k2, @androidx.annotation.RecentlyNonNull V v2, @androidx.annotation.RecentlyNonNull K k3, @androidx.annotation.RecentlyNonNull V v3, @androidx.annotation.RecentlyNonNull K k4, @androidx.annotation.RecentlyNonNull V v4) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Map<K,V> of(@androidx.annotation.RecentlyNonNull K k1, @androidx.annotation.RecentlyNonNull V v1, @androidx.annotation.RecentlyNonNull K k2, @androidx.annotation.RecentlyNonNull V v2, @androidx.annotation.RecentlyNonNull K k3, @androidx.annotation.RecentlyNonNull V v3, @androidx.annotation.RecentlyNonNull K k4, @androidx.annotation.RecentlyNonNull V v4, @androidx.annotation.RecentlyNonNull K k5, @androidx.annotation.RecentlyNonNull V v5) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Map<K,V> of(@androidx.annotation.RecentlyNonNull K k1, @androidx.annotation.RecentlyNonNull V v1, @androidx.annotation.RecentlyNonNull K k2, @androidx.annotation.RecentlyNonNull V v2, @androidx.annotation.RecentlyNonNull K k3, @androidx.annotation.RecentlyNonNull V v3, @androidx.annotation.RecentlyNonNull K k4, @androidx.annotation.RecentlyNonNull V v4, @androidx.annotation.RecentlyNonNull K k5, @androidx.annotation.RecentlyNonNull V v5, @androidx.annotation.RecentlyNonNull K k6, @androidx.annotation.RecentlyNonNull V v6) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Map<K,V> of(@androidx.annotation.RecentlyNonNull K k1, @androidx.annotation.RecentlyNonNull V v1, @androidx.annotation.RecentlyNonNull K k2, @androidx.annotation.RecentlyNonNull V v2, @androidx.annotation.RecentlyNonNull K k3, @androidx.annotation.RecentlyNonNull V v3, @androidx.annotation.RecentlyNonNull K k4, @androidx.annotation.RecentlyNonNull V v4, @androidx.annotation.RecentlyNonNull K k5, @androidx.annotation.RecentlyNonNull V v5, @androidx.annotation.RecentlyNonNull K k6, @androidx.annotation.RecentlyNonNull V v6, @androidx.annotation.RecentlyNonNull K k7, @androidx.annotation.RecentlyNonNull V v7) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Map<K,V> of(@androidx.annotation.RecentlyNonNull K k1, @androidx.annotation.RecentlyNonNull V v1, @androidx.annotation.RecentlyNonNull K k2, @androidx.annotation.RecentlyNonNull V v2, @androidx.annotation.RecentlyNonNull K k3, @androidx.annotation.RecentlyNonNull V v3, @androidx.annotation.RecentlyNonNull K k4, @androidx.annotation.RecentlyNonNull V v4, @androidx.annotation.RecentlyNonNull K k5, @androidx.annotation.RecentlyNonNull V v5, @androidx.annotation.RecentlyNonNull K k6, @androidx.annotation.RecentlyNonNull V v6, @androidx.annotation.RecentlyNonNull K k7, @androidx.annotation.RecentlyNonNull V v7, @androidx.annotation.RecentlyNonNull K k8, @androidx.annotation.RecentlyNonNull V v8) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Map<K,V> of(@androidx.annotation.RecentlyNonNull K k1, @androidx.annotation.RecentlyNonNull V v1, @androidx.annotation.RecentlyNonNull K k2, @androidx.annotation.RecentlyNonNull V v2, @androidx.annotation.RecentlyNonNull K k3, @androidx.annotation.RecentlyNonNull V v3, @androidx.annotation.RecentlyNonNull K k4, @androidx.annotation.RecentlyNonNull V v4, @androidx.annotation.RecentlyNonNull K k5, @androidx.annotation.RecentlyNonNull V v5, @androidx.annotation.RecentlyNonNull K k6, @androidx.annotation.RecentlyNonNull V v6, @androidx.annotation.RecentlyNonNull K k7, @androidx.annotation.RecentlyNonNull V v7, @androidx.annotation.RecentlyNonNull K k8, @androidx.annotation.RecentlyNonNull V v8, @androidx.annotation.RecentlyNonNull K k9, @androidx.annotation.RecentlyNonNull V v9) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Map<K,V> of(@androidx.annotation.RecentlyNonNull K k1, @androidx.annotation.RecentlyNonNull V v1, @androidx.annotation.RecentlyNonNull K k2, @androidx.annotation.RecentlyNonNull V v2, @androidx.annotation.RecentlyNonNull K k3, @androidx.annotation.RecentlyNonNull V v3, @androidx.annotation.RecentlyNonNull K k4, @androidx.annotation.RecentlyNonNull V v4, @androidx.annotation.RecentlyNonNull K k5, @androidx.annotation.RecentlyNonNull V v5, @androidx.annotation.RecentlyNonNull K k6, @androidx.annotation.RecentlyNonNull V v6, @androidx.annotation.RecentlyNonNull K k7, @androidx.annotation.RecentlyNonNull V v7, @androidx.annotation.RecentlyNonNull K k8, @androidx.annotation.RecentlyNonNull V v8, @androidx.annotation.RecentlyNonNull K k9, @androidx.annotation.RecentlyNonNull V v9, @androidx.annotation.RecentlyNonNull K k10, @androidx.annotation.RecentlyNonNull V v10) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
@java.lang.SafeVarargs
public static <K, V> java.util.Map<K,V> ofEntries(@androidx.annotation.RecentlyNonNull java.util.Map.Entry<? extends K,? extends V>... entries) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Map.Entry<K,V> entry(@androidx.annotation.RecentlyNonNull K k, @androidx.annotation.RecentlyNonNull V v) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Map<K,V> copyOf(@androidx.annotation.RecentlyNonNull java.util.Map<? extends K,? extends V> map) { throw new RuntimeException("Stub!"); }
@SuppressWarnings({"unchecked", "deprecation", "all"})
public static interface Entry<K, V> {

public K getKey();

public V getValue();

public V setValue(V value);

public boolean equals(@androidx.annotation.RecentlyNullable java.lang.Object o);

public int hashCode();

@androidx.annotation.RecentlyNonNull
public static <K extends java.lang.Comparable<? super K>, V> java.util.Comparator<java.util.Map.Entry<K,V>> comparingByKey() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V extends java.lang.Comparable<? super V>> java.util.Comparator<java.util.Map.Entry<K,V>> comparingByValue() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Comparator<java.util.Map.Entry<K,V>> comparingByKey(@androidx.annotation.RecentlyNonNull java.util.Comparator<? super K> cmp) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K, V> java.util.Comparator<java.util.Map.Entry<K,V>> comparingByValue(@androidx.annotation.RecentlyNonNull java.util.Comparator<? super V> cmp) { throw new RuntimeException("Stub!"); }
}

}

