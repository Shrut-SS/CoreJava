package pack2;
import pack1.*;
import java.util.*;
public class Department  {
//
//	public Department(int no, String name) {
//		super(no, name);
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter eno and ename:");
//		Employee E=new Employee(23,"Ram");
//		E.display();
		int a=s.nextInt();
		String s1=s.next();
		Employee E= new Employee(a,s1);
		E.display();
		

	}

}
