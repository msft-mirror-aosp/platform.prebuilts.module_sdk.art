// XMLFilter.java - filter SAX2 events.
// http://www.saxproject.org
// Written by David Megginson
// NO WARRANTY!  This class is in the Public Domain.
// $Id: XMLFilter.java,v 1.6 2002/01/30 21:13:48 dbrownell Exp $


package org.xml.sax;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface XMLFilter extends org.xml.sax.XMLReader {

public void setParent(org.xml.sax.XMLReader parent);

public org.xml.sax.XMLReader getParent();
}

