package pom.indianfrro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import wrappers.GenericWrappers;

public class IndianFrroRegistrationPage extends GenericWrappers {

	public IndianFrroRegistrationPage enterUserId(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.userid.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterUserPassword(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.userpassword.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.confirmpassword.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage selectSecQstn(String data) {
	   selectByXpathVisbleText(prop.getProperty("IndianFrroRegistrationPage.seqqstn.xpath"),data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterSecAnswer(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.seqans.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterName(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.name.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage selectGender(String data) {
		selectByXpathVisbleText(prop.getProperty("IndianFrroRegistrationPage.gender.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterDob(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.dob.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterDesignation(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.designation.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enteremailid(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.emailid.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.mobile.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.phone.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage selectNationality(String data) {
		selectByXpathVisbleText(prop.getProperty("IndianFrroRegistrationPage.nationality.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterResidentialName(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.residentialname.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterCapacity(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.capacity.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterAddress(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.address.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage selectState(String data) {
		selectByXpathVisbleText(prop.getProperty("IndianFrroRegistrationPage.state.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage selectCity(String data) {
		selectByXpathVisbleText(prop.getProperty("IndianFrroRegistrationPage.city.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage selectAccomadationType(String data) {
		selectByXpathVisbleText(prop.getProperty("IndianFrroRegistrationPage.accomadationtype.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage selectAccomadatinGrade(String data) {
		selectByXpathVisbleText(prop.getProperty("IndianFrroRegistrationPage.accomadationgrade.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterResEmail(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.resemail.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterResMob(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.resmob.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterResPhone(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.resphone.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterOwnerName(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.ownername.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterOwnerAddress(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.ownerAdress.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage selectOwnerState(String data) {
		selectByXpathVisbleText(prop.getProperty("IndianFrroRegistrationPage.ownerState.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage selectOwnerCity(String data) {
		selectByXpathVisbleText(prop.getProperty("IndianFrroRegistrationPage.ownercity.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterOwnerEmail(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.owneremail.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage enterOwnerPhone(String data) {
		enterByXpath(prop.getProperty("IndianFrroRegistrationPage.ownerphone.xpath"), data);
		return new IndianFrroRegistrationPage();
	}
	public IndianFrroRegistrationPage waiting(int time) {
		try {
		Thread.sleep(time);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return new IndianFrroRegistrationPage();
	}
	
	

	
	
	
	
	
		
	}

