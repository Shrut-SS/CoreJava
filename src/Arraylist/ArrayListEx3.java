package Arraylist;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> employee = new ArrayList<>();
		
	//add element
		employee.add(0,"John");
		employee.add(1,"Jane");
		employee.add(2,"Jack");
		employee.add(3,"Jill");
		employee.add(1,"jini");
		System.out.println(employee);
		employee.set(1,"jini");
		
		
		System.out.println(employee);
	    System.out.println("Get Method:"+employee.get(2));
	    
	    for(String i : employee) {
	    	System.out.println(i);
	    }
		
	    employee.remove(1);
	    System.out.println(employee);
	    employee.removeAll(employee);
	    System.out.println(employee);
	    employee.clear();
	    System.out.println(employee);
	//different array
		ArrayList<String> animal = new ArrayList<>();
		animal.add("Crocodile");
		
		System.out.println("Animal list:"+animal);
		
		ArrayList<String> mammal = new ArrayList<>();
		mammal.add("Elephant");
		mammal.add("Dog");
		
		System.out.println("Mammal list:"+mammal);
		
		//add ALL the elements from "mammal" and "animal"
		
		animal.addAll(mammal);
		
		System.out.println("New animal list:"+animal);
		
//		ArrayList<String> employee = new ArrayList<>(Arrays.asList("John","Jane","Jack","Jill");
//		
		
		
		
		

	}

}
