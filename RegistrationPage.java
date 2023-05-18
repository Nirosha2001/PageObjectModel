package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {

	public RegistrationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.username.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage enterUserPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.password.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.confirmpassword.xpath"), data);
		return new RegistrationPage();
	}
	public RegistrationPage ClickLanguage() {
		clickByXpath(prop.getProperty("RegistrationPage.clicklanguage.xpath"));
		return new RegistrationPage();
	}
	public RegistrationPage selectClickLanguage(String data) {
		clickDropDownByXpath(prop.getProperty("RegistrationPage.selectlanguage.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage clickSecurityQuestion() {
		clickByXpath(prop.getProperty("RegistrationPage.clicksequirityqeuestion.xpath"));
		return new RegistrationPage();
	}
	public RegistrationPage selectSecurityQuestion(String data) {
		clickDropDownByXpath(prop.getProperty("RegistrationPage.selectsequirityquestion.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage enterSecAns(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.secuirityans.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage clickContinue(){
		clickByXpath(prop.getProperty("RegistrationPage.clickcontinue.xpath"));
		return new RegistrationPage();
	}
	public RegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.firstname.xpath"), data);
		return new RegistrationPage();
	}
	public RegistrationPage enterMiddleName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.middlename.xpath"), data);
		return new RegistrationPage();
	}
	public RegistrationPage enterLastName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.lastname.xpath"), data);
		return new RegistrationPage();
	}
	public RegistrationPage clickOccupation() {
		clickByXpath(prop.getProperty("RegistrationPage.clickoccupation.xpath"));
		return new RegistrationPage();
	}
	public RegistrationPage selectOccupation(String data) {
		clickDropDownByXpath(prop.getProperty("RegistrationPage.selectoccupation.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage clickDob() {
		clickByXpath(prop.getProperty("RegistrationPage.clickDob.xpath"));
		return new RegistrationPage();
	}
	public RegistrationPage clickDay() {
		clickByXpath(prop.getProperty("RegistrationPage.clickday.xpath"));
		return new RegistrationPage();
	}
	public RegistrationPage selectMonth(String data) {
		selectByXpathVisbleText(prop.getProperty("RegistrationPage.selectMonth.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage selectYear(String data) {
		selectByXpathVisbleText(prop.getProperty("RegistrationPage.selectYear.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage clickMartialStatusUnmarried() {
		clickByXpath(prop.getProperty("RegistrationPage.clickmartialstatusunmarried.xpath"));
		return new RegistrationPage();
	}
	public RegistrationPage clickMartialStatusmarried() {
		clickByXpath(prop.getProperty("RegistrationPage.clickmartialstatusmarried.xpath"));
		return new RegistrationPage();
	}
	
	public RegistrationPage selectCountry(String data) {
		selectByXpathVisbleText(prop.getProperty("RegistrationPage.selectcountry.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage clickGenderFemale() {
		clickByXpath(prop.getProperty("RegistrationPage.clickfemale.xpath"));
		return new RegistrationPage();
	}
	public RegistrationPage clickGenderMale() {
		clickByXpath(prop.getProperty("RegistrationPage.clickmale.xpath"));
		return new RegistrationPage();
	}
	public RegistrationPage clickGenderTransgender() {
		clickByXpath(prop.getProperty("RegistrationPage.clicktransgender.xpath"));
		return new RegistrationPage();
	}
	public RegistrationPage enterEmail(String data){
		enterByXpath(prop.getProperty("RegistrationPage.enteremail.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage enterphone(String data){
		enterByXpath(prop.getProperty("RegistrationPage.enterphone.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage selectNationality(String data){
		selectByXpathVisbleText(prop.getProperty("RegistrationPage.selectnationality.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage clickContinueTwo(){
		clickByXpath(prop.getProperty("RegistrationPage.clickcontinuetwo.xpath"));
		return new RegistrationPage();
	}
	public RegistrationPage enterflatno(String data){
		enterByXpath(prop.getProperty("RegistrationPage.enterflatno.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage enterStreet(String data){
		enterByXpath(prop.getProperty("RegistrationPage.enterstreet.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage enterArea(String data){
		enterByXpath(prop.getProperty("RegistrationPage.enterarea.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage enterPincode(String data){
		enterByXpath(prop.getProperty("RegistrationPage.enterpincode.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage enterState(String data){
		enterByXpath(prop.getProperty("RegistrationPage.enterstate.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage selectCity(String data){
		selectByXpathVisbleText(prop.getProperty("RegistrationPage.entercity.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage selectPostOff(String data){
		selectByXpathVisbleText(prop.getProperty("RegistrationPage.enterpostoff.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage enterMobile(String data){
		enterByXpath(prop.getProperty("RegistrationPage.entermob.xpath"),data);
		return new RegistrationPage();
	}

	public RegistrationPage clickCopyResdentialNo(){
		clickByXpath(prop.getProperty("RegistrationPage.copyredidentialno.xpath"));
		return new RegistrationPage();
	}
	public RegistrationPage enteroffflatno(String data){
		enterByXpath(prop.getProperty("RegistrationPage.enteroffflatno.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage enteroffStreet(String data){
		enterByXpath(prop.getProperty("RegistrationPage.enteroffstreet.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage enteroffArea(String data){
		enterByXpath(prop.getProperty("RegistrationPage.enteroffarea.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage clickoffnation(){
		clickByXpath(prop.getProperty("RegistrationPage.clickcountry.xpath"));
		return new RegistrationPage();
	}
	public RegistrationPage selectnationoff(){
		clickByXpath(prop.getProperty("RegistrationPage.selectoffcountry.xpath"));
		return new RegistrationPage();
	}
	public RegistrationPage enteroffPincode(String data){
		enterByXpath(prop.getProperty("RegistrationPage.enteroffpincode.xpath"),data);
		return new RegistrationPage();
	}
	
	public RegistrationPage enteroffState(String data){
		enterByXpath(prop.getProperty("RegistrationPage.enteroffstate.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage enterOffCity(String data){
		enterByXpath(prop.getProperty("RegistrationPage.enteroffcity.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage enterPostOff(String data){
		enterByXpath(prop.getProperty("RegistrationPage.enteroffpostoff.xpath"),data);
		return new RegistrationPage();
	}
	public RegistrationPage enteroffMobile(String data){
		enterByXpath(prop.getProperty("RegistrationPage.enteroffmob.xpath"),data);
		return new RegistrationPage();
	}
}

	



	
	
	
	
	
	
   
	
	
	
		
	
	
	
	
	
		
