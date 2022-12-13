package webElementMethods;

import java.rmi.server.UID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysStudy {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.get("https://en-gb.facebook.com/");
		
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bharti.mendhe2@gmail.com");		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");*/
		
		
		WebElement UID = driver.findElement(By.xpath("//input[@id='email']"));//creating object
		WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
		
		
		UID.sendKeys("bharti.mendhe@rediffmail.com");//by using reference variable
		
		Thread.sleep(3000);
		pwd.sendKeys("chetan123");
		
		//driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();

		
		driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]")).click();
		
		
		
		
		
		
		
		
		
	}

}
