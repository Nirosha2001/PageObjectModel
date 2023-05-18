package revision;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlertRevision {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		 Thread.sleep(3000);
		 driver.switchTo().frame("iframeResult");
		 driver.findElementByXPath("/html/body/button").click();
		 String alerttext=driver.switchTo().alert().getText();
		 System.out.print(alerttext);
		 driver.switchTo().alert().accept();
		 String verifytxt=driver.findElementById("demo").getText();
		 if(verifytxt.contains("You pressed OK!")) {
			 System.out.print("pass");
		 }
		 else {
			 System.out.print("fail");
		 }
		 driver.navigate().refresh();
		 Thread.sleep(3000);
		 WebElement xframe=driver.findElementByXPath("//*[@id=\"iframeResult\"]");
		 driver.switchTo().frame(xframe);
		 driver.findElementByXPath("/html/body/button").click();
		 String text1=driver.switchTo().alert().getText();
		 System.out.print(text1);
		 driver.switchTo().alert().dismiss();
		 String Verifytext1=driver.findElementById("demo").getText();
		 if(Verifytext1.contains("You pressed Cancel!")) {
			 System.out.print("pass");
		 }
		 else {
			 System.out.print("fail");
		 }
		 driver.switchTo().defaultContent();
		 driver.findElementById("tryhome").click();
		 

	}

}
