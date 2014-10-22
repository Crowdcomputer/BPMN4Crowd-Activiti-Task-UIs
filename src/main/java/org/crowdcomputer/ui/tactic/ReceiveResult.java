package org.crowdcomputer.ui.tactic;

import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.impl.tactic.ReceiveResult")
@Help(displayHelpShort = "Receive Result", displayHelpLong = "Receive Result")
public class ReceiveResult extends AbstractCustomServiceTask {


	@Override
	public String getName() {
		return "ReceiveResult";
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
