package revision;

import java.util.Scanner;

public class ArithemeticOperationRevision {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the operation to perform:");
        String oper=sc.nextLine();
        System.out.print("for addition enter add\n");
        System.out.print("for substraction enter sub\n");
        System.out.print("for multiplication enter mul\n");
        System.out.print("for division enter div\n");
		System.out.print("enter the first number");
		int num1=sc.nextInt();
		System.out.print("enter the second number");
		int num2=sc.nextInt();
		if(oper.equals("add")) {
			int sum=num1+num2;
			System.out.print("sum="+ sum);
		}
		else if(oper.equals("sub")) {
			int sub=num1-num2;
			System.out.print("substraction="+ sub);
		}
		else if(oper.equals("mul")) {
			int mult=num1*num2;
			System.out.print("multiplication ="+ mult);
		}
		else {
		    int div=num1/num2;
		    System.out.print("division="+ div);
		}
		
	}
}
