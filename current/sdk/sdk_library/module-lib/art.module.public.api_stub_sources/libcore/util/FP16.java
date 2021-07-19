/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package libcore.util;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class FP16 {

private FP16() { throw new RuntimeException("Stub!"); }

public static int compare(short x, short y) { throw new RuntimeException("Stub!"); }

public static short rint(short h) { throw new RuntimeException("Stub!"); }

public static short ceil(short h) { throw new RuntimeException("Stub!"); }

public static short floor(short h) { throw new RuntimeException("Stub!"); }

public static short trunc(short h) { throw new RuntimeException("Stub!"); }

public static short min(short x, short y) { throw new RuntimeException("Stub!"); }

public static short max(short x, short y) { throw new RuntimeException("Stub!"); }

public static boolean less(short x, short y) { throw new RuntimeException("Stub!"); }

public static boolean lessEquals(short x, short y) { throw new RuntimeException("Stub!"); }

public static boolean greater(short x, short y) { throw new RuntimeException("Stub!"); }

public static boolean greaterEquals(short x, short y) { throw new RuntimeException("Stub!"); }

public static boolean equals(short x, short y) { throw new RuntimeException("Stub!"); }

public static boolean isInfinite(short h) { throw new RuntimeException("Stub!"); }

public static boolean isNaN(short h) { throw new RuntimeException("Stub!"); }

public static boolean isNormalized(short h) { throw new RuntimeException("Stub!"); }

public static float toFloat(short h) { throw new RuntimeException("Stub!"); }

public static short toHalf(float f) { throw new RuntimeException("Stub!"); }

public static java.lang.String toHexString(short h) { throw new RuntimeException("Stub!"); }

public static final short EPSILON = 5120; // 0x1400

public static final int EXPONENT_BIAS = 15; // 0xf

public static final int EXPONENT_SHIFT = 10; // 0xa

public static final int EXPONENT_SIGNIFICAND_MASK = 32767; // 0x7fff

public static final short LOWEST_VALUE = -1025; // 0xfffffbff

public static final int MAX_EXPONENT = 15; // 0xf

public static final short MAX_VALUE = 31743; // 0x7bff

public static final int MIN_EXPONENT = -14; // 0xfffffff2

public static final short MIN_NORMAL = 1024; // 0x400

public static final short MIN_VALUE = 1; // 0x1

public static final short NEGATIVE_INFINITY = -1024; // 0xfffffc00

public static final short NEGATIVE_ZERO = -32768; // 0xffff8000

public static final short NaN = 32256; // 0x7e00

public static final short POSITIVE_INFINITY = 31744; // 0x7c00

public static final short POSITIVE_ZERO = 0; // 0x0

public static final int SHIFTED_EXPONENT_MASK = 31; // 0x1f

public static final int SIGNIFICAND_MASK = 1023; // 0x3ff

public static final int SIGN_MASK = 32768; // 0x8000

public static final int SIGN_SHIFT = 15; // 0xf

public static final int SIZE = 16; // 0x10
}

