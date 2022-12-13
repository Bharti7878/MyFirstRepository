package findElementsUse;

import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NoOfImgOnWebPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		
		
		driver.findElement(By.xpath("//input[@type='text']"));
		Actions act =new Actions(driver);
		act.sendKeys("iphone14").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(500);

		driver.findElement(By.xpath("//a[text()='Images'][1]")).click();
		Thread.sleep(500);
		
		
		 List<WebElement> image = driver.findElements(By.tagName("img"));
	
		 System.out.println("iphone images in webpage "+image.size());
		
		 
		 
		
	}

}
