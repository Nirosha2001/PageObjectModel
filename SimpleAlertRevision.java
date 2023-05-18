package revision;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertRevision {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		 Thread.sleep(3000);
		 driver.switchTo().frame("iframeResult");
		 driver.findElementByXPath("/html/body/button").click();
		 String alerttext=driver.switchTo().alert().getText();
		 System.out.print(alerttext);
		 driver.switchTo().alert().accept();
		 driver.switchTo().defaultContent();
		 driver.findElementById("tryhome").click();
		 

	}

}
