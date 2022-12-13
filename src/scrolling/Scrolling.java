package scrolling;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\Java\\Automation\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com");
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		JavascriptExecutor j= ((JavascriptExecutor)driver);		
		
		// +ve x value--> right hand side, Y value +ve --> down 
				// +ve x value--> right hand side, Y value -ve --> up 
				// -ve x value--> left hand side, Y value +ve --> down 
				// -ve x value--> left hand side, Y value -ve --> up 
		j.executeScript("window.scrollBy(80,900)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(80,2000)");
		
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(80,500)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(80,-2000)");
		
		
	}

	public static void scrollIntoView(WebDriver driver, WebElement userNameField) {
		// TODO Auto-generated method stub
		
	}

		
	}


