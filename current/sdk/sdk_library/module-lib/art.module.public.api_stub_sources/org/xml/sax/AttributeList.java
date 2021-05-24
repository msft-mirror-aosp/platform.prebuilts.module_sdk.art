// SAX Attribute List Interface.
// http://www.saxproject.org
// No warranty; no copyright -- use this as you will.
// $Id: AttributeList.java,v 1.7 2004/04/26 17:34:34 dmegginson Exp $


package org.xml.sax;

@SuppressWarnings({"unchecked", "deprecation", "all"})
@Deprecated
public interface AttributeList {

@Deprecated
public int getLength();

@Deprecated
public java.lang.String getName(int i);

@Deprecated
public java.lang.String getType(int i);

@Deprecated
public java.lang.String getValue(int i);

@Deprecated
public java.lang.String getType(java.lang.String name);

@Deprecated
public java.lang.String getValue(java.lang.String name);
}

