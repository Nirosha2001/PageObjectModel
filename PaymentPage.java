package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PaymentPage extends GenericWrappers {
	
public PaymentPage clickAgree() {
	clickByXpath(prop.getProperty("UserDetailsPage.clickAgree.xpath"));
	return new PaymentPage();
}
public PaymentPage verifyRate() {
	gstCal(HotelBookingPage.hotelrate);
	return this;
	
}
public VerifyPaymentPage clickPayment() {
	clickByXpath(prop.getProperty("PaymentPage.makePayment.xpath"));
	return new VerifyPaymentPage();
}
public PaymentPage waiting(int time) {
	try {
		Thread.sleep(time);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	return new PaymentPage();

}	



}
