package iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\Desktop\\\\Java\\\\Automation\\\\Selenium\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(1000);
		
		WebElement mainPageElement = 
				driver.findElement(By.xpath("//div[text()='Nested Frames']"));
		
		
		System.out.println(mainPageElement.getText());
	
	
		driver.switchTo().frame("frame1");//switching focus from main page to parent frame
		
		
	String parenttext = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
	
	
	System.out.println("Parent text is "+parenttext);
	
	
	Thread.sleep(3000);
	
	//driver.switchTo().frame(9);
	
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
	Thread.sleep(3000);
	
	String childText = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
	System.out.println(childText);
	
	driver.switchTo().defaultContent();//switching from child to main page
	System.out.println(mainPageElement.getText());
	
	
	}

}
