package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
	driver.manage().window().maximize();
	Thread.sleep(500);
		
	 WebElement Doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));	
		
		Actions act= new Actions(driver);
		
//act.moveToElement(Doubleclick).perform();
//act.doubleClick().perform();
	
		act.doubleClick(Doubleclick).perform();
	
	}

}
