package basics;

public class ThreadTesting_1 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("run method");
	}

	public static void main(String[] args) {

		ThreadTesting_1 t = new ThreadTesting_1();
		t.start();
	}

}

class ThreadTesting_3 implements Runnable {

	@Override
	public void run() {
		System.out.println("ThreadTesting_3 - run method");

	}

	public static void main(String[] args) {
		ThreadTesting_3 t3 = new ThreadTesting_3();
		Thread t3th = new Thread(t3);
		t3th.start();
	}

}
