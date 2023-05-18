package stringprograms;

import java.util.Scanner;

public class ProgramsFactorial {

	public static void main(String[] args) {
		
		int i, fact=1,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number");
		n=sc.nextInt();
		for(i=1;i<=n;i=i+1) {
			 
			fact=fact*i;
		}
		System.out.print("factorial of given number is "+ fact);
		
		
		
		// TODO Auto-generated method stub

	}

}
