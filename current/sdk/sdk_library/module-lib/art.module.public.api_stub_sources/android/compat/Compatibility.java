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

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class Compatibility {

private Compatibility() { throw new RuntimeException("Stub!"); }

public static void reportUnconditionalChange(long changeId) { throw new RuntimeException("Stub!"); }

public static boolean isChangeEnabled(long changeId) { throw new RuntimeException("Stub!"); }

public static void setBehaviorChangeDelegate(android.compat.Compatibility.BehaviorChangeDelegate callbacks) { throw new RuntimeException("Stub!"); }

public static void clearBehaviorChangeDelegate() { throw new RuntimeException("Stub!"); }

public static void setOverrides(android.compat.Compatibility.ChangeConfig overrides) { throw new RuntimeException("Stub!"); }

public static void clearOverrides() { throw new RuntimeException("Stub!"); }
@SuppressWarnings({"unchecked", "deprecation", "all"})
public static interface BehaviorChangeDelegate {

public default void onChangeReported(long changeId) { throw new RuntimeException("Stub!"); }

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

