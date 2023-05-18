package revision;

import java.util.Scanner;

public class SumOfNumbersRevision {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int i,count,number,sum=0;
		System.out.print("enter the limit");
		count=sc.nextInt();
		for(i=1;i<=count;i++) {
			System.out.print("enter the number"+i);
			number=sc.nextInt();
			if(number==0) {
				break;
			}
			else {
				sum=sum+number;
			}
		}
		System.out.print("sum of number="+sum);
	}

}
