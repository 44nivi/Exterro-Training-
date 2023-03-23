package mongo;
import org.bson.Document;
import com.mongodb.client.MongoClients;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

import org.bson.conversions.Bson;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.bson.Document;
import com.mongodb.client.MongoClients;
public class Mongo {
	

public static void main(String[] args) throws SQLException 
{ try {
	Bson filter = new Document();

	MongoClient mongoClient = new MongoClient(
	    new MongoClientURI(
	        "mongodb://localhost:27017/"
	    )
	);
	MongoDatabase database = mongoClient.getDatabase("school");
	MongoCollection collection = database.getCollection("subjects");
    
	 
	Document doc2=new Document();
	Document doc1 = new Document();
	doc1.append("name", "ram").append("age", 10);
	collection.insertOne(doc1);
	
	collection.updateOne(Filters.eq("name", "ram"), Updates.set("name", "govind"));      
	/*
	 * List<Document> list = new ArrayList<Document>(); list.add(doc1);
	 * list.add(doc2);
	 */
	
	FindIterable<Document> iterDoc = collection.find();
	int i = 1;
	// Getting the iterator
	Iterator it = iterDoc.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
		i++;
	}
	
	collection.deleteOne(Filters.eq("name", "govind"));
	
	System.out.println("after deleted");

	int j = 1;
	// Getting the iterator
	Iterator itt = iterDoc.iterator();
	while (itt.hasNext()) {
		System.out.println(itt.next());
		j++;
	}
	System.out.println("completed!!!");
		
	System.out.println("connection successful!!");
	}
catch(Exception e)
{
System.out.println(e.getMessage());

}
finally
{
System.out.println("connection closed!!");	
}
}
}
