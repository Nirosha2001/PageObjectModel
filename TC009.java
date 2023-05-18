package testcases;

import org.testng.annotations.Test;



import utils.DP009;
import wrappers.GenericWrappers;

public class TC009 extends GenericWrappers {
@Test(dataProvider = "fetchdata",dataProviderClass =DP009.class)
	public void sscRegistration(String aadhar,String verifyaadhar,String name,String verifyname,String fathername,String verifyfather,String mother,String verifymother,String dob,String verifydob,String education,String verifyeducation,String rollno,String verifyrollno,String year,String verifyyear,String qualification,String mob,String verifymob,String email,String verifyemail,String state) {
    
	int passout_year1=Integer.parseInt(year);
    int passout_year2=Integer.parseInt(verifyyear);
	invokeApp("chrome","https://ssc.nic.in/registration/home");
	clickById("rbAadharYes");
	enterById("AadharNumber",aadhar);
	enterById("VerifyAadharNumber",verifyaadhar);
	enterById("Name",name);
	enterById("VerifyName",verifyname);
	enterById("FatherName",fathername);
	enterById("VerifyFatherName",verifyfather);
	enterById("MotherName",mother);
	enterById("VerifyMotherName",verifymother);
	enterById("DateOfBirth",dob);
	enterById("VerifyDateOfBirth",verifydob);
	wait(3000);
	selectVisibileTextById("EducationBoard",education);
	selectVisibileTextById("ddlEducationBoard",verifyeducation);
	enterById("SecondaryRollNum",rollno);
	enterById("VerifySecondaryRollNum",verifyrollno);
	wait(3000);
	selectIndexById("Yearofpassing", passout_year1);
    selectIndexById("ddlYearofpassing",passout_year2 );
    clickById("rbFeMale");
    clickById("rbVerifyFeMale"); 
	wait(3000);
	selectValueById("Levelofeducationqualification", qualification);
	enterById("MobileNum",mob);
	enterById("VerifyMobileNum",verifymob);
	enterById("EmailID",email);
	enterById("VerifyEmailID",verifyemail);
	wait(3000);
	selectValueById("OriginState",state);
	
	
	
	

    
	}



}
