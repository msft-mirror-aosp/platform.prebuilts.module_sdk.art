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
public interface SocketOptions {

public void setOption(int optID, java.lang.Object value) throws java.net.SocketException;

public java.lang.Object getOption(int optID) throws java.net.SocketException;

public static final int IP_MULTICAST_IF = 16; // 0x10

public static final int IP_MULTICAST_IF2 = 31; // 0x1f

public static final int IP_MULTICAST_LOOP = 18; // 0x12

public static final int IP_TOS = 3; // 0x3

public static final int SO_BINDADDR = 15; // 0xf

public static final int SO_BROADCAST = 32; // 0x20

public static final int SO_KEEPALIVE = 8; // 0x8

public static final int SO_LINGER = 128; // 0x80

public static final int SO_OOBINLINE = 4099; // 0x1003

public static final int SO_RCVBUF = 4098; // 0x1002

public static final int SO_REUSEADDR = 4; // 0x4

public static final int SO_SNDBUF = 4097; // 0x1001

public static final int SO_TIMEOUT = 4102; // 0x1006

public static final int TCP_NODELAY = 1; // 0x1
}

