package basicofjava;
import java.util.*;
public class Additionofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int i=1,sum=0,r;
		while(i>0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
			i++;
		}
		System.out.println("total="+sum);

	}

}
