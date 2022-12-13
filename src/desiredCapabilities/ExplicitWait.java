package desiredCapabilities;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");

		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/")	;		

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
		
		//explicit wait 1-->parameter-->time, 2-->parameter-->condition
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(4000));
		
		WebElement signInButton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		
		w.until(ExpectedConditions.visibilityOf(signInButton));
		signInButton.click();
	
	
	}

}
