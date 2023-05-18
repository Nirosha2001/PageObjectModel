package stringprograms;

import java.util.Scanner;

public class ProgramsLeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year; 
		System.out.print("enter the year to check");
		year=sc.nextInt();
		if((year%400==0)||(year%4==0)&&(year%100!=0)){
			System.out.print("Given year is leap year");
		}
		else {
			System.out.print("Given year is not leap year");
		}
		
	}

}
