package popUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {

		

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/alerts");
			Thread.sleep(200);
			driver.findElement(By.id("alertButton")).click();// after clicking on this button we will get Alert
			 
			//1. To handle alert popup we need to switch selenium focus from main page to alert popup by using syntax
			//Alert alt = driver.switchTo().alert();
		
			
			Alert alt = driver.switchTo().alert();//swtiching selenium focus from main page to alert popup
		
			// 2. Alert is an interface which contains abstract methods like:
			// 1. accept(): use to click on ok button.
			// 2. dismiss(): use to click on cancel button.
			// 3. getText(): use to get text present in a alert popup.
			//System.out.println( "Alert Text is --> "+alt.getText());
			
			//to click ok button of Alert use accept method
	              alt.accept();
		
		Thread.sleep(500);
		
		 String mytext = driver.findElement(By.xpath("//div[text()='Alerts']")).getText();
		
		
		System.out.println(mytext);
		
		
		
		
		
		
	}

}
