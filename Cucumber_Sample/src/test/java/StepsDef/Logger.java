package StepsDef;
import java.util.logging.LogManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logger {
	
	WebDriver driver=null;
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	 System.out.println("Enter into the website");
		System.setProperty("webdriver.chromedriver","C:\\soft\\chromedriver.exe");
		 driver = new ChromeDriver();
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	  System.out.println("enter into the login page");
	  driver.navigate().to("https://www.amazon.in/");
	}

	@When("I complete action")
	public void i_complete_action() {
	   System.out.println("enter the username");
	   driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	   WebElement text= driver.findElement(By.id("ap_email"));
		  text.sendKeys("9486406794");
		  driver.findElement(By.className("a-button-input")).click();
		  driver.findElement(By.name("password")).sendKeys("Vavi@vavu93pubg");
		  driver.findElement(By.id("signInSubmit")).click();
	}

	@When("some other action")
	public void some_other_action() {
	    System.out.println("enter the password");
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		  driver.findElement(By.id("nav-search-submit-button")).click();
	}

	@When("yet another action")
	public void yet_another_action() {
	System.out.println("ente the captcha");
	 driver.findElement(By.linkText("Apple iPhone 12 (64GB) - Blue")).click();
	  driver.findElement(By.id("buy-now-button")).isEnabled(); 
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    System.out.println("enter into account");
	    Actions action =new Actions(driver);
		  action.moveToElement(driver.findElement(By.linkText("Get started free"))).click(); java.util.List<WebElement> links =
		  driver.findElements(By.tagName("a"));
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	   System.out.println("check the balance");
	   
	}


}
