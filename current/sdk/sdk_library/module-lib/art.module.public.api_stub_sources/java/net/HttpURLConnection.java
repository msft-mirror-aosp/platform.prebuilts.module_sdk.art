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


package java.net;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public abstract class HttpURLConnection extends java.net.URLConnection {

protected HttpURLConnection(java.net.URL u) { super(null); throw new RuntimeException("Stub!"); }

public java.lang.String getHeaderFieldKey(int n) { throw new RuntimeException("Stub!"); }

public void setFixedLengthStreamingMode(int contentLength) { throw new RuntimeException("Stub!"); }

public void setFixedLengthStreamingMode(long contentLength) { throw new RuntimeException("Stub!"); }

public void setChunkedStreamingMode(int chunklen) { throw new RuntimeException("Stub!"); }

public java.lang.String getHeaderField(int n) { throw new RuntimeException("Stub!"); }

public static void setFollowRedirects(boolean set) { throw new RuntimeException("Stub!"); }

public static boolean getFollowRedirects() { throw new RuntimeException("Stub!"); }

public void setInstanceFollowRedirects(boolean followRedirects) { throw new RuntimeException("Stub!"); }

public boolean getInstanceFollowRedirects() { throw new RuntimeException("Stub!"); }

public void setRequestMethod(java.lang.String method) throws java.net.ProtocolException { throw new RuntimeException("Stub!"); }

public java.lang.String getRequestMethod() { throw new RuntimeException("Stub!"); }

public int getResponseCode() throws java.io.IOException { throw new RuntimeException("Stub!"); }

public java.lang.String getResponseMessage() throws java.io.IOException { throw new RuntimeException("Stub!"); }

public long getHeaderFieldDate(java.lang.String name, long Default) { throw new RuntimeException("Stub!"); }

public abstract void disconnect();

public abstract boolean usingProxy();

public java.security.Permission getPermission() throws java.io.IOException { throw new RuntimeException("Stub!"); }

public java.io.InputStream getErrorStream() { throw new RuntimeException("Stub!"); }

public static final int HTTP_ACCEPTED = 202; // 0xca

public static final int HTTP_BAD_GATEWAY = 502; // 0x1f6

public static final int HTTP_BAD_METHOD = 405; // 0x195

public static final int HTTP_BAD_REQUEST = 400; // 0x190

public static final int HTTP_CLIENT_TIMEOUT = 408; // 0x198

public static final int HTTP_CONFLICT = 409; // 0x199

public static final int HTTP_CREATED = 201; // 0xc9

public static final int HTTP_ENTITY_TOO_LARGE = 413; // 0x19d

public static final int HTTP_FORBIDDEN = 403; // 0x193

public static final int HTTP_GATEWAY_TIMEOUT = 504; // 0x1f8

public static final int HTTP_GONE = 410; // 0x19a

public static final int HTTP_INTERNAL_ERROR = 500; // 0x1f4

public static final int HTTP_LENGTH_REQUIRED = 411; // 0x19b

public static final int HTTP_MOVED_PERM = 301; // 0x12d

public static final int HTTP_MOVED_TEMP = 302; // 0x12e

public static final int HTTP_MULT_CHOICE = 300; // 0x12c

public static final int HTTP_NOT_ACCEPTABLE = 406; // 0x196

public static final int HTTP_NOT_AUTHORITATIVE = 203; // 0xcb

public static final int HTTP_NOT_FOUND = 404; // 0x194

public static final int HTTP_NOT_IMPLEMENTED = 501; // 0x1f5

public static final int HTTP_NOT_MODIFIED = 304; // 0x130

public static final int HTTP_NO_CONTENT = 204; // 0xcc

public static final int HTTP_OK = 200; // 0xc8

public static final int HTTP_PARTIAL = 206; // 0xce

public static final int HTTP_PAYMENT_REQUIRED = 402; // 0x192

public static final int HTTP_PRECON_FAILED = 412; // 0x19c

public static final int HTTP_PROXY_AUTH = 407; // 0x197

public static final int HTTP_REQ_TOO_LONG = 414; // 0x19e

public static final int HTTP_RESET = 205; // 0xcd

public static final int HTTP_SEE_OTHER = 303; // 0x12f

@Deprecated public static final int HTTP_SERVER_ERROR = 500; // 0x1f4

public static final int HTTP_UNAUTHORIZED = 401; // 0x191

public static final int HTTP_UNAVAILABLE = 503; // 0x1f7

public static final int HTTP_UNSUPPORTED_TYPE = 415; // 0x19f

public static final int HTTP_USE_PROXY = 305; // 0x131

public static final int HTTP_VERSION = 505; // 0x1f9

protected int chunkLength = -1; // 0xffffffff

protected int fixedContentLength = -1; // 0xffffffff

protected long fixedContentLengthLong = -1; // 0xffffffff

protected boolean instanceFollowRedirects;

protected java.lang.String method = "GET";

protected int responseCode = -1; // 0xffffffff

protected java.lang.String responseMessage;
}

