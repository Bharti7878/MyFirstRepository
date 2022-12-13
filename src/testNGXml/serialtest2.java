package testNGXml;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class serialtest2 {
  @Test
  public void FacebookLaunch() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	  driver.manage().window().maximize();
	  Reporter.log("facebooklaunch",true);
	  Thread.sleep(2000);
	  
	 driver.close();
  
  }
}
