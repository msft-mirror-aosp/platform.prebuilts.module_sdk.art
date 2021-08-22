
package org.xmlpull.v1;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface XmlSerializer {

public void setFeature(java.lang.String name, boolean state) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public boolean getFeature(java.lang.String name);

public void setProperty(java.lang.String name, java.lang.Object value) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public java.lang.Object getProperty(java.lang.String name);

public void setOutput(java.io.OutputStream os, java.lang.String encoding) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public void setOutput(java.io.Writer writer) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public void startDocument(java.lang.String encoding, java.lang.Boolean standalone) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public void endDocument() throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public void setPrefix(java.lang.String prefix, java.lang.String namespace) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public java.lang.String getPrefix(java.lang.String namespace, boolean generatePrefix) throws java.lang.IllegalArgumentException;

public int getDepth();

public java.lang.String getNamespace();

public java.lang.String getName();

public org.xmlpull.v1.XmlSerializer startTag(java.lang.String namespace, java.lang.String name) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public org.xmlpull.v1.XmlSerializer attribute(java.lang.String namespace, java.lang.String name, java.lang.String value) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public org.xmlpull.v1.XmlSerializer endTag(java.lang.String namespace, java.lang.String name) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public org.xmlpull.v1.XmlSerializer text(java.lang.String text) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public org.xmlpull.v1.XmlSerializer text(char[] buf, int start, int len) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public void cdsect(java.lang.String text) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public void entityRef(java.lang.String text) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public void processingInstruction(java.lang.String text) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public void comment(java.lang.String text) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public void docdecl(java.lang.String text) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public void ignorableWhitespace(java.lang.String text) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalStateException;

public void flush() throws java.io.IOException;
}

