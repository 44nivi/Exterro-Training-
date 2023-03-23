package snippet;

import java.util.Scanner;

public class Sample_Java  {
	
	public Sample_Java(int a ,int b) {
		int k=a-b;
		System.out.println();
	}
	
	public  float sub(float f,int h) {
		System.out.println(f);
		System.out.println(h);
		float c=f+h;
		return c;
	}

	public static void main(String[] args) {
		
		Sample_Java obj1=new Sample_Java(56, 78);
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the first value");
		int a=obj.nextInt();
		System.out.println("enter the second value");
		float b=obj.nextFloat();
		
		float d=obj1.sub(b,a);
		System.out.println(d);
	}
	
	

}


class model {
	public void add() {
		System.out.println("hi");
	}
}
