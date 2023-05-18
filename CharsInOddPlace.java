package stringprograms;

import java.util.Scanner;

public class CharsInOddPlace {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char[] c=str.toCharArray();
		for(int i=1;i<c.length;i++) {
			if(i%2!=0) {
				System.out.print(c[i]+",");
			}
		}
		
	}

}
