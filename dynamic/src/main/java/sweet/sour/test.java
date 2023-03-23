package sweet.sour;
import java.util.*;                                                            //importing package

public class test {
		
		   public static String reversestr(String str) {	   //Create a method to execute the program
		      char[] reverse = new char[str.length()];
		      Stack<Character> stack = new Stack<Character>();
		
		      for (int i = 0; i < str.length(); i++) {
		         stack.push(str.charAt(i));                       //pushing elements to stack
		      }

		      int i = 0;
		      while (!stack.isEmpty()) {		           //check whether the stack is empty
		         reverse[i++] = stack.pop();
		      }
		      return new String(reverse);
		   }
		   public static void main(String[] args) {
		     String str = "Hello, World";
		      System.out.println("The string given is " +str);   //print the given string
		      System.out.println("\nThe reversed string is: " + reversestr(str));   // print the reversed string.
		   }
		}



