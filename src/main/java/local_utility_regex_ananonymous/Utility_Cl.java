/*
 * class invoked without creating the object
 * a private constructor must be created for showing the exception in case they create an object
 * functions invoked using the class name .function name and the arguments passed
 */

package local_utility_regex_ananonymous;

public class Utility_Cl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SampleUseUtility.add(100);
		SampleUseUtility.sub(20);
		
	}
}

class SampleUseUtility {

private final static int Intre =10;
private  SampleUseUtility() {
throw new java.lang.UnsupportedOperationException("Please dont create an Object");
}

public static void add(int a) {

System.out.println(a*Intre);

}
public static void sub(int a) {
System.out.println(a-Intre);
}
}



