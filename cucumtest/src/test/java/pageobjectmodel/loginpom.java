package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpom {
	By txt_username=By.id("");
	By txt_password=By.id("");
	By btn_login=By.id("");
WebDriver driver=null;	

public loginpom(WebDriver driver2) {
	this.driver=driver2;
}
public void entered_name(String username)
{driver.findElement(txt_username).sendKeys(username);
}
public void enterd_password(String password)
{
driver.findElement(txt_password).sendKeys(password);
}

}
