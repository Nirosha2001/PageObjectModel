package stringprograms;

import java.util.Scanner;

public class ProgramsPalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp,rev=0,num,rem;
		System.out.print("Enter the number to check");
		num=sc.nextInt();
		temp=num;
		while(num>0) {
			
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		if(rev==temp) {
			
			System.out.print("it is palindrome number");
		}
		else {
			System.out.print("it is not palindrome");
		}

	}

}
