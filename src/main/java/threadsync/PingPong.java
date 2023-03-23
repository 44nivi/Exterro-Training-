package threadsync;

import java.util.Scanner;

public class PingPong {

	public static void main(String[] args) {
		 int count=0;
		 System.out.println("Players Enter Y for Ready");
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the status of Player 1");
		 String PLY1=scan.next();
		 System.out.println("Enter the status of Player 2");
		 String PLY2=scan.next();
		 System.out.println("Enter the Number of Rally between the players");
		 int num=scan.nextInt();
		 if (PLY1.equals("Y") && PLY2.equals("Y"))
		 {
			System.out.println("Player1 Ready -->");
			System.out.println("Player2 Ready -->");
		 }
		Controller pa = new Controller();
		
		for(int i=1;i<num;i++)
		{
			Thread t1 = new Thread(pa);
			 t1.start();
			 
			 try {
				t1.join();
				// Thread.sleep(5000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				count+=1;

			} 
			
			
		 } if (count%2==0)
			{
				System.out.println("Player2 WINS");
			}
			else
			{
				System.out.println("Player1 WINS");
			}
	

}}

 class Controller implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	Ping obj1=new Ping();
		obj1.display();
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	
	Pong obj2=new Pong();
		obj2.display1();	
		 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}

 class Ping
{
public void display()
{
try {
	System.out.println(" PING -->");
	
}
catch(Exception e)
{
	System.out.println(e.getMessage());	

}
	 
} }

 class Pong
{
	 public void display1()
	 { try {
		System.out.println(" PONG -->");
	 }
	catch(Exception e)
	 {
		System.out.println(e.getMessage());	

	 }
	 }
	
}