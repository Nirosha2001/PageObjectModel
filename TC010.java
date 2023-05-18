package testcases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class TC010 extends GenericWrappers {
@Test	
	  public void gst(String email,String mobile,String place,String numadult,String title,String firstname,String lastname,String country,String state,String gst,String hotelname,String verifytext) {
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
		    getTextByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[1]/div/h5");
		    getTextByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/strong");
		    wait(3000);
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
		    clickByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[3]/div/div/div/form/div[9]/button[2]");
		    verifyTextByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[1]/div/h5",hotelname);
		    gstCal("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/span","/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[2]/div[2]/div/div/div[1]/strong", "/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/div/div/div[3]/strong","3 Guests", "1 Room", "night");
		    clickByName("agree");
			clickByXpath("/html/body/app-root/app-fulllayout/app-summary/div[2]/div/div/div[2]/div[2]/form/div[2]/button[2]");
			clickByXpath("//*[@id=\"modalOTP\"]/div/div/form/div/div[2]/button");
			verifyTextByXpath("//*[@id=\"modalOTP\"]/div/div/form/div/div[1]/span",verifytext);
			closeAllBrowsers();
		}

		}



