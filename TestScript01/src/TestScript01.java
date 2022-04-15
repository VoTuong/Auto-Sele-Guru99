/*
 * Set of test script for testing Website Guru99 Bank
 * The test scripts is developed using Selenium Framework
 *
 */
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestScript01 {

	public static void main(String[] args) throws Exception {	  

    	//Setup Chrome driver    	
    	WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

    	String baseUrl = "http://www.demo.guru99.com/V4/";
    	
    	// launch Firefox and direct it to the Base URL
    	driver.get(baseUrl);

	    // Enter username
	    driver.findElement(By.name("uid")).sendKeys("mngr1336");

	    // Enter Password
	    driver.findElement(By.name("password")).sendKeys("dAnavUq");
   
	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();


	    }
}
