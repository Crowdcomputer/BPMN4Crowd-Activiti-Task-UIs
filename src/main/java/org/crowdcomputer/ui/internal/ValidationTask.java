package org.crowdcomputer.ui.internal;


import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.impl.internal.ValidationTask")
@Help(displayHelpShort = "Set validation of the work", displayHelpLong = "Set validation of the work")
public class ValidationTask extends AbstractCustomServiceTask {

    @Property(type = PropertyType.TEXT, displayName = "Work Valid")
    @Help(displayHelpShort = "Validation value", displayHelpLong ="if empty will load data from input field")
    private String validation;

    @Property(type = PropertyType.TEXT, displayName = "Input data name to check for validation value", defaultValue = "data")
    @Help(displayHelpShort = "Input data name", displayHelpLong = "Input data name")
    private String input;

    @Override
    public String getName() {
        return "Quality Validate Task";
    }

    @Override
    public String getSmallIconPath() {
        // This is the icon of the component
        // remember that it is mandatory to provide one.
        return "icons/cc.png";
    }

    @Override
    public String contributeToPaletteDrawer() {
        return "BPMN4Crowd Tactic Internal Tasks";
    }
}
