/*
 * Copyright (c) 1996, 2019, Oracle and/or its affiliates. All rights reserved.
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
 * Portions Copyright IBM Corporation, 2001. All Rights Reserved.
 */


package java.math;


/**
 * Immutable, arbitrary-precision signed decimal numbers.  A
 * {@code BigDecimal} consists of an arbitrary precision integer
 * <i>unscaled value</i> and a 32-bit integer <i>scale</i>.  If zero
 * or positive, the scale is the number of digits to the right of the
 * decimal point.  If negative, the unscaled value of the number is
 * multiplied by ten to the power of the negation of the scale.  The
 * value of the number represented by the {@code BigDecimal} is
 * therefore <tt>(unscaledValue &times; 10<sup>-scale</sup>)</tt>.
 *
 * <p>The {@code BigDecimal} class provides operations for
 * arithmetic, scale manipulation, rounding, comparison, hashing, and
 * format conversion.  The {@link #toString} method provides a
 * canonical representation of a {@code BigDecimal}.
 *
 * <p>The {@code BigDecimal} class gives its user complete control
 * over rounding behavior.  If no rounding mode is specified and the
 * exact result cannot be represented, an exception is thrown;
 * otherwise, calculations can be carried out to a chosen precision
 * and rounding mode by supplying an appropriate {@link java.math.MathContext MathContext}
 * object to the operation.  In either case, eight <em>rounding
 * modes</em> are provided for the control of rounding.  Using the
 * integer fields in this class (such as {@link #ROUND_HALF_UP}) to
 * represent rounding mode is largely obsolete; the enumeration values
 * of the {@code RoundingMode} {@code enum}, (such as {@link java.math.RoundingMode#HALF_UP  }) should be used instead.
 *
 * <p>When a {@code MathContext} object is supplied with a precision
 * setting of 0 (for example, {@link java.math.MathContext#UNLIMITED MathContext#UNLIMITED}),
 * arithmetic operations are exact, as are the arithmetic methods
 * which take no {@code MathContext} object.  (This is the only
 * behavior that was supported in releases prior to 5.)  As a
 * corollary of computing the exact result, the rounding mode setting
 * of a {@code MathContext} object with a precision setting of 0 is
 * not used and thus irrelevant.  In the case of divide, the exact
 * quotient could have an infinitely long decimal expansion; for
 * example, 1 divided by 3.  If the quotient has a nonterminating
 * decimal expansion and the operation is specified to return an exact
 * result, an {@code ArithmeticException} is thrown.  Otherwise, the
 * exact result of the division is returned, as done for other
 * operations.
 *
 * <p>When the precision setting is not 0, the rules of
 * {@code BigDecimal} arithmetic are broadly compatible with selected
 * modes of operation of the arithmetic defined in ANSI X3.274-1996
 * and ANSI X3.274-1996/AM 1-2000 (section 7.4).  Unlike those
 * standards, {@code BigDecimal} includes many rounding modes, which
 * were mandatory for division in {@code BigDecimal} releases prior
 * to 5.  Any conflicts between these ANSI standards and the
 * {@code BigDecimal} specification are resolved in favor of
 * {@code BigDecimal}.
 *
 * <p>Since the same numerical value can have different
 * representations (with different scales), the rules of arithmetic
 * and rounding must specify both the numerical result and the scale
 * used in the result's representation.
 *
 *
 * <p>In general the rounding modes and precision setting determine
 * how operations return results with a limited number of digits when
 * the exact result has more digits (perhaps infinitely many in the
 * case of division) than the number of digits returned.
 *
 * First, the
 * total number of digits to return is specified by the
 * {@code MathContext}'s {@code precision} setting; this determines
 * the result's <i>precision</i>.  The digit count starts from the
 * leftmost nonzero digit of the exact result.  The rounding mode
 * determines how any discarded trailing digits affect the returned
 * result.
 *
 * <p>For all arithmetic operators , the operation is carried out as
 * though an exact intermediate result were first calculated and then
 * rounded to the number of digits specified by the precision setting
 * (if necessary), using the selected rounding mode.  If the exact
 * result is not returned, some digit positions of the exact result
 * are discarded.  When rounding increases the magnitude of the
 * returned result, it is possible for a new digit position to be
 * created by a carry propagating to a leading {@literal "9"} digit.
 * For example, rounding the value 999.9 to three digits rounding up
 * would be numerically equal to one thousand, represented as
 * 100&times;10<sup>1</sup>.  In such cases, the new {@literal "1"} is
 * the leading digit position of the returned result.
 *
 * <p>Besides a logical exact result, each arithmetic operation has a
 * preferred scale for representing a result.  The preferred
 * scale for each operation is listed in the table below.
 *
 * <table border>
 * <caption><b>Preferred Scales for Results of Arithmetic Operations
 * </b></caption>
 * <tr><th>Operation</th><th>Preferred Scale of Result</th></tr>
 * <tr><td>Add</td><td>max(addend.scale(), augend.scale())</td>
 * <tr><td>Subtract</td><td>max(minuend.scale(), subtrahend.scale())</td>
 * <tr><td>Multiply</td><td>multiplier.scale() + multiplicand.scale()</td>
 * <tr><td>Divide</td><td>dividend.scale() - divisor.scale()</td>
 * </table>
 *
 * These scales are the ones used by the methods which return exact
 * arithmetic results; except that an exact divide may have to use a
 * larger scale since the exact result may have more digits.  For
 * example, {@code 1/32} is {@code 0.03125}.
 *
 * <p>Before rounding, the scale of the logical exact intermediate
 * result is the preferred scale for that operation.  If the exact
 * numerical result cannot be represented in {@code precision}
 * digits, rounding selects the set of digits to return and the scale
 * of the result is reduced from the scale of the intermediate result
 * to the least scale which can represent the {@code precision}
 * digits actually returned.  If the exact result can be represented
 * with at most {@code precision} digits, the representation
 * of the result with the scale closest to the preferred scale is
 * returned.  In particular, an exactly representable quotient may be
 * represented in fewer than {@code precision} digits by removing
 * trailing zeros and decreasing the scale.  For example, rounding to
 * three digits using the {@linkplain java.math.RoundingMode#FLOOR floor}
 * rounding mode, <br>
 *
 * {@code 19/100 = 0.19   // integer=19,  scale=2} <br>
 *
 * but<br>
 *
 * {@code 21/110 = 0.190  // integer=190, scale=3} <br>
 *
 * <p>Note that for add, subtract, and multiply, the reduction in
 * scale will equal the number of digit positions of the exact result
 * which are discarded. If the rounding causes a carry propagation to
 * create a new high-order digit position, an additional digit of the
 * result is discarded than when no new digit position is created.
 *
 * <p>Other methods may have slightly different rounding semantics.
 * For example, the result of the {@code pow} method using the
 * {@linkplain #pow(int,java.math.MathContext) specified algorithm} can
 * occasionally differ from the rounded mathematical result by more
 * than one unit in the last place, one <i>{@linkplain #ulp() ulp}</i>.
 *
 * <p>Two types of operations are provided for manipulating the scale
 * of a {@code BigDecimal}: scaling/rounding operations and decimal
 * point motion operations.  Scaling/rounding operations ({@link
 * #setScale setScale} and {@link #round round}) return a
 * {@code BigDecimal} whose value is approximately (or exactly) equal
 * to that of the operand, but whose scale or precision is the
 * specified value; that is, they increase or decrease the precision
 * of the stored number with minimal effect on its value.  Decimal
 * point motion operations ({@link #movePointLeft movePointLeft} and
 * {@link #movePointRight movePointRight}) return a
 * {@code BigDecimal} created from the operand by moving the decimal
 * point a specified distance in the specified direction.
 *
 * <p>For the sake of brevity and clarity, pseudo-code is used
 * throughout the descriptions of {@code BigDecimal} methods.  The
 * pseudo-code expression {@code (i + j)} is shorthand for "a
 * {@code BigDecimal} whose value is that of the {@code BigDecimal}
 * {@code i} added to that of the {@code BigDecimal}
 * {@code j}." The pseudo-code expression {@code (i == j)} is
 * shorthand for "{@code true} if and only if the
 * {@code BigDecimal} {@code i} represents the same value as the
 * {@code BigDecimal} {@code j}." Other pseudo-code expressions
 * are interpreted similarly.  Square brackets are used to represent
 * the particular {@code BigInteger} and scale pair defining a
 * {@code BigDecimal} value; for example [19, 2] is the
 * {@code BigDecimal} numerically equal to 0.19 having a scale of 2.
 *
 * <p>Note: care should be exercised if {@code BigDecimal} objects
 * are used as keys in a {@link java.util.SortedMap SortedMap} or
 * elements in a {@link java.util.SortedSet SortedSet} since
 * {@code BigDecimal}'s <i>natural ordering</i> is <i>inconsistent
 * with equals</i>.  See {@link java.lang.Comparable Comparable}, {@link
 * java.util.SortedMap} or {@link java.util.SortedSet} for more
 * information.
 *
 * <p>All methods and constructors for this class throw
 * {@code NullPointerException} when passed a {@code null} object
 * reference for any input parameter.
 *
 * @see     java.math.BigInteger
 * @see     java.math.MathContext
 * @see     java.math.RoundingMode
 * @see     java.util.SortedMap
 * @see     java.util.SortedSet
 * @author  Josh Bloch
 * @author  Mike Cowlishaw
 * @author  Joseph D. Darcy
 * @author  Sergey V. Kuksenko
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class BigDecimal extends java.lang.Number implements java.lang.Comparable<java.math.BigDecimal> {

/**
 * Translates a character array representation of a
 * {@code BigDecimal} into a {@code BigDecimal}, accepting the
 * same sequence of characters as the {@link #BigDecimal(java.lang.String)}
 * constructor, while allowing a sub-array to be specified.
 *
 * <p>Note that if the sequence of characters is already available
 * within a character array, using this constructor is faster than
 * converting the {@code char} array to string and using the
 * {@code BigDecimal(String)} constructor .
 *
 * @param  in {@code char} array that is the source of characters.
 * @param  offset first character in the array to inspect.
 * @param  len number of characters to consider.
 * @throws java.lang.NumberFormatException if {@code in} is not a valid
 *         representation of a {@code BigDecimal} or the defined subarray
 *         is not wholly within {@code in}.
 * @since  1.5
 */

public BigDecimal(char[] in, int offset, int len) { throw new RuntimeException("Stub!"); }

/**
 * Translates a character array representation of a
 * {@code BigDecimal} into a {@code BigDecimal}, accepting the
 * same sequence of characters as the {@link #BigDecimal(java.lang.String)}
 * constructor, while allowing a sub-array to be specified and
 * with rounding according to the context settings.
 *
 * <p>Note that if the sequence of characters is already available
 * within a character array, using this constructor is faster than
 * converting the {@code char} array to string and using the
 * {@code BigDecimal(String)} constructor .
 *
 * @param  in {@code char} array that is the source of characters.
 * @param  offset first character in the array to inspect.
 * @param  len number of characters to consider..
 * @param  mc the context to use.
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         rounding mode is {@code UNNECESSARY}.
 * @throws java.lang.NumberFormatException if {@code in} is not a valid
 *         representation of a {@code BigDecimal} or the defined subarray
 *         is not wholly within {@code in}.
 * @since  1.5
 */

public BigDecimal(char[] in, int offset, int len, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Translates a character array representation of a
 * {@code BigDecimal} into a {@code BigDecimal}, accepting the
 * same sequence of characters as the {@link #BigDecimal(java.lang.String)}
 * constructor.
 *
 * <p>Note that if the sequence of characters is already available
 * as a character array, using this constructor is faster than
 * converting the {@code char} array to string and using the
 * {@code BigDecimal(String)} constructor .
 *
 * @param in {@code char} array that is the source of characters.
 * @throws java.lang.NumberFormatException if {@code in} is not a valid
 *         representation of a {@code BigDecimal}.
 * @since  1.5
 */

public BigDecimal(char[] in) { throw new RuntimeException("Stub!"); }

/**
 * Translates a character array representation of a
 * {@code BigDecimal} into a {@code BigDecimal}, accepting the
 * same sequence of characters as the {@link #BigDecimal(java.lang.String)}
 * constructor and with rounding according to the context
 * settings.
 *
 * <p>Note that if the sequence of characters is already available
 * as a character array, using this constructor is faster than
 * converting the {@code char} array to string and using the
 * {@code BigDecimal(String)} constructor .
 *
 * @param  in {@code char} array that is the source of characters.
 * @param  mc the context to use.
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         rounding mode is {@code UNNECESSARY}.
 * @throws java.lang.NumberFormatException if {@code in} is not a valid
 *         representation of a {@code BigDecimal}.
 * @since  1.5
 */

public BigDecimal(char[] in, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Translates the string representation of a {@code BigDecimal}
 * into a {@code BigDecimal}.  The string representation consists
 * of an optional sign, {@code '+'} (<tt> '&#92;u002B'</tt>) or
 * {@code '-'} (<tt>'&#92;u002D'</tt>), followed by a sequence of
 * zero or more decimal digits ("the integer"), optionally
 * followed by a fraction, optionally followed by an exponent.
 *
 * <p>The fraction consists of a decimal point followed by zero
 * or more decimal digits.  The string must contain at least one
 * digit in either the integer or the fraction.  The number formed
 * by the sign, the integer and the fraction is referred to as the
 * <i>significand</i>.
 *
 * <p>The exponent consists of the character {@code 'e'}
 * (<tt>'&#92;u0065'</tt>) or {@code 'E'} (<tt>'&#92;u0045'</tt>)
 * followed by one or more decimal digits.  The value of the
 * exponent must lie between -{@link java.lang.Integer#MAX_VALUE Integer#MAX_VALUE} ({@link java.lang.Integer#MIN_VALUE  }+1) and {@link java.lang.Integer#MAX_VALUE Integer#MAX_VALUE}, inclusive.
 *
 * <p>More formally, the strings this constructor accepts are
 * described by the following grammar:
 * <blockquote>
 * <dl>
 * <dt><i>BigDecimalString:</i>
 * <dd><i>Sign<sub>opt</sub> Significand Exponent<sub>opt</sub></i>
 * <dt><i>Sign:</i>
 * <dd>{@code +}
 * <dd>{@code -}
 * <dt><i>Significand:</i>
 * <dd><i>IntegerPart</i> {@code .} <i>FractionPart<sub>opt</sub></i>
 * <dd>{@code .} <i>FractionPart</i>
 * <dd><i>IntegerPart</i>
 * <dt><i>IntegerPart:</i>
 * <dd><i>Digits</i>
 * <dt><i>FractionPart:</i>
 * <dd><i>Digits</i>
 * <dt><i>Exponent:</i>
 * <dd><i>ExponentIndicator SignedInteger</i>
 * <dt><i>ExponentIndicator:</i>
 * <dd>{@code e}
 * <dd>{@code E}
 * <dt><i>SignedInteger:</i>
 * <dd><i>Sign<sub>opt</sub> Digits</i>
 * <dt><i>Digits:</i>
 * <dd><i>Digit</i>
 * <dd><i>Digits Digit</i>
 * <dt><i>Digit:</i>
 * <dd>any character for which {@link java.lang.Character#isDigit Character#isDigit}
 * returns {@code true}, including 0, 1, 2 ...
 * </dl>
 * </blockquote>
 *
 * <p>The scale of the returned {@code BigDecimal} will be the
 * number of digits in the fraction, or zero if the string
 * contains no decimal point, subject to adjustment for any
 * exponent; if the string contains an exponent, the exponent is
 * subtracted from the scale.  The value of the resulting scale
 * must lie between {@code Integer.MIN_VALUE} and
 * {@code Integer.MAX_VALUE}, inclusive.
 *
 * <p>The character-to-digit mapping is provided by {@link
 * java.lang.Character#digit} set to convert to radix 10.  The
 * String may not contain any extraneous characters (whitespace,
 * for example).
 *
 * <p><b>Examples:</b><br>
 * The value of the returned {@code BigDecimal} is equal to
 * <i>significand</i> &times; 10<sup>&nbsp;<i>exponent</i></sup>.
 * For each string on the left, the resulting representation
 * [{@code BigInteger}, {@code scale}] is shown on the right.
 * <pre>
 * "0"            [0,0]
 * "0.00"         [0,2]
 * "123"          [123,0]
 * "-123"         [-123,0]
 * "1.23E3"       [123,-1]
 * "1.23E+3"      [123,-1]
 * "12.3E+7"      [123,-6]
 * "12.0"         [120,1]
 * "12.3"         [123,1]
 * "0.00123"      [123,5]
 * "-1.23E-12"    [-123,14]
 * "1234.5E-4"    [12345,5]
 * "0E+7"         [0,-7]
 * "-0"           [0,0]
 * </pre>
 *
 * <p>Note: For values other than {@code float} and
 * {@code double} NaN and &plusmn;Infinity, this constructor is
 * compatible with the values returned by {@link java.lang.Float#toString Float#toString}
 * and {@link java.lang.Double#toString Double#toString}.  This is generally the preferred
 * way to convert a {@code float} or {@code double} into a
 * BigDecimal, as it doesn't suffer from the unpredictability of
 * the {@link #BigDecimal(double)} constructor.
 *
 * @param val String representation of {@code BigDecimal}.
 *
 * @throws java.lang.NumberFormatException if {@code val} is not a valid
 *         representation of a {@code BigDecimal}.
 */

public BigDecimal(java.lang.String val) { throw new RuntimeException("Stub!"); }

/**
 * Translates the string representation of a {@code BigDecimal}
 * into a {@code BigDecimal}, accepting the same strings as the
 * {@link #BigDecimal(java.lang.String)} constructor, with rounding
 * according to the context settings.
 *
 * @param  val string representation of a {@code BigDecimal}.
 * @param  mc the context to use.
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         rounding mode is {@code UNNECESSARY}.
 * @throws java.lang.NumberFormatException if {@code val} is not a valid
 *         representation of a BigDecimal.
 * @since  1.5
 */

public BigDecimal(java.lang.String val, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Translates a {@code double} into a {@code BigDecimal} which
 * is the exact decimal representation of the {@code double}'s
 * binary floating-point value.  The scale of the returned
 * {@code BigDecimal} is the smallest value such that
 * <tt>(10<sup>scale</sup> &times; val)</tt> is an integer.
 * <p>
 * <b>Notes:</b>
 * <ol>
 * <li>
 * The results of this constructor can be somewhat unpredictable.
 * One might assume that writing {@code new BigDecimal(0.1)} in
 * Java creates a {@code BigDecimal} which is exactly equal to
 * 0.1 (an unscaled value of 1, with a scale of 1), but it is
 * actually equal to
 * 0.1000000000000000055511151231257827021181583404541015625.
 * This is because 0.1 cannot be represented exactly as a
 * {@code double} (or, for that matter, as a binary fraction of
 * any finite length).  Thus, the value that is being passed
 * <i>in</i> to the constructor is not exactly equal to 0.1,
 * appearances notwithstanding.
 *
 * <li>
 * The {@code String} constructor, on the other hand, is
 * perfectly predictable: writing {@code new BigDecimal("0.1")}
 * creates a {@code BigDecimal} which is <i>exactly</i> equal to
 * 0.1, as one would expect.  Therefore, it is generally
 * recommended that the {@linkplain #BigDecimal(java.lang.String)
 * <tt>String</tt> constructor} be used in preference to this one.
 *
 * <li>
 * When a {@code double} must be used as a source for a
 * {@code BigDecimal}, note that this constructor provides an
 * exact conversion; it does not give the same result as
 * converting the {@code double} to a {@code String} using the
 * {@link java.lang.Double#toString(double) Double#toString(double)} method and then using the
 * {@link #BigDecimal(java.lang.String)} constructor.  To get that result,
 * use the {@code static} {@link #valueOf(double)} method.
 * </ol>
 *
 * @param val {@code double} value to be converted to
 *        {@code BigDecimal}.
 * @throws java.lang.NumberFormatException if {@code val} is infinite or NaN.
 */

public BigDecimal(double val) { throw new RuntimeException("Stub!"); }

/**
 * Translates a {@code double} into a {@code BigDecimal}, with
 * rounding according to the context settings.  The scale of the
 * {@code BigDecimal} is the smallest value such that
 * <tt>(10<sup>scale</sup> &times; val)</tt> is an integer.
 *
 * <p>The results of this constructor can be somewhat unpredictable
 * and its use is generally not recommended; see the notes under
 * the {@link #BigDecimal(double)} constructor.
 *
 * @param  val {@code double} value to be converted to
 *         {@code BigDecimal}.
 * @param  mc the context to use.
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         RoundingMode is UNNECESSARY.
 * @throws java.lang.NumberFormatException if {@code val} is infinite or NaN.
 * @since  1.5
 */

public BigDecimal(double val, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Translates a {@code BigInteger} into a {@code BigDecimal}.
 * The scale of the {@code BigDecimal} is zero.
 *
 * @param val {@code BigInteger} value to be converted to
 *            {@code BigDecimal}.
 */

public BigDecimal(java.math.BigInteger val) { throw new RuntimeException("Stub!"); }

/**
 * Translates a {@code BigInteger} into a {@code BigDecimal}
 * rounding according to the context settings.  The scale of the
 * {@code BigDecimal} is zero.
 *
 * @param val {@code BigInteger} value to be converted to
 *            {@code BigDecimal}.
 * @param  mc the context to use.
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         rounding mode is {@code UNNECESSARY}.
 * @since  1.5
 */

public BigDecimal(java.math.BigInteger val, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Translates a {@code BigInteger} unscaled value and an
 * {@code int} scale into a {@code BigDecimal}.  The value of
 * the {@code BigDecimal} is
 * <tt>(unscaledVal &times; 10<sup>-scale</sup>)</tt>.
 *
 * @param unscaledVal unscaled value of the {@code BigDecimal}.
 * @param scale scale of the {@code BigDecimal}.
 */

public BigDecimal(java.math.BigInteger unscaledVal, int scale) { throw new RuntimeException("Stub!"); }

/**
 * Translates a {@code BigInteger} unscaled value and an
 * {@code int} scale into a {@code BigDecimal}, with rounding
 * according to the context settings.  The value of the
 * {@code BigDecimal} is <tt>(unscaledVal &times;
 * 10<sup>-scale</sup>)</tt>, rounded according to the
 * {@code precision} and rounding mode settings.
 *
 * @param  unscaledVal unscaled value of the {@code BigDecimal}.
 * @param  scale scale of the {@code BigDecimal}.
 * @param  mc the context to use.
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         rounding mode is {@code UNNECESSARY}.
 * @since  1.5
 */

public BigDecimal(java.math.BigInteger unscaledVal, int scale, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Translates an {@code int} into a {@code BigDecimal}.  The
 * scale of the {@code BigDecimal} is zero.
 *
 * @param val {@code int} value to be converted to
 *            {@code BigDecimal}.
 * @since  1.5
 */

public BigDecimal(int val) { throw new RuntimeException("Stub!"); }

/**
 * Translates an {@code int} into a {@code BigDecimal}, with
 * rounding according to the context settings.  The scale of the
 * {@code BigDecimal}, before any rounding, is zero.
 *
 * @param  val {@code int} value to be converted to {@code BigDecimal}.
 * @param  mc the context to use.
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         rounding mode is {@code UNNECESSARY}.
 * @since  1.5
 */

public BigDecimal(int val, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Translates a {@code long} into a {@code BigDecimal}.  The
 * scale of the {@code BigDecimal} is zero.
 *
 * @param val {@code long} value to be converted to {@code BigDecimal}.
 * @since  1.5
 */

public BigDecimal(long val) { throw new RuntimeException("Stub!"); }

/**
 * Translates a {@code long} into a {@code BigDecimal}, with
 * rounding according to the context settings.  The scale of the
 * {@code BigDecimal}, before any rounding, is zero.
 *
 * @param  val {@code long} value to be converted to {@code BigDecimal}.
 * @param  mc the context to use.
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         rounding mode is {@code UNNECESSARY}.
 * @since  1.5
 */

public BigDecimal(long val, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Translates a {@code long} unscaled value and an
 * {@code int} scale into a {@code BigDecimal}.  This
 * {@literal "static factory method"} is provided in preference to
 * a ({@code long}, {@code int}) constructor because it
 * allows for reuse of frequently used {@code BigDecimal} values..
 *
 * @param unscaledVal unscaled value of the {@code BigDecimal}.
 * @param scale scale of the {@code BigDecimal}.
 * @return a {@code BigDecimal} whose value is
 *         <tt>(unscaledVal &times; 10<sup>-scale</sup>)</tt>.
 */

public static java.math.BigDecimal valueOf(long unscaledVal, int scale) { throw new RuntimeException("Stub!"); }

/**
 * Translates a {@code long} value into a {@code BigDecimal}
 * with a scale of zero.  This {@literal "static factory method"}
 * is provided in preference to a ({@code long}) constructor
 * because it allows for reuse of frequently used
 * {@code BigDecimal} values.
 *
 * @param val value of the {@code BigDecimal}.
 * @return a {@code BigDecimal} whose value is {@code val}.
 */

public static java.math.BigDecimal valueOf(long val) { throw new RuntimeException("Stub!"); }

/**
 * Translates a {@code double} into a {@code BigDecimal}, using
 * the {@code double}'s canonical string representation provided
 * by the {@link java.lang.Double#toString(double) Double#toString(double)} method.
 *
 * <p><b>Note:</b> This is generally the preferred way to convert
 * a {@code double} (or {@code float}) into a
 * {@code BigDecimal}, as the value returned is equal to that
 * resulting from constructing a {@code BigDecimal} from the
 * result of using {@link java.lang.Double#toString(double) Double#toString(double)}.
 *
 * @param  val {@code double} to convert to a {@code BigDecimal}.
 * @return a {@code BigDecimal} whose value is equal to or approximately
 *         equal to the value of {@code val}.
 * @throws java.lang.NumberFormatException if {@code val} is infinite or NaN.
 * @since  1.5
 */

public static java.math.BigDecimal valueOf(double val) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is {@code (this +
 * augend)}, and whose scale is {@code max(this.scale(),
 * augend.scale())}.
 *
 * @param  augend value to be added to this {@code BigDecimal}.
 * @return {@code this + augend}
 */

public java.math.BigDecimal add(java.math.BigDecimal augend) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is {@code (this + augend)},
 * with rounding according to the context settings.
 *
 * If either number is zero and the precision setting is nonzero then
 * the other number, rounded if necessary, is used as the result.
 *
 * @param  augend value to be added to this {@code BigDecimal}.
 * @param  mc the context to use.
 * @return {@code this + augend}, rounded as necessary.
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         rounding mode is {@code UNNECESSARY}.
 * @since  1.5
 */

public java.math.BigDecimal add(java.math.BigDecimal augend, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is {@code (this -
 * subtrahend)}, and whose scale is {@code max(this.scale(),
 * subtrahend.scale())}.
 *
 * @param  subtrahend value to be subtracted from this {@code BigDecimal}.
 * @return {@code this - subtrahend}
 */

public java.math.BigDecimal subtract(java.math.BigDecimal subtrahend) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is {@code (this - subtrahend)},
 * with rounding according to the context settings.
 *
 * If {@code subtrahend} is zero then this, rounded if necessary, is used as the
 * result.  If this is zero then the result is {@code subtrahend.negate(mc)}.
 *
 * @param  subtrahend value to be subtracted from this {@code BigDecimal}.
 * @param  mc the context to use.
 * @return {@code this - subtrahend}, rounded as necessary.
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         rounding mode is {@code UNNECESSARY}.
 * @since  1.5
 */

public java.math.BigDecimal subtract(java.math.BigDecimal subtrahend, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is <tt>(this &times;
 * multiplicand)</tt>, and whose scale is {@code (this.scale() +
 * multiplicand.scale())}.
 *
 * @param  multiplicand value to be multiplied by this {@code BigDecimal}.
 * @return {@code this * multiplicand}
 */

public java.math.BigDecimal multiply(java.math.BigDecimal multiplicand) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is <tt>(this &times;
 * multiplicand)</tt>, with rounding according to the context settings.
 *
 * @param  multiplicand value to be multiplied by this {@code BigDecimal}.
 * @param  mc the context to use.
 * @return {@code this * multiplicand}, rounded as necessary.
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         rounding mode is {@code UNNECESSARY}.
 * @since  1.5
 */

public java.math.BigDecimal multiply(java.math.BigDecimal multiplicand, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is {@code (this /
 * divisor)}, and whose scale is as specified.  If rounding must
 * be performed to generate a result with the specified scale, the
 * specified rounding mode is applied.
 *
 * <p>The new {@link #divide(java.math.BigDecimal,int,java.math.RoundingMode)} method
 * should be used in preference to this legacy method.
 *
 * @param  divisor value by which this {@code BigDecimal} is to be divided.
 * @param  scale scale of the {@code BigDecimal} quotient to be returned.
 * @param  roundingMode rounding mode to apply.
 * @return {@code this / divisor}
 * @throws java.lang.ArithmeticException if {@code divisor} is zero,
 *         {@code roundingMode==ROUND_UNNECESSARY} and
 *         the specified scale is insufficient to represent the result
 *         of the division exactly.
 * @throws java.lang.IllegalArgumentException if {@code roundingMode} does not
 *         represent a valid rounding mode.
 * @see    #ROUND_UP
 * @see    #ROUND_DOWN
 * @see    #ROUND_CEILING
 * @see    #ROUND_FLOOR
 * @see    #ROUND_HALF_UP
 * @see    #ROUND_HALF_DOWN
 * @see    #ROUND_HALF_EVEN
 * @see    #ROUND_UNNECESSARY
 */

public java.math.BigDecimal divide(java.math.BigDecimal divisor, int scale, int roundingMode) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is {@code (this /
 * divisor)}, and whose scale is as specified.  If rounding must
 * be performed to generate a result with the specified scale, the
 * specified rounding mode is applied.
 *
 * @param  divisor value by which this {@code BigDecimal} is to be divided.
 * @param  scale scale of the {@code BigDecimal} quotient to be returned.
 * @param  roundingMode rounding mode to apply.
 * @return {@code this / divisor}
 * @throws java.lang.ArithmeticException if {@code divisor} is zero,
 *         {@code roundingMode==RoundingMode.UNNECESSARY} and
 *         the specified scale is insufficient to represent the result
 *         of the division exactly.
 * @since 1.5
 */

public java.math.BigDecimal divide(java.math.BigDecimal divisor, int scale, java.math.RoundingMode roundingMode) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is {@code (this /
 * divisor)}, and whose scale is {@code this.scale()}.  If
 * rounding must be performed to generate a result with the given
 * scale, the specified rounding mode is applied.
 *
 * <p>The new {@link #divide(java.math.BigDecimal,java.math.RoundingMode)} method
 * should be used in preference to this legacy method.
 *
 * @param  divisor value by which this {@code BigDecimal} is to be divided.
 * @param  roundingMode rounding mode to apply.
 * @return {@code this / divisor}
 * @throws java.lang.ArithmeticException if {@code divisor==0}, or
 *         {@code roundingMode==ROUND_UNNECESSARY} and
 *         {@code this.scale()} is insufficient to represent the result
 *         of the division exactly.
 * @throws java.lang.IllegalArgumentException if {@code roundingMode} does not
 *         represent a valid rounding mode.
 * @see    #ROUND_UP
 * @see    #ROUND_DOWN
 * @see    #ROUND_CEILING
 * @see    #ROUND_FLOOR
 * @see    #ROUND_HALF_UP
 * @see    #ROUND_HALF_DOWN
 * @see    #ROUND_HALF_EVEN
 * @see    #ROUND_UNNECESSARY
 */

public java.math.BigDecimal divide(java.math.BigDecimal divisor, int roundingMode) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is {@code (this /
 * divisor)}, and whose scale is {@code this.scale()}.  If
 * rounding must be performed to generate a result with the given
 * scale, the specified rounding mode is applied.
 *
 * @param  divisor value by which this {@code BigDecimal} is to be divided.
 * @param  roundingMode rounding mode to apply.
 * @return {@code this / divisor}
 * @throws java.lang.ArithmeticException if {@code divisor==0}, or
 *         {@code roundingMode==RoundingMode.UNNECESSARY} and
 *         {@code this.scale()} is insufficient to represent the result
 *         of the division exactly.
 * @since 1.5
 */

public java.math.BigDecimal divide(java.math.BigDecimal divisor, java.math.RoundingMode roundingMode) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is {@code (this /
 * divisor)}, and whose preferred scale is {@code (this.scale() -
 * divisor.scale())}; if the exact quotient cannot be
 * represented (because it has a non-terminating decimal
 * expansion) an {@code ArithmeticException} is thrown.
 *
 * @param  divisor value by which this {@code BigDecimal} is to be divided.
 * @throws java.lang.ArithmeticException if the exact quotient does not have a
 *         terminating decimal expansion
 * @return {@code this / divisor}
 * @since 1.5
 * @author Joseph D. Darcy
 */

public java.math.BigDecimal divide(java.math.BigDecimal divisor) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is {@code (this /
 * divisor)}, with rounding according to the context settings.
 *
 * @param  divisor value by which this {@code BigDecimal} is to be divided.
 * @param  mc the context to use.
 * @return {@code this / divisor}, rounded as necessary.
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         rounding mode is {@code UNNECESSARY} or
 *         {@code mc.precision == 0} and the quotient has a
 *         non-terminating decimal expansion.
 * @since  1.5
 */

public java.math.BigDecimal divide(java.math.BigDecimal divisor, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is the integer part
 * of the quotient {@code (this / divisor)} rounded down.  The
 * preferred scale of the result is {@code (this.scale() -
 * divisor.scale())}.
 *
 * @param  divisor value by which this {@code BigDecimal} is to be divided.
 * @return The integer part of {@code this / divisor}.
 * @throws java.lang.ArithmeticException if {@code divisor==0}
 * @since  1.5
 */

public java.math.BigDecimal divideToIntegralValue(java.math.BigDecimal divisor) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is the integer part
 * of {@code (this / divisor)}.  Since the integer part of the
 * exact quotient does not depend on the rounding mode, the
 * rounding mode does not affect the values returned by this
 * method.  The preferred scale of the result is
 * {@code (this.scale() - divisor.scale())}.  An
 * {@code ArithmeticException} is thrown if the integer part of
 * the exact quotient needs more than {@code mc.precision}
 * digits.
 *
 * @param  divisor value by which this {@code BigDecimal} is to be divided.
 * @param  mc the context to use.
 * @return The integer part of {@code this / divisor}.
 * @throws java.lang.ArithmeticException if {@code divisor==0}
 * @throws java.lang.ArithmeticException if {@code mc.precision} {@literal >} 0 and the result
 *         requires a precision of more than {@code mc.precision} digits.
 * @since  1.5
 * @author Joseph D. Darcy
 */

public java.math.BigDecimal divideToIntegralValue(java.math.BigDecimal divisor, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is {@code (this % divisor)}.
 *
 * <p>The remainder is given by
 * {@code this.subtract(this.divideToIntegralValue(divisor).multiply(divisor))}.
 * Note that this is not the modulo operation (the result can be
 * negative).
 *
 * @param  divisor value by which this {@code BigDecimal} is to be divided.
 * @return {@code this % divisor}.
 * @throws java.lang.ArithmeticException if {@code divisor==0}
 * @since  1.5
 */

public java.math.BigDecimal remainder(java.math.BigDecimal divisor) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is {@code (this %
 * divisor)}, with rounding according to the context settings.
 * The {@code MathContext} settings affect the implicit divide
 * used to compute the remainder.  The remainder computation
 * itself is by definition exact.  Therefore, the remainder may
 * contain more than {@code mc.getPrecision()} digits.
 *
 * <p>The remainder is given by
 * {@code this.subtract(this.divideToIntegralValue(divisor,
 * mc).multiply(divisor))}.  Note that this is not the modulo
 * operation (the result can be negative).
 *
 * @param  divisor value by which this {@code BigDecimal} is to be divided.
 * @param  mc the context to use.
 * @return {@code this % divisor}, rounded as necessary.
 * @throws java.lang.ArithmeticException if {@code divisor==0}
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         rounding mode is {@code UNNECESSARY}, or {@code mc.precision}
 *         {@literal >} 0 and the result of {@code this.divideToIntgralValue(divisor)} would
 *         require a precision of more than {@code mc.precision} digits.
 * @see    #divideToIntegralValue(java.math.BigDecimal, java.math.MathContext)
 * @since  1.5
 */

public java.math.BigDecimal remainder(java.math.BigDecimal divisor, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Returns a two-element {@code BigDecimal} array containing the
 * result of {@code divideToIntegralValue} followed by the result of
 * {@code remainder} on the two operands.
 *
 * <p>Note that if both the integer quotient and remainder are
 * needed, this method is faster than using the
 * {@code divideToIntegralValue} and {@code remainder} methods
 * separately because the division need only be carried out once.
 *
 * @param  divisor value by which this {@code BigDecimal} is to be divided,
 *         and the remainder computed.
 * @return a two element {@code BigDecimal} array: the quotient
 *         (the result of {@code divideToIntegralValue}) is the initial element
 *         and the remainder is the final element.
 * @throws java.lang.ArithmeticException if {@code divisor==0}
 * @see    #divideToIntegralValue(java.math.BigDecimal, java.math.MathContext)
 * @see    #remainder(java.math.BigDecimal, java.math.MathContext)
 * @since  1.5
 */

public java.math.BigDecimal[] divideAndRemainder(java.math.BigDecimal divisor) { throw new RuntimeException("Stub!"); }

/**
 * Returns a two-element {@code BigDecimal} array containing the
 * result of {@code divideToIntegralValue} followed by the result of
 * {@code remainder} on the two operands calculated with rounding
 * according to the context settings.
 *
 * <p>Note that if both the integer quotient and remainder are
 * needed, this method is faster than using the
 * {@code divideToIntegralValue} and {@code remainder} methods
 * separately because the division need only be carried out once.
 *
 * @param  divisor value by which this {@code BigDecimal} is to be divided,
 *         and the remainder computed.
 * @param  mc the context to use.
 * @return a two element {@code BigDecimal} array: the quotient
 *         (the result of {@code divideToIntegralValue}) is the
 *         initial element and the remainder is the final element.
 * @throws java.lang.ArithmeticException if {@code divisor==0}
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         rounding mode is {@code UNNECESSARY}, or {@code mc.precision}
 *         {@literal >} 0 and the result of {@code this.divideToIntgralValue(divisor)} would
 *         require a precision of more than {@code mc.precision} digits.
 * @see    #divideToIntegralValue(java.math.BigDecimal, java.math.MathContext)
 * @see    #remainder(java.math.BigDecimal, java.math.MathContext)
 * @since  1.5
 */

public java.math.BigDecimal[] divideAndRemainder(java.math.BigDecimal divisor, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is
 * <tt>(this<sup>n</sup>)</tt>, The power is computed exactly, to
 * unlimited precision.
 *
 * <p>The parameter {@code n} must be in the range 0 through
 * 999999999, inclusive.  {@code ZERO.pow(0)} returns {@link
 * #ONE}.
 *
 * Note that future releases may expand the allowable exponent
 * range of this method.
 *
 * @param  n power to raise this {@code BigDecimal} to.
 * @return <tt>this<sup>n</sup></tt>
 * @throws java.lang.ArithmeticException if {@code n} is out of range.
 * @since  1.5
 */

public java.math.BigDecimal pow(int n) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is
 * <tt>(this<sup>n</sup>)</tt>.  The current implementation uses
 * the core algorithm defined in ANSI standard X3.274-1996 with
 * rounding according to the context settings.  In general, the
 * returned numerical value is within two ulps of the exact
 * numerical value for the chosen precision.  Note that future
 * releases may use a different algorithm with a decreased
 * allowable error bound and increased allowable exponent range.
 *
 * <p>The X3.274-1996 algorithm is:
 *
 * <ul>
 * <li> An {@code ArithmeticException} exception is thrown if
 *  <ul>
 *    <li>{@code abs(n) > 999999999}
 *    <li>{@code mc.precision == 0} and {@code n < 0}
 *    <li>{@code mc.precision > 0} and {@code n} has more than
 *    {@code mc.precision} decimal digits
 *  </ul>
 *
 * <li> if {@code n} is zero, {@link #ONE} is returned even if
 * {@code this} is zero, otherwise
 * <ul>
 *   <li> if {@code n} is positive, the result is calculated via
 *   the repeated squaring technique into a single accumulator.
 *   The individual multiplications with the accumulator use the
 *   same math context settings as in {@code mc} except for a
 *   precision increased to {@code mc.precision + elength + 1}
 *   where {@code elength} is the number of decimal digits in
 *   {@code n}.
 *
 *   <li> if {@code n} is negative, the result is calculated as if
 *   {@code n} were positive; this value is then divided into one
 *   using the working precision specified above.
 *
 *   <li> The final value from either the positive or negative case
 *   is then rounded to the destination precision.
 *   </ul>
 * </ul>
 *
 * @param  n power to raise this {@code BigDecimal} to.
 * @param  mc the context to use.
 * @return <tt>this<sup>n</sup></tt> using the ANSI standard X3.274-1996
 *         algorithm
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         rounding mode is {@code UNNECESSARY}, or {@code n} is out
 *         of range.
 * @since  1.5
 */

public java.math.BigDecimal pow(int n, java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is the absolute value
 * of this {@code BigDecimal}, and whose scale is
 * {@code this.scale()}.
 *
 * @return {@code abs(this)}
 */

public java.math.BigDecimal abs() { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is the absolute value
 * of this {@code BigDecimal}, with rounding according to the
 * context settings.
 *
 * @param mc the context to use.
 * @return {@code abs(this)}, rounded as necessary.
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         rounding mode is {@code UNNECESSARY}.
 * @since 1.5
 */

public java.math.BigDecimal abs(java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is {@code (-this)},
 * and whose scale is {@code this.scale()}.
 *
 * @return {@code -this}.
 */

public java.math.BigDecimal negate() { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is {@code (-this)},
 * with rounding according to the context settings.
 *
 * @param mc the context to use.
 * @return {@code -this}, rounded as necessary.
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         rounding mode is {@code UNNECESSARY}.
 * @since  1.5
 */

public java.math.BigDecimal negate(java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is {@code (+this)}, and whose
 * scale is {@code this.scale()}.
 *
 * <p>This method, which simply returns this {@code BigDecimal}
 * is included for symmetry with the unary minus method {@link
 * #negate()}.
 *
 * @return {@code this}.
 * @see #negate()
 * @since  1.5
 */

public java.math.BigDecimal plus() { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose value is {@code (+this)},
 * with rounding according to the context settings.
 *
 * <p>The effect of this method is identical to that of the {@link
 * #round(java.math.MathContext)} method.
 *
 * @param mc the context to use.
 * @return {@code this}, rounded as necessary.  A zero result will
 *         have a scale of 0.
 * @throws java.lang.ArithmeticException if the result is inexact but the
 *         rounding mode is {@code UNNECESSARY}.
 * @see    #round(MathContext)
 * @since  1.5
 */

public java.math.BigDecimal plus(java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Returns the signum function of this {@code BigDecimal}.
 *
 * @return -1, 0, or 1 as the value of this {@code BigDecimal}
 *         is negative, zero, or positive.
 */

public int signum() { throw new RuntimeException("Stub!"); }

/**
 * Returns the <i>scale</i> of this {@code BigDecimal}.  If zero
 * or positive, the scale is the number of digits to the right of
 * the decimal point.  If negative, the unscaled value of the
 * number is multiplied by ten to the power of the negation of the
 * scale.  For example, a scale of {@code -3} means the unscaled
 * value is multiplied by 1000.
 *
 * @return the scale of this {@code BigDecimal}.
 */

public int scale() { throw new RuntimeException("Stub!"); }

/**
 * Returns the <i>precision</i> of this {@code BigDecimal}.  (The
 * precision is the number of digits in the unscaled value.)
 *
 * <p>The precision of a zero value is 1.
 *
 * @return the precision of this {@code BigDecimal}.
 * @since  1.5
 */

public int precision() { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigInteger} whose value is the <i>unscaled
 * value</i> of this {@code BigDecimal}.  (Computes <tt>(this *
 * 10<sup>this.scale()</sup>)</tt>.)
 *
 * @return the unscaled value of this {@code BigDecimal}.
 * @since  1.2
 */

public java.math.BigInteger unscaledValue() { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} rounded according to the
 * {@code MathContext} settings.  If the precision setting is 0 then
 * no rounding takes place.
 *
 * <p>The effect of this method is identical to that of the
 * {@link #plus(java.math.MathContext)} method.
 *
 * @param mc the context to use.
 * @return a {@code BigDecimal} rounded according to the
 *         {@code MathContext} settings.
 * @throws java.lang.ArithmeticException if the rounding mode is
 *         {@code UNNECESSARY} and the
 *         {@code BigDecimal}  operation would require rounding.
 * @see    #plus(MathContext)
 * @since  1.5
 */

public java.math.BigDecimal round(java.math.MathContext mc) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose scale is the specified
 * value, and whose unscaled value is determined by multiplying or
 * dividing this {@code BigDecimal}'s unscaled value by the
 * appropriate power of ten to maintain its overall value.  If the
 * scale is reduced by the operation, the unscaled value must be
 * divided (rather than multiplied), and the value may be changed;
 * in this case, the specified rounding mode is applied to the
 * division.
 *
 * <p>Note that since BigDecimal objects are immutable, calls of
 * this method do <i>not</i> result in the original object being
 * modified, contrary to the usual convention of having methods
 * named <tt>set<i>X</i></tt> mutate field <i>{@code X}</i>.
 * Instead, {@code setScale} returns an object with the proper
 * scale; the returned object may or may not be newly allocated.
 *
 * @param  newScale scale of the {@code BigDecimal} value to be returned.
 * @param  roundingMode The rounding mode to apply.
 * @return a {@code BigDecimal} whose scale is the specified value,
 *         and whose unscaled value is determined by multiplying or
 *         dividing this {@code BigDecimal}'s unscaled value by the
 *         appropriate power of ten to maintain its overall value.
 * @throws java.lang.ArithmeticException if {@code roundingMode==UNNECESSARY}
 *         and the specified scaling operation would require
 *         rounding.
 * @see    java.math.RoundingMode
 * @since  1.5
 */

public java.math.BigDecimal setScale(int newScale, java.math.RoundingMode roundingMode) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose scale is the specified
 * value, and whose unscaled value is determined by multiplying or
 * dividing this {@code BigDecimal}'s unscaled value by the
 * appropriate power of ten to maintain its overall value.  If the
 * scale is reduced by the operation, the unscaled value must be
 * divided (rather than multiplied), and the value may be changed;
 * in this case, the specified rounding mode is applied to the
 * division.
 *
 * <p>Note that since BigDecimal objects are immutable, calls of
 * this method do <i>not</i> result in the original object being
 * modified, contrary to the usual convention of having methods
 * named <tt>set<i>X</i></tt> mutate field <i>{@code X}</i>.
 * Instead, {@code setScale} returns an object with the proper
 * scale; the returned object may or may not be newly allocated.
 *
 * <p>The new {@link #setScale(int,java.math.RoundingMode)} method should
 * be used in preference to this legacy method.
 *
 * @param  newScale scale of the {@code BigDecimal} value to be returned.
 * @param  roundingMode The rounding mode to apply.
 * @return a {@code BigDecimal} whose scale is the specified value,
 *         and whose unscaled value is determined by multiplying or
 *         dividing this {@code BigDecimal}'s unscaled value by the
 *         appropriate power of ten to maintain its overall value.
 * @throws java.lang.ArithmeticException if {@code roundingMode==ROUND_UNNECESSARY}
 *         and the specified scaling operation would require
 *         rounding.
 * @throws java.lang.IllegalArgumentException if {@code roundingMode} does not
 *         represent a valid rounding mode.
 * @see    #ROUND_UP
 * @see    #ROUND_DOWN
 * @see    #ROUND_CEILING
 * @see    #ROUND_FLOOR
 * @see    #ROUND_HALF_UP
 * @see    #ROUND_HALF_DOWN
 * @see    #ROUND_HALF_EVEN
 * @see    #ROUND_UNNECESSARY
 */

public java.math.BigDecimal setScale(int newScale, int roundingMode) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} whose scale is the specified
 * value, and whose value is numerically equal to this
 * {@code BigDecimal}'s.  Throws an {@code ArithmeticException}
 * if this is not possible.
 *
 * <p>This call is typically used to increase the scale, in which
 * case it is guaranteed that there exists a {@code BigDecimal}
 * of the specified scale and the correct value.  The call can
 * also be used to reduce the scale if the caller knows that the
 * {@code BigDecimal} has sufficiently many zeros at the end of
 * its fractional part (i.e., factors of ten in its integer value)
 * to allow for the rescaling without changing its value.
 *
 * <p>This method returns the same result as the two-argument
 * versions of {@code setScale}, but saves the caller the trouble
 * of specifying a rounding mode in cases where it is irrelevant.
 *
 * <p>Note that since {@code BigDecimal} objects are immutable,
 * calls of this method do <i>not</i> result in the original
 * object being modified, contrary to the usual convention of
 * having methods named <tt>set<i>X</i></tt> mutate field
 * <i>{@code X}</i>.  Instead, {@code setScale} returns an
 * object with the proper scale; the returned object may or may
 * not be newly allocated.
 *
 * @param  newScale scale of the {@code BigDecimal} value to be returned.
 * @return a {@code BigDecimal} whose scale is the specified value, and
 *         whose unscaled value is determined by multiplying or dividing
 *         this {@code BigDecimal}'s unscaled value by the appropriate
 *         power of ten to maintain its overall value.
 * @throws java.lang.ArithmeticException if the specified scaling operation would
 *         require rounding.
 * @see    #setScale(int, int)
 * @see    #setScale(int, RoundingMode)
 */

public java.math.BigDecimal setScale(int newScale) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} which is equivalent to this one
 * with the decimal point moved {@code n} places to the left.  If
 * {@code n} is non-negative, the call merely adds {@code n} to
 * the scale.  If {@code n} is negative, the call is equivalent
 * to {@code movePointRight(-n)}.  The {@code BigDecimal}
 * returned by this call has value <tt>(this &times;
 * 10<sup>-n</sup>)</tt> and scale {@code max(this.scale()+n,
 * 0)}.
 *
 * @param  n number of places to move the decimal point to the left.
 * @return a {@code BigDecimal} which is equivalent to this one with the
 *         decimal point moved {@code n} places to the left.
 * @throws java.lang.ArithmeticException if scale overflows.
 */

public java.math.BigDecimal movePointLeft(int n) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} which is equivalent to this one
 * with the decimal point moved {@code n} places to the right.
 * If {@code n} is non-negative, the call merely subtracts
 * {@code n} from the scale.  If {@code n} is negative, the call
 * is equivalent to {@code movePointLeft(-n)}.  The
 * {@code BigDecimal} returned by this call has value <tt>(this
 * &times; 10<sup>n</sup>)</tt> and scale {@code max(this.scale()-n,
 * 0)}.
 *
 * @param  n number of places to move the decimal point to the right.
 * @return a {@code BigDecimal} which is equivalent to this one
 *         with the decimal point moved {@code n} places to the right.
 * @throws java.lang.ArithmeticException if scale overflows.
 */

public java.math.BigDecimal movePointRight(int n) { throw new RuntimeException("Stub!"); }

/**
 * Returns a BigDecimal whose numerical value is equal to
 * ({@code this} * 10<sup>n</sup>).  The scale of
 * the result is {@code (this.scale() - n)}.
 *
 * @param n the exponent power of ten to scale by
 * @return a BigDecimal whose numerical value is equal to
 * ({@code this} * 10<sup>n</sup>)
 * @throws java.lang.ArithmeticException if the scale would be
 *         outside the range of a 32-bit integer.
 *
 * @since 1.5
 */

public java.math.BigDecimal scaleByPowerOfTen(int n) { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code BigDecimal} which is numerically equal to
 * this one but with any trailing zeros removed from the
 * representation.  For example, stripping the trailing zeros from
 * the {@code BigDecimal} value {@code 600.0}, which has
 * [{@code BigInteger}, {@code scale}] components equals to
 * [6000, 1], yields {@code 6E2} with [{@code BigInteger},
 * {@code scale}] components equals to [6, -2].  If
 * this BigDecimal is numerically equal to zero, then
 * {@code BigDecimal.ZERO} is returned.
 *
 * @return a numerically equal {@code BigDecimal} with any
 * trailing zeros removed.
 * @since 1.5
 */

public java.math.BigDecimal stripTrailingZeros() { throw new RuntimeException("Stub!"); }

/**
 * Compares this {@code BigDecimal} with the specified
 * {@code BigDecimal}.  Two {@code BigDecimal} objects that are
 * equal in value but have a different scale (like 2.0 and 2.00)
 * are considered equal by this method.  This method is provided
 * in preference to individual methods for each of the six boolean
 * comparison operators ({@literal <}, ==,
 * {@literal >}, {@literal >=}, !=, {@literal <=}).  The
 * suggested idiom for performing these comparisons is:
 * {@code (x.compareTo(y)} &lt;<i>op</i>&gt; {@code 0)}, where
 * &lt;<i>op</i>&gt; is one of the six comparison operators.
 *
 * @param  val {@code BigDecimal} to which this {@code BigDecimal} is
 *         to be compared.
 * @return -1, 0, or 1 as this {@code BigDecimal} is numerically
 *          less than, equal to, or greater than {@code val}.
 */

public int compareTo(java.math.BigDecimal val) { throw new RuntimeException("Stub!"); }

/**
 * Compares this {@code BigDecimal} with the specified
 * {@code Object} for equality.  Unlike {@link
 * #compareTo(java.math.BigDecimal) compareTo}, this method considers two
 * {@code BigDecimal} objects equal only if they are equal in
 * value and scale (thus 2.0 is not equal to 2.00 when compared by
 * this method).
 *
 * @param  x {@code Object} to which this {@code BigDecimal} is
 *         to be compared.
 * @return {@code true} if and only if the specified {@code Object} is a
 *         {@code BigDecimal} whose value and scale are equal to this
 *         {@code BigDecimal}'s.
 * @see    #compareTo(java.math.BigDecimal)
 * @see    #hashCode
 */

public boolean equals(java.lang.Object x) { throw new RuntimeException("Stub!"); }

/**
 * Returns the minimum of this {@code BigDecimal} and
 * {@code val}.
 *
 * @param  val value with which the minimum is to be computed.
 * @return the {@code BigDecimal} whose value is the lesser of this
 *         {@code BigDecimal} and {@code val}.  If they are equal,
 *         as defined by the {@link #compareTo(java.math.BigDecimal) compareTo}
 *         method, {@code this} is returned.
 * @see    #compareTo(java.math.BigDecimal)
 */

public java.math.BigDecimal min(java.math.BigDecimal val) { throw new RuntimeException("Stub!"); }

/**
 * Returns the maximum of this {@code BigDecimal} and {@code val}.
 *
 * @param  val value with which the maximum is to be computed.
 * @return the {@code BigDecimal} whose value is the greater of this
 *         {@code BigDecimal} and {@code val}.  If they are equal,
 *         as defined by the {@link #compareTo(java.math.BigDecimal) compareTo}
 *         method, {@code this} is returned.
 * @see    #compareTo(java.math.BigDecimal)
 */

public java.math.BigDecimal max(java.math.BigDecimal val) { throw new RuntimeException("Stub!"); }

/**
 * Returns the hash code for this {@code BigDecimal}.  Note that
 * two {@code BigDecimal} objects that are numerically equal but
 * differ in scale (like 2.0 and 2.00) will generally <i>not</i>
 * have the same hash code.
 *
 * @return hash code for this {@code BigDecimal}.
 * @see #equals(Object)
 */

public int hashCode() { throw new RuntimeException("Stub!"); }

/**
 * Returns the string representation of this {@code BigDecimal},
 * using scientific notation if an exponent is needed.
 *
 * <p>A standard canonical string form of the {@code BigDecimal}
 * is created as though by the following steps: first, the
 * absolute value of the unscaled value of the {@code BigDecimal}
 * is converted to a string in base ten using the characters
 * {@code '0'} through {@code '9'} with no leading zeros (except
 * if its value is zero, in which case a single {@code '0'}
 * character is used).
 *
 * <p>Next, an <i>adjusted exponent</i> is calculated; this is the
 * negated scale, plus the number of characters in the converted
 * unscaled value, less one.  That is,
 * {@code -scale+(ulength-1)}, where {@code ulength} is the
 * length of the absolute value of the unscaled value in decimal
 * digits (its <i>precision</i>).
 *
 * <p>If the scale is greater than or equal to zero and the
 * adjusted exponent is greater than or equal to {@code -6}, the
 * number will be converted to a character form without using
 * exponential notation.  In this case, if the scale is zero then
 * no decimal point is added and if the scale is positive a
 * decimal point will be inserted with the scale specifying the
 * number of characters to the right of the decimal point.
 * {@code '0'} characters are added to the left of the converted
 * unscaled value as necessary.  If no character precedes the
 * decimal point after this insertion then a conventional
 * {@code '0'} character is prefixed.
 *
 * <p>Otherwise (that is, if the scale is negative, or the
 * adjusted exponent is less than {@code -6}), the number will be
 * converted to a character form using exponential notation.  In
 * this case, if the converted {@code BigInteger} has more than
 * one digit a decimal point is inserted after the first digit.
 * An exponent in character form is then suffixed to the converted
 * unscaled value (perhaps with inserted decimal point); this
 * comprises the letter {@code 'E'} followed immediately by the
 * adjusted exponent converted to a character form.  The latter is
 * in base ten, using the characters {@code '0'} through
 * {@code '9'} with no leading zeros, and is always prefixed by a
 * sign character {@code '-'} (<tt>'&#92;u002D'</tt>) if the
 * adjusted exponent is negative, {@code '+'}
 * (<tt>'&#92;u002B'</tt>) otherwise).
 *
 * <p>Finally, the entire string is prefixed by a minus sign
 * character {@code '-'} (<tt>'&#92;u002D'</tt>) if the unscaled
 * value is less than zero.  No sign character is prefixed if the
 * unscaled value is zero or positive.
 *
 * <p><b>Examples:</b>
 * <p>For each representation [<i>unscaled value</i>, <i>scale</i>]
 * on the left, the resulting string is shown on the right.
 * <pre>
 * [123,0]      "123"
 * [-123,0]     "-123"
 * [123,-1]     "1.23E+3"
 * [123,-3]     "1.23E+5"
 * [123,1]      "12.3"
 * [123,5]      "0.00123"
 * [123,10]     "1.23E-8"
 * [-123,12]    "-1.23E-10"
 * </pre>
 *
 * <b>Notes:</b>
 * <ol>
 *
 * <li>There is a one-to-one mapping between the distinguishable
 * {@code BigDecimal} values and the result of this conversion.
 * That is, every distinguishable {@code BigDecimal} value
 * (unscaled value and scale) has a unique string representation
 * as a result of using {@code toString}.  If that string
 * representation is converted back to a {@code BigDecimal} using
 * the {@link #BigDecimal(java.lang.String)} constructor, then the original
 * value will be recovered.
 *
 * <li>The string produced for a given number is always the same;
 * it is not affected by locale.  This means that it can be used
 * as a canonical string representation for exchanging decimal
 * data, or as a key for a Hashtable, etc.  Locale-sensitive
 * number formatting and parsing is handled by the {@link
 * java.text.NumberFormat} class and its subclasses.
 *
 * <li>The {@link #toEngineeringString} method may be used for
 * presenting numbers with exponents in engineering notation, and the
 * {@link #setScale(int,java.math.RoundingMode) setScale} method may be used for
 * rounding a {@code BigDecimal} so it has a known number of digits after
 * the decimal point.
 *
 * <li>The digit-to-character mapping provided by
 * {@code Character.forDigit} is used.
 *
 * </ol>
 *
 * @return string representation of this {@code BigDecimal}.
 * @see    java.lang.Character#forDigit
 * @see    #BigDecimal(java.lang.String)
 */

public java.lang.String toString() { throw new RuntimeException("Stub!"); }

/**
 * Returns a string representation of this {@code BigDecimal},
 * using engineering notation if an exponent is needed.
 *
 * <p>Returns a string that represents the {@code BigDecimal} as
 * described in the {@link #toString()} method, except that if
 * exponential notation is used, the power of ten is adjusted to
 * be a multiple of three (engineering notation) such that the
 * integer part of nonzero values will be in the range 1 through
 * 999.  If exponential notation is used for zero values, a
 * decimal point and one or two fractional zero digits are used so
 * that the scale of the zero value is preserved.  Note that
 * unlike the output of {@link #toString()}, the output of this
 * method is <em>not</em> guaranteed to recover the same [integer,
 * scale] pair of this {@code BigDecimal} if the output string is
 * converting back to a {@code BigDecimal} using the {@linkplain
 * #BigDecimal(java.lang.String) string constructor}.  The result of this method meets
 * the weaker constraint of always producing a numerically equal
 * result from applying the string constructor to the method's output.
 *
 * @return string representation of this {@code BigDecimal}, using
 *         engineering notation if an exponent is needed.
 * @since  1.5
 */

public java.lang.String toEngineeringString() { throw new RuntimeException("Stub!"); }

/**
 * Returns a string representation of this {@code BigDecimal}
 * without an exponent field.  For values with a positive scale,
 * the number of digits to the right of the decimal point is used
 * to indicate scale.  For values with a zero or negative scale,
 * the resulting string is generated as if the value were
 * converted to a numerically equal value with zero scale and as
 * if all the trailing zeros of the zero scale value were present
 * in the result.
 *
 * The entire string is prefixed by a minus sign character '-'
 * (<tt>'&#92;u002D'</tt>) if the unscaled value is less than
 * zero. No sign character is prefixed if the unscaled value is
 * zero or positive.
 *
 * Note that if the result of this method is passed to the
 * {@linkplain #BigDecimal(java.lang.String) string constructor}, only the
 * numerical value of this {@code BigDecimal} will necessarily be
 * recovered; the representation of the new {@code BigDecimal}
 * may have a different scale.  In particular, if this
 * {@code BigDecimal} has a negative scale, the string resulting
 * from this method will have a scale of zero when processed by
 * the string constructor.
 *
 * (This method behaves analogously to the {@code toString}
 * method in 1.4 and earlier releases.)
 *
 * @return a string representation of this {@code BigDecimal}
 * without an exponent field.
 * @since 1.5
 * @see #toString()
 * @see #toEngineeringString()
 */

public java.lang.String toPlainString() { throw new RuntimeException("Stub!"); }

/**
 * Converts this {@code BigDecimal} to a {@code BigInteger}.
 * This conversion is analogous to the
 * <i>narrowing primitive conversion</i> from {@code double} to
 * {@code long} as defined in section 5.1.3 of
 * <cite>The Java&trade; Language Specification</cite>:
 * any fractional part of this
 * {@code BigDecimal} will be discarded.  Note that this
 * conversion can lose information about the precision of the
 * {@code BigDecimal} value.
 * <p>
 * To have an exception thrown if the conversion is inexact (in
 * other words if a nonzero fractional part is discarded), use the
 * {@link #toBigIntegerExact()} method.
 *
 * @return this {@code BigDecimal} converted to a {@code BigInteger}.
 */

public java.math.BigInteger toBigInteger() { throw new RuntimeException("Stub!"); }

/**
 * Converts this {@code BigDecimal} to a {@code BigInteger},
 * checking for lost information.  An exception is thrown if this
 * {@code BigDecimal} has a nonzero fractional part.
 *
 * @return this {@code BigDecimal} converted to a {@code BigInteger}.
 * @throws java.lang.ArithmeticException if {@code this} has a nonzero
 *         fractional part.
 * @since  1.5
 */

public java.math.BigInteger toBigIntegerExact() { throw new RuntimeException("Stub!"); }

/**
 * Converts this {@code BigDecimal} to a {@code long}.
 * This conversion is analogous to the
 * <i>narrowing primitive conversion</i> from {@code double} to
 * {@code short} as defined in section 5.1.3 of
 * <cite>The Java&trade; Language Specification</cite>:
 * any fractional part of this
 * {@code BigDecimal} will be discarded, and if the resulting
 * "{@code BigInteger}" is too big to fit in a
 * {@code long}, only the low-order 64 bits are returned.
 * Note that this conversion can lose information about the
 * overall magnitude and precision of this {@code BigDecimal} value as well
 * as return a result with the opposite sign.
 *
 * @return this {@code BigDecimal} converted to a {@code long}.
 */

public long longValue() { throw new RuntimeException("Stub!"); }

/**
 * Converts this {@code BigDecimal} to a {@code long}, checking
 * for lost information.  If this {@code BigDecimal} has a
 * nonzero fractional part or is out of the possible range for a
 * {@code long} result then an {@code ArithmeticException} is
 * thrown.
 *
 * @return this {@code BigDecimal} converted to a {@code long}.
 * @throws java.lang.ArithmeticException if {@code this} has a nonzero
 *         fractional part, or will not fit in a {@code long}.
 * @since  1.5
 */

public long longValueExact() { throw new RuntimeException("Stub!"); }

/**
 * Converts this {@code BigDecimal} to an {@code int}.
 * This conversion is analogous to the
 * <i>narrowing primitive conversion</i> from {@code double} to
 * {@code short} as defined in section 5.1.3 of
 * <cite>The Java&trade; Language Specification</cite>:
 * any fractional part of this
 * {@code BigDecimal} will be discarded, and if the resulting
 * "{@code BigInteger}" is too big to fit in an
 * {@code int}, only the low-order 32 bits are returned.
 * Note that this conversion can lose information about the
 * overall magnitude and precision of this {@code BigDecimal}
 * value as well as return a result with the opposite sign.
 *
 * @return this {@code BigDecimal} converted to an {@code int}.
 */

public int intValue() { throw new RuntimeException("Stub!"); }

/**
 * Converts this {@code BigDecimal} to an {@code int}, checking
 * for lost information.  If this {@code BigDecimal} has a
 * nonzero fractional part or is out of the possible range for an
 * {@code int} result then an {@code ArithmeticException} is
 * thrown.
 *
 * @return this {@code BigDecimal} converted to an {@code int}.
 * @throws java.lang.ArithmeticException if {@code this} has a nonzero
 *         fractional part, or will not fit in an {@code int}.
 * @since  1.5
 */

public int intValueExact() { throw new RuntimeException("Stub!"); }

/**
 * Converts this {@code BigDecimal} to a {@code short}, checking
 * for lost information.  If this {@code BigDecimal} has a
 * nonzero fractional part or is out of the possible range for a
 * {@code short} result then an {@code ArithmeticException} is
 * thrown.
 *
 * @return this {@code BigDecimal} converted to a {@code short}.
 * @throws java.lang.ArithmeticException if {@code this} has a nonzero
 *         fractional part, or will not fit in a {@code short}.
 * @since  1.5
 */

public short shortValueExact() { throw new RuntimeException("Stub!"); }

/**
 * Converts this {@code BigDecimal} to a {@code byte}, checking
 * for lost information.  If this {@code BigDecimal} has a
 * nonzero fractional part or is out of the possible range for a
 * {@code byte} result then an {@code ArithmeticException} is
 * thrown.
 *
 * @return this {@code BigDecimal} converted to a {@code byte}.
 * @throws java.lang.ArithmeticException if {@code this} has a nonzero
 *         fractional part, or will not fit in a {@code byte}.
 * @since  1.5
 */

public byte byteValueExact() { throw new RuntimeException("Stub!"); }

/**
 * Converts this {@code BigDecimal} to a {@code float}.
 * This conversion is similar to the
 * <i>narrowing primitive conversion</i> from {@code double} to
 * {@code float} as defined in section 5.1.3 of
 * <cite>The Java&trade; Language Specification</cite>:
 * if this {@code BigDecimal} has too great a
 * magnitude to represent as a {@code float}, it will be
 * converted to {@link java.lang.Float#NEGATIVE_INFINITY Float#NEGATIVE_INFINITY} or {@link java.lang.Float#POSITIVE_INFINITY  } as appropriate.  Note that even when
 * the return value is finite, this conversion can lose
 * information about the precision of the {@code BigDecimal}
 * value.
 *
 * @return this {@code BigDecimal} converted to a {@code float}.
 */

public float floatValue() { throw new RuntimeException("Stub!"); }

/**
 * Converts this {@code BigDecimal} to a {@code double}.
 * This conversion is similar to the
 * <i>narrowing primitive conversion</i> from {@code double} to
 * {@code float} as defined in section 5.1.3 of
 * <cite>The Java&trade; Language Specification</cite>:
 * if this {@code BigDecimal} has too great a
 * magnitude represent as a {@code double}, it will be
 * converted to {@link java.lang.Double#NEGATIVE_INFINITY Double#NEGATIVE_INFINITY} or {@link java.lang.Double#POSITIVE_INFINITY  } as appropriate.  Note that even when
 * the return value is finite, this conversion can lose
 * information about the precision of the {@code BigDecimal}
 * value.
 *
 * @return this {@code BigDecimal} converted to a {@code double}.
 */

public double doubleValue() { throw new RuntimeException("Stub!"); }

/**
 * Returns the size of an ulp, a unit in the last place, of this
 * {@code BigDecimal}.  An ulp of a nonzero {@code BigDecimal}
 * value is the positive distance between this value and the
 * {@code BigDecimal} value next larger in magnitude with the
 * same number of digits.  An ulp of a zero value is numerically
 * equal to 1 with the scale of {@code this}.  The result is
 * stored with the same scale as {@code this} so the result
 * for zero and nonzero values is equal to {@code [1,
 * this.scale()]}.
 *
 * @return the size of an ulp of {@code this}
 * @since 1.5
 */

public java.math.BigDecimal ulp() { throw new RuntimeException("Stub!"); }

/**
 * The value 1, with a scale of 0.
 *
 * @since  1.5
 */

public static final java.math.BigDecimal ONE;
static { ONE = null; }

/**
 * Rounding mode to round towards positive infinity.  If the
 * {@code BigDecimal} is positive, behaves as for
 * {@code ROUND_UP}; if negative, behaves as for
 * {@code ROUND_DOWN}.  Note that this rounding mode never
 * decreases the calculated value.
 */

public static final int ROUND_CEILING = 2; // 0x2

/**
 * Rounding mode to round towards zero.  Never increments the digit
 * prior to a discarded fraction (i.e., truncates).  Note that this
 * rounding mode never increases the magnitude of the calculated value.
 */

public static final int ROUND_DOWN = 1; // 0x1

/**
 * Rounding mode to round towards negative infinity.  If the
 * {@code BigDecimal} is positive, behave as for
 * {@code ROUND_DOWN}; if negative, behave as for
 * {@code ROUND_UP}.  Note that this rounding mode never
 * increases the calculated value.
 */

public static final int ROUND_FLOOR = 3; // 0x3

/**
 * Rounding mode to round towards {@literal "nearest neighbor"}
 * unless both neighbors are equidistant, in which case round
 * down.  Behaves as for {@code ROUND_UP} if the discarded
 * fraction is {@literal >} 0.5; otherwise, behaves as for
 * {@code ROUND_DOWN}.
 */

public static final int ROUND_HALF_DOWN = 5; // 0x5

/**
 * Rounding mode to round towards the {@literal "nearest neighbor"}
 * unless both neighbors are equidistant, in which case, round
 * towards the even neighbor.  Behaves as for
 * {@code ROUND_HALF_UP} if the digit to the left of the
 * discarded fraction is odd; behaves as for
 * {@code ROUND_HALF_DOWN} if it's even.  Note that this is the
 * rounding mode that minimizes cumulative error when applied
 * repeatedly over a sequence of calculations.
 */

public static final int ROUND_HALF_EVEN = 6; // 0x6

/**
 * Rounding mode to round towards {@literal "nearest neighbor"}
 * unless both neighbors are equidistant, in which case round up.
 * Behaves as for {@code ROUND_UP} if the discarded fraction is
 * &ge; 0.5; otherwise, behaves as for {@code ROUND_DOWN}.  Note
 * that this is the rounding mode that most of us were taught in
 * grade school.
 */

public static final int ROUND_HALF_UP = 4; // 0x4

/**
 * Rounding mode to assert that the requested operation has an exact
 * result, hence no rounding is necessary.  If this rounding mode is
 * specified on an operation that yields an inexact result, an
 * {@code ArithmeticException} is thrown.
 */

public static final int ROUND_UNNECESSARY = 7; // 0x7

/**
 * Rounding mode to round away from zero.  Always increments the
 * digit prior to a nonzero discarded fraction.  Note that this rounding
 * mode never decreases the magnitude of the calculated value.
 */

public static final int ROUND_UP = 0; // 0x0

/**
 * The value 10, with a scale of 0.
 *
 * @since  1.5
 */

public static final java.math.BigDecimal TEN;
static { TEN = null; }

/**
 * The value 0, with a scale of 0.
 *
 * @since  1.5
 */

public static final java.math.BigDecimal ZERO;
static { ZERO = null; }
}
