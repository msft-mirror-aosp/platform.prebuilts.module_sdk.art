/*
 * Copyright (C) 2006 The Android Open Source Project
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
public final class ZygoteHooks {

private ZygoteHooks() { throw new RuntimeException("Stub!"); }

public static native void startZygoteNoThreadCreation();

public static void onBeginPreload() { throw new RuntimeException("Stub!"); }

public static void onEndPreload() { throw new RuntimeException("Stub!"); }

public static void gcAndFinalize() { throw new RuntimeException("Stub!"); }

public static native void stopZygoteNoThreadCreation();

public static void preFork() { throw new RuntimeException("Stub!"); }

public static void postForkSystemServer(int runtimeFlags) { throw new RuntimeException("Stub!"); }

public static void postForkChild(int runtimeFlags, boolean isSystemServer, boolean isChildZygote, java.lang.String instructionSet) { throw new RuntimeException("Stub!"); }

public static void postForkCommon() { throw new RuntimeException("Stub!"); }

public static boolean isIndefiniteThreadSuspensionSafe() { throw new RuntimeException("Stub!"); }
}

