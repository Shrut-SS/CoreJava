package pack2;

class Emp {
	String ename = "Shruti";
	int eno;

	Emp(int eno) {
		this.eno = eno;
	}

	void display() {
		System.out.println("Employee Class:" + eno);
	}
}

class Dept extends Emp {
	String ename = "Shreya";

	Dept() {
		super(12);
	}

	void display() {
		super.display();
		System.out.println("Department class:" + ename);
	}
}

public class Methodoverriding {
	public static void main(String args[]) {
		Dept d = new Dept();
		d.display();
//    	 Emp e=new Emp();
//    	 e.display();
	}
}
