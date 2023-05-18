package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FTRRegistrationPage extends GenericWrappers {
	
	public FTRRegistrationPage enterUserId(String data) {
		enterByXpath(prop.getProperty("FTRRegistrationPage.userid.xpath"), data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterUserPassword(String data) {
		enterByXpath(prop.getProperty("FTRRegistrationPage.enterUserPassword.xpath"), data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("FTRRegistrationPage.enterConfirmPassword.xpath"), data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage selectSecQstn(String data) {
		selectByXpathVisbleText(prop.getProperty("FTRRegistrationPage.selectSecQstn.xpath"), data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterSecAns(String data) {
		enterByXpath(prop.getProperty("FTRRegistrationPage.enterSecAns.xpath"), data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterDateOfBirth() {
		clickByXpath(prop.getProperty("FTRRegistrationPage.enterDateOfBirth.xpath"));
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage selectMonth(String data) {
		selectByXpathVisbleText(prop.getProperty("FTRRegistrationPage.month.xpath"), data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage selectYear(String data) {
		selectByXpathVisbleText(prop.getProperty("FTRRegistrationPage.year.xpath"), data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage clickDate() {
		clickByXpath(prop.getProperty("FTRRegistrationPage.date.xpath"));
		return new FTRRegistrationPage();
	}
	
	public FTRRegistrationPage clickGenderMale() {
		clickByXpath(prop.getProperty("FTRRegistrationPage.clickGenderMale.xpath"));
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage clickGenderFemale() {
		clickByXpath(prop.getProperty("FTRRegistrationPage.clickGenderFemale.xpath"));
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage clickGenderTrans() {
		clickByXpath(prop.getProperty("FTRRegistrationPage.clickGenderTrans.xpath"));
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage clickGenderInstitution(){
		clickByXpath(prop.getProperty("FTRRegistrationPage.clickGenderInstitution.xpath"));
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage clickMartialStatusUnmarried(){
		clickByXpath(prop.getProperty("FTRRegistrationPage.clickMartialStatusUnmarried.xpath"));
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage clickMartialStatusmarried(){
		clickByXpath(prop.getProperty("FTRRegistrationPage.clickMartialStatusmarried.xpath"));
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterEmail(String data){
		enterByXpath(prop.getProperty("FTRRegistrationPage.enterEmail.xpath"),data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage selectOccupation(String data) {
		selectByXpathVisbleText(prop.getProperty("FTRRegistrationPage.selectOccupation.xpath"), data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterFirstName(String data){
		enterByXpath(prop.getProperty("FTRRegistrationPage.enterFirstName.xpath"),data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterMiddleName(String data){
		enterByXpath(prop.getProperty("FTRRegistrationPage.enterMiddleName.xpath"),data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterLastName(String data){
		enterByXpath(prop.getProperty("FTRRegistrationPage.enterLastName.xpath"),data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage selectNatinality(String data) {
		selectByXpathVisbleText(prop.getProperty("FTRRegistrationPage.selectNatinality.xpath"), data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterFlatNo(String data){
		enterByXpath(prop.getProperty("FTRRegistrationPage.enterFlatNo.xpath"),data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterStreet(String data){
		enterByXpath(prop.getProperty("FTRRegistrationPage.enterStreet.xpath"),data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterArea(String data){
		enterByXpath(prop.getProperty("FTRRegistrationPage.enterArea.xpath"),data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage selectNation(String data) {
		selectByXpathVisbleText(prop.getProperty("FTRRegistrationPage.selectNation.xpath"), data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterMobile(String data){
		enterByXpath(prop.getProperty("FTRRegistrationPage.enterMobile.xpath"),data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterPincode(String data){
		enterByXpath(prop.getProperty("FTRRegistrationPage.enterPincode.xpath"),data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage selectCity(String data) {
		selectByXpathVisbleText(prop.getProperty("FTRRegistrationPage.selectCity.xpath"), data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage selectState(String data) {
		selectByXpathVisbleText(prop.getProperty("FTRRegistrationPage.selectState.xpath"), data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage selectPostOffice(String data) {
		selectByXpathVisbleText(prop.getProperty("FTRRegistrationPage.selectPostOffice.xpath"), data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage clickYes(){
		clickByXpath(prop.getProperty("FTRRegistrationPage.clickYes.xpath"));
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage clickNo(){
		clickByXpath(prop.getProperty("FTRRegistrationPage.clickNo.xpath"));
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterFlatNoOffice(String data){
		enterByXpath(prop.getProperty("FTRRegistrationPage.enterFlatNoOffice.xpath"),data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterStreetOffice(String data){
		enterByXpath(prop.getProperty("FTRRegistrationPage.enterStreetOffice.xpath"),data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterAreaOffice(String data){
		enterByXpath(prop.getProperty("FTRRegistrationPage.enterAreaOffice.xpath"),data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage selectNationOffice(String data) {
		selectByXpathVisbleText(prop.getProperty("FTRRegistrationPage.selectNationOffice.xpath"), data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterMobileOffice(String data){
		enterByXpath(prop.getProperty("FTRRegistrationPage.enterMobileOffice.xpath"),data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage enterPincodeOffice(String data){
		enterByXpath(prop.getProperty("FTRRegistrationPage.enterPincodeOffice.xpath"),data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage selectOffCity(String data){
		selectByXpathVisbleText(prop.getProperty("FTRRegistrationPage.offcity.xpath"),data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage selectOffState(String data){
		selectByXpathVisbleText(prop.getProperty("FTRRegistrationPage.offState.xpath"),data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage selectOffPostOff(String data){
		selectByXpathVisbleText(prop.getProperty("FTRRegistrationPage.offPostOff.xpath"),data);
		return new FTRRegistrationPage();
	}
	public FTRRegistrationPage waiting(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new FTRRegistrationPage();
	}
	
	

	
	
	
	

}
