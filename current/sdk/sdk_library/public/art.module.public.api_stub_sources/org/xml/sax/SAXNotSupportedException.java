// SAXNotSupportedException.java - unsupported feature or value.
// http://www.saxproject.org
// Written by David Megginson
// NO WARRANTY!  This class is in the Public Domain.
// $Id: SAXNotSupportedException.java,v 1.7 2002/01/30 21:13:48 dbrownell Exp $


package org.xml.sax;


/**
 * Exception class for an unsupported operation.
 *
 * <blockquote>
 * <em>This module, both source code and documentation, is in the
 * Public Domain, and comes with <strong>NO WARRANTY</strong>.</em>
 * See <a href='http://www.saxproject.org'>http://www.saxproject.org</a>
 * for further information.
 * </blockquote>
 *
 * <p>An XMLReader will throw this exception when it recognizes a
 * feature or property identifier, but cannot perform the requested
 * operation (setting a state or value).  Other SAX2 applications and
 * extensions may use this class for similar purposes.</p>
 *
 * @since SAX 2.0
 * @author David Megginson
 * @version 2.0.1 (sax2r2)
 * @see org.xml.sax.SAXNotRecognizedException
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public class SAXNotSupportedException extends org.xml.sax.SAXException {

/**
 * Construct a new exception with no message.
 */

public SAXNotSupportedException() { throw new RuntimeException("Stub!"); }

/**
 * Construct a new exception with the given message.
 *
 * @param message The text message of the exception.
 */

public SAXNotSupportedException(java.lang.String message) { throw new RuntimeException("Stub!"); }
}
