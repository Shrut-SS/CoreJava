package ExceptionHandling;
import java.util.Scanner;

class InvalidMarksException extends Exception{
	public InvalidMarksException(String s) {
		super(s);
	}
}
public class ExceptionHandlingEx6 {
	static void marksChecker(int m) throws InvalidMarksException{
		if(m<0 || m>100)
		{
			throw new InvalidMarksException("Invalid marks.");
		}
		else
		{
			System.out.println("Valid marks.");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your marks:");
		int m=s.nextInt();
		try {
			marksChecker(m);
			
		}catch(InvalidMarksException e) {
			System.out.println(e);
		}
	}

}
