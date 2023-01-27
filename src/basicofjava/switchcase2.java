package basicofjava;
import java.util.*;
public class switchcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two number");
		int a=s.nextInt();
		int b=s.nextInt();
		
		System.out.println("Enter an operator");
		char op=s.next().charAt(0);
		
		switch(op) {
		case '+':
			System.out.format("%d+%d=%d\n",a,b,a+b);
			break;
			
		case '-':
			System.out.format("%d-%d=%d\n",a,b,a-b);
			break;
		
		case '*':
			System.out.format("%dX%d=%d\n",a,b,a*b);
			break;
			
		case '/':
			System.out.format("%d/%d=%d\n",a,b,a/b);
			break;
		default:
			System.out.println("Invalid");
		}
		

	}

}
