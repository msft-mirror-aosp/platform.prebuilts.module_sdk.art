/*
 * Copyright (C) 2021 The Android Open Source Project
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

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class StructMsghdr {

public StructMsghdr(@android.annotation.Nullable java.net.SocketAddress msg_name, @android.annotation.NonNull java.nio.ByteBuffer[] msg_iov, @android.annotation.Nullable android.system.StructCmsghdr[] msg_control, int msg_flags) { throw new RuntimeException("Stub!"); }

@android.annotation.Nullable public android.system.StructCmsghdr[] msg_control;

public int msg_flags;

@android.annotation.NonNull public final java.nio.ByteBuffer[] msg_iov;
{ msg_iov = new java.nio.ByteBuffer[0]; }

@android.annotation.Nullable public java.net.SocketAddress msg_name;
}

