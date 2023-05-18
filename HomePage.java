package pom.ssc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	
	//public SscRegistrationPage userSignUp() {
		//clickByXpath("//a[text()='New User ? Register Now']");
		//return new  SscRegistrationPage();

	public HomePage clickAadharYes() {
		clickByXpath(prop.getProperty("HomePage.Aadharyes.xpath"));
		return new HomePage();
	}
	public HomePage clickAadharNo() {
		clickByXpath(prop.getProperty("HomePage.Aadharno.xpath"));
		return new HomePage();
	}
	public HomePage enterAadharNum(String data) {
		enterByXpath(prop.getProperty("HomePage.Aadharnum.xpath"),data);
		return new HomePage();
	}
	public HomePage verifyAadharNum(String data) {
		enterByXpath(prop.getProperty("HomePage.verifyadharnum.xpath"),data);
		return new HomePage();
	}
	public HomePage selectTypeOfId(String data) {
		selectByXpathVisbleText(prop.getProperty("HomePage.typeofid.xpath"),data);
		return new HomePage();
	}
	public HomePage enterIdNumber(String data) {
		enterByXpath(prop.getProperty("HomePage.idnumber.xpath"),data);
		return new HomePage();
	}
	public HomePage enterName(String data) {
		enterByXpath(prop.getProperty("HomePage.name.xpath"),data);
		return new HomePage();
	}
	public HomePage verifyName(String data) {
		enterByXpath(prop.getProperty("HomePage.verifyname.xpath"),data);
		return new HomePage();
	}
	public HomePage clickChangedNameYes() {
		clickByXpath(prop.getProperty("HomePage.changednameyes.xpath"));
		return new HomePage();
	}
	public HomePage clickChangedNameNo() {
		clickByXpath(prop.getProperty("HomePage.changednameno.xpath"));
		return new HomePage();
	}
	public HomePage enterChangedName(String data) {
		enterByXpath(prop.getProperty("HomePage.changedname.xpath"),data);
		return new HomePage();
	}
	public HomePage enterFatherName(String data) {
		enterByXpath(prop.getProperty("HomePage.fathername.xpath"),data);
		return new HomePage();
	}
	public HomePage verifyFatherName(String data) {
		enterByXpath(prop.getProperty("HomePage.verifyfathername.xpath"),data);
		return new HomePage();
	}
	public HomePage enterMotherName(String data) {
		enterByXpath(prop.getProperty("HomePage.mothername.xpath"),data);
		return new HomePage();
	}
	public HomePage verifyMotherName(String data) {
		enterByXpath(prop.getProperty("HomePage.verifymothername.xpath"),data);
		return new HomePage();
	}
	public HomePage enterDob(String data) {
		enterByXpath(prop.getProperty("HomePage.dob.xpath"),data);
		return new HomePage();
	}
	public HomePage verifyDob(String data) {
		enterByXpath(prop.getProperty("HomePage.verifydob.xpath"),data);
		return new HomePage();
	}
	public HomePage selectEducationBoard(String data) {
		selectByXpathVisbleText(prop.getProperty("HomePage.selecteducationboard.xpath"),data);
		return new HomePage();
	}
	public HomePage verifyEducationBoard(String data) {
		selectByXpathVisbleText(prop.getProperty("HomePage.verifyeducationboard.xpath"),data);
		return new HomePage();
	}
	public HomePage enterRollNo(String data) {
		enterByXpath(prop.getProperty("HomePage.rollno.xpath"),data);
		return new HomePage();
	}
	public HomePage verifyRollNo(String data) {
		enterByXpath(prop.getProperty("HomePage.verifyrollno.xpath"),data);
		return new HomePage();
	}
	public HomePage clickGenderMale() {
		clickByXpath(prop.getProperty("HomePage.gendermale.xpath"));
		return new HomePage();
	}
	public HomePage clickGenderFemale() {
		clickByXpath(prop.getProperty("HomePage.genderfemale.xpath"));
		return new HomePage();
	}
	public HomePage clickGenderOthers() {
		clickByXpath(prop.getProperty("HomePage.genderothers.xpath"));
		return new HomePage();
	}
	public HomePage verifyGenderMale() {
		clickByXpath(prop.getProperty("HomePage.verifygendermale.xpath"));
		return new HomePage();
	}
	public HomePage verifyGenderFemale() {
		clickByXpath(prop.getProperty("HomePage.verifygenderfemale.xpath"));
		return new HomePage();
	}
	public HomePage verifyGenderOthers() {
		clickByXpath(prop.getProperty("HomePage.verifygenderothers.xpath"));
		return new HomePage();
	}
	public HomePage selectEducationLevel(String data) {
		selectByXpathVisbleText(prop.getProperty("HomePage.educationlevel.xpath"),data);
		return new HomePage();
	}
	public HomePage enterMob(String data) {
		enterByXpath(prop.getProperty("HomePage.mob.xpath"),data);
		return new HomePage();
	}
	public HomePage selectYearOfpassing(String data) {
		selectByXpathVisbleText(prop.getProperty("HomePage.yearofpassing.xpath"),data);
		return new HomePage();
	}
	public HomePage verifyYearOfpassing(String data) {
		selectByXpathVisbleText(prop.getProperty("HomePage.verifyyearofpassing.xpath"),data);
		return new HomePage();
	}
	
	public HomePage verifyMob(String data) {
		enterByXpath(prop.getProperty("HomePage.verifymob.xpath"),data);
		return new HomePage();
	}
	public HomePage enterEmail(String data) {
		enterByXpath(prop.getProperty("HomePage.email.xpath"),data);
		return new HomePage();
	}
	public HomePage verifyEmail(String data) {
		enterByXpath(prop.getProperty("HomePage.verifyemail.xpath"),data);
		return new HomePage();
	}
	public HomePage selectState(String data) {
		selectByXpathVisbleText(prop.getProperty("HomePage.state.xpath"),data);
		return new HomePage();
	}
	


	
}
	
		
		
