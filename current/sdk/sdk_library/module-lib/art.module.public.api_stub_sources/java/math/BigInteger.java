/*
 * Copyright (c) 1996, 2018, Oracle and/or its affiliates. All rights reserved.
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
 * Portions Copyright (c) 1995  Colin Plumb.  All rights reserved.
 */


package java.math;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class BigInteger extends java.lang.Number implements java.lang.Comparable<java.math.BigInteger> {

public BigInteger(byte[] val) { throw new RuntimeException("Stub!"); }

public BigInteger(int signum, byte[] magnitude) { throw new RuntimeException("Stub!"); }

public BigInteger(@androidx.annotation.RecentlyNonNull java.lang.String val, int radix) { throw new RuntimeException("Stub!"); }

public BigInteger(@androidx.annotation.RecentlyNonNull java.lang.String val) { throw new RuntimeException("Stub!"); }

public BigInteger(int numBits, @androidx.annotation.RecentlyNonNull java.util.Random rnd) { throw new RuntimeException("Stub!"); }

public BigInteger(int bitLength, int certainty, @androidx.annotation.RecentlyNonNull java.util.Random rnd) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.math.BigInteger probablePrime(int bitLength, @androidx.annotation.RecentlyNonNull java.util.Random rnd) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger nextProbablePrime() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.math.BigInteger valueOf(long val) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger add(@androidx.annotation.RecentlyNonNull java.math.BigInteger val) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger subtract(@androidx.annotation.RecentlyNonNull java.math.BigInteger val) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger multiply(@androidx.annotation.RecentlyNonNull java.math.BigInteger val) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger divide(@androidx.annotation.RecentlyNonNull java.math.BigInteger val) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger[] divideAndRemainder(@androidx.annotation.RecentlyNonNull java.math.BigInteger val) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger remainder(@androidx.annotation.RecentlyNonNull java.math.BigInteger val) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger pow(int exponent) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger gcd(@androidx.annotation.RecentlyNonNull java.math.BigInteger val) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger abs() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger negate() { throw new RuntimeException("Stub!"); }

public int signum() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger mod(@androidx.annotation.RecentlyNonNull java.math.BigInteger m) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger modPow(@androidx.annotation.RecentlyNonNull java.math.BigInteger exponent, @androidx.annotation.RecentlyNonNull java.math.BigInteger m) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger modInverse(@androidx.annotation.RecentlyNonNull java.math.BigInteger m) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger shiftLeft(int n) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger shiftRight(int n) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger and(@androidx.annotation.RecentlyNonNull java.math.BigInteger val) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger or(@androidx.annotation.RecentlyNonNull java.math.BigInteger val) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger xor(@androidx.annotation.RecentlyNonNull java.math.BigInteger val) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger not() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger andNot(@androidx.annotation.RecentlyNonNull java.math.BigInteger val) { throw new RuntimeException("Stub!"); }

public boolean testBit(int n) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger setBit(int n) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger clearBit(int n) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger flipBit(int n) { throw new RuntimeException("Stub!"); }

public int getLowestSetBit() { throw new RuntimeException("Stub!"); }

public int bitLength() { throw new RuntimeException("Stub!"); }

public int bitCount() { throw new RuntimeException("Stub!"); }

public boolean isProbablePrime(int certainty) { throw new RuntimeException("Stub!"); }

public int compareTo(@androidx.annotation.RecentlyNonNull java.math.BigInteger val) { throw new RuntimeException("Stub!"); }

public boolean equals(@androidx.annotation.RecentlyNonNull java.lang.Object x) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger min(@androidx.annotation.RecentlyNonNull java.math.BigInteger val) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.BigInteger max(@androidx.annotation.RecentlyNonNull java.math.BigInteger val) { throw new RuntimeException("Stub!"); }

public int hashCode() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String toString(int radix) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String toString() { throw new RuntimeException("Stub!"); }

public byte[] toByteArray() { throw new RuntimeException("Stub!"); }

public int intValue() { throw new RuntimeException("Stub!"); }

public long longValue() { throw new RuntimeException("Stub!"); }

public float floatValue() { throw new RuntimeException("Stub!"); }

public double doubleValue() { throw new RuntimeException("Stub!"); }

public long longValueExact() { throw new RuntimeException("Stub!"); }

public int intValueExact() { throw new RuntimeException("Stub!"); }

public short shortValueExact() { throw new RuntimeException("Stub!"); }

public byte byteValueExact() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull public static final java.math.BigInteger ONE;
static { ONE = null; }

@androidx.annotation.RecentlyNonNull public static final java.math.BigInteger TEN;
static { TEN = null; }

@androidx.annotation.RecentlyNonNull public static final java.math.BigInteger ZERO;
static { ZERO = null; }
}

