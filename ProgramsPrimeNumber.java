package stringprograms;

import java.util.Scanner;

public class ProgramsPrimeNumber {

	public static void main(String[] args) {
		System.out.print("prime numbers between 1 to 100 is :");
		for(int i=1;i<100;i++) {
			
			if(prime(i)==1) {
				System.out.print(i+",");
			}
		}
			
			
	}
		public static int prime(int number) {
			if(number==0||number==1) {
				return 0;
			}
			for(int i=2;i<=number/2;i++) {
				if(number%i==0) {
					return 0;
				}
			}
			        return 1;
				
		}							
		
}



