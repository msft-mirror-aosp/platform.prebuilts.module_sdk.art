/*
 * Copyright (c) 2000, 2006, Oracle and/or its affiliates. All rights reserved.
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


package javax.sql;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface RowSet extends java.sql.ResultSet {

public java.lang.String getUrl() throws java.sql.SQLException;

public void setUrl(java.lang.String url) throws java.sql.SQLException;

public java.lang.String getDataSourceName();

public void setDataSourceName(java.lang.String name) throws java.sql.SQLException;

public java.lang.String getUsername();

public void setUsername(java.lang.String name) throws java.sql.SQLException;

public java.lang.String getPassword();

public void setPassword(java.lang.String password) throws java.sql.SQLException;

public int getTransactionIsolation();

public void setTransactionIsolation(int level) throws java.sql.SQLException;

public java.util.Map<java.lang.String,java.lang.Class<?>> getTypeMap() throws java.sql.SQLException;

public void setTypeMap(java.util.Map<java.lang.String,java.lang.Class<?>> map) throws java.sql.SQLException;

public java.lang.String getCommand();

public void setCommand(java.lang.String cmd) throws java.sql.SQLException;

public boolean isReadOnly();

public void setReadOnly(boolean value) throws java.sql.SQLException;

public int getMaxFieldSize() throws java.sql.SQLException;

public void setMaxFieldSize(int max) throws java.sql.SQLException;

public int getMaxRows() throws java.sql.SQLException;

public void setMaxRows(int max) throws java.sql.SQLException;

public boolean getEscapeProcessing() throws java.sql.SQLException;

public void setEscapeProcessing(boolean enable) throws java.sql.SQLException;

public int getQueryTimeout() throws java.sql.SQLException;

public void setQueryTimeout(int seconds) throws java.sql.SQLException;

public void setType(int type) throws java.sql.SQLException;

public void setConcurrency(int concurrency) throws java.sql.SQLException;

public void setNull(int parameterIndex, int sqlType) throws java.sql.SQLException;

public void setNull(java.lang.String parameterName, int sqlType) throws java.sql.SQLException;

public void setNull(int paramIndex, int sqlType, java.lang.String typeName) throws java.sql.SQLException;

public void setNull(java.lang.String parameterName, int sqlType, java.lang.String typeName) throws java.sql.SQLException;

public void setBoolean(int parameterIndex, boolean x) throws java.sql.SQLException;

public void setBoolean(java.lang.String parameterName, boolean x) throws java.sql.SQLException;

public void setByte(int parameterIndex, byte x) throws java.sql.SQLException;

public void setByte(java.lang.String parameterName, byte x) throws java.sql.SQLException;

public void setShort(int parameterIndex, short x) throws java.sql.SQLException;

public void setShort(java.lang.String parameterName, short x) throws java.sql.SQLException;

public void setInt(int parameterIndex, int x) throws java.sql.SQLException;

public void setInt(java.lang.String parameterName, int x) throws java.sql.SQLException;

public void setLong(int parameterIndex, long x) throws java.sql.SQLException;

public void setLong(java.lang.String parameterName, long x) throws java.sql.SQLException;

public void setFloat(int parameterIndex, float x) throws java.sql.SQLException;

public void setFloat(java.lang.String parameterName, float x) throws java.sql.SQLException;

public void setDouble(int parameterIndex, double x) throws java.sql.SQLException;

public void setDouble(java.lang.String parameterName, double x) throws java.sql.SQLException;

public void setBigDecimal(int parameterIndex, java.math.BigDecimal x) throws java.sql.SQLException;

public void setBigDecimal(java.lang.String parameterName, java.math.BigDecimal x) throws java.sql.SQLException;

public void setString(int parameterIndex, java.lang.String x) throws java.sql.SQLException;

public void setString(java.lang.String parameterName, java.lang.String x) throws java.sql.SQLException;

public void setBytes(int parameterIndex, byte[] x) throws java.sql.SQLException;

public void setBytes(java.lang.String parameterName, byte[] x) throws java.sql.SQLException;

public void setDate(int parameterIndex, java.sql.Date x) throws java.sql.SQLException;

public void setTime(int parameterIndex, java.sql.Time x) throws java.sql.SQLException;

public void setTimestamp(int parameterIndex, java.sql.Timestamp x) throws java.sql.SQLException;

public void setTimestamp(java.lang.String parameterName, java.sql.Timestamp x) throws java.sql.SQLException;

public void setAsciiStream(int parameterIndex, java.io.InputStream x, int length) throws java.sql.SQLException;

public void setAsciiStream(java.lang.String parameterName, java.io.InputStream x, int length) throws java.sql.SQLException;

public void setBinaryStream(int parameterIndex, java.io.InputStream x, int length) throws java.sql.SQLException;

public void setBinaryStream(java.lang.String parameterName, java.io.InputStream x, int length) throws java.sql.SQLException;

public void setCharacterStream(int parameterIndex, java.io.Reader reader, int length) throws java.sql.SQLException;

public void setCharacterStream(java.lang.String parameterName, java.io.Reader reader, int length) throws java.sql.SQLException;

public void setAsciiStream(int parameterIndex, java.io.InputStream x) throws java.sql.SQLException;

public void setAsciiStream(java.lang.String parameterName, java.io.InputStream x) throws java.sql.SQLException;

public void setBinaryStream(int parameterIndex, java.io.InputStream x) throws java.sql.SQLException;

public void setBinaryStream(java.lang.String parameterName, java.io.InputStream x) throws java.sql.SQLException;

public void setCharacterStream(int parameterIndex, java.io.Reader reader) throws java.sql.SQLException;

public void setCharacterStream(java.lang.String parameterName, java.io.Reader reader) throws java.sql.SQLException;

public void setNCharacterStream(int parameterIndex, java.io.Reader value) throws java.sql.SQLException;

public void setObject(int parameterIndex, java.lang.Object x, int targetSqlType, int scaleOrLength) throws java.sql.SQLException;

public void setObject(java.lang.String parameterName, java.lang.Object x, int targetSqlType, int scale) throws java.sql.SQLException;

public void setObject(int parameterIndex, java.lang.Object x, int targetSqlType) throws java.sql.SQLException;

public void setObject(java.lang.String parameterName, java.lang.Object x, int targetSqlType) throws java.sql.SQLException;

public void setObject(java.lang.String parameterName, java.lang.Object x) throws java.sql.SQLException;

public void setObject(int parameterIndex, java.lang.Object x) throws java.sql.SQLException;

public void setRef(int i, java.sql.Ref x) throws java.sql.SQLException;

public void setBlob(int i, java.sql.Blob x) throws java.sql.SQLException;

public void setBlob(int parameterIndex, java.io.InputStream inputStream, long length) throws java.sql.SQLException;

public void setBlob(int parameterIndex, java.io.InputStream inputStream) throws java.sql.SQLException;

public void setBlob(java.lang.String parameterName, java.io.InputStream inputStream, long length) throws java.sql.SQLException;

public void setBlob(java.lang.String parameterName, java.sql.Blob x) throws java.sql.SQLException;

public void setBlob(java.lang.String parameterName, java.io.InputStream inputStream) throws java.sql.SQLException;

public void setClob(int i, java.sql.Clob x) throws java.sql.SQLException;

public void setClob(int parameterIndex, java.io.Reader reader, long length) throws java.sql.SQLException;

public void setClob(int parameterIndex, java.io.Reader reader) throws java.sql.SQLException;

public void setClob(java.lang.String parameterName, java.io.Reader reader, long length) throws java.sql.SQLException;

public void setClob(java.lang.String parameterName, java.sql.Clob x) throws java.sql.SQLException;

public void setClob(java.lang.String parameterName, java.io.Reader reader) throws java.sql.SQLException;

public void setArray(int i, java.sql.Array x) throws java.sql.SQLException;

public void setDate(int parameterIndex, java.sql.Date x, java.util.Calendar cal) throws java.sql.SQLException;

public void setDate(java.lang.String parameterName, java.sql.Date x) throws java.sql.SQLException;

public void setDate(java.lang.String parameterName, java.sql.Date x, java.util.Calendar cal) throws java.sql.SQLException;

public void setTime(int parameterIndex, java.sql.Time x, java.util.Calendar cal) throws java.sql.SQLException;

public void setTime(java.lang.String parameterName, java.sql.Time x) throws java.sql.SQLException;

public void setTime(java.lang.String parameterName, java.sql.Time x, java.util.Calendar cal) throws java.sql.SQLException;

public void setTimestamp(int parameterIndex, java.sql.Timestamp x, java.util.Calendar cal) throws java.sql.SQLException;

public void setTimestamp(java.lang.String parameterName, java.sql.Timestamp x, java.util.Calendar cal) throws java.sql.SQLException;

public void clearParameters() throws java.sql.SQLException;

public void execute() throws java.sql.SQLException;

public void addRowSetListener(javax.sql.RowSetListener listener);

public void removeRowSetListener(javax.sql.RowSetListener listener);

public void setSQLXML(int parameterIndex, java.sql.SQLXML xmlObject) throws java.sql.SQLException;

public void setSQLXML(java.lang.String parameterName, java.sql.SQLXML xmlObject) throws java.sql.SQLException;

public void setRowId(int parameterIndex, java.sql.RowId x) throws java.sql.SQLException;

public void setRowId(java.lang.String parameterName, java.sql.RowId x) throws java.sql.SQLException;

public void setNString(int parameterIndex, java.lang.String value) throws java.sql.SQLException;

public void setNString(java.lang.String parameterName, java.lang.String value) throws java.sql.SQLException;

public void setNCharacterStream(int parameterIndex, java.io.Reader value, long length) throws java.sql.SQLException;

public void setNCharacterStream(java.lang.String parameterName, java.io.Reader value, long length) throws java.sql.SQLException;

public void setNCharacterStream(java.lang.String parameterName, java.io.Reader value) throws java.sql.SQLException;

public void setNClob(java.lang.String parameterName, java.sql.NClob value) throws java.sql.SQLException;

public void setNClob(java.lang.String parameterName, java.io.Reader reader, long length) throws java.sql.SQLException;

public void setNClob(java.lang.String parameterName, java.io.Reader reader) throws java.sql.SQLException;

public void setNClob(int parameterIndex, java.io.Reader reader, long length) throws java.sql.SQLException;

public void setNClob(int parameterIndex, java.sql.NClob value) throws java.sql.SQLException;

public void setNClob(int parameterIndex, java.io.Reader reader) throws java.sql.SQLException;

public void setURL(int parameterIndex, java.net.URL x) throws java.sql.SQLException;
}

