package basicofjava;

class Hello{
	static int add(int a,int b) {
		return a+b;
	}
	
	static int mul(int a,int b) {
		return a*b;
	}
	
	static float div(float a,float b) {
		return a/b;
	}
	
	static String greet(String n) {
		return "hello "+n;
	}
 }
public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h=new Hello();
		System.out.println("Multiply:"+h.mul(2, 3));
        String s=h.greet("Shruti");
        System.out.println(s);
        System.out.println("Division:"+h.div(5.6f,2.3f));
        int sum=Hello.add(16, 4);
        System.out.println("Sum:"+sum);
	}

}
