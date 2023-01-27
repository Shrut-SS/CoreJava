package Stream;

class Thread3 implements Runnable{
		public void run() {
			System.out.println("Table of 1");
			for(int i=1;i<=10;i++) {
				System.out.println(1+" * "+i+" = "+(1*i));
			}
		}
		
	}
class Thread4 implements Runnable {
		public void run() {
			System.out.println("Table of 5");
			for(int i=1;i<=10;i++) {
				System.out.println(5+" * "+i+" = "+(5*i));
			}
		}
	}

public class multiThreading {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Thread3 t1=new Thread3();
			Thread m1=new Thread(t1);
			m1.setPriority(5);
			m1.setName("Thread Mul.");
			m1.start();
			System.out.println("Thread1 priority"+m1.getPriority());
			System.out.println("Thread name:"+m1.getName());
			
			
			Thread4 t2=new Thread4();
			Thread m2=new Thread(t2);
			m2.setPriority(9);
			m2.start();
			System.out.println("Thread2 priority"+m2.getPriority());
			

		}

	
}
