package sweet.sour;
import java.util.Scanner;

public class stack {

	    static String s="Hello World";
	    public static void main (String []args){
	        String [] s1=new String[s.length()];//stack array
	        int top =-1;//stack index initialize with -1
	        for (int i=0;i<=s.length()-1;i++){
	            top++;  // increment the top value and store the element in 0th position
	            s1[top] =String.valueOf(s.charAt(i));// iterate the string and store the value stack
	           // System.out.println(s.charAt(i));
	        }
	        for(int i=top;i>=0;i--){
	            System.out.print(s1[top]);//print the stack value
	            top--;
	        }
	     
	    }
	}


