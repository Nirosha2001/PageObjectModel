package atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu {
	
	
	Scanner menuinput=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$',###,##0.00");
	HashMap<Integer, Account> data=new HashMap<Integer,Account>();
	
//start of getLogin	
  public void getLogin() throws InterruptedException{
		 
		boolean end=false;
		int customernumber=0;
		int accesspin=0;
		
		while(!end) {
			try {
				System.out.println("\t ");
				System.out.println("Enter the customer number if exist");
				customernumber=menuinput.nextInt();
				System.out.println();
				System.out.println("Enter the Access PinNumber");
				accesspin=menuinput.nextInt();
				
				Iterator it=data.entrySet().iterator();
				
				while(it.hasNext()) {
					Map.Entry<Integer,Account> pair=(Map.Entry)it.next();
					Account account=(Account)pair.getValue();
					if(data.containsKey(customernumber)&&accesspin==account.getPinNumber()) {
						getAccountType(account);
						end=true;
						break;
					}
					
				}
				if(!end) {
					System.out.println();
					System.out.println("Wrong Account Number or AccessPin");
					
				}
				
			}
			catch(InputMismatchException ime) {
				System.out.println("Invalid characters");
			}
		}
		
	}
  
   //close of getLogin
	    
	//start of getAccountType
	private void getAccountType(Account account) {
		boolean end=false;
		while(!end) {
			try {
				System.out.println("Select Account type you want to access");
				System.out.println();
				System.out.println("1.Checking Account");
				System.out.println("2.Savings Account");
				System.out.println("3.Exit");
				System.out.println();
				System.out.println("Enter input choice :");
				int choice=menuinput.nextInt();
				switch(choice){
				
				case 1:
					
					   getChecking(account);
					   break;
					
				case 2:
					   getSaving(account);
					   break;
				case 3:
					   end=true;
					   break;
				default:
					System.out.println("Invalid choice..Try Again!!!");
					
					
				}
				
			}
			
		catch(InputMismatchException ime){
			System.out.println("Invalid input");
		}
			
		}
	}
	//close of getAccountType
	
	//start of getSaving account
	public void getSaving(Account acc) {
		boolean end=false;
		while(!end) {
			try {
				System.out.println("\n Savings account");
				System.out.println("\t 1.view Balance");
				System.out.println("\t 2.withdraw Fund");
				System.out.println("\t 3.Deposit Fund");
				System.out.println("\t 4.Transfer Funds");
				System.out.println("\t 5.Exit");
				System.out.println("\n choice :");
				
                int selection=menuinput.nextInt();
				
				switch(selection) {
				case 1:
					     System.out.println("\n Savings account balance "+moneyFormat.format(acc.getSavingBalance()));
					     break;
				
			    case 2:
				          acc.getSavingWithdrawInput();
				          break;
				          
			    case 3:
			    	      acc.getSavingDepositInput();
			    	      break;
			    	      
			
			    case 4: 
			    	      acc.getTransferInput("savings");
			    	      break;
			    	      
			    case 5:
			    	     end=true;
			    	     break;
			    
			    default:
			    	System.out.println("Invalid choice...Try Again!!!");
				}
				
			}
			
			catch (InputMismatchException e) {
				System.out.println("Invalid choice");
				menuinput.nextInt();
				
			}
		}	
		
	}
	// close of getSavings account
	
	//start of getChecking account		
	public void getChecking(Account acc) {
		boolean end=false;
		while(!end) {
			try {
				System.out.println("\n checking account");
				System.out.println("\t 1.view Balance");
				System.out.println("\t 2.withdraw");
				System.out.println("\t 3.Deposit");
				System.out.println("\t 4.Transfer");
				System.out.println("\t 5.Exit");
				System.out.println("\n choice :");
				
				int selection=menuinput.nextInt();
				
				switch(selection) {
				case 1:
					     System.out.println("\n Checking account balance "+moneyFormat.format(acc.getCheckingBalance()));
					     break;
				
			    case 2:
				          acc.getCheckingWithdrawInput();
				          break;
				          
			    case 3:
			    	      acc.getCheckingDepositInput();
			    	      break;
			    	      
			
			    case 4: 
			    	      acc.getTransferInput("checkings");
			    	      break;
			    	      
			    case 5:
			    	     end=true;
			    	     break;
			    
			    default:
			    	System.out.println("Invalid choice...Try Again!!!");
				}
				
			}
	
			catch (InputMismatchException e) {
				System.out.println("Invalid choice");
				menuinput.nextInt();
				
			}
		}	
		
	}
	//close of getChecking account
	
	// start of create account 
	  public void createAccount() throws IOException, InterruptedException{ 
		int cst_no=0;
		boolean end=false;
		while(!end) {
			try {
			System.out.println("\n Enter your customer number");
			
			cst_no=menuinput.nextInt();
			
			Iterator it=data.entrySet().iterator();
			
			while(it.hasNext()) {
				
				Map.Entry Pair= (Map.Entry) it.next();
				
				if(!data.containsKey(cst_no)) {
					end=true;
				}
			}
			if(!end) {
				System.out.println("\t The customer number is already registerd!!!");
			}
		}
			catch (InputMismatchException e) {
				System.out.println("Invalid choice");
				menuinput.nextInt();
			}
			
		}
		System.out.println("\t Enter the PIN to register");
		
		int pin=menuinput.nextInt();
		
		data.put(cst_no, new Account(cst_no,pin));
		
		System.out.println("\t Your new account has been registered succesfully!!");
		
		System.out.println("\t Redirecting to login....!!");
		
		getLogin();
		
	}
	  // close of create account
	  
	  
	  //start of mainMenu
	  public void mainMenu() throws IOException, InterruptedException{
		  data.put(952541,new Account(952541,191904,1000,5000)); // Dummy Account number for testing
		  data.put(123,new Account(123,123,20000,50000)); // Dummy pin number for testing
		  boolean end=false;
		  while(!end) {
			  try {
				  System.out.println("\t 1.Login");
				  System.out.println("\t 2.Create Account");
				  System.out.println();
				  
				  System.out.println("choice:");
				  int choice=menuinput.nextInt();
				  System.out.println();
				  
				  switch(choice) {
				  
				  case 1:
					  getLogin();
					  end=true;
					  break;
					  
				  case 2:
					  createAccount();
					  end=true;
					  break;
				  
				  default: 
					  System.out.println("/t Invalid choice!!");
				  
			  }
		  }
		catch (InputMismatchException e) {
			System.out.println("Invalid input!!");
			menuinput.nextInt();
		}
			  
	 }
		  System.out.println("\t Thank You for visiting ATM !!");
		  menuinput.close();
		  
		  System.exit(0);// it is used completely exit from application
}// close of mainMenu
	  
	  
	  
}
	


