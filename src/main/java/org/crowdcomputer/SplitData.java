package org.crowdcomputer;

import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.PropertyItems;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.SplitData")
@Help(displayHelpShort = "Creates a new Merge Data Task", displayHelpLong = "Creates a new Merge Data Task")
public class SplitData extends AbstractCustomServiceTask {

	// Long process: taken from variable
	// String title: taken from task def
	
	@Property(type = PropertyType.RADIO_CHOICE, displayName = "Operation", required = true)
	@Help(displayHelpShort = "Operation to use for the split", displayHelpLong = "Operation to use for the split")
	@PropertyItems({ "Split in set of N", "SplitN", "Split in set of N with M overlapp", "SplitNM", "Combination", "combination"})
	private String operation;
	
	@Property(type = PropertyType.TEXT, displayName = "N", required = true)
	@Help(displayHelpShort = "N", displayHelpLong = "N")
	private String n;
	
	@Property(type = PropertyType.TEXT, displayName = "M", required = false)
	@Help(displayHelpShort = "M", displayHelpLong = "M")
	private String m;
	
	@Override
	public String getName() {
		return "Split Data Task";
	}
	
	@Override
	public String getSmallIconPath() {
		// This is the icon of the component
		// remember that it is mandatory to provide one.
		return "icons/splitdata.png";
	}
@Override
  public String contributeToPaletteDrawer() {
    return "CrowdComputer";
  }



}
