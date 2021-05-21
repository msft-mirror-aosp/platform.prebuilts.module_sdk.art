/*
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

/*
 * This file is available under and governed by the GNU General Public
 * License version 2 only, as published by the Free Software Foundation.
 * However, the following notice accompanied the original version of this
 * file:
 *
 * Written by Doug Lea with assistance from members of JCP JSR-166
 * Expert Group and released to the public domain, as explained at
 * http://creativecommons.org/publicdomain/zero/1.0/
 */


package java.util.concurrent;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class ConcurrentHashMap<K, V> extends java.util.AbstractMap<K,V> implements java.util.concurrent.ConcurrentMap<K,V>, java.io.Serializable {

public ConcurrentHashMap() { throw new RuntimeException("Stub!"); }

public ConcurrentHashMap(int initialCapacity) { throw new RuntimeException("Stub!"); }

public ConcurrentHashMap(@androidx.annotation.RecentlyNonNull java.util.Map<? extends K,? extends V> m) { throw new RuntimeException("Stub!"); }

public ConcurrentHashMap(int initialCapacity, float loadFactor) { throw new RuntimeException("Stub!"); }

public ConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel) { throw new RuntimeException("Stub!"); }

public int size() { throw new RuntimeException("Stub!"); }

public boolean isEmpty() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public V get(@androidx.annotation.RecentlyNonNull java.lang.Object key) { throw new RuntimeException("Stub!"); }

public boolean containsKey(@androidx.annotation.RecentlyNonNull java.lang.Object key) { throw new RuntimeException("Stub!"); }

public boolean containsValue(@androidx.annotation.RecentlyNonNull java.lang.Object value) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public V put(@androidx.annotation.RecentlyNonNull K key, @androidx.annotation.RecentlyNonNull V value) { throw new RuntimeException("Stub!"); }

public void putAll(@androidx.annotation.RecentlyNonNull java.util.Map<? extends K,? extends V> m) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public V remove(@androidx.annotation.RecentlyNonNull java.lang.Object key) { throw new RuntimeException("Stub!"); }

public void clear() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Set<K> keySet() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Collection<V> values() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Set<java.util.Map.Entry<K,V>> entrySet() { throw new RuntimeException("Stub!"); }

public int hashCode() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String toString() { throw new RuntimeException("Stub!"); }

public boolean equals(@androidx.annotation.RecentlyNullable java.lang.Object o) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public V putIfAbsent(@androidx.annotation.RecentlyNonNull K key, @androidx.annotation.RecentlyNonNull V value) { throw new RuntimeException("Stub!"); }

public boolean remove(@androidx.annotation.RecentlyNonNull java.lang.Object key, @androidx.annotation.RecentlyNullable java.lang.Object value) { throw new RuntimeException("Stub!"); }

public boolean replace(@androidx.annotation.RecentlyNonNull K key, @androidx.annotation.RecentlyNonNull V oldValue, @androidx.annotation.RecentlyNonNull V newValue) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public V replace(@androidx.annotation.RecentlyNonNull K key, @androidx.annotation.RecentlyNonNull V value) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public V getOrDefault(@androidx.annotation.RecentlyNonNull java.lang.Object key, @androidx.annotation.RecentlyNullable V defaultValue) { throw new RuntimeException("Stub!"); }

public void forEach(@androidx.annotation.RecentlyNonNull java.util.function.BiConsumer<? super K,? super V> action) { throw new RuntimeException("Stub!"); }

public void replaceAll(@androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super K,? super V,? extends V> function) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public V computeIfAbsent(@androidx.annotation.RecentlyNonNull K key, @androidx.annotation.RecentlyNonNull java.util.function.Function<? super K,? extends V> mappingFunction) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public V computeIfPresent(@androidx.annotation.RecentlyNonNull K key, @androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super K,? super V,? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public V compute(@androidx.annotation.RecentlyNonNull K key, @androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super K,? super V,? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public V merge(@androidx.annotation.RecentlyNonNull K key, @androidx.annotation.RecentlyNonNull V value, @androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super V,? super V,? extends V> remappingFunction) { throw new RuntimeException("Stub!"); }

public boolean contains(@androidx.annotation.RecentlyNonNull java.lang.Object value) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Enumeration<K> keys() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Enumeration<V> elements() { throw new RuntimeException("Stub!"); }

public long mappingCount() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K> java.util.concurrent.ConcurrentHashMap.KeySetView<K,java.lang.Boolean> newKeySet() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static <K> java.util.concurrent.ConcurrentHashMap.KeySetView<K,java.lang.Boolean> newKeySet(int initialCapacity) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.concurrent.ConcurrentHashMap.KeySetView<K,V> keySet(@androidx.annotation.RecentlyNonNull V mappedValue) { throw new RuntimeException("Stub!"); }

public void forEach(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.BiConsumer<? super K,? super V> action) { throw new RuntimeException("Stub!"); }

public <U> void forEach(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super K,? super V,? extends U> transformer, @androidx.annotation.RecentlyNonNull java.util.function.Consumer<? super U> action) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public <U> U search(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super K,? super V,? extends U> searchFunction) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public <U> U reduce(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super K,? super V,? extends U> transformer, @androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super U,? super U,? extends U> reducer) { throw new RuntimeException("Stub!"); }

public double reduceToDouble(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.ToDoubleBiFunction<? super K,? super V> transformer, double basis, @androidx.annotation.RecentlyNonNull java.util.function.DoubleBinaryOperator reducer) { throw new RuntimeException("Stub!"); }

public long reduceToLong(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.ToLongBiFunction<? super K,? super V> transformer, long basis, @androidx.annotation.RecentlyNonNull java.util.function.LongBinaryOperator reducer) { throw new RuntimeException("Stub!"); }

public int reduceToInt(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.ToIntBiFunction<? super K,? super V> transformer, int basis, @androidx.annotation.RecentlyNonNull java.util.function.IntBinaryOperator reducer) { throw new RuntimeException("Stub!"); }

public void forEachKey(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.Consumer<? super K> action) { throw new RuntimeException("Stub!"); }

public <U> void forEachKey(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.Function<? super K,? extends U> transformer, @androidx.annotation.RecentlyNonNull java.util.function.Consumer<? super U> action) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public <U> U searchKeys(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.Function<? super K,? extends U> searchFunction) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public K reduceKeys(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super K,? super K,? extends K> reducer) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public <U> U reduceKeys(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.Function<? super K,? extends U> transformer, @androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super U,? super U,? extends U> reducer) { throw new RuntimeException("Stub!"); }

public double reduceKeysToDouble(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.ToDoubleFunction<? super K> transformer, double basis, @androidx.annotation.RecentlyNonNull java.util.function.DoubleBinaryOperator reducer) { throw new RuntimeException("Stub!"); }

public long reduceKeysToLong(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.ToLongFunction<? super K> transformer, long basis, @androidx.annotation.RecentlyNonNull java.util.function.LongBinaryOperator reducer) { throw new RuntimeException("Stub!"); }

public int reduceKeysToInt(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.ToIntFunction<? super K> transformer, int basis, @androidx.annotation.RecentlyNonNull java.util.function.IntBinaryOperator reducer) { throw new RuntimeException("Stub!"); }

public void forEachValue(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.Consumer<? super V> action) { throw new RuntimeException("Stub!"); }

public <U> void forEachValue(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.Function<? super V,? extends U> transformer, @androidx.annotation.RecentlyNonNull java.util.function.Consumer<? super U> action) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public <U> U searchValues(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.Function<? super V,? extends U> searchFunction) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public V reduceValues(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super V,? super V,? extends V> reducer) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public <U> U reduceValues(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.Function<? super V,? extends U> transformer, @androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super U,? super U,? extends U> reducer) { throw new RuntimeException("Stub!"); }

public double reduceValuesToDouble(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.ToDoubleFunction<? super V> transformer, double basis, @androidx.annotation.RecentlyNonNull java.util.function.DoubleBinaryOperator reducer) { throw new RuntimeException("Stub!"); }

public long reduceValuesToLong(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.ToLongFunction<? super V> transformer, long basis, @androidx.annotation.RecentlyNonNull java.util.function.LongBinaryOperator reducer) { throw new RuntimeException("Stub!"); }

public int reduceValuesToInt(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.ToIntFunction<? super V> transformer, int basis, @androidx.annotation.RecentlyNonNull java.util.function.IntBinaryOperator reducer) { throw new RuntimeException("Stub!"); }

public void forEachEntry(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.Consumer<? super java.util.Map.Entry<K,V>> action) { throw new RuntimeException("Stub!"); }

public <U> void forEachEntry(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.Function<java.util.Map.Entry<K,V>,? extends U> transformer, @androidx.annotation.RecentlyNonNull java.util.function.Consumer<? super U> action) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public <U> U searchEntries(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.Function<java.util.Map.Entry<K,V>,? extends U> searchFunction) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.util.Map.Entry<K,V> reduceEntries(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.BiFunction<java.util.Map.Entry<K,V>,java.util.Map.Entry<K,V>,? extends java.util.Map.Entry<K,V>> reducer) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public <U> U reduceEntries(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.Function<java.util.Map.Entry<K,V>,? extends U> transformer, @androidx.annotation.RecentlyNonNull java.util.function.BiFunction<? super U,? super U,? extends U> reducer) { throw new RuntimeException("Stub!"); }

public double reduceEntriesToDouble(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.ToDoubleFunction<java.util.Map.Entry<K,V>> transformer, double basis, @androidx.annotation.RecentlyNonNull java.util.function.DoubleBinaryOperator reducer) { throw new RuntimeException("Stub!"); }

public long reduceEntriesToLong(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.ToLongFunction<java.util.Map.Entry<K,V>> transformer, long basis, @androidx.annotation.RecentlyNonNull java.util.function.LongBinaryOperator reducer) { throw new RuntimeException("Stub!"); }

public int reduceEntriesToInt(long parallelismThreshold, @androidx.annotation.RecentlyNonNull java.util.function.ToIntFunction<java.util.Map.Entry<K,V>> transformer, int basis, @androidx.annotation.RecentlyNonNull java.util.function.IntBinaryOperator reducer) { throw new RuntimeException("Stub!"); }
@SuppressWarnings({"unchecked", "deprecation", "all"})
public static class KeySetView<K, V> implements java.util.Collection<K>, java.io.Serializable, java.util.Set<K> {

KeySetView() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public V getMappedValue() { throw new RuntimeException("Stub!"); }

public boolean contains(@androidx.annotation.RecentlyNonNull java.lang.Object o) { throw new RuntimeException("Stub!"); }

public boolean remove(@androidx.annotation.RecentlyNonNull java.lang.Object o) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Iterator<K> iterator() { throw new RuntimeException("Stub!"); }

public boolean add(@androidx.annotation.RecentlyNonNull K e) { throw new RuntimeException("Stub!"); }

public boolean addAll(@androidx.annotation.RecentlyNonNull java.util.Collection<? extends K> c) { throw new RuntimeException("Stub!"); }

public int hashCode() { throw new RuntimeException("Stub!"); }

public boolean equals(@androidx.annotation.RecentlyNullable java.lang.Object o) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Spliterator<K> spliterator() { throw new RuntimeException("Stub!"); }

public void forEach(@androidx.annotation.RecentlyNonNull java.util.function.Consumer<? super K> action) { throw new RuntimeException("Stub!"); }

public final boolean removeAll(@androidx.annotation.RecentlyNonNull java.util.Collection<?> c) { throw new RuntimeException("Stub!"); }

public final int size() { throw new RuntimeException("Stub!"); }

public final boolean containsAll(@androidx.annotation.RecentlyNonNull java.util.Collection<?> c) { throw new RuntimeException("Stub!"); }

public final void clear() { throw new RuntimeException("Stub!"); }

public final boolean isEmpty() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public final java.lang.Object[] toArray() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public final <T> T[] toArray(@androidx.annotation.RecentlyNonNull T[] a) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public final java.lang.String toString() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.concurrent.ConcurrentHashMap<K,V> getMap() { throw new RuntimeException("Stub!"); }

public final boolean retainAll(@androidx.annotation.RecentlyNonNull java.util.Collection<?> c) { throw new RuntimeException("Stub!"); }
}

}

