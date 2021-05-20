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
public interface Path extends java.lang.Comparable<java.nio.file.Path>,  java.lang.Iterable<java.nio.file.Path>, java.nio.file.Watchable {

public java.nio.file.FileSystem getFileSystem();

public boolean isAbsolute();

public java.nio.file.Path getRoot();

public java.nio.file.Path getFileName();

public java.nio.file.Path getParent();

public int getNameCount();

public java.nio.file.Path getName(int index);

public java.nio.file.Path subpath(int beginIndex, int endIndex);

public boolean startsWith(java.nio.file.Path other);

public boolean startsWith(java.lang.String other);

public boolean endsWith(java.nio.file.Path other);

public boolean endsWith(java.lang.String other);

public java.nio.file.Path normalize();

public java.nio.file.Path resolve(java.nio.file.Path other);

public java.nio.file.Path resolve(java.lang.String other);

public java.nio.file.Path resolveSibling(java.nio.file.Path other);

public java.nio.file.Path resolveSibling(java.lang.String other);

public java.nio.file.Path relativize(java.nio.file.Path other);

public java.net.URI toUri();

public java.nio.file.Path toAbsolutePath();

public java.nio.file.Path toRealPath(java.nio.file.LinkOption... options) throws java.io.IOException;

public java.io.File toFile();

public java.nio.file.WatchKey register(java.nio.file.WatchService watcher, java.nio.file.WatchEvent.Kind<?>[] events, java.nio.file.WatchEvent.Modifier... modifiers) throws java.io.IOException;

public java.nio.file.WatchKey register(java.nio.file.WatchService watcher, java.nio.file.WatchEvent.Kind<?>... events) throws java.io.IOException;

public java.util.Iterator<java.nio.file.Path> iterator();

public int compareTo(java.nio.file.Path other);

public boolean equals(java.lang.Object other);

public int hashCode();

public java.lang.String toString();
}

