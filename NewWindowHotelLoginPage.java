package pom.irctc.pages;

import wrappers.GenericWrappers;

public class NewWindowHotelLoginPage extends GenericWrappers {
	
	public hotelLoginPage switchWindow() {
		switchToLastWindow();
		return new hotelLoginPage();
	}

}