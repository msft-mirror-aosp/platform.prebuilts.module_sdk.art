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
public interface BlockingDeque<E> extends java.util.concurrent.BlockingQueue<E>,  java.util.Deque<E> {

public void addFirst(E e);

public void addLast(E e);

public boolean offerFirst(E e);

public boolean offerLast(E e);

public void putFirst(E e) throws java.lang.InterruptedException;

public void putLast(E e) throws java.lang.InterruptedException;

public boolean offerFirst(E e, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;

public boolean offerLast(E e, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;

public E takeFirst() throws java.lang.InterruptedException;

public E takeLast() throws java.lang.InterruptedException;

public E pollFirst(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;

public E pollLast(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;

public boolean removeFirstOccurrence(java.lang.Object o);

public boolean removeLastOccurrence(java.lang.Object o);

public boolean add(E e);

public boolean offer(E e);

public void put(E e) throws java.lang.InterruptedException;

public boolean offer(E e, long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;

public E remove();

public E poll();

public E take() throws java.lang.InterruptedException;

public E poll(long timeout, java.util.concurrent.TimeUnit unit) throws java.lang.InterruptedException;

public E element();

public E peek();

public boolean remove(java.lang.Object o);

public boolean contains(java.lang.Object o);

public int size();

public java.util.Iterator<E> iterator();

public void push(E e);
}

