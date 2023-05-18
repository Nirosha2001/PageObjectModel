package pom.irctc.pages;

import wrappers.GenericWrappers;

public class GuestUserLoginPage extends GenericWrappers{
	
	public AccomadationDetailsPage clickLoginButton() {
		clickByXpathNoSnap(prop.getProperty("GuestUserLoginPage.clickLoginButton.xpath"));
		return new AccomadationDetailsPage();
	}
	
	public GuestUserLoginPage clickGuestUser() {
		clickByXpath(prop.getProperty("GuestUserLoginPage.clickGuestUser.xpath"));
		return this;
	}
	public GuestUserLoginPage enterEmail(String data) {
		enterByXpath(prop.getProperty("GuestUserLoginPage.enterEmail.xpath"),data);
		return this;
	}
	public GuestUserLoginPage enterMobileNum(String data) {
		enterByXpath(prop.getProperty("GuestUserLoginPage.enterMobileNum.xpath"),data);
		return this;
	}
	public GuestUserLoginPage waiting(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return new GuestUserLoginPage();

	}	
	

}
