package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(500);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(500);
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(500);
		
           driver.findElement(By.xpath("//button[@type='submit']")).click();
           Thread.sleep(500);
          driver.findElement(By.xpath("//a[text()='Add Employee']")) .click();
           
          Thread.sleep(500);

           driver.findElement(By.name("firstName")).sendKeys("Bharti");
           Thread.sleep(500);

 
          // driver.findElement(By.name("middleName")).sendKeys("chetan");
	   	
	//Thread.sleep(500);
	
	driver.findElement(By.xpath("//span[text()='Admin']")).click();	
	
	Thread.sleep(500);
	driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("chetan");
	Thread.sleep(500);
	
	
	driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[1]")).click();
	Thread.sleep(500);
	Actions a=new Actions(driver);
	
	
	a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
	
	Thread.sleep(500);
	
	driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Ruhan");
	Thread.sleep(500);

	driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[2]")).click();
	Thread.sleep(500);
	a.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(500);

	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
	Thread.sleep(500);

	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
	Thread.sleep(500);

	
	}

}
