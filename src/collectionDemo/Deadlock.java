package collectionDemo;

class Thread1 extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(i);
		}
	}
}
public class Deadlock {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        Thread1 ta=new Thread1();
        Thread1 th=new Thread1();
        ta.start();
        th.start();
        ta.join();
        th.join();
	}

}
