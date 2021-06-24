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
 * limitations under the License
 */


package android.system;


/**
 * Information returned by {@link android.system.Os#getrlimit Os#getrlimit}. Corresponds to C's {@code struct rlimit} from
 * {@code <sys/resource.h>}.
 *
 * See <a href="https://man7.org/linux/man-pages/man3/vlimit.3.html">getrlimit(2)</a>.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class StructRlimit {

StructRlimit() { throw new RuntimeException("Stub!"); }

/**
 * @hide
 */

public java.lang.String toString() { throw new RuntimeException("Stub!"); }

/**
 * Soft limit
 *
 * @hide
 */

public final long rlim_cur;
{ rlim_cur = 0; }
}

