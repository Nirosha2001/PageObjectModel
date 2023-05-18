package revision;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcRegisterRevision {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		driver.findElementByLinkText("REGISTER").click();
		Thread.sleep(3000);
		driver.findElementById("userName").sendKeys("nirosha014");
		driver.findElementById("usrPwd").sendKeys("Krishna012");
		driver.findElementById("cnfUsrPwd").sendKeys("Krishna012");
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li/span").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input").sendKeys("Moyans");
		driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
		driver.findElementById("firstName").sendKeys("Hari");
		driver.findElementById("middleName").sendKeys("krishna");
		driver.findElementById("lastname").sendKeys("v");
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li/span").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input").click();
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr[2]/td[4]/a").click();
		WebElement month=driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[1]");
		Select mn=new Select(month);
		mn.selectByIndex(7);
		Thread.sleep(3000);
		WebElement year=driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[2]");
		Select yr=new Select(year);
		yr.selectByVisibleText("2005");
		driver.findElementById("unmarried").click();
		WebElement cntry=driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[8]/select");
		Select cn=new Select(cntry);
		cn.selectByVisibleText("India");
		driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[2]").click();
		driver.findElementById("email").sendKeys("krishna014@gmail.com");
		driver.findElementById("mobile").sendKeys("7654290145");
		Thread.sleep(3000);
		WebElement nation=driver.findElementByXPath("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select");
		Select na=new Select(nation);
		na.selectByVisibleText("India");
		driver.findElementByXPath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button").click();
		driver.findElementById("resAddress1").sendKeys("kailash flat");
		driver.findElementById("resAddress2").sendKeys("Behrm street");
		driver.findElementById("resAddress3").sendKeys("lionpalace");
		driver.findElementById("resPinCode").sendKeys("678571");
		driver.findElementById("resState").sendKeys("kerala");
		WebElement city=driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[6]/select");
		Select ct=new Select(city);
		ct.selectByVisibleText("Palakkad");
		WebElement post=driver.findElementByXPath("//*[@id=\"ui-tabpanel-2\"]/div/div[7]/select");
		Select po=new Select(post);
		po.selectByIndex(4);
		driver.findElementById("resPhone").sendKeys("8765432901");
		driver.findElementById("yes").click();
		driver.findElementById("sbi").click();
		
		
		
		
		
        
	}

}
