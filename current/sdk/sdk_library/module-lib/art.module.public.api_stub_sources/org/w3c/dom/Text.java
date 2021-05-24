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
public interface Text extends org.w3c.dom.CharacterData {

public org.w3c.dom.Text splitText(int offset) throws org.w3c.dom.DOMException;

public boolean isElementContentWhitespace();

public java.lang.String getWholeText();

public org.w3c.dom.Text replaceWholeText(java.lang.String content) throws org.w3c.dom.DOMException;
}

