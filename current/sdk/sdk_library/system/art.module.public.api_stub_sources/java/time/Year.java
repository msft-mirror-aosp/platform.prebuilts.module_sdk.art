/*
 * Copyright (c) 2012, 2015, Oracle and/or its affiliates. All rights reserved.
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
 * Copyright (c) 2007-2012, Stephen Colebourne & Michael Nascimento Santos
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  * Neither the name of JSR-310 nor the names of its contributors
 *    may be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package java.time;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class Year implements java.time.temporal.Temporal, java.time.temporal.TemporalAdjuster, java.lang.Comparable<java.time.Year>, java.io.Serializable {

private Year() { throw new RuntimeException("Stub!"); }

public static java.time.Year now() { throw new RuntimeException("Stub!"); }

public static java.time.Year now(java.time.ZoneId zone) { throw new RuntimeException("Stub!"); }

public static java.time.Year now(java.time.Clock clock) { throw new RuntimeException("Stub!"); }

public static java.time.Year of(int isoYear) { throw new RuntimeException("Stub!"); }

public static java.time.Year from(java.time.temporal.TemporalAccessor temporal) { throw new RuntimeException("Stub!"); }

public static java.time.Year parse(java.lang.CharSequence text) { throw new RuntimeException("Stub!"); }

public static java.time.Year parse(java.lang.CharSequence text, java.time.format.DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }

public static boolean isLeap(long year) { throw new RuntimeException("Stub!"); }

public int getValue() { throw new RuntimeException("Stub!"); }

public boolean isSupported(java.time.temporal.TemporalField field) { throw new RuntimeException("Stub!"); }

public boolean isSupported(java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }

public java.time.temporal.ValueRange range(java.time.temporal.TemporalField field) { throw new RuntimeException("Stub!"); }

public int get(java.time.temporal.TemporalField field) { throw new RuntimeException("Stub!"); }

public long getLong(java.time.temporal.TemporalField field) { throw new RuntimeException("Stub!"); }

public boolean isLeap() { throw new RuntimeException("Stub!"); }

public boolean isValidMonthDay(java.time.MonthDay monthDay) { throw new RuntimeException("Stub!"); }

public int length() { throw new RuntimeException("Stub!"); }

public java.time.Year with(java.time.temporal.TemporalAdjuster adjuster) { throw new RuntimeException("Stub!"); }

public java.time.Year with(java.time.temporal.TemporalField field, long newValue) { throw new RuntimeException("Stub!"); }

public java.time.Year plus(java.time.temporal.TemporalAmount amountToAdd) { throw new RuntimeException("Stub!"); }

public java.time.Year plus(long amountToAdd, java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }

public java.time.Year plusYears(long yearsToAdd) { throw new RuntimeException("Stub!"); }

public java.time.Year minus(java.time.temporal.TemporalAmount amountToSubtract) { throw new RuntimeException("Stub!"); }

public java.time.Year minus(long amountToSubtract, java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }

public java.time.Year minusYears(long yearsToSubtract) { throw new RuntimeException("Stub!"); }

public <R> R query(java.time.temporal.TemporalQuery<R> query) { throw new RuntimeException("Stub!"); }

public java.time.temporal.Temporal adjustInto(java.time.temporal.Temporal temporal) { throw new RuntimeException("Stub!"); }

public long until(java.time.temporal.Temporal endExclusive, java.time.temporal.TemporalUnit unit) { throw new RuntimeException("Stub!"); }

public java.lang.String format(java.time.format.DateTimeFormatter formatter) { throw new RuntimeException("Stub!"); }

public java.time.LocalDate atDay(int dayOfYear) { throw new RuntimeException("Stub!"); }

public java.time.YearMonth atMonth(java.time.Month month) { throw new RuntimeException("Stub!"); }

public java.time.YearMonth atMonth(int month) { throw new RuntimeException("Stub!"); }

public java.time.LocalDate atMonthDay(java.time.MonthDay monthDay) { throw new RuntimeException("Stub!"); }

public int compareTo(java.time.Year other) { throw new RuntimeException("Stub!"); }

public boolean isAfter(java.time.Year other) { throw new RuntimeException("Stub!"); }

public boolean isBefore(java.time.Year other) { throw new RuntimeException("Stub!"); }

public boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }

public int hashCode() { throw new RuntimeException("Stub!"); }

public java.lang.String toString() { throw new RuntimeException("Stub!"); }

public static final int MAX_VALUE = 999999999; // 0x3b9ac9ff

public static final int MIN_VALUE = -999999999; // 0xc4653601
}
