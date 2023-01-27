package basicofjava;

class StaticDemo{
	static int a,b;
	static String n;
	
	static void display() {
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("n:"+n);
	}
}
public class StaticDemo1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo.a=10;
		StaticDemo.b=23;
		StaticDemo.n="Shruti";
		StaticDemo.display();
//		//if defined in same class
//		a=10;
//		b=23;
//		n="Shruti";
//		display();

	}


}
