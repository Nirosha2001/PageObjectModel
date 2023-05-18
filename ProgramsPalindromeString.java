package stringprograms;

import java.util.Scanner;

public class ProgramsPalindromeString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("enter the string to check");
		String word=sc.nextLine();
		int length=word.length();
		String reverse="";
		for(i=length-1;i>=0;i--) {
			reverse=reverse+word.charAt(i);
		}
		
		if(word.toLowerCase().equals(reverse.toLowerCase())) {
			
			System.out.print("Given string is palindrome");
		}
		else {
			System.out.print("Given string is not palindrome");
		}
		
		
		
		
	}

}
