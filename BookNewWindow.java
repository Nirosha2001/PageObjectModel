package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookNewWindow extends GenericWrappers{
	
	public BookCoachPage bookSwitchToWindow() {
		switchToLastWindow();
		return new BookCoachPage();
	}

}
