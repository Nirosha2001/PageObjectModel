package revision;

import java.util.Scanner;

public class MultipleRevision {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int i,sum=0;
		for(i=1;i<100;i++) {
			if((i%3)==0||(i%5)==0) {
				sum=sum+i;
				
			}
			
		}
		System.out.print("sum of multiples of 3 and 5 is :"+sum);
	}

}
