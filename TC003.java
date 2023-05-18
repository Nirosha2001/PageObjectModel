package pom.alert.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alert.pages.AlertPages;
import utils.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	
	@BeforeClass
	
	public void beforeClass() {
		testcaseName="TC003";
		testCaseDescription="To verify simplealert";
		author="Nirosha";
		category="smoke";
		browsername="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		
	}
	@Test
	public void simpleAlert() {
		
		new AlertPages()
		.switchToFrame()
		.clickTryButton()
		.alertText()
		.clickOk()
		.backToDefault()
		.clickHomeButton()
		.switchtoLastWindow();
		
		
	}
	

}
