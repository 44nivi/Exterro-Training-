package snippet;


abstract class sunstar {
	sunstar(String name){
		
	}
	abstract void hi(int b);
    abstract void printInfo() ;
    public int add() {
    	int a=2;
    	return a;
    	
    }
} 

class sanjay extends sunstar{

	private int a;

	sanjay(String name,int a,int b) {
		super(name);
		// TODO Auto-generated constructor stub
		this.a=a;
	}

	@Override
	void hi(int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Abstr extends sunstar {
	int a;
	Abstr(String name,int a) {
		super(name);
		this.a=a;
		
	}

	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}

	@Override
	void hi(int k) {
		// TODO Auto-generated method stub
		System.out.println("bye");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstr obj=new Abstr("nivi",7);
		sanjay obj3= new sanjay("sudar is late",8,9);
		int var=obj.add();
		System.out.println(var);
		obj.printInfo();
		obj.hi(5);

	}

	
}
