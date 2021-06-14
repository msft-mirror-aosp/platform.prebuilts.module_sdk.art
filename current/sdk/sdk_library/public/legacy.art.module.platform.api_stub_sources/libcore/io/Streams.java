/*
 * Copyright (C) 2010 The Android Open Source Project
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


package libcore.io;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.EOFException;
import java.io.Reader;

/**
 * Convenience class for reading and writing streams of bytes.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class Streams {

private Streams() { throw new RuntimeException("Stub!"); }

/**
 * Implements {@link java.io.InputStream#read(int) InputStream#read(int)} in terms of {@link java.io.InputStream#read(byte[],int,int) InputStream#read(byte[], int, int)}.
 * {@link java.io.InputStream InputStream} assumes that you implement {@link java.io.InputStream#read(int) InputStream#read(int)} and provides default
 * implementations of the others, but often the opposite is more efficient.
 *
 * @param in {@link java.io.InputStream InputStream} to read byte from
 * @return singlge byte read from {@code in}
 * @throws java.io.IOException in case of I/O error
 *
 * @hide
 */

public static int readSingleByte(@androidx.annotation.RecentlyNonNull java.io.InputStream in) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Implements {@link java.io.OutputStream#write(int) OutputStream#write(int)} in terms of {@link java.io.OutputStream#write(byte[],int,int) OutputStream#write(byte[], int, int)}.
 * {@link java.io.OutputStream OutputStream} assumes that you implement {@link java.io.OutputStream#write(int) OutputStream#write(int)} and provides default
 * implementations of the others, but often the opposite is more efficient.
 *
 * @param out {@link java.io.OutputStream OutputStream} to write byte to
 * @param b byte to write to stream {@code out}
 * @throws java.io.IOException in case of I/O error
 *
 * @hide
 */

public static void writeSingleByte(@androidx.annotation.RecentlyNonNull java.io.OutputStream out, int b) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Fills byte buffer {@code dst} with bytes from {@link java.io.InputStream InputStream} {@code in}, throwing
 * {@link java.io.EOFException EOFException} if insufficient bytes are available.
 *
 * @param in {@link java.io.InputStream InputStream} to read data from
 * @param dst byte buffer to write data to
 * @throws java.io.IOException in case of I/O error
 *
 * @hide
 */

public static void readFully(@androidx.annotation.RecentlyNonNull java.io.InputStream in, @androidx.annotation.RecentlyNonNull byte[] dst) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code byte[]} containing the remainder of {@code in} stream and
 * closes it. Also see {@link #readFullyNoClose(java.io.InputStream)}.
 *
 * @param in {@link java.io.InputStream InputStream} to read data from
 * @return remaining bytes in {@code in} stream.
 * @throws java.io.IOException thrown by {@link java.io.InputStream#read(byte[]) InputStream#read(byte[])}.
 *
 * @hide
 */

@androidx.annotation.RecentlyNonNull
public static byte[] readFully(@androidx.annotation.RecentlyNonNull java.io.InputStream in) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Returns a {@code byte[]} containing the remainder of {@code in} stream, without
 * closing it.
 *
 * @param in {@link java.io.InputStream InputStream} to read data from
 * @return remaining bytes in {@code in} stream.
 * @throws java.io.IOException thrown by {@link java.io.InputStream#read(byte[]) InputStream#read(byte[])}.
 *
 * @hide
 */

@androidx.annotation.RecentlyNonNull
public static byte[] readFullyNoClose(@androidx.annotation.RecentlyNonNull java.io.InputStream in) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Reads the remainder of {@code reader} as a string, closing it when done.
 *
 * @param reader {@link java.io.Reader Reader} instance.
 * @return remainder of {@code reader} as {@link java.lang.String String}.
 * @throws java.io.IOException thrown by {@link java.io.Reader#read(java.nio.CharBuffer) Reader#read(java.nio.CharBuffer)}.
 *
 * @hide
 */

@androidx.annotation.RecentlyNonNull
public static java.lang.String readFully(@androidx.annotation.RecentlyNonNull java.io.Reader reader) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Skip <b>at most</b> {@code byteCount} bytes from {@code in} by calling read
 * repeatedly until either the stream is exhausted or we read fewer bytes than
 * we ask for.
 *
 * <p>This method reuses the skip buffer but is careful to never use it at
 * the same time that another stream is using it. Otherwise streams that use
 * the caller's buffer for consistency checks like CRC could be clobbered by
 * other threads. A thread-local buffer is also insufficient because some
 * streams may call other streams in their skip() method, also clobbering the
 * buffer.
 *
 * @param in {@link java.io.InputStream InputStream} to skip data from
 * @param byteCount number of bytes to skip from {@code in}
 * @return number of bytes skipped from {@code in}
 * @throws java.io.IOException in case of I/O error
 *
 * @hide
 */

public static long skipByReading(@androidx.annotation.RecentlyNonNull java.io.InputStream in, long byteCount) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Copies all of the bytes from {@code in} to {@code out}. Neither stream is
 * closed.
 *
 * @param in {@link java.io.InputStream InputStream} to copy data from
 * @param out {@link java.io.InputStream InputStream} to write copied data to
 * @return the total number of bytes transferred.
 * @throws java.io.IOException reading from {@link java.io.InputStream InputStream} or writing to {@link java.io.OutputStream OutputStream}.
 *
 * @hide
 */

public static int copy(@androidx.annotation.RecentlyNonNull java.io.InputStream in, @androidx.annotation.RecentlyNonNull java.io.OutputStream out) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}

