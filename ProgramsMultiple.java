package stringprograms;

public class ProgramsMultiple {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<100;i++) {
			if((i%3==0)||(i%5==0)) {
				sum=sum+i;
			}
			
		}
		System.out.print("Sum of numbers of multiple of 3 or 5 for given limit is:"+sum);
		
	
	}

}
