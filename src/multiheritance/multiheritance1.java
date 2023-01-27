package multiheritance;

import java.util.*;

class Addition{
	Scanner s=new Scanner(System.in);
	int a,b;
	
	void getValues() {
		System.out.println("Enter two number:");
		a=s.nextInt();
		b=s.nextInt();
		
	}
	void add() {
		System.out.println("Addition is : "+(a+b));
	
	}
}

class Subtracts extends Addition{
	void sub() {
		System.out.println("Subtraction is : "+(a-b));
	}
}

class Multiply extends Subtracts{
	void mul() {
		System.out.println("Multiplication is : "+(a*b));
	}
}

class Division extends Multiply{
	void div() {
		System.out.println("Division is : "+(a/b));
	}
}
public class multiheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Division d=new Division();
        d.getValues();
        d.add();
        d.sub();
        d.mul();
        d.div();
        
	}

}

