package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelDetailsPage extends GenericWrappers{
	
	public NewWindowHotelBookingPage clickHotel() {
		clickByXpath(prop.getProperty("HotelDetailsPage.clickHotel.xpath"));
		return new NewWindowHotelBookingPage();
	}
	public   HotelDetailsPage  waiting(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return new  HotelDetailsPage ();

	}

}
