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
public class DOMException extends java.lang.RuntimeException {

public DOMException(short code, java.lang.String message) { throw new RuntimeException("Stub!"); }

public static final short DOMSTRING_SIZE_ERR = 2; // 0x2

public static final short HIERARCHY_REQUEST_ERR = 3; // 0x3

public static final short INDEX_SIZE_ERR = 1; // 0x1

public static final short INUSE_ATTRIBUTE_ERR = 10; // 0xa

public static final short INVALID_ACCESS_ERR = 15; // 0xf

public static final short INVALID_CHARACTER_ERR = 5; // 0x5

public static final short INVALID_MODIFICATION_ERR = 13; // 0xd

public static final short INVALID_STATE_ERR = 11; // 0xb

public static final short NAMESPACE_ERR = 14; // 0xe

public static final short NOT_FOUND_ERR = 8; // 0x8

public static final short NOT_SUPPORTED_ERR = 9; // 0x9

public static final short NO_DATA_ALLOWED_ERR = 6; // 0x6

public static final short NO_MODIFICATION_ALLOWED_ERR = 7; // 0x7

public static final short SYNTAX_ERR = 12; // 0xc

public static final short TYPE_MISMATCH_ERR = 17; // 0x11

public static final short VALIDATION_ERR = 16; // 0x10

public static final short WRONG_DOCUMENT_ERR = 4; // 0x4

public short code;
}

