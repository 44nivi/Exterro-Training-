package cucumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class logindemo {
WebDriver driver=null;

@Given("user enter on login page")
public void user_enter_on_login_page() {
String projectPath=System.getProperty("user.dir");
System.setProperty("webdriver.gecko.driver", projectPath+"src/test/resources/driver/geckodriver.exe");
driver.navigate().to("https://www.amazon.in/");
driver.manage().window().maximize();
driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
System.out.println("user is on login");
	}

	@When("user types password1")
	public void  user_types_password1() {
		WebElement text= driver.findElement(By.id("ap_email"));
	      text.sendKeys("9486406794");
	      driver.findElement(By.className("a-button-input")).click();
	      driver.findElement(By.name("password")).sendKeys("Vavi@vavu93pubg");
		System.out.println("user enter userid and password ");
	}

	@When("enter on  login button1")
	public void enter_on_login_button1() {
	      driver.findElement(By.id("signInSubmit")).click();
		System.out.println("user click on login button");
	}

	@Then("user is navigated to the homepage1")
	public void user_is_navigated_to_the_homepage1() {
	      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		System.out.println("user is navigated to the homepage");
	}

}
