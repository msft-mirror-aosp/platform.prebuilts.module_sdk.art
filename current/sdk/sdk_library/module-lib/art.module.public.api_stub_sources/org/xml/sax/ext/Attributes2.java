// Attributes2.java - extended Attributes
// http://www.saxproject.org
// Public Domain: no warranty.
// $Id: Attributes2.java,v 1.6 2004/03/08 13:01:00 dmegginson Exp $


package org.xml.sax.ext;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface Attributes2 extends org.xml.sax.Attributes {

public boolean isDeclared(int index);

public boolean isDeclared(java.lang.String qName);

public boolean isDeclared(java.lang.String uri, java.lang.String localName);

public boolean isSpecified(int index);

public boolean isSpecified(java.lang.String uri, java.lang.String localName);

public boolean isSpecified(java.lang.String qName);
}

