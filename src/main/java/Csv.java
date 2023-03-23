import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class Csv {

	public static void writeDataForCustomSeparatorCSV(String filePath)
	{
	  
	    // first create file object for file placed at location
	    // specified by filepath
	    File file = new File(filePath);
	  
	    try {
	        // create FileWriter object with file as parameter
	        FileWriter outputfile = new FileWriter(file);
	  
	        // create CSVWriter with '|' as separator
	        CSVWriter writer = new CSVWriter(outputfile, '|',
	                                         CSVWriter.NO_QUOTE_CHARACTER,
	                                         CSVWriter.DEFAULT_ESCAPE_CHARACTER,
	                                         CSVWriter.DEFAULT_LINE_END);
	  
	        // create a List which contains String array
	        List<String[]> data = new ArrayList<String[]>();
	        data.add(new String[] { "Name", "Class", "Marks" });
	        data.add(new String[] { "Aman", "10", "620" });
	        data.add(new String[] { "Suraj", "10", "630" });
	        writer.writeAll(data);
	  
	        // closing writer connection
	        writer.close();
	        CSVReader reader = new CSVReader(new FileReader(file)); 
	        Iterator it = data.iterator();
	        while(it.hasNext()) {
	           String[] str = (String[]) it.next();
	           System.out.println(Arrays.toString(str));
	    }}
	    catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
	
	public static void main(String[]args)
	{
		Csv obj=new Csv();
		String path="C:\\Users\\nraman\\eclipse-workspace\\Niveproject\\CSVFile.csv";
		obj.writeDataForCustomSeparatorCSV(path);
	}
}
