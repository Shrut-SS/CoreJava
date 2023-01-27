package Stream;
import java.lang.*;

class Thread11 implements Runnable{
	public void run() {
		System.out.println("thread1 is running......");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
	
}
class Thread22 extends Thread {
	public void run() {
		System.out.println("thread2 is running....");
		for(int i=6;i<=10;i++) {
			System.out.println(i);
		}
	}
}

public class ThreadInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread11 t1=new Thread11();
		Thread m1=new Thread(t1);
		m1.start();
		
		Thread22 t2=new Thread22();
		Thread m2=new Thread(t2);
		m2.start();

	}

}
