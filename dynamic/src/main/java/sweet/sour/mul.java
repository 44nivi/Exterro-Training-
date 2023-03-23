package sweet.sour;

public class mul {

	    public static void main(String []args){
	        int a=3;
	        int b=4;
	        if(b>a){
	            int c=a;//swap greater value to a because to reduce recurion call
	            a=b;
	            b=c;
	        }
	        int c=mul(a,b,0);//method call passing a and b
	        System.out.println(c);
	    }
	    static int mul(int a,int b,int i){
	        if(i>=b-1){// method add a value upto b times by using recursion method
	            return a;
	        }
	        return a+mul(a,b,i+1);
	    }
	}

