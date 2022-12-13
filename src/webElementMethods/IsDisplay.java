package webElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplay {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
		
	WebElement hidebutton = driver.findElement(By.id("hide-textbox"));
		WebElement showbutton = driver.findElement(By.id("show-textbox"));
		
		hidebutton.click();
		//showbutton.click();
	
		if (textBox.isDisplayed()) {
			textBox.sendKeys("gm");
		}
		
		else {
			
			showbutton.click();
			textBox.sendKeys("ge");
	
		
		}
		
		
	}
}
