package wrappers;

import java.io.File;

import java.io.IOException;
import java.util.Set;

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

public class GenericWrappers implements Wrappers {
	
	RemoteWebDriver driver;
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
			System.out.println("The browser "+ browser+" is launched with given url "+url+" succesfully");
		} catch (SessionNotCreatedException e) {
			// TODO Auto-generated catch block
			System.err.println("The browser "+browser+" is not launched due to session not created error");
		}
		  catch (InvalidArgumentException e) {
			// TODO: handle exception
			  System.err.println("The browser "+browser+" is not launched due to wrong url as url does not contain https/https");
		}
		  catch (WebDriverException e) {
			// TODO: handle exception
			  System.err.print("The browser "+browser+" is not launched due unknown error ");
		}
		finally {
			takeSnap();
		}
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("The element with id "+idValue+" is entered with data "+data);
			
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.print("The element with id "+idValue+" is not found in DOM");
		}
		 catch (ElementNotVisibleException e) {
			// TODO: handle exception
				System.err.print("The element with id "+idValue+" is not visible in application");
 
		}
		 catch (ElementNotInteractableException e) {
			// TODO: handle exception
				System.err.print("The element with id "+idValue+" is not interactable in application");

		 }
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.print("The element with id "+idValue+" is not stable in application");   
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.print("The element with id "+idValue+"is not entered with data "+data+" as unexpected alert opened");   

		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.print("The element with id "+idValue+" is not entered with data "+data+" due to unknown error");
		}
		finally {
			takeSnap();
		}
	}


	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println("The element with name "+nameValue+" is entered with data "+data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with name "+nameValue+" is not found in DOM");
		}
		  catch (ElementNotVisibleException e) {
			// TODO: handle exception
			  System.err.println("The element with name "+nameValue+" is not visible in Application");
		}
		  catch (ElementNotInteractableException e) {
			// TODO: handle exception
			  System.err.println("The element with name "+nameValue+" is not interactable in Application");
		}
		  catch (StaleElementReferenceException e) {
			// TODO: handle exception
			  System.out.println("The element with name "+nameValue+" is not stable in application");
		}
		  catch (UnhandledAlertException e) {
			// TODO: handle exception
			  System.out.println("The element with name "+nameValue+" is not not entered with data "+data+" as unexpected alert opened");
		}
		  catch (WebDriverException e) {
			// TODO: handle exception
			  System.out.println("The element with name "+nameValue+" is not entered with data "+data+" due to unknown error");
		}
		finally {
			takeSnap();
	}
		
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println("The element with Xpath "+xpathValue+" is entered with data "+data);
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath "+xpathValue+" is not entered with data "+data+" as unexpexted alert opened");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathValue+" is not found in DOM");
		}
		 catch (ElementNotVisibleException e) {
			// TODO: handle exception
			 System.err.println("The element with xpath "+xpathValue+" is not visible in Application");
		}
		 catch (ElementNotInteractableException e) {
			// TODO: handle exception
			 System.err.println("The element with xpath "+xpathValue+" is not interactable in Application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathValue+" is not stable in Application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathValue+"is not entered with data "+data+" due to unknown errors");
		}
		finally {
			takeSnap();
	}
		
	}

	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String browsertitle=driver.getTitle();
			if(browsertitle.equals(title)) {
				System.out.println("The title of the page "+browsertitle+" is matched with expected title "+title);
			}
			else {
				System.out.println("The title of page "+browsertitle+" is not matched with expected title "+title);
			}
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			System.err.print(" The title of page "+ title +"cannot be verified due to unexpected alert occured");
			
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println(" The title of page "+title+" cannot be verified due to unknown errors");
		}
		finally {
			takeSnap();
		}
		
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String verifytext=driver.findElementById(id).getText();
			if(verifytext.equals(text)) {
				System.out.println("The element with id "+id+" contains text "+verifytext+" is matched with given text "+text);
			}
			else {
				System.out.println("The element with id "+id+" contains text "+verifytext+" is not matched with given text "+text);
			}
		} 
		catch(NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+id+" is not found in DOM");
		 }
		  catch (ElementNotVisibleException e) {
			// TODO: handle exception
			  System.err.println("The element with id "+id+" is not visible in Application");
		}
		  catch(ElementNotInteractableException e) {
			  System.err.println("The element with id "+id+" is not interactable in application");
		  }
		  catch (StaleElementReferenceException e) {
			// TODO: handle exception
			  System.err.println("The element with id "+id+" is not stable in application");
		}
		  catch (UnhandledAlertException e) {
			  System.err.println("The element with id "+ id+" cannot be verified due to unexpected alert occured");
			// TODO: handle exception
		  }
		  catch (WebDriverException e) {
			// TODO: handle exception
			  System.err.println("The element with id "+id+" cannot be verified due to unknown error");
		}
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String text2=driver.findElementByXPath(xpath).getText();
			
			if(text2.equals(text)) {
				System.out.println("The element with xpath "+xpath+" contains text "+text2+" is matched with given text "+text);
			}
			else {
				System.out.println("The element with xpath" +xpath+" contains text "+text2+" is not matched with given text "+text);
			}
		}
		catch (NoSuchElementException e) {
				// TODO: handle exception
			System.err.println("The element with xpath "+xpath+" is not found in DOM")	;
			}
		 catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath "+xpath+" is not visible in Application");
			
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpath+" is not stable in Application");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpath+" cannot be verified due to unexpected alert occured");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpath+" cannot be verified due to unknown error occured");
		}
		finally {
			takeSnap();
		}
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String text3=driver.findElementByXPath(xpath).getText();
			if(text3.contains(text)) {
				System.out.println("The element with xpath "+xpath+" contains text "+text3+" is matched with given text "+ text);
			}
			else {
				System.out.println("The element with xpath "+xpath+" contains text "+text3+" is not matched with given text "+text);
			}
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath "+xpath+" is not visible in application");
			
		}
		 catch(NoSuchElementException e) {
			 System.err.println("The element with xpath "+xpath+" is not found in DOM");
		 }
		 catch (StaleElementReferenceException e) {
			// TODO: handle exception
			 System.err.println("The element with xpath "+ xpath+ "is not stable in Application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpath+" is not interactable in Application");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpath+" cannot be verified due to unexpected alert occured");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpath+" cannot be verified due to unknown errors");
		}
		finally {
			takeSnap();
		}
		
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			System.out.println("The element with id "+id+" is clicked");
		} catch (ElementClickInterceptedException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+id+" is not clickable");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.print("The element with id "+id+" is not found in DOM");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.print("The element with id "+id+" is not interactable in Application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not stable in Application");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.print("The element with id "+id+" is not clicked"+" due to unexpected alert occured");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not clicked due to some unknown errors");
		}
		finally {
			takeSnap();
		}
		
			
		}
		
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			System.out.println("The element with classvalue "+classVal+" is clicked");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.print("The element with classvalue "+classVal+" is not found in DOM");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.print("The element with classvalue "+classVal+" is not clicked due to unexpected alert occured");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element eith classVal "+classVal+" is not clickable");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.print("The element with classvalue "+classVal+" is not interactable in Application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with classvalue "+classVal+" is not stable in Application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with classvalue "+classVal+" is not clicked due to some unknown errors");
		}
		finally {
			takeSnap();
		}
		
			
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(name).click();
			System.out.println("The element with name "+ name+" is clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		    System.err.println("The element with name "+name+" is not found in Dom");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with name "+name+" is not visible in application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with name "+name+" is not interactable in application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with name "+name+" is not stable in application");

		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("The element with name "+name+"cannot be clicked due to unexpected alert occured");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with name "+name+" cannot be clicked due to unknown error occured");
		}
		finally {
			takeSnap();
		}
	}

	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
            System.out.println("The element with linktext "+name+" is clicked");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
		    System.err.println("The element with linktext "+name+" is not found in Dom");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with linktext "+name+" is not clickable");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("The element with linktext "+name+" is not clicked due to unexpected alert occured");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with linktext "+name+" is not interactable in application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with linktext "+name+" is not stable in Application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with linktext "+name+" not clicked due to unknown error occured");
		}
		finally {
			takeSnap();
		}
		
		
	}

	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			System.out.println("The element with linktext "+name+" is clicked");
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with linktext "+name+" is not visible in Application" );
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("The element with linktext "+name+" is not found in Dom");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with linktext "+name+" is not clickable");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with linktext "+name+" is not interactable in application");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.print("The element with linktext "+name+"is not clicked due to unexpected alert occured");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with linktext "+name+" is not stable in Application");

		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.print("The element with linktext "+name+" is not clicked due to unknown error occured");
		}
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The element with xpath "+xpathVal+" is clicked");
		}
		  catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not found in DOM");
		}
		  catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not clicked due to unexpected alert occured");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not clickable");
		}
		  catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not interactable in Application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not stable in Application");
		}
		  catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not clicked due to some unknown errors");
		}
		finally {
			takeSnap();
		}

		
	}

	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("The element with xpath "+xpathVal+" is clicked");
		} 
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not visible in application");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.print("The element with xpath "+xpathVal+" is not found in DOM");
		}
		catch (ElementClickInterceptedException e) {
			// TODO: handle exception
			System.err.print("The element with "+xpathVal+" is not clickable");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.print("The element with xpath "+xpathVal+" is not interactable in Application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.print("The element with xpath "+xpathVal+" is not stable in Application");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.print("The element with xpath "+xpathVal+" is not clicked due to unexpected alert occured");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not clicked due to some unknown errors");
		}
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String text=null;
		try {
			 text=driver.findElementById(idVal).getText();
			 System.out.println(text);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+idVal+" is not found in DOM");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id"+idVal+" is not visible in Application");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idVal+" cannot get due to unexpected alert occured");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idVal+" is not interactable in Application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idVal+" is not stable in Application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with id "+idVal+" cannot get due to unknown errors");
		}
		finally {
			takeSnap();
		}
		
		return text ;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String text=null;
		try {
			text=driver.findElementByXPath(xpathVal).getText();
			System.out.println("The element with xpath "+xpathVal+" contains text "+text);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath "+xpathVal+" is not found in DOM");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not visible in Application");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not stable in Application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" is not interacatable in Application");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+" cannot get text due to unexpected alert occured");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpathVal+"cannot get text due to unknown error occured");
			
		}
		finally {
			takeSnap();
		}
		return text;
		
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement drpdownvisible=driver.findElementById(id);
			Select sc=new Select(drpdownvisible);
			sc.selectByVisibleText(value);
			System.out.println("The element with id "+id+" is selected with visible value "+value);
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+id+ "is not selectable");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			 System.err.println("The element with id "+id +"cannot be selected due to unexpected alert opened");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+ "is not visible in application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+ "is not interactable");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+"is not not found in DOM");
		}
		catch (StaleElementReferenceException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not stable in Application");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.print("The element with id "+id+" is not selected to some unknown error occured");
		}
		finally {
			takeSnap();
		}  
			// TODO Auto-generated catch block
		
		
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdownindex=driver.findElementById(id);
			Select sc=new Select(dropdownindex);
			sc.selectByIndex(value);
			System.out.println("The element with id "+id+" is selected with index "+value);
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+id+" is not selectable");
		}
		 catch (UnhandledAlertException e) {
			// TODO: handle exception
			 System.err.println("The element with id "+id +" cannot be selected due to unexpected alert opened");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+"is not visible in application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not interactable ");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not not found in DOM ");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.print("The element with id "+id+" is not selected to some unknown error occured");
		}
		finally {
			takeSnap();
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
			System.err.println("can't able to switch to parent window as there is no such window");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("can't able to switch to parent window due to unexpected alert occured");
		}
		
		  catch (WebDriverException e) {
			// TODO: handle exception
			  System.err.println("can't able to switch to parent window due to unknown error occured");
		}
		finally {
			takeSnap();
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
			System.out.println("The browser switched in to last window");
		} catch (NoSuchWindowException e) {
			// TODO Auto-generated catch block
			System.err.println("can't able to switch to last window as there is no such window");
		}
		 catch (UnhandledAlertException e) {
			// TODO: handle exception
			 System.err.println("can't able to switch to last window due to unexpected alert occured");
		}
		  catch (WebDriverException e) {
			// TODO: handle exception
			  System.err.println("can't able to switch to last window due to unknown error ");
		}
		finally {
			takeSnap();
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
			System.out.println("alert accepted succesfully");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("alert is not present");
		}
		
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("can't able to accept alert due to unknown error occured");
		}
		
	}
	

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("cancelled alert succesfully");
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("alert is not present");
					}		  
		catch (WebDriverException e) {
			// TODO: handle exception
			  System.err.println("can't able to perform cancel operation due to unknown error occured");
		}
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		String alert=null;
		try {
			alert=driver.switchTo().alert().getText();
			System.out.println(alert);
		} catch (NoAlertPresentException e) {
			// TODO Auto-generated catch block
			System.err.println("alert is not present");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("unknown error occured");
		}
		return alert;
		
	
		
	}

	public void takeSnap() {
		// TODO Auto-generated method stub
		try {
			File tmp=driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("./screenshots/snap"+i+".png");
			FileUtils.copyFile(tmp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("cannot able to take screenshot due to problem in accessing file");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("cannot able to take screenshot due to unknown error occured");
		}
		i++;
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.close();
			System.out.println("closed current browser");
		} 
		
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.println("cannot able gto close browser due to unknown error occured");
		}
	}
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
			System.out.println("closed all browsers");
		}
		
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.print("Cannot able to close all browsers due to unknown error");
		}

		
			}

	public void wait(int time) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println("Error throws on waiting");
			
			
		}
		
	}


	public void selectByXpathVisbleText(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			WebElement dropdownindex=driver.findElementByXPath(xpath);
			Select sc=new Select(dropdownindex);
			sc.selectByVisibleText(text);
			System.out.println("The element with xpath"+xpath+" is selected with value "+text);
		} catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with xpath "+xpath+" is not selectable");
		}
		 catch (UnhandledAlertException e) {
			// TODO: handle exception
			 System.err.println("The element with xpath "+xpath +" cannot be selected due to unexpected alert opened");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpath+"is not visible in application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpath+" is not interactable ");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("The element with xpath "+xpath+" is not not found in DOM ");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.print("The element with xpath "+xpath+" is not selected to some unknown error occured");
		}
		finally {
			takeSnap();
		}
			 
		
	}

	public void switchToFrame(String id) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(id);
			System.out.println("The browser switched to frame with id "+id);
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			System.err.println("can't able to switch to frame as there is no such frame");
		}
		catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("can't able to switch to frame due to unexpected alert occured");
		}
		
		  catch (WebDriverException e) {
			// TODO: handle exception
			  System.err.println("can't able to switch to frame due to unknown error occured");
		}
		finally {
			takeSnap();
		}
	}

	public void switchToDefault() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().defaultContent();
			System.out.println("browser switched in to default content");
		} catch (UnhandledAlertException e) {
			// TODO: handle exception
			System.err.println("can't able to switch default content due to unexpected alert occured");
		}
		
		  catch (WebDriverException e) {
			// TODO: handle exception
			  System.err.println("can't able to switch to default content  due to unknown error occured");
		}
		finally {
			takeSnap();
		}
		
	}

	public void refresh() {
		// TODO Auto-generated method stub
		try {
			driver.navigate().refresh();
			System.out.println("page got refreshed");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("can't able to refresh due to unknown error occured");
		}
		
		
	}

	public void promptEnterData(String text) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().sendKeys(text);
			System.out.println(" In alert text box entered with data "+text);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("page can't refersh due to unknown error occured");
		}
		
	}

	public void selectValueById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			WebElement st=driver.findElementById(id);
			Select sc= new Select(st);
			sc.selectByValue(text);
			System.out.println("The element with id "+id+" is selected with value "+text);
		}  catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with id "+id+" is not selectable");
		}
		 catch (UnhandledAlertException e) {
			// TODO: handle exception
			 System.err.println("The element with id "+id +" cannot be selected due to unexpected alert opened");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+"is not visible in application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not interactable ");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("The element with id "+id+" is not not found in DOM ");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.print("The element id "+id+" is not selected to some unknown error occured");
		}
		finally {
			takeSnap();
		}
		
		
	}

	public void selectValueByName(String name, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement st=driver.findElementByName(name);
			Select sc= new Select(st);
			sc.selectByValue(value);
			System.out.println("The element with name "+name+" is selected with value "+value);
		}  catch (ElementNotSelectableException e) {
			// TODO Auto-generated catch block
			System.err.println("The element with name "+name+" is not selectable");
		}
		 catch (UnhandledAlertException e) {
			// TODO: handle exception
			 System.err.println("The element with name "+name +" cannot be selected due to unexpected alert opened");
		}
		catch (ElementNotVisibleException e) {
			// TODO: handle exception
			System.err.println("The element with name "+name+"is not visible in application");
		}
		catch (ElementNotInteractableException e) {
			// TODO: handle exception
			System.err.println("The element with name "+name+" is not interactable ");
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			System.err.println("The element with name "+name+" is not not found in DOM ");
		}
		catch (WebDriverException e) {
			// TODO: handle exception
			System.err.print("The element with name "+name+" is not selected to some unknown error occured");
		}
		finally {
			takeSnap();
		}
		
	}

	public void gstCal(String xpath1,String xpath2,String xpath3,String text1,String text2,String text3) {
		// TODO Auto-generated method stub
		    try {
				String fullday=getTextByXpath(xpath1);
				String frstrep=fullday.replace(text1+text2,"");
				String secrep=frstrep.replace(text3,"");
				int days =Integer.parseInt(secrep);
				String rate=getTextByXpath(xpath2);
				String price=rate.replace("₹","");
				int newprice=Integer.parseInt(price);
				int cal=0;
				cal=(int) Math.ceil((double)Math.round(days*newprice*1.12*100)/100);
				cal=cal+(cal*12/100); 
				String newrate= getTextByXpath(xpath3);
				String newreprate=newrate.replace("₹", "");
				int newreprate1=Integer.parseInt(newreprate);
				if(cal==newreprate1) {
					System.out.print("rate same");
				}
				else {
					System.out.print("not same");
				}
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				System.err.println("The element with xpath is not found in DOM");
			}
		    finally {
		    	takeSnap();
		    }

		
	}

		
	
	}

	

