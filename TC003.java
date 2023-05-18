package testcases;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC003 extends GenericWrappers{
@Test
    public void simpleAlert() {
	
	invokeApp("chrome","https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	wait(3000);
	switchToFrame("iframeResult");
	clickByXpathNoSnap("/html/body/button");
	getAlertText();
	acceptAlert();
	switchToDefault();
	clickById("tryhome");
	switchToLastWindow();
}
	

}
