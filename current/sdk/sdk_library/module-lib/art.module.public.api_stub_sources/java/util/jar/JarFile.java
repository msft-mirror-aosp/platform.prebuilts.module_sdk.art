/*
 * Copyright (C) 2014 The Android Open Source Project
 * Copyright (c) 1997, 2013, Oracle and/or its affiliates. All rights reserved.
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


package java.util.jar;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class JarFile extends java.util.zip.ZipFile {

public JarFile(java.lang.String name) throws java.io.IOException { super((java.lang.String)null); throw new RuntimeException("Stub!"); }

public JarFile(java.lang.String name, boolean verify) throws java.io.IOException { super((java.lang.String)null); throw new RuntimeException("Stub!"); }

public JarFile(java.io.File file) throws java.io.IOException { super((java.lang.String)null); throw new RuntimeException("Stub!"); }

public JarFile(java.io.File file, boolean verify) throws java.io.IOException { super((java.lang.String)null); throw new RuntimeException("Stub!"); }

public JarFile(java.io.File file, boolean verify, int mode) throws java.io.IOException { super((java.lang.String)null); throw new RuntimeException("Stub!"); }

public java.util.jar.Manifest getManifest() throws java.io.IOException { throw new RuntimeException("Stub!"); }

public java.util.jar.JarEntry getJarEntry(java.lang.String name) { throw new RuntimeException("Stub!"); }

public java.util.zip.ZipEntry getEntry(java.lang.String name) { throw new RuntimeException("Stub!"); }

public java.util.Enumeration<java.util.jar.JarEntry> entries() { throw new RuntimeException("Stub!"); }

public java.util.stream.Stream<java.util.jar.JarEntry> stream() { throw new RuntimeException("Stub!"); }

public synchronized java.io.InputStream getInputStream(java.util.zip.ZipEntry ze) throws java.io.IOException { throw new RuntimeException("Stub!"); }

public static final int CENATT = 36; // 0x24

public static final int CENATX = 38; // 0x26

public static final int CENCOM = 32; // 0x20

public static final int CENCRC = 16; // 0x10

public static final int CENDSK = 34; // 0x22

public static final int CENEXT = 30; // 0x1e

public static final int CENFLG = 8; // 0x8

public static final int CENHDR = 46; // 0x2e

public static final int CENHOW = 10; // 0xa

public static final int CENLEN = 24; // 0x18

public static final int CENNAM = 28; // 0x1c

public static final int CENOFF = 42; // 0x2a

public static final long CENSIG = 33639248L; // 0x2014b50L

public static final int CENSIZ = 20; // 0x14

public static final int CENTIM = 12; // 0xc

public static final int CENVEM = 4; // 0x4

public static final int CENVER = 6; // 0x6

public static final int ENDCOM = 20; // 0x14

public static final int ENDHDR = 22; // 0x16

public static final int ENDOFF = 16; // 0x10

public static final long ENDSIG = 101010256L; // 0x6054b50L

public static final int ENDSIZ = 12; // 0xc

public static final int ENDSUB = 8; // 0x8

public static final int ENDTOT = 10; // 0xa

public static final int EXTCRC = 4; // 0x4

public static final int EXTHDR = 16; // 0x10

public static final int EXTLEN = 12; // 0xc

public static final long EXTSIG = 134695760L; // 0x8074b50L

public static final int EXTSIZ = 8; // 0x8

public static final int LOCCRC = 14; // 0xe

public static final int LOCEXT = 28; // 0x1c

public static final int LOCFLG = 6; // 0x6

public static final int LOCHDR = 30; // 0x1e

public static final int LOCHOW = 8; // 0x8

public static final int LOCLEN = 22; // 0x16

public static final int LOCNAM = 26; // 0x1a

public static final long LOCSIG = 67324752L; // 0x4034b50L

public static final int LOCSIZ = 18; // 0x12

public static final int LOCTIM = 10; // 0xa

public static final int LOCVER = 4; // 0x4

public static final java.lang.String MANIFEST_NAME = "META-INF/MANIFEST.MF";
}
