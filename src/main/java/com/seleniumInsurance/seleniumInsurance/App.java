package com.seleniumInsurance.seleniumInsurance;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
        //System.setProperty("webdriver.chrome.driver","/Users/sunil/Documents/softwares/chrome-driver/chromedriver");
  	  
  	  WebDriverManager.chromedriver().setup();
  	  
  	  
  	  ChromeOptions chromeOptions = new ChromeOptions(); 
  	  chromeOptions.addArguments("--headless");
    	WebDriver driver = new ChromeDriver(chromeOptions);
	  
	  System.out.println("Scripted Executing");	  
	  //1. Open the browser and get to the url
	  //driver.get("http://localhost:8081/contact.html");	
	  //Configured test server url
	  driver.get("http://18.119.164.204:8083//contact.html");	
	  //enable wait of 3 seconds 
	  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);	  
	  driver.findElement(By.id("inputName")).sendKeys("SeleniumTestServer");
	  System.out.println("Scripted inputName successfully");	  
      driver.findElement(By.id("inputNumber")).sendKeys("6842586791");
      System.out.println("Scripted inputNumber successfully");
      driver.findElement(By.id("inputMail")).sendKeys("SunilontestServer@selenium.com");
      System.out.println("Scripted inputMail successfully");
      driver.findElement(By.id("inputMessage")).sendKeys("Updaing my insure me contact details");
      System.out.println("Scripted inputMessage successfully");
      
      driver.findElement(By.id("my-button")).click();   
      System.out.println("Scripted my-button clicked successfully");
      
      //Thread.sleep(1000);
      System.out.println("Scripted executed finally successfully"); 
      //String msg=driver.findElement(By.id("response"));
      
      //Thread.sleep(1000);
    }
}
