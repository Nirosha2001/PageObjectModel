package revision;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IndianFrroRevision {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://indianfrro.gov.in/frro/FormC/accom_reg.jsp?t4g=B1LX657S");
        driver.findElementById("u_id").sendKeys("Hariharanpilla1");
        driver.findElementById("u_pwd").sendKeys("AadiSakthi@01");
        driver.findElementById("u_repwd").sendKeys("AadiSakthi@01");
        WebElement seqqstn=driver.findElementById("u_secques");
        Select sc=new Select(seqqstn);
        sc.selectByValue("4");
        driver.findElementById("u_secans").sendKeys("adyar");
        driver.findElementById("u_name").sendKeys("Achuthanpillai");
        WebElement gender=driver.findElementById("u_gender");
        Select ge=new Select(gender);
        ge.selectByVisibleText("Female");
        driver.findElementById("u_dob").sendKeys("10/12/2004");
        driver.findElementById("u_designation").sendKeys("Quality Analyst");
        driver.findElementById("u_emailid").sendKeys("hariharan201@gmail.com");
        driver.findElementById("u_mobile").sendKeys("7834210984");
        driver.findElementById("u_phone").sendKeys("7653210952");
        WebElement nation =driver.findElementById("u_nationality");
        Select nt=new Select(nation);
        nt.selectByIndex(0);
        driver.findElementById("name").sendKeys("Hariharan Book store");
        driver.findElementById("capacity").sendKeys("600");
        driver.findElementById("address").sendKeys("opp to Anadha bhavan,adyar");
        WebElement state=driver.findElementById("state");
        Select st =new Select(state);
        st.selectByVisibleText("TAMIL NADU");
        Thread.sleep(3000);
        WebElement City=driver.findElementById("city_distr");
        Select ct =new Select(City);
        ct.selectByVisibleText("CHENNAI");
        Thread.sleep(3000);
        WebElement frro= driver.findElementById("frrodata");
        Select fr=new Select(frro);
        fr.selectByValue("S737");
        Thread.sleep(3000);
        WebElement accomadation =driver.findElementById("acco_type");
        Select ac =new Select(accomadation);
        ac.selectByVisibleText("Dharmshala");
        Thread.sleep(3000);
        WebElement acgrade = driver.findElementById("star_rat");
        Select ag =new Select(acgrade);
        ag.selectByValue("4s");
        driver.findElementById("email").sendKeys("hariharanbook@gmail.com");
        driver.findElementById("mcontact").sendKeys("7843562104");
        driver.findElementById("contact").sendKeys("7456789104");
        driver.findElementByName("name_o").sendKeys("Krishnan");
        driver.findElementByName("address_o").sendKeys("chitilangeri po,alathur");
        WebElement stateoff=driver.findElementById("state_o");
        Select stoff=new Select(stateoff);
        stoff.selectByIndex(18);
        Thread.sleep(3000);
        WebElement cityoff=driver.findElementById("citydistr_o");
        Select ctoff=new Select(cityoff);
        ctoff.selectByValue("10D");
        driver.findElementByName("emailid_o").sendKeys("krishnan01@gmail.com");
        driver.findElementByName("phoneno_o").sendKeys("7856432105");
        driver.findElementByName("add").click();
        driver.findElementByName("name_o").sendKeys("aryaputhra");
        driver.findElementByName("address_o").sendKeys("kalekkad po,soahan Bridge");
        WebElement state1off=driver.findElementById("state_o");
        Select st1off=new Select(state1off);
        st1off.selectByVisibleText("KARNATAKA");
        Thread.sleep(3000);
        WebElement city1off=driver.findElementById("citydistr_o");
        Select ct1off=new Select(city1off);
        ct1off.selectByValue("15D");
        driver.findElementByName("emailid_o").sendKeys("aryaputhra01@gmail.com");
        driver.findElementByName("phoneno_o").sendKeys("7854323210");
        driver.findElementByName("add").click();
        driver.findElementByName("name_o").sendKeys("suryalilly");
        driver.findElementByName("address_o").sendKeys("behrm po,hill palace");
        WebElement state2off=driver.findElementById("state_o");
        Select st2off=new Select(state2off);
        st2off.selectByIndex(12);
        Thread.sleep(3000);
        WebElement city2off=driver.findElementById("citydistr_o");
        Select ct2off=new Select(city2off);
        ct2off.selectByVisibleText("SURAT");
        driver.findElementByName("emailid_o").sendKeys("surylilly01@gmail.com");
        driver.findElementByName("phoneno_o").sendKeys("8570135671");
        driver.quit();
        
        
        
        
        
        
	}

}