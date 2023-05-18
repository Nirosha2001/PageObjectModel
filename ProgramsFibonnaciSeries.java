package stringprograms;

import java.util.Scanner;

public class ProgramsFibonnaciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=0,n2=1,n3,limit,i;
		System.out.print("enter number of limits");
		limit=sc.nextInt();
		System.out.print("Fibonnaci Series until "+limit+" count is:");
		for(i=0;i<limit;i++) {
			System.out.print(n1+",");
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		
		
		

	}

}
