// SAX parser interface.
// http://www.saxproject.org
// No warranty; no copyright -- use this as you will.
// $Id: Parser.java,v 1.6 2002/01/30 21:13:47 dbrownell Exp $


package org.xml.sax;

@SuppressWarnings({"unchecked", "deprecation", "all"})
@Deprecated
public interface Parser {

@Deprecated
public void setLocale(java.util.Locale locale) throws org.xml.sax.SAXException;

@Deprecated
public void setEntityResolver(org.xml.sax.EntityResolver resolver);

@Deprecated
public void setDTDHandler(org.xml.sax.DTDHandler handler);

@Deprecated
public void setDocumentHandler(org.xml.sax.DocumentHandler handler);

@Deprecated
public void setErrorHandler(org.xml.sax.ErrorHandler handler);

@Deprecated
public void parse(org.xml.sax.InputSource source) throws java.io.IOException, org.xml.sax.SAXException;

@Deprecated
public void parse(java.lang.String systemId) throws java.io.IOException, org.xml.sax.SAXException;
}

