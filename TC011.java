package testcases;

import org.testng.annotations.Test;

import utils.DP0011;
import wrappers.GenericWrappers;

public class TC011 extends GenericWrappers {
@Test(dataProvider = "fetchdata",dataProviderClass = DP0011.class)
     public void bookHotel(String email,String mobile,String place,String numadult,String title,String firstname,String lastname,String country,String state,String gst,String gstnumber,String companyname,String companyaddress,String verifytext) {
	    invokeApp("chrome","https://www.irctc.co.in/nget/train-search");
	    clickByLink("HOLIDAYS");
	    clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]");
	    clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span");
	    wait(3000);
	    switchToLastWindow();
	    wait(3000);
	    clickByXpath("/html/body/app-root/accommodation/div[2]/div[1]/ul/li[2]/a/span");
	    wait(3000);
	    switchToLastWindow();
	    wait(3000);
	    clickByLink("Login");
	    wait(3000);
	    clickByLink("Guest User Login");
	    wait(3000);
	    enterByName("email",email);
	    enterByName("mobileNo",mobile);
	    clickByXpath("//*[@id=\"profile\"]/div/form/div[3]/button");
	    wait(3000);
	    enterById("filterText",place);
	    clickByXpath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[1]/searchbox/div/ul/li[1]/a");
	    wait(3000);
	    clickByName("dt12");
	    clickByXpath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[4]/td[1]");
	    wait(3000);
	    clickByName("dt13");
	    clickByXpath("//*[@id=\"owl-dt-picker-1\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[4]/td[3]");
	    wait(3000);
	    clickByXpath("//*[@id=\"user-data-wrapper-id\"]");
	    wait(3000);
	    selectValueByName("hotelAdult",numadult);
	    clickByXpath("//*[@id=\"user-data-wrapper\"]/div[2]/button");
	    wait(3000);
	    clickByXpath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[5]/button");
	    switchToLastWindow();
	    clickByXpath("/html/body/app-root/app-fulllayout/app-hotellist/div[2]/div/div/div[3]/div[2]/a/div/div[2]");
	    switchToLastWindow();
	    getTextByXpath("/html/body/app-root/app-fulllayout/app-hotellist/div[2]/div/div/div[3]/div[2]/a/div/div[2]/div/h5");
	    getTextByXpath("/html/body/app-root/app-fulllayout/app-hotellist/div[2]/div/div/div[3]/div[2]/a/div/div[3]/div/strong");
	    clickByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[3]/button");
	    wait(3000);
	    selectValueByName("title",title);
	    enterByName("firstName",firstname);
	    enterByName("lastName",lastname);
	    wait(3000);
	    selectValueByName("country",country);
	    wait(3000);
	    selectValueByName("state",state);
	    wait(3000);
	    selectValueByName("gst",gst);
	    wait(3000);
	    enterByName("gstNumber",gstnumber);
	    enterByName("companyName",companyname);
	    enterByName("companyAddress",companyaddress);
	    clickByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[12]/button[2]");
	    verifyTextByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[9]/div/span",verifytext);
	    	
	    
	    
	
}

}
