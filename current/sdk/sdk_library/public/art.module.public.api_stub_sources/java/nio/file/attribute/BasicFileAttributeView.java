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


package java.nio.file.attribute;

import java.io.IOException;

/**
 * A file attribute view that provides a view of a <em>basic set</em> of file
 * attributes common to many file systems. The basic set of file attributes
 * consist of <em>mandatory</em> and <em>optional</em> file attributes as
 * defined by the {@link java.nio.file.attribute.BasicFileAttributes BasicFileAttributes} interface.
 
 * <p> The file attributes are retrieved from the file system as a <em>bulk
 * operation</em> by invoking the {@link #readAttributes() readAttributes} method.
 * This class also defines the {@link #setTimes setTimes} method to update the
 * file's time attributes.
 *
 * <p> Where dynamic access to file attributes is required, the attributes
 * supported by this attribute view have the following names and types:
 * <blockquote>
 *  <table border="1" cellpadding="8" summary="Supported attributes">
 *   <tr>
 *     <th> Name </th>
 *     <th> Type </th>
 *   </tr>
 *  <tr>
 *     <td> "lastModifiedTime" </td>
 *     <td> {@link java.nio.file.attribute.FileTime FileTime} </td>
 *   </tr>
 *   <tr>
 *     <td> "lastAccessTime" </td>
 *     <td> {@link java.nio.file.attribute.FileTime FileTime} </td>
 *   </tr>
 *   <tr>
 *     <td> "creationTime" </td>
 *     <td> {@link java.nio.file.attribute.FileTime FileTime} </td>
 *   </tr>
 *   <tr>
 *     <td> "size" </td>
 *     <td> {@link java.lang.Long Long} </td>
 *   </tr>
 *   <tr>
 *     <td> "isRegularFile" </td>
 *     <td> {@link java.lang.Boolean Boolean} </td>
 *   </tr>
 *   <tr>
 *     <td> "isDirectory" </td>
 *     <td> {@link java.lang.Boolean Boolean} </td>
 *   </tr>
 *   <tr>
 *     <td> "isSymbolicLink" </td>
 *     <td> {@link java.lang.Boolean Boolean} </td>
 *   </tr>
 *   <tr>
 *     <td> "isOther" </td>
 *     <td> {@link java.lang.Boolean Boolean} </td>
 *   </tr>
 *   <tr>
 *     <td> "fileKey" </td>
 *     <td> {@link java.lang.Object Object} </td>
 *   </tr>
 * </table>
 * </blockquote>
 *
 * <p> The {@link java.nio.file.Files#getAttribute getAttribute} method may be
 * used to read any of these attributes as if by invoking the {@link
 * #readAttributes() readAttributes()} method.
 *
 * <p> The {@link java.nio.file.Files#setAttribute setAttribute} method may be
 * used to update the file's last modified time, last access time or create time
 * attributes as if by invoking the {@link #setTimes setTimes} method.
 *
 * @since 1.7
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface BasicFileAttributeView extends java.nio.file.attribute.FileAttributeView {

/**
 * Returns the name of the attribute view. Attribute views of this type
 * have the name {@code "basic"}.
 */

public java.lang.String name();

/**
 * Reads the basic file attributes as a bulk operation.
 *
 * <p> It is implementation specific if all file attributes are read as an
 * atomic operation with respect to other file system operations.
 *
 * @return  the file attributes
 *
 * @throws  java.io.IOException
 *          if an I/O error occurs
 * @throws  java.lang.SecurityException
 *          In the case of the default provider, a security manager is
 *          installed, its {@link java.lang.SecurityManager#checkRead(java.lang.String) checkRead}
 *          method is invoked to check read access to the file
 */

public java.nio.file.attribute.BasicFileAttributes readAttributes() throws java.io.IOException;

/**
 * Updates any or all of the file's last modified time, last access time,
 * and create time attributes.
 *
 * <p> This method updates the file's timestamp attributes. The values are
 * converted to the epoch and precision supported by the file system.
 * Converting from finer to coarser granularities result in precision loss.
 * The behavior of this method when attempting to set a timestamp that is
 * not supported or to a value that is outside the range supported by the
 * underlying file store is not defined. It may or not fail by throwing an
 * {@code IOException}.
 *
 * <p> If any of the {@code lastModifiedTime}, {@code lastAccessTime},
 * or {@code createTime} parameters has the value {@code null} then the
 * corresponding timestamp is not changed. An implementation may require to
 * read the existing values of the file attributes when only some, but not
 * all, of the timestamp attributes are updated. Consequently, this method
 * may not be an atomic operation with respect to other file system
 * operations. Reading and re-writing existing values may also result in
 * precision loss. If all of the {@code lastModifiedTime}, {@code
 * lastAccessTime} and {@code createTime} parameters are {@code null} then
 * this method has no effect.
 *
 * <p> <b>Usage Example:</b>
 * Suppose we want to change a file's last access time.
 * <pre>
 *    Path path = ...
 *    FileTime time = ...
 *    Files.getFileAttributeView(path, BasicFileAttributeView.class).setTimes(null, time, null);
 * </pre>
 *
 * @param   lastModifiedTime
 *          the new last modified time, or {@code null} to not change the
 *          value
 * @param   lastAccessTime
 *          the last access time, or {@code null} to not change the value
 * @param   createTime
 *          the file's create time, or {@code null} to not change the value
 *
 * @throws  java.io.IOException
 *          if an I/O error occurs
 * @throws  java.lang.SecurityException
 *          In the case of the default provider, a security manager is
 *          installed, its  {@link java.lang.SecurityManager#checkWrite(java.lang.String) checkWrite}
 *          method is invoked to check write access to the file
 *
 * @see java.nio.file.Files#setLastModifiedTime
 */

public void setTimes(java.nio.file.attribute.FileTime lastModifiedTime, java.nio.file.attribute.FileTime lastAccessTime, java.nio.file.attribute.FileTime createTime) throws java.io.IOException;
}
