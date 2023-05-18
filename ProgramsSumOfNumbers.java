package stringprograms;

import java.util.Scanner;

public class ProgramsSumOfNumbers {

	public static void main(String[] args) {
		int i, sum=0,n,input;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the limits");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			System.out.print("enter the input"+i);
			input=sc.nextInt();
			sum=sum+input;
			if(input==0) {
				break;
			}
		}
		System.out.print("Sum of numbers of given limit="+sum);
		

	}

}
