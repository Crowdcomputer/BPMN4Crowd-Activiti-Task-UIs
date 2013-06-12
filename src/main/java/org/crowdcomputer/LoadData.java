package org.crowdcomputer;

import org.activiti.designer.integration.servicetask.AbstractCustomServiceTask;
import org.activiti.designer.integration.servicetask.PropertyType;
import org.activiti.designer.integration.servicetask.annotation.Help;
import org.activiti.designer.integration.servicetask.annotation.Property;
import org.activiti.designer.integration.servicetask.annotation.Runtime;

@Runtime(javaDelegateClass = "org.crowdcomputer.LoadDataTask")
@Help(displayHelpShort = "Load Data Task", displayHelpLong = "Load Data Task")
public class LoadData extends AbstractCustomServiceTask {

	// Long process: taken from variable
	// String title: taken from task def

	// String page_url,
	@Property(type = PropertyType.TEXT, displayName = "Data URL", required = true)
	@Help(displayHelpShort = "Data URL", displayHelpLong = "Data URL")
	private String url;

	@Override
	public String getName() {
		return "Load Data Task";
	}

	@Override
	public String getSmallIconPath() {
		// This is the icon of the component
//		 remember that it is mandatory to provide one.
//		TODO: cambiare icona
		return "icons/splitdata.png";
	}

	@Override
	public String contributeToPaletteDrawer() {
		return "CrowdComputer";
	}

}
