package pom.irctc.pages;

import wrappers.GenericWrappers;

public class VerifyPaymentPage extends GenericWrappers{
	
	public VerifyPaymentPage clickVerify() {
		clickByXpath(prop.getProperty("VerifyPaymentPage.clickverify.xpath"));
		return this;
	}
	public VerifyPaymentPage  verifyOtp(String data) {
		verifyTextByXpath(prop.getProperty("PaymentPage.verifyOtp.xpath"), data);
		return this;
	}
	public   VerifyPaymentPage  waiting(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return new  VerifyPaymentPage ();

	}

}
