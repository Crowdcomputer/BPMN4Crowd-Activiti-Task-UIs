package org.crowdcomputer;
import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.SplitObjectTask")
@Help(displayHelpShort = "Creates a new Split Object Task", displayHelpLong = "Creates a new Split Object Task")
public class SplitObjectTask extends AbstractCustomServiceTask {

	@Property(type = PropertyType.TEXT, displayName = "Shared fields", required = true)
	@Help(displayHelpShort = "Shared fields that will be placed in both objects, separated by commas", displayHelpLong = "")
	private String shared;
	
	@Property(type = PropertyType.TEXT, displayName = "First object fields", required = true)
	@Help(displayHelpShort = "Fields for the first objects (second will take the remaining)", displayHelpLong = "")
	private String field;
	
	@Override
	public String getName() {
		return "Split Object Task";
	}
	
	@Override
	public String getSmallIconPath() {
		// This is the icon of the component
		// remember that it is mandatory to provide one.
		return "icons/splitobject.png";
	}
	
	@Override
	  public String contributeToPaletteDrawer() {
	    return "CrowdComputer";
	  }



}
