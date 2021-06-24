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
public interface Element extends org.w3c.dom.Node {

public java.lang.String getTagName();

public java.lang.String getAttribute(java.lang.String name);

public void setAttribute(java.lang.String name, java.lang.String value) throws org.w3c.dom.DOMException;

public void removeAttribute(java.lang.String name) throws org.w3c.dom.DOMException;

public org.w3c.dom.Attr getAttributeNode(java.lang.String name);

public org.w3c.dom.Attr setAttributeNode(org.w3c.dom.Attr newAttr) throws org.w3c.dom.DOMException;

public org.w3c.dom.Attr removeAttributeNode(org.w3c.dom.Attr oldAttr) throws org.w3c.dom.DOMException;

public org.w3c.dom.NodeList getElementsByTagName(java.lang.String name);

public java.lang.String getAttributeNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;

public void setAttributeNS(java.lang.String namespaceURI, java.lang.String qualifiedName, java.lang.String value) throws org.w3c.dom.DOMException;

public void removeAttributeNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;

public org.w3c.dom.Attr getAttributeNodeNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;

public org.w3c.dom.Attr setAttributeNodeNS(org.w3c.dom.Attr newAttr) throws org.w3c.dom.DOMException;

public org.w3c.dom.NodeList getElementsByTagNameNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;

public boolean hasAttribute(java.lang.String name);

public boolean hasAttributeNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;

public org.w3c.dom.TypeInfo getSchemaTypeInfo();

public void setIdAttribute(java.lang.String name, boolean isId) throws org.w3c.dom.DOMException;

public void setIdAttributeNS(java.lang.String namespaceURI, java.lang.String localName, boolean isId) throws org.w3c.dom.DOMException;

public void setIdAttributeNode(org.w3c.dom.Attr idAttr, boolean isId) throws org.w3c.dom.DOMException;
}

