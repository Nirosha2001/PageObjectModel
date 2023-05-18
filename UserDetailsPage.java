package pom.irctc.pages;

import wrappers.GenericWrappers;

public class UserDetailsPage extends GenericWrappers {
	
	public UserDetailsPage selectTitle(String data) {
		selectByXpathVisbleText(prop.getProperty("UserDetailsPage.selectTitle.xpath"), data);
		return this;
	}
	public UserDetailsPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("UserDetailsPage.enterFirstName.xpath"), data);
		return this;
	}
	public UserDetailsPage enterLatName(String data) {
		enterByXpath(prop.getProperty("UserDetailsPage.enterLatName.xpath"), data);
		return this;
	}
	public UserDetailsPage selectCountry(String data) {
		selectByXpathVisbleText(prop.getProperty("UserDetailsPage.selectCountry.xpath"), data);
		return this;
	}
	public UserDetailsPage selectState(String data) {
		selectByXpathVisbleText(prop.getProperty("UserDetailsPage.selectState.xpath"), data);
		return this;
	}
	public UserDetailsPage enterMobileNum(String data) {
		enterByXpath(prop.getProperty("UserDetailsPage.enterMobileNum.xpath"), data);
		return this;
	}
	public UserDetailsPage enterEmail(String data) {
		enterByXpath(prop.getProperty("UserDetailsPage.enterEmail.xpath"), data);
		return this;
	}
	public UserDetailsPage selectGst(String data) {
		selectByXpathVisbleText(prop.getProperty("UserDetailsPage.selectGst.xpath"), data);
		return this;
	}
	public UserDetailsPage enterGstNum(String data) {
		enterByXpath(prop.getProperty("UserDetailsPage.enterGstNum.xpath"), data);
		return this;
	}
	public UserDetailsPage enterGstCompanyName(String data) {
		enterByXpath(prop.getProperty("UserDetailsPage.enterGstCompanyName.xpath"), data);
		return this;
	}
	public UserDetailsPage enterGstCompanyAddress(String data) {
		enterByXpath(prop.getProperty("UserDetailsPage.enterGstCompanyAddress.xpath"), data);
		return this;
	}

   public UserDetailsPage verifyGstNumber(String data) {
	   verifyTextByXpath(prop.getProperty("UserDetailsPage.verifyGstNumber.xpath"), data);
	   return this;
	   
   }
   public UserDetailsPage verifyHotel() {
	  String hotelname2=getTextByXpathNoSnap(prop.getProperty("UserDetailsPage.hotelnameoutside.xpath"));
	   if((HotelBookingPage.hotelName).equals(hotelname2)){
		   reportStep("hotel name are same", "pass");
	   }
	   else {
		   reportStep("hotel names are not same","fail");
	   }
	   return this;
	  
	   
   }
   public PaymentPage clickContinue2(){
		clickByXpath(prop.getProperty("UserDetailsPage.continue2.xpath"));
		return new PaymentPage();
	}
   public UserDetailsPage clickReset(){
		clickByXpath(prop.getProperty("UserDetailsPage.clickReset.xpath"));
		return this;
	}
   public  UserDetailsPage clickContinue(){
		clickByXpath(prop.getProperty("UserDetailsPage.clickContinue.xpath"));
		return this;
	}
	

}
