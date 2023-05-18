package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers {
	
	public static RemoteWebDriver driver;
	
	public static Properties prop;
	
	public void loadObjects() {
		
		try {
			prop=new Properties();
			prop.load(new FileInputStream("./src/test/java/Object.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void unLoadObjects() {
		prop=null;
	}
	int i=1;

	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		try {
			if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe")	;
			driver=new ChromeDriver();
			
			}
			else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			}
			else if(browser.equals("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverserver.exe");
				driver=new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//System.out.println("The browser "+ browser+" is launched with given url "+url+" succesfully");
			reportStep("The browser "+ browser+" is launched with given url "+url+" succesfully","PASS");
			} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The browser "+browser+" is not launched due to session not created error");
			reportStep("The browser "+browser+" is not launched due to session not created error","fail");
		}
		  catch (InvalidArgumentException e) {
			// TODO: handle exception
			 // System.err.println("The browser "+browser+" is not launched due to wrong url as url does not contain https/https");
			  reportStep("The browser "+browser+" is not launched due to wrong url as url does not contain https","fail");
		}
		  catch (WebDriverException e) {
			// TODO: handle exception
			  //System.err.print("The browser "+browser+" is not launched due unknown error ");
			  reportStep("The browser "+browser+" is not launched due unknown error ","fail");
		}
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			//System.out.println("The element with id "+idValue+" is entered with data "+data);
			reportStep("The element with id "+idValue+" is entered with data "+data,"pass");
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.print("The element with id "+idValue+" is not found in DOM");
			reportStep("The element with id "+idValue+" is not found in DOM","fail");
		}
		 catch (ElementNotVisibleException e) {
			// TODO: handle exception
				//System.err.print("The element with id "+idValue+" is not visible in application");
			 reportStep("The element with id "+idValue+" is not visible in application","fail");
 
		}
		 catch (ElementNotInteractableException e) {
			// TODO: handle exception
				//System.err.print("The element with id "+idValue+" is not interactable in application");
			 reportStep("The element with id "+idValue+" is not interactable in application","fail");

		 }
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.print("The element with id "+idValue+" is not stable in application");
			reportStep("The element with id "+idValue+" is not stable in application","fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.print("The element with id "+idValue+"is not entered with data "+data+" as unexpected alert opened");   
           reportStep("The element with id "+idValue+"is not entered with data "+data+" as unexpected alert opened","fail");   
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.print("The element with id "+idValue+" is not entered with data "+data+" due to unknown error");
			reportStep("The element with id "+idValue+" is not entered with data "+data+" due to unknown error","fail");
		}
	
	}


	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			//System.out.println("The element with name "+nameValue+" is entered with data "+data);
			reportStep("The element with name "+nameValue+" is entered with data "+data,"pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+nameValue+" is not found in DOM");
			reportStep("The element with name "+nameValue+" is not found in DOM","fail");
		}
		  catch (ElementNotVisibleException e) {
			// TODO: handle exception
			  //System.err.println("The element with name "+nameValue+" is not visible in Application");
			  reportStep("The element with name "+nameValue+" is not visible in Application","fail");
		}
		  catch (ElementNotInteractableException e) {
			// TODO: handle exception
			  //System.err.println("The element with name "+nameValue+" is not interactable in Application");
			  reportStep("The element with name "+nameValue+" is not interactable in Application","fail");
		}
		  catch (StaleElementReferenceException e) {
			// TODO: handle exception
			  //System.out.println("The element with name "+nameValue+" is not stable in application");
			  reportStep("The element with name "+nameValue+" is not stable in application","fail");
		}
		  catch (UnhandledAlertException e) {
			// TODO: handle exception
			  //System.out.println("The element with name "+nameValue+" is not not entered with data "+data+" as unexpected alert opened");
			  reportStep("The element with name "+nameValue+" is not not entered with data "+data+" as unexpected alert opened","fail");
		}
		  catch (WebDriverException e) {
			// TODO: handle exception
			 // System.out.println("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error");
			  reportStep("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error","fail");
		}
		
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			//System.out.println("The element with Xpath "+xpathValue+" is entered with data "+data);
			reportStep("The element with Xpath "+xpathValue+" is entered with data "+data,"pass");
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathValue+" is not entered with data "+data+" as unexpexted alert opened");
			reportStep("The element with xpath "+xpathValue+" is not entered with data "+data+" as unexpexted alert opened","fail");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not found in DOM");
			reportStep("The element with xpath "+xpathValue+" is not found in DOM","fail");
	
		}
		 catch (ElementNotVisibleException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpathValue+" is not visible in Application");
			 reportStep("The element with xpath "+xpathValue+" is not visible in Application","fail");
		}
		 catch (ElementNotInteractableException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpathValue+" is not interactable in Application");
			 reportStep("The element with xpath "+xpathValue+" is not interactable in Application","fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+" is not stable in Application");
			reportStep("The element with xpath "+xpathValue+" is not stable in Application","fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathValue+"is not entered with data "+data+" due to unknown errors");
			reportStep("The element with xpath "+xpathValue+"is not entered with data "+data+" due to unknown errors","fail");
		}
		
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String browsertitle=driver.getTitle();
			if(browsertitle.equals(title)) {
				//System.out.println("The title of the page "+browsertitle+" is matched with expected title "+title);
				reportStep("The title of the page "+browsertitle+" is matched with expected title "+title,"pass");
			}
			else {
				//System.out.println("The title of page "+browsertitle+" is not matched with expected title "+title);
				reportStep("The title of page "+browsertitle+" is not matched with expected title "+title,"pass");
			}
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			//System.err.print(" The title of page "+ title +"cannot be verified due to unexpected alert occured");
			reportStep(" The title of page "+ title +"cannot be verified due to unexpected alert occured","fail");
			
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println(" The title of page "+title+" cannot be verified due to unknown errors");
			reportStep(" The title of page "+title+" cannot be verified due to unknown errors","fail");
		}
		
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String verifytext=driver.findElementById(id).getText();
			if(verifytext.equals(text)) {
				//System.out.println("The element with id "+id+" contains text "+verifytext+" is matched with given text "+text);
				reportStep("The element with id "+id+" contains text "+verifytext+" is matched with given text "+text,"pass");
			}
			else {
				//System.out.println("The element with id "+id+" contains text "+verifytext+" is not matched with given text "+text);
				reportStep("The element with id "+id+" contains text "+verifytext+" is not matched with given text "+text,"pass");
			}
		} 
		catch(NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not found in DOM");
			reportStep("The element with id "+id+" is not found in DOM","fail");
		 }
		  catch (ElementNotVisibleException e) {
			// TODO: handle exception
			  //System.err.println("The element with id "+id+" is not visible in Application");
			  reportStep("The element with id "+id+" is not visible in Application","fail");
		}
		  catch(ElementNotInteractableException e) {
			  //System.err.println("The element with id "+id+" is not interactable in application");
			  reportStep("The element with id "+id+" is not interactable in application","fail");
		  }
		  catch (StaleElementReferenceException e) {
			// TODO: handle exception
			 // System.err.println("The element with id "+id+" is not stable in application");
			  reportStep("The element with id "+id+" is not stable in application","fail");
		}
		  catch (UnhandledAlertException e) {
			  //System.err.println("The element with id "+ id+" cannot be verified due to unexpected alert occured");
			// TODO: handle exception
			  reportStep("The element with id "+ id+" cannot be verified due to unexpected alert occured","fail");
		  }
		  catch (WebDriverException e) {
			// TODO: handle exception
			  //System.err.println("The element with id "+id+" cannot be verified due to unknown error");
			  reportStep("The element with id "+id+" cannot be verified due to unknown error","fail");
		}
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String text2=driver.findElementByXPath(xpath).getText();
			
			if(text2.equals(text)) {
				//System.out.println("The element with xpath "+xpath+" contains text "+text2+" is matched with given text "+text);
				reportStep("The element with xpath "+xpath+" contains text "+text2+" is matched with given text "+text,"pass");
			}
			else {
				//System.out.println("The element with xpath" +xpath+" contains text "+text2+" is not matched with given text "+text);
				reportStep("The element with xpath" +xpath+" contains text "+text2+" is not matched with given text "+text,"pass");
			}
		}
		catch (NoSuchElementException e) {
				// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not found in DOM")	;
			reportStep("The element with xpath "+xpath+" is not found in DOM","fail")	;
			}
		 catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not visible in Application");
			 reportStep("The element with xpath "+xpath+" is not visible in Application","fail");
			
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not stable in Application");
			reportStep("The element with xpath "+xpath+" is not stable in Application","fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" cannot be verified due to unexpected alert occured");
			reportStep("The element with xpath "+xpath+" cannot be verified due to unexpected alert occured","fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" cannot be verified due to unknown error occured");
			reportStep("The element with xpath "+xpath+" cannot be verified due to unknown error occured","fail");
		}
	
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String text3=driver.findElementByXPath(xpath).getText();
			if(text3.contains(text)) {
				//System.out.println("The element with xpath "+xpath+" contains text "+text3+" is matched with given text "+ text);
				reportStep("The element with xpath "+xpath+" contains text "+text3+" is matched with given text "+ text,"pass");
			}
			else {
				//System.out.println("The element with xpath "+xpath+" contains text "+text3+" is not matched with given text "+text);
				reportStep("The element with xpath "+xpath+" contains text "+text3+" is not matched with given text "+text,"pass");
			}
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not visible in application");
			reportStep("The element with xpath "+xpath+" is not visible in application","fail");
			
		}
		 catch(NoSuchElementException e) {
			 //System.err.println("The element with xpath "+xpath+" is not found in DOM");
			 reportStep("The element with xpath "+xpath+" is not found in DOM","fail");
		 }
		 catch (StaleElementReferenceException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+ xpath+ "is not stable in Application");
			 reportStep("The element with xpath "+ xpath+ "is not stable in Application","fail");
			 
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable in Application");
			reportStep("The element with xpath "+xpath+" is not interactable in Application","fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" cannot be verified due to unexpected alert occured");
			reportStep("The element with xpath "+xpath+" cannot be verified due to unexpected alert occured","fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" cannot be verified due to unknown errors");
			reportStep("The element with xpath "+xpath+" cannot be verified due to unknown errors","fail");
		}
		
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			//System.out.println("The element with id "+id+" is clicked");
			reportStep("The element with id "+id+" is clicked","pass");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not clickable");
			reportStep("The element with id "+id+" is not clickable","fail");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.print("The element with id "+id+" is not found in DOM");
			reportStep("The element with id "+id+" is not found in DOM","fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.print("The element with id "+id+" is not interactable in Application");
			reportStep("The element with id "+id+" is not interactable in Application","fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in Application");
			reportStep("The element with id "+id+" is not stable in Application","fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.print("The element with id "+id+" is not clicked"+" due to unexpected alert occured");
			reportStep("The element with id "+id+" is not clicked"+" due to unexpected alert occured","fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not clicked due to some unknown errors");
			reportStep("The element with id "+id+" is not clicked due to some unknown errors","fail");
		}
			
		}
		
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			//System.out.println("The element with classvalue "+classVal+" is clicked");
			reportStep("The element with classvalue "+classVal+" is clicked","pass");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.print("The element with classvalue "+classVal+" is not found in DOM");
			reportStep("The element with classvalue "+classVal+" is not found in DOM","fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.print("The element with classvalue "+classVal+" is not clicked due to unexpected alert occured");
			reportStep("The element with classvalue "+classVal+" is not clicked due to unexpected alert occured","fail");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element eith classVal "+classVal+" is not clickable");
			reportStep("The element eith classVal "+classVal+" is not clickable","fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.print("The element with classvalue "+classVal+" is not interactable in Application");
			reportStep("The element with classvalue "+classVal+" is not interactable in Application","fail");
			
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with classvalue "+classVal+" is not stable in Application");
			reportStep("The element with classvalue "+classVal+" is not stable in Application","fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with classvalue "+classVal+" is not clicked due to some unknown errors");
			reportStep("The element with classvalue "+classVal+" is not clicked due to some unknown errors","fail");
		}
		
			
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			//System.out.println("The element with name "+ name+" is clicked");
			reportStep("The element with name "+ name+" is clicked","pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		    //System.err.println("The element with name "+name+" is not found in Dom");
			reportStep("The element with name "+name+" is not found in Dom","fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not visible in application");
			reportStep("The element with name "+name+" is not visible in application","fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not interactable in application");
			reportStep("The element with name "+name+" is not interactable in application","fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not stable in application");
			reportStep("The element with name "+name+" is not stable in application","fail");

		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+"cannot be clicked due to unexpected alert occured");
			reportStep("The element with name "+name+"cannot be clicked due to unexpected alert occured","fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" cannot be clicked due to unknown error occured");
			reportStep("The element with name "+name+" cannot be clicked due to unknown error occured","fail");
		}
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
            //System.out.println("The element with linktext "+name+" is clicked");
			reportStep("The element with linktext "+name+" is clicked","pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		    //System.err.println("The element with linktext "+name+" is not found in Dom");
			reportStep("The element with linktext "+name+" is not found in Dom","fail");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not clickable");
			reportStep("The element with linktext "+name+" is not clickable","fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not clicked due to unexpected alert occured");
			reportStep("The element with linktext "+name+" is not clicked due to unexpected alert occured","fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not interactable in application");
			reportStep("The element with linktext "+name+" is not interactable in application","fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not stable in Application");
			reportStep("The element with linktext "+name+" is not stable in Application","fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" not clicked due to unknown error occured");
			reportStep("The element with linktext "+name+" not clicked due to unknown error occured","fail");
		}
		
		
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			//System.out.println("The element with linktext "+name+" is clicked");
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with linktext "+name+" is not visible in Application" );
			reportStep("The element with linktext "+name+" is not visible in Application" ,"pass");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not found in Dom");
			reportStep("The element with linktext "+name+" is not found in Dom","fail");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not clickable");
			reportStep("The element with linktext "+name+" is not clickable","fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not interactable in application");
			reportStep("The element with linktext "+name+" is not interactable in application","fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.print("The element with linktext "+name+"is not clicked due to unexpected alert occured");
			reportStep("The element with linktext "+name+"is not clicked due to unexpected alert occured","fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with linktext "+name+" is not stable in Application");
			reportStep("The element with linktext "+name+" is not stable in Application","fail");

		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.print("The element with linktext "+name+" is not clicked due to unknown error occured");
			reportStep("The element with linktext "+name+" is not clicked due to unknown error occured","fail");
		}
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked");
			reportStep("The element with xpath "+xpathVal+" is clicked","pass");
			
		}
		  catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not found in DOM");
			  reportStep("The element with xpath "+xpathVal+" is not found in DOM","fail");
		}
		  catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to unexpected alert occured");
			  reportStep("The element with xpath "+xpathVal+" is not clicked due to unexpected alert occured","fail");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clickable");
			reportStep("The element with xpath "+xpathVal+" is not clickable","fail");
		}
		  catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interactable in Application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in Application","fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in Application");
			reportStep("The element with xpath "+xpathVal+" is not stable in Application","fail");
		}
		  catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to some unknown errors");
			  reportStep("The element with xpath "+xpathVal+" is not clicked due to some unknown errors","fail");
		}

		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with xpath "+xpathVal+" is clicked");
			reportStep("The element with xpath "+xpathVal+" is clicked","pass",false);
		} 
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in application");
			reportStep("The element with xpath "+xpathVal+" is not visible in application","fail",false);
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.print("The element with xpath "+xpathVal+" is not found in DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in DOM","fail",false);
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			//System.err.print("The element with "+xpathVal+" is not clickable");
			reportStep("The element with "+xpathVal+" is not clickable","fail",false);
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.print("The element with xpath "+xpathVal+" is not interactable in Application");
			reportStep("The element with xpath "+xpathVal+" is not interactable in Application","fail",false);
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.print("The element with xpath "+xpathVal+" is not stable in Application");
			reportStep("The element with xpath "+xpathVal+" is not stable in Application","fail",false);
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.print("The element with xpath "+xpathVal+" is not clicked due to unexpected alert occured");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to unexpected alert occured","fail",false);
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not clicked due to some unknown errors");
			reportStep("The element with xpath "+xpathVal+" is not clicked due to some unknown errors","fail",false);
		}
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String text=null;
		try {
			 text=driver.findElementById(idVal).getText();
			 //System.out.println(text);
			 reportStep(text,"pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+idVal+" is not found in DOM");
			reportStep("The element with id "+idVal+" is not found in DOM","fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id"+idVal+" is not visible in Application");
			reportStep("The element with id"+idVal+" is not visible in Application","fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" cannot get due to unexpected alert occured");
			reportStep("The element with id "+idVal+" cannot get due to unexpected alert occured","fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not interactable in Application");
			reportStep("The element with id "+idVal+" is not interactable in Application","fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" is not stable in Application");
			reportStep("The element with id "+idVal+" is not stable in Application","fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+idVal+" cannot get due to unknown errors");
			reportStep("The element with id "+idVal+" cannot get due to unknown errors","fail");
		}
		
		return text ;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String text=null;
		try {
			text=driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with xpath "+xpathVal+" contains text "+text);
			reportStep("The element with xpath "+xpathVal+" contains text "+text,"pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in DOM","fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in Application");
			reportStep("The element with xpath "+xpathVal+" is not visible in Application","fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in Application");
			reportStep("The element with xpath "+xpathVal+" is not stable in Application","fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interacatable in Application");
			reportStep("The element with xpath "+xpathVal+" is not interacatable in Application","fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" cannot get text due to unexpected alert occured");
			reportStep("The element with xpath "+xpathVal+" cannot get text due to unexpected alert occured","fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"cannot get text due to unknown error occured");
			reportStep("The element with xpath "+xpathVal+"cannot get text due to unknown error occured","fail");
			
		}
		return text;
		
	}
	public String getTextByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		String text=null;
		try {
			text=driver.findElementByXPath(xpathVal).getText();
			//System.out.println("The element with xpath "+xpathVal+" contains text "+text);
			reportStep("The element with xpath "+xpathVal+" contains text "+text,"pass",false);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpathVal+" is not found in DOM");
			reportStep("The element with xpath "+xpathVal+" is not found in DOM","fail",false);
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not visible in Application");
			reportStep("The element with xpath "+xpathVal+" is not visible in Application","fail",false);
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not stable in Application");
			reportStep("The element with xpath "+xpathVal+" is not stable in Application","fail",false);
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" is not interacatable in Application");
			reportStep("The element with xpath "+xpathVal+" is not interacatable in Application","fail",false);
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+" cannot get text due to unexpected alert occured");
			reportStep("The element with xpath "+xpathVal+" cannot get text due to unexpected alert occured","fail",false);
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpathVal+"cannot get text due to unknown error occured");
			reportStep("The element with xpath "+xpathVal+"cannot get text due to unknown error occured","fail",false);
			
		}
		return text;
		
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement drpdownvisible=driver.findElementById(id);
			Select sc=new Select(drpdownvisible);
			sc.selectByVisibleText(value);
			//System.out.println("The element with id "+id+" is selected with visible value "+value);
			reportStep("The element with id "+id+" is selected with visible value "+value,"pass");
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+ "is not selectable");
			reportStep("The element with id "+id+ "is not selectable","fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			 //System.err.println("The element with id "+id +"cannot be selected due to unexpected alert opened");
			reportStep("The element with id "+id +"cannot be selected due to unexpected alert opened","fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+ "is not visible in application");
			reportStep("The element with id "+id+ "is not visible in application","fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+ "is not interactable");
			reportStep("The element with id "+id+ "is not interactable","fail");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"is not not found in DOM");
			reportStep("The element with id "+id+"is not not found in DOM","fail");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not stable in Application");
			reportStep("The element with id "+id+" is not stable in Application","fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.print("The element with id "+id+" is not selected to some unknown error occured");
			reportStep("The element with id "+id+" is not selected to some unknown error occured","fail");
		}  
			// TODO Auto-generated catch block
		
		
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdownindex=driver.findElementById(id);
			Select sc=new Select(dropdownindex);
			sc.selectByIndex(value);
			//System.out.println("The element with id "+id+" is selected with index "+value);
			reportStep("The element with id "+id+" is selected with index "+value,"pass");
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not selectable");
			reportStep("The element with id "+id+" is not selectable","fail");
		}
		 catch (UnhandledAlertException e) {
			// TODO: handle exception
			 //System.err.println("The element with id "+id +" cannot be selected due to unexpected alert opened");
			 reportStep("The element with id "+id +" cannot be selected due to unexpected alert opened","fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"is not visible in application");
			reportStep("The element with id "+id+"is not visible in application","fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable ");
			reportStep("The element with id "+id+" is not interactable ","fail");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not not found in DOM ");
			reportStep("The element with id "+id+" is not not found in DOM ","fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.print("The element with id "+id+" is not selected to some unknown error occured");
			reportStep("The element with id "+id+" is not selected to some unknown error occured","fail");
		}
			 
		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		try {
			Set<String> list1=driver.getWindowHandles();
			for(String eachid:list1) {
				driver.switchTo().window(eachid);
				break;
			}
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("can't able to switch to parent window as there is no such window");
			reportStep("can't able to switch to parent window as there is no such window","fail");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("can't able to switch to parent window due to unexpected alert occured");
			reportStep("can't able to switch to parent window due to unexpected alert occured","fail");
		}
		
		  catch (WebDriverException e) {
			// TODO: handle exception
			  //System.err.println("can't able to switch to parent window due to unknown error occured");
			  reportStep("can't able to switch to parent window due to unknown error occured","fail");
		}
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub

		try {
			Set<String> list=driver.getWindowHandles();
			System.out.println(list);
			for(String eachid:list) {
				driver.switchTo().window(eachid);
			}
			//System.out.println("The browser switched in to last window");
			reportStep("The browser switched in to last window","pass");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			//System.err.println("can't able to switch to last window as there is no such window");
			reportStep("can't able to switch to last window as there is no such window","fail");
		}
		 catch (UnhandledAlertException e) {
			// TODO: handle exception
			 //System.err.println("can't able to switch to last window due to unexpected alert occured");
			 reportStep("can't able to switch to last window due to unexpected alert occured","fail");
		}
		  catch (WebDriverException e) {
			// TODO: handle exception
			  //System.err.println("can't able to switch to last window due to unknown error ");
			  reportStep("can't able to switch to last window due to unknown error ","fail");
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			//System.out.println("alert accepted succesfully");
			reportStep("alert accepted succesfully","pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("alert is not present");
		reportStep("alert is not present","fail",false);
			
		}
		
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("can't able to accept alert due to unknown error occured");
			reportStep("can't able to accept alert due to unknown error occured","fail");
		}
		
	}
	

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			//System.out.println("cancelled alert succesfully");
			reportStep("cancelled alert succesfully","pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("alert is not present");
			reportStep("alert is not present","fail",false);
					}		  
		catch (WebDriverException e) {
			// TODO: handle exception
			 // System.err.println("can't able to perform cancel operation due to unknown error occured");
			reportStep("can't able to perform cancel operation due to unknown error occured","fail",false);
		}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String alert=null;
		try {
			alert=driver.switchTo().alert().getText();
			//System.out.println(alert);
			reportStep("captured the alert text "+alert+" succesfully","pass",false);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			//System.err.println("alert is not present");
			reportStep("alert is not present","fail",false);
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("unknown error occured");
			reportStep("unknown error occured","fail",false);
		}
		return alert;
		
	
		
	}

	public long takeSnap() {
		// TODO Auto-generated method stub
		
		long number=0;
		try {
			
			number=(long)Math.floor(Math.random()*1000000000)+100000;
			File tmp=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("./Results/screenshots/snap"+number+".png");
			FileUtils.copyFile(tmp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//System.err.println("cannot able to take screenshot due to problem in accessing file");
			reportStep("cannot able to take screenshot due to problem in accessing file","fail",false);
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("cannot able to take screenshot due to unknown error occured");
			reportStep("cannot able to take screenshot due to unknown error occured","fail",false);
		}
		return number;
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			//System.out.println("closed current browser");
			reportStep("closed current browser","pass",false);
		} 
		
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.println("cannot able gto close browser due to unknown error occured");
			reportStep("cannot able gto close browser due to unknown error occured","fail",false);
		}
	}
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			//System.out.println("closed all browsers");
			reportStep("closed all browsers","pass",false);
		}
		
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.print("Cannot able to close all browsers due to unknown error");
			reportStep("Cannot able to close all browsers due to unknown error","fail",false);
		}

		
			}

	public void wait(int time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//System.err.println("Error throws on waiting");
			reportStep("Error throws on waiting","fail");
			
			
		}
		
	}


	public void selectByXpathVisbleText(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdownindex=driver.findElementByXPath(xpath);
			Select sc=new Select(dropdownindex);
			sc.selectByVisibleText(text);
			//System.out.println("The element with xpath"+xpath+" is selected with value "+text);
			reportStep("The element with xpath"+xpath+" is selected with value "+text,"pass");
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with xpath "+xpath+" is not selectable");
			reportStep("The element with xpath "+xpath+" is not selectable","fail");
		}
		 catch (UnhandledAlertException e) {
			// TODO: handle exception
			// System.err.println("The element with xpath "+xpath +" cannot be selected due to unexpected alert opened");
			 reportStep("The element with xpath "+xpath +" cannot be selected due to unexpected alert opened","fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+"is not visible in application");
			reportStep("The element with xpath "+xpath+"is not visible in application","fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not interactable ");
			reportStep("The element with xpath "+xpath+" is not interactable ","fail");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with xpath "+xpath+" is not not found in DOM ");
			reportStep("The element with xpath "+xpath+" is not  found in DOM ","fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.print("The element with xpath "+xpath+" is not selected to some unknown error occured");
			reportStep("The element with xpath "+xpath+" is not selected to some unknown error occured","fail");
		}
		//finally {
		//	takeSnap();
		//}
			 
		
	}

	public void switchToFrame(String id) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(id);
			//System.out.println("The browser switched to frame with id "+id);
			reportStep("The browser switched to frame with id "+id,"pass",false);
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			//System.err.println("can't able to switch to frame as there is no such frame");
			reportStep("can't able to switch to frame as there is no such frame","fail",false);
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("can't able to switch to frame due to unexpected alert occured");
			reportStep("can't able to switch to frame due to unexpected alert occured","fail",false);
		}
		
		  catch (WebDriverException e) {
			// TODO: handle exception
			 // System.err.println("can't able to switch to frame due to unknown error occured");
			  reportStep("can't able to switch to frame due to unknown error occured","fail",false);
		}
		//finally {
		//	takeSnap();
		//}
	}

	public void switchToDefault() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().defaultContent();
			//System.out.println("browser switched in to default content");
			reportStep("browser switched in to default content","pass",false);
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			//System.err.println("can't able to switch default content due to unexpected alert occured");
			reportStep("can't able to switch default content due to unexpected alert occured","fail",false);
		}
		
		  catch (WebDriverException e) {
			// TODO: handle exception
			  //System.err.println("can't able to switch to default content  due to unknown error occured");
			  reportStep("can't able to switch to default content  due to unknown error occured","fail",false);
		}
		//finally {
		//	takeSnap();
		//}
		
	}

	public void refresh() {
		// TODO Auto-generated method stub
		try {
			driver.navigate().refresh();
			//System.out.println("page got refreshed");
			reportStep("page got refreshed","pass");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.out.println("can't able to refresh due to unknown error occured");
			reportStep("can't able to refresh due to unknown error occured","fail");
		}
		
		
	}

	public void promptEnterData(String text) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().sendKeys(text);
			//System.out.println(" In alert text box entered with data "+text);
			reportStep(" In alert text box entered with data "+text,"pass",false);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//System.err.println("page can't refersh due to unknown error occured");
			reportStep("page can't refersh due to unknown error occured","fail",false);
		}
		
	}

	public void selectValueById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			WebElement st=driver.findElementById(id);
			Select sc= new Select(st);
			sc.selectByValue(text);
			//System.out.println("The element with id "+id+" is selected with value "+text);
			reportStep("The element with id "+id+" is selected with value "+text,"pass");
		}  catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with id "+id+" is not selectable");
			reportStep("The element with id "+id+" is not selectable","fail");
		}
		 catch (UnhandledAlertException e) {
			// TODO: handle exception
			 //System.err.println("The element with id "+id +" cannot be selected due to unexpected alert opened");
			 reportStep("The element with id "+id +" cannot be selected due to unexpected alert opened","fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+"is not visible in application");
			reportStep("The element with id "+id+"is not visible in application","fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not interactable ");
			reportStep("The element with id "+id+" is not interactable ","fail");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with id "+id+" is not not found in DOM ");
			reportStep("The element with id "+id+" is not not found in DOM ","fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.print("The element id "+id+" is not selected to some unknown error occured");
			reportStep("The element id "+id+" is not selected to some unknown error occured","fail");
		}
		//finally {
		//	takeSnap();
		//}
		
		
	}

	public void selectValueByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement st=driver.findElementByName(name);
			Select sc= new Select(st);
			sc.selectByValue(value);
			//System.out.println("The element with name "+name+" is selected with value "+value);
			reportStep("The element with name "+name+" is selected with value "+value,"pass");
		}  catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with name "+name+" is not selectable");
			reportStep("The element with name "+name+" is not selectable","fail");
		}
		 catch (UnhandledAlertException e) {
			// TODO: handle exception
			 //System.err.println("The element with name "+name +" cannot be selected due to unexpected alert opened");
			 reportStep("The element with name "+name +" cannot be selected due to unexpected alert opened","fail");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+"is not visible in application");
			reportStep("The element with name "+name+"is not visible in application","fail");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not interactable ");
			reportStep("The element with name "+name+" is not interactable ","fail");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			//System.err.println("The element with name "+name+" is not not found in DOM ");
			reportStep("The element with name "+name+" is not not found in DOM ","fail");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			//System.err.print("The element with name "+name+" is not selected to some unknown error occured");
			reportStep("The element with name "+name+" is not selected to some unknown error occured","fail");
		}
		//finally {
		//	takeSnap();
		//}
		
	}

	public void gstCal(String text1) {
		// TODO Auto-generated method stub
		    try {
				String fullday=driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]").getText();
				System.out.println(fullday);
				String frstrep=fullday.replace("3 Guests, 1 Room, "," ");
				String secrep=frstrep.replace("Nights"," ");
				int days =Integer.parseInt(secrep);
				String rate=text1;
				System.out.println(rate);
				String price=rate.replace("₹ "," ");
				int newprice=Integer.parseInt(price);
				int cal=0;
				cal=(int) Math.ceil((double)Math.round(days*newprice*1.12*100)/100);
				cal=cal+(cal*12/100); 
				String newrate=driver.findElementByXPath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/div/div/div[3]/strong").getText();
				System.out.println(newrate);
				String newreprate=newrate.replace("₹ ", "");
				int newreprate1=Integer.parseInt(newreprate);
				if(cal==newreprate1) {
					//System.out.print("rate same");
					reportStep("rate same","pass");
				}
				else {
					//ystem.out.print("not same");
					reportStep("not same","pass");
				}
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				//System.err.println("The element with xpath is not found in DOM");
				reportStep("The element with xpath is not found in DOM","fail");
				
			}
		   // finally {
		    //	takeSnap();
		   // }
		    

		
	}

	public void switchToFrameByXpath(String xpath) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(xpath);
			reportStep("The browser switched to frame with xpath "+xpath,"pass",false);
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			reportStep("The browser can't able to switchto frame as there is no such frame","fail",false);
		}

		
		
	}
	public void clickDropDownByXpath(String xpathVal, String Name) {
		// TODO Auto-generated method stub
		try {
			String xpathLatest = null;
			if(xpathVal.contains("$option$")) {
				xpathLatest=xpathVal.replace("$option$", Name);
			}			
			driver.findElementByXPath(xpathLatest).click();
			reportStep("The option with name "+Name+" clicked succesfully","pass");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	
	
	}
}

	

