package pack1;
class PrivateClass{
	int a = 12;
	void display(){
		System.out.println("Private Method"+a);
		
	}
}
public class PrivateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateClass p=new PrivateClass();
		System.out.println(p.a);
		p.display();

	}

}
