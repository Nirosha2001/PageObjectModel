package revision;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class IrctcHotelRevision {

	private static final String Set = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElementByLinkText("HOLIDAYS").click();
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]").click();
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span").click();
		Thread.sleep(3000);
		Set<String> windafterclick=driver.getWindowHandles();
		System.out.print(windafterclick);
		for(String eachid:windafterclick) {
			driver.switchTo().window(eachid);
		}
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[1]/ul/li[2]/a/span").click();
		Set<String> windafterclick1=driver.getWindowHandles();
		System.out.print(windafterclick1);
		for(String eachid:windafterclick1) {
			driver.switchTo().window(eachid);
		}
		Thread.sleep(3000);
		driver.findElementByLinkText("Login").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Guest User Login").click();
		Thread.sleep(3000);
		driver.findElementByName("email").sendKeys("Ramya01@gmail.com");
		driver.findElementByName("mobileNo").sendKeys("8754390185");
		driver.findElementByXPath("//*[@id=\"profile\"]/div/form/div[3]/button").click();
		Thread.sleep(3000);
		driver.findElementById("filterText").sendKeys("chennai");
		driver.findElementByXPath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[1]/searchbox/div/ul/li[1]/a").click();
		Thread.sleep(3000);
		driver.findElementByName("dt12").click();
		driver.findElementByXPath("//*[@id=\"owl-dt-picker-4\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[3]/td[4]/span").click();
		driver.findElementByXPath("//*[@id=\"owl-dt-picker-4\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-multi-year-view/table/tbody/tr[3]/td[2]/span").click();
		driver.findElementByXPath("//*[@id=\"owl-dt-picker-4\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-year-view/table/tbody/tr[1]/td[1]/span").click();
		Thread.sleep(3000);
		driver.findElementByName("dt13").click();
		driver.findElementByXPath("//*[@id=\"owl-dt-picker-5\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[3]/td[5]/span").click();
		driver.findElementByXPath("//*[@id=\"owl-dt-picker-5\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-multi-year-view/table/tbody/tr[3]/td[2]/span").click();
		driver.findElementByXPath("//*[@id=\"owl-dt-picker-5\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-year-view/table/tbody/tr[1]/td[1]/span").click();
		Thread.sleep(3000);
		WebElement adult=driver.findElementByName("hotelAdult");
		Select sc=new Select(adult);
		sc.selectByVisibleText("3");
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"user-data-wrapper\"]/div[2]/button").click();
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-hotellist/div[2]/div/div/div[3]/div[2]").click();
		Set<String> windafterclick2=driver.getWindowHandles();
		System.out.print(windafterclick2);
		for(String eachid:windafterclick2) {
			driver.switchTo().window(eachid);
		}
		String hotel=driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[1]/div/h5").getText();
		System.out.print(hotel);
		String rate=driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/strong").getText();
		System.out.print(rate);
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[3]/button").click();
		Thread.sleep(3000);
		WebElement title=driver.findElementByName("title");
		Select ti=new Select(title);
		sc.selectByVisibleText("Mrs");
		driver.findElementByName("firstName").sendKeys("Ramya");
		driver.findElementByName("lastName").sendKeys("lila");
		Thread.sleep(3000);
		WebElement country=driver.findElementByName("country");
		Select ct=new Select(country);
		ct.selectByValue("India");
		Thread.sleep(3000);
		WebElement state=driver.findElementByName("state");
		Select st=new Select(state);
		st.selectByIndex(16);
		Thread.sleep(3000);
		WebElement gst=driver.findElementByName("gst");
		Select gt=new Select(gst);
		gt.selectByVisibleText("Yes");
		driver.findElementByName("gstNumber").sendKeys("GTIN3456");
		driver.findElementByName("companyName").sendKeys("geek technology");
		driver.findElementByName("companyAddress").sendKeys("bethlhm");
		driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[12]/button[2]").click();
		String valid=driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[9]/div/span").getText();
		if(valid.equals("Please Enter Valid GSt number")){
			System.out.print("pass");
		}
		else {
			System.out.print("fail");
		}
		driver.quit();		
		

		
		

	    
		
		
		
		
	}

}
