package Stream;

class Thread2 extends Thread {
	public void run() {
		System.out.println("thread is running....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread2 t2 = new Thread2();
		t2.start();

	}

}
