package stringprograms;

import java.util.Scanner;

public class ProgramsArithemeticOperation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the operation to perform :");
		System.out.println("for addition enter Add");
		System.out.println("for substraction enter Sub");
		System.out.println("for multiplication enter Mul");
		System.out.println("for division enter Div");
		String operation=sc.nextLine();
		int num1,num2;
		int result;
		System.out.print("enter the first number");
		num1=sc.nextInt();
		System.out.print("enter the second number");
		num2=sc.nextInt();
		if(operation.equals("Add")) {
			 result=num1+num2;
			 System.out.print("Addition of given two numbers="+ result);
		}
		else if(operation.equals("Sub")){
			result=num1-num2;
			System.out.print("Substaction of given two numbers="+ result);
		}
		else if(operation.equals("Mul")) {
			result=num1*num2;
			System.out.print("Multiplication of given two number="+ result);
		}
		else if(operation.equals("Div")) {
			result=num1/num2;
			System.out.print("Division of given two numbers="+ result);
		}
		else {
			System.out.print("invalid operation");
		}
		
		

}
}
