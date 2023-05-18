package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookCoachPage extends GenericWrappers {
	
	public FTRRegistrationPage signUP() {
		
		clickByXpath(prop.getProperty("BookCoachPage.signup.xpath"));
		return new FTRRegistrationPage();
	}

}
