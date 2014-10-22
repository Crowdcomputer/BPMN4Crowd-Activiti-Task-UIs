package org.crowdcomputer.ui.tactic;

import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.impl.tactic.RewardTask")
@Help(displayHelpShort = "Inovke the process for the reward", displayHelpLong = "Inovke the process for the reward")
public class RewardTask extends AbstractCustomServiceTask {

    @Property(type = PropertyType.TEXT, displayName = "Reward process")
    @Help(displayHelpShort = "Reward process file", displayHelpLong ="Reward process file")
    private String reward_process;

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
		return "Reward process";
	}

	@Override
	public String getSmallIconPath() {
		// This is the icon of the component
		// remember that it is mandatory to provide one.
		return "icons/cc.png";
	}

	@Override
	public String contributeToPaletteDrawer() {
		return "BPMN4Crowd Reward Tasks";
	}
}
