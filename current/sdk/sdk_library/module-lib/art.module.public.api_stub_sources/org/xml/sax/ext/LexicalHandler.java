// LexicalHandler.java - optional handler for lexical parse events.
// http://www.saxproject.org
// Public Domain: no warranty.
// $Id: LexicalHandler.java,v 1.5 2002/01/30 21:00:44 dbrownell Exp $


package org.xml.sax.ext;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface LexicalHandler {

public void startDTD(java.lang.String name, java.lang.String publicId, java.lang.String systemId) throws org.xml.sax.SAXException;

public void endDTD() throws org.xml.sax.SAXException;

public void startEntity(java.lang.String name) throws org.xml.sax.SAXException;

public void endEntity(java.lang.String name) throws org.xml.sax.SAXException;

public void startCDATA() throws org.xml.sax.SAXException;

public void endCDATA() throws org.xml.sax.SAXException;

public void comment(char[] ch, int start, int length) throws org.xml.sax.SAXException;
}

