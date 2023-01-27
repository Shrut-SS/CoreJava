package basicofjava;
import java.util.Scanner;
public class Checkingnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		if(n<0) {
			System.out.println("It is negative number");
		}
		else if(n==0) {
			System.out.println("It is 0");
		}
		else {
			System.out.println("It is positive number");
		}
		

	}

}
