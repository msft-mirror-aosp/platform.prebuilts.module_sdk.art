/*
 * Copyright (C) 2017 The Android Open Source Project
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


package android.system;


/**
 * Corresponds to Linux' __user_cap_data_struct for capget and capset.
 * Used in {@link Os.capget( StructUserCapHeader )} and
 * {@link Os.capset( StructUserCapHeader , StructUserCapData[])}.
 *
 * See <a href="https://man7.org/linux/man-pages/man2/capget.2.html">capget(2)</a>.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class StructUserCapData {

/**
 * Constructs an instance with the given field values.
 *
 * @param effective   effective capability mask
 * @param permitted   permitted capability mask
 * @param inheritable inheritable capability mask
 *
 * @hide
 */

public StructUserCapData(int effective, int permitted, int inheritable) { throw new RuntimeException("Stub!"); }

/**
 * @hide
 */

public java.lang.String toString() { throw new RuntimeException("Stub!"); }

/**
 * Effective capability mask.
 *
 * @hide
 */

public final int effective;
{ effective = 0; }

/**
 * Inheritable capability mask.
 *
 * @hide
 */

public final int inheritable;
{ inheritable = 0; }

/**
 * Permitted capability mask.
 *
 * @hide
 */

public final int permitted;
{ permitted = 0; }
}

