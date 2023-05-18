package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
        
	public RegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("HomePage.clickonregister.xpath"));
		return new RegistrationPage();
	
	}
	public HomePage mouseOverOnHolidays() {
		clickByXpath(prop.getProperty("HomePage.mouseoveronholidays.xpath"));
		return new HomePage();
	}
	public HomePage mouseOverOnStays() {
		clickByXpath(prop.getProperty("HomePage.mouseoveronstays.xpath"));
		return this;
	}
	public newWindow mouseOverLounge() {
		clickByXpath(prop.getProperty("HomePage.mouseoveronlounge.xpath"));
		return new newWindow();
	}
	public NewWindowHotelPage mouseOverOnLounge() {
		clickByXpath(prop.getProperty("HomePage.mouseOverOnLounge.xpath"));
		return new NewWindowHotelPage();
	}
}
