/*
 * Copyright (C) 2019 The Android Open Source Project
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


package android.compat;


/**
 * Internal APIs for logging and gating compatibility changes.
 *
 * @see ChangeId
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class Compatibility {

private Compatibility() { throw new RuntimeException("Stub!"); }

/**
 * Reports that a compatibility change is affecting the current process now.
 *
 * <p>Calls to this method from a non-app process are ignored. This allows code implementing
 * APIs that are used by apps and by other code (e.g. the system server) to report changes
 * regardless of the process it's running in. When called in a non-app process, this method is
 * a no-op.
 *
 * <p>Note: for changes that are gated using {@link #isChangeEnabled(long)}, you do not need to
 * call this API directly. The change will be reported for you in the case that
 * {@link #isChangeEnabled(long)} returns {@code true}.
 *
 * @param changeId The ID of the compatibility change taking effect.
 */

public static void reportUnconditionalChange(long changeId) { throw new RuntimeException("Stub!"); }

/**
 * Query if a given compatibility change is enabled for the current process. This method should
 * only be called by code running inside a process of the affected app.
 *
 * <p>If this method returns {@code true}, the calling code should implement the compatibility
 * change, resulting in differing behaviour compared to earlier releases. If this method returns
 * {@code false}, the calling code should behave as it did in earlier releases.
 *
 * <p>When this method returns {@code true}, it will also report the change as
 * {@link #reportUnconditionalChange(long)} would, so there is no need to call that method directly.
 *
 * @param changeId The ID of the compatibility change in question.
 * @return {@code true} if the change is enabled for the current app.
 */

public static boolean isChangeEnabled(long changeId) { throw new RuntimeException("Stub!"); }

/**
 * Sets the behavior change delegate.
 *
 * All changes reported via the {@link android.compat.Compatibility Compatibility} class will be forwarded to this class.
 */

public static void setBehaviorChangeDelegate(android.compat.Compatibility.BehaviorChangeDelegate callbacks) { throw new RuntimeException("Stub!"); }

/**
 * Removes a behavior change delegate previously set via {@link #setBehaviorChangeDelegate}.
 */

public static void clearBehaviorChangeDelegate() { throw new RuntimeException("Stub!"); }

/**
 * For use by tests only. Causes values from {@code overrides} to be returned instead of the
 * real value.
 */

public static void setOverrides(android.compat.Compatibility.ChangeConfig overrides) { throw new RuntimeException("Stub!"); }

/**
 * For use by tests only. Removes overrides set by {@link #setOverrides}.
 */

public static void clearOverrides() { throw new RuntimeException("Stub!"); }
/**
 * Base class for compatibility API implementations. The default implementation logs a warning
 * to logcat.
 *
 * This is provided as a class rather than an interface to allow new methods to be added without
 * breaking @CorePlatformApi binary compatibility.
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public static interface BehaviorChangeDelegate {

/**
 * Called when a change is reported via {@link android.compat.Compatibility#reportUnconditionalChange Compatibility#reportUnconditionalChange}
 */

public default void onChangeReported(long changeId) { throw new RuntimeException("Stub!"); }

/**
 * Called when a change is queried via {@link android.compat.Compatibility#isChangeEnabled Compatibility#isChangeEnabled}
 */

public default boolean isChangeEnabled(long changeId) { throw new RuntimeException("Stub!"); }
}

@SuppressWarnings({"unchecked", "deprecation", "all"})
public static final class ChangeConfig {

public ChangeConfig(@android.annotation.NonNull java.util.Set<java.lang.Long> enabled, @android.annotation.NonNull java.util.Set<java.lang.Long> disabled) { throw new RuntimeException("Stub!"); }

public boolean isEmpty() { throw new RuntimeException("Stub!"); }

@android.annotation.NonNull
public long[] getEnabledChangesArray() { throw new RuntimeException("Stub!"); }

@android.annotation.NonNull
public long[] getDisabledChangesArray() { throw new RuntimeException("Stub!"); }

@android.annotation.NonNull
public java.util.Set<java.lang.Long> getEnabledSet() { throw new RuntimeException("Stub!"); }

@android.annotation.NonNull
public java.util.Set<java.lang.Long> getDisabledSet() { throw new RuntimeException("Stub!"); }

public boolean isForceEnabled(long changeId) { throw new RuntimeException("Stub!"); }

public boolean isForceDisabled(long changeId) { throw new RuntimeException("Stub!"); }

public boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }

public int hashCode() { throw new RuntimeException("Stub!"); }

public java.lang.String toString() { throw new RuntimeException("Stub!"); }
}

}

