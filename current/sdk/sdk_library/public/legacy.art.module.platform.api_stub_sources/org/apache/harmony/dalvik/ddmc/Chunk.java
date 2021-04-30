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
 * A chunk of DDM data.  This is really just meant to hold a few pieces
 * of data together.
 *
 * The "offset" and "length" fields are present so handlers can over-allocate
 * or share byte buffers.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class Chunk {

/**
 * Constructor with all fields.
 */

public Chunk(int type, byte[] data, int offset, int length) { throw new RuntimeException("Stub!"); }

/**
 * Construct from a ByteBuffer.  The chunk is assumed to start at
 * offset 0 and continue to the current position.
 */

public Chunk(int type, java.nio.ByteBuffer buf) { throw new RuntimeException("Stub!"); }

public int type;
}

