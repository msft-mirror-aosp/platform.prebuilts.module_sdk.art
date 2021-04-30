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


package libcore.internal;


/**
 * A pool of string instances. Unlike the {@link java.lang.String#intern()  interned strings}, this pool provides no guarantee of reference equality.
 * It is intended only to save allocations. This class is not thread safe.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class StringPool {

public StringPool() { throw new RuntimeException("Stub!"); }

/**
 * Returns a string equal to {@code new String(array, start, length)}.
 */

public java.lang.String get(char[] array, int start, int length) { throw new RuntimeException("Stub!"); }
}

