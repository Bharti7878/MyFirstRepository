package actionClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);	
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		 WebElement target = driver.findElement(By.className("placeholder"));
		
		Actions act=new Actions(driver);
		
		//act.clickAndHold(source).moveToElement(target).release().build().perform();
	
	    act.dragAndDrop(source, target).perform();
	     Thread.sleep(500);
	 
	     
	
	
	
	
	}

}
