package multiheritance;

//final class A{
class A{
	void display() {
		System.out.println("Class A");
	}

}
class B extends A{
	void display() {
		System.out.println("Class B");
	}
}

public class finalclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.display();
		

	}

}
