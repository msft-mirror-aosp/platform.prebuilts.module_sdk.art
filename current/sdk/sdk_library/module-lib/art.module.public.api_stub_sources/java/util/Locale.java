/*
 * Copyright (C) 2014 The Android Open Source Project
 * Copyright (c) 1996, 2014, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * (C) Copyright Taligent, Inc. 1996, 1997 - All Rights Reserved
 * (C) Copyright IBM Corp. 1996 - 1998 - All Rights Reserved
 *
 * The original version of this source code and documentation
 * is copyrighted and owned by Taligent, Inc., a wholly-owned
 * subsidiary of IBM. These materials are provided under terms
 * of a License Agreement between Taligent and Sun. This technology
 * is protected by multiple US and International patents.
 *
 * This notice and attribution to Taligent may not be removed.
 * Taligent is a registered trademark of Taligent, Inc.
 *
 */


package java.util;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public final class Locale implements java.lang.Cloneable, java.io.Serializable {

public Locale(@androidx.annotation.RecentlyNonNull java.lang.String language, @androidx.annotation.RecentlyNonNull java.lang.String country, @androidx.annotation.RecentlyNonNull java.lang.String variant) { throw new RuntimeException("Stub!"); }

public Locale(@androidx.annotation.RecentlyNonNull java.lang.String language, @androidx.annotation.RecentlyNonNull java.lang.String country) { throw new RuntimeException("Stub!"); }

public Locale(@androidx.annotation.RecentlyNonNull java.lang.String language) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.Locale getDefault() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.Locale getDefault(@androidx.annotation.RecentlyNonNull java.util.Locale.Category category) { throw new RuntimeException("Stub!"); }

public static synchronized void setDefault(@androidx.annotation.RecentlyNonNull java.util.Locale newLocale) { throw new RuntimeException("Stub!"); }

public static synchronized void setDefault(@androidx.annotation.RecentlyNonNull java.util.Locale.Category category, @androidx.annotation.RecentlyNonNull java.util.Locale newLocale) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String[] getISOCountries() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.lang.String[] getISOLanguages() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getLanguage() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getScript() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getCountry() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getVariant() { throw new RuntimeException("Stub!"); }

public boolean hasExtensions() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Locale stripExtensions() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.lang.String getExtension(char key) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Set<java.lang.Character> getExtensionKeys() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Set<java.lang.String> getUnicodeLocaleAttributes() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public java.lang.String getUnicodeLocaleType(@androidx.annotation.RecentlyNonNull java.lang.String key) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Set<java.lang.String> getUnicodeLocaleKeys() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String toString() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String toLanguageTag() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.Locale forLanguageTag(@androidx.annotation.RecentlyNonNull java.lang.String languageTag) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getISO3Language() throws java.util.MissingResourceException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getISO3Country() throws java.util.MissingResourceException { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getDisplayLanguage() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getDisplayLanguage(@androidx.annotation.RecentlyNonNull java.util.Locale locale) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getDisplayScript() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getDisplayScript(@androidx.annotation.RecentlyNonNull java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getDisplayCountry() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getDisplayCountry(@androidx.annotation.RecentlyNonNull java.util.Locale locale) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getDisplayVariant() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getDisplayVariant(@androidx.annotation.RecentlyNonNull java.util.Locale inLocale) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getDisplayName() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getDisplayName(@androidx.annotation.RecentlyNonNull java.util.Locale locale) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.Object clone() { throw new RuntimeException("Stub!"); }

public int hashCode() { throw new RuntimeException("Stub!"); }

public boolean equals(@androidx.annotation.RecentlyNullable java.lang.Object obj) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.List<java.util.Locale> filter(@androidx.annotation.RecentlyNonNull java.util.List<java.util.Locale.LanguageRange> priorityList, @androidx.annotation.RecentlyNonNull java.util.Collection<java.util.Locale> locales, @androidx.annotation.RecentlyNonNull java.util.Locale.FilteringMode mode) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.List<java.util.Locale> filter(@androidx.annotation.RecentlyNonNull java.util.List<java.util.Locale.LanguageRange> priorityList, @androidx.annotation.RecentlyNonNull java.util.Collection<java.util.Locale> locales) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.List<java.lang.String> filterTags(@androidx.annotation.RecentlyNonNull java.util.List<java.util.Locale.LanguageRange> priorityList, @androidx.annotation.RecentlyNonNull java.util.Collection<java.lang.String> tags, @androidx.annotation.RecentlyNonNull java.util.Locale.FilteringMode mode) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.List<java.lang.String> filterTags(@androidx.annotation.RecentlyNonNull java.util.List<java.util.Locale.LanguageRange> priorityList, @androidx.annotation.RecentlyNonNull java.util.Collection<java.lang.String> tags) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public static java.util.Locale lookup(@androidx.annotation.RecentlyNonNull java.util.List<java.util.Locale.LanguageRange> priorityList, @androidx.annotation.RecentlyNonNull java.util.Collection<java.util.Locale> locales) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNullable
public static java.lang.String lookupTag(@androidx.annotation.RecentlyNonNull java.util.List<java.util.Locale.LanguageRange> priorityList, @androidx.annotation.RecentlyNonNull java.util.Collection<java.lang.String> tags) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale CANADA;
static { CANADA = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale CANADA_FRENCH;
static { CANADA_FRENCH = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale CHINA;
static { CHINA = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale CHINESE;
static { CHINESE = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale ENGLISH;
static { ENGLISH = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale FRANCE;
static { FRANCE = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale FRENCH;
static { FRENCH = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale GERMAN;
static { GERMAN = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale GERMANY;
static { GERMANY = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale ITALIAN;
static { ITALIAN = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale ITALY;
static { ITALY = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale JAPAN;
static { JAPAN = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale JAPANESE;
static { JAPANESE = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale KOREA;
static { KOREA = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale KOREAN;
static { KOREAN = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale PRC;
static { PRC = null; }

public static final char PRIVATE_USE_EXTENSION = 120; // 0x0078 'x'

@androidx.annotation.RecentlyNonNull public static final java.util.Locale ROOT;
static { ROOT = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale SIMPLIFIED_CHINESE;
static { SIMPLIFIED_CHINESE = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale TAIWAN;
static { TAIWAN = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale TRADITIONAL_CHINESE;
static { TRADITIONAL_CHINESE = null; }

@androidx.annotation.RecentlyNonNull public static final java.util.Locale UK;
static { UK = null; }

public static final char UNICODE_LOCALE_EXTENSION = 117; // 0x0075 'u'

@androidx.annotation.RecentlyNonNull public static final java.util.Locale US;
static { US = null; }
@SuppressWarnings({"unchecked", "deprecation", "all"})
public static final class Builder {

public Builder() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Locale.Builder setLocale(@androidx.annotation.RecentlyNonNull java.util.Locale locale) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Locale.Builder setLanguageTag(@androidx.annotation.RecentlyNonNull java.lang.String languageTag) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Locale.Builder setLanguage(@androidx.annotation.RecentlyNullable java.lang.String language) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Locale.Builder setScript(@androidx.annotation.RecentlyNullable java.lang.String script) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Locale.Builder setRegion(@androidx.annotation.RecentlyNullable java.lang.String region) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Locale.Builder setVariant(@androidx.annotation.RecentlyNullable java.lang.String variant) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Locale.Builder setExtension(char key, @androidx.annotation.RecentlyNullable java.lang.String value) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Locale.Builder setUnicodeLocaleKeyword(@androidx.annotation.RecentlyNonNull java.lang.String key, @androidx.annotation.RecentlyNullable java.lang.String type) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Locale.Builder addUnicodeLocaleAttribute(@androidx.annotation.RecentlyNonNull java.lang.String attribute) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Locale.Builder removeUnicodeLocaleAttribute(@androidx.annotation.RecentlyNonNull java.lang.String attribute) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Locale.Builder clear() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Locale.Builder clearExtensions() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.util.Locale build() { throw new RuntimeException("Stub!"); }
}

@SuppressWarnings({"unchecked", "deprecation", "all"})
public enum Category {
DISPLAY,
FORMAT;
}

@SuppressWarnings({"unchecked", "deprecation", "all"})
public enum FilteringMode {
AUTOSELECT_FILTERING,
EXTENDED_FILTERING,
IGNORE_EXTENDED_RANGES,
MAP_EXTENDED_RANGES,
REJECT_EXTENDED_RANGES;
}

@SuppressWarnings({"unchecked", "deprecation", "all"})
public static final class LanguageRange {

public LanguageRange(@androidx.annotation.RecentlyNonNull java.lang.String range) { throw new RuntimeException("Stub!"); }

public LanguageRange(@androidx.annotation.RecentlyNonNull java.lang.String range, double weight) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public java.lang.String getRange() { throw new RuntimeException("Stub!"); }

public double getWeight() { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.List<java.util.Locale.LanguageRange> parse(@androidx.annotation.RecentlyNonNull java.lang.String ranges) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.List<java.util.Locale.LanguageRange> parse(@androidx.annotation.RecentlyNonNull java.lang.String ranges, @androidx.annotation.RecentlyNonNull java.util.Map<java.lang.String,java.util.List<java.lang.String>> map) { throw new RuntimeException("Stub!"); }

@androidx.annotation.RecentlyNonNull
public static java.util.List<java.util.Locale.LanguageRange> mapEquivalents(@androidx.annotation.RecentlyNonNull java.util.List<java.util.Locale.LanguageRange> priorityList, @androidx.annotation.RecentlyNonNull java.util.Map<java.lang.String,java.util.List<java.lang.String>> map) { throw new RuntimeException("Stub!"); }

public int hashCode() { throw new RuntimeException("Stub!"); }

public boolean equals(@androidx.annotation.RecentlyNullable java.lang.Object obj) { throw new RuntimeException("Stub!"); }

public static final double MAX_WEIGHT = 1.0;

public static final double MIN_WEIGHT = 0.0;
}

}

