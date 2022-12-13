package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActionExm2 {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://text-compare.com/");	
		
		Thread.sleep(500);
		Actions act= new Actions(driver);
		
		driver.findElement(By.id("inputText1"));
		Thread.sleep(500);

		driver.findElement(By.id("inputText1")).sendKeys("Bharti");
		
		Thread.sleep(400);
		//driver.findElement(By.id("switchButton")).click();
	
	driver.findElement(By.id("inputText2")).sendKeys("bharati");
	Thread.sleep(400);
	driver.findElement(By.xpath("//div[text()='Compare!']")).click();
	Thread.sleep(400);
	}

}
