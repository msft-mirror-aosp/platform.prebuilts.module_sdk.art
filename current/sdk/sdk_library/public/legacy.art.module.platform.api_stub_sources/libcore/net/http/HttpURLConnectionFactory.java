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


package libcore.net.http;

import javax.net.SocketFactory;
import java.net.URL;
import java.net.URLConnection;

/**
 * A HttpURLConnectionFactory that supports some configuration on a per-factory or per-connection
 * basis. The per-factory configuration is <b>optional</b>; if not set, global configuration or
 * default behavior is used.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class HttpURLConnectionFactory {

HttpURLConnectionFactory() { throw new RuntimeException("Stub!"); }

/**
 * Create a new {@link libcore.net.http.HttpURLConnectionFactory HttpURLConnectionFactory} instance.
 *
 * @hide
 */

@androidx.annotation.RecentlyNonNull
public static libcore.net.http.HttpURLConnectionFactory createInstance() { throw new RuntimeException("Stub!"); }

/**
 * Sets a new ConnectionPool, specific to this HttpURLConnectionFactory and for all future
 * connections created by {@link #openConnection}, with the given configuration.
 *
 * @param maxIdleConnections The maximum number of idle connections to each to keep in the pool.
 * @param keepAliveDuration Time to keep the connection alive in the pool before closing it.
 * @param timeUnit The time unit of keep alive duration.
 *
 * @hide
 */

public void setNewConnectionPool(int maxIdleConnections, long keepAliveDuration, @androidx.annotation.RecentlyNonNull java.util.concurrent.TimeUnit timeUnit) { throw new RuntimeException("Stub!"); }

/**
 * Sets a new dns resolver.
 *
 * @param dns the dns resolver for looking up.
 *
 * @hide
 */

public void setDns(@androidx.annotation.RecentlyNonNull libcore.net.http.Dns dns) { throw new RuntimeException("Stub!"); }

/**
 * Opens a connection using the specified SocketFactory and the specified proxy
 * settings, overriding any system wide configuration.
 *
 * @param url The target URL that connection opens on.
 * @param socketFactory The socket factory used to create connections.
 * @param proxy The proxy settings used to create connections.
 *
 * @return An {@link java.net.URLConnection} using given SocketFactory, proxy settings and
 *         configuration.
 *
 * @hide
 */

public java.net.URLConnection openConnection(@androidx.annotation.RecentlyNonNull java.net.URL url, @androidx.annotation.RecentlyNonNull javax.net.SocketFactory socketFactory, @androidx.annotation.RecentlyNonNull java.net.Proxy proxy) throws java.io.IOException { throw new RuntimeException("Stub!"); }
}
