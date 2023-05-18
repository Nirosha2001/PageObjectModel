package utils;

import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import wrappers.GenericWrappers;

public class ProjectWrappers extends GenericWrappers {
	
	public String browsername;
	
	public String url;
	
	public String sheetname;
	
	@BeforeSuite
	public void beforSuite() {
		startReport();
		
	}
	@BeforeTest
	public void beforeTest() {
		loadObjects();
		
	}
	@BeforeMethod
	public void beforeMethod() {
		startTest(testcaseName,testCaseDescription);
		invokeApp(browsername, url);
		
	}
	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
		
	}
	@AfterClass
	public void afterClass() {
		endTest();
		
	
	}
	@AfterTest
	public void afterTest() {
		unLoadObjects();
		
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
		endReport();
		
	}
	@DataProvider(name="fetchData")
	public String[][] getTestData(){ 
	return DataInputProvider.getData(sheetname);
		
	}

}
