// DeclHandler.java - Optional handler for DTD declaration events.
// http://www.saxproject.org
// Public Domain: no warranty.
// $Id: DeclHandler.java,v 1.6 2004/04/22 13:28:49 dmegginson Exp $


package org.xml.sax.ext;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface DeclHandler {

public void elementDecl(java.lang.String name, java.lang.String model) throws org.xml.sax.SAXException;

public void attributeDecl(java.lang.String eName, java.lang.String aName, java.lang.String type, java.lang.String mode, java.lang.String value) throws org.xml.sax.SAXException;

public void internalEntityDecl(java.lang.String name, java.lang.String value) throws org.xml.sax.SAXException;

public void externalEntityDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId) throws org.xml.sax.SAXException;
}

