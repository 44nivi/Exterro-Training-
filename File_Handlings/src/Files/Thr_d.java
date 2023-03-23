package Files;

public class Thr_d {
	
	
		public static void main(String[] args) {
			Thread_Sam obj=new Thread_Sam();
			Thread sam=new Thread(obj);
			Thread sam2=new Thread(obj);
			sam.start();
			sam2.start();
			
		}

	}

	 class Thread_Sam implements Runnable {

		@Override
		public void run() {
			try {
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName());
				}
			}

			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

