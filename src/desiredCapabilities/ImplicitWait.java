package desiredCapabilities;

import java.time.Duration; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");

		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//Thread.sleep(35000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(35000));		
		
		
	}

}
