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

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class CloseGuard {

private CloseGuard() { throw new RuntimeException("Stub!"); }

public static dalvik.system.CloseGuard get() { throw new RuntimeException("Stub!"); }

public static void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }

public static void setReporter(dalvik.system.CloseGuard.Reporter rep) { throw new RuntimeException("Stub!"); }

public static dalvik.system.CloseGuard.Reporter getReporter() { throw new RuntimeException("Stub!"); }

public void open(java.lang.String closer) { throw new RuntimeException("Stub!"); }

public void openWithCallSite(java.lang.String closer, java.lang.String callsite) { throw new RuntimeException("Stub!"); }

public void close() { throw new RuntimeException("Stub!"); }

public void warnIfOpen() { throw new RuntimeException("Stub!"); }
@SuppressWarnings({"unchecked", "deprecation", "all"})
public static interface Reporter {

public void report(java.lang.String message, java.lang.Throwable allocationSite);

public default void report(java.lang.String message) { throw new RuntimeException("Stub!"); }
}

}

