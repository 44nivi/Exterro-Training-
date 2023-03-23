package Design_pattern;
/**  this is the program for a sample abstract factory pattern
 *  
 */


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MobilePattern {
	private static final Logger log = LogManager.getLogger("MobilePattern.class");
		
	    public static void main(String[] args) {
	    	BasicConfigurator.configure();
	    	log.info("The program begins successfully");
	        MobileProducer mobileProducer=new MobileProducer();  //create object for mobile producer
	        MobileFactory mobileFactory=mobileProducer.getMobile("applemobile");  //calling getmMbile function to create Mobilefactory object for extends class 
	        Mobile apple=mobileFactory.getMobile("y2");  //call to getMobile from the Mobilefactory object to class inherited by interface
	        
	        System.out.println(apple.toString());
	        
	        MobileProducer mobileProducer1=new MobileProducer();
	        MobileFactory mobileFactory1=mobileProducer.getMobile("androidmobile");
	        Mobile android=mobileFactory1.getMobile("y2");
	        System.out.println(android.toString());
	        
	    
	    }

	}

	interface Mobile //create  mobile interface to implement different type of mobile to mobile interface object
	{
	    
	}


	class AndroidMobile implements Mobile
	{
	    String type;
	    AndroidMobile(String type) 
	    {
	        this.type=type;
	    }
	    @Override
	    public String toString() {
	        return "AndroidMobile [type=" + type + "]";
	    }
	    
	}

	class AppleMobile implements Mobile
	{
	    String type;
	    AppleMobile(String type) 
	    {
	        this.type=type;
	    }
	    @Override
	    public String toString() {
	        return "AppleMobile [type=" + type + "]";
	    }    
	    
	    
	}




	abstract class MobileFactory
	{
	    abstract Mobile getMobile(String type);
	    
	}

	class AbstractAndriod extends MobileFactory
	{

	    @Override
	    Mobile getMobile(String type) 
	    {
	        Mobile mobile=new AndroidMobile(type);
	        return mobile;
	            
	    }
	    
	}



	class AbstractApple extends MobileFactory
	{

	    @Override
	    Mobile getMobile(String type) 
	    {
	        Mobile mobile=new AppleMobile(type);
	        return mobile;    
	    }
	}
	 
	 
	class MobileProducer
	{
	    MobileFactory getMobile(String type)
	    {
	        MobileFactory mobileFactory=null;
	    
	        if("applemobile".equalsIgnoreCase(type))
	            mobileFactory= new AbstractApple();
	        else if("androidmobile".equalsIgnoreCase(type))
	            mobileFactory= new AbstractAndriod();
	    
	    return mobileFactory;
	    }
	    
	}



