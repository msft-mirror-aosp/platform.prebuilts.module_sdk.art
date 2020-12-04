/*
 * Copyright (c) 2003, 2007, Oracle and/or its affiliates. All rights reserved.
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
 * Portions Copyright IBM Corporation, 1997, 2001. All Rights Reserved.
 */


package java.math;

import java.io.*;

/**
 * Immutable objects which encapsulate the context settings which
 * describe certain rules for numerical operators, such as those
 * implemented by the {@link java.math.BigDecimal BigDecimal} class.
 *
 * <p>The base-independent settings are:
 * <ol>
 * <li>{@code precision}:
 * the number of digits to be used for an operation; results are
 * rounded to this precision
 *
 * <li>{@code roundingMode}:
 * a {@link java.math.RoundingMode RoundingMode} object which specifies the algorithm to be
 * used for rounding.
 * </ol>
 *
 * @see     java.math.BigDecimal
 * @see     java.math.RoundingMode
 * @author  Mike Cowlishaw
 * @author  Joseph D. Darcy
 * @since 1.5
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class MathContext implements java.io.Serializable {

/**
 * Constructs a new {@code MathContext} with the specified
 * precision and the {@link java.math.RoundingMode#HALF_UP RoundingMode#HALF_UP} rounding
 * mode.
 *
 * @param setPrecision The non-negative {@code int} precision setting.
 * @throws java.lang.IllegalArgumentException if the {@code setPrecision} parameter is less
 *         than zero.
 */

public MathContext(int setPrecision) { throw new RuntimeException("Stub!"); }

/**
 * Constructs a new {@code MathContext} with a specified
 * precision and rounding mode.
 *
 * @param setPrecision The non-negative {@code int} precision setting.
 * @param setRoundingMode The rounding mode to use.
 * @throws java.lang.IllegalArgumentException if the {@code setPrecision} parameter is less
 *         than zero.
 * @throws java.lang.NullPointerException if the rounding mode argument is {@code null}
 */

public MathContext(int setPrecision, java.math.RoundingMode setRoundingMode) { throw new RuntimeException("Stub!"); }

/**
 * Constructs a new {@code MathContext} from a string.
 *
 * The string must be in the same format as that produced by the
 * {@link #toString} method.
 *
 * <p>An {@code IllegalArgumentException} is thrown if the precision
 * section of the string is out of range ({@code < 0}) or the string is
 * not in the format created by the {@link #toString} method.
 *
 * @param val The string to be parsed
 * @throws java.lang.IllegalArgumentException if the precision section is out of range
 * or of incorrect format
 * @throws java.lang.NullPointerException if the argument is {@code null}
 */

public MathContext(java.lang.String val) { throw new RuntimeException("Stub!"); }

/**
 * Returns the {@code precision} setting.
 * This value is always non-negative.
 *
 * @return an {@code int} which is the value of the {@code precision}
 *         setting
 */

public int getPrecision() { throw new RuntimeException("Stub!"); }

/**
 * Returns the roundingMode setting.
 * This will be one of
 * {@link java.math.RoundingMode#CEILING RoundingMode#CEILING},
 * {@link java.math.RoundingMode#DOWN RoundingMode#DOWN},
 * {@link java.math.RoundingMode#FLOOR RoundingMode#FLOOR},
 * {@link java.math.RoundingMode#HALF_DOWN RoundingMode#HALF_DOWN},
 * {@link java.math.RoundingMode#HALF_EVEN RoundingMode#HALF_EVEN},
 * {@link java.math.RoundingMode#HALF_UP RoundingMode#HALF_UP},
 * {@link java.math.RoundingMode#UNNECESSARY RoundingMode#UNNECESSARY}, or
 * {@link java.math.RoundingMode#UP RoundingMode#UP}.
 *
 * @return a {@code RoundingMode} object which is the value of the
 *         {@code roundingMode} setting
 */

public java.math.RoundingMode getRoundingMode() { throw new RuntimeException("Stub!"); }

/**
 * Compares this {@code MathContext} with the specified
 * {@code Object} for equality.
 *
 * @param  x {@code Object} to which this {@code MathContext} is to
 *         be compared.
 * @return {@code true} if and only if the specified {@code Object} is
 *         a {@code MathContext} object which has exactly the same
 *         settings as this object
 */

public boolean equals(java.lang.Object x) { throw new RuntimeException("Stub!"); }

/**
 * Returns the hash code for this {@code MathContext}.
 *
 * @return hash code for this {@code MathContext}
 */

public int hashCode() { throw new RuntimeException("Stub!"); }

/**
 * Returns the string representation of this {@code MathContext}.
 * The {@code String} returned represents the settings of the
 * {@code MathContext} object as two space-delimited words
 * (separated by a single space character, <tt>'&#92;u0020'</tt>,
 * and with no leading or trailing white space), as follows:
 * <ol>
 * <li>
 * The string {@code "precision="}, immediately followed
 * by the value of the precision setting as a numeric string as if
 * generated by the {@link java.lang.Integer#toString(int) Integer#toString(int)}
 * method.
 *
 * <li>
 * The string {@code "roundingMode="}, immediately
 * followed by the value of the {@code roundingMode} setting as a
 * word.  This word will be the same as the name of the
 * corresponding public constant in the {@link java.math.RoundingMode RoundingMode}
 * enum.
 * </ol>
 * <p>
 * For example:
 * <pre>
 * precision=9 roundingMode=HALF_UP
 * </pre>
 *
 * Additional words may be appended to the result of
 * {@code toString} in the future if more properties are added to
 * this class.
 *
 * @return a {@code String} representing the context settings
 */

public java.lang.String toString() { throw new RuntimeException("Stub!"); }

/**
 *  A {@code MathContext} object with a precision setting
 *  matching the IEEE 754R Decimal128 format, 34 digits, and a
 *  rounding mode of {@link java.math.RoundingMode#HALF_EVEN RoundingMode#HALF_EVEN}, the
 *  IEEE 754R default.
 */

public static final java.math.MathContext DECIMAL128;
static { DECIMAL128 = null; }

/**
 *  A {@code MathContext} object with a precision setting
 *  matching the IEEE 754R Decimal32 format, 7 digits, and a
 *  rounding mode of {@link java.math.RoundingMode#HALF_EVEN RoundingMode#HALF_EVEN}, the
 *  IEEE 754R default.
 */

public static final java.math.MathContext DECIMAL32;
static { DECIMAL32 = null; }

/**
 *  A {@code MathContext} object with a precision setting
 *  matching the IEEE 754R Decimal64 format, 16 digits, and a
 *  rounding mode of {@link java.math.RoundingMode#HALF_EVEN RoundingMode#HALF_EVEN}, the
 *  IEEE 754R default.
 */

public static final java.math.MathContext DECIMAL64;
static { DECIMAL64 = null; }

/**
 *  A {@code MathContext} object whose settings have the values
 *  required for unlimited precision arithmetic.
 *  The values of the settings are:
 *  <code>
 *  precision=0 roundingMode=HALF_UP
 *  </code>
 */

public static final java.math.MathContext UNLIMITED;
static { UNLIMITED = null; }
}

