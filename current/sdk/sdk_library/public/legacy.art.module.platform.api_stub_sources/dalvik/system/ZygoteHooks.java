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


/**
 * Provides hooks for the zygote to call back into the runtime to perform
 * parent or child specific initialization..
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class ZygoteHooks {

private ZygoteHooks() { throw new RuntimeException("Stub!"); }

/**
 * Called by the zygote when starting up. It marks the point when any thread
 * start should be an error, as only internal daemon threads are allowed there.
 *
 * @hide
 */

public static native void startZygoteNoThreadCreation();

/**
 * Called when the zygote begins preloading classes and data.
 *
 * @hide
 */

public static void onBeginPreload() { throw new RuntimeException("Stub!"); }

/**
 * Called when the zygote has completed preloading classes and data.
 *
 * @hide
 */

public static void onEndPreload() { throw new RuntimeException("Stub!"); }

/**
 * Runs several special GCs to try to clean up a few generations of
 * softly- and final-reachable objects, along with any other garbage.
 * This is only useful just before a fork().
 *
 * @hide
 */

public static void gcAndFinalize() { throw new RuntimeException("Stub!"); }

/**
 * Called by the zygote when startup is finished. It marks the point when it is
 * conceivable that threads would be started again, e.g., restarting daemons.
 *
 * @hide
 */

public static native void stopZygoteNoThreadCreation();

/**
 * Called by the zygote prior to every fork. Each call to {@code preFork}
 * is followed by a matching call to {@link #postForkChild(int,boolean,boolean,java.lang.String)} on
 * the child process and {@link #postForkCommon()} on both the parent and the child
 * process. {@code postForkCommon} is called after {@code postForkChild} in
 * the child process.
 *
 * @hide
 */

public static void preFork() { throw new RuntimeException("Stub!"); }

/**
 * Called by the zygote in the system server process after forking. This method is is called
 * before {@code postForkChild} for system server.
 *
 * @param runtimeFlags The flags listed in com.android.internal.os.Zygote passed to the runtime.
 *
 * @hide
 */

public static void postForkSystemServer(int runtimeFlags) { throw new RuntimeException("Stub!"); }

/**
 * Called by the zygote in the child process after every fork.
 *
 * @param runtimeFlags The runtime flags to apply to the child process.
 * @param isSystemServer Whether the child process is system server.
 * @param isChildZygote Whether the child process is a child zygote.
 * @param instructionSet The instruction set of the child, used to determine
 *                       whether to use a native bridge.
 *
 * @hide
 */

public static void postForkChild(int runtimeFlags, boolean isSystemServer, boolean isChildZygote, java.lang.String instructionSet) { throw new RuntimeException("Stub!"); }

/**
 * Called by the zygote in both the parent and child processes after
 * every fork. In the child process, this method is called after
 * {@code postForkChild}.
 *
 * @hide
 */

public static void postForkCommon() { throw new RuntimeException("Stub!"); }

/**
 * Is it safe to keep all ART daemon threads stopped indefinitely in the zygote?
 * The answer may change from false to true dynamically, but not in the other
 * direction.
 *
 * @return {@code true} if it's safe to keep all ART daemon threads stopped
 *         indefinitely in the zygote; and {@code false} otherwise
 *
 * @hide
 */

public static boolean isIndefiniteThreadSuspensionSafe() { throw new RuntimeException("Stub!"); }
}

