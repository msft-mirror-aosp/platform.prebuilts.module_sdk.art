/*
 * Copyright (c) 1998, 2011, Oracle and/or its affiliates. All rights reserved.
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
public interface SortedMap<K, V> extends java.util.Map<K,V> {

@androidx.annotation.RecentlyNullable
public java.util.Comparator<? super K> comparator();

@androidx.annotation.RecentlyNonNull
public java.util.SortedMap<K,V> subMap(K fromKey, K toKey);

@androidx.annotation.RecentlyNonNull
public java.util.SortedMap<K,V> headMap(K toKey);

@androidx.annotation.RecentlyNonNull
public java.util.SortedMap<K,V> tailMap(K fromKey);

public K firstKey();

public K lastKey();

@androidx.annotation.RecentlyNonNull
public java.util.Set<K> keySet();

@androidx.annotation.RecentlyNonNull
public java.util.Collection<V> values();

@androidx.annotation.RecentlyNonNull
public java.util.Set<java.util.Map.Entry<K,V>> entrySet();
}
