/**program to demonstrate the Timer using countlatch object
 * 
 */
package threadsync;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


public class Concurrent {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub

	Semp23 ss = new Semp23();
	Thread t1 = new Thread(ss);
	Thread t2 = new Thread(ss);
	Thread t3 = new Thread(ss);
	Thread t4 = new Thread(ss);
	Thread t5 = new Thread(ss);
	Thread t6 = new Thread(ss);

	t1.start();t2.start();t3.start();t4.start();t5.start();t6.start();

	}

	}

	class Semp23 implements Runnable {

	CountDownLatch cc = new CountDownLatch(5);

	public void run() {

	try {
	//cc.countDown();
	//System.out.println("thread name :"+Thread.currentThread().getName());
	//cc.countDown();
	List<String> ll = new ArrayList<>();
	ll.add("1");
	ll.add("s");
	System.out.println(ll+Thread.currentThread().getName());


	cc.await(10, TimeUnit.SECONDS);

	} catch (Exception w) {
	System.out.println(w.getMessage());
	}
	finally {
	//cc.countDown();
	System.out.println("Done!!!");
	}
	}
	
}
