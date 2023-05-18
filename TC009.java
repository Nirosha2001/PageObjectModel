package pom.ssc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.ssc.pages.HomePage;
import utils.ProjectWrappers;

public class TC009 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		
		testcaseName="TC009";
		testCaseDescription="To verify ssc registration for new user";
		author="Nirosha";
		category="smoke";
		sheetname="TC009";
		browsername="chrome";
		url="https://ssc.nic.in/registration/home";
		
	}
	@Test(dataProvider="fetchData")
	public void sscRegister(String aadhar,String verifyaadhar,String name,String verifyname,String fathername,String verifyfather,String mother,String verifymother,String dob,String verifydob,String education,String verifyeducation,String rollno,String verifyrollno,String year,String verifyyear,String qualification,String mob,String verifymob,String email,String verifyemail,String state) {
		
		new HomePage()
		.clickAadharYes()
		.enterAadharNum(aadhar)
		.verifyAadharNum(verifyaadhar)
		.enterName(name)
		.verifyName(verifyname)
		.clickChangedNameNo()
		.enterFatherName(fathername)
		.verifyFatherName(verifyfather)
		.enterMotherName(mother)
		.verifyMotherName(verifymother)
		.enterDob(dob)
		.verifyDob(verifydob)
		.selectEducationBoard(education)
		.verifyEducationBoard(verifyeducation)
		.enterRollNo(rollno)
		.verifyRollNo(verifyrollno)
		.selectYearOfpassing(year)
		.verifyYearOfpassing(verifyyear)
		.clickGenderMale()
		.verifyGenderMale()
		.selectEducationLevel(qualification)
		.enterMob(mob)
		.verifyMob(verifymob)
		.enterEmail(email)
		.verifyEmail(verifyemail)
		.selectState(state);
	}

}
