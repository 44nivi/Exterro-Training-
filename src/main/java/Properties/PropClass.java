package Properties;
import java.io.InputStream;
import java.util.Properties;

public class PropClass {


public static void main(String[] args) {
// TODO Auto-generated method stub
try(InputStream instrm = PropClass.class.getClassLoader().getResourceAsStream("config.properties"))
{
Properties prop =new Properties();
if(instrm == null) {
System.out.println("no such file");
return;
}
prop.load(instrm);
System.out.println(prop.getProperty("DBUrl"));

}
catch(Exception e) {
System.out.println(e.getMessage());
}

}

}

	


