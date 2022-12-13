package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
   
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Thread.sleep(500);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(500);

		Actions act =new Actions(driver);
		
		//act.moveToElement(firstname).sendKeys("chetan").build().perform();
		Thread.sleep(1000);
	    
		act.moveToElement(firstname).keyUp(Keys.SHIFT).sendKeys("c").keyDown(Keys.SHIFT).sendKeys("hetan").build().perform();

		
		
		
		
		
		
		
		
		
		
	}

}
