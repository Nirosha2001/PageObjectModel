package weekthree;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);  
	    try {
			driver.findElementByName("lastnam").sendKeys("giri");
            System.out.print("lastname passed with data giri");
	    	
	    }
	    catch (NoSuchElementException e) {
	    	
				System.err.println("element with lastname is not found")	;
	    }
	    catch (ElementNotVisibleException e) {
	    	
	    }
	    catch (ElementClickInterceptedException e) {
	    	
	    }
	    catch (ElementNotInteractableException e) {
	    	
	    }
	    catch (ElementNotSelectableException e) {
	    	
		}
	    catch (NoAlertPresentException e) {
	    	
		}
	    catch (UnhandledAlertException e) {
	    	
	    }
	    catch (NoSuchFrameException e) {
	    	
		}
	    catch (NoSuchWindowException e) {
	    	
		}
	    catch (InvalidArgumentException e) {
	    	
		}
	    catch (SessionNotCreatedException e) {
	    	
		}
	    catch (WebDriverException e) {
	    	
		}
	    catch (Exception e) {
	    	
		}
	    finally {
	    	File tmp=driver.getScreenshotAs(OutputType.FILE);
	    	
	    	File dest=new File("./screenshots/snap2.png");
	    	
	    	FileUtils.copyFile(tmp, dest);
	    	
	    }
	}

}
