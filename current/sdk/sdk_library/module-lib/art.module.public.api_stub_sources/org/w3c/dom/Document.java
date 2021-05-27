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
public interface Document extends org.w3c.dom.Node {

public org.w3c.dom.DocumentType getDoctype();

public org.w3c.dom.DOMImplementation getImplementation();

public org.w3c.dom.Element getDocumentElement();

public org.w3c.dom.Element createElement(java.lang.String tagName) throws org.w3c.dom.DOMException;

public org.w3c.dom.DocumentFragment createDocumentFragment();

public org.w3c.dom.Text createTextNode(java.lang.String data);

public org.w3c.dom.Comment createComment(java.lang.String data);

public org.w3c.dom.CDATASection createCDATASection(java.lang.String data) throws org.w3c.dom.DOMException;

public org.w3c.dom.ProcessingInstruction createProcessingInstruction(java.lang.String target, java.lang.String data) throws org.w3c.dom.DOMException;

public org.w3c.dom.Attr createAttribute(java.lang.String name) throws org.w3c.dom.DOMException;

public org.w3c.dom.EntityReference createEntityReference(java.lang.String name) throws org.w3c.dom.DOMException;

public org.w3c.dom.NodeList getElementsByTagName(java.lang.String tagname);

public org.w3c.dom.Node importNode(org.w3c.dom.Node importedNode, boolean deep) throws org.w3c.dom.DOMException;

public org.w3c.dom.Element createElementNS(java.lang.String namespaceURI, java.lang.String qualifiedName) throws org.w3c.dom.DOMException;

public org.w3c.dom.Attr createAttributeNS(java.lang.String namespaceURI, java.lang.String qualifiedName) throws org.w3c.dom.DOMException;

public org.w3c.dom.NodeList getElementsByTagNameNS(java.lang.String namespaceURI, java.lang.String localName);

public org.w3c.dom.Element getElementById(java.lang.String elementId);

public java.lang.String getInputEncoding();

public java.lang.String getXmlEncoding();

public boolean getXmlStandalone();

public void setXmlStandalone(boolean xmlStandalone) throws org.w3c.dom.DOMException;

public java.lang.String getXmlVersion();

public void setXmlVersion(java.lang.String xmlVersion) throws org.w3c.dom.DOMException;

public boolean getStrictErrorChecking();

public void setStrictErrorChecking(boolean strictErrorChecking);

public java.lang.String getDocumentURI();

public void setDocumentURI(java.lang.String documentURI);

public org.w3c.dom.Node adoptNode(org.w3c.dom.Node source) throws org.w3c.dom.DOMException;

public org.w3c.dom.DOMConfiguration getDomConfig();

public void normalizeDocument();

public org.w3c.dom.Node renameNode(org.w3c.dom.Node n, java.lang.String namespaceURI, java.lang.String qualifiedName) throws org.w3c.dom.DOMException;
}

