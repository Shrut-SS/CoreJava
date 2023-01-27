package oops;

public class AutoTypeConversion {
	int x = 20; 
	double y = 40.5; 
	long p = 30; 
	float q = 10.60f; 
	void sum() 
	{ 
	 // int z = x + y; (1) // Error; cannot convert from double to int. 
	    double z = x + y; 
	 
	   System.out.println("Sum of two numbers: " +z); 
	 } 
	void sub() 
	{ 
	 // long r = p - q; // (2) // Error; cannot convert from float to long. 
	    float r = p - q; 
	    System.out.println("Subtraction of two numbers: " +r); 
	  } 
	public static void main(String[] args) 
	{ 
	   AutoTypeConversion obj = new AutoTypeConversion(); 
	    obj.sum(); // Calling sum method. 
	    obj.sub(); // Calling sub method. 
	  } 
	
}
