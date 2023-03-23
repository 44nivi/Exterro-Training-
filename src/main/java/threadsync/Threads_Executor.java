package threadsync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Threads_Executor {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		try {
	         executor.submit(new Task());
			System.out.println("Shutdown executor");
			executor.shutdown();
			if(executor.awaitTermination(5, TimeUnit.SECONDS)) {
				System.out.println("Terminated succcessfully");
			}
			else {
				System.out.println("Termination unsuccessful");
			}
		} catch (Exception w) {
			System.out.println(w.getMessage());
		}
	}

	static class Task implements Runnable {

		@Override
		public void run() {
			try {
				Long duration = (long) (Math.random() * 20);
				System.out.println(duration);
				System.out.println("Running Task!");
				TimeUnit.SECONDS.sleep(duration);
			} catch (Exception w) {
				System.out.println(w.getMessage());
			}
		}

	}
}

// ***********************using THREADS USING EXECUTOR****************************************

	/*public class TestThread {

		   public static void main(final String[] arguments) throws InterruptedException {
		      Executor executor = Executors.newCachedThreadPool();
		      executor.execute(new Task());
		      ThreadPoolExecutor pool = (ThreadPoolExecutor)executor;
		      pool.shutdown();
		   }  

		   static class Task implements Runnable {
		      
		      public void run() {
		         
		         try {
		            Long duration = (long) (Math.random() * 5);
		            System.out.println("Running Task!");
		            TimeUnit.SECONDS.sleep(duration);
		            System.out.println("Task Completed");
		         } catch (InterruptedException e) {
		            e.printStackTrace();
		         }
		      }
		   }
*/


