package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelPage extends GenericWrappers{
	
	public NewWindowHotelLoginPage clickHotelIcon() {
		clickByXpathNoSnap(prop.getProperty("HotelPage.clickHotelIcon.xpath"));
		return new NewWindowHotelLoginPage();
	}

}
