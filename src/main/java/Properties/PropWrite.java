package Properties;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropWrite {

public static void main(String[] args) {
// TODO Auto-generated method stub
try(OutputStream otstrm = new FileOutputStream("C:\\Users\\nraman\\eclipse-workspace\\Niveproject\\src\\main\\resource\\Config.properties"))
{
Properties prop = new Properties();
prop.setProperty("DBUrl", "localhost");
prop.setProperty("uname", "");
prop.setProperty("pass", "");
prop.setProperty("dbname", "Nivi");

prop.store(otstrm, null);

System.out.println("prop stored is :"+prop);




}
catch(Exception e) {
System.out.println(e.getMessage());
}


}

}