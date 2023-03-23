
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySort {

	private static Logger lb = LogManager.getLogger("ArraySort.class");
	public static void main(String[] args) {
		
		try {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of string array: ");
		int n=s.nextInt();  //enter size of string array
		int i;
		String[] str=new String[n]; //create new string array to store n string
		System.out.println("Enter "+n+" string ");
		for(i=0;i<n;i++)
			str[i]=s.next();  //getting string from user
		lb.info("successfully get input from user both n and string");
		Arrays.sort(str,Collections.reverseOrder()); //this function used to sort the string array into descending order
		System.out.println(Arrays.toString(str)); //display the result array
		lb.info("Resulted string displayed successfully");
		Path path=Paths.get("C:\\soft\\StringResult.txt"); //create new path
		
		if(!Files.exists(path))  //check file is already exist or not
		{
			Files.createFile(path); //create new file
		}
		lb.info("file path checked");
		Files.write(path,Arrays.toString(str).getBytes()); //write in file
		lb.info("result stored in file successfully");
		lb.info("program run successfully");
		}
		catch(Exception e)
		{
			System.out.println("some error /"+e.getMessage());
			lb.error(e.getMessage());
		}
		
		
	}

}