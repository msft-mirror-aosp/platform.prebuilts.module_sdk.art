/* GENERATED SOURCE. DO NOT MODIFY. */
/*
 * Copyright (C) 2015 Square, Inc.
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

import com.android.okhttp.internalandroidapi.HasCacheHolder.CacheHolder;
import java.net.URI;
import java.util.Map;
import java.net.URLConnection;
import java.io.IOException;

/**
 * A modified copy of {@link com.android.okhttp.AndroidShimResponseCache} that exposes a
 * {@link com.android.okhttp.internalandroidapi.HasCacheHolder.CacheHolder CacheHolder} instead of a {@link Cache}. We want to keep the framework code that interacts
 * with OkHttp at arms length. By delegating to this class the Android HttpResponseCache class has
 * no knowledge of OkHttp internal classes at class resolution time and there are no internal
 * classes appearing on method signatures.
 * @hide
 * @hide This class is not part of the Android public SDK API
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class AndroidResponseCacheAdapter {

public AndroidResponseCacheAdapter(com.android.okhttp.internalandroidapi.HasCacheHolder.CacheHolder cacheHolder) { throw new RuntimeException("Stub!"); }

/**
 * Returns the {@link com.android.okhttp.internalandroidapi.HasCacheHolder.CacheHolder CacheHolder} associated with this instance and can be used by OkHttp
 * internal code to obtain the underlying OkHttp Cache object.
 */

public com.android.okhttp.internalandroidapi.HasCacheHolder.CacheHolder getCacheHolder() { throw new RuntimeException("Stub!"); }

/**
 * Used to implement {@link java.net.ResponseCache#get(URI, String, Map)}. See that method for
 * details.
 */

public java.net.CacheResponse get(java.net.URI uri, java.lang.String requestMethod, java.util.Map<java.lang.String,java.util.List<java.lang.String>> requestHeaders) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Used to implement {@link java.net.ResponseCache#put(URI, URLConnection)}. See that method for
 * details.
 */

public java.net.CacheRequest put(java.net.URI uri, java.net.URLConnection urlConnection) throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Returns the number of bytes currently being used to store the values in
 * this cache. This may be greater than the {@link #getMaxSize()} if a background
 * deletion is pending. IOException is thrown if the size cannot be determined.
 */

public long getSize() throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Returns the maximum number of bytes that this cache should use to store
 * its data.
 */

public long getMaxSize() { throw new RuntimeException("Stub!"); }

/**
 * Force buffered operations to the filesystem. This ensures that responses
 * written to the cache will be available the next time the cache is opened,
 * even if this process is killed. IOException is thrown if the flush fails.
 */

public void flush() throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Returns the number of HTTP requests that required the network to either
 * supply a response or validate a locally cached response.
 */

public int getNetworkCount() { throw new RuntimeException("Stub!"); }

/**
 * Returns the number of HTTP requests whose response was provided by the
 * cache. This may include conditional {@code GET} requests that were
 * validated over the network.
 */

public int getHitCount() { throw new RuntimeException("Stub!"); }

/**
 * Returns the total number of HTTP requests that were made. This includes
 * both client requests and requests that were made on the client's behalf
 * to handle a redirects and retries.
 */

public int getRequestCount() { throw new RuntimeException("Stub!"); }

/** Closes this cache. Stored values will remain on the filesystem. */

public void close() throws java.io.IOException { throw new RuntimeException("Stub!"); }

/**
 * Closes the cache and deletes all of its stored values. This will delete
 * all files in the cache directory including files that weren't created by
 * the cache.
 */

public void delete() throws java.io.IOException { throw new RuntimeException("Stub!"); }
}

