package pom.indianfrro.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.indianfrro.pages.HomePage;
import utils.ProjectWrappers;

public class TC006 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testcaseName="TC006";
		testCaseDescription="To verify IndianFrro registration for new user";
		author="Nirosha";
		category="smoke";
		sheetname="TC006";
		browsername="chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		
	}
	@Test(dataProvider="fetchData")
	
	public void indianFrro(String userid,String password,String confirmpassword,String seqqstn,String secans,String name,String gender,String dob,String designation,String emailid,String mobile,String phone,String nationality,String resname,String capacity,String address,String state,String district,String acctype,String star,String offemail,String offmobile,String offphone,String offname,String offaddress,String offstate,String offowneremail,String offownermobile){
		new HomePage()
		.clickOnSignUp()
		.enterUserId(userid)
		.enterUserPassword(password)
		.enterConfirmPassword(confirmpassword)
		.selectSecQstn(seqqstn)
		.enterSecAnswer(secans)
		.enterName(name)
		.selectGender(gender)
		.enterDob(dob)
		.enterDesignation(designation)
		.enteremailid(emailid)
		.enterMobileNumber(mobile)
		.enterPhoneNumber(phone)
		.selectNationality(nationality)
		.enterResidentialName(resname)
		.enterCapacity(capacity)
		.enterAddress(address)
		.selectState(state)
		.waiting(3000)
		.selectCity(district)
		.selectAccomadationType(acctype)
		.selectAccomadatinGrade(star)
		.enterResEmail(offemail)
		.enterResMob(offmobile)
		.enterResPhone(offphone)
		.enterOwnerName(offname)
		.enterOwnerAddress(offaddress)
		.selectOwnerState(offstate)
		.enterOwnerEmail(offowneremail)
		.enterOwnerPhone(offownermobile);
		
		
	}

}
