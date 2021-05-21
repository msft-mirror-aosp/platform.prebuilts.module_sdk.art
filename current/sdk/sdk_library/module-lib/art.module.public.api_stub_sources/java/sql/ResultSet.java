/*
 * Copyright (C) 2014 The Android Open Source Project
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


package java.sql;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface ResultSet extends java.sql.Wrapper,  java.lang.AutoCloseable {

public boolean next() throws java.sql.SQLException;

public void close() throws java.sql.SQLException;

public boolean wasNull() throws java.sql.SQLException;

public java.lang.String getString(int columnIndex) throws java.sql.SQLException;

public boolean getBoolean(int columnIndex) throws java.sql.SQLException;

public byte getByte(int columnIndex) throws java.sql.SQLException;

public short getShort(int columnIndex) throws java.sql.SQLException;

public int getInt(int columnIndex) throws java.sql.SQLException;

public long getLong(int columnIndex) throws java.sql.SQLException;

public float getFloat(int columnIndex) throws java.sql.SQLException;

public double getDouble(int columnIndex) throws java.sql.SQLException;

@Deprecated
public java.math.BigDecimal getBigDecimal(int columnIndex, int scale) throws java.sql.SQLException;

public byte[] getBytes(int columnIndex) throws java.sql.SQLException;

public java.sql.Date getDate(int columnIndex) throws java.sql.SQLException;

public java.sql.Time getTime(int columnIndex) throws java.sql.SQLException;

public java.sql.Timestamp getTimestamp(int columnIndex) throws java.sql.SQLException;

public java.io.InputStream getAsciiStream(int columnIndex) throws java.sql.SQLException;

@Deprecated
public java.io.InputStream getUnicodeStream(int columnIndex) throws java.sql.SQLException;

public java.io.InputStream getBinaryStream(int columnIndex) throws java.sql.SQLException;

public java.lang.String getString(java.lang.String columnLabel) throws java.sql.SQLException;

public boolean getBoolean(java.lang.String columnLabel) throws java.sql.SQLException;

public byte getByte(java.lang.String columnLabel) throws java.sql.SQLException;

public short getShort(java.lang.String columnLabel) throws java.sql.SQLException;

public int getInt(java.lang.String columnLabel) throws java.sql.SQLException;

public long getLong(java.lang.String columnLabel) throws java.sql.SQLException;

public float getFloat(java.lang.String columnLabel) throws java.sql.SQLException;

public double getDouble(java.lang.String columnLabel) throws java.sql.SQLException;

@Deprecated
public java.math.BigDecimal getBigDecimal(java.lang.String columnLabel, int scale) throws java.sql.SQLException;

public byte[] getBytes(java.lang.String columnLabel) throws java.sql.SQLException;

public java.sql.Date getDate(java.lang.String columnLabel) throws java.sql.SQLException;

public java.sql.Time getTime(java.lang.String columnLabel) throws java.sql.SQLException;

public java.sql.Timestamp getTimestamp(java.lang.String columnLabel) throws java.sql.SQLException;

public java.io.InputStream getAsciiStream(java.lang.String columnLabel) throws java.sql.SQLException;

@Deprecated
public java.io.InputStream getUnicodeStream(java.lang.String columnLabel) throws java.sql.SQLException;

public java.io.InputStream getBinaryStream(java.lang.String columnLabel) throws java.sql.SQLException;

public java.sql.SQLWarning getWarnings() throws java.sql.SQLException;

public void clearWarnings() throws java.sql.SQLException;

public java.lang.String getCursorName() throws java.sql.SQLException;

public java.sql.ResultSetMetaData getMetaData() throws java.sql.SQLException;

public java.lang.Object getObject(int columnIndex) throws java.sql.SQLException;

public java.lang.Object getObject(java.lang.String columnLabel) throws java.sql.SQLException;

public int findColumn(java.lang.String columnLabel) throws java.sql.SQLException;

public java.io.Reader getCharacterStream(int columnIndex) throws java.sql.SQLException;

public java.io.Reader getCharacterStream(java.lang.String columnLabel) throws java.sql.SQLException;

public java.math.BigDecimal getBigDecimal(int columnIndex) throws java.sql.SQLException;

public java.math.BigDecimal getBigDecimal(java.lang.String columnLabel) throws java.sql.SQLException;

public boolean isBeforeFirst() throws java.sql.SQLException;

public boolean isAfterLast() throws java.sql.SQLException;

public boolean isFirst() throws java.sql.SQLException;

public boolean isLast() throws java.sql.SQLException;

public void beforeFirst() throws java.sql.SQLException;

public void afterLast() throws java.sql.SQLException;

public boolean first() throws java.sql.SQLException;

public boolean last() throws java.sql.SQLException;

public int getRow() throws java.sql.SQLException;

public boolean absolute(int row) throws java.sql.SQLException;

public boolean relative(int rows) throws java.sql.SQLException;

public boolean previous() throws java.sql.SQLException;

public void setFetchDirection(int direction) throws java.sql.SQLException;

public int getFetchDirection() throws java.sql.SQLException;

public void setFetchSize(int rows) throws java.sql.SQLException;

public int getFetchSize() throws java.sql.SQLException;

public int getType() throws java.sql.SQLException;

public int getConcurrency() throws java.sql.SQLException;

public boolean rowUpdated() throws java.sql.SQLException;

public boolean rowInserted() throws java.sql.SQLException;

public boolean rowDeleted() throws java.sql.SQLException;

public void updateNull(int columnIndex) throws java.sql.SQLException;

public void updateBoolean(int columnIndex, boolean x) throws java.sql.SQLException;

public void updateByte(int columnIndex, byte x) throws java.sql.SQLException;

public void updateShort(int columnIndex, short x) throws java.sql.SQLException;

public void updateInt(int columnIndex, int x) throws java.sql.SQLException;

public void updateLong(int columnIndex, long x) throws java.sql.SQLException;

public void updateFloat(int columnIndex, float x) throws java.sql.SQLException;

public void updateDouble(int columnIndex, double x) throws java.sql.SQLException;

public void updateBigDecimal(int columnIndex, java.math.BigDecimal x) throws java.sql.SQLException;

public void updateString(int columnIndex, java.lang.String x) throws java.sql.SQLException;

public void updateBytes(int columnIndex, byte[] x) throws java.sql.SQLException;

public void updateDate(int columnIndex, java.sql.Date x) throws java.sql.SQLException;

public void updateTime(int columnIndex, java.sql.Time x) throws java.sql.SQLException;

public void updateTimestamp(int columnIndex, java.sql.Timestamp x) throws java.sql.SQLException;

public void updateAsciiStream(int columnIndex, java.io.InputStream x, int length) throws java.sql.SQLException;

public void updateBinaryStream(int columnIndex, java.io.InputStream x, int length) throws java.sql.SQLException;

public void updateCharacterStream(int columnIndex, java.io.Reader x, int length) throws java.sql.SQLException;

public void updateObject(int columnIndex, java.lang.Object x, int scaleOrLength) throws java.sql.SQLException;

public void updateObject(int columnIndex, java.lang.Object x) throws java.sql.SQLException;

public void updateNull(java.lang.String columnLabel) throws java.sql.SQLException;

public void updateBoolean(java.lang.String columnLabel, boolean x) throws java.sql.SQLException;

public void updateByte(java.lang.String columnLabel, byte x) throws java.sql.SQLException;

public void updateShort(java.lang.String columnLabel, short x) throws java.sql.SQLException;

public void updateInt(java.lang.String columnLabel, int x) throws java.sql.SQLException;

public void updateLong(java.lang.String columnLabel, long x) throws java.sql.SQLException;

public void updateFloat(java.lang.String columnLabel, float x) throws java.sql.SQLException;

public void updateDouble(java.lang.String columnLabel, double x) throws java.sql.SQLException;

public void updateBigDecimal(java.lang.String columnLabel, java.math.BigDecimal x) throws java.sql.SQLException;

public void updateString(java.lang.String columnLabel, java.lang.String x) throws java.sql.SQLException;

public void updateBytes(java.lang.String columnLabel, byte[] x) throws java.sql.SQLException;

public void updateDate(java.lang.String columnLabel, java.sql.Date x) throws java.sql.SQLException;

public void updateTime(java.lang.String columnLabel, java.sql.Time x) throws java.sql.SQLException;

public void updateTimestamp(java.lang.String columnLabel, java.sql.Timestamp x) throws java.sql.SQLException;

public void updateAsciiStream(java.lang.String columnLabel, java.io.InputStream x, int length) throws java.sql.SQLException;

public void updateBinaryStream(java.lang.String columnLabel, java.io.InputStream x, int length) throws java.sql.SQLException;

public void updateCharacterStream(java.lang.String columnLabel, java.io.Reader reader, int length) throws java.sql.SQLException;

public void updateObject(java.lang.String columnLabel, java.lang.Object x, int scaleOrLength) throws java.sql.SQLException;

public void updateObject(java.lang.String columnLabel, java.lang.Object x) throws java.sql.SQLException;

public void insertRow() throws java.sql.SQLException;

public void updateRow() throws java.sql.SQLException;

public void deleteRow() throws java.sql.SQLException;

public void refreshRow() throws java.sql.SQLException;

public void cancelRowUpdates() throws java.sql.SQLException;

public void moveToInsertRow() throws java.sql.SQLException;

public void moveToCurrentRow() throws java.sql.SQLException;

public java.sql.Statement getStatement() throws java.sql.SQLException;

public java.lang.Object getObject(int columnIndex, java.util.Map<java.lang.String,java.lang.Class<?>> map) throws java.sql.SQLException;

public java.sql.Ref getRef(int columnIndex) throws java.sql.SQLException;

public java.sql.Blob getBlob(int columnIndex) throws java.sql.SQLException;

public java.sql.Clob getClob(int columnIndex) throws java.sql.SQLException;

public java.sql.Array getArray(int columnIndex) throws java.sql.SQLException;

public java.lang.Object getObject(java.lang.String columnLabel, java.util.Map<java.lang.String,java.lang.Class<?>> map) throws java.sql.SQLException;

public java.sql.Ref getRef(java.lang.String columnLabel) throws java.sql.SQLException;

public java.sql.Blob getBlob(java.lang.String columnLabel) throws java.sql.SQLException;

public java.sql.Clob getClob(java.lang.String columnLabel) throws java.sql.SQLException;

public java.sql.Array getArray(java.lang.String columnLabel) throws java.sql.SQLException;

public java.sql.Date getDate(int columnIndex, java.util.Calendar cal) throws java.sql.SQLException;

public java.sql.Date getDate(java.lang.String columnLabel, java.util.Calendar cal) throws java.sql.SQLException;

public java.sql.Time getTime(int columnIndex, java.util.Calendar cal) throws java.sql.SQLException;

public java.sql.Time getTime(java.lang.String columnLabel, java.util.Calendar cal) throws java.sql.SQLException;

public java.sql.Timestamp getTimestamp(int columnIndex, java.util.Calendar cal) throws java.sql.SQLException;

public java.sql.Timestamp getTimestamp(java.lang.String columnLabel, java.util.Calendar cal) throws java.sql.SQLException;

public java.net.URL getURL(int columnIndex) throws java.sql.SQLException;

public java.net.URL getURL(java.lang.String columnLabel) throws java.sql.SQLException;

public void updateRef(int columnIndex, java.sql.Ref x) throws java.sql.SQLException;

public void updateRef(java.lang.String columnLabel, java.sql.Ref x) throws java.sql.SQLException;

public void updateBlob(int columnIndex, java.sql.Blob x) throws java.sql.SQLException;

public void updateBlob(java.lang.String columnLabel, java.sql.Blob x) throws java.sql.SQLException;

public void updateClob(int columnIndex, java.sql.Clob x) throws java.sql.SQLException;

public void updateClob(java.lang.String columnLabel, java.sql.Clob x) throws java.sql.SQLException;

public void updateArray(int columnIndex, java.sql.Array x) throws java.sql.SQLException;

public void updateArray(java.lang.String columnLabel, java.sql.Array x) throws java.sql.SQLException;

public java.sql.RowId getRowId(int columnIndex) throws java.sql.SQLException;

public java.sql.RowId getRowId(java.lang.String columnLabel) throws java.sql.SQLException;

public void updateRowId(int columnIndex, java.sql.RowId x) throws java.sql.SQLException;

public void updateRowId(java.lang.String columnLabel, java.sql.RowId x) throws java.sql.SQLException;

public int getHoldability() throws java.sql.SQLException;

public boolean isClosed() throws java.sql.SQLException;

public void updateNString(int columnIndex, java.lang.String nString) throws java.sql.SQLException;

public void updateNString(java.lang.String columnLabel, java.lang.String nString) throws java.sql.SQLException;

public void updateNClob(int columnIndex, java.sql.NClob nClob) throws java.sql.SQLException;

public void updateNClob(java.lang.String columnLabel, java.sql.NClob nClob) throws java.sql.SQLException;

public java.sql.NClob getNClob(int columnIndex) throws java.sql.SQLException;

public java.sql.NClob getNClob(java.lang.String columnLabel) throws java.sql.SQLException;

public java.sql.SQLXML getSQLXML(int columnIndex) throws java.sql.SQLException;

public java.sql.SQLXML getSQLXML(java.lang.String columnLabel) throws java.sql.SQLException;

public void updateSQLXML(int columnIndex, java.sql.SQLXML xmlObject) throws java.sql.SQLException;

public void updateSQLXML(java.lang.String columnLabel, java.sql.SQLXML xmlObject) throws java.sql.SQLException;

public java.lang.String getNString(int columnIndex) throws java.sql.SQLException;

public java.lang.String getNString(java.lang.String columnLabel) throws java.sql.SQLException;

public java.io.Reader getNCharacterStream(int columnIndex) throws java.sql.SQLException;

public java.io.Reader getNCharacterStream(java.lang.String columnLabel) throws java.sql.SQLException;

public void updateNCharacterStream(int columnIndex, java.io.Reader x, long length) throws java.sql.SQLException;

public void updateNCharacterStream(java.lang.String columnLabel, java.io.Reader reader, long length) throws java.sql.SQLException;

public void updateAsciiStream(int columnIndex, java.io.InputStream x, long length) throws java.sql.SQLException;

public void updateBinaryStream(int columnIndex, java.io.InputStream x, long length) throws java.sql.SQLException;

public void updateCharacterStream(int columnIndex, java.io.Reader x, long length) throws java.sql.SQLException;

public void updateAsciiStream(java.lang.String columnLabel, java.io.InputStream x, long length) throws java.sql.SQLException;

public void updateBinaryStream(java.lang.String columnLabel, java.io.InputStream x, long length) throws java.sql.SQLException;

public void updateCharacterStream(java.lang.String columnLabel, java.io.Reader reader, long length) throws java.sql.SQLException;

public void updateBlob(int columnIndex, java.io.InputStream inputStream, long length) throws java.sql.SQLException;

public void updateBlob(java.lang.String columnLabel, java.io.InputStream inputStream, long length) throws java.sql.SQLException;

public void updateClob(int columnIndex, java.io.Reader reader, long length) throws java.sql.SQLException;

public void updateClob(java.lang.String columnLabel, java.io.Reader reader, long length) throws java.sql.SQLException;

public void updateNClob(int columnIndex, java.io.Reader reader, long length) throws java.sql.SQLException;

public void updateNClob(java.lang.String columnLabel, java.io.Reader reader, long length) throws java.sql.SQLException;

public void updateNCharacterStream(int columnIndex, java.io.Reader x) throws java.sql.SQLException;

public void updateNCharacterStream(java.lang.String columnLabel, java.io.Reader reader) throws java.sql.SQLException;

public void updateAsciiStream(int columnIndex, java.io.InputStream x) throws java.sql.SQLException;

public void updateBinaryStream(int columnIndex, java.io.InputStream x) throws java.sql.SQLException;

public void updateCharacterStream(int columnIndex, java.io.Reader x) throws java.sql.SQLException;

public void updateAsciiStream(java.lang.String columnLabel, java.io.InputStream x) throws java.sql.SQLException;

public void updateBinaryStream(java.lang.String columnLabel, java.io.InputStream x) throws java.sql.SQLException;

public void updateCharacterStream(java.lang.String columnLabel, java.io.Reader reader) throws java.sql.SQLException;

public void updateBlob(int columnIndex, java.io.InputStream inputStream) throws java.sql.SQLException;

public void updateBlob(java.lang.String columnLabel, java.io.InputStream inputStream) throws java.sql.SQLException;

public void updateClob(int columnIndex, java.io.Reader reader) throws java.sql.SQLException;

public void updateClob(java.lang.String columnLabel, java.io.Reader reader) throws java.sql.SQLException;

public void updateNClob(int columnIndex, java.io.Reader reader) throws java.sql.SQLException;

public void updateNClob(java.lang.String columnLabel, java.io.Reader reader) throws java.sql.SQLException;

public static final int CLOSE_CURSORS_AT_COMMIT = 2; // 0x2

public static final int CONCUR_READ_ONLY = 1007; // 0x3ef

public static final int CONCUR_UPDATABLE = 1008; // 0x3f0

public static final int FETCH_FORWARD = 1000; // 0x3e8

public static final int FETCH_REVERSE = 1001; // 0x3e9

public static final int FETCH_UNKNOWN = 1002; // 0x3ea

public static final int HOLD_CURSORS_OVER_COMMIT = 1; // 0x1

public static final int TYPE_FORWARD_ONLY = 1003; // 0x3eb

public static final int TYPE_SCROLL_INSENSITIVE = 1004; // 0x3ec

public static final int TYPE_SCROLL_SENSITIVE = 1005; // 0x3ed
}

