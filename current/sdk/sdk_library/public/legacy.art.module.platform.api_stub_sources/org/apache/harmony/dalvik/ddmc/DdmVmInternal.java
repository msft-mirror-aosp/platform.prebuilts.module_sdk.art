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


package org.apache.harmony.dalvik.ddmc;


/**
 * Declarations for some VM-internal DDM stuff.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class DdmVmInternal {

private DdmVmInternal() { throw new RuntimeException("Stub!"); }

/**
 * Enable thread notification.
 *
 * This is built into the VM, since that's where threads get managed.
 *
 * @param enabled {@code true} to enable thread notification; {@code false} to disable
 *
 * @hide
 */

public static native void setThreadNotifyEnabled(boolean enabled);

/**
 * Enable or disable "recent allocation" tracking.
 *
 * @param enabled {@code true} to enable recent allocation tracking; {@code false} to disable
 *
 * @hide
 */

public static native void setRecentAllocationsTrackingEnabled(boolean enabled);
}

