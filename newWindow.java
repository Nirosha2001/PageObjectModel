package pom.irctc.pages;

import wrappers.GenericWrappers;

public class newWindow extends GenericWrappers {
	
	public LoungePage switchTowindow() {
		switchToLastWindow();
		return new LoungePage();
	}

}
