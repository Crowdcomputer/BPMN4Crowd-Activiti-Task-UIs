package org.crowdcomputer.ui.data;

import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.impl.data.JoinObject")
@Help(displayHelpShort = "Creates a new Join Object Task", displayHelpLong = "Creates a new Join Object Task")
public class JoinObject extends AbstractCustomServiceTask {

	@Property(type = PropertyType.TEXT, displayName = "Shared field", required = true)
	// @Help(displayHelpShort = "Shared field among the objects",
	// displayHelpLong = "This field is used to merge two objects")
	private String field;

	@Property(type = PropertyType.TEXT, displayName = "Input data names (separated by commas)", required = true)
	// @Help(displayHelpShort = "Input data names (separated by commas)",
	// displayHelpLong = "Input data names")
	private String input;

	@Property(type = PropertyType.TEXT, displayName = "Output data name", required = true, defaultValue = "data")
	// @Help(displayHelpShort = "Input data name", displayHelpLong =
	// "Input data name")
	private String output;

	@Override
	public String getName() {
		return "Join Object Task";
	}

	@Override
	public String getSmallIconPath() {
		// This is the icon of the component
		// remember that it is mandatory to provide one.
		// return "icons/crowd.png";

		return "icons/joinobject.png";
	}

	@Override
	public String contributeToPaletteDrawer() {
	    return "BPMN4Crowd Data";
	}

}
