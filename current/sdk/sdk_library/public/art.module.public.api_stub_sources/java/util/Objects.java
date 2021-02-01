/*
 * Copyright (c) 2009, 2016, Oracle and/or its affiliates. All rights reserved.
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


package java.util;


/**
 * This class consists of {@code static} utility methods for operating
 * on objects, or checking certain conditions before operation.  These utilities
 * include {@code null}-safe or {@code null}-tolerant methods for computing the
 * hash code of an object, returning a string for an object, comparing two
 * objects, and checking if indexes or sub-range values are out-of-bounds.
 *
 * @apiNote
 * Static methods such as {@link java.util.Objects#checkIndex Objects#checkIndex},
 * {@link java.util.Objects#checkFromToIndex Objects#checkFromToIndex}, and {@link java.util.Objects#checkFromIndexSize Objects#checkFromIndexSize} are
 * provided for the convenience of checking if values corresponding to indexes
 * and sub-ranges are out-of-bounds.
 * Variations of these static methods support customization of the runtime
 * exception, and corresponding exception detail message, that is thrown when
 * values are out-of-bounds.  Such methods accept a functional interface
 * argument, instances of {@code BiFunction}, that maps out-of-bound values to a
 * runtime exception.  Care should be taken when using such methods in
 * combination with an argument that is a lambda expression, method reference or
 * class that capture values.  In such cases the cost of capture, related to
 * functional interface allocation, may exceed the cost of checking bounds.
 *
 * @since 1.7
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class Objects {

private Objects() { throw new RuntimeException("Stub!"); }

/**
 * Returns {@code true} if the arguments are equal to each other
 * and {@code false} otherwise.
 * Consequently, if both arguments are {@code null}, {@code true}
 * is returned and if exactly one argument is {@code null}, {@code
 * false} is returned.  Otherwise, equality is determined by using
 * the {@link java.lang.Object#equals equals} method of the first
 * argument.
 *
 * @param a an object
 * @param b an object to be compared with {@code a} for equality
 * @return {@code true} if the arguments are equal to each other
 * and {@code false} otherwise
 * @see java.lang.Object#equals(Object)
 */

public static boolean equals(@androidx.annotation.RecentlyNullable java.lang.Object a, @androidx.annotation.RecentlyNullable java.lang.Object b) { throw new RuntimeException("Stub!"); }

/**
 * Returns {@code true} if the arguments are deeply equal to each other
 * and {@code false} otherwise.
 *
 * Two {@code null} values are deeply equal.  If both arguments are
 * arrays, the algorithm in {@link java.util.Arrays#deepEquals(java.lang.Object[],java.lang.Object[]) Arrays.deepEquals} is used to determine equality.
 * Otherwise, equality is determined by using the {@link java.lang.Object#equals equals} method of the first argument.
 *
 * @param a an object
 * @param b an object to be compared with {@code a} for deep equality
 * @return {@code true} if the arguments are deeply equal to each other
 * and {@code false} otherwise
 * @see java.util.Arrays#deepEquals(Object[], Object[])
 * @see java.util.Objects#equals(Object, Object)
 */

public static boolean deepEquals(@androidx.annotation.RecentlyNullable java.lang.Object a, @androidx.annotation.RecentlyNullable java.lang.Object b) { throw new RuntimeException("Stub!"); }

/**
 * Returns the hash code of a non-{@code null} argument and 0 for
 * a {@code null} argument.
 *
 * @param o an object
 * @return the hash code of a non-{@code null} argument and 0 for
 * a {@code null} argument
 * @see java.lang.Object#hashCode
 */

public static int hashCode(@androidx.annotation.RecentlyNullable java.lang.Object o) { throw new RuntimeException("Stub!"); }

/**
 * Generates a hash code for a sequence of input values. The hash
 * code is generated as if all the input values were placed into an
 * array, and that array were hashed by calling {@link java.util.Arrays#hashCode(java.lang.Object[])  }.
 *
 * <p>This method is useful for implementing {@link java.lang.Object#hashCode()  } on objects containing multiple fields. For
 * example, if an object that has three fields, {@code x}, {@code
 * y}, and {@code z}, one could write:
 *
 * <blockquote><pre>
 * &#064;Override public int hashCode() {
 *     return Objects.hash(x, y, z);
 * }
 * </pre></blockquote>
 *
 * <b>Warning: When a single object reference is supplied, the returned
 * value does not equal the hash code of that object reference.</b> This
 * value can be computed by calling {@link #hashCode(java.lang.Object)}.
 *
 * @param values the values to be hashed
 * @return a hash value of the sequence of input values
 * @see java.util.Arrays#hashCode(Object[])
 * @see List#hashCode
 */

public static int hash(@androidx.annotation.RecentlyNullable java.lang.Object... values) { throw new RuntimeException("Stub!"); }

/**
 * Returns the result of calling {@code toString} for a non-{@code
 * null} argument and {@code "null"} for a {@code null} argument.
 *
 * @param o an object
 * @return the result of calling {@code toString} for a non-{@code
 * null} argument and {@code "null"} for a {@code null} argument
 * @see java.lang.Object#toString
 * @see java.lang.String#valueOf(Object)
 */

@androidx.annotation.RecentlyNonNull
public static java.lang.String toString(@androidx.annotation.RecentlyNullable java.lang.Object o) { throw new RuntimeException("Stub!"); }

/**
 * Returns the result of calling {@code toString} on the first
 * argument if the first argument is not {@code null} and returns
 * the second argument otherwise.
 *
 * @param o an object
 * @param nullDefault string to return if the first argument is
 *        {@code null}
 * @return the result of calling {@code toString} on the first
 * argument if it is not {@code null} and the second argument
 * otherwise.
 * @see java.util.Objects#toString(Object)
 */

@androidx.annotation.RecentlyNonNull
public static java.lang.String toString(@androidx.annotation.RecentlyNullable java.lang.Object o, @androidx.annotation.RecentlyNonNull java.lang.String nullDefault) { throw new RuntimeException("Stub!"); }

/**
 * Returns 0 if the arguments are identical and {@code
 * c.compare(a, b)} otherwise.
 * Consequently, if both arguments are {@code null} 0
 * is returned.
 *
 * <p>Note that if one of the arguments is {@code null}, a {@code
 * NullPointerException} may or may not be thrown depending on
 * what ordering policy, if any, the {@link java.util.Comparator Comparator}
 * chooses to have for {@code null} values.
 *
 * @param <T> the type of the objects being compared
 * @param a an object
 * @param b an object to be compared with {@code a}
 * @param c the {@code Comparator} to compare the first two arguments
 * @return 0 if the arguments are identical and {@code
 * c.compare(a, b)} otherwise.
 * @see java.lang.Comparable
 * @see java.util.Comparator
 */

public static <T> int compare(T a, T b, @androidx.annotation.RecentlyNonNull java.util.Comparator<? super T> c) { throw new RuntimeException("Stub!"); }

/**
 * Checks that the specified object reference is not {@code null}. This
 * method is designed primarily for doing parameter validation in methods
 * and constructors, as demonstrated below:
 * <blockquote><pre>
 * public Foo(Bar bar) {
 *     this.bar = Objects.requireNonNull(bar);
 * }
 * </pre></blockquote>
 *
 * @param obj the object reference to check for nullity
 * @param <T> the type of the reference
 * @return {@code obj} if not {@code null}
 * @throws java.lang.NullPointerException if {@code obj} is {@code null}
 */

@androidx.annotation.RecentlyNonNull
public static <T> T requireNonNull(@androidx.annotation.RecentlyNullable T obj) { throw new RuntimeException("Stub!"); }

/**
 * Checks that the specified object reference is not {@code null} and
 * throws a customized {@link java.lang.NullPointerException NullPointerException} if it is. This method
 * is designed primarily for doing parameter validation in methods and
 * constructors with multiple parameters, as demonstrated below:
 * <blockquote><pre>
 * public Foo(Bar bar, Baz baz) {
 *     this.bar = Objects.requireNonNull(bar, "bar must not be null");
 *     this.baz = Objects.requireNonNull(baz, "baz must not be null");
 * }
 * </pre></blockquote>
 *
 * @param obj     the object reference to check for nullity
 * @param message detail message to be used in the event that a {@code
 *                NullPointerException} is thrown
 * @param <T> the type of the reference
 * @return {@code obj} if not {@code null}
 * @throws java.lang.NullPointerException if {@code obj} is {@code null}
 */

@androidx.annotation.RecentlyNonNull
public static <T> T requireNonNull(@androidx.annotation.RecentlyNullable T obj, @androidx.annotation.RecentlyNonNull java.lang.String message) { throw new RuntimeException("Stub!"); }

/**
 * Returns {@code true} if the provided reference is {@code null} otherwise
 * returns {@code false}.
 *
 * @apiNote This method exists to be used as a
 * {@link java.util.function.Predicate}, {@code filter(Objects::isNull)}
 *
 * @param obj a reference to be checked against {@code null}
 * @return {@code true} if the provided reference is {@code null} otherwise
 * {@code false}
 *
 * @see java.util.function.Predicate
 * @since 1.8
 */

public static boolean isNull(@androidx.annotation.RecentlyNullable java.lang.Object obj) { throw new RuntimeException("Stub!"); }

/**
 * Returns {@code true} if the provided reference is non-{@code null}
 * otherwise returns {@code false}.
 *
 * @apiNote This method exists to be used as a
 * {@link java.util.function.Predicate}, {@code filter(Objects::nonNull)}
 *
 * @param obj a reference to be checked against {@code null}
 * @return {@code true} if the provided reference is non-{@code null}
 * otherwise {@code false}
 *
 * @see java.util.function.Predicate
 * @since 1.8
 */

public static boolean nonNull(@androidx.annotation.RecentlyNullable java.lang.Object obj) { throw new RuntimeException("Stub!"); }

/**
 * Returns the first argument if it is non-{@code null} and
 * otherwise returns the non-{@code null} second argument.
 *
 * @param obj an object
 * @param defaultObj a non-{@code null} object to return if the first argument
 *                   is {@code null}
 * @param <T> the type of the reference
 * @return the first argument if it is non-{@code null} and
 *        otherwise the second argument if it is non-{@code null}
 * @throws java.lang.NullPointerException if both {@code obj} is null and
 *        {@code defaultObj} is {@code null}
 * @since 9
 */

@androidx.annotation.RecentlyNonNull
public static <T> T requireNonNullElse(@androidx.annotation.RecentlyNullable T obj, @androidx.annotation.RecentlyNonNull T defaultObj) { throw new RuntimeException("Stub!"); }

/**
 * Returns the first argument if it is non-{@code null} and otherwise
 * returns the non-{@code null} value of {@code supplier.get()}.
 *
 * @param obj an object
 * @param supplier of a non-{@code null} object to return if the first argument
 *                 is {@code null}
 * @param <T> the type of the first argument and return type
 * @return the first argument if it is non-{@code null} and otherwise
 *         the value from {@code supplier.get()} if it is non-{@code null}
 * @throws java.lang.NullPointerException if both {@code obj} is null and
 *        either the {@code supplier} is {@code null} or
 *        the {@code supplier.get()} value is {@code null}
 * @since 9
 */

@androidx.annotation.RecentlyNonNull
public static <T> T requireNonNullElseGet(@androidx.annotation.RecentlyNullable T obj, @androidx.annotation.RecentlyNonNull java.util.function.Supplier<? extends T> supplier) { throw new RuntimeException("Stub!"); }

/**
 * Checks that the specified object reference is not {@code null} and
 * throws a customized {@link java.lang.NullPointerException NullPointerException} if it is.
 *
 * <p>Unlike the method {@link #requireNonNull(java.lang.Object,java.lang.String)},
 * this method allows creation of the message to be deferred until
 * after the null check is made. While this may confer a
 * performance advantage in the non-null case, when deciding to
 * call this method care should be taken that the costs of
 * creating the message supplier are less than the cost of just
 * creating the string message directly.
 *
 * @param obj     the object reference to check for nullity
 * @param messageSupplier supplier of the detail message to be
 * used in the event that a {@code NullPointerException} is thrown
 * @param <T> the type of the reference
 * @return {@code obj} if not {@code null}
 * @throws java.lang.NullPointerException if {@code obj} is {@code null}
 * @since 1.8
 */

@androidx.annotation.RecentlyNonNull
public static <T> T requireNonNull(@androidx.annotation.RecentlyNullable T obj, @androidx.annotation.RecentlyNonNull java.util.function.Supplier<java.lang.String> messageSupplier) { throw new RuntimeException("Stub!"); }

/**
 * Checks if the {@code index} is within the bounds of the range from
 * {@code 0} (inclusive) to {@code length} (exclusive).
 *
 * <p>The {@code index} is defined to be out-of-bounds if any of the
 * following inequalities is true:
 * <ul>
 *  <li>{@code index < 0}</li>
 *  <li>{@code index >= length}</li>
 *  <li>{@code length < 0}, which is implied from the former inequalities</li>
 * </ul>
 *
 * @param index the index
 * @param length the upper-bound (exclusive) of the range
 * @return {@code index} if it is within bounds of the range
 * @throws java.lang.IndexOutOfBoundsException if the {@code index} is out-of-bounds
 * @since 9
 */

public static int checkIndex(int index, int length) { throw new RuntimeException("Stub!"); }

/**
 * Checks if the sub-range from {@code fromIndex} (inclusive) to
 * {@code toIndex} (exclusive) is within the bounds of range from {@code 0}
 * (inclusive) to {@code length} (exclusive).
 *
 * <p>The sub-range is defined to be out-of-bounds if any of the following
 * inequalities is true:
 * <ul>
 *  <li>{@code fromIndex < 0}</li>
 *  <li>{@code fromIndex > toIndex}</li>
 *  <li>{@code toIndex > length}</li>
 *  <li>{@code length < 0}, which is implied from the former inequalities</li>
 * </ul>
 *
 * @param fromIndex the lower-bound (inclusive) of the sub-range
 * @param toIndex the upper-bound (exclusive) of the sub-range
 * @param length the upper-bound (exclusive) the range
 * @return {@code fromIndex} if the sub-range within bounds of the range
 * @throws java.lang.IndexOutOfBoundsException if the sub-range is out-of-bounds
 * @since 9
 */

public static int checkFromToIndex(int fromIndex, int toIndex, int length) { throw new RuntimeException("Stub!"); }

/**
 * Checks if the sub-range from {@code fromIndex} (inclusive) to
 * {@code fromIndex + size} (exclusive) is within the bounds of range from
 * {@code 0} (inclusive) to {@code length} (exclusive).
 *
 * <p>The sub-range is defined to be out-of-bounds if any of the following
 * inequalities is true:
 * <ul>
 *  <li>{@code fromIndex < 0}</li>
 *  <li>{@code size < 0}</li>
 *  <li>{@code fromIndex + size > length}, taking into account integer overflow</li>
 *  <li>{@code length < 0}, which is implied from the former inequalities</li>
 * </ul>
 *
 * @param fromIndex the lower-bound (inclusive) of the sub-interval
 * @param size the size of the sub-range
 * @param length the upper-bound (exclusive) of the range
 * @return {@code fromIndex} if the sub-range within bounds of the range
 * @throws java.lang.IndexOutOfBoundsException if the sub-range is out-of-bounds
 * @since 9
 */

public static int checkFromIndexSize(int fromIndex, int size, int length) { throw new RuntimeException("Stub!"); }
}

