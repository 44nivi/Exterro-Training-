package Files;
import java.io.File;
import java.io.FileWriter;
// Import the IOException class to handle errors
import java.io.IOException;
import java.util.Scanner;
public class Read_Write {
	
	    public static void main(String[] args)
	    {File Obj = new File("C:\\Users\\nraman\\Desktop\\New Folder\\fruits.txt");
	 
	        try {
	            
	            if (Obj.createNewFile()) {
	                System.out.println("File created: "
	                                   + Obj.getName());
	               
	            }
	            else {
	               System.out.println(Obj.getAbsolutePath());
					
					  FileWriter Writer = new FileWriter(Obj,true);
					  Writer.append("hi hello"); Writer.close();
					 
	                Scanner Reader = new Scanner(Obj);
	                while (Reader.hasNextLine()) {
	                    String data = Reader.nextLine();
	                    System.out.println(data);
						/*
						 * if (Obj.delete()) { System.out.println("The deleted file is : "+
						 * Obj.getName()); }
						 */
	            }
	            }}
	        catch (IOException e) {
	            System.out.println("An error has occurred.");
	            e.printStackTrace();
	        }
	    }
	}

