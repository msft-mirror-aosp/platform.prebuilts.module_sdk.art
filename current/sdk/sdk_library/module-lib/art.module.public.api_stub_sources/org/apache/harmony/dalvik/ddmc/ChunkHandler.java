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

@SuppressWarnings({"unchecked", "deprecation", "all"})
public abstract class ChunkHandler {

public ChunkHandler() { throw new RuntimeException("Stub!"); }

public abstract void onConnected();

public abstract void onDisconnected();

public abstract org.apache.harmony.dalvik.ddmc.Chunk handleChunk(org.apache.harmony.dalvik.ddmc.Chunk request);

public static org.apache.harmony.dalvik.ddmc.Chunk createFailChunk(int errorCode, java.lang.String msg) { throw new RuntimeException("Stub!"); }

public static java.nio.ByteBuffer wrapChunk(org.apache.harmony.dalvik.ddmc.Chunk request) { throw new RuntimeException("Stub!"); }

public static int type(java.lang.String typeName) { throw new RuntimeException("Stub!"); }

public static java.lang.String name(int type) { throw new RuntimeException("Stub!"); }

public static final java.nio.ByteOrder CHUNK_ORDER;
static { CHUNK_ORDER = null; }
}
