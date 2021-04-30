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


package sun.security.x509;

import java.io.*;
import java.util.*;
import java.security.*;
import sun.security.util.*;

/**
 * This class identifies algorithms, such as cryptographic transforms, each
 * of which may be associated with parameters.  Instances of this base class
 * are used when this runtime environment has no special knowledge of the
 * algorithm type, and may also be used in other cases.  Equivalence is
 * defined according to OID and (where relevant) parameters.
 *
 * <P>Subclasses may be used, for example when when the algorithm ID has
 * associated parameters which some code (e.g. code using public keys) needs
 * to have parsed.  Two examples of such algorithms are Diffie-Hellman key
 * exchange, and the Digital Signature Standard Algorithm (DSS/DSA).
 *
 * <P>The OID constants defined in this class correspond to some widely
 * used algorithms, for which conventional string names have been defined.
 * This class is not a general repository for OIDs, or for such string names.
 * Note that the mappings between algorithm IDs and algorithm names is
 * not one-to-one.
 *
 *
 * @author David Brownell
 * @author Amit Kapoor
 * @author Hemma Prafullchandra
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class AlgorithmId implements java.io.Serializable {

/**
 * Constructs a parameterless algorithm ID.
 *
 * @param oid the identifier for the algorithm
 */

public AlgorithmId(sun.security.util.ObjectIdentifier oid) { throw new RuntimeException("Stub!"); }

/**
 * Returns a name for the algorithm which may be more intelligible
 * to humans than the algorithm's OID, but which won't necessarily
 * be comprehensible on other systems.  For example, this might
 * return a name such as "MD5withRSA" for a signature algorithm on
 * some systems.  It also returns names like "OID.1.2.3.4", when
 * no particular name for the algorithm is known.
 *
 * @return name of the algorithm
 */

public java.lang.String getName() { throw new RuntimeException("Stub!"); }

/**
 * Compares this AlgorithmID to another.  If algorithm parameters are
 * available, they are compared.  Otherwise, just the object IDs
 * for the algorithm are compared.
 *
 * @param other preferably an AlgorithmId, else an ObjectIdentifier
 */

public boolean equals(java.lang.Object other) { throw new RuntimeException("Stub!"); }

/**
 * Returns a hashcode for this AlgorithmId.
 *
 * @return a hashcode for this AlgorithmId.
 */

public int hashCode() { throw new RuntimeException("Stub!"); }

/**
 * Returns a string describing the algorithm and its parameters.
 */

public java.lang.String toString() { throw new RuntimeException("Stub!"); }
}

