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


package dalvik.system;


/**
 * CloseGuard is a mechanism for flagging implicit finalizer cleanup of
 * resources that should have been cleaned up by explicit close
 * methods (aka "explicit termination methods" in Effective Java).
 * <p>
 * A simple example: <pre>   {@code
 *   class Foo {
 *
 *       {@literal @}ReachabilitySensitive
 *       private final CloseGuard guard = CloseGuard.get();
 *
 *       ...
 *
 *       public Foo() {
 *           ...;
 *           guard.open("cleanup");
 *       }
 *
 *       public void cleanup() {
 *          guard.close();
 *          ...;
 *       }
 *
 *       protected void finalize() throws Throwable {
 *           try {
 *               // Note that guard could be null if the constructor threw.
 *               if (guard != null) {
 *                   guard.warnIfOpen();
 *               }
 *               cleanup();
 *           } finally {
 *               super.finalize();
 *           }
 *       }
 *   }
 * }</pre>
 *
 * In usage where the resource to be explicitly cleaned up is
 * allocated after object construction, CloseGuard protection can
 * be deferred. For example: <pre>   {@code
 *   class Bar {
 *
 *       {@literal @}ReachabilitySensitive
 *       private final CloseGuard guard = CloseGuard.get();
 *
 *       ...
 *
 *       public Bar() {
 *           ...;
 *       }
 *
 *       public void connect() {
 *          ...;
 *          guard.open("cleanup");
 *       }
 *
 *       public void cleanup() {
 *          guard.close();
 *          ...;
 *       }
 *
 *       protected void finalize() throws Throwable {
 *           try {
 *               // Note that guard could be null if the constructor threw.
 *               if (guard != null) {
 *                   guard.warnIfOpen();
 *               }
 *               cleanup();
 *           } finally {
 *               super.finalize();
 *           }
 *       }
 *   }
 * }</pre>
 *
 * When used in a constructor, calls to {@code open} should occur at
 * the end of the constructor since an exception that would cause
 * abrupt termination of the constructor will mean that the user will
 * not have a reference to the object to cleanup explicitly. When used
 * in a method, the call to {@code open} should occur just after
 * resource acquisition.
 *
 * The @ReachabilitySensitive annotation ensures that finalize() cannot be
 * called during the explicit call to cleanup(), prior to the guard.close call.
 * There is an extremely small chance that, for code that neglects to call
 * cleanup(), finalize() and thus cleanup() will be called while a method on
 * the object is still active, but the "this" reference is no longer required.
 * If missing cleanup() calls are expected, additional @ReachabilitySensitive
 * annotations or reachabilityFence() calls may be required.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class CloseGuard {

private CloseGuard() { throw new RuntimeException("Stub!"); }

/**
 * Returns a CloseGuard instance. {@code #open(String)} can be used to set
 * up the instance to warn on failure to close.
 *
 * @return {@link dalvik.system.CloseGuard CloseGuard} instance.
 */

public static dalvik.system.CloseGuard get() { throw new RuntimeException("Stub!"); }

/**
 * Enables/disables stack capture and tracking. A call stack is captured
 * during open(), and open/close events are reported to the Tracker, only
 * if enabled is true. If a stack trace was captured, the {@link
 * #getReporter() reporter} is informed of unclosed resources; otherwise a
 * one-line warning is logged.
 *
 * @param enabled whether stack capture and tracking is enabled.
 */

public static void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }

/**
 * Used to replace default Reporter used to warn of CloseGuard
 * violations when stack tracking is enabled. Must be non-null.
 *
 * @param rep replacement for default Reporter.
 */

public static void setReporter(dalvik.system.CloseGuard.Reporter rep) { throw new RuntimeException("Stub!"); }

/**
 * Returns non-null CloseGuard.Reporter.
 *
 * @return CloseGuard's Reporter.
 */

public static dalvik.system.CloseGuard.Reporter getReporter() { throw new RuntimeException("Stub!"); }

/**
 * {@code open} initializes the instance with a warning that the caller
 * should have explicitly called the {@code closer} method instead of
 * relying on finalization.
 *
 * @param closer non-null name of explicit termination method. Printed by warnIfOpen.
 * @throws java.lang.NullPointerException if closer is null.
 */

public void open(java.lang.String closer) { throw new RuntimeException("Stub!"); }

/**
 * Like {@link #open(java.lang.String)}, but with explicit callsite string being passed in for better
 * performance.
 * <p>
 * This only has better performance than {@link #open(java.lang.String)} if {@link #isEnabled()} returns {@code true}, which
 * usually shouldn't happen on release builds.
 *
 * @param closer Non-null name of explicit termination method. Printed by warnIfOpen.
 * @param callsite Non-null string uniquely identifying the callsite.
 */

public void openWithCallSite(java.lang.String closer, java.lang.String callsite) { throw new RuntimeException("Stub!"); }

/**
 * Marks this CloseGuard instance as closed to avoid warnings on
 * finalization.
 */

public void close() { throw new RuntimeException("Stub!"); }

/**
 * Logs a warning if the caller did not properly cleanup by calling an
 * explicit close method before finalization. If CloseGuard was enabled
 * when the CloseGuard was created, passes the stacktrace associated with
 * the allocation to the current reporter. If it was not enabled, it just
 * directly logs a brief message.
 */

public void warnIfOpen() { throw new RuntimeException("Stub!"); }
/**
 * Interface to allow customization of reporting behavior.
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public static interface Reporter {

public void report(java.lang.String message, java.lang.Throwable allocationSite);

public default void report(java.lang.String message) { throw new RuntimeException("Stub!"); }
}

}

