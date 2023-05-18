package revision;

import java.util.Scanner;

public class FibonnacciSeriesRevision {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int first=0,second=1,third,n;
		System.out.print("enter the count");
		n=sc.nextInt();
		System.out.print(first+",");
		System.out.print(second+",");
		for(int i=1;i<=n;i++) {
			third=first+second;
			System.out.print(third+",");
			first=second;
			second=third;
			
		}
		
		
	}

}
