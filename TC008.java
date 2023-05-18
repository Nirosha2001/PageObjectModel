package testcases;

import org.testng.annotations.Test;

import utils.DP008;
import wrappers.GenericWrappers;

public class TC008 extends GenericWrappers {
@Test(dataProvider = "fetchdata",dataProviderClass = DP008.class)	
	public void bookCoach(String userid,String password,String confirmpaswrd,String seqqstn,String secans,String dob,String email,String occupation,String firstname,String midlename,String lastname,String nationality,String flatno,String street,String area,String country,String mobile,String pincode,String offflat,String offstreet,String offarea,String offcountry,String offmobile,String offpincode) {
	int seq_qstn=Integer.parseInt(seqqstn);
	int nationality1=Integer.parseInt(nationality);
	invokeApp("chrome","https://www.irctc.co.in/nget/train-search");
	clickByLink("HOLIDAYS");
	clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]");
	clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span");
	switchToLastWindow();
	wait(3000);
	clickById("sidebarCollapse");
	wait(3000);
	clickByLink("Book Your Coach/Train");
	wait(3000);
	clickByLink("New User? Signup");
	wait(3000);
	enterById("userId",userid);
	enterById("password",password);
	enterById("cnfPassword",confirmpaswrd);
	wait(3000);
	selectIndexById("secQstn",seq_qstn);
	enterById("secAnswer",secans);
	enterById("dateOfBirth",dob);
	clickById("gender0");
	clickById("maritalStatus0");
	enterById("email",email);
	selectVisibileTextById("occupation",occupation);
	enterById("fname",firstname);
	enterById("mname",midlename);
	enterById("lname",lastname);
	wait(3000);
	selectIndexById("natinality",nationality1);
	enterById("flatNo",flatno);
	enterById("street",street);
	enterById("area",area);
	selectValueById("country",country);
	enterById("mobile",mobile);
	enterById("pincode",pincode);
	clickById("sameAddresses1");
	enterById("flatNoOffice",offflat);
	enterById("streetOffice",offstreet);
	enterById("areaOffice",offarea);
	selectValueById("countryOffice",offcountry);
	enterById("mobileOffice",offmobile);
	enterById("pincode",offpincode);
	
	
	
		
	}

}
