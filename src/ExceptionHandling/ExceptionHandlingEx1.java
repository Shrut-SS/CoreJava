package ExceptionHandling;


public class ExceptionHandlingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int c,a=10,b=0;
			c=a/b;
			System.out.println("Value of c:"+c);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally block");
		}

	}

}
