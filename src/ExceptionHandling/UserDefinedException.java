package ExceptionHandling;
import java.util.*;

class MinimumAccountBalance extends Exception{
	String message;
	
	public MinimumAccountBalance(String message) {
		this.message = message;
		
	}
	
	@Override
	public String toString() {
		return message;
	}
}
public class UserDefinedException {
	
	static double current_balance = 100;

	public static void main(String[] args) throws MinimumAccountBalance {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter amount to withdrawal");
		int n=s.nextInt();
		try {
			if(current_balance < n) {
				throw new MinimumAccountBalance("Insufficient funds ! your Current balance is "+current_balance);
			}else {
				System.out.println("Please Take the Money:"+n);
			}
		}catch(MinimumAccountBalance mab) {
			mab.printStackTrace();
		}

	}

}
