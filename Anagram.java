package stringprograms;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram { 
	    public static void main(String[] args)
	    {
	        Scanner sc= new Scanner(System.in);
	        
	        System.out.print("Enter the First String : ");
	        String str1 = sc.nextLine();
	         
	        System.out.print("Enter the second String : ");
	        String str2 = sc.nextLine();
	        
	        if(check(str1, str2))
	            System.out.println(str1+" and "+str2+" are Anagrams");
	        else
	            System.out.println(str1+" and "+str2+" are not Anagrams");
	        
	    }
	    
	    public static boolean check(String str1, String str2)
	    {
	        if(str1.length() != str2.length())
	            return false;
	        else
	        {
	            char[] c1 = str1.toLowerCase().toCharArray();
	            char[] c2= str2.toLowerCase().toCharArray();
	            Arrays.sort(c1);
	            Arrays.sort(c2);
	            return (Arrays.equals(c1,c2));
	        }
	    }
	}




