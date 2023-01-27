package pack1;

class DefaultClass{
	int a=12;
	
	void display() {
		System.out.println("Default Class variable"+a);
	}
}
class DefaultSub extends DefaultClass{
	void displaySub() {
		System.out.println("Default Sub Class variable");
	}
}

public class DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultSub d=new DefaultSub();
		d.display();
		d.displaySub();

	}

}
