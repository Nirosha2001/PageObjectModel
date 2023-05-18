package utils;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	@Test
	public void reportGeneration() {
		ExtentReports report=new ExtentReports("./Results/report.html");
		
		ExtentTest test=report.startTest("TC012","To register facebook for new user");
		
		test.assignAuthor("Nirosha");
		test.assignCategory("Functional");
		
		test.log(LogStatus.PASS,"The Application launched wit url succesfully");
		test.log(LogStatus.PASS,"The Application launched wit url succesfully");
		test.log(LogStatus.PASS,"The Application launched wit url succesfully");
		test.log(LogStatus.PASS,"The Application launched wit url succesfully");
		
		report.endTest(test);
		report.flush();
		
	}
	

}
