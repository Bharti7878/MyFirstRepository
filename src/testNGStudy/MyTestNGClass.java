package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTestNGClass {
  @Test
  public void facebookTest() {
  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
  WebDriver driver =new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.facebook.com/");
 
  }
  @Test
  public void GoogleTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.co.in/"); 
  }
  
  
  
  
  }

