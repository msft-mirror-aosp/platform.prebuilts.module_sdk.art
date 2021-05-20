/*
 * Copyright (c) 2004 World Wide Web Consortium,
 *
 * (Massachusetts Institute of Technology, European Research Consortium for
 * Informatics and Mathematics, Keio University). All Rights Reserved. This
 * work is distributed under the W3C(r) Software License [1] in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
 */


package org.w3c.dom.ls;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface LSInput {

public java.io.Reader getCharacterStream();

public void setCharacterStream(java.io.Reader characterStream);

public java.io.InputStream getByteStream();

public void setByteStream(java.io.InputStream byteStream);

public java.lang.String getStringData();

public void setStringData(java.lang.String stringData);

public java.lang.String getSystemId();

public void setSystemId(java.lang.String systemId);

public java.lang.String getPublicId();

public void setPublicId(java.lang.String publicId);

public java.lang.String getBaseURI();

public void setBaseURI(java.lang.String baseURI);

public java.lang.String getEncoding();

public void setEncoding(java.lang.String encoding);

public boolean getCertifiedText();

public void setCertifiedText(boolean certifiedText);
}

