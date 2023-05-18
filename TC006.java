package testcases;

import org.testng.annotations.Test;

import utils.DP006;
import wrappers.GenericWrappers;

public class TC006 extends GenericWrappers {
@Test(dataProvider = "fetchdata",dataProviderClass =DP006.class)
	public void indianFrro(String userid,String password,String confirmpassword,String seqqstn,String secans,String name,String gender,String dob,String designation,String emailid,String mobile,String phone,String nationality,String username,String capacity,String address,String state,String district,String acctype,String star,String offemail,String offmobile,String offname,String offaddress,String offstate,String offcity,String offowneremail,String offphone,String offownermobile,String offname1,String offadress1,String offstate1,String offcity1,String offowneremail1,String officephone1,String officemobile1) {
	int sec_qstn=Integer.parseInt(seqqstn);
	int gender1=Integer.parseInt(gender);
	int acc_type=Integer.parseInt(acctype);
	invokeApp("chrome","https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
	wait(3000);
	clickByLink("Sign Up (Registration)");
	wait(3000);
	enterById("u_id", userid);
	enterById("u_pwd",password);
	enterById("u_repwd",confirmpassword);
	selectIndexById("u_secques",sec_qstn);
	enterById("u_secans",secans);
	enterById("u_name",name);
	selectIndexById("u_gender", gender1);
	enterById("u_dob",dob);
	enterById("u_designation",designation);
	enterById("u_emailid",emailid);
	enterById("u_mobile",mobile);
	enterById("u_phone",phone);
	selectValueById("u_nationality",nationality);
	enterById("name", username);
	enterById("capacity",capacity);
	enterById("address",address);
	wait(3000);
	selectValueById("state",state);
	wait(3000);
	selectVisibileTextById("city_distr",district);
	wait(3000);
	selectIndexById("acco_type", acc_type);
	wait(3000);
	selectVisibileTextById("star_rat",star);
	enterById("email",offemail);
	enterByName("mcontact",offmobile);
	enterByName("name_o",offname);
	enterByName("address_o",offaddress);
	selectVisibileTextById("state_o",offstate);
	wait(3000);
	selectValueById("citydistr_o",offcity);
	enterByName("emailid_o", offemail);
	enterByName("phoneno_o",offphone);
	enterByName("mobile_o",offmobile);
	clickByName("add");
	enterByName("name_o",offname1);
	enterByName("address_o",offadress1);
	selectVisibileTextById("state_o",offstate);
	wait(3000);
	selectValueById("citydistr_o",offcity1);
	enterByName("emailid_o", offowneremail1);
	enterByName("phoneno_o",officephone1);
	enterByName("mobile_o",officemobile1);
	closeAllBrowsers();
	
	
	
	
	
	
	
	
	
		
	}
}
