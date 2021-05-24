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
 * Written by Doug Lea and Josh Bloch with assistance from members of
 * JCP JSR-166 Expert Group and released to the public domain, as explained
 * at http://creativecommons.org/publicdomain/zero/1.0/
 */


package java.util;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface Deque<E> extends java.util.Queue<E> {

public void addFirst(E e);

public void addLast(E e);

public boolean offerFirst(E e);

public boolean offerLast(E e);

public E removeFirst();

public E removeLast();

@androidx.annotation.RecentlyNullable
public E pollFirst();

@androidx.annotation.RecentlyNullable
public E pollLast();

public E getFirst();

public E getLast();

@androidx.annotation.RecentlyNullable
public E peekFirst();

@androidx.annotation.RecentlyNullable
public E peekLast();

public boolean removeFirstOccurrence(@androidx.annotation.RecentlyNullable java.lang.Object o);

public boolean removeLastOccurrence(@androidx.annotation.RecentlyNullable java.lang.Object o);

public boolean add(E e);

public boolean offer(E e);

public E remove();

@androidx.annotation.RecentlyNullable
public E poll();

public E element();

@androidx.annotation.RecentlyNullable
public E peek();

public void push(E e);

public E pop();

public boolean remove(@androidx.annotation.RecentlyNullable java.lang.Object o);

public boolean contains(@androidx.annotation.RecentlyNullable java.lang.Object o);

public int size();

@androidx.annotation.RecentlyNonNull
public java.util.Iterator<E> iterator();

@androidx.annotation.RecentlyNonNull
public java.util.Iterator<E> descendingIterator();
}

