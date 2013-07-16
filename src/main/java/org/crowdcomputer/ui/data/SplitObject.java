package org.crowdcomputer.ui.data;
import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.impl.data.SplitObject")
@Help(displayHelpShort = "Creates a new Split Object Task", displayHelpLong = "Creates a new Split Object Task")
public class SplitObject extends AbstractCustomServiceTask {

	@Property(type = PropertyType.TEXT, displayName = "Shared fields (separated by comma)", required = true)
	@Help(displayHelpShort = "Shared fields that will be placed in both objects, separated by commas", displayHelpLong = "")
	private String shared;
	
	@Property(type = PropertyType.TEXT, displayName = "First object fields (separated by comma)", required = true)
	@Help(displayHelpShort = "Fields for the first objects (second will take the remaining)", displayHelpLong = "")
	private String field;
	
	@Property(type = PropertyType.TEXT, displayName = "Input data name", required =  true, defaultValue="data")
//	@Help(displayHelpShort = "Input data names (separated by commas)", displayHelpLong = "Input data names")
	private String input;
	
	@Property(type = PropertyType.TEXT, displayName = "2 output data names (separated by a comma)", required =  true, defaultValue="data")
//	@Help(displayHelpShort = "Input data name", displayHelpLong = "Input data name")
	private String output;
	
	@Override
	public String getName() {
		return "Split Object Task";
	}
	
	@Override
	public String getSmallIconPath() {
		return "icons/splitobject.png";
	}
	
	@Override
	  public String contributeToPaletteDrawer() {
	    return "BPMN4Crowd Data";

	  }



}
