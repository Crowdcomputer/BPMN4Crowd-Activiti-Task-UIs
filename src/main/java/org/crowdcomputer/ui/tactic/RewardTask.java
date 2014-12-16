package org.crowdcomputer.ui.tactic;

import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.PropertyItems;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.impl.tactic.RewardTask")
@Help(displayHelpShort = "Invoke the reward for the task", displayHelpLong = "Invoke the reward for the task")

public class RewardTask extends AbstractCustomServiceTask {

    @Property(type = PropertyType.RADIO_CHOICE, displayName = "Reward Strategy", required = true)
    @Help(displayHelpShort = "The maximum daily withdrawl amount ", displayHelpLong = "Choose the maximum daily amount that can be withdrawn from the account.")
    @PropertyItems({ "Pay ALL", "ALL", "Pay None", "NONE", "Pay Valid", "VALID","Best", "BEST"})
    private String reward_strategy;

    @Property(type = PropertyType.TEXT, displayName = "For PAY VALID specify the threshold", required =  true, defaultValue="50")
    @Help(displayHelpShort = "pays if validation >= threshold", displayHelpLong = "if validation >= of threshold then it's valid")
    private String threshold;

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
		return "Reward strategy";
	}

	@Override
	public String getSmallIconPath() {
		// This is the icon of the component
		// remember that it is mandatory to provide one.
		return "icons/cc.png";
	}

	@Override
	public String contributeToPaletteDrawer() {
		return "BPMN4Crowd Validation and Reward";
	}
}
