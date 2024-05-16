package com.exterro.SampleDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        
        try {
    		
			 System.out.println("hits!!!!");
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            System.out.println("hits!!!!");
	            Connection c1 = DriverManager.getConnection("jdbc:sqlserver://LT-3MJSQF2;DatabaseName=nivi;encrypt=true;trustServerCertificate=true;", "sa","exterro-123456");
	            // String str = "insert into Employee
	            // values('"+emp.getFName()+"','"+emp.getLName()+"',"+emp.getAge()+")";
	            String str = "insert into Persons values('Ram','raj',22)";
	            Statement smt = c1.createStatement();
	            smt.executeUpdate(str);
	            System.out.println("Done!!!!");
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
