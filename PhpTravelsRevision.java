package revision;


import org.openqa.selenium.chrome.ChromeDriver;


public class PhpTravelsRevision {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.org/register.php");
		driver.findElementById("inputFirstName").sendKeys("hariharan");
		driver.findElementById("inputLastName").sendKeys("v");
		driver.findElementById("inputEmail").sendKeys("hariharan01@gmail.com");
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"containerNewUserSignup\"]/div[1]/div/div/div[4]/div/div/div/div/div[2]").click();
		driver.findElementByXPath("//*[@id=\"containerNewUserSignup\"]/div[1]/div/div/div[4]/div/div/div/ul/li[102]").click();
		driver.findElementById("inputPhone").sendKeys("7854329801");
		driver.findElementById("inputCompanyName").sendKeys("geek technology");
		driver.findElementById("inputAddress1").sendKeys("lane street");
		driver.findElementById("inputAddress2").sendKeys("alathur");
		driver.findElementById("inputCity").sendKeys("palakkad");
		driver.findElementById("stateinput").sendKeys("Kerala");
		driver.findElementById("inputPostcode").sendKeys("678571");
		driver.findElementById("inputCountry").sendKeys("India");
		driver.findElementById("customfield2").sendKeys("8765321092");
		driver.findElementById("inputNewPassword1").sendKeys("hariHaran@0123");
		driver.findElementById("inputNewPassword2").sendKeys("hariHaran@0123");
		driver.findElementByXPath("//*[@id=\"frmCheckout\"]/div[3]/div/div/div/span[1]").click();
		
	}

}
