package pack1;

public class Employee {
//	int eno=233;
//	String ename="Ram1";
	int eno;
	String ename;
	
	public Employee(int no,String name) {
		eno = no;
		ename = name;
		
		
	}
	public void display() {
		System.out.println("Employee name:"+ename);
		System.out.println("Employee number:"+eno);
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
