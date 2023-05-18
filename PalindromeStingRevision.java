package revision;

import java.util.Scanner;

public class PalindromeStingRevision {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i;
		String rev="";
		System.out.print("enter the string to check");
		String str=sc.nextLine();
		int n=str.length();
		for(i=n-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.toLowerCase().equals(rev.toLowerCase())) {
			System.out.print("given string is palindrome");
		}
		else {
			System.out.print("given string is not palindrome");
		}
		

	}

}
