package stringprograms;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicateChars {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str=sc.nextLine();
		char c[]=str.toCharArray();
		HashMap<Character,Integer>	map1=new HashMap<>();
		for(Character a:c) {
			if(map1.containsKey(a)) {
				
				int value=map1.get(a);
				map1.put(a, value+1);
			}
			else {
				map1.put(a,1);
				System.out.println(a);
			}
			
		}
	}	

}
