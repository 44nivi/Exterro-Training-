package sweet.sour;
import java.util.Scanner;

	
	// Create a Linked List node
	class Node
	{
		String data;
		Node next;
		Node(String d)
		{
			data = d;
			next = null;
		}
	}
	class palindrome
	{
	//Creating a constructor
		Node head;
		boolean isPalidromeCheck(String str)
		{
		//store the string length in a variable
			int length = str.length();
			for (int i = 0; i < length / 2; i++)
				if (str.charAt(i) !=
					str.charAt(length - i - 1))
					return false;
			return true;
		}
		//creating a palindrome method
		boolean isPalindrome()
		{
			Node node = head;
			//creating an empty string
			String str = "";
			while (node != null)
			{
				str = str.concat(node.data);
				node = node.next;
			}
			return isPalidromeCheck(str);
		}
		//main method
		public static void main(String[] args)
		{
			palindrome list = new palindrome();
			list.head = new Node("m");
			list.head.next = new Node("ad");
			list.head.next.next = new Node("a");
			list.head.next.next.next =new Node("m");
			System.out.println(list.isPalindrome());
		}
	}


