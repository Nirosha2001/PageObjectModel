package revision;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SscRegisterRevision {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ssc.nic.in/registration/home");
		driver.findElementById("rbAadharYes").click();
		driver.findElementById("AadharNumber").sendKeys("478932156903");
		driver.findElementById("VerifyAadharNumber").sendKeys("478932156903");
		driver.findElementById("Name").sendKeys("Hariharan");
		driver.findElementById("VerifyName").sendKeys("Hariharan");
		driver.findElementById("rbHaveEverChangedNameNo").click();
		driver.findElementById("FatherName").sendKeys("pilla");
		driver.findElementById("VerifyFatherName").sendKeys("pilla");
		driver.findElementById("MotherName").sendKeys("jaya");
		driver.findElementById("VerifyMotherName").sendKeys("jaya");
		driver.findElementById("DateOfBirth").sendKeys("14/12/2012");
		driver.findElementById("VerifyDateOfBirth").sendKeys("14/12/2012");
		Thread.sleep(3000);
		WebElement education =driver.findElementById("EducationBoard");
		Select ed=new Select(education);
		ed.selectByVisibleText("UP Board of Madrasa Education");
		Thread.sleep(3000);
		WebElement verifyeducation =driver.findElementById("ddlEducationBoard");
		Select ved=new Select(verifyeducation);
		ved.selectByVisibleText("UP Board of Madrasa Education");
		driver.findElementById("SecondaryRollNum").sendKeys("VPAT89012");
		Thread.sleep(3000);
		WebElement pass =driver.findElementById("Yearofpassing");
		Select ps=new Select(pass);
		ps.selectByValue("2020");
		Thread.sleep(3000);
		WebElement verifypass =driver.findElementById("ddlYearofpassing");
		Select vps=new Select(verifypass);
		vps.selectByValue("2020");
		driver.findElementById("rbMale").click();
		driver.findElementById("rbVerifyMale").click();
		Thread.sleep(3000);
		WebElement level =driver.findElementById("Levelofeducationqualification");
		Select lv=new Select(level);
		lv.selectByVisibleText("Higher Secondary (10+2)");
		driver.findElementById("MobileNum").sendKeys("8543678210");
		driver.findElementById("VerifyMobileNum").sendKeys("8543678210");
		driver.findElementById("EmailID").sendKeys("hariharan01@gmail.com");
		driver.findElementById("VerifyEmailID").sendKeys("hariharan01@gmail.com");
		Thread.sleep(3000);
		WebElement orgin =driver.findElementById("OriginState");
		Select og=new Select(orgin);
		og.selectByValue("18");
		
		
		
		
		
		
		

	}

}
