/*
 * Copyright (c) 1996, 2005, Oracle and/or its affiliates. All rights reserved.
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
public interface ResultSetMetaData extends java.sql.Wrapper {

public int getColumnCount() throws java.sql.SQLException;

public boolean isAutoIncrement(int column) throws java.sql.SQLException;

public boolean isCaseSensitive(int column) throws java.sql.SQLException;

public boolean isSearchable(int column) throws java.sql.SQLException;

public boolean isCurrency(int column) throws java.sql.SQLException;

public int isNullable(int column) throws java.sql.SQLException;

public boolean isSigned(int column) throws java.sql.SQLException;

public int getColumnDisplaySize(int column) throws java.sql.SQLException;

public java.lang.String getColumnLabel(int column) throws java.sql.SQLException;

public java.lang.String getColumnName(int column) throws java.sql.SQLException;

public java.lang.String getSchemaName(int column) throws java.sql.SQLException;

public int getPrecision(int column) throws java.sql.SQLException;

public int getScale(int column) throws java.sql.SQLException;

public java.lang.String getTableName(int column) throws java.sql.SQLException;

public java.lang.String getCatalogName(int column) throws java.sql.SQLException;

public int getColumnType(int column) throws java.sql.SQLException;

public java.lang.String getColumnTypeName(int column) throws java.sql.SQLException;

public boolean isReadOnly(int column) throws java.sql.SQLException;

public boolean isWritable(int column) throws java.sql.SQLException;

public boolean isDefinitelyWritable(int column) throws java.sql.SQLException;

public java.lang.String getColumnClassName(int column) throws java.sql.SQLException;

public static final int columnNoNulls = 0; // 0x0

public static final int columnNullable = 1; // 0x1

public static final int columnNullableUnknown = 2; // 0x2
}
