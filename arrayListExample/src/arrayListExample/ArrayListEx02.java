package arrayListExample;

import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		
		ArrayList <String> empNames;
		
		empNames = new ArrayList<String>();
		
		empNames.add("Tanvir");
		empNames.add("Joe");
		empNames.add("Nishat");
		// modifying or adding
		empNames.add(1, "Awesome");
		
		System.out.println("After adding all names: \n" + empNames);
		
		
		//Remove elements from list
		
		empNames.remove("Joe");
		
		System.out.println("Employee list after removal \n" + empNames);
		
		int totalNumberofNames = empNames.size();
		
		for (String empName: empNames ) {
			System.out.println("Emp Name ( "+ empNames.indexOf(empName)+ totalNumberofNames + ")  empName");
			System.out.println("Emp index :" + empNames.indexOf(empName));
		}
		
		
	}

}
