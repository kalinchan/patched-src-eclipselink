/*******************************************************************************
 * Copyright (c) 1998, 2007 Oracle. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0, which accompanies this distribution
 * and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Contributors:
 *     Oracle - initial API and implementation from Oracle TopLink
 ******************************************************************************/  
package org.eclipse.persistence.testing.oxm.mappings.anyobject.withoutgroupingelement;

import junit.textui.TestRunner;
import org.eclipse.persistence.oxm.XMLDescriptor;
import org.eclipse.persistence.oxm.XMLRoot;
import org.eclipse.persistence.oxm.mappings.XMLAnyObjectMapping;
import org.eclipse.persistence.oxm.schema.XMLSchemaClassPathReference;
import org.eclipse.persistence.sessions.Project;
import org.eclipse.persistence.testing.oxm.mappings.XMLMappingTestCases;

public class AnyObjectWithoutGroupingWithXMLRootSimpleTestCases extends XMLMappingTestCases {
    public AnyObjectWithoutGroupingWithXMLRootSimpleTestCases(String name) throws Exception {
        super(name);
        Project project = new AnyObjectWithoutGroupingElementProject();
        ((XMLAnyObjectMapping)((XMLDescriptor)project.getDescriptor(Root.class)).getMappingForAttributeName("any")).setUseXMLRoot(true);                      
        setProject(project);
        setControlDocument("org/eclipse/persistence/testing/oxm/mappings/anyobject/withoutgroupingelement/simple_xmlroot.xml");
    }

    public Object getControlObject() {
        Root root = new Root();

        XMLRoot xmlroot = new XMLRoot();        
        xmlroot.setObject("child's text");
        xmlroot.setLocalName("theXMLRoot");        

        root.setAny(xmlroot);
        return root;

    }

    public static void main(String[] args) {
        String[] arguments = { "-c", "org.eclipse.persistence.testing.oxm.mappings.anyobject.withoutgroupingelement.AnyObjectWithoutGroupingWithXMLRootSimpleTestCases" };
        TestRunner.main(arguments);
    }
}