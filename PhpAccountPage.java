package pom.php.pages;

import wrappers.GenericWrappers;

public class PhpAccountPage extends GenericWrappers{
	
	public PhpAccountPage enterFirstName(String data) {
		enterByXpath("//input[@id='inputFirstName']",data);
		return new PhpAccountPage();
	}
	public PhpAccountPage enterLastName(String data) {
		enterByXpath("//input[@id='inputLastName']",data);
		return new PhpAccountPage();
	}
	public PhpAccountPage enterEmail(String data) {
		enterByXpath("//input[@id='inputEmail']",data);
		return new PhpAccountPage();
	}
	public PhpAccountPage clickPhoneCode() {
		clickByXpath("//div[text()='+92']");
		return new PhpAccountPage();
	}
	public PhpAccountPage selectPhoneCode() {
		clickByXpath("//span[text()='+91']");
		return new PhpAccountPage();
	}
	
	public PhpAccountPage enterPhone(String data) {
		enterByXpath("//input[@id='inputPhone']",data);
		return new PhpAccountPage();
	}
	public PhpAccountPage enterCompanyName(String data) {
		enterByXpath("//input[@id='inputCompanyName']",data);
		return new PhpAccountPage();
	}
	public PhpAccountPage enterStreet(String data) {
		enterByXpath("//input[@id='inputAddress1']",data);
		return new PhpAccountPage();
	}
	public PhpAccountPage enterStreet2(String data) {
		enterByXpath("//input[@id='inputAddress2']",data);
		return new PhpAccountPage();
	}
	public PhpAccountPage enterCity(String data) {
		enterByXpath("//input[@id='inputCity']",data);
		return new PhpAccountPage();
	}
	public PhpAccountPage enterState(String data) {
		enterByXpath("//input[@id='stateinput']",data);
		return new PhpAccountPage();
	}
	public PhpAccountPage enterPostCode(String data) {
		enterByXpath("//input[@id='inputPostcode']",data);
		return new PhpAccountPage();
	}
	public PhpAccountPage selectCountry(String data) {
		selectByXpathVisbleText("//select[@id='inputCountry']",data);
		return new PhpAccountPage();
	}
	
	public PhpAccountPage enterMobile(String data) {
		enterByXpath("//input[@id='customfield2']",data);
		return new PhpAccountPage();
	}
	public PhpAccountPage enterPassword(String data) {
		enterByXpath("//input[@id='inputNewPassword1']",data);
		return new PhpAccountPage();
	}
	public PhpAccountPage enterConfirmPassword(String data) {
		enterByXpath("//input[@id='inputNewPassword2']",data);
		return new PhpAccountPage();
	}
	public PhpAccountPage GeneratePassword() {
		clickByXpath("//button[@data-targetfields='inputNewPassword1,inputNewPassword2']");
		return new PhpAccountPage();
	}
	

}
