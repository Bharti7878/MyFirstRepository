package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login.php");	
		
		Thread.sleep(500);
		Actions act= new Actions(driver);
		
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		 WebElement firstname = driver.findElement(By.name("firstname"));
		
		firstname.click();
		Thread.sleep(500);
		
     //act.moveToElement(firstname).sendKeys("pillu").build().perform();
	
     act.moveToElement(firstname).keyUp(Keys.SHIFT).sendKeys("C").keyDown(Keys.SHIFT).sendKeys("hetan").build().perform();
      
      
      
      WebElement day = driver.findElement(By.id("day"));
	
	act.click(day).perform();
	
	/*act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(500);
	act.sendKeys(Keys.ARROW_UP).perform();*/
	
	for(int i=0;i<3;i++) {
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
	
	Thread.sleep(500);
	}
	
	}

}
