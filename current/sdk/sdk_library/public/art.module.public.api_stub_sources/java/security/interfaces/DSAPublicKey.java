/*
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


package java.security.interfaces;


/**
 * The interface to a DSA public key. DSA (Digital Signature Algorithm)
 * is defined in NIST's FIPS-186.
 *
 * @see java.security.Key
 * @see java.security.Signature
 * @see java.security.interfaces.DSAKey
 * @see java.security.interfaces.DSAPrivateKey
 *
 * @author Benjamin Renaud
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface DSAPublicKey extends java.security.interfaces.DSAKey,  java.security.PublicKey {

/**
 * Returns the value of the public key, {@code y}.
 *
 * @return the value of the public key, {@code y}.
 */

public java.math.BigInteger getY();

/**
 * The class fingerprint that is set to indicate
 * serialization compatibility with a previous
 * version of the class.
 */

public static final long serialVersionUID = 1234526332779022332L; // 0x1121eb28ab28c7fcL
}
