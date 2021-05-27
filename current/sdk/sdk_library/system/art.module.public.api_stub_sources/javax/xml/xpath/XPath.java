/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// $Id: XPath.java 569998 2007-08-27 04:40:02Z mrglavas $


package javax.xml.xpath;

@SuppressWarnings({"unchecked", "deprecation", "all"})
public interface XPath {

public void reset();

public void setXPathVariableResolver(javax.xml.xpath.XPathVariableResolver resolver);

public javax.xml.xpath.XPathVariableResolver getXPathVariableResolver();

public void setXPathFunctionResolver(javax.xml.xpath.XPathFunctionResolver resolver);

public javax.xml.xpath.XPathFunctionResolver getXPathFunctionResolver();

public void setNamespaceContext(javax.xml.namespace.NamespaceContext nsContext);

public javax.xml.namespace.NamespaceContext getNamespaceContext();

public javax.xml.xpath.XPathExpression compile(java.lang.String expression) throws javax.xml.xpath.XPathExpressionException;

public java.lang.Object evaluate(java.lang.String expression, java.lang.Object item, javax.xml.namespace.QName returnType) throws javax.xml.xpath.XPathExpressionException;

public java.lang.String evaluate(java.lang.String expression, java.lang.Object item) throws javax.xml.xpath.XPathExpressionException;

public java.lang.Object evaluate(java.lang.String expression, org.xml.sax.InputSource source, javax.xml.namespace.QName returnType) throws javax.xml.xpath.XPathExpressionException;

public java.lang.String evaluate(java.lang.String expression, org.xml.sax.InputSource source) throws javax.xml.xpath.XPathExpressionException;
}

