/*
 * This regular expression is used to fix the input format 
 * 
 */

package local_utility_regex_ananonymous;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

public static void main(String[] args) {
	
String str = "[a-zA-Z0-9]+[a-zA-Z0-9._]*[a-zA-Z0-9]*+@[a-zA-Z0-9]*[.]([in])";
Scanner ss = new Scanner(System.in);

System.out.println("enter the email!!!");
String uname = ss.next();

//use patten class to compile the string condition with it
Pattern pp = Pattern.compile(str);

//use Matcher class to combine pp object to first field 
Matcher mm = pp.matcher(uname);
if(mm.find()) {

System.out.println("valid user!!!");
}
else
System.out.println("invalid user!!!!");


}
}
