/*
 * Copyright (c) 1997, 2013, Oracle and/or its affiliates. All rights reserved.
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


package java.util.jar;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class Attributes implements java.util.Map<java.lang.Object,java.lang.Object>, java.lang.Cloneable {

public Attributes() { throw new RuntimeException("Stub!"); }

public Attributes(int size) { throw new RuntimeException("Stub!"); }

public Attributes(java.util.jar.Attributes attr) { throw new RuntimeException("Stub!"); }

public java.lang.Object get(java.lang.Object name) { throw new RuntimeException("Stub!"); }

public java.lang.String getValue(java.lang.String name) { throw new RuntimeException("Stub!"); }

public java.lang.String getValue(java.util.jar.Attributes.Name name) { throw new RuntimeException("Stub!"); }

public java.lang.Object put(java.lang.Object name, java.lang.Object value) { throw new RuntimeException("Stub!"); }

public java.lang.String putValue(java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }

public java.lang.Object remove(java.lang.Object name) { throw new RuntimeException("Stub!"); }

public boolean containsValue(java.lang.Object value) { throw new RuntimeException("Stub!"); }

public boolean containsKey(java.lang.Object name) { throw new RuntimeException("Stub!"); }

public void putAll(java.util.Map<?,?> attr) { throw new RuntimeException("Stub!"); }

public void clear() { throw new RuntimeException("Stub!"); }

public int size() { throw new RuntimeException("Stub!"); }

public boolean isEmpty() { throw new RuntimeException("Stub!"); }

public java.util.Set<java.lang.Object> keySet() { throw new RuntimeException("Stub!"); }

public java.util.Collection<java.lang.Object> values() { throw new RuntimeException("Stub!"); }

public java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> entrySet() { throw new RuntimeException("Stub!"); }

public boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }

public int hashCode() { throw new RuntimeException("Stub!"); }

public java.lang.Object clone() { throw new RuntimeException("Stub!"); }

protected java.util.Map<java.lang.Object,java.lang.Object> map;
@SuppressWarnings({"unchecked", "deprecation", "all"})
public static class Name {

public Name(java.lang.String name) { throw new RuntimeException("Stub!"); }

public boolean equals(java.lang.Object o) { throw new RuntimeException("Stub!"); }

public int hashCode() { throw new RuntimeException("Stub!"); }

public java.lang.String toString() { throw new RuntimeException("Stub!"); }

public static final java.util.jar.Attributes.Name CLASS_PATH;
static { CLASS_PATH = null; }

public static final java.util.jar.Attributes.Name CONTENT_TYPE;
static { CONTENT_TYPE = null; }

@Deprecated public static final java.util.jar.Attributes.Name EXTENSION_INSTALLATION;
static { EXTENSION_INSTALLATION = null; }

public static final java.util.jar.Attributes.Name EXTENSION_LIST;
static { EXTENSION_LIST = null; }

public static final java.util.jar.Attributes.Name EXTENSION_NAME;
static { EXTENSION_NAME = null; }

public static final java.util.jar.Attributes.Name IMPLEMENTATION_TITLE;
static { IMPLEMENTATION_TITLE = null; }

@Deprecated public static final java.util.jar.Attributes.Name IMPLEMENTATION_URL;
static { IMPLEMENTATION_URL = null; }

public static final java.util.jar.Attributes.Name IMPLEMENTATION_VENDOR;
static { IMPLEMENTATION_VENDOR = null; }

@Deprecated public static final java.util.jar.Attributes.Name IMPLEMENTATION_VENDOR_ID;
static { IMPLEMENTATION_VENDOR_ID = null; }

public static final java.util.jar.Attributes.Name IMPLEMENTATION_VERSION;
static { IMPLEMENTATION_VERSION = null; }

public static final java.util.jar.Attributes.Name MAIN_CLASS;
static { MAIN_CLASS = null; }

public static final java.util.jar.Attributes.Name MANIFEST_VERSION;
static { MANIFEST_VERSION = null; }

public static final java.util.jar.Attributes.Name SEALED;
static { SEALED = null; }

public static final java.util.jar.Attributes.Name SIGNATURE_VERSION;
static { SIGNATURE_VERSION = null; }

public static final java.util.jar.Attributes.Name SPECIFICATION_TITLE;
static { SPECIFICATION_TITLE = null; }

public static final java.util.jar.Attributes.Name SPECIFICATION_VENDOR;
static { SPECIFICATION_VENDOR = null; }

public static final java.util.jar.Attributes.Name SPECIFICATION_VERSION;
static { SPECIFICATION_VERSION = null; }
}

}

