package org.crowdcomputer.ui.task;

import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.PropertyItems;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.impl.task.MachineTask")
@Help(displayHelpShort = "Creates a new Machine Task", displayHelpLong = "Creates a new Machine Task")
public class MachineTask extends AbstractCustomServiceTask{
	
	@Property(type = PropertyType.TEXT, displayName = "Service URL", required = true)
	@Help(displayHelpShort = "Service URL", displayHelpLong = "Service URL")
	private String service_url;

	@Property(type = PropertyType.RADIO_CHOICE, displayName = "Method", required = true)
	@Help(displayHelpShort = "HTTP method to use ", displayHelpLong = "HTTP method to use")
	@PropertyItems({ "GET", "GET", "POST", "POST", "PUT", "PUT" })
	private String method;

	@Property(type = PropertyType.TEXT, displayName = "Input data name", required = true, defaultValue = "data")
	@Help(displayHelpShort = "Input data name", displayHelpLong = "Input data name")
	private String input;

	@Property(type = PropertyType.TEXT, displayName = "Output data name", required = true, defaultValue = "data")
	@Help(displayHelpShort = "Output data name", displayHelpLong = "Output data name")
	private String output;

	@Override
	public String getName() {
		return "Machine Task";
	}

	@Override
	public String getSmallIconPath() {
		// This is the icon of the component
		// remember that it is mandatory to provide one.
		return "icons/machine.png";
	}

	@Override
	public String contributeToPaletteDrawer() {
		return "BPMN4Crowd Crowd Tasks";
	}

}
