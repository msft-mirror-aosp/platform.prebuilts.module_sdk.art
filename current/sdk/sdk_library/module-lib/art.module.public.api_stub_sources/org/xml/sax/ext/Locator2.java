// Locator2.java - extended Locator
// http://www.saxproject.org
// Public Domain: no warranty.
// $Id: Locator2.java,v 1.5 2004/03/17 14:30:10 dmegginson Exp $


package org.xml.sax.ext;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface Locator2 extends org.xml.sax.Locator {

public java.lang.String getXMLVersion();

public java.lang.String getEncoding();
}

