package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import utils.ProjectWrappers;


public class TC008 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testcaseName="TC008";
		testCaseDescription="To verify bookcoach for new user";
		author="Nirosha";
		category="smoke";
		sheetname="TC008";
		browsername="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		
	}

	@Test(dataProvider="fetchData")
	
	public void bookCoach(String userid,String password,String confirmpaswrd,String seqqstn,String secans,String month,String year,String email,String occupation,String firstname,String midlename,String lastname,String nationality,String flatno,String street,String area,String country,String mobile,String pincode,String offflat,String offstreet,String offarea,String offcountry,String offmobile,String offpincode) 
		 {
		
		new HomePage()
		.mouseOverOnHolidays()
		.mouseOverOnStays()
		.mouseOverLounge()
		.switchTowindow()
		.mouseHoverOnIcon()
		.mouseHoverOnBookCoach()
		.bookSwitchToWindow()
		.signUP()
		.enterUserId(userid)
		.enterUserPassword(password)
		.enterConfirmPassword(confirmpaswrd)
		.selectSecQstn(seqqstn)
		.enterSecAns(secans)
		.enterDateOfBirth()
		.selectMonth(month)
		.selectYear(year)
		.clickDate()
		.clickGenderMale()
		.clickMartialStatusUnmarried()
		.enterEmail(email)
		.selectOccupation(occupation)
		.enterFirstName(firstname)
		.enterMiddleName(midlename)
		.enterLastName(lastname)
		.selectNatinality(nationality)
		.enterFlatNo(flatno)
		.enterStreet(street)
		.enterArea(area)
		.selectNation(country)
		.enterMobile(mobile)
		.enterPincode(pincode)
		.clickNo()
		.enterFlatNoOffice(offflat)
		.enterStreetOffice(offstreet)
		.enterAreaOffice(offarea)
		.selectNationOffice(offcountry)
		.enterMobileOffice(offmobile)
		.enterPincodeOffice(offpincode);
		
		
		
	}

}
