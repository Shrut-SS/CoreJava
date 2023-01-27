package pack2;

class Student1{
	int sid=10;
	void display() {
		System.out.println("Rollno:"+sid);
	}
}
class EngineerStud1 extends Student1{
	String spec="Computer Eng";
	void displaySpe() {
		System.out.println(spec);
	}
}

class Architect extends Student1{
	String spe="Architecture";
	void displaySpea() {
		System.out.println(spe);
	}
	
}
class BSC extends Student1{
	String stream="BSC";
	void displaySpeb() {
		System.out.println(stream);
	}
}

public class hierarchical {
	public static void main(String args[]) {
	EngineerStud1 e= new EngineerStud1();
	e.displaySpe();
	Architect a=new Architect();
	a.displaySpea();
	BSC b = new BSC();
	b.displaySpeb();
	b.display();
	
	}

}
