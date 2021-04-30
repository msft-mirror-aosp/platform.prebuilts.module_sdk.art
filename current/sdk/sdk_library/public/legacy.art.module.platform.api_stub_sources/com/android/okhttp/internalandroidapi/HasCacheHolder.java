/* GENERATED SOURCE. DO NOT MODIFY. */
/*
 * Copyright (C) 2018 The Android Open Source Project
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

import java.io.File;

/**
 * An interface used to indicate a class can return a {@link com.android.okhttp.internalandroidapi.HasCacheHolder.CacheHolder CacheHolder} object.
 * @hide
 * @hide This class is not part of the Android public SDK API
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface HasCacheHolder {

/**
 * Returns the {@link com.android.okhttp.internalandroidapi.HasCacheHolder.CacheHolder CacheHolder} object.
 */

public com.android.okhttp.internalandroidapi.HasCacheHolder.CacheHolder getCacheHolder();
/**
 * A holder for an OkHttp internal Cache object. This class exists as an opaque layer over
 * OkHttp internal classes.
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public static final class CacheHolder {

private CacheHolder() { throw new RuntimeException("Stub!"); }

/**
 * Returns a new {@link com.android.okhttp.internalandroidapi.HasCacheHolder.CacheHolder CacheHolder} containing an OKHttp Cache with the specified settings.
 *
 * @param directory a writable directory
 * @param maxSizeBytes the maximum number of bytes this cache should use to store
 */

public static com.android.okhttp.internalandroidapi.HasCacheHolder.CacheHolder create(java.io.File directory, long maxSizeBytes) { throw new RuntimeException("Stub!"); }

/**
 * Returns true if the arguments supplied would result in an equivalent cache to this one
 * being created if they were passed to {@link #create(java.io.File,long)}.
 */

public boolean isEquivalent(java.io.File directory, long maxSizeBytes) { throw new RuntimeException("Stub!"); }
}

}

