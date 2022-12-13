package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractisOfSendkeys {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("email")).sendKeys("abc");
		
		driver.findElement(By.id("pass")).sendKeys("123");
	
	driver.findElement(By.id("loginbutton")).click();
	
	
	
	
	}

}
