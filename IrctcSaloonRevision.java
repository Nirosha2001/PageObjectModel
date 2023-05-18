package revision;

import java.util.Set;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSaloonRevision {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
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
		driver.findElementByLinkText("Charter").click();
		Thread.sleep(3000);
		driver.findElementById("enquiry-tab").click();
		Thread.sleep(3000);
		driver.findElementByName("name").sendKeys("Krishnan");
		driver.findElementByName("organization").sendKeys("softronic");
		driver.findElementByName("address").sendKeys("hilltop station");
		driver.findElementByName("mobile").sendKeys("784326750");
		driver.findElementByName("email").sendKeys("krishnan01@gmail.com");
		WebElement request=driver.findElementByName("requestFor");
		Select sc=new Select(request);
		sc.selectByValue("Saloon Charter");
		Thread.sleep(3000);
		driver.findElementByName("originStation").sendKeys("palakkad");
		driver.findElementByName("destnStation").sendKeys("chennai");
		driver.findElementByName("checkInDate").click();
		driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/tbody/tr[3]/td[7]/span").click();
		driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/thead/tr[1]/th[2]").click();
		Thread.sleep(3000);
		driver.findElementByName("checkOutDate").click();
		driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/tbody/tr[4]/td[3]/span").click();
		driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/thead/tr[1]/th[2]").click();
		driver.findElementByName("durationPeriod").sendKeys("3");
		driver.findElementByName("coachDetails").sendKeys("general quota");
		driver.findElementByName("numPassenger").sendKeys("3");
		driver.findElementByName("numPassenger").sendKeys("3");
		driver.findElementByName("charterPurpose").sendKeys("information");
		driver.findElementByName("services").sendKeys("yes");
		driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[17]/button").click();
		String valid=driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[4]/span").getText();
		if(valid.equals("Mobile no. not valid")) {
			System.out.print("pass");
		}
		else {
			System.out.print("fail");
		}
		driver.quit();
		
		
		
	}

}
