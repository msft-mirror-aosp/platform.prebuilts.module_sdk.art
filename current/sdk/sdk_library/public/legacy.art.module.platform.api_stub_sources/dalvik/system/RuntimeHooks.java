/*
 * Copyright (C) 2018 The Android Open Source Project
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

import java.util.TimeZone;
import java.util.function.Supplier;

/**
 * Provides lifecycle methods and other hooks for an Android runtime "container" to call into the
 * runtime and core libraries during initialization. For example, from
 * {@link com.android.internal.os.RuntimeInit}.
 *
 * <p>Having a facade class helps to limit the container's knowledge of runtime and core libraries
 * internal details. All methods assume the container initialization is single threaded.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class RuntimeHooks {

private RuntimeHooks() { throw new RuntimeException("Stub!"); }

/**
 * Sets the {@link java.util.function.Supplier Supplier} that is used by {@link java.util.TimeZone TimeZone} to retrieve the current time zone
 * ID iff the cached default is {@code null}.
 *
 * <p>This method also clears the current {@link java.util.TimeZone TimeZone} default ensuring that the supplier
 * will be used next time {@link java.util.TimeZone#getDefault() TimeZone#getDefault()} is called (unless
 * {@link java.util.TimeZone#setDefault(java.util.TimeZone) TimeZone#setDefault(TimeZone)} is called with a non-{@code null} value in the interim).
 *
 * <p>Once set the supplier cannot be changed.
 *
 * @param zoneIdSupplier new {@link java.util.function.Supplier Supplier} of the time zone ID
 */

public static void setTimeZoneIdSupplier(@android.annotation.NonNull java.util.function.Supplier<java.lang.String> zoneIdSupplier) { throw new RuntimeException("Stub!"); }

/**
 * Sets an {@link java.lang.Thread.UncaughtExceptionHandler Thread.UncaughtExceptionHandler} that will be called before any
 * returned by {@link java.lang.Thread#getUncaughtExceptionHandler() Thread#getUncaughtExceptionHandler()}. To allow the standard
 * handlers to run, this handler should never terminate this process. Any
 * throwables thrown by the handler will be ignored by
 * {@link java.lang.Thread#dispatchUncaughtException(java.lang.Throwable) Thread#dispatchUncaughtException(Throwable)}.
 *
 * @param uncaughtExceptionHandler handler for uncaught exceptions
 */

public static void setUncaughtExceptionPreHandler(@android.annotation.Nullable java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) { throw new RuntimeException("Stub!"); }
}

