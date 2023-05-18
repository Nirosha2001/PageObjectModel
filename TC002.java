package testcases;

import org.testng.annotations.Test;

import utils.DP002;
import wrappers.GenericWrappers;

public class TC002 extends GenericWrappers {
@Test(dataProvider="fetchdata", dataProviderClass = DP002.class)	
	public void irctcRegistration(String username,String password,String confirmpassword,String firstname,String middlename,String lastname,String country,String email,String mobile,String nationality,String address1,String address2,String address3,String pincode,String state,String district,String post,String resphone,String offaddres1,String offadress2,String offadress3,String offpincode,String offstate,String offdistrict,String offpost,String offphone ) {
	invokeApp("chrome","https://www.irctc.co.in/nget/train-search");
	wait(3000);
	clickByLink("REGISTER");
	wait(3000);
	enterById("userName",username);
	enterById("usrPwd",password);
	enterById("cnfUsrPwd",confirmpassword);
	wait(3000);
	clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[2]/span");
	clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li/span");
	wait(3000);
	clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[2]/span");
	clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li/span");
	enterByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input","AJBS");
	clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
	wait(3000);
	enterById("firstName",firstname);
	enterById("middleName",middlename);
	enterById("lastname",lastname);
	wait(3000);
	clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[2]/span");
	clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li/span");
	wait(3000);
	clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/input");
	clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr[2]/td[1]");
    clickByXpath("//*[@id=\"unmarried\"]/div");
    wait(3000);
	selectByXpathVisbleText("//*[@id=\"ui-tabpanel-1\"]/div/div[8]/select",country);
	clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[9]/p-selectbutton/div/div[2]/span");
	enterById("email",email);
	enterById("mobile",mobile);
	wait(3000);
	selectByXpathVisbleText("//*[@id=\"ui-tabpanel-1\"]/div/div[13]/select",nationality);
	clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
	enterById("resAddress1",address1);
	enterById("resAddress2",address2);
	enterById("resAddress3",address3);
	enterByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[4]/input",pincode);
	enterById("resState",state);
	wait(3000);
	selectByXpathVisbleText("//*[@id=\"ui-tabpanel-2\"]/div/div[6]/select",district);
	wait(3000);
	selectByXpathVisbleText("//*[@id=\"ui-tabpanel-2\"]/div/div[7]/select",post);
	enterById("resPhone",resphone);
	clickById("no");
	enterById("offAddress1",offaddres1);
	enterById("offAddress2",offadress2);
	enterById("offAddress3",offadress3);
	enterById("offPinCode",offpincode);
	enterById("offState",offstate);
	wait(3000);
	selectByXpathVisbleText("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[7]/select",offdistrict);
	wait(3000);
	selectByXpathVisbleText("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[8]/select",offpost);
	enterById("offPhone",offphone);
	
}
	

	
}



