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

import java.nio.ByteBuffer;

/**
 * Handle a chunk of data sent from a DDM server.
 *
 * To handle a chunk type, sub-class ChunkHandler and register your class
 * with DdmServer.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public abstract class ChunkHandler {

public ChunkHandler() { throw new RuntimeException("Stub!"); }

/**
 * Called when the DDM server connects.  The handler is allowed to
 * send messages to the server.
 */

public abstract void connected();

/**
 * Called when the DDM server disconnects.  Can be used to disable
 * periodic transmissions or clean up saved state.
 */

public abstract void disconnected();

/**
 * Handle a single chunk of data.  "request" includes the type and
 * the chunk payload.
 *
 * Returns a response in a Chunk.
 */

public abstract org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk request);

/**
 * Create a FAIL chunk.  The "handleChunk" methods can use this to
 * return an error message when they are not able to process a chunk.
 */

public static org.apache.harmony.dalvik.ddmc.Chunk createFailChunk(int errorCode, java.lang.String msg) { throw new RuntimeException("Stub!"); }

/**
 * Utility function to wrap a ByteBuffer around a Chunk.
 */

public static java.nio.ByteBuffer wrapChunk(org.apache.harmony.dalvik.ddmc.Chunk request) { throw new RuntimeException("Stub!"); }

/**
 * Utility function to copy a String out of a ByteBuffer.
 *
 * This is here because multiple chunk handlers can make use of it,
 * and there's nowhere better to put it.
 */

public static java.lang.String getString(java.nio.ByteBuffer buf, int len) { throw new RuntimeException("Stub!"); }

/**
 * Utility function to copy a String into a ByteBuffer.
 */

public static void putString(java.nio.ByteBuffer buf, java.lang.String str) { throw new RuntimeException("Stub!"); }

/**
 * Convert a 4-character string to a 32-bit type.
 */

public static int type(java.lang.String typeName) { throw new RuntimeException("Stub!"); }

/**
 * Convert an integer type to a 4-character string.
 */

public static java.lang.String name(int type) { throw new RuntimeException("Stub!"); }

public static final java.nio.ByteOrder CHUNK_ORDER;
static { CHUNK_ORDER = null; }
}

