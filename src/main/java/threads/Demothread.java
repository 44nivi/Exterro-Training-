package threads;

public class Demothread {

	public static void main(String[] args) {
		// Tgenerated method stub
		samplethread sp1=new samplethread();
		samplethread sp2=new samplethread();
		samplethread sp3=new samplethread();
		sp2.start();
		sp1.start();
		sp3.start();
		
		samplethread1 sp=new samplethread1();
		Thread samp=new Thread(sp);
		Thread samp1=new Thread(sp);
		Thread samp2=new Thread(sp);
		samp.start();
		samp1.start();
		samp2.start();
	}
	


}

class samplethread extends Thread
{
	public void run()
	{
	try {
		for(int i=0;i<5;i++)
		{
		  System.out.println(Thread.currentThread().getName()); 
			Thread.sleep(1000);
		}}
	catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}}

class samplethread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	try {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}}
	
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	}
	
}


