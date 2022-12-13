import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import utility.Utility;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://neostox.com/sign-in");
		driver.manage().window().maximize();
		Reporter.log("Launching browser",true);
		Utility.wait(driver, 1000);
	}

}
