/*
 * Copyright (C) 2010 The Android Open Source Project
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


/**
 * Empty array is immutable. Use a shared empty array to avoid allocation.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class EmptyArray {

private EmptyArray() { throw new RuntimeException("Stub!"); }

/** @hide */

@androidx.annotation.RecentlyNonNull public static final boolean[] BOOLEAN;
static { BOOLEAN = new boolean[0]; }

/** @hide */

@androidx.annotation.RecentlyNonNull public static final byte[] BYTE;
static { BYTE = new byte[0]; }

/** @hide */

@androidx.annotation.RecentlyNonNull public static final float[] FLOAT;
static { FLOAT = new float[0]; }

/** @hide */

@androidx.annotation.RecentlyNonNull public static final int[] INT;
static { INT = new int[0]; }

/** @hide */

@androidx.annotation.RecentlyNonNull public static final long[] LONG;
static { LONG = new long[0]; }

/** @hide */

@androidx.annotation.RecentlyNonNull public static final java.lang.Object[] OBJECT;
static { OBJECT = new java.lang.Object[0]; }

/** @hide */

@androidx.annotation.RecentlyNonNull public static final java.lang.String[] STRING;
static { STRING = new java.lang.String[0]; }
}

