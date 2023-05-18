package testcases;
import org.testng.annotations.Test;
import utils.DP001;
import wrappers.GenericWrappers;

public class TC001 extends GenericWrappers{
@Test(dataProvider="fetchData",dataProviderClass=DP001.class)
   public void phpTravels(String firstname,String lastname,String email,String phone,String companyname,String address1,String address2,String city,String state,String pincode,String country,String companyphone,String password ) {
	invokeApp("chrome", "https://www.phptravels.org/register.php");
	enterById("inputFirstName",firstname);
	enterById("inputLastName",lastname);
	enterById("inputEmail",email);
	wait(3000);
    clickByXpathNoSnap("//*[@id=\"containerNewUserSignup\"]/div[1]/div/div/div[4]/div/div/div/div/div[2]");
    clickByXpath("//*[@id=\"containerNewUserSignup\"]/div[1]/div/div/div[4]/div/div/div/ul/li[102]");
    enterById("inputPhone",phone);
    enterById("inputCompanyName",companyname);
    enterById("inputAddress1",address1);
    enterById("inputAddress2", address2);
    enterById("inputCity",city);
    enterById("stateinput",state);
    enterById("inputPostcode",pincode);
    enterById("inputCountry",country);
    enterById("customfield2",companyphone);
    enterById("inputNewPassword1", password);
    clickByXpath("//*[@id=\"frmCheckout\"]/div[3]/div/div/div/span[3]");
	
}
  
}
