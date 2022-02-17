package arrayListExample;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
	
		ArrayList<String> empNames;  //here empNames is an object variable of ArrayList<String> 
		empNames = new ArrayList<String>();
		//adding Elements
		empNames.add("Karim");
		empNames.add("Joe");
		
		empNames.add("Maria");
		empNames.add("Arman");
		
		empNames.add(2, "Belal");
		
		System.out.println("index of Maria:" + empNames.indexOf("Maria")) ;
		
		System.out.println("Employee list after all names: \n " + empNames);
		
		//Modifying or edit Elements
		
		empNames.set(1, "Rahim");
		
		System.out.println("Employee list after Modification: \n " + empNames);
		//remove elements from list
		empNames.remove("Joe");
		
		System.out.println("Employee list after removals: " + empNames);
		//empNames.sort(null);
		
		int totalNumberofNames= empNames.size();
		
		for(String empName:empNames) {
			System.out.println("Emp Name (" + empNames.indexOf(empName) + " of " + totalNumberofNames + "  ) :  " + empName);
			//System.out.println("Emp index:" + empNames.indexOf(empName));
			
		//empNames.ensureCapacity(1000000);
		}
		
		
		//System.out.println("Employee List Sorted" + empNames);

	}//main

}//class
