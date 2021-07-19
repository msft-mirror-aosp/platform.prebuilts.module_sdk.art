/* -*-             c-basic-offset: 4; indent-tabs-mode: nil; -*-  //------100-columns-wide------>|*/
// for license please see accompanying LICENSE.txt file (available also at http://www.xmlpull.org/)


package org.xmlpull.v1;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface XmlPullParser {

public void setFeature(java.lang.String name, boolean state) throws org.xmlpull.v1.XmlPullParserException;

public boolean getFeature(java.lang.String name);

public void setProperty(java.lang.String name, java.lang.Object value) throws org.xmlpull.v1.XmlPullParserException;

public java.lang.Object getProperty(java.lang.String name);

public void setInput(java.io.Reader in) throws org.xmlpull.v1.XmlPullParserException;

public void setInput(java.io.InputStream inputStream, java.lang.String inputEncoding) throws org.xmlpull.v1.XmlPullParserException;

public java.lang.String getInputEncoding();

public void defineEntityReplacementText(java.lang.String entityName, java.lang.String replacementText) throws org.xmlpull.v1.XmlPullParserException;

public int getNamespaceCount(int depth) throws org.xmlpull.v1.XmlPullParserException;

public java.lang.String getNamespacePrefix(int pos) throws org.xmlpull.v1.XmlPullParserException;

public java.lang.String getNamespaceUri(int pos) throws org.xmlpull.v1.XmlPullParserException;

public java.lang.String getNamespace(java.lang.String prefix);

public int getDepth();

public java.lang.String getPositionDescription();

public int getLineNumber();

public int getColumnNumber();

public boolean isWhitespace() throws org.xmlpull.v1.XmlPullParserException;

public java.lang.String getText();

public char[] getTextCharacters(int[] holderForStartAndLength);

public java.lang.String getNamespace();

public java.lang.String getName();

public java.lang.String getPrefix();

public boolean isEmptyElementTag() throws org.xmlpull.v1.XmlPullParserException;

public int getAttributeCount();

public java.lang.String getAttributeNamespace(int index);

public java.lang.String getAttributeName(int index);

public java.lang.String getAttributePrefix(int index);

public java.lang.String getAttributeType(int index);

public boolean isAttributeDefault(int index);

public java.lang.String getAttributeValue(int index);

public java.lang.String getAttributeValue(java.lang.String namespace, java.lang.String name);

public int getEventType() throws org.xmlpull.v1.XmlPullParserException;

public int next() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException;

public int nextToken() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException;

public void require(int type, java.lang.String namespace, java.lang.String name) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException;

public java.lang.String nextText() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException;

public int nextTag() throws java.io.IOException, org.xmlpull.v1.XmlPullParserException;

public static final int CDSECT = 5; // 0x5

public static final int COMMENT = 9; // 0x9

public static final int DOCDECL = 10; // 0xa

public static final int END_DOCUMENT = 1; // 0x1

public static final int END_TAG = 3; // 0x3

public static final int ENTITY_REF = 6; // 0x6

public static final java.lang.String FEATURE_PROCESS_DOCDECL = "http://xmlpull.org/v1/doc/features.html#process-docdecl";

public static final java.lang.String FEATURE_PROCESS_NAMESPACES = "http://xmlpull.org/v1/doc/features.html#process-namespaces";

public static final java.lang.String FEATURE_REPORT_NAMESPACE_ATTRIBUTES = "http://xmlpull.org/v1/doc/features.html#report-namespace-prefixes";

public static final java.lang.String FEATURE_VALIDATION = "http://xmlpull.org/v1/doc/features.html#validation";

public static final int IGNORABLE_WHITESPACE = 7; // 0x7

public static final java.lang.String NO_NAMESPACE = "";

public static final int PROCESSING_INSTRUCTION = 8; // 0x8

public static final int START_DOCUMENT = 0; // 0x0

public static final int START_TAG = 2; // 0x2

public static final int TEXT = 4; // 0x4

public static final java.lang.String[] TYPES = null;
}

