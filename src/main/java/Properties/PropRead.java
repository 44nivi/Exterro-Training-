package Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropRead {

public static void main(String[] args) {
// TODO Auto-generated method stub
try(InputStream instrm = new FileInputStream("C:\\\\Users\\\\nraman\\\\eclipse-workspace\\\\Niveproject\\\\src\\\\main\\\\resource\\\\Config.properties"))
{
Properties prop=new Properties();
prop.load(instrm);

System.out.println(prop.getProperty("dbname"));




}
catch(Exception e) {
System.out.println(e.getMessage());
}


}

}
