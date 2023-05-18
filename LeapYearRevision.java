package revision;

import java.util.Scanner;

public class LeapYearRevision {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int year;
		System.out.print("enter the year to check");
		year=sc.nextInt();
		if((year%400==0||year%4==0)&&(year%100!=0)) {
			System.out.print(year+"is leap year");
		}
		else {
			System.out.println(year+"is not leap year");
		}
	}

}
