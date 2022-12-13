package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickContext {

		public static void main(String[] args) throws InterruptedException  {

			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			
		driver.manage().window().maximize();
		Thread.sleep(500);
		//1
			WebElement RightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
			//2
              Actions act=new Actions(driver);
//3
             // act.contextClick(RightClickButton).perform();
             
              
              act.moveToElement(RightClickButton).contextClick().build().perform();
              
         
              
              
	}

}
