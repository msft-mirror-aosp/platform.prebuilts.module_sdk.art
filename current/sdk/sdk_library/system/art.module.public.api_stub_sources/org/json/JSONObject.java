/*
 * Copyright (C) 2010 The Android Open Source Project
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


package org.json;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class JSONObject {

public JSONObject() { throw new RuntimeException("Stub!"); }

public JSONObject(@androidx.annotation.RecentlyNonNull java.util.Map copyFrom) { throw new RuntimeException("Stub!"); }

public JSONObject(@androidx.annotation.RecentlyNonNull org.json.JSONTokener readFrom) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

public JSONObject(@androidx.annotation.RecentlyNonNull java.lang.String json) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

public JSONObject(@androidx.annotation.RecentlyNonNull org.json.JSONObject copyFrom, @androidx.annotation.RecentlyNonNull java.lang.String[] names) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

public int length() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public org.json.JSONObject put(@androidx.annotation.RecentlyNonNull java.lang.String name, boolean value) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public org.json.JSONObject put(@androidx.annotation.RecentlyNonNull java.lang.String name, double value) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public org.json.JSONObject put(@androidx.annotation.RecentlyNonNull java.lang.String name, int value) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public org.json.JSONObject put(@androidx.annotation.RecentlyNonNull java.lang.String name, long value) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public org.json.JSONObject put(@androidx.annotation.RecentlyNonNull java.lang.String name, @androidx.annotation.RecentlyNullable java.lang.Object value) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public org.json.JSONObject putOpt(@androidx.annotation.RecentlyNullable java.lang.String name, @androidx.annotation.RecentlyNullable java.lang.Object value) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public org.json.JSONObject accumulate(@androidx.annotation.RecentlyNonNull java.lang.String name, @androidx.annotation.RecentlyNullable java.lang.Object value) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.lang.Object remove(@androidx.annotation.RecentlyNullable java.lang.String name) { throw new RuntimeException("Stub!"); }

public boolean isNull(@androidx.annotation.RecentlyNullable java.lang.String name) { throw new RuntimeException("Stub!"); }

public boolean has(@androidx.annotation.RecentlyNullable java.lang.String name) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.Object get(@androidx.annotation.RecentlyNonNull java.lang.String name) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.lang.Object opt(@androidx.annotation.RecentlyNullable java.lang.String name) { throw new RuntimeException("Stub!"); }

public boolean getBoolean(@androidx.annotation.RecentlyNonNull java.lang.String name) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

public boolean optBoolean(@androidx.annotation.RecentlyNullable java.lang.String name) { throw new RuntimeException("Stub!"); }

public boolean optBoolean(@androidx.annotation.RecentlyNullable java.lang.String name, boolean fallback) { throw new RuntimeException("Stub!"); }

public double getDouble(@androidx.annotation.RecentlyNonNull java.lang.String name) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

public double optDouble(@androidx.annotation.RecentlyNullable java.lang.String name) { throw new RuntimeException("Stub!"); }

public double optDouble(@androidx.annotation.RecentlyNullable java.lang.String name, double fallback) { throw new RuntimeException("Stub!"); }

public int getInt(@androidx.annotation.RecentlyNonNull java.lang.String name) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

public int optInt(@androidx.annotation.RecentlyNullable java.lang.String name) { throw new RuntimeException("Stub!"); }

public int optInt(@androidx.annotation.RecentlyNullable java.lang.String name, int fallback) { throw new RuntimeException("Stub!"); }

public long getLong(@androidx.annotation.RecentlyNonNull java.lang.String name) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

public long optLong(@androidx.annotation.RecentlyNullable java.lang.String name) { throw new RuntimeException("Stub!"); }

public long optLong(@androidx.annotation.RecentlyNullable java.lang.String name, long fallback) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getString(@androidx.annotation.RecentlyNonNull java.lang.String name) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String optString(@androidx.annotation.RecentlyNullable java.lang.String name) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String optString(@androidx.annotation.RecentlyNullable java.lang.String name, @androidx.annotation.RecentlyNonNull java.lang.String fallback) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public org.json.JSONArray getJSONArray(@androidx.annotation.RecentlyNonNull java.lang.String name) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public org.json.JSONArray optJSONArray(@androidx.annotation.RecentlyNullable java.lang.String name) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public org.json.JSONObject getJSONObject(@androidx.annotation.RecentlyNonNull java.lang.String name) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public org.json.JSONObject optJSONObject(@androidx.annotation.RecentlyNullable java.lang.String name) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public org.json.JSONArray toJSONArray(@androidx.annotation.RecentlyNullable org.json.JSONArray names) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Iterator<java.lang.String> keys() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public org.json.JSONArray names() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String toString() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String toString(int indentSpaces) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String numberToString(@androidx.annotation.RecentlyNonNull java.lang.Number number) throws org.json.JSONException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String quote(@androidx.annotation.RecentlyNullable java.lang.String data) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public static java.lang.Object wrap(@androidx.annotation.RecentlyNullable java.lang.Object o) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull public static final java.lang.Object NULL;
static { NULL = null; }
}

