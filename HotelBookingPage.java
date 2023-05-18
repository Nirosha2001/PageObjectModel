package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelBookingPage extends GenericWrappers {
	
	public static String hotelName = "";
	public static String hotelrate="";
	
	public HotelBookingPage getHotelName() {
		hotelName = getTextByXpath(prop.getProperty("HotelBookingPage.getHotelName.xpath"));
		return this;
	}
	public HotelBookingPage getHotelRate() {
		hotelrate = getTextByXpath(prop.getProperty("HotelBookingPage.getHotelRate.xpath"));
		return this;
	}
	public UserDetailsPage clickBookButton() {
		clickByXpathNoSnap(prop.getProperty("HotelBookingPage.clickBookButton.xpath"));
		return new UserDetailsPage();
	}


}
