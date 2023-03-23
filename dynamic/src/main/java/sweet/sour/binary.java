package sweet.sour;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class binary {

		static void method_1(int v) {
			for(int i=1;i<=v;i++) {
	//declare the empty string
			String str="";
			int j=i;
			while(j>0) {
	//while adding string with integer it will concatenate perform	
			str+= j%2;
			j=j/2;
			}
			System.out.print(str+" ");
			}
		}
		static void method_2(int n) {
			Queue<String>Queue = new LinkedList<String>();
			Queue.add("1");
			while (n-- > 0) {
				String str1 = Queue.peek();
				Queue.remove();
				System.out.print(str1+" ");
				String str2 = str1;
				Queue.add(str1 + "0");
				Queue.add(str2 + "1");
			}
		}
		public static void main(String[] args) {
			try (Scanner scan = new Scanner(System.in)) {
				System.out.print("Enter the Number to Generate binary value from 1 to N : ");
				int n = scan.nextInt();
				System.out.println("Binary code Generate without using Queue");
				method_1(n);
				System.out.println("\nBinary code Generate using Queue");
				method_2(n);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}



