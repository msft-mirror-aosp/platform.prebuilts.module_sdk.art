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
 * (C) Copyright Taligent, Inc. 1996 - All Rights Reserved
 * (C) Copyright IBM Corp. 1996 - All Rights Reserved
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
public abstract class DateFormat extends java.text.Format {

protected DateFormat() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public final java.lang.StringBuffer format(@androidx.annotation.RecentlyNonNull java.lang.Object obj, @androidx.annotation.RecentlyNonNull java.lang.StringBuffer toAppendTo, @androidx.annotation.RecentlyNonNull java.text.FieldPosition fieldPosition) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public abstract java.lang.StringBuffer format(@androidx.annotation.RecentlyNonNull java.util.Date date, @androidx.annotation.RecentlyNonNull java.lang.StringBuffer toAppendTo, @androidx.annotation.RecentlyNonNull java.text.FieldPosition fieldPosition);

@androidx.annotation.RecentlyNonNull
public final java.lang.String format(@androidx.annotation.RecentlyNonNull java.util.Date date) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.util.Date parse(@androidx.annotation.RecentlyNonNull java.lang.String source) throws java.text.ParseException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public abstract java.util.Date parse(@androidx.annotation.RecentlyNonNull java.lang.String source, @androidx.annotation.RecentlyNonNull java.text.ParsePosition pos);

@androidx.annotation.RecentlyNullable
public java.lang.Object parseObject(@androidx.annotation.RecentlyNonNull java.lang.String source, @androidx.annotation.RecentlyNonNull java.text.ParsePosition pos) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final java.text.DateFormat getTimeInstance() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final java.text.DateFormat getTimeInstance(int style) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final java.text.DateFormat getTimeInstance(int style, @androidx.annotation.RecentlyNonNull java.util.Locale aLocale) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final java.text.DateFormat getDateInstance() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final java.text.DateFormat getDateInstance(int style) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final java.text.DateFormat getDateInstance(int style, @androidx.annotation.RecentlyNonNull java.util.Locale aLocale) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final java.text.DateFormat getDateTimeInstance() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final java.text.DateFormat getDateTimeInstance(int dateStyle, int timeStyle) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final java.text.DateFormat getDateTimeInstance(int dateStyle, int timeStyle, @androidx.annotation.RecentlyNonNull java.util.Locale aLocale) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static final java.text.DateFormat getInstance() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }

public void setCalendar(@androidx.annotation.RecentlyNonNull java.util.Calendar newCalendar) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Calendar getCalendar() { throw new RuntimeException("Stub!"); }

public void setNumberFormat(@androidx.annotation.RecentlyNonNull java.text.NumberFormat newNumberFormat) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.text.NumberFormat getNumberFormat() { throw new RuntimeException("Stub!"); }

public void setTimeZone(@androidx.annotation.RecentlyNonNull java.util.TimeZone zone) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.TimeZone getTimeZone() { throw new RuntimeException("Stub!"); }

public void setLenient(boolean lenient) { throw new RuntimeException("Stub!"); }

public boolean isLenient() { throw new RuntimeException("Stub!"); }

public int hashCode() { throw new RuntimeException("Stub!"); }

public boolean equals(@androidx.annotation.RecentlyNullable java.lang.Object obj) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.Object clone() { throw new RuntimeException("Stub!"); }

public static final int AM_PM_FIELD = 14; // 0xe

public static final int DATE_FIELD = 3; // 0x3

public static final int DAY_OF_WEEK_FIELD = 9; // 0x9

public static final int DAY_OF_WEEK_IN_MONTH_FIELD = 11; // 0xb

public static final int DAY_OF_YEAR_FIELD = 10; // 0xa

public static final int DEFAULT = 2; // 0x2

public static final int ERA_FIELD = 0; // 0x0

public static final int FULL = 0; // 0x0

public static final int HOUR0_FIELD = 16; // 0x10

public static final int HOUR1_FIELD = 15; // 0xf

public static final int HOUR_OF_DAY0_FIELD = 5; // 0x5

public static final int HOUR_OF_DAY1_FIELD = 4; // 0x4

public static final int LONG = 1; // 0x1

public static final int MEDIUM = 2; // 0x2

public static final int MILLISECOND_FIELD = 8; // 0x8

public static final int MINUTE_FIELD = 6; // 0x6

public static final int MONTH_FIELD = 2; // 0x2

public static final int SECOND_FIELD = 7; // 0x7

public static final int SHORT = 3; // 0x3

public static final int TIMEZONE_FIELD = 17; // 0x11

public static final int WEEK_OF_MONTH_FIELD = 13; // 0xd

public static final int WEEK_OF_YEAR_FIELD = 12; // 0xc

public static final int YEAR_FIELD = 1; // 0x1

@androidx.annotation.RecentlyNonNull protected java.util.Calendar calendar;

@androidx.annotation.RecentlyNonNull protected java.text.NumberFormat numberFormat;
@SuppressWarnings({"unchecked", "deprecation", "all"})
public static class Field extends java.text.Format.Field {

protected Field(@androidx.annotation.RecentlyNonNull java.lang.String name, int calendarField) { super(null); throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.text.DateFormat.Field ofCalendarField(int calendarField) { throw new RuntimeException("Stub!"); }

public int getCalendarField() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
protected java.lang.Object readResolve() throws java.io.InvalidObjectException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field AM_PM;
static { AM_PM = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field DAY_OF_MONTH;
static { DAY_OF_MONTH = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field DAY_OF_WEEK;
static { DAY_OF_WEEK = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field DAY_OF_WEEK_IN_MONTH;
static { DAY_OF_WEEK_IN_MONTH = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field DAY_OF_YEAR;
static { DAY_OF_YEAR = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field ERA;
static { ERA = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field HOUR0;
static { HOUR0 = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field HOUR1;
static { HOUR1 = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field HOUR_OF_DAY0;
static { HOUR_OF_DAY0 = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field HOUR_OF_DAY1;
static { HOUR_OF_DAY1 = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field MILLISECOND;
static { MILLISECOND = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field MINUTE;
static { MINUTE = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field MONTH;
static { MONTH = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field SECOND;
static { SECOND = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field TIME_ZONE;
static { TIME_ZONE = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field WEEK_OF_MONTH;
static { WEEK_OF_MONTH = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field WEEK_OF_YEAR;
static { WEEK_OF_YEAR = null; }

@androidx.annotation.RecentlyNonNull public static final java.text.DateFormat.Field YEAR;
static { YEAR = null; }
}

}

