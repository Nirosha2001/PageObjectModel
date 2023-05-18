package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import utils.ProjectWrappers;

public class TC007 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testcaseName="TC007";
		testCaseDescription="To verify salooncheck for user";
		author="Nirosha";
		category="smoke";
		sheetname="TC007";
		browsername="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		
	}

	@Test(dataProvider="fetchData")
	
	public void saloonCheck(String name,String organization,String address,String mobile,String email,String requestfor,String orginstation,String destination,String durationperiod,String coachdetails,String numpassenger,String numpassenger1,String charterpurpose,String service) {
		new HomePage()
		.mouseOverOnHolidays()
		.mouseOverOnStays()
		.mouseOverLounge()
		.switchTowindow()
		.mouseHoverOnIcon()
		.mouseHoverOnCharter()
	    .clickOnEnquiryForm()
		.enterName(name)
		.enterOrganisation(organization)
		.enterAdress(address)
		.enterMobile(mobile)
		.enterEmail(email)
		.selectRequest(requestfor)
	    .enterOrginStation(orginstation)
		.enterDestinStation(destination)
		.enterDepartureDay()
		.enterDepartureMonth()
		.enterDepartureDate()
		.waiting()
		.enterArrivalDay()
		.enterArrivalMonth()
		.enterArrivalDate()
		.enterDurationPeriod(durationperiod)
		.enterCoacDetails(coachdetails)
		.enterPassenger1(numpassenger)
		.enterPassenger2(numpassenger1)
		.enterChartPurpose(charterpurpose)
		.enterService(service);
		
	}
	
	
	

}
