package threadsync;

public class sync {

		public static void main(String[] args) {
		// TODO Auto-generated method stub


		SampThread3 sp1 = new SampThread3();

		Thread t1 = new Thread(sp1);
		Thread t2 = new Thread(sp1);
		Thread t3 = new Thread(sp1);

		t1.start();t2.start();t3.start();

		}

		}


		class SampThread3 implements Runnable{
		//public synchronized  void run() {
		public void run() {
		try {
		synchronized (this) {
		System.out.println(Thread.currentThread().getName());
		for(int i = 0 ; i <=5; i++) {
		System.out.println(" i = "+i);
		Thread.sleep(1000);
		}

		}


		}
		catch(Exception e) {
		System.out.println(e.getMessage());
		}


		}
		}
