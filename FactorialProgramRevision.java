package revision;

import java.util.Scanner;

public class FactorialProgramRevision {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int fact=1,i;
		System.out.print("Enter the number");
		int num=sc.nextInt();
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.print("factorial of given number="+fact);
	}

}
