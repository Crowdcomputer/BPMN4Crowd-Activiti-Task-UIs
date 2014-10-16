package org.crowdcomputer.ui.tactic;

import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.PropertyItems;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.impl.tactic.RewardGive")
@Help(displayHelpShort = "Give this reward", displayHelpLong = "Give this reward")
public class RewardGive extends AbstractCustomServiceTask {

	// Long process: taken from variable
	// String title: taken from task def


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
		return "Reward give";
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
