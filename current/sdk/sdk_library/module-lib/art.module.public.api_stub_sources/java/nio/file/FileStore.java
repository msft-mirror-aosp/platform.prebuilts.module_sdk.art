/*
 * Copyright (c) 2007, 2013, Oracle and/or its affiliates. All rights reserved.
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


package java.nio.file;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public abstract class FileStore {

protected FileStore() { throw new RuntimeException("Stub!"); }

public abstract java.lang.String name();

public abstract java.lang.String type();

public abstract boolean isReadOnly();

public abstract long getTotalSpace() throws java.io.IOException;

public abstract long getUsableSpace() throws java.io.IOException;

public abstract long getUnallocatedSpace() throws java.io.IOException;

public abstract boolean supportsFileAttributeView(java.lang.Class<? extends java.nio.file.attribute.FileAttributeView> type);

public abstract boolean supportsFileAttributeView(java.lang.String name);

public abstract <V extends java.nio.file.attribute.FileStoreAttributeView> V getFileStoreAttributeView(java.lang.Class<V> type);

public abstract java.lang.Object getAttribute(java.lang.String attribute) throws java.io.IOException;
}
