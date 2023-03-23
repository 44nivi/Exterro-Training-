package com.exterro.NEW_OLD.Sample_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Sample_selenium {

    public static void main(String args[])
    { try {
        System.setProperty("webdriver.chromedriver","C:\\soft\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();
  
        // Maximize the browser
        driver.manage().window().maximize();
  
        // Launch Website
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		  //logger.info("clicked login button");
		  
		  WebElement text= driver.findElement(By.id("ap_email"));
		  text.sendKeys("9486406794"); //logger.info("Type emailid or phonenumber");
		  driver.findElement(By.className("a-button-input")).click();
		  driver.findElement(By.name("password")).sendKeys("Vavi@vavu93pubg");
		  driver.findElement(By.id("signInSubmit")).click();
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		  driver.findElement(By.id("nav-search-submit-button")).click();
		  driver.findElement(By.linkText("Apple iPhone 12 (64GB) - Blue")).click();
		  driver.findElement(By.id("buy-now-button")).isEnabled(); 
		  Actions action =new Actions(driver);
		  action.moveToElement(driver.findElement(By.linkText("Get started free"))).click(); java.util.List<WebElement> links =
		  driver.findElements(By.tagName("a"));
		  System.out.println("Number of Links in the Page is " + links.size());
		  
		  for (int i = 1; i<=links.size(); i = i+1) {
		  System.out.println("Name of Link# " + i + links.get(i).getText()); }
		  
		  
		driver.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	
    }}


