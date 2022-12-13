package neoStoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxUtility.UtilityNew;

public class BaseNew {

	
  protected WebDriver driver;
	
	public void launchBrowser() throws IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get(UtilityNew.readDataFromPropertyFile("url"));
	    driver.manage().window().maximize();
	    Reporter.log("launchingBrowser",true);
	    UtilityNew.wait(driver,1000);
	    }
	
	
	
	
	
	public static void closingBrowser(WebDriver driver) throws InterruptedException
	{
		Reporter.log("closing Browser",true);
		
		Thread.sleep(500);
		driver.close();
	}

}