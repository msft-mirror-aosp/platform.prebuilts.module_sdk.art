// SAX default handler base class.
// http://www.saxproject.org
// No warranty; no copyright -- use this as you will.
// $Id: HandlerBase.java,v 1.7 2004/04/26 17:34:34 dmegginson Exp $


package org.xml.sax;

@SuppressWarnings({"unchecked", "deprecation", "all"})
@Deprecated
public class HandlerBase implements org.xml.sax.EntityResolver, org.xml.sax.DTDHandler, org.xml.sax.DocumentHandler, org.xml.sax.ErrorHandler {

@Deprecated
public HandlerBase() { throw new RuntimeException("Stub!"); }

@Deprecated
public org.xml.sax.InputSource resolveEntity(java.lang.String publicId, java.lang.String systemId) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }

@Deprecated
public void notationDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId) { throw new RuntimeException("Stub!"); }

@Deprecated
public void unparsedEntityDecl(java.lang.String name, java.lang.String publicId, java.lang.String systemId, java.lang.String notationName) { throw new RuntimeException("Stub!"); }

@Deprecated
public void setDocumentLocator(org.xml.sax.Locator locator) { throw new RuntimeException("Stub!"); }

@Deprecated
public void startDocument() throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }

@Deprecated
public void endDocument() throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }

@Deprecated
public void startElement(java.lang.String name, org.xml.sax.AttributeList attributes) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }

@Deprecated
public void endElement(java.lang.String name) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }

@Deprecated
public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }

@Deprecated
public void ignorableWhitespace(char[] ch, int start, int length) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }

@Deprecated
public void processingInstruction(java.lang.String target, java.lang.String data) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }

@Deprecated
public void warning(org.xml.sax.SAXParseException e) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }

@Deprecated
public void error(org.xml.sax.SAXParseException e) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }

@Deprecated
public void fatalError(org.xml.sax.SAXParseException e) throws org.xml.sax.SAXException { throw new RuntimeException("Stub!"); }
}

