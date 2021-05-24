// SAX DTD handler.
// http://www.saxproject.org
// No warranty; no copyright -- use this as you will.
// $Id: DTDHandler.java,v 1.8 2002/01/30 21:13:43 dbrownell Exp $


package org.xml.sax;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface DTDHandler {

public void notationDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId) throws org.xml.sax.SAXException;

public void unparsedEntityDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId, java.lang.String notationName) throws org.xml.sax.SAXException;
}

