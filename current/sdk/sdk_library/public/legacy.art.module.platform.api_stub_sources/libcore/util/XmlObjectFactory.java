/*
 * Copyright (C) 2007 The Android Open Source Project
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


package libcore.util;

import org.xmlpull.v1.XmlSerializer;
import org.xmlpull.v1.XmlPullParser;
import org.xml.sax.XMLReader;

/**
 * An internal class for creating platform-default XML parsers and related objects.
 *
 * @hide
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class XmlObjectFactory {

private XmlObjectFactory() { throw new RuntimeException("Stub!"); }

/**
 * Returns a new instance of the platform default {@link org.xmlpull.v1.XmlSerializer XmlSerializer} more efficiently than
 * using {@code XmlPullParserFactory.newInstance().newSerializer()}.
 *
 * @return platform default {@link org.xmlpull.v1.XmlSerializer XmlSerializer}
 *
 * @hide
 */

@androidx.annotation.RecentlyNonNull
public static org.xmlpull.v1.XmlSerializer newXmlSerializer() { throw new RuntimeException("Stub!"); }

/**
 * Returns a new instance of the platform default {@link org.xmlpull.v1.XmlPullParser XmlPullParser} more efficiently than
 * using {@code XmlPullParserFactory.newInstance().newPullParser()}.
 *
 * @return platform default {@link org.xmlpull.v1.XmlPullParser XmlPullParser}
 *
 * @hide
 */

@androidx.annotation.RecentlyNonNull
public static org.xmlpull.v1.XmlPullParser newXmlPullParser() { throw new RuntimeException("Stub!"); }

/**
 * Returns the plaform default {@link org.xml.sax.XMLReader XMLReader}.
 *
 * @return plaform default {@link org.xml.sax.XMLReader XMLReader}
 *
 * @hide
 */

@androidx.annotation.RecentlyNonNull
public static org.xml.sax.XMLReader newXMLReader() { throw new RuntimeException("Stub!"); }
}

