package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers {
	
	public EnquiryFormPage clickOnEnquiryForm() {
		clickByXpath(prop.getProperty("CharterPage.clickOnEnquiryForm.xpath"));
		return new EnquiryFormPage();
	}

}
