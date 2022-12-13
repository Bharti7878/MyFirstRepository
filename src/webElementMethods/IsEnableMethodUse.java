package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethodUse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hotstar.com/in");
		//driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[text()='LOGIN']")).click();
		Thread.sleep(1000);
	
	WebElement account = driver.findElement(By.className("email-or-fb-signin"));
	
	
	Thread.sleep(500);
	
	boolean result1 = account.isEnabled();
	System.out.println(" status is "+ result1);
	
	driver.findElement(By.id("phoneNo")).sendKeys("7972023421");
	
	Thread.sleep(500);
	
	driver.findElement(By.className("submit-button")).click();
	
	Thread.sleep(500);
	
	WebElement getotp = driver.findElement(By.className("submit-button grey-btn"));
	              

    Thread.sleep(500);

	boolean result2 = getotp.isEnabled();

	               
	System.out.println("get otp status is "+ result2);
	
    getotp.click();

	    Thread.sleep(500);


	}
	}