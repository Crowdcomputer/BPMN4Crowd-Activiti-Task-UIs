package org.crowdcomputer.ui.data;
import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.impl.data.MergeData")
@Help(displayHelpShort = "Creates a new Merge Data Task", displayHelpLong = "Creates a new Merge Data Task")
public class MergeData extends AbstractCustomServiceTask {

//	@Property(type = PropertyType.TEXT, displayName = "Shared field", required = true)
//	@Help(displayHelpShort = "Shared field among the objects of the data", displayHelpLong = "This field has to be present in all the objects of the dataset and it's used to performe the merge", defaultValue="")
//	private String field;
//	
	@Property(type = PropertyType.TEXT, displayName = "Input data name", required =  true, defaultValue="data")
//	@Help(displayHelpShort = "Input data names (separated by commas)", displayHelpLong = "Input data names")
	private String input;
	
	@Property(type = PropertyType.TEXT, displayName = "Output data name", required =  true, defaultValue="data")
//	@Help(displayHelpShort = "Input data name", displayHelpLong = "Input data name")
	private String output;

	@Override
	public String getName() {
		return "Merge Data Task";
	}
	
	@Override
	public String getSmallIconPath() {
		// This is the icon of the component
		// remember that it is mandatory to provide one.
//		return "icons/crowd.png";

		return "icons/mergedata.png";
	}
	
	@Override
	  public String contributeToPaletteDrawer() {
	    return "BPMN4Crowd Data";
	  }



}
