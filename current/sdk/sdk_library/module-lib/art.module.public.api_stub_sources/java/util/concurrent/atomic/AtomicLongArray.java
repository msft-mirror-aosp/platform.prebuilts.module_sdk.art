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


package java.util.concurrent.atomic;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class AtomicLongArray implements java.io.Serializable {

public AtomicLongArray(int length) { throw new RuntimeException("Stub!"); }

public AtomicLongArray(long[] array) { throw new RuntimeException("Stub!"); }

public final int length() { throw new RuntimeException("Stub!"); }

public final long get(int i) { throw new RuntimeException("Stub!"); }

public final void set(int i, long newValue) { throw new RuntimeException("Stub!"); }

public final void lazySet(int i, long newValue) { throw new RuntimeException("Stub!"); }

public final long getAndSet(int i, long newValue) { throw new RuntimeException("Stub!"); }

public final boolean compareAndSet(int i, long expect, long update) { throw new RuntimeException("Stub!"); }

public final boolean weakCompareAndSet(int i, long expect, long update) { throw new RuntimeException("Stub!"); }

public final long getAndIncrement(int i) { throw new RuntimeException("Stub!"); }

public final long getAndDecrement(int i) { throw new RuntimeException("Stub!"); }

public final long getAndAdd(int i, long delta) { throw new RuntimeException("Stub!"); }

public final long incrementAndGet(int i) { throw new RuntimeException("Stub!"); }

public final long decrementAndGet(int i) { throw new RuntimeException("Stub!"); }

public long addAndGet(int i, long delta) { throw new RuntimeException("Stub!"); }

public final long getAndUpdate(int i, java.util.function.LongUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }

public final long updateAndGet(int i, java.util.function.LongUnaryOperator updateFunction) { throw new RuntimeException("Stub!"); }

public final long getAndAccumulate(int i, long x, java.util.function.LongBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }

public final long accumulateAndGet(int i, long x, java.util.function.LongBinaryOperator accumulatorFunction) { throw new RuntimeException("Stub!"); }

public java.lang.String toString() { throw new RuntimeException("Stub!"); }
}
