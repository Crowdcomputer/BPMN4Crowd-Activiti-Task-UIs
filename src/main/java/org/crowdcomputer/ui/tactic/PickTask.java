package org.crowdcomputer.ui.tactic;

import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.PropertyItems;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.impl.tactic.PickTask")
@Help(displayHelpShort = "PickTask", displayHelpLong = "PickTask")
public class PickTask extends AbstractCustomServiceTask {


	@Override
	public String getName() {
		return "PickTask";
	}
	
	@Override
	public String getSmallIconPath() {
		// This is the icon of the component
		// remember that it is mandatory to provide one.
		return "icons/cc.png";
	}

	@Override
	  public String contributeToPaletteDrawer() {
	    return "BPMN4Crowd Tactic Def Tasks";
	  }


}
