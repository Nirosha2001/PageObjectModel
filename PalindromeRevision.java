package revision;

import java.util.Scanner;

public class PalindromeRevision {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int temp,num,rev=0,rem;
		System.out.print("enter the number to check");
		num=sc.nextInt();
		temp=num;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==temp) {
			System.out.print("Given number is palindrome");
		}
		else {
			System.out.print("Given number is not palindrome");
		}
	}

}
