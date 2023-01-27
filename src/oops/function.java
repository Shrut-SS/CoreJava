package oops;

public class function {

		// TODO Auto-generated method stub
		int addition(int a,int b)
		{
			int sum = a+b;
			return sum;
		}
		
		void sub(int a,int b) {
			System.out.println("Sum"+(a+b));
		}
		public static void main(String[] args) {
           function f=new function();
           
           int a=f.addition(5, 5);
           System.out.println((a));
           
           f.sub(5, 2);
	}

}
