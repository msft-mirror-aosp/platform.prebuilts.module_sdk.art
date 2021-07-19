/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// $Id: DatatypeConstants.java 446598 2006-09-15 12:55:40Z jeremias $


package javax.xml.datatype;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class DatatypeConstants {

private DatatypeConstants() { throw new RuntimeException("Stub!"); }

public static final int APRIL = 4; // 0x4

public static final int AUGUST = 8; // 0x8

public static final javax.xml.namespace.QName DATE;
static { DATE = null; }

public static final javax.xml.namespace.QName DATETIME;
static { DATETIME = null; }

public static final javax.xml.datatype.DatatypeConstants.Field DAYS;
static { DAYS = null; }

public static final int DECEMBER = 12; // 0xc

public static final javax.xml.namespace.QName DURATION;
static { DURATION = null; }

public static final javax.xml.namespace.QName DURATION_DAYTIME;
static { DURATION_DAYTIME = null; }

public static final javax.xml.namespace.QName DURATION_YEARMONTH;
static { DURATION_YEARMONTH = null; }

public static final int EQUAL = 0; // 0x0

public static final int FEBRUARY = 2; // 0x2

public static final int FIELD_UNDEFINED = -2147483648; // 0x80000000

public static final javax.xml.namespace.QName GDAY;
static { GDAY = null; }

public static final javax.xml.namespace.QName GMONTH;
static { GMONTH = null; }

public static final javax.xml.namespace.QName GMONTHDAY;
static { GMONTHDAY = null; }

public static final int GREATER = 1; // 0x1

public static final javax.xml.namespace.QName GYEAR;
static { GYEAR = null; }

public static final javax.xml.namespace.QName GYEARMONTH;
static { GYEARMONTH = null; }

public static final javax.xml.datatype.DatatypeConstants.Field HOURS;
static { HOURS = null; }

public static final int INDETERMINATE = 2; // 0x2

public static final int JANUARY = 1; // 0x1

public static final int JULY = 7; // 0x7

public static final int JUNE = 6; // 0x6

public static final int LESSER = -1; // 0xffffffff

public static final int MARCH = 3; // 0x3

public static final int MAX_TIMEZONE_OFFSET = -840; // 0xfffffcb8

public static final int MAY = 5; // 0x5

public static final javax.xml.datatype.DatatypeConstants.Field MINUTES;
static { MINUTES = null; }

public static final int MIN_TIMEZONE_OFFSET = 840; // 0x348

public static final javax.xml.datatype.DatatypeConstants.Field MONTHS;
static { MONTHS = null; }

public static final int NOVEMBER = 11; // 0xb

public static final int OCTOBER = 10; // 0xa

public static final javax.xml.datatype.DatatypeConstants.Field SECONDS;
static { SECONDS = null; }

public static final int SEPTEMBER = 9; // 0x9

public static final javax.xml.namespace.QName TIME;
static { TIME = null; }

public static final javax.xml.datatype.DatatypeConstants.Field YEARS;
static { YEARS = null; }
@SuppressWarnings({"unchecked", "deprecation", "all"})
public static final class Field {

private Field() { throw new RuntimeException("Stub!"); }

public java.lang.String toString() { throw new RuntimeException("Stub!"); }

public int getId() { throw new RuntimeException("Stub!"); }
}

}

