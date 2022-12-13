package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Divsion_Popup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(500);
	
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(500);
		driver.findElement(By.name("q")).sendKeys("iphone 14");
		
		Thread.sleep(200);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
	}

}

				
				
				
				
				
				
		

