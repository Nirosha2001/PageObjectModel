package testcases;

import org.testng.annotations.Test;

import wrappers.GenericWrappers;

public class TC004 extends GenericWrappers {
@Test
  public void confirmAlert(String verifytext1,String verifytext2) {
	
	invokeApp("chrome","https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	wait(3000);
	switchToFrame("iframeResult");
	clickByXpathNoSnap("/html/body/button");
	getAlertText();
	acceptAlert();
	getTextById("demo");
	verifyTextById("demo",verifytext1);
	refresh();
	wait(3000);
	switchToFrame("iframeResult");
	clickByXpathNoSnap("/html/body/button");
	getAlertText();
	dismissAlert();
	verifyTextById("demo",verifytext2);
	switchToDefault();
	clickById("tryhome");
	switchToLastWindow();

}
}
