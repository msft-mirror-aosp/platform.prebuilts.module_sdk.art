/*
 * Copyright (C) 2014 The Android Open Source Project
 * Copyright (c) 1996, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */


package sun.security.pkcs;

import java.io.*;
import java.util.*;
import java.security.*;
import sun.security.util.*;

/**
 * PKCS7 as defined in RSA Laboratories PKCS7 Technical Note. Profile
 * Supports only <tt>SignedData</tt> ContentInfo
 * type, where to the type of data signed is plain Data.
 * For signedData, <tt>crls</tt>, <tt>attributes</tt> and
 * PKCS#6 Extended Certificates are not supported.
 *
 * @author Benjamin Renaud
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class PKCS7 {

/**
 * Unmarshals a PKCS7 block from its encoded form, parsing the
 * encoded bytes from the InputStream.
 *
 * @param in an input stream holding at least one PKCS7 block.
 * @throws sun.security.pkcs.ParsingException on parsing errors.
 * @throws java.io.IOException on other errors.
 */

public PKCS7(java.io.InputStream in) throws java.io.IOException, sun.security.pkcs.ParsingException { throw new RuntimeException("Stub!"); }

/**
 * Unmarshals a PKCS7 block from its encoded form, parsing the
 * encoded bytes.
 *
 * @param bytes the encoded bytes.
 * @exception sun.security.pkcs.ParsingException on parsing errors.
 */

public PKCS7(byte[] bytes) throws sun.security.pkcs.ParsingException { throw new RuntimeException("Stub!"); }

/**
 * This verifies a given SignerInfo.
 *
 * @param info the signer information.
 * @param dataInputStream the DER encoded content information.
 *
 * @exception java.security.NoSuchAlgorithmException on unrecognized algorithms.
 * @exception java.security.SignatureException on signature handling errors.
 */

public sun.security.pkcs.SignerInfo verify(sun.security.pkcs.SignerInfo info, java.io.InputStream dataInputStream) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.SignatureException { throw new RuntimeException("Stub!"); }

/**
 * Returns all signerInfos which self-verify.
 *
 * @param bytes the DER encoded content information.
 *
 * @exception java.security.NoSuchAlgorithmException on unrecognized algorithms.
 * @exception java.security.SignatureException on signature handling errors.
 */

public sun.security.pkcs.SignerInfo[] verify(byte[] bytes) throws java.security.NoSuchAlgorithmException, java.security.SignatureException { throw new RuntimeException("Stub!"); }

/**
 * Returns the X.509 certificates listed in this PKCS7 block.
 * @return a clone of the array of X.509 certificates or null if
 *         none are specified for the content type.
 */

public java.security.cert.X509Certificate[] getCertificates() { throw new RuntimeException("Stub!"); }

/**
 * Returns the signer's information specified in this PKCS7 block.
 * @return the array of Signer Infos or null if none are specified
 *         for the content type.
 */

public sun.security.pkcs.SignerInfo[] getSignerInfos() { throw new RuntimeException("Stub!"); }

/**
 * Returns the PKCS7 block in a printable string form.
 */

public java.lang.String toString() { throw new RuntimeException("Stub!"); }
}

