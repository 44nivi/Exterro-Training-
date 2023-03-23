package threadsync;

public class Tollbooth {

	public static void main(String[] args)
	{ manager sm=new manager();
	Thread obj1=new Thread(sm);
	Thread obj2=new Thread(sm);
	Thread obj3=new Thread(sm);
	Thread obj4=new Thread(sm);
	Thread obj5=new Thread(sm);
	obj1.setName("car");
	obj2.setName("bike");
	obj3.setName("lorry");
	obj4.setName("bus");
	obj5.setName("van");
	obj1.start();
	try {
		obj1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	obj2.start();
	try {
		obj2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	obj3.start();
	try {
		obj3.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	obj4.start();
	try {
		obj4.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	obj5.start();
	try {
		obj5.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

class Vechicle5
{ 
	String type;
		
	public void vechicletype()
	{ 
	try {
	 System.out.println(Thread.currentThread().getName()+ "Vechicle Arrived");
	Thread.sleep(2000);

	}
	catch(Exception e){
		
	}
}
}
class tolbooth 
{
	
	public void runner()
	
	{
	try {
		 System.out.println(Thread.currentThread().getName()+" Vechicle got into the tollbooth");

		Thread.sleep(2000);
	}
	catch(Exception e)
	{
		
	}
}
}

class simulate
{
	public void display()
	{
		try {
			 System.out.println(Thread.currentThread().getName()+ "Vechicle departed from toll");

				Thread.sleep(2000);

		}
		catch(Exception e)
		{
			
		}
	}
}
class manager implements Runnable
{

	@Override

	public void run() {	
	try {
		Vechicle5 o=new Vechicle5();
		o.vechicletype();
		tolbooth ru=new tolbooth();
		ru.runner();
		simulate sim=new simulate();
		sim.display();
	
	}	
		catch(Exception e)
		{
	
		}
}}