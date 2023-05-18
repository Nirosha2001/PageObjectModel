package testcases;

import org.testng.annotations.Test;

import utils.DP012;
import wrappers.GenericWrappers;

public class TC012 extends GenericWrappers {
     @Test(dataProvider="fetchData",dataProviderClass = DP012.class)
     public void facebookSignUp(String firstName,String lastName,String emailID,String confirmationEmailId,String password,String date,String month,String dob_year){
    	 int date_dob=Integer.parseInt(date);
    	 int month_dob=Integer.parseInt(month);
         invokeApp("chrome","https://www.facebook.com");
         clickByLinkNoSnap("Create new account");
         wait(3000);
         enterByName("firstname",firstName);
         enterByName("lastname",lastName);
         enterByName("reg_email__",emailID);
         enterByName("reg_email_confirmation__",confirmationEmailId);
         enterById("password_step_input",password);
         selectIndexById("day", date_dob);
         selectIndexById("month",month_dob);
         selectValueById("year",dob_year);
         clickByXpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input");
         wait(3000);
         
         
         

}
}