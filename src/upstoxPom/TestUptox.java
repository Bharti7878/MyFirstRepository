package upstoxPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUptox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
				
			    WebDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://login-v2.upstox.com/");
				Thread.sleep(1000);
				//create an object of POM class
		
				UpstoxLoginPage login = new UpstoxLoginPage(driver);
		
				login.enterUserID();
				login.enterPassword();
				login.clickOnSignInButton();

				
	}

}
