// XMLReader.java - read an XML document.
// http://www.saxproject.org
// Written by David Megginson
// NO WARRANTY!  This class is in the Public Domain.
// $Id: XMLReader.java,v 1.9 2004/04/26 17:34:34 dmegginson Exp $


package org.xml.sax;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface XMLReader {

public boolean getFeature(java.lang.String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;

public void setFeature(java.lang.String name, boolean value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;

public java.lang.Object getProperty(java.lang.String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;

public void setProperty(java.lang.String name, java.lang.Object value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;

public void setEntityResolver(org.xml.sax.EntityResolver resolver);

public org.xml.sax.EntityResolver getEntityResolver();

public void setDTDHandler(org.xml.sax.DTDHandler handler);

public org.xml.sax.DTDHandler getDTDHandler();

public void setContentHandler(org.xml.sax.ContentHandler handler);

public org.xml.sax.ContentHandler getContentHandler();

public void setErrorHandler(org.xml.sax.ErrorHandler handler);

public org.xml.sax.ErrorHandler getErrorHandler();

public void parse(org.xml.sax.InputSource input) throws java.io.IOException, org.xml.sax.SAXException;

public void parse(java.lang.String systemId) throws java.io.IOException, org.xml.sax.SAXException;
}

