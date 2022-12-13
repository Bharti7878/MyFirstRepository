package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownEg2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		
		Thread.sleep(500);	
	 driver.switchTo().frame("frame1");
		
		 WebElement myelement = driver.findElement(By.id("sampleHeading"));
		
		System.out.println(myelement.getText());
		
		driver.switchTo().defaultContent();//switching selenium focus frame to main page
	
	WebElement mainPageElement = driver.findElement(By.xpath("//div[text()='Frames']"));
	System.out.println(mainPageElement.getText());
	
	
	}

}
