package threadsync;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class readwritelock {
	


	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Samp12 ss = new Samp12();
	Thread t1 = new Thread(ss);
	Thread t2 = new Thread(ss);
	Thread t3 = new Thread(ss);

	t1.start();
	t2.start();
	t3.start();
	}
	}

	class Samp12 implements Runnable {
		final ReentrantReadWriteLock rd = new ReentrantReadWriteLock();
	public void run() {
	
	try {

	List<Object> ll = new ArrayList<>();
	
	ll.add("1");
	ll.add("2");
	ll.add("3");
	ll.add("4");
	ll.add("5");
	System.out.println("Locked!!"+ll);
	//rd.writeLock().lock();
	rd.readLock().lock();
	ll.add("6");
	ll.add("11");
	
	/* Thread.sleep(5000); */
	System.out.println("Locked!!"+ll);
	
	System.out.println(Thread.currentThread().getState());
	System.out.println(Thread.currentThread().getName());
	/*
	 * 
	 * Thread.sleep(2000);
	 * 
	 * Thread.sleep(1000);
	 */
	rd.writeLock().lock();
	ll.add("7");
	ll.add("8");
	//rd.readLock().unlock();
	System.out.println(ll);
	System.out.println("after unlock"+ll);
	rd.writeLock().unlock();

	}

	catch (Exception e) {
	System.out.println(e.getMessage());

	}
	finally {
	rd.readLock().unlock();

	}
	}
	}
	
	
	
