/*
 * Copyright (c) 1996, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


package java.io;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface ObjectStreamConstants {

public static final int PROTOCOL_VERSION_1 = 1; // 0x1

public static final int PROTOCOL_VERSION_2 = 2; // 0x2

public static final byte SC_BLOCK_DATA = 8; // 0x8

public static final byte SC_ENUM = 16; // 0x10

public static final byte SC_EXTERNALIZABLE = 4; // 0x4

public static final byte SC_SERIALIZABLE = 2; // 0x2

public static final byte SC_WRITE_METHOD = 1; // 0x1

public static final short STREAM_MAGIC = -21267; // 0xffffaced

public static final short STREAM_VERSION = 5; // 0x5

public static final java.io.SerializablePermission SUBCLASS_IMPLEMENTATION_PERMISSION = null;

public static final java.io.SerializablePermission SUBSTITUTION_PERMISSION = null;

public static final byte TC_ARRAY = 117; // 0x75

public static final byte TC_BASE = 112; // 0x70

public static final byte TC_BLOCKDATA = 119; // 0x77

public static final byte TC_BLOCKDATALONG = 122; // 0x7a

public static final byte TC_CLASS = 118; // 0x76

public static final byte TC_CLASSDESC = 114; // 0x72

public static final byte TC_ENDBLOCKDATA = 120; // 0x78

public static final byte TC_ENUM = 126; // 0x7e

public static final byte TC_EXCEPTION = 123; // 0x7b

public static final byte TC_LONGSTRING = 124; // 0x7c

public static final byte TC_MAX = 126; // 0x7e

public static final byte TC_NULL = 112; // 0x70

public static final byte TC_OBJECT = 115; // 0x73

public static final byte TC_PROXYCLASSDESC = 125; // 0x7d

public static final byte TC_REFERENCE = 113; // 0x71

public static final byte TC_RESET = 121; // 0x79

public static final byte TC_STRING = 116; // 0x74

public static final int baseWireHandle = 8257536; // 0x7e0000
}

