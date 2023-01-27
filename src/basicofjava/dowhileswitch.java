package basicofjava;
import java.util.*;
public class dowhileswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		float res,a,b;
		char choice,ch;
		do {
			System.out.println("Main Choices:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
			
			System.out.println("Enter your choice: ");
			
			choice=s.next().charAt(0);
			
			switch(choice) 
		    {
			case '1':System.out.println("Enter two number:");
			a=s.nextFloat();
			b=s.nextFloat();
			res=a+b;
			System.out.println("Result: "+res);
			break;
			
			case '2':System.out.println("Enter two number:");
			a=s.nextFloat();
			b=s.nextFloat();
			res=a-b;
			System.out.println("Result: "+res);
			break;
			
			case '3':System.out.println("Enter two number:");
			a=s.nextFloat();
			b=s.nextFloat();
			res=a*b;
			System.out.println("Rresult: "+res);
			break;
			
			case '4':System.out.println("Enter two number:");
			a=s.nextFloat();
			b=s.nextFloat();
			res=a/b;
			System.out.println("Rresult: "+res);
			break;
			
			case '5':
			System.exit(0);
            break;
            
            default:System.out.println("Wrong Choice.............\n");
            break;
			
			}
		}while(choice!=5);
		
		

	}

}
