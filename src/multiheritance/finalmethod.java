package multiheritance;
class AB{
	//final void display() {
	void display() {
		System.out.println("Class A");
	}

}
class CB extends AB{
	void display() {
		System.out.println("Class B");
	}
}

public class finalmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CB b=new CB();
		b.display();

	}

}
