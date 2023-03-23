package snippet;

class Vehicle {
	  protected String brand = "Ford";        // Vehicle attribute
	  public void horn() {                    // Vehicle method
	    System.out.println("Tuut, tuut!");
	  }
	public void Enginesound() {
	
	}
	}


class Lorry extends Vehicle{
	  private String modelName = "Benz";   
	  public void Enginesound() {
System.out.println("ger,ger");
}}

public class Car extends Vehicle{
	  private String modelName = "Mustang";    // Car attribute

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.horn();
		Vehicle obj2=new Lorry();
		obj2.Enginesound();
		obj2.horn();
	}

}
