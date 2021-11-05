package basics;

public class ThreadTesting_2 implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTesting_2 t1 = new ThreadTesting_2();
		ThreadTesting_2 t2 = new ThreadTesting_2();
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);

		th1.setName("vicky");
		th1.setDaemon(true);

		System.out.println(th1.getName() + " - running thread "
				+ th1.getState());
		th1.start();
		System.out.println(th1.getName() + " - running thread "
				+ th1.getState());
		try {
			th1.join();
			//th2.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		//th2.start();
		System.out.println(th1.getName() + " - running thread "
				+ th1.getState());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i +" - "+ Thread.currentThread().getName() + " - running thread "
					+ Thread.currentThread().getState());
		}
	}

}
