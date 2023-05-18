package weekthree;

public class MethodOverloading {

 public void area(int l,int b) {
	 int result=l*b;
	 System.out.print("Area of rectangle is:"+result);
	}
 public void area(int s) {
	 int result=s*s;
	 System.out.print("area of square is"+result);
 }
 public static void main(String[] args) {
	 MethodOverloading ex=new MethodOverloading();
	 ex.area(4,2);
	 ex.area(6);
 }

}
