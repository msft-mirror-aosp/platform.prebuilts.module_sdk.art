/*
 * Copyright (c) 2004 World Wide Web Consortium,
 *
 * (Massachusetts Institute of Technology, European Research Consortium for
 * Informatics and Mathematics, Keio University). All Rights Reserved. This
 * work is distributed under the W3C(r) Software License [1] in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
 */


package org.w3c.dom;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface TypeInfo {

public java.lang.String getTypeName();

public java.lang.String getTypeNamespace();

public boolean isDerivedFrom(java.lang.String typeNamespaceArg, java.lang.String typeNameArg, int derivationMethod);

public static final int DERIVATION_EXTENSION = 2; // 0x2

public static final int DERIVATION_LIST = 8; // 0x8

public static final int DERIVATION_RESTRICTION = 1; // 0x1

public static final int DERIVATION_UNION = 4; // 0x4
}
