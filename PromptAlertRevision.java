package revision;

import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertRevision {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		 Thread.sleep(3000);
		 driver.switchTo().frame("iframeResult");
		 driver.findElementByXPath("/html/body/button").click();
		 String promptext=driver.switchTo().alert().getText();
		 System.out.print(promptext);
		 driver.switchTo().alert().sendKeys("Harikrishnan");
		 driver.switchTo().alert().accept();
		 String printext=driver.findElementById("demo").getText();
		 if(printext.contains("Hello Harikrishnan! How are you today?")) {
			 System.out.print("pass");
		 }
		 else {
			 System.out.print("fail");
		 }
		 driver.navigate().refresh();
		 driver.switchTo().frame("iframeResult");
		 driver.findElementByXPath("/html/body/button").click();
		 String newtext=driver.switchTo().alert().getText();
		 System.out.print(newtext);
		 driver.switchTo().alert().sendKeys("Harikrishnan");
		 driver.switchTo().alert().dismiss();
		 String newprintext=driver.findElementById("demo").getText();
		 if(newprintext.contains("User cancelled the prompt.")) {
			 System.out.print("pass");
		 }
		 else {
			 System.out.print("fail");
		 }
		 driver.switchTo().defaultContent();
		 driver.findElementById("tryhome").click();

	}

}
