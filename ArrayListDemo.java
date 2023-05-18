package stringprograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) 
	{
    ArrayList<String> listname= new ArrayList<>();
	
	
	ArrayList<Integer> rollno= new ArrayList<>();
		
	List<Integer> rollnumber= new ArrayList<>();
	
	//Adding elements using add()
	
	listname.add("Raju");
	listname.add("shambu");
	listname.add("pooja");
	listname.add(null);
	listname.add(null); // it will allow null values and duplicate values
	listname.add(5,"jayanthi");
	
	rollno.add(3);
	rollno.add(5);
	rollno.add(5);
	
	System.out.println("\t"+rollno);
	System.out.println("\t"+listname); // it will print in same order in which insertion is done
	
	//Accesing elements using get()
	
	String str=listname.get(2);
	System.out.println(str);
	
	//removing elements using remove()
	
	String str1=listname.remove(1);
	System.out.println(str1);
	System.out.println(listname);

	
	}
}


