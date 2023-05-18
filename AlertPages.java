package pom.alert.pages;

import wrappers.GenericWrappers;

public class AlertPages extends GenericWrappers {
	
	public AlertPages switchToFrame() {
		switchToFrame("iframeResult");
		return new AlertPages();
	}
	public AlertPages clickTryButton() {
		clickByXpathNoSnap(prop.getProperty("AlertPages.TryItButton.xpath"));
		return this;
	}
	public AlertPages clickOk() {
		acceptAlert();
		return this;
	}
	public AlertPages clickCancel() {
		dismissAlert();
		return this;
	}
	public AlertPages alertText() {
		getAlertText();
		return this;
	}
	public AlertPages enterUserText(String text) {
		promptEnterData(text);
		return this;
	}
	public AlertPages verifyUserText(String text) {
		verifyTextContainsByXpath(prop.getProperty("AlertPages.UserText.xpath"), text);
		return this;
	}
	
	public AlertPages verifyOkText(String okverifytext) {
		verifyTextByXpath(prop.getProperty("AlertPages.oktext.xpath"), okverifytext);
		return this;
	}
	public AlertPages verifyCancelText(String cancelverifytext) {
		verifyTextByXpath(prop.getProperty("AlertPages.Canceltext.xpath"), cancelverifytext);
		return this;
	}
	public HomePage clickHomeButton() {
		clickByXpath(prop.getProperty("HomePage.clickhome.xpath"));
		return new HomePage();
	}
	public AlertPages backToDefault() {
		switchToDefault();
		return this;
	}
	public AlertPages refreshPage() {
		refresh();
		return this;
	}
	public  AlertPages waiting(int time) {
		try {
		Thread.sleep(time);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return new AlertPages();
	}
 


}
