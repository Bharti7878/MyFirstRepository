package verificationUsingTestNG;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyTC {
  @Test
  public void verifyCheckBox()
  {
  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//driver.manage().window().maximize();
  
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
  
		// if(checkBox1.isSelected())
		// {
		// Reporter.log("CheckBox is selected TC is PASSED",true);
		// }
		//
		// else {
		// Reporter.log("CheckBox is not selected TC is FAILED",true);
		//
		// 
		
		checkBox1.click();
		
	Assert.assertTrue("CheckBox is not selected TC is failed", checkBox1.isSelected());
  }
}
