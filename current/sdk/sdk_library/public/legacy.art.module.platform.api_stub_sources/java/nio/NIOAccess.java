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


package java.nio;


/**
 * This class is used via JNI by code in frameworks/base/ and
 * by the JniConstants cache in libnativehelper/.
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class NIOAccess {

private NIOAccess() { throw new RuntimeException("Stub!"); }

/**
 * Returns the underlying Java array containing the data of the
 * given Buffer, or null if the Buffer is not backed by a Java array.
 *
 * @param b  {@code Buffer} to get its underlying data array
 * @return   underlying Java array
 *
 * @hide
 */

public static java.lang.Object getBaseArray(java.nio.Buffer b) { throw new RuntimeException("Stub!"); }

/**
 * Returns the offset in bytes from the start of the underlying
 * Java array object containing the data of the given Buffer to
 * the actual start of the data. The start of the data takes into
 * account the Buffer's current position. This method is only
 * meaningful if {@link #getBaseArray(java.nio.Buffer)} returns non-null.
 *
 * @param b {@code Buffer} to get its underlying data array's base offset
 * @return  underlying Java array's base offset
 *
 * @hide
 */

public static int getBaseArrayOffset(java.nio.Buffer b) { throw new RuntimeException("Stub!"); }
}
