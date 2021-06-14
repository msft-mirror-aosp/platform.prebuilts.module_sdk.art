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


package dalvik.system;


/**
 * A class encapsulating a StackTraceElement and lock state. This adds
 * critical thread state to the standard stack trace information, which
 * can be used to detect deadlocks at the Java level.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class AnnotatedStackTraceElement {

private AnnotatedStackTraceElement() { throw new RuntimeException("Stub!"); }

/**
 * Returns the {@link java.lang.StackTraceElement StackTraceElement} describing the Java stack frame.
 *
 * @return {@link java.lang.StackTraceElement StackTraceElement} describing the Java stack frame.
 *
 * @hide
 */

@android.annotation.NonNull
public java.lang.StackTraceElement getStackTraceElement() { throw new RuntimeException("Stub!"); }

/**
 * Returns the objects this stack frame is synchronized on.
 * May be {@code null}.
 *
 * @return array of objects current frame is syncronized on.
 *
 * @hide
 */

@android.annotation.Nullable
public java.lang.Object[] getHeldLocks() { throw new RuntimeException("Stub!"); }

/**
 * Returns the object this stack frame is waiting on for synchronization.
 * May be {@code null}.
 *
 * @return object this thread is waiting to lock, or waiting on, if any,
 *         or {@code null}, if none.
 *
 * @hide
 */

@android.annotation.Nullable
public java.lang.Object getBlockedOn() { throw new RuntimeException("Stub!"); }
}

