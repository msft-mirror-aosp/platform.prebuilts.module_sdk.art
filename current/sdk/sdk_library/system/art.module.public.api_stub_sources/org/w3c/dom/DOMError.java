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
public interface DOMError {

public short getSeverity();

public java.lang.String getMessage();

public java.lang.String getType();

public java.lang.Object getRelatedException();

public java.lang.Object getRelatedData();

public org.w3c.dom.DOMLocator getLocation();

public static final short SEVERITY_ERROR = 2; // 0x2

public static final short SEVERITY_FATAL_ERROR = 3; // 0x3

public static final short SEVERITY_WARNING = 1; // 0x1
}

