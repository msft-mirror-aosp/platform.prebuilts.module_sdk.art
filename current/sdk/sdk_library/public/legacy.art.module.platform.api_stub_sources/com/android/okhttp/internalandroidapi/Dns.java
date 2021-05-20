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


/**
 * A domain name service that resolves IP addresses for host names.
 * @hide
 * @hide This class is not part of the Android public SDK API
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface Dns {

/**
 * Returns the IP addresses of {@code hostname}, in the order they should
 * be attempted.
 */

public java.util.List<java.net.InetAddress> lookup(java.lang.String hostname) throws java.net.UnknownHostException;
}

