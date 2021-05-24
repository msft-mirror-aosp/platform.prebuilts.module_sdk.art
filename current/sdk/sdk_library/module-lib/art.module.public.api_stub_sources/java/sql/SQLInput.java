/*
 * Copyright (c) 1998, 2006, Oracle and/or its affiliates. All rights reserved.
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


package java.sql;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface SQLInput {

public java.lang.String readString() throws java.sql.SQLException;

public boolean readBoolean() throws java.sql.SQLException;

public byte readByte() throws java.sql.SQLException;

public short readShort() throws java.sql.SQLException;

public int readInt() throws java.sql.SQLException;

public long readLong() throws java.sql.SQLException;

public float readFloat() throws java.sql.SQLException;

public double readDouble() throws java.sql.SQLException;

public java.math.BigDecimal readBigDecimal() throws java.sql.SQLException;

public byte[] readBytes() throws java.sql.SQLException;

public java.sql.Date readDate() throws java.sql.SQLException;

public java.sql.Time readTime() throws java.sql.SQLException;

public java.sql.Timestamp readTimestamp() throws java.sql.SQLException;

public java.io.Reader readCharacterStream() throws java.sql.SQLException;

public java.io.InputStream readAsciiStream() throws java.sql.SQLException;

public java.io.InputStream readBinaryStream() throws java.sql.SQLException;

public java.lang.Object readObject() throws java.sql.SQLException;

public java.sql.Ref readRef() throws java.sql.SQLException;

public java.sql.Blob readBlob() throws java.sql.SQLException;

public java.sql.Clob readClob() throws java.sql.SQLException;

public java.sql.Array readArray() throws java.sql.SQLException;

public boolean wasNull() throws java.sql.SQLException;

public java.net.URL readURL() throws java.sql.SQLException;

public java.sql.NClob readNClob() throws java.sql.SQLException;

public java.lang.String readNString() throws java.sql.SQLException;

public java.sql.SQLXML readSQLXML() throws java.sql.SQLException;

public java.sql.RowId readRowId() throws java.sql.SQLException;
}

