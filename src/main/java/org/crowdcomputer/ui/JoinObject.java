package org.crowdcomputer.ui;
import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.JoinObject")
@Help(displayHelpShort = "Creates a new Join Object Task", displayHelpLong = "Creates a new Join Object Task")
public class JoinObject extends AbstractCustomServiceTask {

	@Property(type = PropertyType.TEXT, displayName = "Shared field", required = true)
	@Help(displayHelpShort = "Shared field among the objects", displayHelpLong = "This field is used to merge two objects")
	private String field;
	

	@Override
	public String getName() {
		return "Join Object Task";
	}
	
	@Override
	public String getSmallIconPath() {
		// This is the icon of the component
		// remember that it is mandatory to provide one.
		return "icons/joinobject.png";
	}
	
	@Override
	  public String contributeToPaletteDrawer() {
	    return "CrowdComputer";
	  }



}
