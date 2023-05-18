package atm;

import java.io.IOException;

public class ATM {
	
	// Main method application start from here
	
	public static void main(String args[]) throws InterruptedException {
	
		OptionMenu optionmenu=new OptionMenu();
		
	     frontDisplayScreen();

	 try {
		optionmenu.mainMenu();
	}
	catch (IOException e) {
	    e.printStackTrace();
	}
		
	}
	
	
	public static void frontDisplayScreen() {
		
		System.out.println();
		System.out.println("*******************");
		System.out.println();
		System.out.println("Welcome to mini project");
		System.out.println();
		System.out.println("*******************");

	}

}
