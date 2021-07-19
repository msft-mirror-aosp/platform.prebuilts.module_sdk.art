/*
 * Copyright (C) 2011 The Android Open Source Project
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
 * Corresponds to C's {@code struct timeval} from {@code sys/time.h}.
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class StructTimeval {

private StructTimeval() { throw new RuntimeException("Stub!"); }

@android.annotation.NonNull
public static android.system.StructTimeval fromMillis(long millis) { throw new RuntimeException("Stub!"); }

public long toMillis() { throw new RuntimeException("Stub!"); }

public java.lang.String toString() { throw new RuntimeException("Stub!"); }

public boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }

public int hashCode() { throw new RuntimeException("Stub!"); }

/** Seconds. */

public final long tv_sec;
{ tv_sec = 0; }

/** Microseconds. */

public final long tv_usec;
{ tv_usec = 0; }
}

