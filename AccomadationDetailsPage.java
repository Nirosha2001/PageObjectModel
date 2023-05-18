package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccomadationDetailsPage extends GenericWrappers {
	
	public AccomadationDetailsPage clickHotel() {
		clickByXpathNoSnap(prop.getProperty("AccomadationDetailsPage.hotel.xpath"));
		return this;
	}
	
	public AccomadationDetailsPage enterHotelName(String data) {
		enterByXpath(prop.getProperty("AccomadationDetailsPage.enterHotelName.xpath"), data);
		return this;
	}
	public AccomadationDetailsPage clickHotelName() {
		clickByXpath(prop.getProperty("AccomadationDetailsPage.clickHotelName.xpath"));
		return this;
	}
	
	public AccomadationDetailsPage clickCheckInDate() {
		clickByXpath(prop.getProperty("AccomadationDetailsPage.clickCheckInDate.xpath"));
		return this;
	}
	
	public AccomadationDetailsPage clickOnDate() {
		clickByXpath(prop.getProperty("AccomadationDetailsPage.clickOnDate.xpath"));
		return this;
	}
	
	public AccomadationDetailsPage clickInDate() {
		clickByXpath(prop.getProperty("AccomadationDetailsPage.clickInDate.xpath"));
		return this;
	}
	public AccomadationDetailsPage clickInYear() {
		clickByXpath(prop.getProperty("AccomadationDetailsPage.clickInYear.xpath"));
		return this;
	}
	public AccomadationDetailsPage clickInMonth() {
		clickByXpath(prop.getProperty("AccomadationDetailsPage.clickInMonth.xpath"));
		return this;
	}
	public AccomadationDetailsPage clickCheckOutDate() {
		clickByXpath(prop.getProperty("AccomadationDetailsPage.clickCheckOutDate.xpath"));
		return this;
	}
	public AccomadationDetailsPage clickOutDate() {
		clickByXpath(prop.getProperty("AccomadationDetailsPage.clickOutDate.xpath"));
		return this;
	}
	public AccomadationDetailsPage clickOutYear() {
		clickByXpath(prop.getProperty("AccomadationDetailsPage.clickOutYear.xpath"));
		return this;
	}
	public AccomadationDetailsPage clickOutMonth() {
		clickByXpath(prop.getProperty("AccomadationDetailsPage.clickOutMonth.xpath"));
		return this;
	}
	public AccomadationDetailsPage clickNumberOfGuest() {
		clickByXpath(prop.getProperty("AccomadationDetailsPage.clickNumberOfGuest.xpath"));
		return this;
	}
	public AccomadationDetailsPage selectNumberOfRooms(String data) {
		selectByXpathVisbleText(prop.getProperty("AccomadationDetailsPage.selectNumberOfRooms.xpath"),data);
		return this;
	}
	public AccomadationDetailsPage selectNumberOfAdults(String data) {
		selectByXpathVisbleText(prop.getProperty("AccomadationDetailsPage.selectNumberOfAdults.xpath"),data);
		return this;
	}
	public AccomadationDetailsPage selectNumberOfChildren(String data) {
		selectByXpathVisbleText(prop.getProperty("AccomadationDetailsPage.selectNumberOfChildren.xpath"),data);
		return this;
	}
	public AccomadationDetailsPage clickDone() {
		clickByXpath(prop.getProperty("AccomadationDetailsPage.clickDone.xpath"));
		return this;
	}
	public  AccomadationDetailsPage waiting(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return new AccomadationDetailsPage();

	}
	public HotelDetailsPage clickFindHotel() {
		clickByXpath(prop.getProperty("AccomadationDetailsPage.clickFindHotel.xpath"));
		return new HotelDetailsPage();
	}

}
