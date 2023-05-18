package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporting {
	
	public static ExtentReports report;
	
	public static ExtentTest test;
	
	public String testcaseName,testCaseDescription;
	
	public String author,category;
	
	public void startReport() {
		
		report=new ExtentReports("./Results/report_TC0010.html");
	}
	public void startTest(String testName,String description) {
		test=report.startTest(testName,description);
		test.assignAuthor(author);
		test.assignCategory(category);
	}
	
	public abstract long takeSnap();

	public void reportStep(String description,String status) {
		
		long snapnumber=takeSnap();
		if(status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, description+test.addScreenCapture(".././Results/screenshots/snap"+snapnumber+".png"));
			
		}
		else if(status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, description+test.addScreenCapture(".././Results/screenshots/snap"+snapnumber+".png"));
			
		}
		else if(status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, description+test.addScreenCapture(".././Results/screenshots/snap"+snapnumber+".png"));
			
		}
		else if(status.equalsIgnoreCase("warning")) {
			test.log(LogStatus.WARNING, description+test.addScreenCapture(".././Results/screenshots/snap"+snapnumber+".png"));
			
		}
	}
public void reportStep(String description,String status,boolean snap) {
		
		if(snap) {
		if(status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS, description);
			
		}
		else if(status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, description);
			
		}
		else if(status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, description);
			
		}
		else if(status.equalsIgnoreCase("warning")) {
			test.log(LogStatus.WARNING, description);
			
		}
	}
}
	public void endTest() {
		report.endTest(test);
	}
	public void endReport() {
		report.flush();
	}

}
