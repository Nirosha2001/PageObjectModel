package pom.irctc.pages;

import wrappers.GenericWrappers;

public class hotelLoginPage extends GenericWrappers {
	
	public GuestUserLoginPage login() {
		clickByXpath(prop.getProperty("HotelLoginPage.login.xpath"));
		return new GuestUserLoginPage();
	}
	

}
