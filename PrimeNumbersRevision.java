package revision;

public class PrimeNumbersRevision {

	public static void main(String[] args) {

		System.out.print("prime numbers between given range;");
		for(int i=1;i<100;i++) {
			if(primenumber(i)==1) {
				System.out.print(i+",");
			}
			
		}
				
		
	}
	public static int primenumber(int number) {
		if(number==0 || number==1) {
			return 0;
		}
		for(int j=2;j<=number/2;j++) {
			if(number%j==0) {
				return 0;
			}
			
		}
		return 1;
			
	}

}
