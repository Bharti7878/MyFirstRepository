package selenium312;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodUse {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");	
		
	WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://paytm.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();

		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		
		
	}

}
