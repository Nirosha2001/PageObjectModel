package testcases;

import org.testng.annotations.Test;

import utils.DP005;
import wrappers.GenericWrappers;

public class TC005 extends GenericWrappers{
@Test(dataProvider="fetchdata",dataProviderClass=DP005.class)
    public void prompAlert(String name,String verifytext1,String verifytext2) {
	
	invokeApp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	wait(3000);
	switchToFrame("iframeResult");
	clickByXpathNoSnap("/html/body/button");
	getAlertText();
	promptEnterData(name);
	acceptAlert();
	verifyTextById("demo",verifytext1);
	refresh();
	wait(3000);
	switchToFrame("iframeResult");
	clickByXpathNoSnap("/html/body/button");
	getAlertText();
	promptEnterData(name);
	dismissAlert();
	verifyTextById("demo", verifytext2);
	switchToDefault();
	clickById("tryhome");
	switchToLastWindow();
	
	
	
	
}

}
