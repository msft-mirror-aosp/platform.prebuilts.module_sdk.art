/*
 * Copyright (c) 1996, 2006, Oracle and/or its affiliates. All rights reserved.
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


package sun.security.util;

import java.io.*;

/**
 * Represent an ISO Object Identifier.
 *
 * <P>Object Identifiers are arbitrary length hierarchical identifiers.
 * The individual components are numbers, and they define paths from the
 * root of an ISO-managed identifier space.  You will sometimes see a
 * string name used instead of (or in addition to) the numerical id.
 * These are synonyms for the numerical IDs, but are not widely used
 * since most sites do not know all the requisite strings, while all
 * sites can parse the numeric forms.
 *
 * <P>So for example, JavaSoft has the sole authority to assign the
 * meaning to identifiers below the 1.3.6.1.4.1.42.2.17 node in the
 * hierarchy, and other organizations can easily acquire the ability
 * to assign such unique identifiers.
 *
 * @author David Brownell
 * @author Amit Kapoor
 * @author Hemma Prafullchandra
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class ObjectIdentifier implements java.io.Serializable {

/**
 * Constructs, from a string.  This string should be of the form 1.23.56.
 * Validity check included.
 */

public ObjectIdentifier(java.lang.String oid) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Compares this identifier with another, for equality.
 *
 * @return true iff the names are identical.
 */

public boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }

public int hashCode() { throw new RuntimeException("Stub!"); }

/**
 * Returns a string form of the object ID.  The format is the
 * conventional "dot" notation for such IDs, without any
 * user-friendly descriptive strings, since those strings
 * will not be understood everywhere.
 */

public java.lang.String toString() { throw new RuntimeException("Stub!"); }
}

