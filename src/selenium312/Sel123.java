package selenium312;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.youtube.com/");
	}

}
 