package basicofjava;
import java.util.Scanner;
public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        
        if(n%2==0) {
        	System.out.println("It is Even number");
        }
        else {
        	System.out.println("It is odd number");
        }
	}

}
