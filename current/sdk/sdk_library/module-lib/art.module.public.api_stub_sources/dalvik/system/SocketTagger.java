/*
 * Copyright (C) 2011 The Android Open Source Project
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


package dalvik.system;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public abstract class SocketTagger {

public SocketTagger() { throw new RuntimeException("Stub!"); }

public abstract void tag(java.io.FileDescriptor socketDescriptor) throws java.net.SocketException;

public abstract void untag(java.io.FileDescriptor socketDescriptor) throws java.net.SocketException;

public final void tag(java.net.Socket socket) throws java.net.SocketException { throw new RuntimeException("Stub!"); }

public final void untag(java.net.Socket socket) throws java.net.SocketException { throw new RuntimeException("Stub!"); }

public final void tag(java.net.DatagramSocket socket) throws java.net.SocketException { throw new RuntimeException("Stub!"); }

public final void untag(java.net.DatagramSocket socket) throws java.net.SocketException { throw new RuntimeException("Stub!"); }

public static synchronized void set(dalvik.system.SocketTagger tagger) { throw new RuntimeException("Stub!"); }

public static synchronized dalvik.system.SocketTagger get() { throw new RuntimeException("Stub!"); }
}

