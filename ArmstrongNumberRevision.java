package revision;

public class ArmstrongNumberRevision {

	public static void main(String[] args) {
		
		int i,num,sum=0,rem;
		System.out.print("Armstrong numbers between 100 to 1000 is:");
		for(i=100;i<=1000;i++) {
			num=i;
			while(num>0) {
				rem=num%10;
				sum=sum+rem*rem*rem;
				num=num/10;
			}
			if(sum==i) {
				System.out.print(i+",");
			}
			sum=0;
		}

	}

}
