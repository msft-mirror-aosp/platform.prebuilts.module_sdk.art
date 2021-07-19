/*
 * Copyright (C) 2014 The Android Open Source Project
 * Copyright (c) 1996, 2013, Oracle and/or its affiliates. All rights reserved.
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
 * (C) Copyright Taligent, Inc. 1996, 1997 - All Rights Reserved
 * (C) Copyright IBM Corp. 1996 - 1998 - All Rights Reserved
 *
 *   The original version of this source code and documentation is copyrighted
 * and owned by Taligent, Inc., a wholly-owned subsidiary of IBM. These
 * materials are provided under terms of a License Agreement between Taligent
 * and Sun. This technology is protected by multiple US and International
 * patents. This notice and attribution to Taligent may not be removed.
 *   Taligent is a registered trademark of Taligent, Inc.
 *
 */


package java.text;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public abstract class NumberFormat extends java.text.Format {

protected NumberFormat() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.StringBuffer format(@androidx.annotation.RecentlyNonNull java.lang.Object number, @androidx.annotation.RecentlyNonNull java.lang.StringBuffer toAppendTo, @androidx.annotation.RecentlyNonNull java.text.FieldPosition pos) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public final java.lang.Object parseObject(@androidx.annotation.RecentlyNonNull java.lang.String source, @androidx.annotation.RecentlyNonNull java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public final java.lang.String format(double number) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public final java.lang.String format(long number) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public abstract java.lang.StringBuffer format(double number, @androidx.annotation.RecentlyNonNull java.lang.StringBuffer toAppendTo, @androidx.annotation.RecentlyNonNull java.text.FieldPosition pos);

@androidx.annotation.RecentlyNonNull
public abstract java.lang.StringBuffer format(long number, @androidx.annotation.RecentlyNonNull java.lang.StringBuffer toAppendTo, @androidx.annotation.RecentlyNonNull java.text.FieldPosition pos);

@androidx.annotation.RecentlyNullable
public abstract java.lang.Number parse(@androidx.annotation.RecentlyNonNull java.lang.String source, @androidx.annotation.RecentlyNonNull java.text.ParsePosition parsePosition);

@androidx.annotation.RecentlyNullable
public java.lang.Number parse(@androidx.annotation.RecentlyNonNull java.lang.String source) throws java.text.ParseException { throw new RuntimeException("Stub!"); }

public boolean isParseIntegerOnly() { throw new RuntimeException("Stub!"); }

public void setParseIntegerOnly(boolean value) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final java.text.NumberFormat getInstance() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.text.NumberFormat getInstance(@androidx.annotation.RecentlyNonNull java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final java.text.NumberFormat getNumberInstance() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.text.NumberFormat getNumberInstance(@androidx.annotation.RecentlyNonNull java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final java.text.NumberFormat getIntegerInstance() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.text.NumberFormat getIntegerInstance(@androidx.annotation.RecentlyNonNull java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final java.text.NumberFormat getCurrencyInstance() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.text.NumberFormat getCurrencyInstance(@androidx.annotation.RecentlyNonNull java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final java.text.NumberFormat getPercentInstance() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.text.NumberFormat getPercentInstance(@androidx.annotation.RecentlyNonNull java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }

public int hashCode() { throw new RuntimeException("Stub!"); }

public boolean equals(@androidx.annotation.RecentlyNullable java.lang.Object obj) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.Object clone() { throw new RuntimeException("Stub!"); }

public boolean isGroupingUsed() { throw new RuntimeException("Stub!"); }

public void setGroupingUsed(boolean newValue) { throw new RuntimeException("Stub!"); }

public int getMaximumIntegerDigits() { throw new RuntimeException("Stub!"); }

public void setMaximumIntegerDigits(int newValue) { throw new RuntimeException("Stub!"); }

public int getMinimumIntegerDigits() { throw new RuntimeException("Stub!"); }

public void setMinimumIntegerDigits(int newValue) { throw new RuntimeException("Stub!"); }

public int getMaximumFractionDigits() { throw new RuntimeException("Stub!"); }

public void setMaximumFractionDigits(int newValue) { throw new RuntimeException("Stub!"); }

public int getMinimumFractionDigits() { throw new RuntimeException("Stub!"); }

public void setMinimumFractionDigits(int newValue) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.util.Currency getCurrency() { throw new RuntimeException("Stub!"); }

public void setCurrency(@androidx.annotation.RecentlyNonNull java.util.Currency currency) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.math.RoundingMode getRoundingMode() { throw new RuntimeException("Stub!"); }

public void setRoundingMode(@androidx.annotation.RecentlyNullable java.math.RoundingMode roundingMode) { throw new RuntimeException("Stub!"); }

public static final int FRACTION_FIELD = 1; // 0x1

public static final int INTEGER_FIELD = 0; // 0x0
@SuppressWarnings({"unchecked", "deprecation", "all"})
public static class Field extends java.text.Format.Field {

protected Field(@androidx.annotation.RecentlyNonNull java.lang.String name) { super(null); throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
protected java.lang.Object readResolve() throws java.io.InvalidObjectException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull public static final java.text.NumberFormat.Field CURRENCY;
static { CURRENCY = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.NumberFormat.Field DECIMAL_SEPARATOR;
static { DECIMAL_SEPARATOR = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.NumberFormat.Field EXPONENT;
static { EXPONENT = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.NumberFormat.Field EXPONENT_SIGN;
static { EXPONENT_SIGN = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.NumberFormat.Field EXPONENT_SYMBOL;
static { EXPONENT_SYMBOL = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.NumberFormat.Field FRACTION;
static { FRACTION = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.NumberFormat.Field GROUPING_SEPARATOR;
static { GROUPING_SEPARATOR = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.NumberFormat.Field INTEGER;
static { INTEGER = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.NumberFormat.Field PERCENT;
static { PERCENT = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.NumberFormat.Field PERMILLE;
static { PERMILLE = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.NumberFormat.Field SIGN;
static { SIGN = null; }
}

}

