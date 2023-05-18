package testcases;

import org.testng.annotations.Test;

import utils.DP007;
import wrappers.GenericWrappers;

public class TC007 extends GenericWrappers {
@Test(dataProvider = "fetchdata",dataProviderClass = DP007.class)
     public void saloonCheck(String name,String organization,String address,String mobile,String email,String requestfor,String orginstation,String destination,String durationperiod,String coachdetails,String numpassenger,String numpassenger1,String charterpurpose,String service,String verifytext) {
	invokeApp("chrome","https://www.irctc.co.in/nget/train-search");
	wait(3000);
	clickByLink("HOLIDAYS");
	clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]");
	clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span");
	switchToLastWindow();
	wait(3000);
	clickById("sidebarCollapse");
	wait(3000);
	clickByLink("Charter");
	wait(3000);
	clickById("enquiry-tab");
	wait(3000);
	enterByName("name",name);
	enterByName("organization",organization);
	enterByName("address",address);
	enterByName("mobile",mobile);
	enterByName("email",email);
	selectValueByName("requestFor",requestfor);
	wait(3000);
	enterByName("originStation",orginstation);
	enterByName("destnStation",destination);
	clickByName("checkInDate");
	clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/tbody/tr[3]/td[7]/span");
	wait(3000);
	clickByName("checkOutDate");
    clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/tbody/tr[4]/td[3]/span");
    enterByName("durationPeriod",durationperiod);
    enterByName("coachDetails",coachdetails);
    enterByName("numPassenger",numpassenger);
    enterByName("numPassenger",numpassenger1);
    enterByName("charterPurpose",charterpurpose);
    enterByName("services",service);
    clickByXpath("//*[@id=\"enquiry\"]/div/form/div/div[17]/button");
    verifyTextByXpath("//*[@id=\"enquiry\"]/div/form/div/div[4]/span",verifytext);
    
    
			
			
	
	
	
}


}
