package pom.facebook.page;

import wrappers.GenericWrappers;

public class CreateAccountPage extends GenericWrappers{

	public CreateAccountPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("CreateAccountPage.firstname.xpath"), data);
		return new CreateAccountPage();
	}
	public CreateAccountPage enterLastName(String data) {
		enterByXpath(prop.getProperty("CreateAccountPage.lastname.xpath"), data);
		return new CreateAccountPage();
	}
	public CreateAccountPage enterEmail(String data) {
		enterByXpath(prop.getProperty("CreateAccountPage.email.xpath"), data);
		return new CreateAccountPage();
	}
	public CreateAccountPage enterConfirmEmail(String data) {
		enterByXpath(prop.getProperty("CreateAccountPage.confirmemail.xpath"), data);
		return new CreateAccountPage();
	}
	public CreateAccountPage enterPassword(String data) {
		enterByXpath(prop.getProperty("CreateAccountPage.password.xpath"), data);
		return new CreateAccountPage();
	}
	public CreateAccountPage selectMonth(String data) {
		selectByXpathVisbleText(prop.getProperty("CreateAccountPage.month.xpath"), data);
		return new CreateAccountPage();
	}
	public CreateAccountPage selectDay(String data) {
		selectByXpathVisbleText(prop.getProperty("CreateAccountPage.day.xpath"), data);
		return new CreateAccountPage();
	}
	public CreateAccountPage selectYear(String data) {
		selectByXpathVisbleText(prop.getProperty("CreateAccountPage.year.xpath"), data);
		return new CreateAccountPage();
	}
	public CreateAccountPage clickGenderFemale() {
		clickByXpath(prop.getProperty("CreateAccountPage.female.xpath"));
		return new CreateAccountPage();
	}
	public CreateAccountPage clickGenderMale() {
		clickByXpath(prop.getProperty("CreateAccountPage.male.xpath"));
		return new CreateAccountPage();
	}
	public CreateAccountPage clickGenderCustom() {
		clickByXpath(prop.getProperty("CreateAccountPage.custom.xpath"));
		return new CreateAccountPage();
	}
	
	
}
