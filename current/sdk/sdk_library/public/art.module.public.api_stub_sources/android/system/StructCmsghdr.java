/*
 * Copyright (C) 2021 The Android Open Source Project
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
 * Corresponds to C's {@code struct cmsghdr}.
 *
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class StructCmsghdr {

public StructCmsghdr(int cmsg_level, int cmsg_type, short value) { throw new RuntimeException("Stub!"); }

public StructCmsghdr(int cmsg_level, int cmsg_type, @android.annotation.NonNull byte[] value) { throw new RuntimeException("Stub!"); }

/** message data sent/received */

@android.annotation.NonNull public final byte[] cmsg_data;
{ cmsg_data = new byte[0]; }

/** Originating protocol */

public final int cmsg_level;
{ cmsg_level = 0; }

/** Protocol-specific type */

public final int cmsg_type;
{ cmsg_type = 0; }
}
