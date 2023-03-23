package sweet.sour;
import java.util.*;
public class stk_impl {

	int siz; int top;
	char[] a;
	boolean isEmpty() {return(top < 0);}
	stk_impl(int n)
	{
	top = -1;
	siz = n;
	a = new char[siz];
	}
	boolean push(char x)
	{
	if (top >= siz) {
	System.out.println("Stack Overflow");
	return false;
	}
	else {
	a[++top] = x;
	return true;
	}}
	char pop()
	{
	if (top < 0) {
	System.out.println("Stack Underflow");
	return 0;
	}
	else {
	char x = a[top--];
	return x;
	}}}
	
	class Main 
	{
	public static void reverse(StringBuffer str)
	{
	int n = str.length();
	stk_impl obj = new stk_impl(n);
	int i;
	for (i = 0; i < n; i++)
	obj.push(str.charAt(i));
	for (i = 0; i < n; i++) {
	char c = obj.pop();
	str.setCharAt(i, c);
	}} 
	public static void main(String args[])
	{
	StringBuffer rev = new StringBuffer("Hello, World");
	reverse(rev);
	System.out.println("Reverse string for Hello World is \n\n"+ rev);
	}
	}



