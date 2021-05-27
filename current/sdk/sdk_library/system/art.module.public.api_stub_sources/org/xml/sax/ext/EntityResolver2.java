// EntityResolver2.java - Extended SAX entity resolver.
// http://www.saxproject.org
// No warranty; no copyright -- use this as you will.
// $Id: EntityResolver2.java,v 1.2 2002/01/12 19:20:08 dbrownell Exp $


package org.xml.sax.ext;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface EntityResolver2 extends org.xml.sax.EntityResolver {

public org.xml.sax.InputSource getExternalSubset(java.lang.String name, java.lang.String baseURI) throws java.io.IOException, org.xml.sax.SAXException;

public org.xml.sax.InputSource resolveEntity(java.lang.String name, java.lang.String publicId, java.lang.String baseURI, java.lang.String systemId) throws java.io.IOException, org.xml.sax.SAXException;
}

