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
public interface UserDataHandler {

public void handle(short operation, java.lang.String key, java.lang.Object data, org.w3c.dom.Node src, org.w3c.dom.Node dst);

public static final short NODE_ADOPTED = 5; // 0x5

public static final short NODE_CLONED = 1; // 0x1

public static final short NODE_DELETED = 3; // 0x3

public static final short NODE_IMPORTED = 2; // 0x2

public static final short NODE_RENAMED = 4; // 0x4
}

