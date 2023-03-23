package threadsync;

import java.util.ArrayList;

public class Vechicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tollbridge vt = new Tollbridge();
		  Thread t1 = new Thread(vt);
 		  Thread t2 = new Thread(vt); Thread t3 = new Thread(vt); Thread t4 = new
		  Thread(vt); Thread t5 = new Thread(vt);
		 
		t1.start(); 
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t4.start(); 
		try {
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t5.start();
		try {
			t5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		
	}
	
}

	class Tollbridge extends Thread
	{
	
	public void run() {
		try {	// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		System.out.println(" The vechicle start its journey" );
		
	Arival av=new Arival(Thread.currentThread().getName());
	Thread f1=new Thread(av);
	f1.start();
	Thread.sleep(5000);
		}
	catch(Exception e)
	{
		System.out.println(e.getMessage());	
	}
    }
	}
	class Arival implements Runnable
	{
	
		String name;
		public Arival(String name)
		{
			this.name=name;
}
	public void run() {
		try {	// TODO Auto-generated method stub
		System.out.println(" The vechicle Arrived at toll "+this.name);
		EnterToll to=new EnterToll(this.name);
		Thread g1=new Thread(to);
		g1.start();
		Thread.sleep(5000);
	
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());	
	}
	}
	}
	
	class EnterToll implements Runnable
	{ 	String gang;	
		public EnterToll(String gang)
		{
			this.gang=gang;
		}
	public synchronized void run() {  
		try {
						 
		System.out.println(this.gang);
		System.out.println(" The vechicle Entereing  at tollbooth " );
		
		Vechicle1 obj=new Vechicle1(this.gang);
		Thread th=new Thread(obj);
		th.start();
		th.join();
	
			 Thread.sleep(5000);
	}
		
	catch(Exception e)
	{
		System.out.println(e.getMessage());	
	}
	}
	}
	
	
	class Vechicle1 implements Runnable
	 {
		 public  int count=0;
		 String v_feature;
		public Vechicle1(String v_feature) {
			
			this.v_feature= v_feature;
					
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (this) {
			System.out.println(v_feature +"The vechicle checkin ");
				int i;
			ArrayList<String> cars = new ArrayList<String>(); 
			 cars.add("Volvo");
			 cars.add("BMW");
			 cars.add("Ford");
			 cars.add("Mazda");
			 cars.add("lorry");
		
			    for ( i = count; i <cars.size()-1; i++) {
			      
			     System.out.println("The vechicle is "+ cars.get(i));
			    }		   
		}
			
		}}
	
	
	
	/*
	 * class vechicle { String type;int ticket; public void vechicletype() {
	 * type="four wheeler";
	 * 
	 * } public int vechicletickt() {
	 * 
	 * if(type=="four wheeler") { ticket=40; } return ticket; }
	 * 
	 * }
	 * 
	 * class tolway() {
	 * 
	 */
	
	
	