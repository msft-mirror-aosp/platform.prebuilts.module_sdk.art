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
public final class DdmServer {

private DdmServer() { throw new RuntimeException("Stub!"); }

public static void registerHandler(int type, org.apache.harmony.dalvik.ddmc.ChunkHandler handler) { throw new RuntimeException("Stub!"); }

public static org.apache.harmony.dalvik.ddmc.ChunkHandler unregisterHandler(int type) { throw new RuntimeException("Stub!"); }

public static void registrationComplete() { throw new RuntimeException("Stub!"); }

public static void sendChunk(org.apache.harmony.dalvik.ddmc.Chunk chunk) { throw new RuntimeException("Stub!"); }
}

