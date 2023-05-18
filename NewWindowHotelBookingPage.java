package pom.irctc.pages;

import wrappers.GenericWrappers;

public class NewWindowHotelBookingPage extends GenericWrappers{
	
	public HotelBookingPage switchWindow() {
		switchToLastWindow();
		return new HotelBookingPage();
	}
	

}
