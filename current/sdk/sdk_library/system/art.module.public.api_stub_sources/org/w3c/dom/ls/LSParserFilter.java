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


package org.w3c.dom.ls;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface LSParserFilter {

public short startElement(org.w3c.dom.Element elementArg);

public short acceptNode(org.w3c.dom.Node nodeArg);

public int getWhatToShow();

public static final short FILTER_ACCEPT = 1; // 0x1

public static final short FILTER_INTERRUPT = 4; // 0x4

public static final short FILTER_REJECT = 2; // 0x2

public static final short FILTER_SKIP = 3; // 0x3
}

