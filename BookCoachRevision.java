package revision;

import java.util.Set;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookCoachRevision {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("\"https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		driver.findElementByLinkText("HOLIDAYS").click();
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]").click();
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span").click();
		Set<String> windafterclick1=driver.getWindowHandles();
		System.out.print(windafterclick1);
		for(String eachid:windafterclick1) {
			driver.switchTo().window(eachid);
		}
		Thread.sleep(3000);
		driver.findElementById("sidebarCollapse").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Book Your Coach/Train").click();
		Set<String> windafterclick=driver.getWindowHandles();
		System.out.print(windafterclick);
		for(String eachid:windafterclick) {
			driver.switchTo().window(eachid);
		}
		Thread.sleep(3000);
		driver.findElementByLinkText("New User? Signup").click();
		Thread.sleep(3000);
		driver.findElementById("userId").sendKeys("akash");
		driver.findElementById("password").sendKeys("Akash_013");
		driver.findElementById("cnfPassword").sendKeys("Akash_013");
		Thread.sleep(3000);
		WebElement seq=driver.findElementByName("secQstn");
		Select qsn=new Select(seq);
		qsn.selectByVisibleText("Where did you first meet your spouse?");
		driver.findElementById("secAnswer").sendKeys("temple");
		driver.findElementById("dateOfBirth").sendKeys("04/08/2001");
		driver.findElementById("gender1").click();
		driver.findElementById("maritalStatus0").click();
		driver.findElementById("email").sendKeys("akash01@gmail.com");
		Thread.sleep(3000);
		WebElement occ=driver.findElementById("occupation");
		Select oc=new Select(occ);
		oc.selectByValue("SelfEmployed");
		Thread.sleep(3000);
		driver.findElementById("fname").sendKeys("akash");
		driver.findElementById("mname").sendKeys("kiran");
		driver.findElementById("lname").sendKeys("loha");
		Thread.sleep(3000);
		WebElement ntly=driver.findElementById("natinality");
		Select nt=new Select(ntly);
		nt.selectByIndex(0);
		Thread.sleep(3000);
		driver.findElementById("flatNo").sendKeys("7/12");
		driver.findElementById("street").sendKeys("bethlhm street");
		driver.findElementById("area").sendKeys("kalekkadu");
		WebElement cntry=driver.findElementById("country");
		Select cn=new Select(cntry);
		cn.selectByValue("94");
		driver.findElementById("mobile").sendKeys("7543908186");
		driver.findElementById("pincode").sendKeys("678571");
		driver.findElementById("sameAddresses0").click();
		driver.quit();
				
		
		
		
	}

}
