package pom.phptravel.testcases;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import pom.php.pages.PhpAccountPage;
import utils.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testcaseName="TC001";
		testCaseDescription="To verify PhpTravels registration for new user";
		author="Nirosha";
		category="smoke";
		sheetname="TC001";
		browsername="chrome";
		url="https://www.phptravels.org/register.php";
		
	}
	@Test(dataProvider="fetchData")
	
	public void phpTravels(String firstname,String lastname,String email,String phone,String companyname,String address1,String address2,String city,String state,String pincode,String country,String companyphone,String password,String confirmpassword) {
		 new PhpAccountPage()
		 .enterFirstName(firstname)
		 .enterLastName(lastname)
		 .enterEmail(email)
		 .clickPhoneCode()
		 .selectPhoneCode()
		 .enterPhone(phone)
		 .enterCompanyName(companyname)
		 .enterStreet(address1)
		 .enterStreet2(address2)
		 .enterCity(city)
		 .enterState(state)
		 .enterPostCode(pincode)
		 .selectCountry(country)
		 .enterMobile(companyphone)
		 .enterPassword(password)
		 .enterConfirmPassword(confirmpassword)
		 .GeneratePassword();
	
		 
		 
	}

}
