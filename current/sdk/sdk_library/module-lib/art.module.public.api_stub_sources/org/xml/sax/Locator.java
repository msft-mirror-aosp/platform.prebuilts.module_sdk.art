// SAX locator interface for document events.
// http://www.saxproject.org
// No warranty; no copyright -- use this as you will.
// $Id: Locator.java,v 1.8 2002/01/30 21:13:47 dbrownell Exp $


package org.xml.sax;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface Locator {

public java.lang.String getPublicId();

public java.lang.String getSystemId();

public int getLineNumber();

public int getColumnNumber();
}

