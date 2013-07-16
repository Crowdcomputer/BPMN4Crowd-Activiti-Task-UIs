package org.crowdcomputer.ui.internal;

import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.impl.internal.ValidationTask")
@Help(displayHelpShort = "Set validation of the work", displayHelpLong = "Set validation of the work")
public class ValidationTask extends AbstractCustomServiceTask {

	@Property(type = PropertyType.BOOLEAN_CHOICE, displayName = "Work Valid", defaultValue = "true")
	// @Help(displayHelpShort = "Output data name", displayHelpLong =
	// "Output data name")
	private String validation;

	@Override
	public String getName() {
		return "Validation Task";
	}

	@Override
	public String getSmallIconPath() {
		// This is the icon of the component
		// remember that it is mandatory to provide one.
		return "icons/validate.png";
	}

	@Override
	public String contributeToPaletteDrawer() {
		return "BPMN4Crowd Internal Tasks";
	}
}
