// SAX document handler.
// http://www.saxproject.org
// No warranty; no copyright -- use this as you will.
// $Id: DocumentHandler.java,v 1.6 2002/01/30 21:13:43 dbrownell Exp $


package org.xml.sax;

@SuppressWarnings({"unchecked", "deprecation", "all"})
@Deprecated
public interface DocumentHandler {

@Deprecated
public void setDocumentLocator(org.xml.sax.Locator locator);

@Deprecated
public void startDocument() throws org.xml.sax.SAXException;

@Deprecated
public void endDocument() throws org.xml.sax.SAXException;

@Deprecated
public void startElement(java.lang.String name, org.xml.sax.AttributeList atts) throws org.xml.sax.SAXException;

@Deprecated
public void endElement(java.lang.String name) throws org.xml.sax.SAXException;

@Deprecated
public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException;

@Deprecated
public void ignorableWhitespace(char[] ch, int start, int length) throws org.xml.sax.SAXException;

@Deprecated
public void processingInstruction(java.lang.String target, java.lang.String data) throws org.xml.sax.SAXException;
}

