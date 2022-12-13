package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEx {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();

		Thread.sleep(500);
		
		
		WebElement mainpage = driver.findElement(By.xpath("//div[text()='Nested Frames']"));
		System.out.println(mainpage.getText());
		
		driver.switchTo().frame("frame1");
		
String ParentFrame = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
	
	System.out.println(ParentFrame);
	
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
	
	Thread.sleep(500);
	String childtext = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
	
	
	System.out.println(childtext);
	
	driver.switchTo().defaultContent();
	System.out.println(mainpage.getText());
	
	
	}

}
