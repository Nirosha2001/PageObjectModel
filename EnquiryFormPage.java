package pom.irctc.pages;

import wrappers.GenericWrappers;

public class EnquiryFormPage extends GenericWrappers {
	
	public EnquiryFormPage enterName(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.name.xpath"), data);
		return new EnquiryFormPage();
	}
	public EnquiryFormPage enterOrganisation(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.organisation.xpath"), data);
		return new EnquiryFormPage();
	}
	public EnquiryFormPage enterAdress(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.adress.xpath"), data);
		return new EnquiryFormPage();
	}
	public EnquiryFormPage enterMobile(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.mobile.xpath"), data);
		return new EnquiryFormPage();
	}
	public EnquiryFormPage enterEmail(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.email.xpath"), data);
		return new EnquiryFormPage();
	}
	public EnquiryFormPage selectRequest(String data) {
		selectByXpathVisbleText(prop.getProperty("EnquiryFormPage.selectrequest.xpath"), data);
		return new EnquiryFormPage();
	}
	public EnquiryFormPage enterOrginStation(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.enterorginstation.xpath"), data);
		return new EnquiryFormPage();
	}
	public EnquiryFormPage enterDestinStation(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.enterdestinstation.xpath"), data);
		return new EnquiryFormPage();
	}
	
	public EnquiryFormPage enterDepartureDay() {
		clickByXpath(prop.getProperty("EnquiryFormPage.departureday.xpath"));
		return new EnquiryFormPage();
	}
	public EnquiryFormPage enterDepartureDate() {
		clickByXpath(prop.getProperty("EnquiryFormPage.departuredate.xpath"));
		return new EnquiryFormPage();
	}
	public EnquiryFormPage enterDepartureMonth() {
		clickByXpath(prop.getProperty("EnquiryFormPage.departuremonth.xpath"));
		return new EnquiryFormPage();
	}
	public EnquiryFormPage enterArrivalDay() {
		clickByXpath(prop.getProperty("EnquiryFormPage.arrivalday.xpath"));
		return new EnquiryFormPage();
	}
	public EnquiryFormPage enterArrivalDate() {
		clickByXpath(prop.getProperty("EnquiryFormPage.arrivaldate.xpath"));
		return new EnquiryFormPage();
	}
	public EnquiryFormPage enterArrivalMonth() {
		clickByXpath(prop.getProperty("EnquiryFormPage.arrivalmonth.xpath"));
		return new EnquiryFormPage();
	}

	public EnquiryFormPage enterDurationPeriod(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.durationperiod.xpath"), data);
		return new EnquiryFormPage();
	}
	public EnquiryFormPage enterCoacDetails(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.coachdetails.xpath"), data);
		return new EnquiryFormPage();
	}
	
	public EnquiryFormPage enterPassenger1(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.passenger1.xpath"), data);
		return new EnquiryFormPage();
	}
	public EnquiryFormPage enterPassenger2(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.passenger2.xpath"), data);
		return new EnquiryFormPage();
	}
	
	public EnquiryFormPage enterChartPurpose(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.chartpurpose.xpath"), data);
		return new EnquiryFormPage();
	}
	
	public EnquiryFormPage enterService(String data) {
		enterByXpath(prop.getProperty("EnquiryFormPage.service.xpath"), data);
		return new EnquiryFormPage();
	}
	public EnquiryFormPage waiting(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new EnquiryFormPage();
	}

	

}
