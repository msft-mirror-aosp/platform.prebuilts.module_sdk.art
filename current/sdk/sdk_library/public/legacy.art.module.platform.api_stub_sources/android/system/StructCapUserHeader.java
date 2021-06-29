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
 * Corresponds to Linux' __user_cap_header_struct for capget and capset.
 * Used in {@link Os.capget(StructCapUserHeader)} and
 * {@link Os.capset(StructCapUserHeader, StructCapUserData[])}.
 *
 * Capabilities defined in <a href="https://man7.org/linux/man-pages/man7/capabilities.7.html">capabilities(7)</a>
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class StructCapUserHeader {

/**
 * Constructs an instance with the given field values.
 *
 * @param version linux capability version
 * @param pid     process id
 *
 * @hide
 */

public StructCapUserHeader(int version, int pid) { throw new RuntimeException("Stub!"); }

/**
 * @hide
 */

public java.lang.String toString() { throw new RuntimeException("Stub!"); }
}

