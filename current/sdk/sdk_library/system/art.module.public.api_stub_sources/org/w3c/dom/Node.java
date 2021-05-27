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
public interface Node {

public java.lang.String getNodeName();

public java.lang.String getNodeValue() throws org.w3c.dom.DOMException;

public void setNodeValue(java.lang.String nodeValue) throws org.w3c.dom.DOMException;

public short getNodeType();

public org.w3c.dom.Node getParentNode();

public org.w3c.dom.NodeList getChildNodes();

public org.w3c.dom.Node getFirstChild();

public org.w3c.dom.Node getLastChild();

public org.w3c.dom.Node getPreviousSibling();

public org.w3c.dom.Node getNextSibling();

public org.w3c.dom.NamedNodeMap getAttributes();

public org.w3c.dom.Document getOwnerDocument();

public org.w3c.dom.Node insertBefore(org.w3c.dom.Node newChild, org.w3c.dom.Node refChild) throws org.w3c.dom.DOMException;

public org.w3c.dom.Node replaceChild(org.w3c.dom.Node newChild, org.w3c.dom.Node oldChild) throws org.w3c.dom.DOMException;

public org.w3c.dom.Node removeChild(org.w3c.dom.Node oldChild) throws org.w3c.dom.DOMException;

public org.w3c.dom.Node appendChild(org.w3c.dom.Node newChild) throws org.w3c.dom.DOMException;

public boolean hasChildNodes();

public org.w3c.dom.Node cloneNode(boolean deep);

public void normalize();

public boolean isSupported(java.lang.String feature, java.lang.String version);

public java.lang.String getNamespaceURI();

public java.lang.String getPrefix();

public void setPrefix(java.lang.String prefix) throws org.w3c.dom.DOMException;

public java.lang.String getLocalName();

public boolean hasAttributes();

public java.lang.String getBaseURI();

public short compareDocumentPosition(org.w3c.dom.Node other) throws org.w3c.dom.DOMException;

public java.lang.String getTextContent() throws org.w3c.dom.DOMException;

public void setTextContent(java.lang.String textContent) throws org.w3c.dom.DOMException;

public boolean isSameNode(org.w3c.dom.Node other);

public java.lang.String lookupPrefix(java.lang.String namespaceURI);

public boolean isDefaultNamespace(java.lang.String namespaceURI);

public java.lang.String lookupNamespaceURI(java.lang.String prefix);

public boolean isEqualNode(org.w3c.dom.Node arg);

public java.lang.Object getFeature(java.lang.String feature, java.lang.String version);

public java.lang.Object setUserData(java.lang.String key, java.lang.Object data, org.w3c.dom.UserDataHandler handler);

public java.lang.Object getUserData(java.lang.String key);

public static final short ATTRIBUTE_NODE = 2; // 0x2

public static final short CDATA_SECTION_NODE = 4; // 0x4

public static final short COMMENT_NODE = 8; // 0x8

public static final short DOCUMENT_FRAGMENT_NODE = 11; // 0xb

public static final short DOCUMENT_NODE = 9; // 0x9

public static final short DOCUMENT_POSITION_CONTAINED_BY = 16; // 0x10

public static final short DOCUMENT_POSITION_CONTAINS = 8; // 0x8

public static final short DOCUMENT_POSITION_DISCONNECTED = 1; // 0x1

public static final short DOCUMENT_POSITION_FOLLOWING = 4; // 0x4

public static final short DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = 32; // 0x20

public static final short DOCUMENT_POSITION_PRECEDING = 2; // 0x2

public static final short DOCUMENT_TYPE_NODE = 10; // 0xa

public static final short ELEMENT_NODE = 1; // 0x1

public static final short ENTITY_NODE = 6; // 0x6

public static final short ENTITY_REFERENCE_NODE = 5; // 0x5

public static final short NOTATION_NODE = 12; // 0xc

public static final short PROCESSING_INSTRUCTION_NODE = 7; // 0x7

public static final short TEXT_NODE = 3; // 0x3
}

