/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package android.system;


/**
 * Packet socket address.
 *
 * Corresponds to Linux's {@code struct sockaddr_ll}.
 *
 * See <a href="https://man7.org/linux/man-pages/man7/packet.7.html">packet(7)</a>.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class PacketSocketAddress extends java.net.SocketAddress {

/**
 * Constructs a new PacketSocketAddress with all the "in" parameters which
 * correspond to Linux's {@code struct sockaddr_ll}.
 *
 * See <a href="https://man7.org/linux/man-pages/man7/packet.7.html">packet(7)</a>.
 *
 * @param sll_protocol protocol field in {@code struct sockaddr_ll}
 * @param sll_ifindex  interface index number field in {@code struct sockaddr_ll}
 * @param sll_addr     physical-layer address field in {@code struct sockaddr_ll}
 *
 * @hide
 */

public PacketSocketAddress(int sll_protocol, int sll_ifindex, byte[] sll_addr) { throw new RuntimeException("Stub!"); }

/**
 * @hide
 */

public java.lang.String toString() { throw new RuntimeException("Stub!"); }
}

