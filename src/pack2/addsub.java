package pack2;
import java.util.*;
class addition{
	int a,b;
	Scanner s=new Scanner(System.in);
	
	void add() {
		System.out.println("Value of a and b:");
		a=s.nextInt();
		b=s.nextInt();
		
		int sum=a+b;
		System.out.println("sum is:"+sum);
	}
}

class Subtract extends addition{
	int a,b;
	Scanner s=new Scanner(System.in);
	
	void sub() {
		System.out.println("Value of a and b:");
		a=s.nextInt();
		b=s.nextInt();
		
		int sub=a-b;
		System.out.println("sub is:"+sub);	
	}	
}
public class addsub {
        public static void main (String args[]){
        	 Subtract sb=new Subtract();
        	 sb.add();
        	 sb.sub();
        }
}
