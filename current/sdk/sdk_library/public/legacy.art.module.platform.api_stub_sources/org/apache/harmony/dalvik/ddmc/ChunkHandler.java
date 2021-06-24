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
 * To handle a chunk type, sub-class {@link org.apache.harmony.dalvik.ddmc.ChunkHandler ChunkHandler} and register your class
 * with {@link org.apache.harmony.dalvik.ddmc.DdmServer DdmServer}.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public abstract class ChunkHandler {

/**
 * Constructs chunk handler.
 *
 * @hide
 */

public ChunkHandler() { throw new RuntimeException("Stub!"); }

/**
 * Called when the DDM server connects.  The handler is allowed to
 * send messages to the server.
 *
 * @hide
 */

public abstract void onConnected();

/**
 * Called when the DDM server disconnects.  Can be used to disable
 * periodic transmissions or clean up saved state.
 *
 * @hide
 */

public abstract void onDisconnected();

/**
 * Handle a single chunk of data.  {@code request} includes the type and
 * the chunk payload.
 *
 * Returns a response in a {@link org.apache.harmony.dalvik.ddmc.Chunk Chunk}.
 *
 * @param request chunk type and payload
 * @return        {@link org.apache.harmony.dalvik.ddmc.Chunk Chunk} with response
 *
 * @hide
 */

public abstract org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk request);

/**
 * Create a FAIL chunk.  The {@link #handleChunk(org.apache.harmony.dalvik.ddmc.Chunk)} methods can use this to
 * return an error message when they are not able to process a chunk.
 *
 * @param errorCode arbitrary number to distinguish error
 * @param msg       error message
 * @return          {@link org.apache.harmony.dalvik.ddmc.Chunk Chunk} with response
 *
 * @hide
 */

public static org.apache.harmony.dalvik.ddmc.Chunk createFailChunk(int errorCode, java.lang.String msg) { throw new RuntimeException("Stub!"); }

/**
 * Utility function to wrap a {@link java.nio.ByteBuffer ByteBuffer} around a {@link org.apache.harmony.dalvik.ddmc.Chunk Chunk}.
 *
 * @param request chunk to be wrapped
 * @return        {@link java.nio.ByteBuffer ByteBuffer} wrapping data from the given chunk
 *
 * @hide
 */

public static java.nio.ByteBuffer wrapChunk(org.apache.harmony.dalvik.ddmc.Chunk request) { throw new RuntimeException("Stub!"); }

/**
 * Convert a 4-character string to a 32-bit type.
 *
 * @hide
 */

public static int type(java.lang.String typeName) { throw new RuntimeException("Stub!"); }

/**
 * Convert an integer type to a 4-character string.
 *
 * @hide
 */

public static java.lang.String name(int type) { throw new RuntimeException("Stub!"); }

/**
 * Byte order of the data in the chunk.
 *
 * @hide
 */

public static final java.nio.ByteOrder CHUNK_ORDER;
static { CHUNK_ORDER = null; }
}

