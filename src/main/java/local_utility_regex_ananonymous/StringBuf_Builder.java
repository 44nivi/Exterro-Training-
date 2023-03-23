package local_utility_regex_ananonymous;
import java.util.Scanner;
public class StringBuf_Builder {
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	String a ="Apple";


	System.out.println(a.toUpperCase());
	
	//Thread safe,String buffer is like string but can be modified ,Contents of the string can be 
	//changed using certain methods
	StringBuffer ssb = new StringBuffer(100);

	ssb.append("Apple");
	ssb.append("tree");
	System.out.println(ssb);

	ssb.reverse();


	System.out.println(ssb);

	//Thread is not safe in builder,it is non synchronized ,
	// it can add the items at the end or inbetween using insert or append function 
	StringBuilder sb = new StringBuilder();
	sb.append("Mango");
	sb.append("tree");

	System.out.println(sb);


	//int == // a=20,b=90; if(a==b)
	//a = "apple" b = "Apple";
	//equals()
	String s = "apple";
	if(s.equalsIgnoreCase("Apple")) {
	System.out.println("eql");
	}

	else
	System.out.println("not eql");

}
}
