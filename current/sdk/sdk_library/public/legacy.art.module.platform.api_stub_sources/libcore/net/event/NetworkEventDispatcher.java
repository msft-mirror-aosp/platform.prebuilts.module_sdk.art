/*
 * Copyright (C) 2014 The Android Open Source Project
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


package libcore.net.event;


/**
 * A singleton used to dispatch network events to registered listeners.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class NetworkEventDispatcher {

NetworkEventDispatcher() { throw new RuntimeException("Stub!"); }

/**
 * Returns the shared {@link libcore.net.event.NetworkEventDispatcher NetworkEventDispatcher} instance.
 *
 * @return singleton instance of {@link libcore.net.event.NetworkEventDispatcher NetworkEventDispatcher}
 */

public static libcore.net.event.NetworkEventDispatcher getInstance() { throw new RuntimeException("Stub!"); }

/**
 * Notifies registered listeners of a network configuration change.
 */

public void onNetworkConfigurationChanged() { throw new RuntimeException("Stub!"); }
}

