package pom.alert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.AlertPages;
import utils.ProjectWrappers;

public class TC005 extends ProjectWrappers {
@BeforeClass
	
	public void beforeClass() {
		testcaseName="TC005";
		testCaseDescription="To verify confirmalert";
		author="Nirosha";
		category="smoke";
		sheetname="TC005";
		browsername="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		
	}
	@Test(dataProvider="fetchData")
	
	public void promptAlert(String text1,String text2,String text3) {
		new AlertPages()
		.switchToFrame()
		.clickTryButton()
		.alertText()
		.enterUserText(text1)
		.clickOk()
		.verifyOkText(text2)
		.refreshPage()
		.switchToFrame()
		.clickTryButton()
		.alertText()
		.enterUserText(text1)
		.clickCancel()
		.verifyCancelText(text3)
		.backToDefault()
		.clickHomeButton()
		.switchtoLastWindow();
		
		
	}

}
