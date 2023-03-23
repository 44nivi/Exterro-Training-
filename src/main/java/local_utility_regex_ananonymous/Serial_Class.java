package local_utility_regex_ananonymous;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serial_Class {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

	try {
	Employee ee = new Employee();
	ee.setName("nivek");
	ee.setSSNo(109);
	ee.setAddress("Coimbatore");
	System.out.println(ee.getName());
	System.out.println(ee.getAddress());
	System.out.println(ee.getSSNo());

	
	 FileOutputStream fileOut = new FileOutputStream("D:\\Eclipseold space\\eclipse-workspace\\Niveproject\\src\\main\\java\\threadsync\\employee.ser");
	 ObjectOutputStream out = new ObjectOutputStream(fileOut);
	 out.writeObject(ee); 
	 out.close(); 
	 fileOut.close();
	 System.out.printf("Serialized data is saved in employee.ser");
	

	
	  FileInputStream fileIn = new FileInputStream("employee.ser");
	  ObjectInputStream in = new ObjectInputStream(fileIn); 
	  ee = (Employee)in.readObject(); 
	  in.close(); 
	  fileIn.close();
	  System.out.println(ee.getName());
	  System.out.println(ee.getSSNo());
	  System.out.println(ee.getAddress());
	 

	}
	catch(Exception e) {
	System.out.println(e.getMessage());
	}



	}

	}



