package org.crowdcomputer.ui.data;

import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.PropertyItems;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.impl.data.SplitData")
@Help(displayHelpShort = "Creates a new Merge Data Task", displayHelpLong = "Creates a new Merge Data Task")
public class SplitData extends AbstractCustomServiceTask {

	// Long process: taken from variable
	// String title: taken from task def

	@Property(type = PropertyType.RADIO_CHOICE, displayName = "Operation", required = true)
	@Help(displayHelpShort = "Operation to use for the split", displayHelpLong = "Operation to use for the split")
	@PropertyItems({ "Split in set of N", "SplitN",
			"Split in set of N with M overlapp", "SplitNM", "Combination",
			"combination" })
	private String operation;

	@Property(type = PropertyType.TEXT, displayName = "N", required = true)
	@Help(displayHelpShort = "N", displayHelpLong = "N")
	private String n;

	@Property(type = PropertyType.TEXT, displayName = "M", required = true, defaultValue = "0")
	@Help(displayHelpShort = "M", displayHelpLong = "M")
	private String m;

	@Property(type = PropertyType.TEXT, displayName = "Input data name", required = true, defaultValue = "data")
	// @Help(displayHelpShort = "Input data names (separated by commas)",
	// displayHelpLong = "Input data names")
	private String input;

	@Property(type = PropertyType.TEXT, displayName = "Output data name", required = true, defaultValue = "data")
	// @Help(displayHelpShort = "Input data name", displayHelpLong =
	// "Input data name")
	private String output;

	@Override
	public String getName() {
		return "Split Data Set Task";
	}

	@Override
	public String getSmallIconPath() {
		return "icons/splitdata.png";
	}

	@Override
	public String contributeToPaletteDrawer() {
	    return "BPMN4Crowd Data";
	}

}
