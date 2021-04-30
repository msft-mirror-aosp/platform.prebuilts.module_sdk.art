/* GENERATED SOURCE. DO NOT MODIFY. */
/*
 * Copyright (C) 2017 The Android Open Source Project
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


package com.android.okhttp.internalandroidapi;

import javax.net.SocketFactory;

/**
 * A way to construct {@link java.net.HttpURLConnection}s that supports some
 * configuration on a per-factory or per-connection basis rather than only via
 * global static state such as {@link java.net.CookieHandler#setDefault(java.net.CookieHandler)}.
 * The per-factory configuration is <b>optional</b>; if not set, global
 * configuration or default behavior is used.
 *
 * This facade prevents tight coupling with the underlying implementation (on
 * top of a particular version of OkHttp). Android code outside of libcore
 * should never depend directly on OkHttp.
 *
 * This abstraction is not suitable for general use. Talk to the maintainers of
 * this class before modifying it or adding additional dependencies.
 *
 * @hide
 * @hide This class is not part of the Android public SDK API
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class HttpURLConnectionFactory {

public HttpURLConnectionFactory() { throw new RuntimeException("Stub!"); }

/**
 * Sets a new ConnectionPool, specific to this URLFactory and not shared with
 * any other connections, with the given configuration.
 */

public void setNewConnectionPool(int maxIdleConnections, long keepAliveDuration, java.util.concurrent.TimeUnit timeUnit) { throw new RuntimeException("Stub!"); }

public void setDns(com.android.okhttp.internalandroidapi.Dns dns) { throw new RuntimeException("Stub!"); }

/**
 * Opens a connection using the specified SocketFactory and the specified proxy
 * settings, overriding any system wide configuration.
 */

public java.net.URLConnection openConnection(java.net.URL url, javax.net.SocketFactory socketFactory, java.net.Proxy proxy) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}

