package snippet;

class Funtional_Overriding {

	 void show()
	    {
	        System.out.println("Parent's show()");
	    }
	 
}


class Child extends Funtional_Overriding {

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("child class()");
	}

		
}


public class Sample {

	public static void main(String[] args) {
		
	Funtional_Overriding obj= new Funtional_Overriding();
	obj.show();
	Funtional_Overriding obj2=new Child();
	obj2.show();
	
}

}
