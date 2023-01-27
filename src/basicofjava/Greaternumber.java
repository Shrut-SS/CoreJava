package basicofjava;
import java.util.Scanner;
public class Greaternumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter First number:");
		int n1=s.nextInt();
		System.out.println("Enter Second number:");
		int n2=s.nextInt();
		System.out.println("Enter Third number:");
		int n3=s.nextInt();
        //conditions
		if(n1==0 && n2==0 && n3==0) {
			System.out.println("none");
		}
		else if(n1>n2 && n1>n3) {
			System.out.println("First number is greater");
		}
		else if(n2>n1 && n2>n3) {
			System.out.println("Second number is greater");
		}
		else {
			System.out.println("Third number is greater");
		}
	}

}
