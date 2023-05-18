package stringprograms;
import java.util.ArrayList;
import java.util.Scanner;

public class FirstRepeatedChar {
	
	    public static int indexOfRepeatingChars(String str) {
	        for (int i = 0; i < str.length(); i++) {
	            for (int j = i + 1; j < str.length(); j++) {
	                if (str.charAt(i) == str.charAt(j)) {
	                    return i;
	                }
	            }
	        }
			return 1;
	    } 
	    

	    public static void main(String[] args) {
	        String str;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        str = sc.nextLine();
            int index = indexOfRepeatingChars(str);
            if(index==1) {
            	System.out.print("No repeating charachters");
            }
            else {
            	System.out.println(str.charAt(index));
            	
            }
	        
	    }
	}


