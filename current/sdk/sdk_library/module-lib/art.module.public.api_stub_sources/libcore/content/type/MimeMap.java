/*
 * Copyright (C) 2019 The Android Open Source Project
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


package libcore.content.type;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class MimeMap {

private MimeMap() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static libcore.content.type.MimeMap.Builder builder() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public libcore.content.type.MimeMap.Builder buildUpon() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static libcore.content.type.MimeMap getDefault() { throw new RuntimeException("Stub!"); }

public static void setDefaultSupplier(@androidx.annotation.RecentlyNonNull java.util.function.Supplier<libcore.content.type.MimeMap> mimeMapSupplier) { throw new RuntimeException("Stub!"); }

public boolean hasExtension(@androidx.annotation.RecentlyNullable java.lang.String extension) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.lang.String guessMimeTypeFromExtension(@androidx.annotation.RecentlyNullable java.lang.String extension) { throw new RuntimeException("Stub!"); }

public boolean hasMimeType(@androidx.annotation.RecentlyNullable java.lang.String mimeType) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.lang.String guessExtensionFromMimeType(@androidx.annotation.RecentlyNullable java.lang.String mimeType) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Set<java.lang.String> mimeTypes() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Set<java.lang.String> extensions() { throw new RuntimeException("Stub!"); }

public int hashCode() { throw new RuntimeException("Stub!"); }

public boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }

public java.lang.String toString() { throw new RuntimeException("Stub!"); }
@SuppressWarnings({"unchecked", "deprecation", "all"})
public static final class Builder {

Builder() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public libcore.content.type.MimeMap.Builder addMimeMapping(@androidx.annotation.RecentlyNonNull java.lang.String mimeSpec, @androidx.annotation.RecentlyNonNull java.util.List<java.lang.String> extensionSpecs) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public libcore.content.type.MimeMap build() { throw new RuntimeException("Stub!"); }

public java.lang.String toString() { throw new RuntimeException("Stub!"); }
}

}

