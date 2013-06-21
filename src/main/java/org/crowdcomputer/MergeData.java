package org.crowdcomputer;
import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.MergeData")
@Help(displayHelpShort = "Creates a new Merge Data Task", displayHelpLong = "Creates a new Merge Data Task")
public class MergeData extends AbstractCustomServiceTask {

	@Property(type = PropertyType.TEXT, displayName = "Shared field", required = true)
	@Help(displayHelpShort = "Shared field among the objects of the data", displayHelpLong = "This field has to be present in all the objects of the dataset and it's used to performe the merge")
	private String field;
	

	@Override
	public String getName() {
		return "Merge Data Task";
	}
	
	@Override
	public String getSmallIconPath() {
		// This is the icon of the component
		// remember that it is mandatory to provide one.
		return "icons/mergedata.png";
	}
	
	@Override
	  public String contributeToPaletteDrawer() {
	    return "CrowdComputer";
	  }



}
