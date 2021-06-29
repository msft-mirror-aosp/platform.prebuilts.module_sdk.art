/*
 * Copyright (C) 2007 The Android Open Source Project
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


package dalvik.system;


/**
 * Provides a limited interface to the Dalvik VM stack. This class is mostly
 * used for implementing security checks.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class VMStack {

private VMStack() { throw new RuntimeException("Stub!"); }

/**
 * Retrieves an annotated stack trace from the specified thread.
 *
 * @param t
 *      thread of interest
 * @return an array of annotated stack frames, or null if the thread
 *      doesn't have a stack trace (e.g. because it exited)
 *
 * @hide
 */

@android.annotation.Nullable
@dalvik.annotation.optimization.FastNative
public static native dalvik.system.AnnotatedStackTraceElement[] getAnnotatedThreadStackTrace(java.lang.Thread t);
}

