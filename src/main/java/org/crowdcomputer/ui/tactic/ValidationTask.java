package org.crowdcomputer.ui.tactic;

import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.impl.tactic.ValidationTask")
@Help(displayHelpShort = "Set validation of the work", displayHelpLong = "Set validation of the work")
public class ValidationTask extends AbstractCustomServiceTask {

	@Property(type = PropertyType.TEXT, displayName = "Work Valid")
	 @Help(displayHelpShort = "Validation value", displayHelpLong ="if empty will load data from input field")
	private String validation_process;

    @Property(type = PropertyType.TEXT, displayName = "Input data name", required =  true, defaultValue="data")
    @Help(displayHelpShort = "Input data name", displayHelpLong = "Input data name")
    private String input;

    @Property(type = PropertyType.TEXT, displayName = "Output data name", required =  true, defaultValue="data")
    @Help(displayHelpShort = "Output data name", displayHelpLong = "Output data name")
    private String output;

    @Property(type = PropertyType.TEXT, displayName = "Input data execution variable name", required =  true, defaultValue="execution")
    @Help(displayHelpShort = "Input data execution variable name", displayHelpLong = "Input data variable name")
    private String input_execution;

    @Property(type = PropertyType.TEXT, displayName = "Ouput data execution variable name", required =  true, defaultValue="execution")
    @Help(displayHelpShort = "Output data execution variable name", displayHelpLong = "Output data execution variable name")
    private String output_execution;

	@Override
	public String getName() {
		return "Validation Process";
	}

	@Override
	public String getSmallIconPath() {
		// This is the icon of the component
		// remember that it is mandatory to provide one.
		return "icons/cc.png";
	}

	@Override
	public String contributeToPaletteDrawer() {
		return "BPMN4Crowd Quality Tasks";
	}
}
