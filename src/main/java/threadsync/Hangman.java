package threadsync;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

import com.datastax.oss.driver.shaded.guava.common.io.Files;

public class Hangman {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		/*
		 * File file = new
		 * File("C:\\Users\\nraman\\eclipse-workspace\\Niveproject\\books.txt");
		 * BufferedWriter inp = new BufferedWriter(new FileWriter(file,true));
		 * System.out.println("Enter 10 book names"); for(int i =1;i<=10;i++) { String
		 * content=scan.nextLine(); inp.write(content+System.lineSeparator());
		 * 
		 * }
		 * 
		 * inp.close();
		 * 
		 * File file2 = new
		 * File("C:\\Users\\nraman\\eclipse-workspace\\Niveproject\\movies.txt");
		 * BufferedWriter obj = new BufferedWriter(new FileWriter(file2,true));
		 * System.out.println("Enter 10 movie names "); for(int i =1;i<=10;i++) { String
		 * content1=scan.next(); obj.write(content1+System.lineSeparator());
		 * 
		 * } obj.close();
		 */

		Control pa = new Control();
		Thread th1 = new Thread(pa);
		th1.start();
		try {
			th1.join(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(pa.fin)
		{
			System.out.println("SORRY!! TIME OUT");
			System.out.println("YOU LOOSE!!!!!!");
		}
	}
}

class Control implements Runnable {
	boolean fin;
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		books obj1 = new books();
		 fin=obj1.display();
		
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}

		/*
		 * movies obj2=new movies(); obj2.display1(); try { Thread.sleep(10000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } }
		 * 
		 * }
		 */}

class books {Boolean isfind=true;
public Boolean display()
{
try {
	
	int count=0;
	int flag=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the guessing word");
	File file = new File("C:\\Users\\nraman\\eclipse-workspace\\Niveproject\\books.txt");
	BufferedReader reader = new BufferedReader(new FileReader(file));
	String st;
	
    // Condition holds true till
    // there is character in a string
	while((st=reader.readLine())!=null) {
		count+=1;
		
	}
	reader = new BufferedReader(new FileReader(file));
	String arr[]=new String[count];
    int i=0;
    int var=1;
    int c=1;
    String con=""; 
    String temp="";
	while((st=reader.readLine())!=null) 
	{
       		arr[i]=st; 
       		i++;
	}
	
	  System.out.println("Enter the character to guess"); String find=scan.next();
	 
	  
	Boolean ctr=true;
	
	for(i=0;i<arr.length;i++) {
		String ars[]=new String[arr.length];
				ars[i]=arr[i];
		if(ars[i].substring(0,var).equalsIgnoreCase(find))
		{while(true) {
				
			 
			/*
			 * System.out.println(arr[i].length()); System.out.println(var);
			 * System.out.println(c);
			 */
	            if(c==arr[i].length()) {
	            	System.out.println("You Win");
	            	break;}
	            
	            else if(ars[i].substring(0,var).equalsIgnoreCase(find)) {	
					/* System.out.println(ars[i]); */
	            var=var+1;
	            System.out.println("Enter the character to guess");  temp=scan.next();
	            find=find+temp;
	            c=c+1;
	            }
	
	            else {
	            	
	            		find=find.substring(0,var-1);
	            	System.out.println("you were close");
	            	System.out.println("Enter the character to guess");  temp=scan.next();
	            	find=find+temp;
	            	System.out.println(find);
		           
	            	
	            }
	           
	            }
	            
		}}
	
}
	
catch(Exception e)
{
	System.out.println(e.getMessage());	

}
return isfind;
	 
}}

/*
 * class movies { public void display1() { try {
 * System.out.println(" PONG -->"); } catch(Exception e) {
 * System.out.println(e.getMessage());
 * 
 * } }}
 */
