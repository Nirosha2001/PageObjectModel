package pom.alert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.AlertPages;
import utils.ProjectWrappers;

public class TC004 extends ProjectWrappers {
	
@BeforeClass
	
	public void beforeClass() {
		testcaseName="TC004";
		testCaseDescription="To verify confirmalert";
		author="Nirosha";
		category="smoke";
		sheetname="TC004";
		browsername="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
		
	}
	@Test(dataProvider="fetchData")
	public void confirmAlert(String text1,String text2) {
		new AlertPages()
		.switchToFrame()
		.clickTryButton()
		.alertText()
		.clickOk()
		.verifyOkText(text1)
		.refreshPage()
		.switchToFrame()
		.clickTryButton()
		.alertText()
		.clickCancel()
		.verifyCancelText(text2)
		.backToDefault()
		.clickHomeButton()
		.switchtoLastWindow();
	}

}
