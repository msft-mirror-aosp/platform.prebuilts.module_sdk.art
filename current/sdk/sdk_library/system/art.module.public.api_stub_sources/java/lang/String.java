/*
 * Copyright (C) 2014 The Android Open Source Project
 * Copyright (c) 1994, 2013, Oracle and/or its affiliates. All rights reserved.
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


package java.lang;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class String implements java.io.Serializable, java.lang.Comparable<java.lang.String>, java.lang.CharSequence {

public String() { throw new RuntimeException("Stub!"); }

public String(@androidx.annotation.RecentlyNonNull java.lang.String original) { throw new RuntimeException("Stub!"); }

public String(char[] value) { throw new RuntimeException("Stub!"); }

public String(char[] value, int offset, int count) { throw new RuntimeException("Stub!"); }

public String(int[] codePoints, int offset, int count) { throw new RuntimeException("Stub!"); }

@Deprecated
public String(byte[] ascii, int hibyte, int offset, int count) { throw new RuntimeException("Stub!"); }

@Deprecated
public String(byte[] ascii, int hibyte) { throw new RuntimeException("Stub!"); }

public String(byte[] bytes, int offset, int length, @androidx.annotation.RecentlyNonNull java.lang.String charsetName) throws java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }

public String(byte[] bytes, int offset, int length, @androidx.annotation.RecentlyNonNull java.nio.charset.Charset charset) { throw new RuntimeException("Stub!"); }

public String(byte[] bytes, @androidx.annotation.RecentlyNonNull java.lang.String charsetName) throws java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }

public String(byte[] bytes, @androidx.annotation.RecentlyNonNull java.nio.charset.Charset charset) { throw new RuntimeException("Stub!"); }

public String(byte[] bytes, int offset, int length) { throw new RuntimeException("Stub!"); }

public String(byte[] bytes) { throw new RuntimeException("Stub!"); }

public String(@androidx.annotation.RecentlyNonNull java.lang.StringBuffer buffer) { throw new RuntimeException("Stub!"); }

public String(@androidx.annotation.RecentlyNonNull java.lang.StringBuilder builder) { throw new RuntimeException("Stub!"); }

public int length() { throw new RuntimeException("Stub!"); }

public boolean isEmpty() { throw new RuntimeException("Stub!"); }

public native char charAt(int index);

public int codePointAt(int index) { throw new RuntimeException("Stub!"); }

public int codePointBefore(int index) { throw new RuntimeException("Stub!"); }

public int codePointCount(int beginIndex, int endIndex) { throw new RuntimeException("Stub!"); }

public int offsetByCodePoints(int index, int codePointOffset) { throw new RuntimeException("Stub!"); }

public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) { throw new RuntimeException("Stub!"); }

@Deprecated
public void getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin) { throw new RuntimeException("Stub!"); }

public byte[] getBytes(@androidx.annotation.RecentlyNonNull java.lang.String charsetName) throws java.io.UnsupportedEncodingException { throw new RuntimeException("Stub!"); }

public byte[] getBytes(@androidx.annotation.RecentlyNonNull java.nio.charset.Charset charset) { throw new RuntimeException("Stub!"); }

public byte[] getBytes() { throw new RuntimeException("Stub!"); }

public boolean equals(@androidx.annotation.RecentlyNullable java.lang.Object anObject) { throw new RuntimeException("Stub!"); }

public boolean contentEquals(@androidx.annotation.RecentlyNonNull java.lang.StringBuffer sb) { throw new RuntimeException("Stub!"); }

public boolean contentEquals(@androidx.annotation.RecentlyNonNull java.lang.CharSequence cs) { throw new RuntimeException("Stub!"); }

public boolean equalsIgnoreCase(@androidx.annotation.RecentlyNullable java.lang.String anotherString) { throw new RuntimeException("Stub!"); }

public native int compareTo(@androidx.annotation.RecentlyNonNull java.lang.String anotherString);

public int compareToIgnoreCase(@androidx.annotation.RecentlyNonNull java.lang.String str) { throw new RuntimeException("Stub!"); }

public boolean regionMatches(int toffset, @androidx.annotation.RecentlyNonNull java.lang.String other, int ooffset, int len) { throw new RuntimeException("Stub!"); }

public boolean regionMatches(boolean ignoreCase, int toffset, @androidx.annotation.RecentlyNonNull java.lang.String other, int ooffset, int len) { throw new RuntimeException("Stub!"); }

public boolean startsWith(@androidx.annotation.RecentlyNonNull java.lang.String prefix, int toffset) { throw new RuntimeException("Stub!"); }

public boolean startsWith(@androidx.annotation.RecentlyNonNull java.lang.String prefix) { throw new RuntimeException("Stub!"); }

public boolean endsWith(@androidx.annotation.RecentlyNonNull java.lang.String suffix) { throw new RuntimeException("Stub!"); }

public int hashCode() { throw new RuntimeException("Stub!"); }

public int indexOf(int ch) { throw new RuntimeException("Stub!"); }

public int indexOf(int ch, int fromIndex) { throw new RuntimeException("Stub!"); }

public int lastIndexOf(int ch) { throw new RuntimeException("Stub!"); }

public int lastIndexOf(int ch, int fromIndex) { throw new RuntimeException("Stub!"); }

public int indexOf(@androidx.annotation.RecentlyNonNull java.lang.String str) { throw new RuntimeException("Stub!"); }

public int indexOf(@androidx.annotation.RecentlyNonNull java.lang.String str, int fromIndex) { throw new RuntimeException("Stub!"); }

public int lastIndexOf(@androidx.annotation.RecentlyNonNull java.lang.String str) { throw new RuntimeException("Stub!"); }

public int lastIndexOf(@androidx.annotation.RecentlyNonNull java.lang.String str, int fromIndex) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String substring(int beginIndex) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String substring(int beginIndex, int endIndex) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.CharSequence subSequence(int beginIndex, int endIndex) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public native java.lang.String concat(@androidx.annotation.RecentlyNonNull java.lang.String str);

@androidx.annotation.RecentlyNonNull
public java.lang.String replace(char oldChar, char newChar) { throw new RuntimeException("Stub!"); }

public boolean matches(@androidx.annotation.RecentlyNonNull java.lang.String regex) { throw new RuntimeException("Stub!"); }

public boolean contains(@androidx.annotation.RecentlyNonNull java.lang.CharSequence s) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String replaceFirst(@androidx.annotation.RecentlyNonNull java.lang.String regex, @androidx.annotation.RecentlyNonNull java.lang.String replacement) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String replaceAll(@androidx.annotation.RecentlyNonNull java.lang.String regex, @androidx.annotation.RecentlyNonNull java.lang.String replacement) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String replace(@androidx.annotation.RecentlyNonNull java.lang.CharSequence target, @androidx.annotation.RecentlyNonNull java.lang.CharSequence replacement) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String[] split(@androidx.annotation.RecentlyNonNull java.lang.String regex, int limit) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String[] split(@androidx.annotation.RecentlyNonNull java.lang.String regex) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String join(@androidx.annotation.RecentlyNonNull java.lang.CharSequence delimiter, @androidx.annotation.RecentlyNullable java.lang.CharSequence... elements) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String join(@androidx.annotation.RecentlyNonNull java.lang.CharSequence delimiter, @androidx.annotation.RecentlyNonNull java.lang.Iterable<? extends java.lang.CharSequence> elements) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String toLowerCase(@androidx.annotation.RecentlyNonNull java.util.Locale locale) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String toLowerCase() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String toUpperCase(@androidx.annotation.RecentlyNonNull java.util.Locale locale) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String toUpperCase() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String trim() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String toString() { throw new RuntimeException("Stub!"); }

public native char[] toCharArray();

@androidx.annotation.RecentlyNonNull
public static java.lang.String format(@androidx.annotation.RecentlyNonNull java.lang.String format, @androidx.annotation.RecentlyNonNull java.lang.Object... args) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String format(@androidx.annotation.RecentlyNonNull java.util.Locale l, @androidx.annotation.RecentlyNonNull java.lang.String format, @androidx.annotation.RecentlyNonNull java.lang.Object... args) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String valueOf(@androidx.annotation.RecentlyNullable java.lang.Object obj) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String valueOf(char[] data) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String valueOf(char[] data, int offset, int count) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String copyValueOf(char[] data, int offset, int count) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String copyValueOf(char[] data) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String valueOf(boolean b) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String valueOf(char c) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String valueOf(int i) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String valueOf(long l) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String valueOf(float f) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String valueOf(double d) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public native java.lang.String intern();

public static final java.util.Comparator<java.lang.String> CASE_INSENSITIVE_ORDER;
static { CASE_INSENSITIVE_ORDER = null; }
}

