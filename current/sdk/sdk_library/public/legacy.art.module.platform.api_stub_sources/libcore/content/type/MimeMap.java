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

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.Map;

/**
 * Maps from MIME types to file extensions and back.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class MimeMap {

private MimeMap() { throw new RuntimeException("Stub!"); }

/**
 * Creates a MIME type map builder.
 *
 * @return builder
 *
 * @see libcore.content.type.MimeMap.Builder
 *
 * @hide
 */

@androidx.annotation.RecentlyNonNull
public static libcore.content.type.MimeMap.Builder builder() { throw new RuntimeException("Stub!"); }

/**
 * Creates a MIME type map builder with values based on {@code this} instance.
 * This builder will contain all previously added MIMEs and extensions.
 *
 * @return builder
 *
 * @see libcore.content.type.MimeMap.Builder
 *
 * @hide
 */

@androidx.annotation.RecentlyNonNull
public libcore.content.type.MimeMap.Builder buildUpon() { throw new RuntimeException("Stub!"); }

/**
 * Gets system's current default {@link libcore.content.type.MimeMap MimeMap}
 *
 * @return The system's current default {@link libcore.content.type.MimeMap MimeMap}.
 *
 * @hide
 */

@androidx.annotation.RecentlyNonNull
public static libcore.content.type.MimeMap getDefault() { throw new RuntimeException("Stub!"); }

/**
 * Sets the {@link java.util.function.Supplier Supplier} of the {@link #getDefault() default MimeMap
 * instance} to be used from now on.
 *
 * {@code mimeMapSupplier.get()} will be invoked only the first time that
 * {@link #getDefault()} is called after this method call; that
 * {@link libcore.content.type.MimeMap MimeMap} instance is memoized such that subsequent calls to
 * {@link #getDefault()} without an intervening call to
 * {@link #setDefaultSupplier(java.util.function.Supplier)} will return that same instance
 * without consulting {@code mimeMapSupplier} a second time.
 *
 * @hide
 */

public static void setDefaultSupplier(@androidx.annotation.RecentlyNonNull java.util.function.Supplier<libcore.content.type.MimeMap> mimeMapSupplier) { throw new RuntimeException("Stub!"); }

/**
 * Returns whether the given case insensitive extension has a registered MIME type.
 *
 * @param extension A file extension without the leading '.'
 * @return Whether a MIME type has been registered for the given case insensitive file
 *         extension.
 *
 * @hide
 */

public boolean hasExtension(@androidx.annotation.RecentlyNullable java.lang.String extension) { throw new RuntimeException("Stub!"); }

/**
 * Returns the MIME type for the given case insensitive file extension, or null
 * if the extension isn't mapped to any.
 *
 * @param extension A file extension without the leading '.'
 * @return The lower-case MIME type registered for the given case insensitive file extension,
 *         or null if there is none.
 *
 * @hide
 */

@androidx.annotation.RecentlyNullable
public java.lang.String guessMimeTypeFromExtension(@androidx.annotation.RecentlyNullable java.lang.String extension) { throw new RuntimeException("Stub!"); }

/**
 * Returns whether given case insensetive MIME type is mapped to a file extension.
 *
 * @param mimeType A MIME type (i.e. {@code "text/plain")
 * @return Whether the given case insensitive MIME type is
 *         {@link #guessMimeTypeFromExtension(String) mapped} to a file extension.
 *
 * @hide
 */

public boolean hasMimeType(@androidx.annotation.RecentlyNullable java.lang.String mimeType) { throw new RuntimeException("Stub!"); }

/**
 * Returns the registered extension for the given case insensitive MIME type. Note that some
 * MIME types map to multiple extensions. This call will return the most
 * common extension for the given MIME type.
 * @param mimeType A MIME type (i.e. text/plain)
 * @return The lower-case file extension (without the leading "." that has been registered for
 *         the given case insensitive MIME type, or null if there is none.
 *
 * @hide
 */

@androidx.annotation.RecentlyNullable
public java.lang.String guessExtensionFromMimeType(@androidx.annotation.RecentlyNullable java.lang.String mimeType) { throw new RuntimeException("Stub!"); }

/**
 * Returns the set of MIME types that this {@link libcore.content.type.MimeMap MimeMap}
 * {@link #hasMimeType(java.lang.String) maps to some extension}. Note that the
 * reverse mapping might not exist.
 *
 * @return unmodifiable {@link java.util.Set Set} of MIME types mapped to some extension
 *
 * @hide
 */

@androidx.annotation.RecentlyNonNull
public java.util.Set<java.lang.String> mimeTypes() { throw new RuntimeException("Stub!"); }

/**
 * Returns the set of extensions that this {@link libcore.content.type.MimeMap MimeMap}
 * {@link #hasExtension(java.lang.String) maps to some MIME type}. Note that the
 * reverse mapping might not exist.
 *
 * @return unmodifiable {@link java.util.Set Set} of extensions that this {@link libcore.content.type.MimeMap MimeMap}
 *         maps to some MIME type
 *
 * @hide
 */

@androidx.annotation.RecentlyNonNull
public java.util.Set<java.lang.String> extensions() { throw new RuntimeException("Stub!"); }

/**
 *
 * @hide
 */

public int hashCode() { throw new RuntimeException("Stub!"); }

/**
 *
 * @hide
 */

public boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }

/**
 *
 * @hide
 */

public java.lang.String toString() { throw new RuntimeException("Stub!"); }
/**
 * A builder for mapping of MIME types to extensions and back.
 * Use {@link #addMimeMapping(java.lang.String,java.util.List)} and {@link #addMimeMapping(java.lang.String,java.lang.String)} to add
 * mapping entries and build final {@link libcore.content.type.MimeMap MimeMap} with {@link #build()}.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public static final class Builder {

Builder() { throw new RuntimeException("Stub!"); }

/**
 * Puts the mapping {@quote mimeType -> first extension}, and also the mappings
 * {@quote extension -> mimeType} for each given extension.
 *
 * The values passed to this function are carry an optional  prefix of {@quote "?"}
 * which is stripped off in any case before any such key/value is added to a mapping.
 * The prefix {@quote "?"} controls whether the mapping <i>from></i> the corresponding
 * value is added via {@link java.util.Map#putIfAbsent Map#putIfAbsent} semantics ({@quote "?"}
 * present) vs. {@link java.util.Map#put Map#put} semantics ({@quote "?" absent}),
 *
 * For example, {@code put("text/html", "?htm", "html")} would add the following
 * mappings:
 * <ol>
 *   <li>MIME type "text/html" -> extension "htm", overwriting any earlier mapping
 *       from MIME type "text/html" that might already have existed.</li>
 *   <li>extension "htm" -> MIME type "text/html", but only if no earlier mapping
 *       for extension "htm" existed.</li>
 *   <li>extension "html" -> MIME type "text/html", overwriting any earlier mapping
 *       from extension "html" that might already have existed.</li>
 * </ol>
 * {@code put("?text/html", "?htm", "html")} would have the same effect except
 * that an earlier mapping from MIME type {@code "text/html"} would not be
 * overwritten.
 *
 * @param mimeSpec A MIME type carrying an optional prefix of {@code "?"}. If present,
 *                 the {@code "?"} is stripped off and mapping for the resulting MIME
 *                 type is only added to the map if no mapping had yet existed for that
 *                 type.
 * @param extensionSpecs The extensions from which to add mappings back to
 *                 the {@code "?"} is stripped off and mapping for the resulting extension
 *                 is only added to the map if no mapping had yet existed for that
 *                 extension.
 *                 If {@code extensionSpecs} is empty, then calling this method has no
 *                 effect on the mapping that is being constructed.
 * @throws java.lang.IllegalArgumentException if {@code mimeSpec} or any of the {@code extensionSpecs}
 *                 are invalid (null, empty, contain ' ', or '?' after an initial '?' has
 *                 been stripped off).
 * @return This builder.
 *
 * @hide
 */

@androidx.annotation.RecentlyNonNull
public libcore.content.type.MimeMap.Builder addMimeMapping(@androidx.annotation.RecentlyNonNull java.lang.String mimeSpec, @androidx.annotation.RecentlyNonNull java.util.List<java.lang.String> extensionSpecs) { throw new RuntimeException("Stub!"); }

/**
 * Builds {@link libcore.content.type.MimeMap MimeMap} containing all added MIME mappings.
 *
 * @return {@link libcore.content.type.MimeMap MimeMap} containing previously added MIME mapping entries
 *
 * @hide
 */

@androidx.annotation.RecentlyNonNull
public libcore.content.type.MimeMap build() { throw new RuntimeException("Stub!"); }

/**
 *
 * @hide
 */

public java.lang.String toString() { throw new RuntimeException("Stub!"); }
}

}

