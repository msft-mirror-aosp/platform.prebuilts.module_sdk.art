// Attributes.java - attribute list with Namespace support
// http://www.saxproject.org
// Written by David Megginson
// NO WARRANTY!  This class is in the public domain.
// $Id: Attributes.java,v 1.13 2004/03/18 12:28:05 dmegginson Exp $


package org.xml.sax;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface Attributes {

public int getLength();

public java.lang.String getURI(int index);

public java.lang.String getLocalName(int index);

public java.lang.String getQName(int index);

public java.lang.String getType(int index);

public java.lang.String getValue(int index);

public int getIndex(java.lang.String uri, java.lang.String localName);

public int getIndex(java.lang.String qName);

public java.lang.String getType(java.lang.String uri, java.lang.String localName);

public java.lang.String getType(java.lang.String qName);

public java.lang.String getValue(java.lang.String uri, java.lang.String localName);

public java.lang.String getValue(java.lang.String qName);
}

