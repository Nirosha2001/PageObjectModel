package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.page.HomePage;
import utils.ProjectWrappers;

public class TC012 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		
		testcaseName="TC012";
		testCaseDescription="To verify registration for new user";
		author="Nirosha";
		category="smoke";
		sheetname="TC0012";
		browsername="chrome";
		url="https://www.facebook.com";
		
	}
	@Test(dataProvider="fetchData")
	public void facebook(String firstName,String lastName,String emailID,String confirmationEmailId,String password,String date,String month,String dob_year) {
		
		new HomePage()
		.clickCreateAccount()
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.enterEmail(emailID)
		.enterConfirmEmail(confirmationEmailId)
		.enterPassword(password)
		.selectDay(date)
		.selectMonth(month)
		.selectYear(dob_year)
		.clickGenderMale();
		
	}

}
