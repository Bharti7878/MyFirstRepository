package scrolling;

import java.awt.Dimension;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserSize {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			
			driver.get("https://vctcpune.com/");
			System.out.println(driver.manage().window().getSize());
			
			//To set size--> use Dimension class and create object of Dimension class
			
		Dimension d = new Dimension(1000,10);
			
		    driver.manage().window().getSize();
			System.out.println(driver.manage().window().getSize());		
		
			
	}

}
