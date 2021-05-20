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


package java.security;

@SuppressWarnings({"unchecked", "deprecation", "all"})
@Deprecated
public abstract class IdentityScope extends java.security.Identity {

@Deprecated
protected IdentityScope() { throw new RuntimeException("Stub!"); }

@Deprecated
public IdentityScope(java.lang.String name) { throw new RuntimeException("Stub!"); }

@Deprecated
public IdentityScope(java.lang.String name, java.security.IdentityScope scope) throws java.security.KeyManagementException { throw new RuntimeException("Stub!"); }

@Deprecated
public static java.security.IdentityScope getSystemScope() { throw new RuntimeException("Stub!"); }

@Deprecated
protected static void setSystemScope(java.security.IdentityScope scope) { throw new RuntimeException("Stub!"); }

@Deprecated
public abstract int size();

@Deprecated
public abstract java.security.Identity getIdentity(java.lang.String name);

@Deprecated
public java.security.Identity getIdentity(java.security.Principal principal) { throw new RuntimeException("Stub!"); }

@Deprecated
public abstract java.security.Identity getIdentity(java.security.PublicKey key);

@Deprecated
public abstract void addIdentity(java.security.Identity identity) throws java.security.KeyManagementException;

@Deprecated
public abstract void removeIdentity(java.security.Identity identity) throws java.security.KeyManagementException;

@Deprecated
public abstract java.util.Enumeration<java.security.Identity> identities();

@Deprecated
public java.lang.String toString() { throw new RuntimeException("Stub!"); }
}

