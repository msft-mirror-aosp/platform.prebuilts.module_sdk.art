/*
 * Copyright (c) 2004 World Wide Web Consortium,
 *
 * (Massachusetts Institute of Technology, European Research Consortium for
 * Informatics and Mathematics, Keio University). All Rights Reserved. This
 * work is distributed under the W3C(r) Software License [1] in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
 */


package org.w3c.dom;


/**
 * The <code>Element</code> interface represents an element in an HTML or XML
 * document. Elements may have attributes associated with them; since the
 * <code>Element</code> interface inherits from <code>Node</code>, the
 * generic <code>Node</code> interface attribute <code>attributes</code> may
 * be used to retrieve the set of all attributes for an element. There are
 * methods on the <code>Element</code> interface to retrieve either an
 * <code>Attr</code> object by name or an attribute value by name. In XML,
 * where an attribute value may contain entity references, an
 * <code>Attr</code> object should be retrieved to examine the possibly
 * fairly complex sub-tree representing the attribute value. On the other
 * hand, in HTML, where all attributes have simple string values, methods to
 * directly access an attribute value can safely be used as a convenience.
 * <p ><b>Note:</b> In DOM Level 2, the method <code>normalize</code> is
 * inherited from the <code>Node</code> interface where it was moved.
 * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document Object Model (DOM) Level 3 Core Specification</a>.
 */

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface Element extends org.w3c.dom.Node {

/**
 * The name of the element. If <code>Node.localName</code> is different
 * from <code>null</code>, this attribute is a qualified name. For
 * example, in:
 * <pre> &lt;elementExample id="demo"&gt; ...
 * &lt;/elementExample&gt; , </pre>
 *  <code>tagName</code> has the value
 * <code>"elementExample"</code>. Note that this is case-preserving in
 * XML, as are all of the operations of the DOM. The HTML DOM returns
 * the <code>tagName</code> of an HTML element in the canonical
 * uppercase form, regardless of the case in the source HTML document.
 */

public java.lang.String getTagName();

/**
 * Retrieves an attribute value by name.
 * @param name The name of the attribute to retrieve.
 * @return The <code>Attr</code> value as a string, or the empty string
 *   if that attribute does not have a specified or default value.
 */

public java.lang.String getAttribute(java.lang.String name);

/**
 * Adds a new attribute. If an attribute with that name is already present
 * in the element, its value is changed to be that of the value
 * parameter. This value is a simple string; it is not parsed as it is
 * being set. So any markup (such as syntax to be recognized as an
 * entity reference) is treated as literal text, and needs to be
 * appropriately escaped by the implementation when it is written out.
 * In order to assign an attribute value that contains entity
 * references, the user must create an <code>Attr</code> node plus any
 * <code>Text</code> and <code>EntityReference</code> nodes, build the
 * appropriate subtree, and use <code>setAttributeNode</code> to assign
 * it as the value of an attribute.
 * <br>To set an attribute with a qualified name and namespace URI, use
 * the <code>setAttributeNS</code> method.
 * @param name The name of the attribute to create or alter.
 * @param value Value to set in string form.
 * @exception org.w3c.dom.DOMException
 *   INVALID_CHARACTER_ERR: Raised if the specified name is not an XML
 *   name according to the XML version in use specified in the
 *   <code>Document.xmlVersion</code> attribute.
 *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
 */

public void setAttribute(java.lang.String name, java.lang.String value) throws org.w3c.dom.DOMException;

/**
 * Removes an attribute by name. If a default value for the removed
 * attribute is defined in the DTD, a new attribute immediately appears
 * with the default value as well as the corresponding namespace URI,
 * local name, and prefix when applicable. The implementation may handle
 * default values from other schemas similarly but applications should
 * use <code>Document.normalizeDocument()</code> to guarantee this
 * information is up-to-date.
 * <br>If no attribute with this name is found, this method has no effect.
 * <br>To remove an attribute by local name and namespace URI, use the
 * <code>removeAttributeNS</code> method.
 * @param name The name of the attribute to remove.
 * @exception org.w3c.dom.DOMException
 *   NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
 */

public void removeAttribute(java.lang.String name) throws org.w3c.dom.DOMException;

/**
 * Retrieves an attribute node by name.
 * <br>To retrieve an attribute node by qualified name and namespace URI,
 * use the <code>getAttributeNodeNS</code> method.
 * @param name The name (<code>nodeName</code>) of the attribute to
 *   retrieve.
 * @return The <code>Attr</code> node with the specified name (
 *   <code>nodeName</code>) or <code>null</code> if there is no such
 *   attribute.
 */

public org.w3c.dom.Attr getAttributeNode(java.lang.String name);

/**
 * Adds a new attribute node. If an attribute with that name (
 * <code>nodeName</code>) is already present in the element, it is
 * replaced by the new one. Replacing an attribute node by itself has no
 * effect.
 * <br>To add a new attribute node with a qualified name and namespace
 * URI, use the <code>setAttributeNodeNS</code> method.
 * @param newAttr The <code>Attr</code> node to add to the attribute list.
 * @return If the <code>newAttr</code> attribute replaces an existing
 *   attribute, the replaced <code>Attr</code> node is returned,
 *   otherwise <code>null</code> is returned.
 * @exception org.w3c.dom.DOMException
 *   WRONG_DOCUMENT_ERR: Raised if <code>newAttr</code> was created from a
 *   different document than the one that created the element.
 *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
 *   <br>INUSE_ATTRIBUTE_ERR: Raised if <code>newAttr</code> is already an
 *   attribute of another <code>Element</code> object. The DOM user must
 *   explicitly clone <code>Attr</code> nodes to re-use them in other
 *   elements.
 */

public org.w3c.dom.Attr setAttributeNode(org.w3c.dom.Attr newAttr) throws org.w3c.dom.DOMException;

/**
 * Removes the specified attribute node. If a default value for the
 * removed <code>Attr</code> node is defined in the DTD, a new node
 * immediately appears with the default value as well as the
 * corresponding namespace URI, local name, and prefix when applicable.
 * The implementation may handle default values from other schemas
 * similarly but applications should use
 * <code>Document.normalizeDocument()</code> to guarantee this
 * information is up-to-date.
 * @param oldAttr The <code>Attr</code> node to remove from the attribute
 *   list.
 * @return The <code>Attr</code> node that was removed.
 * @exception org.w3c.dom.DOMException
 *   NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
 *   <br>NOT_FOUND_ERR: Raised if <code>oldAttr</code> is not an attribute
 *   of the element.
 */

public org.w3c.dom.Attr removeAttributeNode(org.w3c.dom.Attr oldAttr) throws org.w3c.dom.DOMException;

/**
 * Returns a <code>NodeList</code> of all descendant <code>Elements</code>
 * with a given tag name, in document order.
 * @param name The name of the tag to match on. The special value "*"
 *   matches all tags.
 * @return A list of matching <code>Element</code> nodes.
 */

public org.w3c.dom.NodeList getElementsByTagName(java.lang.String name);

/**
 * Retrieves an attribute value by local name and namespace URI.
 * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
 * , applications must use the value <code>null</code> as the
 * <code>namespaceURI</code> parameter for methods if they wish to have
 * no namespace.
 * @param namespaceURI The namespace URI of the attribute to retrieve.
 * @param localName The local name of the attribute to retrieve.
 * @return The <code>Attr</code> value as a string, or the empty string
 *   if that attribute does not have a specified or default value.
 * @exception org.w3c.dom.DOMException
 *   NOT_SUPPORTED_ERR: May be raised if the implementation does not
 *   support the feature <code>"XML"</code> and the language exposed
 *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]).
 * @since DOM Level 2
 */

public java.lang.String getAttributeNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;

/**
 * Adds a new attribute. If an attribute with the same local name and
 * namespace URI is already present on the element, its prefix is
 * changed to be the prefix part of the <code>qualifiedName</code>, and
 * its value is changed to be the <code>value</code> parameter. This
 * value is a simple string; it is not parsed as it is being set. So any
 * markup (such as syntax to be recognized as an entity reference) is
 * treated as literal text, and needs to be appropriately escaped by the
 * implementation when it is written out. In order to assign an
 * attribute value that contains entity references, the user must create
 * an <code>Attr</code> node plus any <code>Text</code> and
 * <code>EntityReference</code> nodes, build the appropriate subtree,
 * and use <code>setAttributeNodeNS</code> or
 * <code>setAttributeNode</code> to assign it as the value of an
 * attribute.
 * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
 * , applications must use the value <code>null</code> as the
 * <code>namespaceURI</code> parameter for methods if they wish to have
 * no namespace.
 * @param namespaceURI The namespace URI of the attribute to create or
 *   alter.
 * @param qualifiedName The qualified name of the attribute to create or
 *   alter.
 * @param value The value to set in string form.
 * @exception org.w3c.dom.DOMException
 *   INVALID_CHARACTER_ERR: Raised if the specified qualified name is not
 *   an XML name according to the XML version in use specified in the
 *   <code>Document.xmlVersion</code> attribute.
 *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
 *   <br>NAMESPACE_ERR: Raised if the <code>qualifiedName</code> is
 *   malformed per the Namespaces in XML specification, if the
 *   <code>qualifiedName</code> has a prefix and the
 *   <code>namespaceURI</code> is <code>null</code>, if the
 *   <code>qualifiedName</code> has a prefix that is "xml" and the
 *   <code>namespaceURI</code> is different from "<a href='http://www.w3.org/XML/1998/namespace'>
 *   http://www.w3.org/XML/1998/namespace</a>", if the <code>qualifiedName</code> or its prefix is "xmlns" and the
 *   <code>namespaceURI</code> is different from "<a href='http://www.w3.org/2000/xmlns/'>http://www.w3.org/2000/xmlns/</a>", or if the <code>namespaceURI</code> is "<a href='http://www.w3.org/2000/xmlns/'>http://www.w3.org/2000/xmlns/</a>" and neither the <code>qualifiedName</code> nor its prefix is "xmlns".
 *   <br>NOT_SUPPORTED_ERR: May be raised if the implementation does not
 *   support the feature <code>"XML"</code> and the language exposed
 *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]).
 * @since DOM Level 2
 */

public void setAttributeNS(java.lang.String namespaceURI, java.lang.String qualifiedName, java.lang.String value) throws org.w3c.dom.DOMException;

/**
 * Removes an attribute by local name and namespace URI. If a default
 * value for the removed attribute is defined in the DTD, a new
 * attribute immediately appears with the default value as well as the
 * corresponding namespace URI, local name, and prefix when applicable.
 * The implementation may handle default values from other schemas
 * similarly but applications should use
 * <code>Document.normalizeDocument()</code> to guarantee this
 * information is up-to-date.
 * <br>If no attribute with this local name and namespace URI is found,
 * this method has no effect.
 * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
 * , applications must use the value <code>null</code> as the
 * <code>namespaceURI</code> parameter for methods if they wish to have
 * no namespace.
 * @param namespaceURI The namespace URI of the attribute to remove.
 * @param localName The local name of the attribute to remove.
 * @exception org.w3c.dom.DOMException
 *   NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
 *   <br>NOT_SUPPORTED_ERR: May be raised if the implementation does not
 *   support the feature <code>"XML"</code> and the language exposed
 *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]).
 * @since DOM Level 2
 */

public void removeAttributeNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;

/**
 * Retrieves an <code>Attr</code> node by local name and namespace URI.
 * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
 * , applications must use the value <code>null</code> as the
 * <code>namespaceURI</code> parameter for methods if they wish to have
 * no namespace.
 * @param namespaceURI The namespace URI of the attribute to retrieve.
 * @param localName The local name of the attribute to retrieve.
 * @return The <code>Attr</code> node with the specified attribute local
 *   name and namespace URI or <code>null</code> if there is no such
 *   attribute.
 * @exception org.w3c.dom.DOMException
 *   NOT_SUPPORTED_ERR: May be raised if the implementation does not
 *   support the feature <code>"XML"</code> and the language exposed
 *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]).
 * @since DOM Level 2
 */

public org.w3c.dom.Attr getAttributeNodeNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;

/**
 * Adds a new attribute. If an attribute with that local name and that
 * namespace URI is already present in the element, it is replaced by
 * the new one. Replacing an attribute node by itself has no effect.
 * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
 * , applications must use the value <code>null</code> as the
 * <code>namespaceURI</code> parameter for methods if they wish to have
 * no namespace.
 * @param newAttr The <code>Attr</code> node to add to the attribute list.
 * @return If the <code>newAttr</code> attribute replaces an existing
 *   attribute with the same local name and namespace URI, the replaced
 *   <code>Attr</code> node is returned, otherwise <code>null</code> is
 *   returned.
 * @exception org.w3c.dom.DOMException
 *   WRONG_DOCUMENT_ERR: Raised if <code>newAttr</code> was created from a
 *   different document than the one that created the element.
 *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
 *   <br>INUSE_ATTRIBUTE_ERR: Raised if <code>newAttr</code> is already an
 *   attribute of another <code>Element</code> object. The DOM user must
 *   explicitly clone <code>Attr</code> nodes to re-use them in other
 *   elements.
 *   <br>NOT_SUPPORTED_ERR: May be raised if the implementation does not
 *   support the feature <code>"XML"</code> and the language exposed
 *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]).
 * @since DOM Level 2
 */

public org.w3c.dom.Attr setAttributeNodeNS(org.w3c.dom.Attr newAttr) throws org.w3c.dom.DOMException;

/**
 * Returns a <code>NodeList</code> of all the descendant
 * <code>Elements</code> with a given local name and namespace URI in
 * document order.
 * @param namespaceURI The namespace URI of the elements to match on. The
 *   special value "*" matches all namespaces.
 * @param localName The local name of the elements to match on. The
 *   special value "*" matches all local names.
 * @return A new <code>NodeList</code> object containing all the matched
 *   <code>Elements</code>.
 * @exception org.w3c.dom.DOMException
 *   NOT_SUPPORTED_ERR: May be raised if the implementation does not
 *   support the feature <code>"XML"</code> and the language exposed
 *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]).
 * @since DOM Level 2
 */

public org.w3c.dom.NodeList getElementsByTagNameNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;

/**
 * Returns <code>true</code> when an attribute with a given name is
 * specified on this element or has a default value, <code>false</code>
 * otherwise.
 * @param name The name of the attribute to look for.
 * @return <code>true</code> if an attribute with the given name is
 *   specified on this element or has a default value, <code>false</code>
 *    otherwise.
 * @since DOM Level 2
 */

public boolean hasAttribute(java.lang.String name);

/**
 * Returns <code>true</code> when an attribute with a given local name and
 * namespace URI is specified on this element or has a default value,
 * <code>false</code> otherwise.
 * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
 * , applications must use the value <code>null</code> as the
 * <code>namespaceURI</code> parameter for methods if they wish to have
 * no namespace.
 * @param namespaceURI The namespace URI of the attribute to look for.
 * @param localName The local name of the attribute to look for.
 * @return <code>true</code> if an attribute with the given local name
 *   and namespace URI is specified or has a default value on this
 *   element, <code>false</code> otherwise.
 * @exception org.w3c.dom.DOMException
 *   NOT_SUPPORTED_ERR: May be raised if the implementation does not
 *   support the feature <code>"XML"</code> and the language exposed
 *   through the Document does not support XML Namespaces (such as [<a href='http://www.w3.org/TR/1999/REC-html401-19991224/'>HTML 4.01</a>]).
 * @since DOM Level 2
 */

public boolean hasAttributeNS(java.lang.String namespaceURI, java.lang.String localName) throws org.w3c.dom.DOMException;

/**
 *  The type information associated with this element.
 * @since DOM Level 3
 */

public org.w3c.dom.TypeInfo getSchemaTypeInfo();

/**
 *  If the parameter <code>isId</code> is <code>true</code>, this method
 * declares the specified attribute to be a user-determined ID attribute
 * . This affects the value of <code>Attr.isId</code> and the behavior
 * of <code>Document.getElementById</code>, but does not change any
 * schema that may be in use, in particular this does not affect the
 * <code>Attr.schemaTypeInfo</code> of the specified <code>Attr</code>
 * node. Use the value <code>false</code> for the parameter
 * <code>isId</code> to undeclare an attribute for being a
 * user-determined ID attribute.
 * <br> To specify an attribute by local name and namespace URI, use the
 * <code>setIdAttributeNS</code> method.
 * @param name The name of the attribute.
 * @param isId Whether the attribute is a of type ID.
 * @exception org.w3c.dom.DOMException
 *   NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
 *   <br>NOT_FOUND_ERR: Raised if the specified node is not an attribute
 *   of this element.
 * @since DOM Level 3
 */

public void setIdAttribute(java.lang.String name, boolean isId) throws org.w3c.dom.DOMException;

/**
 *  If the parameter <code>isId</code> is <code>true</code>, this method
 * declares the specified attribute to be a user-determined ID attribute
 * . This affects the value of <code>Attr.isId</code> and the behavior
 * of <code>Document.getElementById</code>, but does not change any
 * schema that may be in use, in particular this does not affect the
 * <code>Attr.schemaTypeInfo</code> of the specified <code>Attr</code>
 * node. Use the value <code>false</code> for the parameter
 * <code>isId</code> to undeclare an attribute for being a
 * user-determined ID attribute.
 * @param namespaceURI The namespace URI of the attribute.
 * @param localName The local name of the attribute.
 * @param isId Whether the attribute is a of type ID.
 * @exception org.w3c.dom.DOMException
 *   NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
 *   <br>NOT_FOUND_ERR: Raised if the specified node is not an attribute
 *   of this element.
 * @since DOM Level 3
 */

public void setIdAttributeNS(java.lang.String namespaceURI, java.lang.String localName, boolean isId) throws org.w3c.dom.DOMException;

/**
 *  If the parameter <code>isId</code> is <code>true</code>, this method
 * declares the specified attribute to be a user-determined ID attribute
 * . This affects the value of <code>Attr.isId</code> and the behavior
 * of <code>Document.getElementById</code>, but does not change any
 * schema that may be in use, in particular this does not affect the
 * <code>Attr.schemaTypeInfo</code> of the specified <code>Attr</code>
 * node. Use the value <code>false</code> for the parameter
 * <code>isId</code> to undeclare an attribute for being a
 * user-determined ID attribute.
 * @param idAttr The attribute node.
 * @param isId Whether the attribute is a of type ID.
 * @exception org.w3c.dom.DOMException
 *   NO_MODIFICATION_ALLOWED_ERR: Raised if this node is readonly.
 *   <br>NOT_FOUND_ERR: Raised if the specified node is not an attribute
 *   of this element.
 * @since DOM Level 3
 */

public void setIdAttributeNode(org.w3c.dom.Attr idAttr, boolean isId) throws org.w3c.dom.DOMException;
}
