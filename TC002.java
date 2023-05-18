package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import utils.ProjectWrappers;

public class TC002 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testcaseName="TC002";
		testCaseDescription="To verify Irctc registration for new user";
		author="Nirosha";
		category="smoke";
		sheetname="TC002";
		browsername="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		
	}
	@Test(dataProvider="fetchData")
	
	public void irctcRegistration(String username,String password,String confirmpassword,String language,String question,String secans,String firstname,String middlename,String lastname,String occupation,String month,String year,String country,String email,String mobile,String nationality,String address1,String address2,String address3,String pincode,String state,String district,String post,String resphone,String offaddres1,String offadress2,String offadress3,String offpincode,String offstate,String offdistrict,String offpost,String offphone ) {
		
	
		new HomePage()
		.clickOnRegister()
		.enterUserName(username)
		.enterUserPassword(password)
		.enterConfirmPassword(confirmpassword)
		.ClickLanguage()
		.selectClickLanguage(language)
		.clickSecurityQuestion()
		.selectSecurityQuestion(question)
		.enterSecAns(secans)
		.clickContinue()
		.enterFirstName(firstname)
		.enterMiddleName(middlename)
		.enterLastName(lastname)
		.clickOccupation()
		.selectOccupation(occupation)
		.clickDob()
		.selectMonth(month)
		.selectYear(year)
		.clickDay()
		.clickMartialStatusUnmarried()
		.selectCountry(country)
		.clickGenderMale()
		.enterEmail(email)
		.enterphone(resphone)
		.selectNationality(nationality)
		.clickContinueTwo()
		.enterflatno(address1)
		.enterStreet(address2)
		.enterArea(address3)
		.enterPincode(pincode)
		.enterState(state)
		.selectCity(district)
		.selectPostOff(post)
		.enterMobile(mobile)
		.clickCopyResdentialNo()
		.enteroffflatno(offaddres1)
		.enteroffStreet(offadress2)
		.enteroffArea(offadress3)
		.clickoffnation()
		.selectnationoff()
		.enteroffPincode(offpincode)
		.enteroffState(offstate)
		.enterOffCity(offdistrict)
		.enterPostOff(offpost)
		.enteroffMobile(offphone);
		
	}

}
