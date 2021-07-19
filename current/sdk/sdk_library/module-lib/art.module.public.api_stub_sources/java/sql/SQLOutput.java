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
public interface SQLOutput {

public void writeString(java.lang.String x) throws java.sql.SQLException;

public void writeBoolean(boolean x) throws java.sql.SQLException;

public void writeByte(byte x) throws java.sql.SQLException;

public void writeShort(short x) throws java.sql.SQLException;

public void writeInt(int x) throws java.sql.SQLException;

public void writeLong(long x) throws java.sql.SQLException;

public void writeFloat(float x) throws java.sql.SQLException;

public void writeDouble(double x) throws java.sql.SQLException;

public void writeBigDecimal(java.math.BigDecimal x) throws java.sql.SQLException;

public void writeBytes(byte[] x) throws java.sql.SQLException;

public void writeDate(java.sql.Date x) throws java.sql.SQLException;

public void writeTime(java.sql.Time x) throws java.sql.SQLException;

public void writeTimestamp(java.sql.Timestamp x) throws java.sql.SQLException;

public void writeCharacterStream(java.io.Reader x) throws java.sql.SQLException;

public void writeAsciiStream(java.io.InputStream x) throws java.sql.SQLException;

public void writeBinaryStream(java.io.InputStream x) throws java.sql.SQLException;

public void writeObject(java.sql.SQLData x) throws java.sql.SQLException;

public void writeRef(java.sql.Ref x) throws java.sql.SQLException;

public void writeBlob(java.sql.Blob x) throws java.sql.SQLException;

public void writeClob(java.sql.Clob x) throws java.sql.SQLException;

public void writeStruct(java.sql.Struct x) throws java.sql.SQLException;

public void writeArray(java.sql.Array x) throws java.sql.SQLException;

public void writeURL(java.net.URL x) throws java.sql.SQLException;

public void writeNString(java.lang.String x) throws java.sql.SQLException;

public void writeNClob(java.sql.NClob x) throws java.sql.SQLException;

public void writeRowId(java.sql.RowId x) throws java.sql.SQLException;

public void writeSQLXML(java.sql.SQLXML x) throws java.sql.SQLException;
}

