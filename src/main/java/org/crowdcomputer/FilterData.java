package org.crowdcomputer;
import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.FilterData")
@Help(displayHelpShort = "Creates a new Filter Data Task", displayHelpLong = "Creates a new Filter Data Task")
public class FilterData extends AbstractCustomServiceTask {

	@Property(type = PropertyType.TEXT, displayName = "Field", required = true)
	@Help(displayHelpShort = "Field", displayHelpLong = "Field")
	private String field;
	
	@Property(type = PropertyType.TEXT, displayName = "Operator", required = true)
	@Help(displayHelpShort = "Operator", displayHelpLong = "Operator (==,!=,<,>)")
	private String operator;
	
	@Property(type = PropertyType.TEXT, displayName = "Value", required = true)
	@Help(displayHelpShort = "Value", displayHelpLong = "Value")
	private String value;
	
	@Override
	public String getName() {
		return "Filter Data Task";
	}
	
	@Override
	public String getSmallIconPath() {
		// This is the icon of the component
		// remember that it is mandatory to provide one.
		return "icons/filter.png";
	}
	
	@Override
	  public String contributeToPaletteDrawer() {
	    return "CrowdComputer";
	  }



}
