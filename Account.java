package atm;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {

	private int customernumber;
	private int pinnumber;
	private double checkingbalance=0;
	private double savingbalance=0;
	
	Scanner input=new Scanner(System.in);
	
	DecimalFormat moneyFormat= new DecimalFormat(" '$'###,##0.00"); // this is dollar
	
	private Account() {} //Default constructor
	
	//constructor overloading
	public Account(int customernumber,int pinnumber) {
		
		this.customernumber=customernumber;
		this.pinnumber=pinnumber;
	}
	
 // constructor overloading	
  public Account(int customernumber,int pinnumber,int checkingbalance,int savingbalance) {
		
		this.customernumber=customernumber;
		this.pinnumber=pinnumber;
		this.checkingbalance=checkingbalance;
		this.savingbalance=savingbalance;
	}
  
  //Getter/setter method for customer number
  
  public int setCustomerNumber(int customernumber) {
	  this.customernumber=customernumber;
	  return customernumber;
	  
  }
  public int getCustomerNumber() {
	  return customernumber;
  }
  
//Getter/setter method for pin number
  
  public int setPinNumber(int pinnumber) {
	 this.pinnumber=pinnumber;
	 return pinnumber;
  }
  
  public int getPinNumber() {
	  return pinnumber;
  }
  
//Getter/setter method for pin number
  
  public double getCheckingBalance() {
	  return checkingbalance;
	  
  }
  public double getSavingBalance() {
	  return savingbalance;
  }
  
   public double calcCheckWithdraw(double amount) {
	  
	  checkingbalance=(checkingbalance-amount);
	  return checkingbalance;
	  
  }
   public double calcSavingWithdraw(double amount) {
	  
	  savingbalance=(savingbalance-amount);
	  return savingbalance;
	  
  }
   public double calcCheckDeposit(double amount) {
		  
		  checkingbalance=(checkingbalance+amount);
		  return checkingbalance;
		  
	  }
   public double calcSavingDeposit(double amount) {
		  
		  savingbalance=(savingbalance+amount);
		  return savingbalance;
		  
	  }
   public void calcCheckTransfer(double amount) {
		  
		  checkingbalance=(checkingbalance-amount);
		  savingbalance=(savingbalance-amount);
		  
	  }
   public void calcSavingTransfer(double amount) {
	
	      checkingbalance=(checkingbalance+amount);
		  savingbalance=(savingbalance+amount);
		  
		  
	  }
   // start of getCheckingwithdraw input
   public void getCheckingWithdrawInput() {
	   boolean end=false;
	   while(!end) {
		   try {
			   System.out.println("Current saving account Balance "+moneyFormat.format(checkingbalance));
			   System.out.println("How many amount you want to withdraw ");
			   double amount=input.nextDouble();
			   if(checkingbalance-amount>0 && amount>=0) {
				   calcCheckWithdraw(amount);
				   System.out.println("\t current checking Account balance "+moneyFormat.format(checkingbalance));
				   end=true;
			   }
			   else {
				   System.out.println("Account balance cannot be negative");
			   }
			   
		   }
		   catch(InputMismatchException e) {
			System.out.println("Invalid input");
		    input.next();
		}
			   
	}
}
   // close of getCheckingWithdrawInput
   
   // start of getSavingWithdrawInput
   
   public void getSavingWithdrawInput() {
	   boolean end=false;
	   while(!end) {
		   try {
			   System.out.println("Current saving account Balance "+moneyFormat.format(savingbalance));
			   System.out.println(" amount you withdraw from savings account ");
			   double amount=input.nextDouble();
			   if(savingbalance-amount>0 && amount>=0) {
				   calcSavingWithdraw(amount);
				   System.out.println("\t current savings Account balance "+moneyFormat.format(savingbalance));
				   end=true;
			   }
			   else {
				   System.out.println("Account balance cannot be negative");
			   }
			   
		   }
		   catch (InputMismatchException e) {
			System.out.println("Invalid input");
		    input.next();
		}
			   
		   }
	   }
      // close of getSavingWithdrawInput
   
   // start of getCheckingDeposit
   
   public void getCheckingDepositInput() {
	   boolean end=false;
	   while(!end) {
		   try {
			   System.out.println("Current saving account Balance "+moneyFormat.format(checkingbalance));
			   System.out.println(" amount you withdraw from savings account ");
			   double amount=input.nextDouble();
			   if(checkingbalance+amount>0 && amount>=0) {
				   calcCheckDeposit(amount);
				   System.out.println("\t current checking Account balance "+moneyFormat.format(checkingbalance));
				   end=true;
			   }
			   else {
				   System.out.println("Account balance cannot be negative");
			   }
			   
		   }
		   catch (InputMismatchException e) {
			System.out.println("Invalid input");
		    input.next();
		}
			   
		   }
	   }
   // close of getCheckingDeposit
   
   // start of getSavingDepositInput
   
   public void getSavingDepositInput() {
	   boolean end=false;
	   while(!end) {
		   try {
			   System.out.println("Current saving account Balance "+moneyFormat.format(savingbalance));
			   System.out.println(" amount you withdraw from savings account ");
			   double amount=input.nextDouble();
			   if(savingbalance+amount>0 && amount>=0) {
				   calcSavingDeposit(amount);
				   System.out.println("\t current savings Account balance "+moneyFormat.format(savingbalance));
				   end=true;
			   }
			   else {
				   System.out.println("Account balance can be negative");
			   }
			   
		   }
		   catch (InputMismatchException e) {
			System.out.println("Invalid input");
		    input.next();
		}
			   
		   }
	   }
   // close of getSavingDepositInput
   
   public void getTransferInput(String acctype) {
	  boolean end =false;
	  while(!end) {
		  try {
			  if(acctype.equals("checkings")) {
				  System.out.println("Select account you wish to transfer to");
				  System.out.println("1.Savings");
				  System.out.println("2.Exit");
				  System.out.println("/n choice :");
				  int choice=input.nextInt();
				  switch(choice) {
				  case 1:
					  
					  System.out.println("Current saving account Balance "+moneyFormat.format(checkingbalance));
					   System.out.println(" amount you want to deposit to savings account ");
					   double amount=input.nextDouble();
					   if((savingbalance+amount>0) && (checkingbalance-amount>0) && amount>=0)  {
						   calcCheckTransfer(amount);
						   System.out.println("\t current savings Account balance "+moneyFormat.format(savingbalance));
						   System.out.println("\t current checking Account balance "+moneyFormat.format(checkingbalance));

						    end=true;
					   }
					   else {
						   System.out.println(" balance can be negative");
					   }
					   break;
				  case 2:
					  return;
				  default:
					  System.out.println("\n Invalid choice");
					  break;
				  }
			  }
		   else if(acctype.equals("savings")) {
			   System.out.println("Select account you wish to transfer to");
				  System.out.println("1.Savings");
				  System.out.println("2.Exit");
				  System.out.println("/n choice :");
				  int choice=input.nextInt();
				  switch(choice) {
				  case 1:
					  
					  System.out.println("Current saving account Balance "+moneyFormat.format(savingbalance));
					   System.out.println(" amount you want to deposit to savings account ");
					   double amount=input.nextDouble();
					   if((checkingbalance+amount>0) && (savingbalance-amount>0) && amount>=0)  {
						   calcSavingTransfer(amount);
						   System.out.println("\t current savings Account balance "+moneyFormat.format(savingbalance));
						   System.out.println("\t current checking Account balance "+moneyFormat.format(checkingbalance));

						    end=true;
					   }
					   else {
						   System.out.println(" balance can be negative");
					   }
					   break;
				  case 2:
					  return;
				  default:
					  System.out.println("\n Invalid choice");
					  break;
				  }
		   }
		  }
			  catch (InputMismatchException e) {
				  System.out.println("Invalid input");
				    input.next();
				
			}
			   
		   
	  }
	   
   
   }
   
}


 
   
   
  
  
  
  
	
	
	
	
		
	
	

