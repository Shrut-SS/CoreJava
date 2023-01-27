package basicofjava;
import java.util.Scanner;
public class gradesystemswitch {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Grade :");
			char gr=s.next().charAt(0);
			
			switch(gr) {
			case 'A':
				System.out.println("Marks between 100-90");
				break;
				
			case 'B':
				System.out.println("Marks between 90-80");
				break;
			
			case 'C':
				System.out.println("Marks between 80-70");
				break;
				
			case 'D':
				System.out.println("Marks between 70-60");
				break;
				
			case 'E':
				System.out.println("Marks between 60-50");
				break;
			
			case 'F':
				System.out.println("Marks between 50-0");
				break;
				
			
			}

		}


}
