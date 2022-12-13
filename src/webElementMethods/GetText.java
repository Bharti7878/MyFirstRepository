package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
				driver.manage().window().maximize();

				driver.get("https://paytm.com/");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//a[contains(text(),'Paytm')]")).getText();
	
	WebElement text = driver.findElement(By.xpath("//a[contains(text(),'Paytm')]"));
	
	String actualResult = text.getText();
	
	String expectedresult = "Paytm for Consumer";
	
	if(actualResult.equals(expectedresult))
	{
		System.out.println("Result is Matching, TC is passed");	
		
	}
	else {
		System.out.println("Result is not Matching, TC is failed");

	}
	
	
	}
	}
	
	


