package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import utils.ProjectWrappers;

public class TC011 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testcaseName="TC011";
		testCaseDescription="To BookHotel for guest user";
		author="Nirosha";
		category="smoke";
		sheetname="TC0011";
		browsername="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		
	}
	@Test(dataProvider="fetchData")
	
	public void bookHotel(String email,String mobile,String place,String numroom,String numadult,String title,String firstname,String lastname,String country,String state,String gst,String gstnumber,String companyname,String companyaddress,String verifytext) {
		
		new HomePage()
		.mouseOverOnHolidays()
        .mouseOverOnStays()
		.mouseOverOnLounge()
		.switchWindow()
		.clickHotelIcon()
		.switchWindow()
		.login()
		.clickGuestUser()
		.enterEmail(email)
		.enterMobileNum(mobile)
		.clickLoginButton()
		.waiting(7000)
		//.clickHotel()
		.enterHotelName(place)
		.waiting(5000)
		.clickHotelName()
		.clickCheckInDate()
		.clickOnDate()
		.clickInYear()
		.clickInMonth()
		.clickInDate()
		.clickCheckOutDate()
		.clickOnDate()
		.clickOutYear()
		.clickOutMonth()
		.clickOutDate()
		.clickNumberOfGuest()
		.selectNumberOfRooms(numroom)
		.selectNumberOfAdults(numadult)
		.clickDone()
		.clickFindHotel()
		.waiting(5000)
		.clickHotel()
		.switchWindow()
		.getHotelName()
		.getHotelRate()
		.clickBookButton()
		.selectTitle(title)
		.enterFirstName(firstname)
		.enterLatName(lastname)
		.selectCountry(country)
		.selectState(state)
		.selectGst(gst)
		.enterGstNum(gstnumber)
		.enterGstCompanyName(companyname)
		.enterGstCompanyAddress(companyaddress)
		.clickContinue()
		.verifyGstNumber(verifytext);
		
	}

}
