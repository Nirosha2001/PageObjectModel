package pom.irctc.pages;

import pom.ssc.pages.HomePage;
import wrappers.GenericWrappers;

public class NewWindowHotelPage extends GenericWrappers {
	
	public HotelPage switchWindow() {
		switchToLastWindow();
		return new HotelPage();
		
	}

}
