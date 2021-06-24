/*
 * Copyright (C) 2014 The Android Open Source Project
 * Copyright (c) 1996, 2010, Oracle and/or its affiliates. All rights reserved.
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
public interface DatabaseMetaData extends java.sql.Wrapper {

public boolean allProceduresAreCallable() throws java.sql.SQLException;

public boolean allTablesAreSelectable() throws java.sql.SQLException;

public java.lang.String getURL() throws java.sql.SQLException;

public java.lang.String getUserName() throws java.sql.SQLException;

public boolean isReadOnly() throws java.sql.SQLException;

public boolean nullsAreSortedHigh() throws java.sql.SQLException;

public boolean nullsAreSortedLow() throws java.sql.SQLException;

public boolean nullsAreSortedAtStart() throws java.sql.SQLException;

public boolean nullsAreSortedAtEnd() throws java.sql.SQLException;

public java.lang.String getDatabaseProductName() throws java.sql.SQLException;

public java.lang.String getDatabaseProductVersion() throws java.sql.SQLException;

public java.lang.String getDriverName() throws java.sql.SQLException;

public java.lang.String getDriverVersion() throws java.sql.SQLException;

public int getDriverMajorVersion();

public int getDriverMinorVersion();

public boolean usesLocalFiles() throws java.sql.SQLException;

public boolean usesLocalFilePerTable() throws java.sql.SQLException;

public boolean supportsMixedCaseIdentifiers() throws java.sql.SQLException;

public boolean storesUpperCaseIdentifiers() throws java.sql.SQLException;

public boolean storesLowerCaseIdentifiers() throws java.sql.SQLException;

public boolean storesMixedCaseIdentifiers() throws java.sql.SQLException;

public boolean supportsMixedCaseQuotedIdentifiers() throws java.sql.SQLException;

public boolean storesUpperCaseQuotedIdentifiers() throws java.sql.SQLException;

public boolean storesLowerCaseQuotedIdentifiers() throws java.sql.SQLException;

public boolean storesMixedCaseQuotedIdentifiers() throws java.sql.SQLException;

public java.lang.String getIdentifierQuoteString() throws java.sql.SQLException;

public java.lang.String getSQLKeywords() throws java.sql.SQLException;

public java.lang.String getNumericFunctions() throws java.sql.SQLException;

public java.lang.String getStringFunctions() throws java.sql.SQLException;

public java.lang.String getSystemFunctions() throws java.sql.SQLException;

public java.lang.String getTimeDateFunctions() throws java.sql.SQLException;

public java.lang.String getSearchStringEscape() throws java.sql.SQLException;

public java.lang.String getExtraNameCharacters() throws java.sql.SQLException;

public boolean supportsAlterTableWithAddColumn() throws java.sql.SQLException;

public boolean supportsAlterTableWithDropColumn() throws java.sql.SQLException;

public boolean supportsColumnAliasing() throws java.sql.SQLException;

public boolean nullPlusNonNullIsNull() throws java.sql.SQLException;

public boolean supportsConvert() throws java.sql.SQLException;

public boolean supportsConvert(int fromType, int toType) throws java.sql.SQLException;

public boolean supportsTableCorrelationNames() throws java.sql.SQLException;

public boolean supportsDifferentTableCorrelationNames() throws java.sql.SQLException;

public boolean supportsExpressionsInOrderBy() throws java.sql.SQLException;

public boolean supportsOrderByUnrelated() throws java.sql.SQLException;

public boolean supportsGroupBy() throws java.sql.SQLException;

public boolean supportsGroupByUnrelated() throws java.sql.SQLException;

public boolean supportsGroupByBeyondSelect() throws java.sql.SQLException;

public boolean supportsLikeEscapeClause() throws java.sql.SQLException;

public boolean supportsMultipleResultSets() throws java.sql.SQLException;

public boolean supportsMultipleTransactions() throws java.sql.SQLException;

public boolean supportsNonNullableColumns() throws java.sql.SQLException;

public boolean supportsMinimumSQLGrammar() throws java.sql.SQLException;

public boolean supportsCoreSQLGrammar() throws java.sql.SQLException;

public boolean supportsExtendedSQLGrammar() throws java.sql.SQLException;

public boolean supportsANSI92EntryLevelSQL() throws java.sql.SQLException;

public boolean supportsANSI92IntermediateSQL() throws java.sql.SQLException;

public boolean supportsANSI92FullSQL() throws java.sql.SQLException;

public boolean supportsIntegrityEnhancementFacility() throws java.sql.SQLException;

public boolean supportsOuterJoins() throws java.sql.SQLException;

public boolean supportsFullOuterJoins() throws java.sql.SQLException;

public boolean supportsLimitedOuterJoins() throws java.sql.SQLException;

public java.lang.String getSchemaTerm() throws java.sql.SQLException;

public java.lang.String getProcedureTerm() throws java.sql.SQLException;

public java.lang.String getCatalogTerm() throws java.sql.SQLException;

public boolean isCatalogAtStart() throws java.sql.SQLException;

public java.lang.String getCatalogSeparator() throws java.sql.SQLException;

public boolean supportsSchemasInDataManipulation() throws java.sql.SQLException;

public boolean supportsSchemasInProcedureCalls() throws java.sql.SQLException;

public boolean supportsSchemasInTableDefinitions() throws java.sql.SQLException;

public boolean supportsSchemasInIndexDefinitions() throws java.sql.SQLException;

public boolean supportsSchemasInPrivilegeDefinitions() throws java.sql.SQLException;

public boolean supportsCatalogsInDataManipulation() throws java.sql.SQLException;

public boolean supportsCatalogsInProcedureCalls() throws java.sql.SQLException;

public boolean supportsCatalogsInTableDefinitions() throws java.sql.SQLException;

public boolean supportsCatalogsInIndexDefinitions() throws java.sql.SQLException;

public boolean supportsCatalogsInPrivilegeDefinitions() throws java.sql.SQLException;

public boolean supportsPositionedDelete() throws java.sql.SQLException;

public boolean supportsPositionedUpdate() throws java.sql.SQLException;

public boolean supportsSelectForUpdate() throws java.sql.SQLException;

public boolean supportsStoredProcedures() throws java.sql.SQLException;

public boolean supportsSubqueriesInComparisons() throws java.sql.SQLException;

public boolean supportsSubqueriesInExists() throws java.sql.SQLException;

public boolean supportsSubqueriesInIns() throws java.sql.SQLException;

public boolean supportsSubqueriesInQuantifieds() throws java.sql.SQLException;

public boolean supportsCorrelatedSubqueries() throws java.sql.SQLException;

public boolean supportsUnion() throws java.sql.SQLException;

public boolean supportsUnionAll() throws java.sql.SQLException;

public boolean supportsOpenCursorsAcrossCommit() throws java.sql.SQLException;

public boolean supportsOpenCursorsAcrossRollback() throws java.sql.SQLException;

public boolean supportsOpenStatementsAcrossCommit() throws java.sql.SQLException;

public boolean supportsOpenStatementsAcrossRollback() throws java.sql.SQLException;

public int getMaxBinaryLiteralLength() throws java.sql.SQLException;

public int getMaxCharLiteralLength() throws java.sql.SQLException;

public int getMaxColumnNameLength() throws java.sql.SQLException;

public int getMaxColumnsInGroupBy() throws java.sql.SQLException;

public int getMaxColumnsInIndex() throws java.sql.SQLException;

public int getMaxColumnsInOrderBy() throws java.sql.SQLException;

public int getMaxColumnsInSelect() throws java.sql.SQLException;

public int getMaxColumnsInTable() throws java.sql.SQLException;

public int getMaxConnections() throws java.sql.SQLException;

public int getMaxCursorNameLength() throws java.sql.SQLException;

public int getMaxIndexLength() throws java.sql.SQLException;

public int getMaxSchemaNameLength() throws java.sql.SQLException;

public int getMaxProcedureNameLength() throws java.sql.SQLException;

public int getMaxCatalogNameLength() throws java.sql.SQLException;

public int getMaxRowSize() throws java.sql.SQLException;

public boolean doesMaxRowSizeIncludeBlobs() throws java.sql.SQLException;

public int getMaxStatementLength() throws java.sql.SQLException;

public int getMaxStatements() throws java.sql.SQLException;

public int getMaxTableNameLength() throws java.sql.SQLException;

public int getMaxTablesInSelect() throws java.sql.SQLException;

public int getMaxUserNameLength() throws java.sql.SQLException;

public int getDefaultTransactionIsolation() throws java.sql.SQLException;

public boolean supportsTransactions() throws java.sql.SQLException;

public boolean supportsTransactionIsolationLevel(int level) throws java.sql.SQLException;

public boolean supportsDataDefinitionAndDataManipulationTransactions() throws java.sql.SQLException;

public boolean supportsDataManipulationTransactionsOnly() throws java.sql.SQLException;

public boolean dataDefinitionCausesTransactionCommit() throws java.sql.SQLException;

public boolean dataDefinitionIgnoredInTransactions() throws java.sql.SQLException;

public java.sql.ResultSet getProcedures(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String procedureNamePattern) throws java.sql.SQLException;

public java.sql.ResultSet getProcedureColumns(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String procedureNamePattern, java.lang.String columnNamePattern) throws java.sql.SQLException;

public java.sql.ResultSet getTables(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String tableNamePattern, java.lang.String[] types) throws java.sql.SQLException;

public java.sql.ResultSet getSchemas() throws java.sql.SQLException;

public java.sql.ResultSet getCatalogs() throws java.sql.SQLException;

public java.sql.ResultSet getTableTypes() throws java.sql.SQLException;

public java.sql.ResultSet getColumns(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String tableNamePattern, java.lang.String columnNamePattern) throws java.sql.SQLException;

public java.sql.ResultSet getColumnPrivileges(java.lang.String catalog, java.lang.String schema, java.lang.String table, java.lang.String columnNamePattern) throws java.sql.SQLException;

public java.sql.ResultSet getTablePrivileges(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String tableNamePattern) throws java.sql.SQLException;

public java.sql.ResultSet getBestRowIdentifier(java.lang.String catalog, java.lang.String schema, java.lang.String table, int scope, boolean nullable) throws java.sql.SQLException;

public java.sql.ResultSet getVersionColumns(java.lang.String catalog, java.lang.String schema, java.lang.String table) throws java.sql.SQLException;

public java.sql.ResultSet getPrimaryKeys(java.lang.String catalog, java.lang.String schema, java.lang.String table) throws java.sql.SQLException;

public java.sql.ResultSet getImportedKeys(java.lang.String catalog, java.lang.String schema, java.lang.String table) throws java.sql.SQLException;

public java.sql.ResultSet getExportedKeys(java.lang.String catalog, java.lang.String schema, java.lang.String table) throws java.sql.SQLException;

public java.sql.ResultSet getCrossReference(java.lang.String parentCatalog, java.lang.String parentSchema, java.lang.String parentTable, java.lang.String foreignCatalog, java.lang.String foreignSchema, java.lang.String foreignTable) throws java.sql.SQLException;

public java.sql.ResultSet getTypeInfo() throws java.sql.SQLException;

public java.sql.ResultSet getIndexInfo(java.lang.String catalog, java.lang.String schema, java.lang.String table, boolean unique, boolean approximate) throws java.sql.SQLException;

public boolean supportsResultSetType(int type) throws java.sql.SQLException;

public boolean supportsResultSetConcurrency(int type, int concurrency) throws java.sql.SQLException;

public boolean ownUpdatesAreVisible(int type) throws java.sql.SQLException;

public boolean ownDeletesAreVisible(int type) throws java.sql.SQLException;

public boolean ownInsertsAreVisible(int type) throws java.sql.SQLException;

public boolean othersUpdatesAreVisible(int type) throws java.sql.SQLException;

public boolean othersDeletesAreVisible(int type) throws java.sql.SQLException;

public boolean othersInsertsAreVisible(int type) throws java.sql.SQLException;

public boolean updatesAreDetected(int type) throws java.sql.SQLException;

public boolean deletesAreDetected(int type) throws java.sql.SQLException;

public boolean insertsAreDetected(int type) throws java.sql.SQLException;

public boolean supportsBatchUpdates() throws java.sql.SQLException;

public java.sql.ResultSet getUDTs(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String typeNamePattern, int[] types) throws java.sql.SQLException;

public java.sql.Connection getConnection() throws java.sql.SQLException;

public boolean supportsSavepoints() throws java.sql.SQLException;

public boolean supportsNamedParameters() throws java.sql.SQLException;

public boolean supportsMultipleOpenResults() throws java.sql.SQLException;

public boolean supportsGetGeneratedKeys() throws java.sql.SQLException;

public java.sql.ResultSet getSuperTypes(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String typeNamePattern) throws java.sql.SQLException;

public java.sql.ResultSet getSuperTables(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String tableNamePattern) throws java.sql.SQLException;

public java.sql.ResultSet getAttributes(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String typeNamePattern, java.lang.String attributeNamePattern) throws java.sql.SQLException;

public boolean supportsResultSetHoldability(int holdability) throws java.sql.SQLException;

public int getResultSetHoldability() throws java.sql.SQLException;

public int getDatabaseMajorVersion() throws java.sql.SQLException;

public int getDatabaseMinorVersion() throws java.sql.SQLException;

public int getJDBCMajorVersion() throws java.sql.SQLException;

public int getJDBCMinorVersion() throws java.sql.SQLException;

public int getSQLStateType() throws java.sql.SQLException;

public boolean locatorsUpdateCopy() throws java.sql.SQLException;

public boolean supportsStatementPooling() throws java.sql.SQLException;

public java.sql.RowIdLifetime getRowIdLifetime() throws java.sql.SQLException;

public java.sql.ResultSet getSchemas(java.lang.String catalog, java.lang.String schemaPattern) throws java.sql.SQLException;

public boolean supportsStoredFunctionsUsingCallSyntax() throws java.sql.SQLException;

public boolean autoCommitFailureClosesAllResultSets() throws java.sql.SQLException;

public java.sql.ResultSet getClientInfoProperties() throws java.sql.SQLException;

public java.sql.ResultSet getFunctions(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String functionNamePattern) throws java.sql.SQLException;

public java.sql.ResultSet getFunctionColumns(java.lang.String catalog, java.lang.String schemaPattern, java.lang.String functionNamePattern, java.lang.String columnNamePattern) throws java.sql.SQLException;

public static final short attributeNoNulls = 0; // 0x0

public static final short attributeNullable = 1; // 0x1

public static final short attributeNullableUnknown = 2; // 0x2

public static final int bestRowNotPseudo = 1; // 0x1

public static final int bestRowPseudo = 2; // 0x2

public static final int bestRowSession = 2; // 0x2

public static final int bestRowTemporary = 0; // 0x0

public static final int bestRowTransaction = 1; // 0x1

public static final int bestRowUnknown = 0; // 0x0

public static final int columnNoNulls = 0; // 0x0

public static final int columnNullable = 1; // 0x1

public static final int columnNullableUnknown = 2; // 0x2

public static final int functionColumnIn = 1; // 0x1

public static final int functionColumnInOut = 2; // 0x2

public static final int functionColumnOut = 3; // 0x3

public static final int functionColumnResult = 5; // 0x5

public static final int functionColumnUnknown = 0; // 0x0

public static final int functionNoNulls = 0; // 0x0

public static final int functionNoTable = 1; // 0x1

public static final int functionNullable = 1; // 0x1

public static final int functionNullableUnknown = 2; // 0x2

public static final int functionResultUnknown = 0; // 0x0

public static final int functionReturn = 4; // 0x4

public static final int functionReturnsTable = 2; // 0x2

public static final int importedKeyCascade = 0; // 0x0

public static final int importedKeyInitiallyDeferred = 5; // 0x5

public static final int importedKeyInitiallyImmediate = 6; // 0x6

public static final int importedKeyNoAction = 3; // 0x3

public static final int importedKeyNotDeferrable = 7; // 0x7

public static final int importedKeyRestrict = 1; // 0x1

public static final int importedKeySetDefault = 4; // 0x4

public static final int importedKeySetNull = 2; // 0x2

public static final int procedureColumnIn = 1; // 0x1

public static final int procedureColumnInOut = 2; // 0x2

public static final int procedureColumnOut = 4; // 0x4

public static final int procedureColumnResult = 3; // 0x3

public static final int procedureColumnReturn = 5; // 0x5

public static final int procedureColumnUnknown = 0; // 0x0

public static final int procedureNoNulls = 0; // 0x0

public static final int procedureNoResult = 1; // 0x1

public static final int procedureNullable = 1; // 0x1

public static final int procedureNullableUnknown = 2; // 0x2

public static final int procedureResultUnknown = 0; // 0x0

public static final int procedureReturnsResult = 2; // 0x2

public static final int sqlStateSQL = 2; // 0x2

public static final int sqlStateSQL99 = 2; // 0x2

public static final int sqlStateXOpen = 1; // 0x1

public static final short tableIndexClustered = 1; // 0x1

public static final short tableIndexHashed = 2; // 0x2

public static final short tableIndexOther = 3; // 0x3

public static final short tableIndexStatistic = 0; // 0x0

public static final int typeNoNulls = 0; // 0x0

public static final int typeNullable = 1; // 0x1

public static final int typeNullableUnknown = 2; // 0x2

public static final int typePredBasic = 2; // 0x2

public static final int typePredChar = 1; // 0x1

public static final int typePredNone = 0; // 0x0

public static final int typeSearchable = 3; // 0x3

public static final int versionColumnNotPseudo = 1; // 0x1

public static final int versionColumnPseudo = 2; // 0x2

public static final int versionColumnUnknown = 0; // 0x0
}

