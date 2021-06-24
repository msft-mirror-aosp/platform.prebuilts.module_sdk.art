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
 * This represents our connection to the DDM Server.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class DdmServer {

private DdmServer() { throw new RuntimeException("Stub!"); }

/**
 * Register an instance of the {@link org.apache.harmony.dalvik.ddmc.ChunkHandler ChunkHandler} class to handle a specific
 * chunk type.
 *
 * Throws an exception if the type already has a handler registered.
 *
 * @param type    int describing registered handler
 * @param handler handler to be registered
 * @throws java.lang.NullPointerException if {@code handler} is {@code null}
 *
 * @hide
 */

public static void registerHandler(int type, org.apache.harmony.dalvik.ddmc.ChunkHandler handler) { throw new RuntimeException("Stub!"); }

/**
 * Unregister the existing handler for the specified type.
 *
 * Returns the old handler.
 *
 * @hide
 */

public static org.apache.harmony.dalvik.ddmc.ChunkHandler unregisterHandler(int type) { throw new RuntimeException("Stub!"); }

/**
 * The application must call here after it finishes registering
 * handlers.
 *
 * @hide
 */

public static void registrationComplete() { throw new RuntimeException("Stub!"); }

/**
 * Send a chunk of data to the DDM server.  This takes the form of a
 * JDWP "event", which does not elicit a response from the server.
 *
 * Use this for "unsolicited" chunks.
 *
 * @param chunk to send
 *
 * @hide
 */

public static void sendChunk(org.apache.harmony.dalvik.ddmc.Chunk chunk) { throw new RuntimeException("Stub!"); }
}

